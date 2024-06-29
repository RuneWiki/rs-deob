import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!jp")
public abstract class class327 extends class702 {

    @OriginalMember(owner = "client!jp", name = "m", descriptor = "Ldda;")
    public class351 field4790;

    @OriginalMember(owner = "client!jp", name = "y", descriptor = "I")
    public int field4802;

    @OriginalMember(owner = "client!jp", name = "D", descriptor = "I")
    public int field4807;

    @OriginalMember(owner = "client!jp", name = "s", descriptor = "I")
    public static int field4796 = 0;

    @OriginalMember(owner = "client!jp", name = "l", descriptor = "I")
    public static int field4789 = 0;

    @OriginalMember(owner = "client!jp", name = "x", descriptor = "I")
    public static int field4801 = 0;

    @OriginalMember(owner = "client!jp", name = "e", descriptor = "I")
    public static int field4782 = 0;

    @OriginalMember(owner = "client!jp", name = "v", descriptor = "I")
    private static int field4799 = 0;

    @OriginalMember(owner = "client!jp", name = "j", descriptor = "I")
    public static int field4787 = 0;

    @OriginalMember(owner = "client!jp", name = "c", descriptor = "I")
    public static int field4780 = 0;

    @OriginalMember(owner = "client!jp", name = "G", descriptor = "I")
    private static int field4810 = 0;

    @OriginalMember(owner = "client!jp", name = "a", descriptor = "I")
    public static int field4778;

    @OriginalMember(owner = "client!jp", name = "b", descriptor = "I")
    public static int field4779;

    @OriginalMember(owner = "client!jp", name = "d", descriptor = "I")
    public static int field4781;

    @OriginalMember(owner = "client!jp", name = "f", descriptor = "I")
    private static int field4783;

    @OriginalMember(owner = "client!jp", name = "g", descriptor = "I")
    private static int field4784;

    @OriginalMember(owner = "client!jp", name = "h", descriptor = "I")
    public int field4785;

    @OriginalMember(owner = "client!jp", name = "i", descriptor = "I")
    public static int field4786;

    @OriginalMember(owner = "client!jp", name = "k", descriptor = "I")
    public int field4788;

    @OriginalMember(owner = "client!jp", name = "n", descriptor = "I")
    public static int field4791;

    @OriginalMember(owner = "client!jp", name = "o", descriptor = "I")
    public static int field4792;

    @OriginalMember(owner = "client!jp", name = "p", descriptor = "I")
    public static int field4793;

    @OriginalMember(owner = "client!jp", name = "q", descriptor = "I")
    public static int field4794;

    @OriginalMember(owner = "client!jp", name = "r", descriptor = "I")
    public static int field4795;

    @OriginalMember(owner = "client!jp", name = "t", descriptor = "I")
    public static int field4797;

    @OriginalMember(owner = "client!jp", name = "u", descriptor = "I")
    public static int field4798;

    @OriginalMember(owner = "client!jp", name = "w", descriptor = "I")
    public static int field4800;

    @OriginalMember(owner = "client!jp", name = "z", descriptor = "I")
    private static int field4803;

    @OriginalMember(owner = "client!jp", name = "A", descriptor = "I")
    public int field4804;

    @OriginalMember(owner = "client!jp", name = "B", descriptor = "I")
    public static int field4805;

    @OriginalMember(owner = "client!jp", name = "E", descriptor = "I")
    private static int field4808;

    @OriginalMember(owner = "client!jp", name = "F", descriptor = "I")
    public int field4809;

    @OriginalMember(owner = "client!jp", name = "C", descriptor = "[I")
    private int[] field4806;

    @OriginalMember(owner = "client!jp", name = "b", descriptor = "(II)V")
    public abstract void method1741(int arg0, int arg1);

    @OriginalMember(owner = "client!jp", name = "a", descriptor = "(IILua;II)V")
    public abstract void method1744(int arg0, int arg1, class619 arg2, int arg3, int arg4);

    @OriginalMember(owner = "client!jp", name = "Q", descriptor = "(IIII)V")
    public final void method1787(int arg0, int arg1, int arg2, int arg3) {
        this.field4804 = arg0;
        this.field4809 = arg1;
        this.field4785 = arg2;
        this.field4788 = arg3;
    }

    @OriginalMember(owner = "client!jp", name = "A", descriptor = "()I")
    public final int method1784() {
        return this.field4804 + this.field4802 + this.field4785;
    }

