import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ss")
public abstract class class431 extends class88 {

    @OriginalMember(owner = "client!ss", name = "G", descriptor = "Lrea;")
    public class205 field6173;

    @OriginalMember(owner = "client!ss", name = "n", descriptor = "I")
    public int field6154;

    @OriginalMember(owner = "client!ss", name = "f", descriptor = "I")
    public int field6146;

    @OriginalMember(owner = "client!ss", name = "a", descriptor = "I")
    public static int field6141 = 0;

    @OriginalMember(owner = "client!ss", name = "i", descriptor = "I")
    private static int field6149 = 0;

    @OriginalMember(owner = "client!ss", name = "t", descriptor = "I")
    public static int field6160 = 0;

    @OriginalMember(owner = "client!ss", name = "r", descriptor = "I")
    public static int field6158 = 0;

    @OriginalMember(owner = "client!ss", name = "q", descriptor = "I")
    public static int field6157 = 0;

    @OriginalMember(owner = "client!ss", name = "w", descriptor = "I")
    private static int field6163 = 0;

    @OriginalMember(owner = "client!ss", name = "y", descriptor = "I")
    public static int field6165 = 0;

    @OriginalMember(owner = "client!ss", name = "E", descriptor = "I")
    public static int field6171 = 0;

    @OriginalMember(owner = "client!ss", name = "b", descriptor = "I")
    public int field6142;

    @OriginalMember(owner = "client!ss", name = "c", descriptor = "I")
    private static int field6143;

    @OriginalMember(owner = "client!ss", name = "d", descriptor = "I")
    private static int field6144;

    @OriginalMember(owner = "client!ss", name = "e", descriptor = "I")
    public static int field6145;

    @OriginalMember(owner = "client!ss", name = "g", descriptor = "I")
    public static int field6147;

    @OriginalMember(owner = "client!ss", name = "h", descriptor = "I")
    public static int field6148;

    @OriginalMember(owner = "client!ss", name = "j", descriptor = "I")
    public static int field6150;

    @OriginalMember(owner = "client!ss", name = "k", descriptor = "I")
    public static int field6151;

    @OriginalMember(owner = "client!ss", name = "l", descriptor = "I")
    public static int field6152;

    @OriginalMember(owner = "client!ss", name = "o", descriptor = "I")
    private static int field6155;

    @OriginalMember(owner = "client!ss", name = "p", descriptor = "I")
    public int field6156;

    @OriginalMember(owner = "client!ss", name = "s", descriptor = "I")
    public static int field6159;

    @OriginalMember(owner = "client!ss", name = "u", descriptor = "I")
    public static int field6161;

    @OriginalMember(owner = "client!ss", name = "v", descriptor = "I")
    public static int field6162;

    @OriginalMember(owner = "client!ss", name = "x", descriptor = "I")
    public int field6164;

    @OriginalMember(owner = "client!ss", name = "z", descriptor = "I")
    public int field6166;

    @OriginalMember(owner = "client!ss", name = "A", descriptor = "I")
    public static int field6167;

    @OriginalMember(owner = "client!ss", name = "B", descriptor = "I")
    private static int field6168;

    @OriginalMember(owner = "client!ss", name = "C", descriptor = "I")
    public static int field6169;

    @OriginalMember(owner = "client!ss", name = "D", descriptor = "I")
    public static int field6170;

    @OriginalMember(owner = "client!ss", name = "F", descriptor = "I")
    public static int field6172;

    @OriginalMember(owner = "client!ss", name = "m", descriptor = "[I")
    private int[] field6153;

    @OriginalMember(owner = "client!ss", name = "d", descriptor = "()I")
    public final int method670() {
        return this.field6166 + this.field6146 + this.field6142;
    }

    @OriginalMember(owner = "client!ss", name = "b", descriptor = "(IIIIIII)V")
    public final void method673(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        if (this.field6173.method1250()) {
            throw new IllegalStateException();
        }
        if (this.field6153 == null) {
            this.field6153 = new int[4];
        }
        this.field6173.method398(this.field6153);
        this.field6173.method394(this.field6173.field2682, this.field6173.field2673, arg0 + arg2, arg1 + arg3);
        int var8 = this.method656();
        int var9 = this.method670();
        int var10 = (arg2 + var8 - 1) / var8;
        int var11 = (arg3 + var9 - 1) / var9;
        for (int var12 = 0; var12 < var11; var12++) {
            int var13 = var9 * var12;
            for (int var14 = 0; var14 < var10; var14++) {
                this.method672(var8 * var14 + arg0, arg1 + var13, arg4, arg5, arg6);
            }
        }
        this.field6173.method469(this.field6153[0], this.field6153[1], this.field6153[2], this.field6153[3]);
    }

