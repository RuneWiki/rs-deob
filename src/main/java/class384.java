import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ph")
public abstract class class384 extends class356 {

    @OriginalMember(owner = "client!ph", name = "p", descriptor = "Lkd;")
    public class154 field5789;

    @OriginalMember(owner = "client!ph", name = "z", descriptor = "I")
    public int field5799;

    @OriginalMember(owner = "client!ph", name = "C", descriptor = "I")
    public int field5802;

    @OriginalMember(owner = "client!ph", name = "e", descriptor = "I")
    public static int field5778 = 0;

    @OriginalMember(owner = "client!ph", name = "g", descriptor = "I")
    private static int field5780 = 0;

    @OriginalMember(owner = "client!ph", name = "m", descriptor = "I")
    public static int field5786 = 0;

    @OriginalMember(owner = "client!ph", name = "a", descriptor = "I")
    public static int field5774 = 0;

    @OriginalMember(owner = "client!ph", name = "d", descriptor = "I")
    public static int field5777 = 0;

    @OriginalMember(owner = "client!ph", name = "t", descriptor = "I")
    private static int field5793 = 0;

    @OriginalMember(owner = "client!ph", name = "k", descriptor = "I")
    public static int field5784 = 0;

    @OriginalMember(owner = "client!ph", name = "D", descriptor = "I")
    public static int field5803 = 0;

    @OriginalMember(owner = "client!ph", name = "b", descriptor = "I")
    public static int field5775;

    @OriginalMember(owner = "client!ph", name = "c", descriptor = "I")
    public static int field5776;

    @OriginalMember(owner = "client!ph", name = "f", descriptor = "I")
    private static int field5779;

    @OriginalMember(owner = "client!ph", name = "h", descriptor = "I")
    public static int field5781;

    @OriginalMember(owner = "client!ph", name = "i", descriptor = "I")
    public int field5782;

    @OriginalMember(owner = "client!ph", name = "j", descriptor = "I")
    public int field5783;

    @OriginalMember(owner = "client!ph", name = "l", descriptor = "I")
    public static int field5785;

    @OriginalMember(owner = "client!ph", name = "n", descriptor = "I")
    public static int field5787;

    @OriginalMember(owner = "client!ph", name = "o", descriptor = "I")
    private static int field5788;

    @OriginalMember(owner = "client!ph", name = "q", descriptor = "I")
    public int field5790;

    @OriginalMember(owner = "client!ph", name = "r", descriptor = "I")
    public static int field5791;

    @OriginalMember(owner = "client!ph", name = "s", descriptor = "I")
    public static int field5792;

    @OriginalMember(owner = "client!ph", name = "u", descriptor = "I")
    public int field5794;

    @OriginalMember(owner = "client!ph", name = "v", descriptor = "I")
    public static int field5795;

    @OriginalMember(owner = "client!ph", name = "w", descriptor = "I")
    public static int field5796;

    @OriginalMember(owner = "client!ph", name = "x", descriptor = "I")
    public static int field5797;

    @OriginalMember(owner = "client!ph", name = "y", descriptor = "I")
    private static int field5798;

    @OriginalMember(owner = "client!ph", name = "B", descriptor = "I")
    public static int field5801;

    @OriginalMember(owner = "client!ph", name = "E", descriptor = "I")
    private static int field5804;

    @OriginalMember(owner = "client!ph", name = "F", descriptor = "I")
    public static int field5805;

    @OriginalMember(owner = "client!ph", name = "G", descriptor = "I")
    public static int field5806;

    @OriginalMember(owner = "client!ph", name = "A", descriptor = "[I")
    private int[] field5800;

    @OriginalMember(owner = "client!ph", name = "a", descriptor = "()I")
    public final int method2315() {
        return this.field5802 + this.field5790 + this.field5783;
    }

    @OriginalMember(owner = "client!ph", name = "b", descriptor = "(II)V")
    public abstract void method416(int arg0, int arg1);

