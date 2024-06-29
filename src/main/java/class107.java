import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!hk")
public abstract class class107 implements class575 {

    @OriginalMember(owner = "client!hk", name = "c", descriptor = "(IIII)V", line = 7)
    public final void method994(int arg0, int arg1, int arg2, int arg3) {
        this.method16(arg0, arg1, arg2, arg3, 1, 0, 1, 1);
    }

    @OriginalMember(owner = "client!hk", name = "a", descriptor = "(FFFFIILaa;II)V", line = 10)
    public final void method995(float arg0, float arg1, float arg2, float arg3, int arg4, int arg5, class514 arg6, int arg7, int arg8) {
        if (arg4 == 0) {
            return;
        }
        double var10 = (double) (arg5 & 0xFFFF) * 9.587379924285257E-5D;
        float var12 = (float) Math.sin(var10) * (float) arg4;
        float var13 = (float) Math.cos(var10) * (float) arg4;
        float var14 = (-arg2 * var13 + -arg3 * var12) / 4096.0F + arg0;
        float var15 = (-arg3 * var13 + arg2 * var12) / 4096.0F + arg1;
        float var16 = (((float) this.method26() - arg2) * var13 + -arg3 * var12) / 4096.0F + arg0;
        float var17 = (-((float) this.method26() - arg2) * var12 + -arg3 * var13) / 4096.0F + arg1;
        float var18 = (-arg2 * var13 + ((float) this.method12() - arg3) * var12) / 4096.0F + arg0;
        float var19 = (arg2 * var12 + ((float) this.method12() - arg3) * var13) / 4096.0F + arg1;
        this.method998(var14, var15, var16, var17, var18, var19, arg6, arg7, arg8);
    }

    @OriginalMember(owner = "client!hk", name = "a", descriptor = "(FFFFIIIII)V", line = 34)
    private final void method996(float arg0, float arg1, float arg2, float arg3, int arg4, int arg5, int arg6, int arg7, int arg8) {
        if (arg4 == 0) {
            return;
        }
        double var10 = (double) (arg5 & 0xFFFF) * 9.587379924285257E-5D;
        float var12 = (float) Math.sin(var10) * (float) arg4;
        float var13 = (float) Math.cos(var10) * (float) arg4;
        float var14 = (-arg2 * var13 + -arg3 * var12) / 4096.0F + arg0;
        float var15 = (-arg3 * var13 + arg2 * var12) / 4096.0F + arg1;
        float var16 = (((float) this.method26() - arg2) * var13 + -arg3 * var12) / 4096.0F + arg0;
        float var17 = (-((float) this.method26() - arg2) * var12 + -arg3 * var13) / 4096.0F + arg1;
        float var18 = (-arg2 * var13 + ((float) this.method12() - arg3) * var12) / 4096.0F + arg0;
        float var19 = (arg2 * var12 + ((float) this.method12() - arg3) * var13) / 4096.0F + arg1;
        this.method1003(var14, var15, var16, var17, var18, var19, arg6, arg7, arg8);
    }

    @OriginalMember(owner = "client!hk", name = "a", descriptor = "(FFIIIII)V", line = 58)
    public final void method997(float arg0, float arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        this.method996(arg0, arg1, (float) this.method26() / 2.0F, (float) this.method12() / 2.0F, arg2, arg3, arg4, arg5, arg6);
    }

    @OriginalMember(owner = "client!hk", name = "a", descriptor = "(FFFFFFLaa;II)V", line = 62)
    private final void method998(float arg0, float arg1, float arg2, float arg3, float arg4, float arg5, class514 arg6, int arg7, int arg8) {
        this.method25(arg0, arg1, arg2, arg3, arg4, arg5, 1, arg6, arg7, arg8);
    }

    @OriginalMember(owner = "client!hk", name = "b", descriptor = "(IIIIIII)V", line = 67)
    public final void method999(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        this.method16(arg0, arg1, arg2, arg3, arg4, arg5, arg6, 1);
    }

