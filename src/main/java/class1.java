import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!qk")
public abstract class class1 extends class85 {

    @OriginalMember(owner = "client!qk", name = "E", descriptor = "Lrp;")
    public class680 field31;

    @OriginalMember(owner = "client!qk", name = "F", descriptor = "I")
    public int field32;

    @OriginalMember(owner = "client!qk", name = "j", descriptor = "I")
    public int field10;

    @OriginalMember(owner = "client!qk", name = "b", descriptor = "I")
    public static int field2 = 0;

    @OriginalMember(owner = "client!qk", name = "c", descriptor = "I")
    public static int field3 = 0;

    @OriginalMember(owner = "client!qk", name = "g", descriptor = "I")
    public static int field7 = 0;

    @OriginalMember(owner = "client!qk", name = "n", descriptor = "I")
    private static int field14 = 0;

    @OriginalMember(owner = "client!qk", name = "m", descriptor = "I")
    public static int field13 = 0;

    @OriginalMember(owner = "client!qk", name = "D", descriptor = "I")
    private static int field30 = 0;

    @OriginalMember(owner = "client!qk", name = "a", descriptor = "I")
    public static int field1 = 0;

    @OriginalMember(owner = "client!qk", name = "G", descriptor = "I")
    public static int field33 = 0;

    @OriginalMember(owner = "client!qk", name = "k", descriptor = "I")
    public int field11;

    @OriginalMember(owner = "client!qk", name = "l", descriptor = "I")
    public static int field12;

    @OriginalMember(owner = "client!qk", name = "o", descriptor = "I")
    private static int field15;

    @OriginalMember(owner = "client!qk", name = "p", descriptor = "I")
    public static int field16;

    @OriginalMember(owner = "client!qk", name = "q", descriptor = "I")
    private static int field17;

    @OriginalMember(owner = "client!qk", name = "r", descriptor = "I")
    private static int field18;

    @OriginalMember(owner = "client!qk", name = "s", descriptor = "I")
    public static int field19;

    @OriginalMember(owner = "client!qk", name = "t", descriptor = "I")
    public int field20;

    @OriginalMember(owner = "client!qk", name = "u", descriptor = "I")
    public static int field21;

    @OriginalMember(owner = "client!qk", name = "v", descriptor = "I")
    public int field22;

    @OriginalMember(owner = "client!qk", name = "w", descriptor = "I")
    public static int field23;

    @OriginalMember(owner = "client!qk", name = "x", descriptor = "I")
    public static int field24;

    @OriginalMember(owner = "client!qk", name = "z", descriptor = "I")
    public int field26;

    @OriginalMember(owner = "client!qk", name = "A", descriptor = "I")
    public static int field27;

    @OriginalMember(owner = "client!qk", name = "B", descriptor = "I")
    public static int field28;

    @OriginalMember(owner = "client!qk", name = "C", descriptor = "I")
    public static int field29;

    @OriginalMember(owner = "client!qk", name = "d", descriptor = "I")
    public static int field4;

    @OriginalMember(owner = "client!qk", name = "e", descriptor = "I")
    public static int field5;

    @OriginalMember(owner = "client!qk", name = "f", descriptor = "I")
    public static int field6;

    @OriginalMember(owner = "client!qk", name = "h", descriptor = "I")
    public static int field8;

    @OriginalMember(owner = "client!qk", name = "i", descriptor = "I")
    private static int field9;

    @OriginalMember(owner = "client!qk", name = "y", descriptor = "[I")
    private int[] field25;

    @OriginalMember(owner = "client!qk", name = "a", descriptor = "(IIII)V", line = 15)
    public final void method2(int arg0, int arg1, int arg2, int arg3) {
        this.field22 = arg0;
        this.field11 = arg1;
        this.field20 = arg2;
        this.field26 = arg3;
    }

    @OriginalMember(owner = "client!qk", name = "a", descriptor = "([I)V", line = 27)
    public final void method3(int[] arg0) {
        arg0[0] = this.field22;
        arg0[1] = this.field11;
        arg0[2] = this.field20;
        arg0[3] = this.field26;
    }