    @OriginalMember(owner = "client!jp", name = "V", descriptor = "(IIIII)V")
    public abstract void method1743(int arg0, int arg1, int arg2, int arg3, int arg4);

    @OriginalMember(owner = "client!jp", name = "qa", descriptor = "(FFFFFFIIII)V")
    public final void method1790(float arg0, float arg1, float arg2, float arg3, float arg4, float arg5, int arg6, int arg7, int arg8, int arg9) {
        if (this.field4790.method2281()) {
            throw new IllegalStateException();
        } else if (this.method2107(arg0, arg1, arg2, arg3, arg4, arg5)) {
            field4779 = arg7;
            if (arg6 != 1) {
                field4789 = arg7 >>> 24;
                field4780 = 256 - field4789;
                if (arg6 == 0) {
                    field4782 = (arg7 & 0xFF0000) >> 16;
                    field4796 = (arg7 & 0xFF00) >> 8;
                    field4801 = arg7 & 0xFF;
                } else if (arg6 == 2) {
                    field4799 = arg7 >>> 24;
                    field4810 = 256 - field4799;
                    int var11 = (arg7 & 0xFF00FF) * field4810 & 0xFF00FF00;
                    int var12 = (arg7 & 0xFF00) * field4810 & 0xFF0000;
                    field4787 = (var11 | var12) >>> 8;
                }
            }
            if (arg6 == 1) {
                if (arg8 == 0) {
                    this.method1741(1, 0);
                    return;
                }
                if (arg8 == 1) {
                    this.method1741(1, 1);
                    return;
                }
                if (arg8 == 2) {
                    this.method1741(1, 2);
                    return;
                }
            } else if (arg6 == 0) {
                if (arg8 == 0) {
                    this.method1741(0, 0);
                    return;
                }
                if (arg8 == 1) {
                    this.method1741(0, 1);
                    return;
                }
                if (arg8 == 2) {
                    this.method1741(0, 2);
                    return;
                }
            } else if (arg6 == 3) {
                if (arg8 == 0) {
                    this.method1741(3, 0);
                    return;
                }
                if (arg8 == 1) {
                    this.method1741(3, 1);
                    return;
                }
                if (arg8 == 2) {
                    this.method1741(3, 2);
                    return;
                }
            } else if (arg6 == 2) {
                if (arg8 == 0) {
                    this.method1741(2, 0);
                    return;
                }
                if (arg8 == 1) {
                    this.method1741(2, 1);
                    return;
                }
                if (arg8 == 2) {
                    this.method1741(2, 2);
                }
            }
        }
    }

    @OriginalMember(owner = "client!jp", name = "ca", descriptor = "()I")
    public final int method1789() {
        return this.field4809 + this.field4807 + this.field4788;
    }

    @OriginalMember(owner = "client!jp", name = "u", descriptor = "()I")
    public final int method1785() {
        return this.field4807;
    }