    @OriginalMember(owner = "client!hk", name = "a", descriptor = "(FFIILaa;II)V", line = 70)
    public final void method1000(float arg0, float arg1, int arg2, int arg3, class514 arg4, int arg5, int arg6) {
        this.method995(arg0, arg1, (float) this.method26() / 2.0F, (float) this.method12() / 2.0F, arg2, arg3, arg4, arg5, arg6);
    }

    @OriginalMember(owner = "client!hk", name = "a", descriptor = "(II)V", line = 74)
    public final void method1001(int arg0, int arg1) {
        this.method19(arg0, arg1, 1, 0, 1);
    }

    @OriginalMember(owner = "client!hk", name = "a", descriptor = "(IIII)V", line = 80)
    public final void method1002(int arg0, int arg1, int arg2, int arg3) {
        this.method21(arg0, arg1, arg2, arg3, 1, 0, 1);
    }

    @OriginalMember(owner = "client!hk", name = "a", descriptor = "(FFFFFFIII)V", line = 89)
    private final void method1003(float arg0, float arg1, float arg2, float arg3, float arg4, float arg5, int arg6, int arg7, int arg8) {
        this.method17(arg0, arg1, arg2, arg3, arg4, arg5, arg6, arg7, arg8, 1);
    }

    @OriginalMember(owner = "client!hk", name = "a", descriptor = "(FFII)V", line = 93)
    public final void method1004(float arg0, float arg1, int arg2, int arg3) {
        this.method996(arg0, arg1, (float) this.method26() / 2.0F, (float) this.method12() / 2.0F, arg2, arg3, 1, 0, 1);
    }

    @OriginalMember(owner = "client!hk", name = "b", descriptor = "(IIII)V")
    public abstract void method24(int arg0, int arg1, int arg2, int arg3);

    @OriginalMember(owner = "client!hk", name = "a", descriptor = "(FFFFFFILaa;II)V")
    public abstract void method25(float arg0, float arg1, float arg2, float arg3, float arg4, float arg5, int arg6, class514 arg7, int arg8, int arg9);

    @OriginalMember(owner = "client!hk", name = "a", descriptor = "(IIIIIIII)V")
    public abstract void method16(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7);

    @OriginalMember(owner = "client!hk", name = "b", descriptor = "()I")
    public abstract int method13();

    @OriginalMember(owner = "client!hk", name = "a", descriptor = "(IIIIIII)V")
    public abstract void method21(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6);

    @OriginalMember(owner = "client!hk", name = "a", descriptor = "(IILaa;II)V")
    public abstract void method9(int arg0, int arg1, class514 arg2, int arg3, int arg4);

    @OriginalMember(owner = "client!hk", name = "a", descriptor = "(IIIII)V")
    public abstract void method19(int arg0, int arg1, int arg2, int arg3, int arg4);

    @OriginalMember(owner = "client!hk", name = "c", descriptor = "()I")
    public abstract int method26();

    @OriginalMember(owner = "client!hk", name = "a", descriptor = "(FFFFFFIIII)V")
    public abstract void method17(float arg0, float arg1, float arg2, float arg3, float arg4, float arg5, int arg6, int arg7, int arg8, int arg9);

    @OriginalMember(owner = "client!hk", name = "a", descriptor = "([I)V")
    public abstract void method20(int[] arg0);

    @OriginalMember(owner = "client!hk", name = "d", descriptor = "()I")
    public abstract int method12();

    @OriginalMember(owner = "client!hk", name = "a", descriptor = "(III)V")
    public abstract void method14(int arg0, int arg1, int arg2);

    @OriginalMember(owner = "client!hk", name = "a", descriptor = "()I")
    public abstract int method7();

    @OriginalMember(owner = "client!hk", name = "a", descriptor = "(IIIIII)V")
    public abstract void method8(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5);
}
