import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!vr")
public abstract class class147 implements class390 {

    @OriginalMember(owner = "client!vr", name = "a", descriptor = "(IIIIIII)V")
    public abstract void method1095(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6);

    @OriginalMember(owner = "client!vr", name = "a", descriptor = "(III)V")
    public abstract void method1081(int arg0, int arg1, int arg2);

    @OriginalMember(owner = "client!vr", name = "a", descriptor = "(IIIII)V")
    public abstract void method1086(int arg0, int arg1, int arg2, int arg3, int arg4);

    @OriginalMember(owner = "client!vr", name = "a", descriptor = "()I")
    public abstract int method1096();

    @OriginalMember(owner = "client!vr", name = "a", descriptor = "(FFIIIII)V")
    public final void method1097(float arg0, float arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        this.method1114(arg0, arg1, (float) this.method1096() / 2.0F, (float) this.method1106() / 2.0F, arg2, arg3, arg4, arg5, arg6);
    }

    @OriginalMember(owner = "client!vr", name = "a", descriptor = "(IILaa;II)V")
    public abstract void method1084(int arg0, int arg1, class514 arg2, int arg3, int arg4);

    @OriginalMember(owner = "client!vr", name = "a", descriptor = "(FFFFFFIIII)V")
    public abstract void method1098(float arg0, float arg1, float arg2, float arg3, float arg4, float arg5, int arg6, int arg7, int arg8, int arg9);

    @OriginalMember(owner = "client!vr", name = "a", descriptor = "(FFIILaa;II)V")
    public final void method1099(float arg0, float arg1, int arg2, int arg3, class514 arg4, int arg5, int arg6) {
        this.method1103(arg0, arg1, (float) this.method1096() / 2.0F, (float) this.method1106() / 2.0F, arg2, arg3, arg4, arg5, arg6);
    }

    @OriginalMember(owner = "client!vr", name = "a", descriptor = "(FFFFFFILaa;II)V")
    public abstract void method1100(float arg0, float arg1, float arg2, float arg3, float arg4, float arg5, int arg6, class514 arg7, int arg8, int arg9);

    @OriginalMember(owner = "client!vr", name = "a", descriptor = "(IIII)V")
    public final void method1101(int arg0, int arg1, int arg2, int arg3) {
        this.method1079(arg0, arg1, arg2, arg3, 1, 0, 1, 1);
    }

    @OriginalMember(owner = "client!vr", name = "a", descriptor = "(IIIIIIII)V")
    public abstract void method1079(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7);

    @OriginalMember(owner = "client!vr", name = "a", descriptor = "(IIIIII)V")
    public abstract void method1082(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5);

    @OriginalMember(owner = "client!vr", name = "a", descriptor = "(II)V")
    public final void method1102(int arg0, int arg1) {
        this.method1086(arg0, arg1, 1, 0, 1);
    }

    @OriginalMember(owner = "client!vr", name = "a", descriptor = "(FFFFIILaa;II)V")
    public final void method1103(float arg0, float arg1, float arg2, float arg3, int arg4, int arg5, class514 arg6, int arg7, int arg8) {
        if (arg4 == 0) {
            return;
        }
        double var10 = (double) (arg5 & 0xFFFF) * 9.587379924285257E-5D;
        float var12 = (float) Math.sin(var10) * (float) arg4;
        float var13 = (float) Math.cos(var10) * (float) arg4;
        float var14 = (-arg2 * var13 + -arg3 * var12) / 4096.0F + arg0;
        float var15 = (-arg3 * var13 + arg2 * var12) / 4096.0F + arg1;
        float var16 = (((float) this.method1096() - arg2) * var13 + -arg3 * var12) / 4096.0F + arg0;
        float var17 = (-((float) this.method1096() - arg2) * var12 + -arg3 * var13) / 4096.0F + arg1;
        float var18 = (-arg2 * var13 + ((float) this.method1106() - arg3) * var12) / 4096.0F + arg0;
        float var19 = (arg2 * var12 + ((float) this.method1106() - arg3) * var13) / 4096.0F + arg1;
        this.method1113(var14, var15, var16, var17, var18, var19, arg6, arg7, arg8);
    }

    @OriginalMember(owner = "client!vr", name = "b", descriptor = "(IIIIIII)V")
    public final void method1104(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        this.method1079(arg0, arg1, arg2, arg3, arg4, arg5, arg6, 1);
    }

    @OriginalMember(owner = "client!vr", name = "a", descriptor = "([I)V")
    public abstract void method1105(int[] arg0);

    @OriginalMember(owner = "client!vr", name = "b", descriptor = "()I")
    public abstract int method1106();

    @OriginalMember(owner = "client!vr", name = "c", descriptor = "()I")
    public abstract int method1107();

    @OriginalMember(owner = "client!vr", name = "a", descriptor = "(FFFFFFIII)V")
    private final void method1108(float arg0, float arg1, float arg2, float arg3, float arg4, float arg5, int arg6, int arg7, int arg8) {
        this.method1098(arg0, arg1, arg2, arg3, arg4, arg5, arg6, arg7, arg8, 1);
    }

    @OriginalMember(owner = "client!vr", name = "a", descriptor = "(FFII)V")
    public final void method1109(float arg0, float arg1, int arg2, int arg3) {
        this.method1114(arg0, arg1, (float) this.method1096() / 2.0F, (float) this.method1106() / 2.0F, arg2, arg3, 1, 0, 1);
    }

    @OriginalMember(owner = "client!vr", name = "d", descriptor = "()I")
    public abstract int method1110();

    @OriginalMember(owner = "client!vr", name = "b", descriptor = "(IIII)V")
    public final void method1111(int arg0, int arg1, int arg2, int arg3) {
        this.method1095(arg0, arg1, arg2, arg3, 1, 0, 1);
    }

    @OriginalMember(owner = "client!vr", name = "c", descriptor = "(IIII)V")
    public abstract void method1112(int arg0, int arg1, int arg2, int arg3);

    @OriginalMember(owner = "client!vr", name = "a", descriptor = "(FFFFFFLaa;II)V")
    private final void method1113(float arg0, float arg1, float arg2, float arg3, float arg4, float arg5, class514 arg6, int arg7, int arg8) {
        this.method1100(arg0, arg1, arg2, arg3, arg4, arg5, 1, arg6, arg7, arg8);
    }

    @OriginalMember(owner = "client!vr", name = "a", descriptor = "(FFFFIIIII)V")
    private final void method1114(float arg0, float arg1, float arg2, float arg3, int arg4, int arg5, int arg6, int arg7, int arg8) {
        if (arg4 == 0) {
            return;
        }
        double var10 = (double) (arg5 & 0xFFFF) * 9.587379924285257E-5D;
        float var12 = (float) Math.sin(var10) * (float) arg4;
        float var13 = (float) Math.cos(var10) * (float) arg4;
        float var14 = (-arg2 * var13 + -arg3 * var12) / 4096.0F + arg0;
        float var15 = (-arg3 * var13 + arg2 * var12) / 4096.0F + arg1;
        float var16 = (((float) this.method1096() - arg2) * var13 + -arg3 * var12) / 4096.0F + arg0;
        float var17 = (-((float) this.method1096() - arg2) * var12 + -arg3 * var13) / 4096.0F + arg1;
        float var18 = (-arg2 * var13 + ((float) this.method1106() - arg3) * var12) / 4096.0F + arg0;
        float var19 = (arg2 * var12 + ((float) this.method1106() - arg3) * var13) / 4096.0F + arg1;
        this.method1108(var14, var15, var16, var17, var18, var19, arg6, arg7, arg8);
    }
}
