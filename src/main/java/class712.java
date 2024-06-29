import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ac")
public abstract class class712 implements class594 {

    @OriginalMember(owner = "client!ac", name = "a", descriptor = "(FFIILaa;II)V", line = 3)
    public final void method3928(float arg0, float arg1, int arg2, int arg3, class81 arg4, int arg5, int arg6) {
        this.method3936(arg0, arg1, (float) this.method1892() / 2.0F, (float) this.method1882() / 2.0F, arg2, arg3, arg4, arg5, arg6);
    }

    @OriginalMember(owner = "client!ac", name = "a", descriptor = "(II)V", line = 10)
    public final void method3929(int arg0, int arg1) {
        this.method690(arg0, arg1, 1, 0, 1);
    }

    @OriginalMember(owner = "client!ac", name = "a", descriptor = "(FFII)V", line = 14)
    public final void method3930(float arg0, float arg1, int arg2, int arg3) {
        this.method3935(arg0, arg1, (float) this.method1892() / 2.0F, (float) this.method1882() / 2.0F, arg2, arg3, 1, 0, 1);
    }

    @OriginalMember(owner = "client!ac", name = "a", descriptor = "(FFFFFFIII)V", line = 20)
    private final void method3931(float arg0, float arg1, float arg2, float arg3, float arg4, float arg5, int arg6, int arg7, int arg8) {
        this.method1883(arg0, arg1, arg2, arg3, arg4, arg5, arg6, arg7, arg8, 1);
    }

    @OriginalMember(owner = "client!ac", name = "a", descriptor = "(FFFFFFLaa;II)V", line = 24)
    private final void method3932(float arg0, float arg1, float arg2, float arg3, float arg4, float arg5, class81 arg6, int arg7, int arg8) {
        this.method1887(arg0, arg1, arg2, arg3, arg4, arg5, 1, arg6, arg7, arg8);
    }

    @OriginalMember(owner = "client!ac", name = "b", descriptor = "(IIII)V", line = 36)
    public final void method3933(int arg0, int arg1, int arg2, int arg3) {
        this.method695(arg0, arg1, arg2, arg3, 1, 0, 1, 1);
    }

    @OriginalMember(owner = "client!ac", name = "a", descriptor = "(FFIIIII)V", line = 39)
    public final void method3934(float arg0, float arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        this.method3935(arg0, arg1, (float) this.method1892() / 2.0F, (float) this.method1882() / 2.0F, arg2, arg3, arg4, arg5, arg6);
    }

    @OriginalMember(owner = "client!ac", name = "a", descriptor = "(FFFFIIIII)V", line = 42)
    private final void method3935(float arg0, float arg1, float arg2, float arg3, int arg4, int arg5, int arg6, int arg7, int arg8) {
        if (arg4 == 0) {
            return;
        }
        double var10 = (double) (arg5 & 0xFFFF) * 9.587379924285257E-5D;
        float var12 = (float) Math.sin(var10) * (float) arg4;
        float var13 = (float) Math.cos(var10) * (float) arg4;
        float var14 = (-arg2 * var13 + -arg3 * var12) / 4096.0F + arg0;
        float var15 = (-arg3 * var13 + arg2 * var12) / 4096.0F + arg1;
        float var16 = (((float) this.method1892() - arg2) * var13 + -arg3 * var12) / 4096.0F + arg0;
        float var17 = (-((float) this.method1892() - arg2) * var12 + -arg3 * var13) / 4096.0F + arg1;
        float var18 = (-arg2 * var13 + ((float) this.method1882() - arg3) * var12) / 4096.0F + arg0;
        float var19 = (arg2 * var12 + ((float) this.method1882() - arg3) * var13) / 4096.0F + arg1;
        this.method3931(var14, var15, var16, var17, var18, var19, arg6, arg7, arg8);
    }

