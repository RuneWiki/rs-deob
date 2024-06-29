import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!kf")
public abstract class class167 extends class16 {

    @OriginalMember(owner = "client!kf", name = "b", descriptor = "Lji;")
    public class435 field2123;

    @OriginalMember(owner = "client!kf", name = "c", descriptor = "I")
    public int field2124;

    @OriginalMember(owner = "client!kf", name = "w", descriptor = "I")
    public int field2144;

    @OriginalMember(owner = "client!kf", name = "j", descriptor = "I")
    public static int field2131 = 0;

    @OriginalMember(owner = "client!kf", name = "g", descriptor = "I")
    public static int field2128 = 0;

    @OriginalMember(owner = "client!kf", name = "k", descriptor = "I")
    public static int field2132 = 0;

    @OriginalMember(owner = "client!kf", name = "u", descriptor = "I")
    private static int field2142 = 0;

    @OriginalMember(owner = "client!kf", name = "l", descriptor = "I")
    private static int field2133 = 0;

    @OriginalMember(owner = "client!kf", name = "m", descriptor = "I")
    public static int field2134 = 0;

    @OriginalMember(owner = "client!kf", name = "A", descriptor = "I")
    public static int field2148 = 0;

    @OriginalMember(owner = "client!kf", name = "B", descriptor = "I")
    public static int field2149 = 0;

    @OriginalMember(owner = "client!kf", name = "a", descriptor = "I")
    public static int field2122;

    @OriginalMember(owner = "client!kf", name = "d", descriptor = "I")
    public int field2125;

    @OriginalMember(owner = "client!kf", name = "e", descriptor = "I")
    public static int field2126;

    @OriginalMember(owner = "client!kf", name = "f", descriptor = "I")
    public static int field2127;

    @OriginalMember(owner = "client!kf", name = "h", descriptor = "I")
    public int field2129;

    @OriginalMember(owner = "client!kf", name = "i", descriptor = "I")
    public static int field2130;

    @OriginalMember(owner = "client!kf", name = "n", descriptor = "I")
    public static int field2135;

    @OriginalMember(owner = "client!kf", name = "o", descriptor = "I")
    private static int field2136;

    @OriginalMember(owner = "client!kf", name = "p", descriptor = "I")
    private static int field2137;

    @OriginalMember(owner = "client!kf", name = "q", descriptor = "I")
    private static int field2138;

    @OriginalMember(owner = "client!kf", name = "r", descriptor = "I")
    public static int field2139;

    @OriginalMember(owner = "client!kf", name = "s", descriptor = "I")
    public static int field2140;

    @OriginalMember(owner = "client!kf", name = "v", descriptor = "I")
    public static int field2143;

    @OriginalMember(owner = "client!kf", name = "x", descriptor = "I")
    public static int field2145;

    @OriginalMember(owner = "client!kf", name = "y", descriptor = "I")
    private static int field2146;

    @OriginalMember(owner = "client!kf", name = "z", descriptor = "I")
    public static int field2147;

    @OriginalMember(owner = "client!kf", name = "C", descriptor = "I")
    public int field2150;

    @OriginalMember(owner = "client!kf", name = "D", descriptor = "I")
    public static int field2151;

    @OriginalMember(owner = "client!kf", name = "E", descriptor = "I")
    public int field2152;

    @OriginalMember(owner = "client!kf", name = "F", descriptor = "I")
    public static int field2153;

    @OriginalMember(owner = "client!kf", name = "G", descriptor = "I")
    public static int field2154;

    @OriginalMember(owner = "client!kf", name = "t", descriptor = "[I")
    private int[] field2141;

    @OriginalMember(owner = "client!kf", name = "b", descriptor = "(II)V")
    public abstract void method1077(int arg0, int arg1);

