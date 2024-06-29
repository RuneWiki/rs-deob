import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!bn")
public abstract class class463 extends class256 {

    @OriginalMember(owner = "client!bn", name = "h", descriptor = "Lst;")
    public class626 field6651;

    @OriginalMember(owner = "client!bn", name = "B", descriptor = "I")
    public int field6671;

    @OriginalMember(owner = "client!bn", name = "y", descriptor = "I")
    public int field6668;

    @OriginalMember(owner = "client!bn", name = "b", descriptor = "I")
    public static int field6645 = 0;

    @OriginalMember(owner = "client!bn", name = "p", descriptor = "I")
    public static int field6659 = 0;

    @OriginalMember(owner = "client!bn", name = "e", descriptor = "I")
    public static int field6648 = 0;

    @OriginalMember(owner = "client!bn", name = "v", descriptor = "I")
    private static int field6665 = 0;

    @OriginalMember(owner = "client!bn", name = "w", descriptor = "I")
    public static int field6666 = 0;

    @OriginalMember(owner = "client!bn", name = "m", descriptor = "I")
    public static int field6656 = 0;

    @OriginalMember(owner = "client!bn", name = "x", descriptor = "I")
    public static int field6667 = 0;

    @OriginalMember(owner = "client!bn", name = "k", descriptor = "I")
    private static int field6654 = 0;

    @OriginalMember(owner = "client!bn", name = "a", descriptor = "I")
    public int field6644;

    @OriginalMember(owner = "client!bn", name = "c", descriptor = "I")
    private static int field6646;

    @OriginalMember(owner = "client!bn", name = "d", descriptor = "I")
    public static int field6647;

    @OriginalMember(owner = "client!bn", name = "f", descriptor = "I")
    private static int field6649;

    @OriginalMember(owner = "client!bn", name = "g", descriptor = "I")
    public static int field6650;

    @OriginalMember(owner = "client!bn", name = "j", descriptor = "I")
    public static int field6653;

    @OriginalMember(owner = "client!bn", name = "l", descriptor = "I")
    public static int field6655;

    @OriginalMember(owner = "client!bn", name = "n", descriptor = "I")
    public static int field6657;

    @OriginalMember(owner = "client!bn", name = "o", descriptor = "I")
    public static int field6658;

    @OriginalMember(owner = "client!bn", name = "q", descriptor = "I")
    public int field6660;

    @OriginalMember(owner = "client!bn", name = "r", descriptor = "I")
    public static int field6661;

    @OriginalMember(owner = "client!bn", name = "s", descriptor = "I")
    public static int field6662;

    @OriginalMember(owner = "client!bn", name = "t", descriptor = "I")
    public static int field6663;

    @OriginalMember(owner = "client!bn", name = "u", descriptor = "I")
    public static int field6664;

    @OriginalMember(owner = "client!bn", name = "z", descriptor = "I")
    private static int field6669;

    @OriginalMember(owner = "client!bn", name = "A", descriptor = "I")
    public int field6670;

    @OriginalMember(owner = "client!bn", name = "C", descriptor = "I")
    public static int field6672;

    @OriginalMember(owner = "client!bn", name = "D", descriptor = "I")
    public static int field6673;

    @OriginalMember(owner = "client!bn", name = "E", descriptor = "I")
    public int field6674;

    @OriginalMember(owner = "client!bn", name = "F", descriptor = "I")
    public static int field6675;

    @OriginalMember(owner = "client!bn", name = "G", descriptor = "I")
    private static int field6676;

    @OriginalMember(owner = "client!bn", name = "i", descriptor = "[I")
    private int[] field6652;

