import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!cr")
public abstract class class189 extends class421 {

    @OriginalMember(owner = "client!cr", name = "c", descriptor = "Ljn;")
    public class396 field2790;

    @OriginalMember(owner = "client!cr", name = "v", descriptor = "I")
    public int field2809;

    @OriginalMember(owner = "client!cr", name = "j", descriptor = "I")
    public int field2797;

    @OriginalMember(owner = "client!cr", name = "e", descriptor = "I")
    private static int field2792 = 0;

    @OriginalMember(owner = "client!cr", name = "m", descriptor = "I")
    public static int field2800 = 0;

    @OriginalMember(owner = "client!cr", name = "g", descriptor = "I")
    public static int field2794 = 0;

    @OriginalMember(owner = "client!cr", name = "n", descriptor = "I")
    public static int field2801 = 0;

    @OriginalMember(owner = "client!cr", name = "x", descriptor = "I")
    public static int field2811 = 0;

    @OriginalMember(owner = "client!cr", name = "t", descriptor = "I")
    public static int field2807 = 0;

    @OriginalMember(owner = "client!cr", name = "d", descriptor = "I")
    private static int field2791 = 0;

    @OriginalMember(owner = "client!cr", name = "a", descriptor = "I")
    public static int field2788 = 0;

    @OriginalMember(owner = "client!cr", name = "b", descriptor = "I")
    public static int field2789;

    @OriginalMember(owner = "client!cr", name = "f", descriptor = "I")
    public int field2793;

    @OriginalMember(owner = "client!cr", name = "h", descriptor = "I")
    public int field2795;

    @OriginalMember(owner = "client!cr", name = "i", descriptor = "I")
    public static int field2796;

    @OriginalMember(owner = "client!cr", name = "k", descriptor = "I")
    private static int field2798;

    @OriginalMember(owner = "client!cr", name = "l", descriptor = "I")
    public int field2799;

    @OriginalMember(owner = "client!cr", name = "o", descriptor = "I")
    public static int field2802;

    @OriginalMember(owner = "client!cr", name = "p", descriptor = "I")
    public static int field2803;

    @OriginalMember(owner = "client!cr", name = "q", descriptor = "I")
    public static int field2804;

    @OriginalMember(owner = "client!cr", name = "r", descriptor = "I")
    private static int field2805;

    @OriginalMember(owner = "client!cr", name = "s", descriptor = "I")
    private static int field2806;

    @OriginalMember(owner = "client!cr", name = "u", descriptor = "I")
    public static int field2808;

    @OriginalMember(owner = "client!cr", name = "y", descriptor = "I")
    public int field2812;

    @OriginalMember(owner = "client!cr", name = "z", descriptor = "I")
    public static int field2813;

    @OriginalMember(owner = "client!cr", name = "A", descriptor = "I")
    public static int field2814;

    @OriginalMember(owner = "client!cr", name = "B", descriptor = "I")
    public static int field2815;

    @OriginalMember(owner = "client!cr", name = "C", descriptor = "I")
    public static int field2816;

    @OriginalMember(owner = "client!cr", name = "D", descriptor = "I")
    public static int field2817;

    @OriginalMember(owner = "client!cr", name = "E", descriptor = "I")
    private static int field2818;

    @OriginalMember(owner = "client!cr", name = "F", descriptor = "I")
    public static int field2819;

    @OriginalMember(owner = "client!cr", name = "G", descriptor = "I")
    public static int field2820;

    @OriginalMember(owner = "client!cr", name = "w", descriptor = "[I")
    private int[] field2810;

    @OriginalMember(owner = "client!cr", name = "c", descriptor = "()I", line = 12)
    public final int method1461() {
        return this.field2812 + this.field2809 + this.field2793;
    }

