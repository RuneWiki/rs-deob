import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!hu")
public abstract class class133 implements class655 {

    @OriginalMember(owner = "client!hu", name = "a", descriptor = "(FFIIIII)V")
    public final void method1028(float arg0, float arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        this.method1039(arg0, arg1, (float) this.method1036() / 2.0F, (float) this.method1048() / 2.0F, arg2, arg3, arg4, arg5, arg6);
    }

    @OriginalMember(owner = "client!hu", name = "a", descriptor = "(FFII)V")
    public final void method1029(float arg0, float arg1, int arg2, int arg3) {
        this.method1039(arg0, arg1, (float) this.method1036() / 2.0F, (float) this.method1048() / 2.0F, arg2, arg3, 1, 0, 1);
    }

    @OriginalMember(owner = "client!hu", name = "a", descriptor = "(FFFFIILaa;II)V")
    public final void method1030(float arg0, float arg1, float arg2, float arg3, int arg4, int arg5, class490 arg6, int arg7, int arg8) {
        if (arg4 == 0) {
            return;
        }
        double var10 = (double) (arg5 & 0xFFFF) * 9.587379924285257E-5D;
        float var12 = (float) Math.sin(var10) * (float) arg4;
        float var13 = (float) Math.cos(var10) * (float) arg4;
        float var14 = (-arg2 * var13 + -arg3 * var12) / 4096.0F + arg0;
        float var15 = (-arg3 * var13 + arg2 * var12) / 4096.0F + arg1;
        float var16 = (((float) this.method1036() - arg2) * var13 + -arg3 * var12) / 4096.0F + arg0;
        float var17 = (-((float) this.method1036() - arg2) * var12 + -arg3 * var13) / 4096.0F + arg1;
        float var18 = (-arg2 * var13 + ((float) this.method1048() - arg3) * var12) / 4096.0F + arg0;
        float var19 = (arg2 * var12 + ((float) this.method1048() - arg3) * var13) / 4096.0F + arg1;
        this.method1038(var14, var15, var16, var17, var18, var19, arg6, arg7, arg8);
    }

    @OriginalMember(owner = "client!hu", name = "a", descriptor = "(IILaa;II)V")
    public abstract void method1031(int arg0, int arg1, class490 arg2, int arg3, int arg4);

    @OriginalMember(owner = "client!hu", name = "a", descriptor = "(IIII)V")
    public abstract void method1032(int arg0, int arg1, int arg2, int arg3);

    @OriginalMember(owner = "client!hu", name = "a", descriptor = "(IIIIIII)V")
    public final void method1033(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        this.method1050(arg0, arg1, arg2, arg3, arg4, arg5, arg6, 1);
    }

    @OriginalMember(owner = "client!hu", name = "a", descriptor = "(FFFFFFIIII)V")
    public abstract void method1034(float arg0, float arg1, float arg2, float arg3, float arg4, float arg5, int arg6, int arg7, int arg8, int arg9);

    @OriginalMember(owner = "client!hu", name = "a", descriptor = "(II)V")
    public final void method1035(int arg0, int arg1) {
        this.method1045(arg0, arg1, 1, 0, 1);
    }

    @OriginalMember(owner = "client!hu", name = "a", descriptor = "()I")
    public abstract int method1036();

    @OriginalMember(owner = "client!hu", name = "a", descriptor = "(FFIILaa;II)V")
    public final void method1037(float arg0, float arg1, int arg2, int arg3, class490 arg4, int arg5, int arg6) {
        this.method1030(arg0, arg1, (float) this.method1036() / 2.0F, (float) this.method1048() / 2.0F, arg2, arg3, arg4, arg5, arg6);
    }

    @OriginalMember(owner = "client!hu", name = "a", descriptor = "(FFFFFFLaa;II)V")
    private final void method1038(float arg0, float arg1, float arg2, float arg3, float arg4, float arg5, class490 arg6, int arg7, int arg8) {
        this.method1041(arg0, arg1, arg2, arg3, arg4, arg5, 1, arg6, arg7, arg8);
    }

