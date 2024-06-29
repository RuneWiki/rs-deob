import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!pu")
public abstract class class772 implements class539 {

    @OriginalMember(owner = "client!pu", name = "a", descriptor = "(FFII)V", line = 5)
    public final void method4197(float arg0, float arg1, int arg2, int arg3) {
        this.method4201(arg0, arg1, (float) this.method623() / 2.0F, (float) this.method628() / 2.0F, arg2, arg3, 1, 0, 1);
    }

    @OriginalMember(owner = "client!pu", name = "b", descriptor = "(IIII)V", line = 9)
    public final void method4198(int arg0, int arg1, int arg2, int arg3) {
        this.method625(arg0, arg1, arg2, arg3, 1, 0, 1);
    }

    @OriginalMember(owner = "client!pu", name = "a", descriptor = "(IIIIIII)V", line = 13)
    public final void method4199(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        this.method618(arg0, arg1, arg2, arg3, arg4, arg5, arg6, 1);
    }

    @OriginalMember(owner = "client!pu", name = "a", descriptor = "(FFIIIII)V", line = 19)
    public final void method4200(float arg0, float arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        this.method4201(arg0, arg1, (float) this.method623() / 2.0F, (float) this.method628() / 2.0F, arg2, arg3, arg4, arg5, arg6);
    }

    @OriginalMember(owner = "client!pu", name = "a", descriptor = "(FFFFIIIII)V", line = 22)
    private final void method4201(float arg0, float arg1, float arg2, float arg3, int arg4, int arg5, int arg6, int arg7, int arg8) {
        if (arg4 == 0) {
            return;
        }
        double var10 = (double) (arg5 & 0xFFFF) * 9.587379924285257E-5D;
        float var12 = (float) Math.sin(var10) * (float) arg4;
        float var13 = (float) Math.cos(var10) * (float) arg4;
        float var14 = (-arg2 * var13 + -arg3 * var12) / 4096.0F + arg0;
        float var15 = (-arg3 * var13 + arg2 * var12) / 4096.0F + arg1;
        float var16 = (((float) this.method623() - arg2) * var13 + -arg3 * var12) / 4096.0F + arg0;
        float var17 = (-((float) this.method623() - arg2) * var12 + -arg3 * var13) / 4096.0F + arg1;
        float var18 = (-arg2 * var13 + ((float) this.method628() - arg3) * var12) / 4096.0F + arg0;
        float var19 = (arg2 * var12 + ((float) this.method628() - arg3) * var13) / 4096.0F + arg1;
        this.method4202(var14, var15, var16, var17, var18, var19, arg6, arg7, arg8);
    }

    @OriginalMember(owner = "client!pu", name = "a", descriptor = "(FFFFFFIII)V", line = 46)
    private final void method4202(float arg0, float arg1, float arg2, float arg3, float arg4, float arg5, int arg6, int arg7, int arg8) {
        this.method614(arg0, arg1, arg2, arg3, arg4, arg5, arg6, arg7, arg8, 1);
    }

    @OriginalMember(owner = "client!pu", name = "a", descriptor = "(II)V", line = 49)
    public final void method4203(int arg0, int arg1) {
        this.method616(arg0, arg1, 1, 0, 1);
    }

    @OriginalMember(owner = "client!pu", name = "a", descriptor = "(FFIILaa;II)V", line = 61)
    public final void method4204(float arg0, float arg1, int arg2, int arg3, class596 arg4, int arg5, int arg6) {
        this.method4207(arg0, arg1, (float) this.method623() / 2.0F, (float) this.method628() / 2.0F, arg2, arg3, arg4, arg5, arg6);
    }

    @OriginalMember(owner = "client!pu", name = "a", descriptor = "(FFFFFFLaa;II)V", line = 66)
    private final void method4205(float arg0, float arg1, float arg2, float arg3, float arg4, float arg5, class596 arg6, int arg7, int arg8) {
        this.method617(arg0, arg1, arg2, arg3, arg4, arg5, 1, arg6, arg7, arg8);
    }

