import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!l")
public abstract class class16 {

    @OriginalMember(owner = "client!l", name = "a", descriptor = "(IIII)V", line = 4)
    public final void method128(int arg0, int arg1, int arg2, int arg3) {
        this.method135(arg0, arg1, arg2, arg3, 1, 0, 1);
    }

    @OriginalMember(owner = "client!l", name = "a", descriptor = "(II)V", line = 8)
    public final void method130(int arg0, int arg1) {
        this.method139(arg0, arg1, 1, 0, 1);
    }

    @OriginalMember(owner = "client!l", name = "a", descriptor = "(FFFFIIIII)V", line = 21)
    private final void method138(float arg0, float arg1, float arg2, float arg3, int arg4, int arg5, int arg6, int arg7, int arg8) {
        if (arg4 == 0) {
            return;
        }
        double var10 = (double) (arg5 & 0xFFFF) * 9.587379924285257E-5D;
        float var12 = (float) Math.sin(var10) * (float) arg4;
        float var13 = (float) Math.cos(var10) * (float) arg4;
        float var14 = (-arg2 * var13 + -arg3 * var12) / 4096.0F + arg0;
        float var15 = (-arg3 * var13 + arg2 * var12) / 4096.0F + arg1;
        float var16 = (((float) this.method148() - arg2) * var13 + -arg3 * var12) / 4096.0F + arg0;
        float var17 = (-((float) this.method148() - arg2) * var12 + -arg3 * var13) / 4096.0F + arg1;
        float var18 = (-arg2 * var13 + ((float) this.method131() - arg3) * var12) / 4096.0F + arg0;
        float var19 = (arg2 * var12 + ((float) this.method131() - arg3) * var13) / 4096.0F + arg1;
        this.method147(var14, var15, var16, var17, var18, var19, arg6, arg7, arg8);
    }

    @OriginalMember(owner = "client!l", name = "a", descriptor = "(FFII)V", line = 46)
    public final void method140(float arg0, float arg1, int arg2, int arg3) {
        this.method138(arg0, arg1, (float) this.method148() / 2.0F, (float) this.method131() / 2.0F, arg2, arg3, 1, 0, 1);
    }

    @OriginalMember(owner = "client!l", name = "a", descriptor = "(FFIIIII)V", line = 49)
    public final void method141(float arg0, float arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        this.method138(arg0, arg1, (float) this.method148() / 2.0F, (float) this.method131() / 2.0F, arg2, arg3, arg4, arg5, arg6);
    }

    @OriginalMember(owner = "client!l", name = "b", descriptor = "(IIII)V", line = 52)
    public final void method142(int arg0, int arg1, int arg2, int arg3) {
        this.method143(arg0, arg1, arg2, arg3, 1, 0, 1);
    }

    @OriginalMember(owner = "client!l", name = "a", descriptor = "(FFIILma;II)V", line = 56)
    public final void method144(float arg0, float arg1, int arg2, int arg3, class10 arg4, int arg5, int arg6) {
        this.method145(arg0, arg1, (float) this.method148() / 2.0F, (float) this.method131() / 2.0F, arg2, arg3, arg4, arg5, arg6);
    }

    @OriginalMember(owner = "client!l", name = "a", descriptor = "(FFFFIILma;II)V", line = 60)
    public final void method145(float arg0, float arg1, float arg2, float arg3, int arg4, int arg5, class10 arg6, int arg7, int arg8) {
        if (arg4 == 0) {
            return;
        }
        double var10 = (double) (arg5 & 0xFFFF) * 9.587379924285257E-5D;
        float var12 = (float) Math.sin(var10) * (float) arg4;
        float var13 = (float) Math.cos(var10) * (float) arg4;
        float var14 = (-arg2 * var13 + -arg3 * var12) / 4096.0F + arg0;
        float var15 = (-arg3 * var13 + arg2 * var12) / 4096.0F + arg1;
        float var16 = (((float) this.method148() - arg2) * var13 + -arg3 * var12) / 4096.0F + arg0;
        float var17 = (-((float) this.method148() - arg2) * var12 + -arg3 * var13) / 4096.0F + arg1;
        float var18 = (-arg2 * var13 + ((float) this.method131() - arg3) * var12) / 4096.0F + arg0;
        float var19 = (arg2 * var12 + ((float) this.method131() - arg3) * var13) / 4096.0F + arg1;
        this.method136(var14, var15, var16, var17, var18, var19, arg6, arg7, arg8);
    }

    @OriginalMember(owner = "client!l", name = "a", descriptor = "(IILma;II)V")
    public abstract void method129(int arg0, int arg1, class10 arg2, int arg3, int arg4);

    @OriginalMember(owner = "client!l", name = "T", descriptor = "()I")
    public abstract int method131();

    @OriginalMember(owner = "client!l", name = "t", descriptor = "(IIIIII)V")
    public abstract void method132(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5);

    @OriginalMember(owner = "client!l", name = "MA", descriptor = "(IIII)V")
    public abstract void method133(int arg0, int arg1, int arg2, int arg3);

    @OriginalMember(owner = "client!l", name = "la", descriptor = "()I")
    public abstract int method134();

    @OriginalMember(owner = "client!l", name = "s", descriptor = "(IIIIIII)V")
    public abstract void method135(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6);

    @OriginalMember(owner = "client!l", name = "b", descriptor = "(FFFFFFLma;II)V")
    public abstract void method136(float arg0, float arg1, float arg2, float arg3, float arg4, float arg5, class10 arg6, int arg7, int arg8);

    @OriginalMember(owner = "client!l", name = "ma", descriptor = "()I")
    public abstract int method137();

    @OriginalMember(owner = "client!l", name = "r", descriptor = "(IIIII)V")
    public abstract void method139(int arg0, int arg1, int arg2, int arg3, int arg4);

    @OriginalMember(owner = "client!l", name = "JA", descriptor = "(IIIIIII)V")
    public abstract void method143(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6);

    @OriginalMember(owner = "client!l", name = "BA", descriptor = "(III)V")
    public abstract void method146(int arg0, int arg1, int arg2);

    @OriginalMember(owner = "client!l", name = "a", descriptor = "(FFFFFFIII)V")
    public abstract void method147(float arg0, float arg1, float arg2, float arg3, float arg4, float arg5, int arg6, int arg7, int arg8);

    @OriginalMember(owner = "client!l", name = "j", descriptor = "()I")
    public abstract int method148();
}