    @OriginalMember(owner = "client!hu", name = "a", descriptor = "(FFFFIIIII)V")
    private final void method1039(float arg0, float arg1, float arg2, float arg3, int arg4, int arg5, int arg6, int arg7, int arg8) {
        if (arg4 == 0) {
            return;
        }
        double var10 = (double) (arg5 & 0xFFFF) * 9.587379924285257E-5D;
        float var12 = (float) Math.sin(var10) * (float) arg4;
        float var13 = (float) Math.cos(var10) * (float) arg4;
        float var14 = (-arg2 * var13 + -arg3 * var12) / 4096.0F + arg0;
        float var15 = (-arg3 * var13 + arg2 * var12) / 4096.0F + arg1;
        float var16 = (((float) this.method1036() - arg2) * var13 + -arg3 * var12) / 4096.0F + arg0;
        float var17 = (-((float) this.method1036() - arg2) * var12 + -arg3 * var13) / 4096.0F + arg1;
        float var18 = (-arg2 * var13 + ((float) this.method1048() - arg3) * var12) / 4096.0F + arg0;
        float var19 = (arg2 * var12 + ((float) this.method1048() - arg3) * var13) / 4096.0F + arg1;
        this.method1040(var14, var15, var16, var17, var18, var19, arg6, arg7, arg8);
    }

    @OriginalMember(owner = "client!hu", name = "a", descriptor = "(FFFFFFIII)V")
    private final void method1040(float arg0, float arg1, float arg2, float arg3, float arg4, float arg5, int arg6, int arg7, int arg8) {
        this.method1034(arg0, arg1, arg2, arg3, arg4, arg5, arg6, arg7, arg8, 1);
    }

    @OriginalMember(owner = "client!hu", name = "a", descriptor = "(FFFFFFILaa;II)V")
    public abstract void method1041(float arg0, float arg1, float arg2, float arg3, float arg4, float arg5, int arg6, class490 arg7, int arg8, int arg9);

    @OriginalMember(owner = "client!hu", name = "b", descriptor = "()I")
    public abstract int method1042();

    @OriginalMember(owner = "client!hu", name = "c", descriptor = "()I")
    public abstract int method1043();

    @OriginalMember(owner = "client!hu", name = "a", descriptor = "(III)V")
    public abstract void method1044(int arg0, int arg1, int arg2);

    @OriginalMember(owner = "client!hu", name = "a", descriptor = "(IIIII)V")
    public abstract void method1045(int arg0, int arg1, int arg2, int arg3, int arg4);

    @OriginalMember(owner = "client!hu", name = "a", descriptor = "([I)V")
    public abstract void method1046(int[] arg0);

    @OriginalMember(owner = "client!hu", name = "b", descriptor = "(IIIIIII)V")
    public abstract void method1047(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6);

    @OriginalMember(owner = "client!hu", name = "d", descriptor = "()I")
    public abstract int method1048();

    @OriginalMember(owner = "client!hu", name = "b", descriptor = "(IIII)V")
    public final void method1049(int arg0, int arg1, int arg2, int arg3) {
        this.method1047(arg0, arg1, arg2, arg3, 1, 0, 1);
    }

    @OriginalMember(owner = "client!hu", name = "a", descriptor = "(IIIIIIII)V")
    public abstract void method1050(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7);

    @OriginalMember(owner = "client!hu", name = "a", descriptor = "(IIIIII)V")
    public abstract void method1051(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5);

    @OriginalMember(owner = "client!hu", name = "c", descriptor = "(IIII)V")
    public final void method1052(int arg0, int arg1, int arg2, int arg3) {
        this.method1050(arg0, arg1, arg2, arg3, 1, 0, 1, 1);
    }
}
