import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!kr")
public abstract class class743 implements class185 {

    @OriginalMember(owner = "client!kr", name = "a", descriptor = "(FFIILaa;II)V", line = 3)
    public final void method4133(float arg0, float arg1, int arg2, int arg3, class484 arg4, int arg5, int arg6) {
        this.method4140(arg0, arg1, (float) this.method82() / 2.0F, (float) this.method83() / 2.0F, arg2, arg3, arg4, arg5, arg6);
    }

    @OriginalMember(owner = "client!kr", name = "a", descriptor = "(FFII)V", line = 10)
    public final void method4134(float arg0, float arg1, int arg2, int arg3) {
        this.method4142(arg0, arg1, (float) this.method82() / 2.0F, (float) this.method83() / 2.0F, arg2, arg3, 1, 0, 1);
    }

    @OriginalMember(owner = "client!kr", name = "a", descriptor = "(II)V", line = 18)
    public final void method4135(int arg0, int arg1) {
        this.method86(arg0, arg1, 1, 0, 1);
    }

    @OriginalMember(owner = "client!kr", name = "a", descriptor = "(IIII)V", line = 21)
    public final void method4136(int arg0, int arg1, int arg2, int arg3) {
        this.method85(arg0, arg1, arg2, arg3, 1, 0, 1, 1);
    }

    @OriginalMember(owner = "client!kr", name = "b", descriptor = "(IIII)V", line = 24)
    public final void method4137(int arg0, int arg1, int arg2, int arg3) {
        this.method91(arg0, arg1, arg2, arg3, 1, 0, 1);
    }

    @OriginalMember(owner = "client!kr", name = "a", descriptor = "(FFFFFFIII)V", line = 30)
    private final void method4138(float arg0, float arg1, float arg2, float arg3, float arg4, float arg5, int arg6, int arg7, int arg8) {
        this.method96(arg0, arg1, arg2, arg3, arg4, arg5, arg6, arg7, arg8, 1);
    }

    @OriginalMember(owner = "client!kr", name = "a", descriptor = "(FFFFFFLaa;II)V", line = 33)
    private final void method4139(float arg0, float arg1, float arg2, float arg3, float arg4, float arg5, class484 arg6, int arg7, int arg8) {
        this.method92(arg0, arg1, arg2, arg3, arg4, arg5, 1, arg6, arg7, arg8);
    }

    @OriginalMember(owner = "client!kr", name = "a", descriptor = "(FFFFIILaa;II)V", line = 39)
    public final void method4140(float arg0, float arg1, float arg2, float arg3, int arg4, int arg5, class484 arg6, int arg7, int arg8) {
        if (arg4 == 0) {
            return;
        }
        double var10 = (double) (arg5 & 0xFFFF) * 9.587379924285257E-5D;
        float var12 = (float) Math.sin(var10) * (float) arg4;
        float var13 = (float) Math.cos(var10) * (float) arg4;
        float var14 = (-arg2 * var13 + -arg3 * var12) / 4096.0F + arg0;
        float var15 = (-arg3 * var13 + arg2 * var12) / 4096.0F + arg1;
        float var16 = (((float) this.method82() - arg2) * var13 + -arg3 * var12) / 4096.0F + arg0;
        float var17 = (-((float) this.method82() - arg2) * var12 + -arg3 * var13) / 4096.0F + arg1;
        float var18 = (-arg2 * var13 + ((float) this.method83() - arg3) * var12) / 4096.0F + arg0;
        float var19 = (arg2 * var12 + ((float) this.method83() - arg3) * var13) / 4096.0F + arg1;
        this.method4139(var14, var15, var16, var17, var18, var19, arg6, arg7, arg8);
    }

    @OriginalMember(owner = "client!kr", name = "a", descriptor = "(FFIIIII)V", line = 66)
    public final void method4141(float arg0, float arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        this.method4142(arg0, arg1, (float) this.method82() / 2.0F, (float) this.method83() / 2.0F, arg2, arg3, arg4, arg5, arg6);
    }

    @OriginalMember(owner = "client!kr", name = "a", descriptor = "(FFFFIIIII)V", line = 69)
    private final void method4142(float arg0, float arg1, float arg2, float arg3, int arg4, int arg5, int arg6, int arg7, int arg8) {
        if (arg4 == 0) {
            return;
        }
        double var10 = (double) (arg5 & 0xFFFF) * 9.587379924285257E-5D;
        float var12 = (float) Math.sin(var10) * (float) arg4;
        float var13 = (float) Math.cos(var10) * (float) arg4;
        float var14 = (-arg2 * var13 + -arg3 * var12) / 4096.0F + arg0;
        float var15 = (-arg3 * var13 + arg2 * var12) / 4096.0F + arg1;
        float var16 = (((float) this.method82() - arg2) * var13 + -arg3 * var12) / 4096.0F + arg0;
        float var17 = (-((float) this.method82() - arg2) * var12 + -arg3 * var13) / 4096.0F + arg1;
        float var18 = (-arg2 * var13 + ((float) this.method83() - arg3) * var12) / 4096.0F + arg0;
        float var19 = (arg2 * var12 + ((float) this.method83() - arg3) * var13) / 4096.0F + arg1;
        this.method4138(var14, var15, var16, var17, var18, var19, arg6, arg7, arg8);
    }

    @OriginalMember(owner = "client!kr", name = "b", descriptor = "(IIIIIII)V", line = 94)
    public final void method4143(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        this.method85(arg0, arg1, arg2, arg3, arg4, arg5, arg6, 1);
    }

    @OriginalMember(owner = "client!kr", name = "a", descriptor = "(IILaa;II)V")
    public abstract void method90(int arg0, int arg1, class484 arg2, int arg3, int arg4);

    @OriginalMember(owner = "client!kr", name = "a", descriptor = "()I")
    public abstract int method83();

    @OriginalMember(owner = "client!kr", name = "a", descriptor = "(IIIIIII)V")
    public abstract void method91(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6);

    @OriginalMember(owner = "client!kr", name = "b", descriptor = "()I")
    public abstract int method93();

    @OriginalMember(owner = "client!kr", name = "a", descriptor = "(IIIIIIII)V")
    public abstract void method85(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7);

    @OriginalMember(owner = "client!kr", name = "a", descriptor = "(IIIII)V")
    public abstract void method86(int arg0, int arg1, int arg2, int arg3, int arg4);

    @OriginalMember(owner = "client!kr", name = "a", descriptor = "(III)V")
    public abstract void method81(int arg0, int arg1, int arg2);

    @OriginalMember(owner = "client!kr", name = "c", descriptor = "()I")
    public abstract int method82();

    @OriginalMember(owner = "client!kr", name = "a", descriptor = "(FFFFFFILaa;II)V")
    public abstract void method92(float arg0, float arg1, float arg2, float arg3, float arg4, float arg5, int arg6, class484 arg7, int arg8, int arg9);

    @OriginalMember(owner = "client!kr", name = "a", descriptor = "(FFFFFFIIII)V")
    public abstract void method96(float arg0, float arg1, float arg2, float arg3, float arg4, float arg5, int arg6, int arg7, int arg8, int arg9);

    @OriginalMember(owner = "client!kr", name = "c", descriptor = "(IIII)V")
    public abstract void method87(int arg0, int arg1, int arg2, int arg3);

    @OriginalMember(owner = "client!kr", name = "d", descriptor = "()I")
    public abstract int method95();

    @OriginalMember(owner = "client!kr", name = "a", descriptor = "(IIIIII)V")
    public abstract void method88(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5);
}
