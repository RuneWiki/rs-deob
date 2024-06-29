import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!tb")
public abstract class class392 implements class545 {

    @OriginalMember(owner = "client!tb", name = "a", descriptor = "(FFFFFFIIII)V")
    public abstract void method1371(float arg0, float arg1, float arg2, float arg3, float arg4, float arg5, int arg6, int arg7, int arg8, int arg9);

    @OriginalMember(owner = "client!tb", name = "a", descriptor = "(IIIIII)V")
    public abstract void method873(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5);

    @OriginalMember(owner = "client!tb", name = "a", descriptor = "(III)V")
    public abstract void method877(int arg0, int arg1, int arg2);

    @OriginalMember(owner = "client!tb", name = "a", descriptor = "(FFFFIILaa;II)V")
    public final void method3066(float arg0, float arg1, float arg2, float arg3, int arg4, int arg5, class685 arg6, int arg7, int arg8) {
        if (arg4 == 0) {
            return;
        }
        double var10 = (double) (arg5 & 0xFFFF) * 9.587379924285257E-5D;
        float var12 = (float) Math.sin(var10) * (float) arg4;
        float var13 = (float) Math.cos(var10) * (float) arg4;
        float var14 = (-arg2 * var13 + -arg3 * var12) / 4096.0F + arg0;
        float var15 = (-arg3 * var13 + arg2 * var12) / 4096.0F + arg1;
        float var16 = (((float) this.method1378() - arg2) * var13 + -arg3 * var12) / 4096.0F + arg0;
        float var17 = (-((float) this.method1378() - arg2) * var12 + -arg3 * var13) / 4096.0F + arg1;
        float var18 = (-arg2 * var13 + ((float) this.method1380() - arg3) * var12) / 4096.0F + arg0;
        float var19 = (arg2 * var12 + ((float) this.method1380() - arg3) * var13) / 4096.0F + arg1;
        this.method3071(var14, var15, var16, var17, var18, var19, arg6, arg7, arg8);
    }

    @OriginalMember(owner = "client!tb", name = "a", descriptor = "(IILaa;II)V")
    public abstract void method870(int arg0, int arg1, class685 arg2, int arg3, int arg4);

    @OriginalMember(owner = "client!tb", name = "a", descriptor = "(FFFFFFILaa;II)V")
    public abstract void method1375(float arg0, float arg1, float arg2, float arg3, float arg4, float arg5, int arg6, class685 arg7, int arg8, int arg9);

    @OriginalMember(owner = "client!tb", name = "a", descriptor = "(IIIII)V")
    public abstract void method874(int arg0, int arg1, int arg2, int arg3, int arg4);

    @OriginalMember(owner = "client!tb", name = "a", descriptor = "(IIIIIIII)V")
    public abstract void method876(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7);

    @OriginalMember(owner = "client!tb", name = "a", descriptor = "(FFFFIIIII)V")
    private final void method3067(float arg0, float arg1, float arg2, float arg3, int arg4, int arg5, int arg6, int arg7, int arg8) {
        if (arg4 == 0) {
            return;
        }
        double var10 = (double) (arg5 & 0xFFFF) * 9.587379924285257E-5D;
        float var12 = (float) Math.sin(var10) * (float) arg4;
        float var13 = (float) Math.cos(var10) * (float) arg4;
        float var14 = (-arg2 * var13 + -arg3 * var12) / 4096.0F + arg0;
        float var15 = (-arg3 * var13 + arg2 * var12) / 4096.0F + arg1;
        float var16 = (((float) this.method1378() - arg2) * var13 + -arg3 * var12) / 4096.0F + arg0;
        float var17 = (-((float) this.method1378() - arg2) * var12 + -arg3 * var13) / 4096.0F + arg1;
        float var18 = (-arg2 * var13 + ((float) this.method1380() - arg3) * var12) / 4096.0F + arg0;
        float var19 = (arg2 * var12 + ((float) this.method1380() - arg3) * var13) / 4096.0F + arg1;
        this.method3068(var14, var15, var16, var17, var18, var19, arg6, arg7, arg8);
    }

