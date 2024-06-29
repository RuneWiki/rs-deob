import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!pb")
public abstract class class2 extends class257 {

    @OriginalMember(owner = "client!pb", name = "C", descriptor = "Lve;")
    public class578 field33;

    @OriginalMember(owner = "client!pb", name = "d", descriptor = "I")
    public int field8;

    @OriginalMember(owner = "client!pb", name = "v", descriptor = "I")
    public int field26;

    @OriginalMember(owner = "client!pb", name = "i", descriptor = "I")
    private static int field13 = 0;

    @OriginalMember(owner = "client!pb", name = "j", descriptor = "I")
    public static int field14 = 0;

    @OriginalMember(owner = "client!pb", name = "t", descriptor = "I")
    public static int field24 = 0;

    @OriginalMember(owner = "client!pb", name = "u", descriptor = "I")
    public static int field25 = 0;

    @OriginalMember(owner = "client!pb", name = "m", descriptor = "I")
    public static int field17 = 0;

    @OriginalMember(owner = "client!pb", name = "k", descriptor = "I")
    public static int field15 = 0;

    @OriginalMember(owner = "client!pb", name = "r", descriptor = "I")
    public static int field22 = 0;

    @OriginalMember(owner = "client!pb", name = "y", descriptor = "I")
    private static int field29 = 0;

    @OriginalMember(owner = "client!pb", name = "f", descriptor = "I")
    public int field10;

    @OriginalMember(owner = "client!pb", name = "g", descriptor = "I")
    public static int field11;

    @OriginalMember(owner = "client!pb", name = "h", descriptor = "I")
    public static int field12;

    @OriginalMember(owner = "client!pb", name = "n", descriptor = "I")
    public static int field18;

    @OriginalMember(owner = "client!pb", name = "o", descriptor = "I")
    public int field19;

    @OriginalMember(owner = "client!pb", name = "p", descriptor = "I")
    public int field20;

    @OriginalMember(owner = "client!pb", name = "q", descriptor = "I")
    public static int field21;

    @OriginalMember(owner = "client!pb", name = "s", descriptor = "I")
    public static int field23;

    @OriginalMember(owner = "client!pb", name = "w", descriptor = "I")
    public static int field27;

    @OriginalMember(owner = "client!pb", name = "x", descriptor = "I")
    private static int field28;

    @OriginalMember(owner = "client!pb", name = "z", descriptor = "I")
    public static int field30;

    @OriginalMember(owner = "client!pb", name = "A", descriptor = "I")
    public static int field31;

    @OriginalMember(owner = "client!pb", name = "B", descriptor = "I")
    private static int field32;

    @OriginalMember(owner = "client!pb", name = "D", descriptor = "I")
    private static int field34;

    @OriginalMember(owner = "client!pb", name = "E", descriptor = "I")
    public static int field35;

    @OriginalMember(owner = "client!pb", name = "F", descriptor = "I")
    public static int field36;

    @OriginalMember(owner = "client!pb", name = "H", descriptor = "I")
    public static int field37;

    @OriginalMember(owner = "client!pb", name = "a", descriptor = "I")
    public int field5;

    @OriginalMember(owner = "client!pb", name = "b", descriptor = "I")
    public static int field6;

    @OriginalMember(owner = "client!pb", name = "c", descriptor = "I")
    public static int field7;

    @OriginalMember(owner = "client!pb", name = "e", descriptor = "I")
    private static int field9;

    @OriginalMember(owner = "client!pb", name = "l", descriptor = "[I")
    private int[] field16;