    @OriginalMember(owner = "client!qk", name = "a", descriptor = "(FFFFFFIIII)V", line = 45)
    public final void method4(float arg0, float arg1, float arg2, float arg3, float arg4, float arg5, int arg6, int arg7, int arg8, int arg9) {
        if (this.field31.method3831()) {
            throw new IllegalStateException();
        } else if (this.method12(arg0, arg1, arg2, arg3, arg4, arg5)) {
            field6 = arg7;
            if (arg6 != 1) {
                field33 = arg7 >>> 24;
                field2 = 256 - field33;
                if (arg6 == 0) {
                    field1 = (arg7 & 0xFF0000) >> 16;
                    field13 = (arg7 & 0xFF00) >> 8;
                    field7 = arg7 & 0xFF;
                } else if (arg6 == 2) {
                    field14 = arg7 >>> 24;
                    field30 = 256 - field14;
                    int var11 = (arg7 & 0xFF00FF) * field30 & 0xFF00FF00;
                    int var12 = (arg7 & 0xFF00) * field30 & 0xFF0000;
                    field3 = (var11 | var12) >>> 8;
                }
            }
            if (arg6 == 1) {
                if (arg8 == 0) {
                    this.method1(1, 0);
                    return;
                }
                if (arg8 == 1) {
                    this.method1(1, 1);
                    return;
                }
                if (arg8 == 2) {
                    this.method1(1, 2);
                    return;
                }
            } else if (arg6 == 0) {
                if (arg8 == 0) {
                    this.method1(0, 0);
                    return;
                }
                if (arg8 == 1) {
                    this.method1(0, 1);
                    return;
                }
                if (arg8 == 2) {
                    this.method1(0, 2);
                    return;
                }
            } else if (arg6 == 3) {
                if (arg8 == 0) {
                    this.method1(3, 0);
                    return;
                }
                if (arg8 == 1) {
                    this.method1(3, 1);
                    return;
                }
                if (arg8 == 2) {
                    this.method1(3, 2);
                    return;
                }
            } else if (arg6 == 2) {
                if (arg8 == 0) {
                    this.method1(2, 0);
                    return;
                }
                if (arg8 == 1) {
                    this.method1(2, 1);
                    return;
                }
                if (arg8 == 2) {
                    this.method1(2, 2);
                }
            }
        }
    }

    @OriginalMember(owner = "client!qk", name = "b", descriptor = "()I", line = 148)
    public final int method5() {
        return this.field10;
    }

    @OriginalMember(owner = "client!qk", name = "a", descriptor = "(FFFFFFILaa;II)V", line = 154)
    public final void method7(float arg0, float arg1, float arg2, float arg3, float arg4, float arg5, int arg6, class88 arg7, int arg8, int arg9) {
        if (this.field31.method3831()) {
            throw new IllegalStateException();
        } else if (this.method12(arg0, arg1, arg2, arg3, arg4, arg5)) {
            class301 var11 = (class301) arg7;
            this.method13(var11.field4328, var11.field4331, field17 - arg8, -arg9 - (field5 - field9));
        }
    }

    @OriginalMember(owner = "client!qk", name = "a", descriptor = "(IIIIIII)V", line = 166)
    public final void method8(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        if (this.field31.method3831()) {
            throw new IllegalStateException();
        }
        if (this.field25 == null) {
            this.field25 = new int[4];
        }
        this.field31.method422(this.field25);
        this.field31.method518(this.field31.field9637, this.field31.field9628, arg0 + arg2, arg1 + arg3);
        int var8 = this.method11();
        int var9 = this.method14();
        int var10 = (arg2 + var8 - 1) / var8;
        int var11 = (arg3 + var9 - 1) / var9;
        for (int var12 = 0; var12 < var11; var12++) {
            int var13 = var9 * var12;
            for (int var14 = 0; var14 < var10; var14++) {
                this.method6(var8 * var14 + arg0, arg1 + var13, arg4, arg5, arg6);
            }
        }
        this.field31.method488(this.field25[0], this.field25[1], this.field25[2], this.field25[3]);
    }

    @OriginalMember(owner = "client!qk", name = "c", descriptor = "()I", line = 215)
    public final int method11() {
        return this.field32 + this.field22 + this.field20;
    }