    @OriginalMember(owner = "client!tb", name = "a", descriptor = "([I)V")
    public abstract void method1373(int[] arg0);

    @OriginalMember(owner = "client!tb", name = "a", descriptor = "(FFFFFFIII)V")
    private final void method3068(float arg0, float arg1, float arg2, float arg3, float arg4, float arg5, int arg6, int arg7, int arg8) {
        this.method1371(arg0, arg1, arg2, arg3, arg4, arg5, arg6, arg7, arg8, 1);
    }

    @OriginalMember(owner = "client!tb", name = "a", descriptor = "(IIII)V")
    public final void method3069(int arg0, int arg1, int arg2, int arg3) {
        this.method876(arg0, arg1, arg2, arg3, 1, 0, 1, 1);
    }

    @OriginalMember(owner = "client!tb", name = "b", descriptor = "()I")
    public abstract int method1380();

    @OriginalMember(owner = "client!tb", name = "a", descriptor = "()I")
    public abstract int method1376();

    @OriginalMember(owner = "client!tb", name = "b", descriptor = "(IIII)V")
    public abstract void method1379(int arg0, int arg1, int arg2, int arg3);

    @OriginalMember(owner = "client!tb", name = "a", descriptor = "(IIIIIII)V")
    public abstract void method1382(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6);

    @OriginalMember(owner = "client!tb", name = "d", descriptor = "()I")
    public abstract int method1378();

    @OriginalMember(owner = "client!tb", name = "a", descriptor = "(FFIILaa;II)V")
    public final void method3070(float arg0, float arg1, int arg2, int arg3, class685 arg4, int arg5, int arg6) {
        this.method3066(arg0, arg1, (float) this.method1378() / 2.0F, (float) this.method1380() / 2.0F, arg2, arg3, arg4, arg5, arg6);
    }

    @OriginalMember(owner = "client!tb", name = "c", descriptor = "()I")
    public abstract int method1377();

    @OriginalMember(owner = "client!tb", name = "a", descriptor = "(FFFFFFLaa;II)V")
    private final void method3071(float arg0, float arg1, float arg2, float arg3, float arg4, float arg5, class685 arg6, int arg7, int arg8) {
        this.method1375(arg0, arg1, arg2, arg3, arg4, arg5, 1, arg6, arg7, arg8);
    }

    @OriginalMember(owner = "client!tb", name = "a", descriptor = "(FFIIIII)V")
    public final void method3072(float arg0, float arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        this.method3067(arg0, arg1, (float) this.method1378() / 2.0F, (float) this.method1380() / 2.0F, arg2, arg3, arg4, arg5, arg6);
    }

    @OriginalMember(owner = "client!tb", name = "b", descriptor = "(IIIIIII)V")
    public final void method3073(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        this.method876(arg0, arg1, arg2, arg3, arg4, arg5, arg6, 1);
    }

    @OriginalMember(owner = "client!tb", name = "a", descriptor = "(II)V")
    public final void method3074(int arg0, int arg1) {
        this.method874(arg0, arg1, 1, 0, 1);
    }

    @OriginalMember(owner = "client!tb", name = "c", descriptor = "(IIII)V")
    public final void method3075(int arg0, int arg1, int arg2, int arg3) {
        this.method1382(arg0, arg1, arg2, arg3, 1, 0, 1);
    }

    @OriginalMember(owner = "client!tb", name = "a", descriptor = "(FFII)V")
    public final void method3076(float arg0, float arg1, int arg2, int arg3) {
        this.method3067(arg0, arg1, (float) this.method1378() / 2.0F, (float) this.method1380() / 2.0F, arg2, arg3, 1, 0, 1);
    }
}