    @OriginalMember(owner = "client!ss", name = "a", descriptor = "(IIIIIIIII)V")
    public abstract void method688(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8);

    @OriginalMember(owner = "client!ss", name = "a", descriptor = "(IIIII)V")
    public abstract void method672(int arg0, int arg1, int arg2, int arg3, int arg4);

    @OriginalMember(owner = "client!ss", name = "a", descriptor = "(FFFFFFIIII)V")
    public final void method665(float arg0, float arg1, float arg2, float arg3, float arg4, float arg5, int arg6, int arg7, int arg8, int arg9) {
        if (this.field6173.method1250()) {
            throw new IllegalStateException();
        } else if (this.method2632(arg0, arg1, arg2, arg3, arg4, arg5)) {
            field6145 = arg7;
            if (arg6 != 1) {
                field6171 = arg7 >>> 24;
                field6141 = 256 - field6171;
                if (arg6 == 0) {
                    field6157 = (arg7 & 0xFF0000) >> 16;
                    field6165 = (arg7 & 0xFF00) >> 8;
                    field6160 = arg7 & 0xFF;
                } else if (arg6 == 2) {
                    field6163 = arg7 >>> 24;
                    field6149 = 256 - field6163;
                    int var11 = (arg7 & 0xFF00FF) * field6149 & 0xFF00FF00;
                    int var12 = (arg7 & 0xFF00) * field6149 & 0xFF0000;
                    field6158 = (var11 | var12) >>> 8;
                }
            }
            if (arg6 == 1) {
                if (arg8 == 0) {
                    this.method690(1, 0);
                    return;
                }
                if (arg8 == 1) {
                    this.method690(1, 1);
                    return;
                }
                if (arg8 == 2) {
                    this.method690(1, 2);
                    return;
                }
            } else if (arg6 == 0) {
                if (arg8 == 0) {
                    this.method690(0, 0);
                    return;
                }
                if (arg8 == 1) {
                    this.method690(0, 1);
                    return;
                }
                if (arg8 == 2) {
                    this.method690(0, 2);
                    return;
                }
            } else if (arg6 == 3) {
                if (arg8 == 0) {
                    this.method690(3, 0);
                    return;
                }
                if (arg8 == 1) {
                    this.method690(3, 1);
                    return;
                }
                if (arg8 == 2) {
                    this.method690(3, 2);
                    return;
                }
            } else if (arg6 == 2) {
                if (arg8 == 0) {
                    this.method690(2, 0);
                    return;
                }
                if (arg8 == 1) {
                    this.method690(2, 1);
                    return;
                }
                if (arg8 == 2) {
                    this.method690(2, 2);
                }
            }
        }
    }

    @OriginalMember(owner = "client!ss", name = "b", descriptor = "()I")
    public final int method657() {
        return this.field6154;
    }

    @OriginalMember(owner = "client!ss", name = "a", descriptor = "()I")
    public final int method656() {
        return this.field6164 + this.field6154 + this.field6156;
    }

    @OriginalMember(owner = "client!ss", name = "b", descriptor = "(II)V")
    public abstract void method690(int arg0, int arg1);

    @OriginalMember(owner = "client!ss", name = "a", descriptor = "(FFFFFFILaa;II)V")
    public final void method676(float arg0, float arg1, float arg2, float arg3, float arg4, float arg5, int arg6, class486 arg7, int arg8, int arg9) {
        if (this.field6173.method1250()) {
            throw new IllegalStateException();
        } else if (this.method2632(arg0, arg1, arg2, arg3, arg4, arg5)) {
            class495 var11 = (class495) arg7;
            this.method689(var11.field7126, var11.field7128, field6155 - arg8, -arg9 - (field6167 - field6143));
        }
    }