    @OriginalMember(owner = "client!ac", name = "a", descriptor = "(FFFFIILaa;II)V", line = 66)
    public final void method3936(float arg0, float arg1, float arg2, float arg3, int arg4, int arg5, class81 arg6, int arg7, int arg8) {
        if (arg4 == 0) {
            return;
        }
        double var10 = (double) (arg5 & 0xFFFF) * 9.587379924285257E-5D;
        float var12 = (float) Math.sin(var10) * (float) arg4;
        float var13 = (float) Math.cos(var10) * (float) arg4;
        float var14 = (-arg2 * var13 + -arg3 * var12) / 4096.0F + arg0;
        float var15 = (-arg3 * var13 + arg2 * var12) / 4096.0F + arg1;
        float var16 = (((float) this.method1892() - arg2) * var13 + -arg3 * var12) / 4096.0F + arg0;
        float var17 = (-((float) this.method1892() - arg2) * var12 + -arg3 * var13) / 4096.0F + arg1;
        float var18 = (-arg2 * var13 + ((float) this.method1882() - arg3) * var12) / 4096.0F + arg0;
        float var19 = (arg2 * var12 + ((float) this.method1882() - arg3) * var13) / 4096.0F + arg1;
        this.method3932(var14, var15, var16, var17, var18, var19, arg6, arg7, arg8);
    }

    @OriginalMember(owner = "client!ac", name = "b", descriptor = "(IIIIIII)V", line = 92)
    public final void method3937(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        this.method695(arg0, arg1, arg2, arg3, arg4, arg5, arg6, 1);
    }

    @OriginalMember(owner = "client!ac", name = "c", descriptor = "(IIII)V", line = 96)
    public final void method3938(int arg0, int arg1, int arg2, int arg3) {
        this.method1871(arg0, arg1, arg2, arg3, 1, 0, 1);
    }

    @OriginalMember(owner = "client!ac", name = "a", descriptor = "(FFFFFFILaa;II)V")
    public abstract void method1887(float arg0, float arg1, float arg2, float arg3, float arg4, float arg5, int arg6, class81 arg7, int arg8, int arg9);

    @OriginalMember(owner = "client!ac", name = "a", descriptor = "(IIIIIIII)V")
    public abstract void method695(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7);

    @OriginalMember(owner = "client!ac", name = "a", descriptor = "(IIIIII)V")
    public abstract void method688(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5);

    @OriginalMember(owner = "client!ac", name = "a", descriptor = "()I")
    public abstract int method1893();

    @OriginalMember(owner = "client!ac", name = "a", descriptor = "(FFFFFFIIII)V")
    public abstract void method1883(float arg0, float arg1, float arg2, float arg3, float arg4, float arg5, int arg6, int arg7, int arg8, int arg9);

    @OriginalMember(owner = "client!ac", name = "a", descriptor = "(IILaa;II)V")
    public abstract void method691(int arg0, int arg1, class81 arg2, int arg3, int arg4);

    @OriginalMember(owner = "client!ac", name = "b", descriptor = "()I")
    public abstract int method1882();

    @OriginalMember(owner = "client!ac", name = "a", descriptor = "(IIII)V")
    public abstract void method1874(int arg0, int arg1, int arg2, int arg3);

    @OriginalMember(owner = "client!ac", name = "a", descriptor = "(III)V")
    public abstract void method689(int arg0, int arg1, int arg2);

    @OriginalMember(owner = "client!ac", name = "c", descriptor = "()I")
    public abstract int method1895();

    @OriginalMember(owner = "client!ac", name = "d", descriptor = "()I")
    public abstract int method1892();

    @OriginalMember(owner = "client!ac", name = "a", descriptor = "(IIIIIII)V")
    public abstract void method1871(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6);

    @OriginalMember(owner = "client!ac", name = "a", descriptor = "(IIIII)V")
    public abstract void method690(int arg0, int arg1, int arg2, int arg3, int arg4);

    @OriginalMember(owner = "client!ac", name = "a", descriptor = "([I)V")
    public abstract void method1873(int[] arg0);
}
