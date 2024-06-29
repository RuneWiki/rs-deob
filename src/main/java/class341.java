import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!aa")
public abstract class class341 {

    @OriginalMember(owner = "client!aa", name = "V", descriptor = "()I")
    public abstract int method305();

    @OriginalMember(owner = "client!aa", name = "ta", descriptor = "(FFFFFFIII)V")
    public abstract void method292(float arg0, float arg1, float arg2, float arg3, float arg4, float arg5, int arg6, int arg7, int arg8);

    @OriginalMember(owner = "client!aa", name = "E", descriptor = "(IIIII)V")
    public abstract void method297(int arg0, int arg1, int arg2, int arg3, int arg4);

    @OriginalMember(owner = "client!aa", name = "a", descriptor = "(IIII)V")
    public final void method2200(int arg0, int arg1, int arg2, int arg3) {
        this.method298(arg0, arg1, arg2, arg3, 1, 0, 1);
    }

    @OriginalMember(owner = "client!aa", name = "a", descriptor = "(II)V")
    public final void method2201(int arg0, int arg1) {
        this.method297(arg0, arg1, 1, 0, 1);
    }

    @OriginalMember(owner = "client!aa", name = "a", descriptor = "(FFIILi;II)V")
    public final void method2202(float arg0, float arg1, int arg2, int arg3, class30 arg4, int arg5, int arg6) {
        this.method2207(arg0, arg1, (float) this.method302() / 2.0F, (float) this.method306() / 2.0F, arg2, arg3, arg4, arg5, arg6);
    }

    @OriginalMember(owner = "client!aa", name = "a", descriptor = "(FFFFIIIII)V")
    private final void method2203(float arg0, float arg1, float arg2, float arg3, int arg4, int arg5, int arg6, int arg7, int arg8) {
        if (arg4 == 0) {
            return;
        }
        double var10 = (double) (arg5 & 0xFFFF) * 9.587379924285257E-5D;
        float var12 = (float) Math.sin(var10) * (float) arg4;
        float var13 = (float) Math.cos(var10) * (float) arg4;
        float var14 = (-arg2 * var13 + -arg3 * var12) / 4096.0F + arg0;
        float var15 = (-arg3 * var13 + arg2 * var12) / 4096.0F + arg1;
        float var16 = (((float) this.method302() - arg2) * var13 + -arg3 * var12) / 4096.0F + arg0;
        float var17 = (-((float) this.method302() - arg2) * var12 + -arg3 * var13) / 4096.0F + arg1;
        float var18 = (-arg2 * var13 + ((float) this.method306() - arg3) * var12) / 4096.0F + arg0;
        float var19 = (arg2 * var12 + ((float) this.method306() - arg3) * var13) / 4096.0F + arg1;
        this.method292(var14, var15, var16, var17, var18, var19, arg6, arg7, arg8);
    }

    @OriginalMember(owner = "client!aa", name = "D", descriptor = "(IIIIII)V")
    public abstract void method290(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5);

    @OriginalMember(owner = "client!aa", name = "l", descriptor = "(IIII)V")
    public abstract void method294(int arg0, int arg1, int arg2, int arg3);

    @OriginalMember(owner = "client!aa", name = "a", descriptor = "(FFII)V")
    public final void method2204(float arg0, float arg1, int arg2, int arg3) {
        this.method2203(arg0, arg1, (float) this.method302() / 2.0F, (float) this.method306() / 2.0F, arg2, arg3, 1, 0, 1);
    }

    @OriginalMember(owner = "client!aa", name = "J", descriptor = "(III)V")
    public abstract void method307(int arg0, int arg1, int arg2);

    @OriginalMember(owner = "client!aa", name = "d", descriptor = "()I")
    public abstract int method302();

    @OriginalMember(owner = "client!aa", name = "PA", descriptor = "(IIIIIII)V")
    public abstract void method298(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6);

    @OriginalMember(owner = "client!aa", name = "a", descriptor = "(IILi;II)V")
    public abstract void method303(int arg0, int arg1, class30 arg2, int arg3, int arg4);

    @OriginalMember(owner = "client!aa", name = "ga", descriptor = "()I")
    public abstract int method306();

    @OriginalMember(owner = "client!aa", name = "TA", descriptor = "()I")
    public abstract int method296();

    @OriginalMember(owner = "client!aa", name = "a", descriptor = "(FFIIIII)V")
    public final void method2205(float arg0, float arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        this.method2203(arg0, arg1, (float) this.method302() / 2.0F, (float) this.method306() / 2.0F, arg2, arg3, arg4, arg5, arg6);
    }

    @OriginalMember(owner = "client!aa", name = "b", descriptor = "(IIII)V")
    public final void method2206(int arg0, int arg1, int arg2, int arg3) {
        this.method291(arg0, arg1, arg2, arg3, 1, 0, 1);
    }

    @OriginalMember(owner = "client!aa", name = "a", descriptor = "(FFFFFFLi;II)V")
    public abstract void method300(float arg0, float arg1, float arg2, float arg3, float arg4, float arg5, class30 arg6, int arg7, int arg8);

    @OriginalMember(owner = "client!aa", name = "XA", descriptor = "(IIIIIII)V")
    public abstract void method291(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6);

    @OriginalMember(owner = "client!aa", name = "a", descriptor = "(FFFFIILi;II)V")
    public final void method2207(float arg0, float arg1, float arg2, float arg3, int arg4, int arg5, class30 arg6, int arg7, int arg8) {
        if (arg4 == 0) {
            return;
        }
        double var10 = (double) (arg5 & 0xFFFF) * 9.587379924285257E-5D;
        float var12 = (float) Math.sin(var10) * (float) arg4;
        float var13 = (float) Math.cos(var10) * (float) arg4;
        float var14 = (-arg2 * var13 + -arg3 * var12) / 4096.0F + arg0;
        float var15 = (-arg3 * var13 + arg2 * var12) / 4096.0F + arg1;
        float var16 = (((float) this.method302() - arg2) * var13 + -arg3 * var12) / 4096.0F + arg0;
        float var17 = (-((float) this.method302() - arg2) * var12 + -arg3 * var13) / 4096.0F + arg1;
        float var18 = (-arg2 * var13 + ((float) this.method306() - arg3) * var12) / 4096.0F + arg0;
        float var19 = (arg2 * var12 + ((float) this.method306() - arg3) * var13) / 4096.0F + arg1;
        this.method300(var14, var15, var16, var17, var18, var19, arg6, arg7, arg8);
    }
}