    @OriginalMember(owner = "client!cr", name = "a", descriptor = "(FFFFFFIII)V", line = 26)
    public final void method1462(float arg0, float arg1, float arg2, float arg3, float arg4, float arg5, int arg6, int arg7, int arg8) {
        if (this.field2790.method2514()) {
            throw new IllegalStateException();
        }
        this.method1465(arg0, arg1, arg2, arg3, arg4, arg5);
        field2814 = arg7;
        if (arg6 != 0) {
            field2788 = arg7 >>> 24;
            field2794 = 256 - field2788;
            if (arg6 == 1) {
                field2801 = (arg7 & 0xFF0000) >> 16;
                field2807 = (arg7 & 0xFF00) >> 8;
                field2811 = arg7 & 0xFF;
            } else {
                field2792 = arg7 >>> 24;
                field2791 = 256 - field2792;
                int var10 = (arg7 & 0xFF00FF) * field2791 & 0xFF00FF00;
                int var11 = (arg7 & 0xFF00) * field2791 & 0xFF0000;
                field2800 = (var10 | var11) >>> 8;
            }
        }
        if (arg6 == 0) {
            if (arg8 == 0) {
                this.method496(0, 0);
                return;
            }
            if (arg8 == 1) {
                this.method496(0, 1);
                return;
            }
            if (arg8 == 2) {
                this.method496(0, 2);
                return;
            }
        } else if (arg6 == 1) {
            if (arg8 == 0) {
                this.method496(1, 0);
                return;
            }
            if (arg8 == 1) {
                this.method496(1, 1);
                return;
            }
            if (arg8 == 2) {
                this.method496(1, 2);
                return;
            }
        } else if (arg6 == 2) {
            if (arg8 == 0) {
                this.method496(2, 0);
                return;
            }
            if (arg8 == 1) {
                this.method496(2, 1);
                return;
            }
            if (arg8 == 2) {
                this.method496(2, 2);
            }
        }
    }

    @OriginalMember(owner = "client!cr", name = "d", descriptor = "()I", line = 104)
    public final int method1463() {
        return this.field2799 + this.field2797 + this.field2795;
    }

    @OriginalMember(owner = "client!cr", name = "a", descriptor = "(IIIIIII)V", line = 108)
    public final void method1464(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        if (this.field2790.method2514()) {
            throw new IllegalStateException();
        }
        if (this.field2810 == null) {
            this.field2810 = new int[4];
        }
        this.field2790.method708(this.field2810);
        this.field2790.method672(this.field2790.field5803, this.field2790.field5796, arg0 + arg2, arg1 + arg3);
        int var8 = this.method1461();
        int var9 = this.method1463();
        int var10 = (arg2 + var8 - 1) / var8;
        int var11 = (arg3 + var9 - 1) / var9;
        for (int var12 = 0; var12 < var11; var12++) {
            int var13 = var9 * var12;
            for (int var14 = 0; var14 < var10; var14++) {
                this.method498(var8 * var14 + arg0, arg1 + var13, arg4, arg5, arg6);
            }
        }
        this.field2790.method752(this.field2810[0], this.field2810[1], this.field2810[2], this.field2810[3]);
    }