    @OriginalMember(owner = "client!kf", name = "a", descriptor = "(FFFFFFIII)V")
    public final void method147(float arg0, float arg1, float arg2, float arg3, float arg4, float arg5, int arg6, int arg7, int arg8) {
        if (this.field2123.method2543()) {
            throw new IllegalStateException();
        }
        this.method1079(arg0, arg1, arg2, arg3, arg4, arg5);
        field2130 = arg7;
        if (arg6 != 1) {
            field2131 = arg7 >>> 24;
            field2149 = 256 - field2131;
            if (arg6 == 0) {
                field2132 = (arg7 & 0xFF0000) >> 16;
                field2148 = (arg7 & 0xFF00) >> 8;
                field2134 = arg7 & 0xFF;
            } else if (arg6 == 2) {
                field2142 = arg7 >>> 24;
                field2133 = 256 - field2142;
                int var10 = (arg7 & 0xFF00FF) * field2133 & 0xFF00FF00;
                int var11 = (arg7 & 0xFF00) * field2133 & 0xFF0000;
                field2128 = (var10 | var11) >>> 8;
            }
        }
        if (arg6 == 1) {
            if (arg8 == 0) {
                this.method1077(1, 0);
                return;
            }
            if (arg8 == 1) {
                this.method1077(1, 1);
                return;
            }
            if (arg8 == 2) {
                this.method1077(1, 2);
                return;
            }
        } else if (arg6 == 0) {
            if (arg8 == 0) {
                this.method1077(0, 0);
                return;
            }
            if (arg8 == 1) {
                this.method1077(0, 1);
                return;
            }
            if (arg8 == 2) {
                this.method1077(0, 2);
                return;
            }
        } else if (arg6 == 3) {
            if (arg8 == 0) {
                this.method1077(3, 0);
                return;
            }
            if (arg8 == 1) {
                this.method1077(3, 1);
                return;
            }
            if (arg8 == 2) {
                this.method1077(3, 2);
                return;
            }
        } else if (arg6 == 2) {
            if (arg8 == 0) {
                this.method1077(2, 0);
                return;
            }
            if (arg8 == 1) {
                this.method1077(2, 1);
                return;
            }
            if (arg8 == 2) {
                this.method1077(2, 2);
            }
        }
    }

    @OriginalMember(owner = "client!kf", name = "MA", descriptor = "(IIII)V")
    public final void method133(int arg0, int arg1, int arg2, int arg3) {
        this.field2129 = arg0;
        this.field2150 = arg1;
        this.field2152 = arg2;
        this.field2125 = arg3;
    }

    @OriginalMember(owner = "client!kf", name = "j", descriptor = "()I")
    public final int method148() {
        return this.field2129 + this.field2124 + this.field2152;
    }

    @OriginalMember(owner = "client!kf", name = "la", descriptor = "()I")
    public final int method134() {
        return this.field2124;
    }

    @OriginalMember(owner = "client!kf", name = "a", descriptor = "(IILma;II)V")
    public abstract void method129(int arg0, int arg1, class10 arg2, int arg3, int arg4);

    @OriginalMember(owner = "client!kf", name = "r", descriptor = "(IIIII)V")
    public abstract void method139(int arg0, int arg1, int arg2, int arg3, int arg4);

    @OriginalMember(owner = "client!kf", name = "s", descriptor = "(IIIIIII)V")
    public abstract void method135(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6);

    @OriginalMember(owner = "client!kf", name = "ma", descriptor = "()I")
    public final int method137() {
        return this.field2144;
    }

    @OriginalMember(owner = "client!kf", name = "JA", descriptor = "(IIIIIII)V")
    public final void method143(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        if (this.field2123.method2543()) {
            throw new IllegalStateException();
        }
        if (this.field2141 == null) {
            this.field2141 = new int[4];
        }
        this.field2123.method267(this.field2141);
        this.field2123.method334(this.field2123.field6222, this.field2123.field6210, arg0 + arg2, arg1 + arg3);
        int var8 = this.method148();
        int var9 = this.method131();
        int var10 = (arg2 + var8 - 1) / var8;
        int var11 = (arg3 + var9 - 1) / var9;
        for (int var12 = 0; var12 < var11; var12++) {
            int var13 = var9 * var12;
            for (int var14 = 0; var14 < var10; var14++) {
                this.method139(var8 * var14 + arg0, arg1 + var13, arg4, arg5, arg6);
            }
        }
        this.field2123.method330(this.field2141[0], this.field2141[1], this.field2141[2], this.field2141[3]);
    }

    @OriginalMember(owner = "client!kf", name = "T", descriptor = "()I")
    public final int method131() {
        return this.field2150 + this.field2144 + this.field2125;
    }