    @OriginalMember(owner = "client!jp", name = "a", descriptor = "(FFFFFF)Z")
    private final boolean method2107(float arg0, float arg1, float arg2, float arg3, float arg4, float arg5) {
        int var7 = this.field4804 + this.field4802 + this.field4785;
        int var8 = this.field4809 + this.field4807 + this.field4788;
        if (this.field4802 != var7 || this.field4807 != var8) {
            float var9 = (arg2 - arg0) / (float) var7;
            float var10 = (arg3 - arg1) / (float) var7;
            float var11 = (arg4 - arg0) / (float) var8;
            float var12 = (arg5 - arg1) / (float) var8;
            float var13 = (float) this.field4809 * var11;
            float var14 = (float) this.field4809 * var12;
            float var15 = (float) this.field4804 * var9;
            float var16 = (float) this.field4804 * var10;
            float var17 = (float) this.field4785 * -var9;
            float var18 = (float) this.field4785 * -var10;
            float var19 = (float) this.field4788 * -var11;
            float var20 = (float) this.field4788 * -var12;
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
        if (var23 < (float) this.field4790.field5276) {
            var23 = this.field4790.field5276;
        }
        if (var24 > (float) this.field4790.field5292) {
            var24 = this.field4790.field5292;
        }
        if (var25 < (float) this.field4790.field5279) {
            var25 = this.field4790.field5279;
        }
        if (var26 > (float) this.field4790.field5273) {
            var26 = this.field4790.field5273;
        }
        float var27 = var23 - var24;
        if (var27 >= 0.0F) {
            return false;
        }
        float var28 = var25 - var26;
        if (var28 >= 0.0F) {
            return false;
        }
        field4800 = this.field4790.field5286;
        field4797 = (int) ((float) ((int) var25 * field4800) + var23);
        float var29 = (arg2 - arg0) * (arg5 - arg1) - (arg4 - arg0) * (arg3 - arg1);
        float var30 = (arg4 - arg0) * (arg3 - arg1) - (arg2 - arg0) * (arg5 - arg1);
        field4795 = (int) ((arg5 - arg1) * 4096.0F * (float) this.field4802 / var29);
        field4778 = (int) ((arg3 - arg1) * 4096.0F * (float) this.field4807 / var30);
        field4805 = (int) ((arg4 - arg0) * 4096.0F * (float) this.field4802 / var30);
        field4798 = (int) ((arg2 - arg0) * 4096.0F * (float) this.field4807 / var29);
        field4784 = (int) (var23 * 16.0F + 8.0F - (arg0 + arg2 + arg4 + var21) / 4.0F * 16.0F);
        field4783 = (int) (var25 * 16.0F + 8.0F - (arg1 + arg3 + arg5 + var22) / 4.0F * 16.0F);
        field4791 = (this.field4802 >> 1 << 12) + (field4805 * field4783 >> 4);
        field4786 = (this.field4807 >> 1 << 12) + (field4798 * field4783 >> 4);
        field4792 = field4795 * field4784 >> 4;
        field4781 = field4784 * field4778 >> 4;
        field4803 = (int) var23;
        field4793 = (int) var27;
        field4808 = (int) var25;
        field4794 = (int) var28;
        return true;
    }

    @OriginalMember(owner = "client!jp", name = "a", descriptor = "([I[III)V")
    public abstract void method1745(int[] arg0, int[] arg1, int arg2, int arg3);

    @OriginalMember(owner = "client!jp", name = "YA", descriptor = "(IIIIIIII)V")
    public abstract void method1740(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7);

    @OriginalMember(owner = "client!jp", name = "E", descriptor = "()I")
    public final int method1792() {
        return this.field4802;
    }

    @OriginalMember(owner = "client!jp", name = "DA", descriptor = "(IIIIIII)V")
    public final void method1788(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        if (this.field4790.method2281()) {
            throw new IllegalStateException();
        }
        if (this.field4806 == null) {
            this.field4806 = new int[4];
        }
        this.field4790.method131(this.field4806);
        this.field4790.method144(this.field4790.field5276, this.field4790.field5279, arg0 + arg2, arg1 + arg3);
        int var8 = this.method1784();
        int var9 = this.method1789();
        int var10 = (arg2 + var8 - 1) / var8;
        int var11 = (arg3 + var9 - 1) / var9;
        for (int var12 = 0; var12 < var11; var12++) {
            int var13 = var9 * var12;
            for (int var14 = 0; var14 < var10; var14++) {
                this.method1743(var8 * var14 + arg0, arg1 + var13, arg4, arg5, arg6);
            }
        }
        this.field4790.method142(this.field4806[0], this.field4806[1], this.field4806[2], this.field4806[3]);
    }

    @OriginalMember(owner = "client!jp", name = "<init>", descriptor = "(Ldda;II)V")
    public class327(class351 arg0, int arg1, int arg2) {
        this.field4790 = arg0;
        this.field4802 = arg1;
        this.field4807 = arg2;
    }

    @OriginalMember(owner = "client!jp", name = "a", descriptor = "(IIIIIIIII)V")
    public abstract void method1747(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8);

    @OriginalMember(owner = "client!jp", name = "a", descriptor = "(FFFFFFILua;II)V")
    public final void method1794(float arg0, float arg1, float arg2, float arg3, float arg4, float arg5, int arg6, class619 arg7, int arg8, int arg9) {
        if (this.field4790.method2281()) {
            throw new IllegalStateException();
        } else if (this.method2107(arg0, arg1, arg2, arg3, arg4, arg5)) {
            class446 var11 = (class446) arg7;
            this.method1745(var11.field6421, var11.field6418, field4803 - arg8, -arg9 - (field4794 - field4808));
        }
    }
}