    @OriginalMember(owner = "client!bn", name = "a", descriptor = "(FFFFFF)Z", line = 4)
    private final boolean method2689(float arg0, float arg1, float arg2, float arg3, float arg4, float arg5) {
        int var7 = this.field6671 + this.field6644 + this.field6660;
        int var8 = this.field6674 + this.field6668 + this.field6670;
        if (this.field6671 != var7 || this.field6668 != var8) {
            float var9 = (arg2 - arg0) / (float) var7;
            float var10 = (arg3 - arg1) / (float) var7;
            float var11 = (arg4 - arg0) / (float) var8;
            float var12 = (arg5 - arg1) / (float) var8;
            float var13 = (float) this.field6674 * var11;
            float var14 = (float) this.field6674 * var12;
            float var15 = (float) this.field6644 * var9;
            float var16 = (float) this.field6644 * var10;
            float var17 = (float) this.field6660 * -var9;
            float var18 = (float) this.field6660 * -var10;
            float var19 = (float) this.field6670 * -var11;
            float var20 = (float) this.field6670 * -var12;
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
        if (var23 < (float) this.field6651.field9080) {
            var23 = this.field6651.field9080;
        }
        if (var24 > (float) this.field6651.field9063) {
            var24 = this.field6651.field9063;
        }
        if (var25 < (float) this.field6651.field9074) {
            var25 = this.field6651.field9074;
        }
        if (var26 > (float) this.field6651.field9062) {
            var26 = this.field6651.field9062;
        }
        float var27 = var23 - var24;
        if (var27 >= 0.0F) {
            return false;
        }
        float var28 = var25 - var26;
        if (var28 >= 0.0F) {
            return false;
        }
        field6653 = this.field6651.field9085;
        field6647 = (int) ((float) ((int) var25 * field6653) + var23);
        float var29 = (arg2 - arg0) * (arg5 - arg1) - (arg4 - arg0) * (arg3 - arg1);
        float var30 = (arg4 - arg0) * (arg3 - arg1) - (arg2 - arg0) * (arg5 - arg1);
        field6663 = (int) ((arg5 - arg1) * 4096.0F * (float) this.field6671 / var29);
        field6675 = (int) ((arg3 - arg1) * 4096.0F * (float) this.field6668 / var30);
        field6662 = (int) ((arg4 - arg0) * 4096.0F * (float) this.field6671 / var30);
        field6664 = (int) ((arg2 - arg0) * 4096.0F * (float) this.field6668 / var29);
        field6649 = (int) (var23 * 16.0F + 8.0F - (arg0 + arg2 + arg4 + var21) / 4.0F * 16.0F);
        field6646 = (int) (var25 * 16.0F + 8.0F - (arg1 + arg3 + arg5 + var22) / 4.0F * 16.0F);
        field6650 = (this.field6671 >> 1 << 12) + (field6662 * field6646 >> 4);
        field6658 = (this.field6668 >> 1 << 12) + (field6664 * field6646 >> 4);
        field6673 = field6663 * field6649 >> 4;
        field6657 = field6675 * field6649 >> 4;
        field6669 = (int) var23;
        field6661 = (int) var27;
        field6676 = (int) var25;
        field6672 = (int) var28;
        return true;
    }

    @OriginalMember(owner = "client!bn", name = "A", descriptor = "()I", line = 144)
    public final int method50() {
        return this.field6671 + this.field6644 + this.field6660;
    }

    @OriginalMember(owner = "client!bn", name = "u", descriptor = "()I", line = 150)
    public final int method56() {
        return this.field6668;
    }

    @OriginalMember(owner = "client!bn", name = "DA", descriptor = "(IIIIIII)V", line = 160)
    public final void method53(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        if (this.field6651.method3605()) {
            throw new IllegalStateException();
        }
        if (this.field6652 == null) {
            this.field6652 = new int[4];
        }
        this.field6651.method628(this.field6652);
        this.field6651.method692(this.field6651.field9080, this.field6651.field9074, arg0 + arg2, arg1 + arg3);
        int var8 = this.method50();
        int var9 = this.method43();
        int var10 = (arg2 + var8 - 1) / var8;
        int var11 = (arg3 + var9 - 1) / var9;
        for (int var12 = 0; var12 < var11; var12++) {
            int var13 = var9 * var12;
            for (int var14 = 0; var14 < var10; var14++) {
                this.method49(var8 * var14 + arg0, arg1 + var13, arg4, arg5, arg6);
            }
        }
        this.field6651.method652(this.field6652[0], this.field6652[1], this.field6652[2], this.field6652[3]);
    }

    @OriginalMember(owner = "client!bn", name = "Q", descriptor = "(IIII)V", line = 200)
    public final void method58(int arg0, int arg1, int arg2, int arg3) {
        this.field6644 = arg0;
        this.field6674 = arg1;
        this.field6660 = arg2;
        this.field6670 = arg3;
    }

    @OriginalMember(owner = "client!bn", name = "a", descriptor = "(FFFFFFILua;II)V", line = 215)
    public final void method60(float arg0, float arg1, float arg2, float arg3, float arg4, float arg5, int arg6, class591 arg7, int arg8, int arg9) {
        if (this.field6651.method3605()) {
            throw new IllegalStateException();
        } else if (this.method2689(arg0, arg1, arg2, arg3, arg4, arg5)) {
            class92 var11 = (class92) arg7;
            this.method1144(var11.field1401, var11.field1399, field6669 - arg8, -arg9 - (field6672 - field6676));
        }
    }

    @OriginalMember(owner = "client!bn", name = "ca", descriptor = "()I", line = 239)
    public final int method43() {
        return this.field6674 + this.field6668 + this.field6670;
    }

    @OriginalMember(owner = "client!bn", name = "E", descriptor = "()I", line = 245)
    public final int method48() {
        return this.field6671;
    }

    @OriginalMember(owner = "client!bn", name = "qa", descriptor = "(FFFFFFIIII)V", line = 256)
    public final void method57(float arg0, float arg1, float arg2, float arg3, float arg4, float arg5, int arg6, int arg7, int arg8, int arg9) {
        if (this.field6651.method3605()) {
            throw new IllegalStateException();
        } else if (this.method2689(arg0, arg1, arg2, arg3, arg4, arg5)) {
            field6655 = arg7;
            if (arg6 != 1) {
                field6656 = arg7 >>> 24;
                field6666 = 256 - field6656;
                if (arg6 == 0) {
                    field6667 = (arg7 & 0xFF0000) >> 16;
                    field6645 = (arg7 & 0xFF00) >> 8;
                    field6648 = arg7 & 0xFF;
                } else if (arg6 == 2) {
                    field6654 = arg7 >>> 24;
                    field6665 = 256 - field6654;
                    int var11 = (arg7 & 0xFF00FF) * field6665 & 0xFF00FF00;
                    int var12 = (arg7 & 0xFF00) * field6665 & 0xFF0000;
                    field6659 = (var11 | var12) >>> 8;
                }
            }
            if (arg6 == 1) {
                if (arg8 == 0) {
                    this.method1146(1, 0);
                    return;
                }
                if (arg8 == 1) {
                    this.method1146(1, 1);
                    return;
                }
                if (arg8 == 2) {
                    this.method1146(1, 2);
                    return;
                }
            } else if (arg6 == 0) {
                if (arg8 == 0) {
                    this.method1146(0, 0);
                    return;
                }
                if (arg8 == 1) {
                    this.method1146(0, 1);
                    return;
                }
                if (arg8 == 2) {
                    this.method1146(0, 2);
                    return;
                }
            } else if (arg6 == 3) {
                if (arg8 == 0) {
                    this.method1146(3, 0);
                    return;
                }
                if (arg8 == 1) {
                    this.method1146(3, 1);
                    return;
                }
                if (arg8 == 2) {
                    this.method1146(3, 2);
                    return;
                }
            } else if (arg6 == 2) {
                if (arg8 == 0) {
                    this.method1146(2, 0);
                    return;
                }
                if (arg8 == 1) {
                    this.method1146(2, 1);
                    return;
                }
                if (arg8 == 2) {
                    this.method1146(2, 2);
                }
            }
        }
    }

    @OriginalMember(owner = "client!bn", name = "<init>", descriptor = "(Lst;II)V", line = 366)
    public class463(class626 arg0, int arg1, int arg2) {
        this.field6651 = arg0;
        this.field6671 = arg1;
        this.field6668 = arg2;
    }

    @OriginalMember(owner = "client!bn", name = "a", descriptor = "([I[III)V")
    public abstract void method1144(int[] arg0, int[] arg1, int arg2, int arg3);

    @OriginalMember(owner = "client!bn", name = "b", descriptor = "(II)V")
    public abstract void method1146(int arg0, int arg1);

    @OriginalMember(owner = "client!bn", name = "a", descriptor = "(IILua;II)V")
    public abstract void method51(int arg0, int arg1, class591 arg2, int arg3, int arg4);

    @OriginalMember(owner = "client!bn", name = "V", descriptor = "(IIIII)V")
    public abstract void method49(int arg0, int arg1, int arg2, int arg3, int arg4);

    @OriginalMember(owner = "client!bn", name = "YA", descriptor = "(IIIIIIII)V")
    public abstract void method52(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7);

    @OriginalMember(owner = "client!bn", name = "a", descriptor = "(IIIIIIIII)V")
    public abstract void method1145(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8);
}