    @OriginalMember(owner = "client!pb", name = "qa", descriptor = "(FFFFFFIIII)V", line = 15)
    public final void method5(float arg0, float arg1, float arg2, float arg3, float arg4, float arg5, int arg6, int arg7, int arg8, int arg9) {
        if (this.field33.method3350()) {
            throw new IllegalStateException();
        } else if (this.method14(arg0, arg1, arg2, arg3, arg4, arg5)) {
            field11 = arg7;
            if (arg6 != 1) {
                field14 = arg7 >>> 24;
                field24 = 256 - field14;
                if (arg6 == 0) {
                    field22 = (arg7 & 0xFF0000) >> 16;
                    field15 = (arg7 & 0xFF00) >> 8;
                    field17 = arg7 & 0xFF;
                } else if (arg6 == 2) {
                    field13 = arg7 >>> 24;
                    field29 = 256 - field13;
                    int var11 = (arg7 & 0xFF00FF) * field29 & 0xFF00FF00;
                    int var12 = (arg7 & 0xFF00) * field29 & 0xFF0000;
                    field25 = (var11 | var12) >>> 8;
                }
            }
            if (arg6 == 1) {
                if (arg8 == 0) {
                    this.method13(1, 0);
                    return;
                }
                if (arg8 == 1) {
                    this.method13(1, 1);
                    return;
                }
                if (arg8 == 2) {
                    this.method13(1, 2);
                    return;
                }
            } else if (arg6 == 0) {
                if (arg8 == 0) {
                    this.method13(0, 0);
                    return;
                }
                if (arg8 == 1) {
                    this.method13(0, 1);
                    return;
                }
                if (arg8 == 2) {
                    this.method13(0, 2);
                    return;
                }
            } else if (arg6 == 3) {
                if (arg8 == 0) {
                    this.method13(3, 0);
                    return;
                }
                if (arg8 == 1) {
                    this.method13(3, 1);
                    return;
                }
                if (arg8 == 2) {
                    this.method13(3, 2);
                    return;
                }
            } else if (arg6 == 2) {
                if (arg8 == 0) {
                    this.method13(2, 0);
                    return;
                }
                if (arg8 == 1) {
                    this.method13(2, 1);
                    return;
                }
                if (arg8 == 2) {
                    this.method13(2, 2);
                }
            }
        }
    }

    @OriginalMember(owner = "client!pb", name = "Q", descriptor = "(IIII)V", line = 114)
    public final void method7(int arg0, int arg1, int arg2, int arg3) {
        this.field20 = arg0;
        this.field19 = arg1;
        this.field10 = arg2;
        this.field5 = arg3;
    }

    @OriginalMember(owner = "client!pb", name = "ca", descriptor = "()I", line = 128)
    public final int method9() {
        return this.field26 + this.field19 + this.field5;
    }

    @OriginalMember(owner = "client!pb", name = "A", descriptor = "()I", line = 143)
    public final int method11() {
        return this.field8 + this.field20 + this.field10;
    }

    @OriginalMember(owner = "client!pb", name = "E", descriptor = "()I", line = 146)
    public final int method12() {
        return this.field8;
    }