    @OriginalMember(owner = "client!pu", name = "c", descriptor = "(IIII)V", line = 70)
    public final void method4206(int arg0, int arg1, int arg2, int arg3) {
        this.method618(arg0, arg1, arg2, arg3, 1, 0, 1, 1);
    }

    @OriginalMember(owner = "client!pu", name = "a", descriptor = "(FFFFIILaa;II)V", line = 73)
    public final void method4207(float arg0, float arg1, float arg2, float arg3, int arg4, int arg5, class596 arg6, int arg7, int arg8) {
        if (arg4 == 0) {
            return;
        }
        double var10 = (double) (arg5 & 0xFFFF) * 9.587379924285257E-5D;
        float var12 = (float) Math.sin(var10) * (float) arg4;
        float var13 = (float) Math.cos(var10) * (float) arg4;
        float var14 = (-arg2 * var13 + -arg3 * var12) / 4096.0F + arg0;
        float var15 = (-arg3 * var13 + arg2 * var12) / 4096.0F + arg1;
        float var16 = (((float) this.method623() - arg2) * var13 + -arg3 * var12) / 4096.0F + arg0;
        float var17 = (-((float) this.method623() - arg2) * var12 + -arg3 * var13) / 4096.0F + arg1;
        float var18 = (-arg2 * var13 + ((float) this.method628() - arg3) * var12) / 4096.0F + arg0;
        float var19 = (arg2 * var12 + ((float) this.method628() - arg3) * var13) / 4096.0F + arg1;
        this.method4205(var14, var15, var16, var17, var18, var19, arg6, arg7, arg8);
    }

    @OriginalMember(owner = "client!pu", name = "a", descriptor = "(IIII)V")
    public abstract void method626(int arg0, int arg1, int arg2, int arg3);

    @OriginalMember(owner = "client!pu", name = "a", descriptor = "(IIIII)V")
    public abstract void method616(int arg0, int arg1, int arg2, int arg3, int arg4);

    @OriginalMember(owner = "client!pu", name = "a", descriptor = "(IILaa;II)V")
    public abstract void method621(int arg0, int arg1, class596 arg2, int arg3, int arg4);

    @OriginalMember(owner = "client!pu", name = "a", descriptor = "()I")
    public abstract int method612();

    @OriginalMember(owner = "client!pu", name = "a", descriptor = "(FFFFFFIIII)V")
    public abstract void method614(float arg0, float arg1, float arg2, float arg3, float arg4, float arg5, int arg6, int arg7, int arg8, int arg9);

    @OriginalMember(owner = "client!pu", name = "a", descriptor = "(IIIIII)V")
    public abstract void method622(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5);

    @OriginalMember(owner = "client!pu", name = "a", descriptor = "([I)V")
    public abstract void method615(int[] arg0);

    @OriginalMember(owner = "client!pu", name = "a", descriptor = "(III)V")
    public abstract void method627(int arg0, int arg1, int arg2);

    @OriginalMember(owner = "client!pu", name = "a", descriptor = "(FFFFFFILaa;II)V")
    public abstract void method617(float arg0, float arg1, float arg2, float arg3, float arg4, float arg5, int arg6, class596 arg7, int arg8, int arg9);

    @OriginalMember(owner = "client!pu", name = "b", descriptor = "()I")
    public abstract int method620();

    @OriginalMember(owner = "client!pu", name = "c", descriptor = "()I")
    public abstract int method623();

    @OriginalMember(owner = "client!pu", name = "b", descriptor = "(IIIIIII)V")
    public abstract void method625(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6);

    @OriginalMember(owner = "client!pu", name = "a", descriptor = "(IIIIIIII)V")
    public abstract void method618(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7);

    @OriginalMember(owner = "client!pu", name = "d", descriptor = "()I")
    public abstract int method628();
}
