import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!iea")
public abstract class class481 implements class492 {

    @OriginalMember(owner = "client!iea", name = "a", descriptor = "(FFIIIII)V", line = 7)
    public final void method2758(float arg0, float arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        this.method2764(arg0, arg1, (float) this.method142() / 2.0F, (float) this.method149() / 2.0F, arg2, arg3, arg4, arg5, arg6);
    }

    @OriginalMember(owner = "client!iea", name = "a", descriptor = "(II)V", line = 12)
    public final void method2759(int arg0, int arg1) {
        this.method148(arg0, arg1, 1, 0, 1);
    }

    @OriginalMember(owner = "client!iea", name = "b", descriptor = "(IIII)V", line = 18)
    public final void method2760(int arg0, int arg1, int arg2, int arg3) {
        this.method151(arg0, arg1, arg2, arg3, 1, 0, 1, 1);
    }

    @OriginalMember(owner = "client!iea", name = "a", descriptor = "(IIIIIII)V", line = 23)
    public final void method2761(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        this.method151(arg0, arg1, arg2, arg3, arg4, arg5, arg6, 1);
    }

    @OriginalMember(owner = "client!iea", name = "a", descriptor = "(FFFFFFLaa;II)V", line = 26)
    private final void method2762(float arg0, float arg1, float arg2, float arg3, float arg4, float arg5, class489 arg6, int arg7, int arg8) {
        this.method146(arg0, arg1, arg2, arg3, arg4, arg5, 1, arg6, arg7, arg8);
    }

    @OriginalMember(owner = "client!iea", name = "a", descriptor = "(FFFFIILaa;II)V", line = 34)
    public final void method2763(float arg0, float arg1, float arg2, float arg3, int arg4, int arg5, class489 arg6, int arg7, int arg8) {
        if (arg4 == 0) {
            return;
        }
        double var10 = (double) (arg5 & 0xFFFF) * 9.587379924285257E-5D;
        float var12 = (float) Math.sin(var10) * (float) arg4;
        float var13 = (float) Math.cos(var10) * (float) arg4;
        float var14 = (-arg2 * var13 + -arg3 * var12) / 4096.0F + arg0;
        float var15 = (-arg3 * var13 + arg2 * var12) / 4096.0F + arg1;
        float var16 = (((float) this.method142() - arg2) * var13 + -arg3 * var12) / 4096.0F + arg0;
        float var17 = (-((float) this.method142() - arg2) * var12 + -arg3 * var13) / 4096.0F + arg1;
        float var18 = (-arg2 * var13 + ((float) this.method149() - arg3) * var12) / 4096.0F + arg0;
        float var19 = (arg2 * var12 + ((float) this.method149() - arg3) * var13) / 4096.0F + arg1;
        this.method2762(var14, var15, var16, var17, var18, var19, arg6, arg7, arg8);
    }

    @OriginalMember(owner = "client!iea", name = "a", descriptor = "(FFFFIIIII)V", line = 59)
    private final void method2764(float arg0, float arg1, float arg2, float arg3, int arg4, int arg5, int arg6, int arg7, int arg8) {
        if (arg4 == 0) {
            return;
        }
        double var10 = (double) (arg5 & 0xFFFF) * 9.587379924285257E-5D;
        float var12 = (float) Math.sin(var10) * (float) arg4;
        float var13 = (float) Math.cos(var10) * (float) arg4;
        float var14 = (-arg2 * var13 + -arg3 * var12) / 4096.0F + arg0;
        float var15 = (-arg3 * var13 + arg2 * var12) / 4096.0F + arg1;
        float var16 = (((float) this.method142() - arg2) * var13 + -arg3 * var12) / 4096.0F + arg0;
        float var17 = (-((float) this.method142() - arg2) * var12 + -arg3 * var13) / 4096.0F + arg1;
        float var18 = (-arg2 * var13 + ((float) this.method149() - arg3) * var12) / 4096.0F + arg0;
        float var19 = (arg2 * var12 + ((float) this.method149() - arg3) * var13) / 4096.0F + arg1;
        this.method2768(var14, var15, var16, var17, var18, var19, arg6, arg7, arg8);
    }