    @OriginalMember(owner = "client!ph", name = "a", descriptor = "(FFFFFF)V")
    private final void method2429(float arg0, float arg1, float arg2, float arg3, float arg4, float arg5) {
        int var7 = this.field5799 + this.field5794 + this.field5782;
        int var8 = this.field5802 + this.field5790 + this.field5783;
        if (this.field5799 != var7 || this.field5802 != var8) {
            float var9 = (arg2 - arg0) / (float) var7;
            float var10 = (arg3 - arg1) / (float) var7;
            float var11 = (arg4 - arg0) / (float) var8;
            float var12 = (arg5 - arg1) / (float) var8;
            float var13 = (float) this.field5790 * var11;
            float var14 = (float) this.field5790 * var12;
            float var15 = (float) this.field5794 * var9;
            float var16 = (float) this.field5794 * var10;
            float var17 = (float) this.field5782 * -var9;
            float var18 = (float) this.field5782 * -var10;
            float var19 = (float) this.field5783 * -var11;
            float var20 = (float) this.field5783 * -var12;
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
        if (var23 < (float) this.field5789.field2421) {
            var23 = (float) this.field5789.field2421;
        }
        if (var24 > (float) this.field5789.field2425) {
            var24 = (float) this.field5789.field2425;
        }
        if (var25 < (float) this.field5789.field2392) {
            var25 = (float) this.field5789.field2392;
        }
        if (var26 > (float) this.field5789.field2390) {
            var26 = (float) this.field5789.field2390;
        }
        float var27 = var23 - var24;
        if ((var27 >= 0.0F)) {
            return;
        }
        float var28 = var25 - var26;
        if ((var28 >= 0.0F)) {
            return;
        }
        field5801 = this.field5789.field2426;
        field5781 = (int) ((float) ((int) var25 * field5801) + var23);
        float var29 = (arg2 - arg0) * (arg5 - arg1) - (arg4 - arg0) * (arg3 - arg1);
        float var30 = (arg4 - arg0) * (arg3 - arg1) - (arg2 - arg0) * (arg5 - arg1);
        field5775 = (int) ((arg5 - arg1) * 4096.0F * (float) this.field5799 / var29);
        field5791 = (int) ((arg3 - arg1) * 4096.0F * (float) this.field5802 / var30);
        field5792 = (int) ((arg4 - arg0) * 4096.0F * (float) this.field5799 / var30);
        field5776 = (int) ((arg2 - arg0) * 4096.0F * (float) this.field5802 / var29);
        field5779 = (int) (var23 * 16.0F + 8.0F - (arg0 + arg2 + arg4 + var21) / 4.0F * 16.0F);
        field5788 = (int) (var25 * 16.0F + 8.0F - (arg1 + arg3 + arg5 + var22) / 4.0F * 16.0F);
        field5805 = (this.field5799 >> 1 << 12) + (field5792 * field5788 >> 4);
        field5787 = (this.field5802 >> 1 << 12) + (field5788 * field5776 >> 4);
        field5795 = field5779 * field5775 >> 4;
        field5797 = field5791 * field5779 >> 4;
        field5804 = (int) var23;
        field5806 = (int) var27;
        field5798 = (int) var25;
        field5796 = (int) var28;
    }

    @OriginalMember(owner = "client!ph", name = "a", descriptor = "(FFFFFFIII)V")
    public final void method2323(float arg0, float arg1, float arg2, float arg3, float arg4, float arg5, int arg6, int arg7, int arg8) {
        if (this.field5789.method1080()) {
            throw new IllegalStateException();
        }
        this.method2429(arg0, arg1, arg2, arg3, arg4, arg5);
        field5785 = arg7;
        if (arg6 != 0) {
            field5774 = arg7 >>> 24;
            field5786 = 256 - field5774;
            if (arg6 == 1) {
                field5784 = (arg7 & 0xFF0000) >> 16;
                field5803 = (arg7 & 0xFF00) >> 8;
                field5777 = arg7 & 0xFF;
            } else {
                field5780 = arg7 >>> 24;
                field5793 = 256 - field5780;
                int var10 = (arg7 & 0xFF00FF) * field5793 & 0xFF00FF00;
                int var11 = (arg7 & 0xFF00) * field5793 & 0xFF0000;
                field5778 = (var10 | var11) >>> 8;
            }
        }
        if (arg6 == 0) {
            if (arg8 == 0) {
                this.method416(0, 0);
                return;
            }
            if (arg8 == 1) {
                this.method416(0, 1);
                return;
            }
            if (arg8 == 2) {
                this.method416(0, 2);
                return;
            }
        } else if (arg6 == 1) {
            if (arg8 == 0) {
                this.method416(1, 0);
                return;
            }
            if (arg8 == 1) {
                this.method416(1, 1);
                return;
            }
            if (arg8 == 2) {
                this.method416(1, 2);
                return;
            }
        } else if (arg6 == 2) {
            if (arg8 == 0) {
                this.method416(2, 0);
                return;
            }
            if (arg8 == 1) {
                this.method416(2, 1);
                return;
            }
            if (arg8 == 2) {
                this.method416(2, 2);
            }
        }
    }

    @OriginalMember(owner = "client!ph", name = "d", descriptor = "()I")
    public final int method2325() {
        return this.field5802;
    }

    @OriginalMember(owner = "client!ph", name = "c", descriptor = "()I")
    public final int method2324() {
        return this.field5799;
    }

    @OriginalMember(owner = "client!ph", name = "b", descriptor = "(IIII)V")
    public final void method2321(int arg0, int arg1, int arg2, int arg3) {
        this.field5794 = arg0;
        this.field5790 = arg1;
        this.field5782 = arg2;
        this.field5783 = arg3;
    }

    @OriginalMember(owner = "client!ph", name = "a", descriptor = "(IIIIIII)V")
    public abstract void method420(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6);

    @OriginalMember(owner = "client!ph", name = "a", descriptor = "(IILq;II)V")
    public abstract void method418(int arg0, int arg1, class245 arg2, int arg3, int arg4);

    @OriginalMember(owner = "client!ph", name = "a", descriptor = "(FFFFFFLq;II)V")
    public final void method2322(float arg0, float arg1, float arg2, float arg3, float arg4, float arg5, class245 arg6, int arg7, int arg8) {
        if (this.field5789.method1080()) {
            throw new IllegalStateException();
        }
        this.method2429(arg0, arg1, arg2, arg3, arg4, arg5);
        class111 var10 = (class111) arg6;
        this.method415(var10.field1539, var10.field1538, field5804 - arg7, -arg8 - (field5796 - field5798));
    }

    @OriginalMember(owner = "client!ph", name = "a", descriptor = "(IIIII)V")
    public abstract void method419(int arg0, int arg1, int arg2, int arg3, int arg4);

    @OriginalMember(owner = "client!ph", name = "b", descriptor = "(IIIIIII)V")
    public final void method2326(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        if (this.field5789.method1080()) {
            throw new IllegalStateException();
        }
        if (this.field5800 == null) {
            this.field5800 = new int[4];
        }
        this.field5789.method654(this.field5800);
        this.field5789.method682(this.field5789.field2421, this.field5789.field2392, arg0 + arg2, arg1 + arg3);
        int var8 = this.method2318();
        int var9 = this.method2315();
        int var10 = (arg2 + var8 - 1) / var8;
        int var11 = (arg3 + var9 - 1) / var9;
        for (int var12 = 0; var12 < var11; var12++) {
            int var13 = var9 * var12;
            for (int var14 = 0; var14 < var10; var14++) {
                this.method419(var8 * var14 + arg0, arg1 + var13, arg4, arg5, arg6);
            }
        }
        this.field5789.method671(this.field5800[0], this.field5800[1], this.field5800[2], this.field5800[3]);
    }

    @OriginalMember(owner = "client!ph", name = "a", descriptor = "([I[III)V")
    public abstract void method415(int[] arg0, int[] arg1, int arg2, int arg3);

    @OriginalMember(owner = "client!ph", name = "<init>", descriptor = "(Lkd;II)V")
    public class384(class154 arg0, int arg1, int arg2) {
        this.field5789 = arg0;
        this.field5799 = arg1;
        this.field5802 = arg2;
    }

    @OriginalMember(owner = "client!ph", name = "b", descriptor = "()I")
    public final int method2318() {
        return this.field5799 + this.field5794 + this.field5782;
    }
}