    @OriginalMember(owner = "client!ss", name = "a", descriptor = "(IIII)V")
    public final void method655(int arg0, int arg1, int arg2, int arg3) {
        this.field6164 = arg0;
        this.field6166 = arg1;
        this.field6156 = arg2;
        this.field6142 = arg3;
    }

    @OriginalMember(owner = "client!ss", name = "c", descriptor = "()I")
    public final int method663() {
        return this.field6146;
    }

    @OriginalMember(owner = "client!ss", name = "a", descriptor = "(IILaa;II)V")
    public abstract void method660(int arg0, int arg1, class486 arg2, int arg3, int arg4);

    @OriginalMember(owner = "client!ss", name = "a", descriptor = "(FFFFFF)Z")
    private final boolean method2632(float arg0, float arg1, float arg2, float arg3, float arg4, float arg5) {
        int var7 = this.field6164 + this.field6154 + this.field6156;
        int var8 = this.field6166 + this.field6146 + this.field6142;
        if (this.field6154 != var7 || this.field6146 != var8) {
            float var9 = (arg2 - arg0) / (float) var7;
            float var10 = (arg3 - arg1) / (float) var7;
            float var11 = (arg4 - arg0) / (float) var8;
            float var12 = (arg5 - arg1) / (float) var8;
            float var13 = (float) this.field6166 * var11;
            float var14 = (float) this.field6166 * var12;
            float var15 = (float) this.field6164 * var9;
            float var16 = (float) this.field6164 * var10;
            float var17 = (float) this.field6156 * -var9;
            float var18 = (float) this.field6156 * -var10;
            float var19 = (float) this.field6142 * -var11;
            float var20 = (float) this.field6142 * -var12;
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
        if (var23 < (float) this.field6173.field2682) {
            var23 = this.field6173.field2682;
        }
        if (var24 > (float) this.field6173.field2674) {
            var24 = this.field6173.field2674;
        }
        if (var25 < (float) this.field6173.field2673) {
            var25 = this.field6173.field2673;
        }
        if (var26 > (float) this.field6173.field2689) {
            var26 = this.field6173.field2689;
        }
        float var27 = var23 - var24;
        if (var27 >= 0.0F) {
            return false;
        }
        float var28 = var25 - var26;
        if (var28 >= 0.0F) {
            return false;
        }
        field6159 = this.field6173.field2702;
        field6170 = (int) ((float) ((int) var25 * field6159) + var23);
        float var29 = (arg2 - arg0) * (arg5 - arg1) - (arg4 - arg0) * (arg3 - arg1);
        float var30 = (arg4 - arg0) * (arg3 - arg1) - (arg2 - arg0) * (arg5 - arg1);
        field6151 = (int) ((arg5 - arg1) * 4096.0F * (float) this.field6154 / var29);
        field6150 = (int) ((arg3 - arg1) * 4096.0F * (float) this.field6146 / var30);
        field6147 = (int) ((arg4 - arg0) * 4096.0F * (float) this.field6154 / var30);
        field6148 = (int) ((arg2 - arg0) * 4096.0F * (float) this.field6146 / var29);
        field6168 = (int) (var23 * 16.0F + 8.0F - (arg0 + arg2 + arg4 + var21) / 4.0F * 16.0F);
        field6144 = (int) (var25 * 16.0F + 8.0F - (arg1 + arg3 + arg5 + var22) / 4.0F * 16.0F);
        field6152 = (this.field6154 >> 1 << 12) + (field6147 * field6144 >> 4);
        field6169 = (this.field6146 >> 1 << 12) + (field6148 * field6144 >> 4);
        field6161 = field6168 * field6151 >> 4;
        field6172 = field6168 * field6150 >> 4;
        field6155 = (int) var23;
        field6162 = (int) var27;
        field6143 = (int) var25;
        field6167 = (int) var28;
        return true;
    }

    @OriginalMember(owner = "client!ss", name = "a", descriptor = "([I[III)V")
    public abstract void method689(int[] arg0, int[] arg1, int arg2, int arg3);

    @OriginalMember(owner = "client!ss", name = "a", descriptor = "(IIIIIIII)V")
    public abstract void method674(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7);

    @OriginalMember(owner = "client!ss", name = "<init>", descriptor = "(Lrea;II)V")
    public class431(class205 arg0, int arg1, int arg2) {
        this.field6173 = arg0;
        this.field6154 = arg1;
        this.field6146 = arg2;
    }
}
