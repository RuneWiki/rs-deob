import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!f")
public abstract class class702 {

    @OriginalMember(owner = "client!f", name = "a", descriptor = "(IIIIIII)V")
    public final void method3954(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        this.method1074(arg0, arg1, arg2, arg3, arg4, arg5, arg6, 1);
    }

    @OriginalMember(owner = "client!f", name = "a", descriptor = "(FFFFFFIII)V")
    private final void method3955(float arg0, float arg1, float arg2, float arg3, float arg4, float arg5, int arg6, int arg7, int arg8) {
        this.method1084(arg0, arg1, arg2, arg3, arg4, arg5, arg6, arg7, arg8, 1);
    }

    @OriginalMember(owner = "client!f", name = "a", descriptor = "(FFFFFFILua;II)V")
    public abstract void method1088(float arg0, float arg1, float arg2, float arg3, float arg4, float arg5, int arg6, class617 arg7, int arg8, int arg9);

    @OriginalMember(owner = "client!f", name = "a", descriptor = "(IILua;II)V")
    public abstract void method1080(int arg0, int arg1, class617 arg2, int arg3, int arg4);

    @OriginalMember(owner = "client!f", name = "qa", descriptor = "(FFFFFFIIII)V")
    public abstract void method1084(float arg0, float arg1, float arg2, float arg3, float arg4, float arg5, int arg6, int arg7, int arg8, int arg9);

    @OriginalMember(owner = "client!f", name = "a", descriptor = "(IIII)V")
    public final void method3956(int arg0, int arg1, int arg2, int arg3) {
        this.method1087(arg0, arg1, arg2, arg3, 1, 0, 1);
    }

    @OriginalMember(owner = "client!f", name = "xa", descriptor = "(III)V")
    public abstract void method1077(int arg0, int arg1, int arg2);

    @OriginalMember(owner = "client!f", name = "a", descriptor = "(FFFFIILua;II)V")
    public final void method3957(float arg0, float arg1, float arg2, float arg3, int arg4, int arg5, class617 arg6, int arg7, int arg8) {
        if (arg4 == 0) {
            return;
        }
        double var10 = (double) (arg5 & 0xFFFF) * 9.587379924285257E-5D;
        float var12 = (float) Math.sin(var10) * (float) arg4;
        float var13 = (float) Math.cos(var10) * (float) arg4;
        float var14 = (-arg2 * var13 + -arg3 * var12) / 4096.0F + arg0;
        float var15 = (-arg3 * var13 + arg2 * var12) / 4096.0F + arg1;
        float var16 = (((float) this.method1076() - arg2) * var13 + -arg3 * var12) / 4096.0F + arg0;
        float var17 = (-((float) this.method1076() - arg2) * var12 + -arg3 * var13) / 4096.0F + arg1;
        float var18 = (-arg2 * var13 + ((float) this.method1079() - arg3) * var12) / 4096.0F + arg0;
        float var19 = (arg2 * var12 + ((float) this.method1079() - arg3) * var13) / 4096.0F + arg1;
        this.method3962(var14, var15, var16, var17, var18, var19, arg6, arg7, arg8);
    }

    @OriginalMember(owner = "client!f", name = "DA", descriptor = "(IIIIIII)V")
    public abstract void method1087(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6);

    @OriginalMember(owner = "client!f", name = "b", descriptor = "(IIII)V")
    public final void method3958(int arg0, int arg1, int arg2, int arg3) {
        this.method1074(arg0, arg1, arg2, arg3, 1, 0, 1, 1);
    }

    @OriginalMember(owner = "client!f", name = "u", descriptor = "()I")
    public abstract int method1075();

    @OriginalMember(owner = "client!f", name = "YA", descriptor = "(IIIIIIII)V")
    public abstract void method1074(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7);

    @OriginalMember(owner = "client!f", name = "a", descriptor = "(FFIIIII)V")
    public final void method3959(float arg0, float arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        this.method3961(arg0, arg1, (float) this.method1076() / 2.0F, (float) this.method1079() / 2.0F, arg2, arg3, arg4, arg5, arg6);
    }

    @OriginalMember(owner = "client!f", name = "Q", descriptor = "(IIII)V")
    public abstract void method1085(int arg0, int arg1, int arg2, int arg3);

    @OriginalMember(owner = "client!f", name = "a", descriptor = "(II)V")
    public final void method3960(int arg0, int arg1) {
        this.method1086(arg0, arg1, 1, 0, 1);
    }

    @OriginalMember(owner = "client!f", name = "da", descriptor = "(IIIIII)V")
    public abstract void method1081(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5);

    @OriginalMember(owner = "client!f", name = "A", descriptor = "()I")
    public abstract int method1076();

    @OriginalMember(owner = "client!f", name = "a", descriptor = "(FFFFIIIII)V")
    private final void method3961(float arg0, float arg1, float arg2, float arg3, int arg4, int arg5, int arg6, int arg7, int arg8) {
        if (arg4 == 0) {
            return;
        }
        double var10 = (double) (arg5 & 0xFFFF) * 9.587379924285257E-5D;
        float var12 = (float) Math.sin(var10) * (float) arg4;
        float var13 = (float) Math.cos(var10) * (float) arg4;
        float var14 = (-arg2 * var13 + -arg3 * var12) / 4096.0F + arg0;
        float var15 = (-arg3 * var13 + arg2 * var12) / 4096.0F + arg1;
        float var16 = (((float) this.method1076() - arg2) * var13 + -arg3 * var12) / 4096.0F + arg0;
        float var17 = (-((float) this.method1076() - arg2) * var12 + -arg3 * var13) / 4096.0F + arg1;
        float var18 = (-arg2 * var13 + ((float) this.method1079() - arg3) * var12) / 4096.0F + arg0;
        float var19 = (arg2 * var12 + ((float) this.method1079() - arg3) * var13) / 4096.0F + arg1;
        this.method3955(var14, var15, var16, var17, var18, var19, arg6, arg7, arg8);
    }

    @OriginalMember(owner = "client!f", name = "ca", descriptor = "()I")
    public abstract int method1079();

    @OriginalMember(owner = "client!f", name = "a", descriptor = "(FFFFFFLua;II)V")
    private final void method3962(float arg0, float arg1, float arg2, float arg3, float arg4, float arg5, class617 arg6, int arg7, int arg8) {
        this.method1088(arg0, arg1, arg2, arg3, arg4, arg5, 1, arg6, arg7, arg8);
    }

    @OriginalMember(owner = "client!f", name = "a", descriptor = "(FFII)V")
    public final void method3963(float arg0, float arg1, int arg2, int arg3) {
        this.method3961(arg0, arg1, (float) this.method1076() / 2.0F, (float) this.method1079() / 2.0F, arg2, arg3, 1, 0, 1);
    }

    @OriginalMember(owner = "client!f", name = "a", descriptor = "(FFIILua;II)V")
    public final void method3964(float arg0, float arg1, int arg2, int arg3, class617 arg4, int arg5, int arg6) {
        this.method3957(arg0, arg1, (float) this.method1076() / 2.0F, (float) this.method1079() / 2.0F, arg2, arg3, arg4, arg5, arg6);
    }

    @OriginalMember(owner = "client!f", name = "V", descriptor = "(IIIII)V")
    public abstract void method1086(int arg0, int arg1, int arg2, int arg3, int arg4);

    @OriginalMember(owner = "client!f", name = "E", descriptor = "()I")
    public abstract int method1083();
}
