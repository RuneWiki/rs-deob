import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!mq")
public abstract class class85 implements class567 {

    @OriginalMember(owner = "client!mq", name = "a", descriptor = "(FFFFFFIII)V")
    private final void method750(float arg0, float arg1, float arg2, float arg3, float arg4, float arg5, int arg6, int arg7, int arg8) {
        this.method4(arg0, arg1, arg2, arg3, arg4, arg5, arg6, arg7, arg8, 1);
    }

    @OriginalMember(owner = "client!mq", name = "a", descriptor = "(FFII)V")
    public final void method751(float arg0, float arg1, int arg2, int arg3) {
        this.method756(arg0, arg1, (float) this.method11() / 2.0F, (float) this.method14() / 2.0F, arg2, arg3, 1, 0, 1);
    }

    @OriginalMember(owner = "client!mq", name = "a", descriptor = "([I)V")
    public abstract void method3(int[] arg0);

    @OriginalMember(owner = "client!mq", name = "a", descriptor = "(IIII)V")
    public abstract void method2(int arg0, int arg1, int arg2, int arg3);

    @OriginalMember(owner = "client!mq", name = "a", descriptor = "()I")
    public abstract int method16();

    @OriginalMember(owner = "client!mq", name = "a", descriptor = "(FFIILaa;II)V")
    public final void method752(float arg0, float arg1, int arg2, int arg3, class88 arg4, int arg5, int arg6) {
        this.method753(arg0, arg1, (float) this.method11() / 2.0F, (float) this.method14() / 2.0F, arg2, arg3, arg4, arg5, arg6);
    }

    @OriginalMember(owner = "client!mq", name = "a", descriptor = "(FFFFIILaa;II)V")
    public final void method753(float arg0, float arg1, float arg2, float arg3, int arg4, int arg5, class88 arg6, int arg7, int arg8) {
        if (arg4 == 0) {
            return;
        }
        double var10 = (double) (arg5 & 0xFFFF) * 9.587379924285257E-5D;
        float var12 = (float) Math.sin(var10) * (float) arg4;
        float var13 = (float) Math.cos(var10) * (float) arg4;
        float var14 = (-arg2 * var13 + -arg3 * var12) / 4096.0F + arg0;
        float var15 = (-arg3 * var13 + arg2 * var12) / 4096.0F + arg1;
        float var16 = (((float) this.method11() - arg2) * var13 + -arg3 * var12) / 4096.0F + arg0;
        float var17 = (-((float) this.method11() - arg2) * var12 + -arg3 * var13) / 4096.0F + arg1;
        float var18 = (-arg2 * var13 + ((float) this.method14() - arg3) * var12) / 4096.0F + arg0;
        float var19 = (arg2 * var12 + ((float) this.method14() - arg3) * var13) / 4096.0F + arg1;
        this.method754(var14, var15, var16, var17, var18, var19, arg6, arg7, arg8);
    }

    @OriginalMember(owner = "client!mq", name = "a", descriptor = "(IIIIIIII)V")
    public abstract void method10(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7);

    @OriginalMember(owner = "client!mq", name = "a", descriptor = "(FFFFFFLaa;II)V")
    private final void method754(float arg0, float arg1, float arg2, float arg3, float arg4, float arg5, class88 arg6, int arg7, int arg8) {
        this.method7(arg0, arg1, arg2, arg3, arg4, arg5, 1, arg6, arg7, arg8);
    }

    @OriginalMember(owner = "client!mq", name = "a", descriptor = "(III)V")
    public abstract void method277(int arg0, int arg1, int arg2);

    @OriginalMember(owner = "client!mq", name = "a", descriptor = "(IIIII)V")
    public abstract void method6(int arg0, int arg1, int arg2, int arg3, int arg4);

    @OriginalMember(owner = "client!mq", name = "a", descriptor = "(IIIIIII)V")
    public abstract void method8(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6);

    @OriginalMember(owner = "client!mq", name = "b", descriptor = "(IIII)V")
    public final void method755(int arg0, int arg1, int arg2, int arg3) {
        this.method10(arg0, arg1, arg2, arg3, 1, 0, 1, 1);
    }

    @OriginalMember(owner = "client!mq", name = "a", descriptor = "(FFFFIIIII)V")
    private final void method756(float arg0, float arg1, float arg2, float arg3, int arg4, int arg5, int arg6, int arg7, int arg8) {
        if (arg4 == 0) {
            return;
        }
        double var10 = (double) (arg5 & 0xFFFF) * 9.587379924285257E-5D;
        float var12 = (float) Math.sin(var10) * (float) arg4;
        float var13 = (float) Math.cos(var10) * (float) arg4;
        float var14 = (-arg2 * var13 + -arg3 * var12) / 4096.0F + arg0;
        float var15 = (-arg3 * var13 + arg2 * var12) / 4096.0F + arg1;
        float var16 = (((float) this.method11() - arg2) * var13 + -arg3 * var12) / 4096.0F + arg0;
        float var17 = (-((float) this.method11() - arg2) * var12 + -arg3 * var13) / 4096.0F + arg1;
        float var18 = (-arg2 * var13 + ((float) this.method14() - arg3) * var12) / 4096.0F + arg0;
        float var19 = (arg2 * var12 + ((float) this.method14() - arg3) * var13) / 4096.0F + arg1;
        this.method750(var14, var15, var16, var17, var18, var19, arg6, arg7, arg8);
    }

    @OriginalMember(owner = "client!mq", name = "c", descriptor = "(IIII)V")
    public final void method757(int arg0, int arg1, int arg2, int arg3) {
        this.method8(arg0, arg1, arg2, arg3, 1, 0, 1);
    }

    @OriginalMember(owner = "client!mq", name = "b", descriptor = "(IIIIIII)V")
    public final void method758(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        this.method10(arg0, arg1, arg2, arg3, arg4, arg5, arg6, 1);
    }

    @OriginalMember(owner = "client!mq", name = "a", descriptor = "(II)V")
    public final void method759(int arg0, int arg1) {
        this.method6(arg0, arg1, 1, 0, 1);
    }

    @OriginalMember(owner = "client!mq", name = "a", descriptor = "(FFFFFFILaa;II)V")
    public abstract void method7(float arg0, float arg1, float arg2, float arg3, float arg4, float arg5, int arg6, class88 arg7, int arg8, int arg9);

    @OriginalMember(owner = "client!mq", name = "a", descriptor = "(FFFFFFIIII)V")
    public abstract void method4(float arg0, float arg1, float arg2, float arg3, float arg4, float arg5, int arg6, int arg7, int arg8, int arg9);

    @OriginalMember(owner = "client!mq", name = "a", descriptor = "(IIIIII)V")
    public abstract void method276(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5);

    @OriginalMember(owner = "client!mq", name = "b", descriptor = "()I")
    public abstract int method5();

    @OriginalMember(owner = "client!mq", name = "a", descriptor = "(IILaa;II)V")
    public abstract void method9(int arg0, int arg1, class88 arg2, int arg3, int arg4);

    @OriginalMember(owner = "client!mq", name = "c", descriptor = "()I")
    public abstract int method11();

    @OriginalMember(owner = "client!mq", name = "a", descriptor = "(FFIIIII)V")
    public final void method760(float arg0, float arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        this.method756(arg0, arg1, (float) this.method11() / 2.0F, (float) this.method14() / 2.0F, arg2, arg3, arg4, arg5, arg6);
    }

    @OriginalMember(owner = "client!mq", name = "d", descriptor = "()I")
    public abstract int method14();
}