    @OriginalMember(owner = "client!iea", name = "a", descriptor = "(FFII)V", line = 85)
    public final void method2765(float arg0, float arg1, int arg2, int arg3) {
        this.method2764(arg0, arg1, (float) this.method142() / 2.0F, (float) this.method149() / 2.0F, arg2, arg3, 1, 0, 1);
    }

    @OriginalMember(owner = "client!iea", name = "c", descriptor = "(IIII)V", line = 88)
    public final void method2766(int arg0, int arg1, int arg2, int arg3) {
        this.method138(arg0, arg1, arg2, arg3, 1, 0, 1);
    }

    @OriginalMember(owner = "client!iea", name = "a", descriptor = "(FFIILaa;II)V", line = 91)
    public final void method2767(float arg0, float arg1, int arg2, int arg3, class489 arg4, int arg5, int arg6) {
        this.method2763(arg0, arg1, (float) this.method142() / 2.0F, (float) this.method149() / 2.0F, arg2, arg3, arg4, arg5, arg6);
    }

    @OriginalMember(owner = "client!iea", name = "a", descriptor = "(FFFFFFIII)V", line = 96)
    private final void method2768(float arg0, float arg1, float arg2, float arg3, float arg4, float arg5, int arg6, int arg7, int arg8) {
        this.method150(arg0, arg1, arg2, arg3, arg4, arg5, arg6, arg7, arg8, 1);
    }

    @OriginalMember(owner = "client!iea", name = "a", descriptor = "()I")
    public abstract int method142();

    @OriginalMember(owner = "client!iea", name = "b", descriptor = "()I")
    public abstract int method144();

    @OriginalMember(owner = "client!iea", name = "a", descriptor = "(FFFFFFIIII)V")
    public abstract void method150(float arg0, float arg1, float arg2, float arg3, float arg4, float arg5, int arg6, int arg7, int arg8, int arg9);

    @OriginalMember(owner = "client!iea", name = "a", descriptor = "(IIII)V")
    public abstract void method147(int arg0, int arg1, int arg2, int arg3);

    @OriginalMember(owner = "client!iea", name = "a", descriptor = "(III)V")
    public abstract void method145(int arg0, int arg1, int arg2);

    @OriginalMember(owner = "client!iea", name = "a", descriptor = "(IIIII)V")
    public abstract void method148(int arg0, int arg1, int arg2, int arg3, int arg4);

    @OriginalMember(owner = "client!iea", name = "a", descriptor = "([I)V")
    public abstract void method152(int[] arg0);

    @OriginalMember(owner = "client!iea", name = "a", descriptor = "(FFFFFFILaa;II)V")
    public abstract void method146(float arg0, float arg1, float arg2, float arg3, float arg4, float arg5, int arg6, class489 arg7, int arg8, int arg9);

    @OriginalMember(owner = "client!iea", name = "c", descriptor = "()I")
    public abstract int method143();

    @OriginalMember(owner = "client!iea", name = "a", descriptor = "(IIIIII)V")
    public abstract void method154(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5);

    @OriginalMember(owner = "client!iea", name = "a", descriptor = "(IIIIIIII)V")
    public abstract void method151(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7);

    @OriginalMember(owner = "client!iea", name = "a", descriptor = "(IILaa;II)V")
    public abstract void method140(int arg0, int arg1, class489 arg2, int arg3, int arg4);

    @OriginalMember(owner = "client!iea", name = "d", descriptor = "()I")
    public abstract int method149();

    @OriginalMember(owner = "client!iea", name = "b", descriptor = "(IIIIIII)V")
    public abstract void method138(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6);
}