    @OriginalMember(owner = "client!pb", name = "a", descriptor = "(FFFFFF)Z", line = 162)
    private final boolean method14(float arg0, float arg1, float arg2, float arg3, float arg4, float arg5) {
        int var7 = this.field8 + this.field20 + this.field10;
        int var8 = this.field26 + this.field19 + this.field5;
        if (this.field8 != var7 || this.field26 != var8) {
            float var9 = (arg2 - arg0) / (float) var7;
            float var10 = (arg3 - arg1) / (float) var7;
            float var11 = (arg4 - arg0) / (float) var8;
            float var12 = (arg5 - arg1) / (float) var8;
            float var13 = (float) this.field19 * var11;
            float var14 = (float) this.field19 * var12;
            float var15 = (float) this.field20 * var9;
            float var16 = (float) this.field20 * var10;
            float var17 = (float) this.field10 * -var9;
            float var18 = (float) this.field10 * -var10;
            float var19 = (float) this.field5 * -var11;
            float var20 = (float) this.field5 * -var12;
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
        if (var23 < (float) this.field33.field8489) {
            var23 = this.field33.field8489;
        }
        if (var24 > (float) this.field33.field8474) {
            var24 = this.field33.field8474;
        }
        if (var25 < (float) this.field33.field8467) {
            var25 = this.field33.field8467;
        }
        if (var26 > (float) this.field33.field8495) {
            var26 = this.field33.field8495;
        }
        float var27 = var23 - var24;
        if (var27 >= 0.0F) {
            return false;
        }
        float var28 = var25 - var26;
        if (var28 >= 0.0F) {
            return false;
        }
        field37 = this.field33.field8485;
        field7 = (int) ((float) ((int) var25 * field37) + var23);
        float var29 = (arg2 - arg0) * (arg5 - arg1) - (arg4 - arg0) * (arg3 - arg1);
        float var30 = (arg4 - arg0) * (arg3 - arg1) - (arg2 - arg0) * (arg5 - arg1);
        field6 = (int) ((arg5 - arg1) * 4096.0F * (float) this.field8 / var29);
        field12 = (int) ((arg3 - arg1) * 4096.0F * (float) this.field26 / var30);
        field31 = (int) ((arg4 - arg0) * 4096.0F * (float) this.field8 / var30);
        field27 = (int) ((arg2 - arg0) * 4096.0F * (float) this.field26 / var29);
        field28 = (int) (var23 * 16.0F + 8.0F - (arg0 + arg2 + arg4 + var21) / 4.0F * 16.0F);
        field9 = (int) (var25 * 16.0F + 8.0F - (arg1 + arg3 + arg5 + var22) / 4.0F * 16.0F);
        field30 = (this.field8 >> 1 << 12) + (field9 * field31 >> 4);
        field18 = (this.field26 >> 1 << 12) + (field9 * field27 >> 4);
        field23 = field6 * field28 >> 4;
        field36 = field28 * field12 >> 4;
        field34 = (int) var23;
        field35 = (int) var27;
        field32 = (int) var25;
        field21 = (int) var28;
        return true;
    }

    @OriginalMember(owner = "client!pb", name = "DA", descriptor = "(IIIIIII)V", line = 296)
    public final void method15(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        if (this.field33.method3350()) {
            throw new IllegalStateException();
        }
        if (this.field16 == null) {
            this.field16 = new int[4];
        }
        this.field33.method764(this.field16);
        this.field33.method818(this.field33.field8489, this.field33.field8467, arg0 + arg2, arg1 + arg3);
        int var8 = this.method11();
        int var9 = this.method9();
        int var10 = (arg2 + var8 - 1) / var8;
        int var11 = (arg3 + var9 - 1) / var9;
        for (int var12 = 0; var12 < var11; var12++) {
            int var13 = var9 * var12;
            for (int var14 = 0; var14 < var10; var14++) {
                this.method3(var8 * var14 + arg0, arg1 + var13, arg4, arg5, arg6);
            }
        }
        this.field33.method771(this.field16[0], this.field16[1], this.field16[2], this.field16[3]);
    }

    @OriginalMember(owner = "client!pb", name = "a", descriptor = "(FFFFFFILua;II)V", line = 334)
    public final void method16(float arg0, float arg1, float arg2, float arg3, float arg4, float arg5, int arg6, class591 arg7, int arg8, int arg9) {
        if (this.field33.method3350()) {
            throw new IllegalStateException();
        } else if (this.method14(arg0, arg1, arg2, arg3, arg4, arg5)) {
            class184 var11 = (class184) arg7;
            this.method6(var11.field2917, var11.field2919, field34 - arg8, -arg9 - (field21 - field32));
        }
    }

    @OriginalMember(owner = "client!pb", name = "u", descriptor = "()I", line = 355)
    public final int method17() {
        return this.field26;
    }

    @OriginalMember(owner = "client!pb", name = "<init>", descriptor = "(Lve;II)V", line = 364)
    public class2(class578 arg0, int arg1, int arg2) {
        this.field33 = arg0;
        this.field8 = arg1;
        this.field26 = arg2;
    }

    @OriginalMember(owner = "client!pb", name = "V", descriptor = "(IIIII)V")
    public abstract void method3(int arg0, int arg1, int arg2, int arg3, int arg4);

    @OriginalMember(owner = "client!pb", name = "a", descriptor = "(IILua;II)V")
    public abstract void method4(int arg0, int arg1, class591 arg2, int arg3, int arg4);

    @OriginalMember(owner = "client!pb", name = "a", descriptor = "([I[III)V")
    public abstract void method6(int[] arg0, int[] arg1, int arg2, int arg3);

    @OriginalMember(owner = "client!pb", name = "YA", descriptor = "(IIIIIIII)V")
    public abstract void method8(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7);

    @OriginalMember(owner = "client!pb", name = "a", descriptor = "(IIIIIIIII)V")
    public abstract void method10(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8);

    @OriginalMember(owner = "client!pb", name = "b", descriptor = "(II)V")
    public abstract void method13(int arg0, int arg1);
}