    @OriginalMember(owner = "client!kf", name = "a", descriptor = "([I[III)V")
    public abstract void method1078(int[] arg0, int[] arg1, int arg2, int arg3);

    @OriginalMember(owner = "client!kf", name = "<init>", descriptor = "(Lji;II)V")
    public class167(class435 arg0, int arg1, int arg2) {
        this.field2123 = arg0;
        this.field2124 = arg1;
        this.field2144 = arg2;
    }

    @OriginalMember(owner = "client!kf", name = "a", descriptor = "(FFFFFF)V")
    private final void method1079(float arg0, float arg1, float arg2, float arg3, float arg4, float arg5) {
        int var7 = this.field2129 + this.field2124 + this.field2152;
        int var8 = this.field2150 + this.field2144 + this.field2125;
        if (this.field2124 != var7 || this.field2144 != var8) {
            float var9 = (arg2 - arg0) / (float) var7;
            float var10 = (arg3 - arg1) / (float) var7;
            float var11 = (arg4 - arg0) / (float) var8;
            float var12 = (arg5 - arg1) / (float) var8;
            float var13 = (float) this.field2150 * var11;
            float var14 = (float) this.field2150 * var12;
            float var15 = (float) this.field2129 * var9;
            float var16 = (float) this.field2129 * var10;
            float var17 = (float) this.field2152 * -var9;
            float var18 = (float) this.field2152 * -var10;
            float var19 = (float) this.field2125 * -var11;
            float var20 = (float) this.field2125 * -var12;
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
        if (var23 < (float) this.field2123.field6222) {
            var23 = this.field2123.field6222;
        }
        if (var24 > (float) this.field2123.field6211) {
            var24 = this.field2123.field6211;
        }
        if (var25 < (float) this.field2123.field6210) {
            var25 = this.field2123.field6210;
        }
        if (var26 > (float) this.field2123.field6207) {
            var26 = this.field2123.field6207;
        }
        float var27 = var23 - var24;
        if ((var27 >= 0.0F)) {
            return;
        }
        float var28 = var25 - var26;
        if ((var28 >= 0.0F)) {
            return;
        }
        field2153 = this.field2123.field6206;
        field2147 = (int) ((float) ((int) var25 * field2153) + var23);
        float var29 = (arg2 - arg0) * (arg5 - arg1) - (arg4 - arg0) * (arg3 - arg1);
        float var30 = (arg4 - arg0) * (arg3 - arg1) - (arg2 - arg0) * (arg5 - arg1);
        field2122 = (int) ((arg5 - arg1) * 4096.0F * (float) this.field2124 / var29);
        field2139 = (int) ((arg3 - arg1) * 4096.0F * (float) this.field2144 / var30);
        field2154 = (int) ((arg4 - arg0) * 4096.0F * (float) this.field2124 / var30);
        field2145 = (int) ((arg2 - arg0) * 4096.0F * (float) this.field2144 / var29);
        field2146 = (int) (var23 * 16.0F + 8.0F - (arg0 + arg2 + arg4 + var21) / 4.0F * 16.0F);
        field2136 = (int) (var25 * 16.0F + 8.0F - (arg1 + arg3 + arg5 + var22) / 4.0F * 16.0F);
        field2127 = (this.field2124 >> 1 << 12) + (field2154 * field2136 >> 4);
        field2126 = (this.field2144 >> 1 << 12) + (field2145 * field2136 >> 4);
        field2140 = field2146 * field2122 >> 4;
        field2151 = field2146 * field2139 >> 4;
        field2138 = (int) var23;
        field2143 = (int) var27;
        field2137 = (int) var25;
        field2135 = (int) var28;
    }

    @OriginalMember(owner = "client!kf", name = "b", descriptor = "(FFFFFFLma;II)V")
    public final void method136(float arg0, float arg1, float arg2, float arg3, float arg4, float arg5, class10 arg6, int arg7, int arg8) {
        if (this.field2123.method2543()) {
            throw new IllegalStateException();
        }
        this.method1079(arg0, arg1, arg2, arg3, arg4, arg5);
        class377 var10 = (class377) arg6;
        this.method1078(var10.field4956, var10.field4954, field2138 - arg7, -arg8 - (field2135 - field2137));
    }
}