    @OriginalMember(owner = "client!qk", name = "a", descriptor = "(FFFFFF)Z", line = 219)
    private final boolean method12(float arg0, float arg1, float arg2, float arg3, float arg4, float arg5) {
        int var7 = this.field32 + this.field22 + this.field20;
        int var8 = this.field11 + this.field10 + this.field26;
        if (this.field32 != var7 || this.field10 != var8) {
            float var9 = (arg2 - arg0) / (float) var7;
            float var10 = (arg3 - arg1) / (float) var7;
            float var11 = (arg4 - arg0) / (float) var8;
            float var12 = (arg5 - arg1) / (float) var8;
            float var13 = (float) this.field11 * var11;
            float var14 = (float) this.field11 * var12;
            float var15 = (float) this.field22 * var9;
            float var16 = (float) this.field22 * var10;
            float var17 = (float) this.field20 * -var9;
            float var18 = (float) this.field20 * -var10;
            float var19 = (float) this.field26 * -var11;
            float var20 = (float) this.field26 * -var12;
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
        if (var23 < (float) this.field31.field9637) {
            var23 = this.field31.field9637;
        }
        if (var24 > (float) this.field31.field9647) {
            var24 = this.field31.field9647;
        }
        if (var25 < (float) this.field31.field9628) {
            var25 = this.field31.field9628;
        }
        if (var26 > (float) this.field31.field9622) {
            var26 = this.field31.field9622;
        }
        float var27 = var23 - var24;
        if (var27 >= 0.0F) {
            return false;
        }
        float var28 = var25 - var26;
        if (var28 >= 0.0F) {
            return false;
        }
        field19 = this.field31.field9635;
        field29 = (int) ((float) ((int) var25 * field19) + var23);
        float var29 = (arg2 - arg0) * (arg5 - arg1) - (arg4 - arg0) * (arg3 - arg1);
        float var30 = (arg4 - arg0) * (arg3 - arg1) - (arg2 - arg0) * (arg5 - arg1);
        field16 = (int) ((arg5 - arg1) * 4096.0F * (float) this.field32 / var29);
        field24 = (int) ((arg3 - arg1) * 4096.0F * (float) this.field10 / var30);
        field12 = (int) ((arg4 - arg0) * 4096.0F * (float) this.field32 / var30);
        field4 = (int) ((arg2 - arg0) * 4096.0F * (float) this.field10 / var29);
        field18 = (int) (var23 * 16.0F + 8.0F - (arg0 + arg2 + arg4 + var21) / 4.0F * 16.0F);
        field15 = (int) (var25 * 16.0F + 8.0F - (arg1 + arg3 + arg5 + var22) / 4.0F * 16.0F);
        field8 = (this.field32 >> 1 << 12) + (field15 * field12 >> 4);
        field27 = (this.field10 >> 1 << 12) + (field4 * field15 >> 4);
        field23 = field18 * field16 >> 4;
        field28 = field24 * field18 >> 4;
        field17 = (int) var23;
        field21 = (int) var27;
        field9 = (int) var25;
        field5 = (int) var28;
        return true;
    }

    @OriginalMember(owner = "client!qk", name = "d", descriptor = "()I", line = 356)
    public final int method14() {
        return this.field11 + this.field10 + this.field26;
    }

    @OriginalMember(owner = "client!qk", name = "a", descriptor = "()I", line = 365)
    public final int method16() {
        return this.field32;
    }

    @OriginalMember(owner = "client!qk", name = "<init>", descriptor = "(Lrp;II)V", line = 371)
    public class1(class680 arg0, int arg1, int arg2) {
        this.field31 = arg0;
        this.field32 = arg1;
        this.field10 = arg2;
    }

    @OriginalMember(owner = "client!qk", name = "b", descriptor = "(II)V")
    public abstract void method1(int arg0, int arg1);

    @OriginalMember(owner = "client!qk", name = "a", descriptor = "(IIIII)V")
    public abstract void method6(int arg0, int arg1, int arg2, int arg3, int arg4);

    @OriginalMember(owner = "client!qk", name = "a", descriptor = "(IILaa;II)V")
    public abstract void method9(int arg0, int arg1, class88 arg2, int arg3, int arg4);

    @OriginalMember(owner = "client!qk", name = "a", descriptor = "(IIIIIIII)V")
    public abstract void method10(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7);

    @OriginalMember(owner = "client!qk", name = "a", descriptor = "([I[III)V")
    public abstract void method13(int[] arg0, int[] arg1, int arg2, int arg3);

    @OriginalMember(owner = "client!qk", name = "a", descriptor = "(IIIIIIIII)V")
    public abstract void method15(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8);
}
