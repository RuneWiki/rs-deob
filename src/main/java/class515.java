import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!td")
public abstract class class515 implements class239 {

    @OriginalMember(owner = "client!td", name = "a", descriptor = "(II)V", line = 8)
    public final void method3128(int arg0, int arg1) {
        this.method789(arg0, arg1, 1, 0, 1);
    }

    @OriginalMember(owner = "client!td", name = "a", descriptor = "(FFFFFFLaa;II)V", line = 11)
    private final void method3129(float arg0, float arg1, float arg2, float arg3, float arg4, float arg5, class569 arg6, int arg7, int arg8) {
        this.method782(arg0, arg1, arg2, arg3, arg4, arg5, 1, arg6, arg7, arg8);
    }

    @OriginalMember(owner = "client!td", name = "a", descriptor = "(IIIIIII)V", line = 15)
    public final void method3130(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        this.method788(arg0, arg1, arg2, arg3, arg4, arg5, arg6, 1);
    }

    @OriginalMember(owner = "client!td", name = "a", descriptor = "(FFFFFFIII)V", line = 18)
    private final void method3131(float arg0, float arg1, float arg2, float arg3, float arg4, float arg5, int arg6, int arg7, int arg8) {
        this.method779(arg0, arg1, arg2, arg3, arg4, arg5, arg6, arg7, arg8, 1);
    }

    @OriginalMember(owner = "client!td", name = "a", descriptor = "(IIII)V", line = 21)
    public final void method3132(int arg0, int arg1, int arg2, int arg3) {
        this.method788(arg0, arg1, arg2, arg3, 1, 0, 1, 1);
    }

    @OriginalMember(owner = "client!td", name = "a", descriptor = "(FFIIIII)V", line = 25)
    public final void method3133(float arg0, float arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        this.method3137(arg0, arg1, (float) this.method784() / 2.0F, (float) this.method780() / 2.0F, arg2, arg3, arg4, arg5, arg6);
    }

    @OriginalMember(owner = "client!td", name = "a", descriptor = "(FFII)V", line = 31)
    public final void method3134(float arg0, float arg1, int arg2, int arg3) {
        this.method3137(arg0, arg1, (float) this.method784() / 2.0F, (float) this.method780() / 2.0F, arg2, arg3, 1, 0, 1);
    }

    @OriginalMember(owner = "client!td", name = "c", descriptor = "(IIII)V", line = 36)
    public final void method3135(int arg0, int arg1, int arg2, int arg3) {
        this.method775(arg0, arg1, arg2, arg3, 1, 0, 1);
    }

    @OriginalMember(owner = "client!td", name = "a", descriptor = "(FFFFIILaa;II)V", line = 44)
    public final void method3136(float arg0, float arg1, float arg2, float arg3, int arg4, int arg5, class569 arg6, int arg7, int arg8) {
        if (arg4 == 0) {
            return;
        }
        double var10 = (double) (arg5 & 0xFFFF) * 9.587379924285257E-5D;
        float var12 = (float) Math.sin(var10) * (float) arg4;
        float var13 = (float) Math.cos(var10) * (float) arg4;
        float var14 = (-arg2 * var13 + -arg3 * var12) / 4096.0F + arg0;
        float var15 = (-arg3 * var13 + arg2 * var12) / 4096.0F + arg1;
        float var16 = (((float) this.method784() - arg2) * var13 + -arg3 * var12) / 4096.0F + arg0;
        float var17 = (-((float) this.method784() - arg2) * var12 + -arg3 * var13) / 4096.0F + arg1;
        float var18 = (-arg2 * var13 + ((float) this.method780() - arg3) * var12) / 4096.0F + arg0;
        float var19 = (arg2 * var12 + ((float) this.method780() - arg3) * var13) / 4096.0F + arg1;
        this.method3129(var14, var15, var16, var17, var18, var19, arg6, arg7, arg8);
    }

    @OriginalMember(owner = "client!td", name = "a", descriptor = "(FFFFIIIII)V", line = 69)
    private final void method3137(float arg0, float arg1, float arg2, float arg3, int arg4, int arg5, int arg6, int arg7, int arg8) {
        if (arg4 == 0) {
            return;
        }
        double var10 = (double) (arg5 & 0xFFFF) * 9.587379924285257E-5D;
        float var12 = (float) Math.sin(var10) * (float) arg4;
        float var13 = (float) Math.cos(var10) * (float) arg4;
        float var14 = (-arg2 * var13 + -arg3 * var12) / 4096.0F + arg0;
        float var15 = (-arg3 * var13 + arg2 * var12) / 4096.0F + arg1;
        float var16 = (((float) this.method784() - arg2) * var13 + -arg3 * var12) / 4096.0F + arg0;
        float var17 = (-((float) this.method784() - arg2) * var12 + -arg3 * var13) / 4096.0F + arg1;
        float var18 = (-arg2 * var13 + ((float) this.method780() - arg3) * var12) / 4096.0F + arg0;
        float var19 = (arg2 * var12 + ((float) this.method780() - arg3) * var13) / 4096.0F + arg1;
        this.method3131(var14, var15, var16, var17, var18, var19, arg6, arg7, arg8);
    }

    @OriginalMember(owner = "client!td", name = "a", descriptor = "(FFIILaa;II)V", line = 96)
    public final void method3138(float arg0, float arg1, int arg2, int arg3, class569 arg4, int arg5, int arg6) {
        this.method3136(arg0, arg1, (float) this.method784() / 2.0F, (float) this.method780() / 2.0F, arg2, arg3, arg4, arg5, arg6);
    }

    @OriginalMember(owner = "client!td", name = "a", descriptor = "(FFFFFFILaa;II)V")
    public abstract void method782(float arg0, float arg1, float arg2, float arg3, float arg4, float arg5, int arg6, class569 arg7, int arg8, int arg9);

    @OriginalMember(owner = "client!td", name = "a", descriptor = "()I")
    public abstract int method777();

    @OriginalMember(owner = "client!td", name = "a", descriptor = "(III)V")
    public abstract void method808(int arg0, int arg1, int arg2);

    @OriginalMember(owner = "client!td", name = "a", descriptor = "(IIIIII)V")
    public abstract void method807(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5);

    @OriginalMember(owner = "client!td", name = "a", descriptor = "(FFFFFFIIII)V")
    public abstract void method779(float arg0, float arg1, float arg2, float arg3, float arg4, float arg5, int arg6, int arg7, int arg8, int arg9);

    @OriginalMember(owner = "client!td", name = "b", descriptor = "(IIII)V")
    public abstract void method783(int arg0, int arg1, int arg2, int arg3);

    @OriginalMember(owner = "client!td", name = "a", descriptor = "(IIIII)V")
    public abstract void method789(int arg0, int arg1, int arg2, int arg3, int arg4);

    @OriginalMember(owner = "client!td", name = "b", descriptor = "(IIIIIII)V")
    public abstract void method775(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6);

    @OriginalMember(owner = "client!td", name = "b", descriptor = "()I")
    public abstract int method780();

    @OriginalMember(owner = "client!td", name = "a", descriptor = "(IILaa;II)V")
    public abstract void method781(int arg0, int arg1, class569 arg2, int arg3, int arg4);

    @OriginalMember(owner = "client!td", name = "c", descriptor = "()I")
    public abstract int method784();

    @OriginalMember(owner = "client!td", name = "d", descriptor = "()I")
    public abstract int method787();

    @OriginalMember(owner = "client!td", name = "a", descriptor = "(IIIIIIII)V")
    public abstract void method788(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7);
}