    @OriginalMember(owner = "client!cr", name = "a", descriptor = "(FFFFFF)V", line = 150)
    private final void method1465(float arg0, float arg1, float arg2, float arg3, float arg4, float arg5) {
        int var7 = this.field2812 + this.field2809 + this.field2793;
        int var8 = this.field2799 + this.field2797 + this.field2795;
        if (this.field2809 != var7 || this.field2797 != var8) {
            float var9 = (arg2 - arg0) / (float) var7;
            float var10 = (arg3 - arg1) / (float) var7;
            float var11 = (arg4 - arg0) / (float) var8;
            float var12 = (arg5 - arg1) / (float) var8;
            float var13 = (float) this.field2799 * var11;
            float var14 = (float) this.field2799 * var12;
            float var15 = (float) this.field2812 * var9;
            float var16 = (float) this.field2812 * var10;
            float var17 = (float) this.field2793 * -var9;
            float var18 = (float) this.field2793 * -var10;
            float var19 = (float) this.field2795 * -var11;
            float var20 = (float) this.field2795 * -var12;
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
        if (var23 < (float) this.field2790.field5803) {
            var23 = (float) this.field2790.field5803;
        }
        if (var24 > (float) this.field2790.field5790) {
            var24 = (float) this.field2790.field5790;
        }
        if (var25 < (float) this.field2790.field5796) {
            var25 = (float) this.field2790.field5796;
        }
        if (var26 > (float) this.field2790.field5806) {
            var26 = (float) this.field2790.field5806;
        }
        float var27 = var23 - var24;
        if ((var27 >= 0.0F)) {
            return;
        }
        float var28 = var25 - var26;
        if ((var28 >= 0.0F)) {
            return;
        }
        field2803 = this.field2790.field5785;
        field2808 = (int) ((float) ((int) var25 * field2803) + var23);
        float var29 = (arg2 - arg0) * (arg5 - arg1) - (arg4 - arg0) * (arg3 - arg1);
        float var30 = (arg4 - arg0) * (arg3 - arg1) - (arg2 - arg0) * (arg5 - arg1);
        field2819 = (int) ((arg5 - arg1) * 4096.0F * (float) this.field2809 / var29);
        field2802 = (int) ((arg3 - arg1) * 4096.0F * (float) this.field2797 / var30);
        field2796 = (int) ((arg4 - arg0) * 4096.0F * (float) this.field2809 / var30);
        field2816 = (int) ((arg2 - arg0) * 4096.0F * (float) this.field2797 / var29);
        field2798 = (int) (var23 * 16.0F + 8.0F - (arg0 + arg2 + arg4 + var21) / 4.0F * 16.0F);
        field2805 = (int) (var25 * 16.0F + 8.0F - (arg1 + arg3 + arg5 + var22) / 4.0F * 16.0F);
        field2820 = (this.field2809 >> 1 << 12) + (field2805 * field2796 >> 4);
        field2804 = (this.field2797 >> 1 << 12) + (field2816 * field2805 >> 4);
        field2815 = field2819 * field2798 >> 4;
        field2817 = field2802 * field2798 >> 4;
        field2806 = (int) var23;
        field2789 = (int) var27;
        field2818 = (int) var25;
        field2813 = (int) var28;
    }

    @OriginalMember(owner = "client!cr", name = "a", descriptor = "(FFFFFFLrn;II)V", line = 283)
    public final void method1466(float arg0, float arg1, float arg2, float arg3, float arg4, float arg5, class134 arg6, int arg7, int arg8) {
        if (this.field2790.method2514()) {
            throw new IllegalStateException();
        }
        this.method1465(arg0, arg1, arg2, arg3, arg4, arg5);
        class185 var10 = (class185) arg6;
        this.method495(var10.field2720, var10.field2725, field2806 - arg7, -arg8 - (field2813 - field2818));
    }

    @OriginalMember(owner = "client!cr", name = "b", descriptor = "()I", line = 299)
    public final int method1467() {
        return this.field2797;
    }

    @OriginalMember(owner = "client!cr", name = "b", descriptor = "(IIII)V", line = 314)
    public final void method1468(int arg0, int arg1, int arg2, int arg3) {
        this.field2812 = arg0;
        this.field2799 = arg1;
        this.field2793 = arg2;
        this.field2795 = arg3;
    }

    @OriginalMember(owner = "client!cr", name = "a", descriptor = "()I", line = 326)
    public final int method1469() {
        return this.field2809;
    }

    @OriginalMember(owner = "client!cr", name = "<init>", descriptor = "(Ljn;II)V", line = 342)
    public class189(class396 arg0, int arg1, int arg2) {
        this.field2790 = arg0;
        this.field2809 = arg1;
        this.field2797 = arg2;
    }

    @OriginalMember(owner = "client!cr", name = "b", descriptor = "(II)V")
    public abstract void method496(int arg0, int arg1);

    @OriginalMember(owner = "client!cr", name = "a", descriptor = "([I[III)V")
    public abstract void method495(int[] arg0, int[] arg1, int arg2, int arg3);

    @OriginalMember(owner = "client!cr", name = "a", descriptor = "(IIIII)V")
    public abstract void method498(int arg0, int arg1, int arg2, int arg3, int arg4);

    @OriginalMember(owner = "client!cr", name = "b", descriptor = "(IIIIIII)V")
    public abstract void method494(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6);

    @OriginalMember(owner = "client!cr", name = "a", descriptor = "(IILrn;II)V")
    public abstract void method499(int arg0, int arg1, class134 arg2, int arg3, int arg4);
}
