import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!qda")
public abstract class class112 implements class742 {

    @OriginalMember(owner = "client!qda", name = "a", descriptor = "()I")
    public abstract int method777();

    @OriginalMember(owner = "client!qda", name = "a", descriptor = "(IIIIIIII)V")
    public abstract void method778(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7);

    @OriginalMember(owner = "client!qda", name = "a", descriptor = "(FFFFFFIIII)V")
    public abstract void method779(float arg0, float arg1, float arg2, float arg3, float arg4, float arg5, int arg6, int arg7, int arg8, int arg9);

    @OriginalMember(owner = "client!qda", name = "a", descriptor = "(FFFFIIIII)V")
    private final void method780(float arg0, float arg1, float arg2, float arg3, int arg4, int arg5, int arg6, int arg7, int arg8) {
        if (arg4 == 0) {
            return;
        }
        double var10 = (double) (arg5 & 0xFFFF) * 9.587379924285257E-5D;
        float var12 = (float) Math.sin(var10) * (float) arg4;
        float var13 = (float) Math.cos(var10) * (float) arg4;
        float var14 = (-arg2 * var13 + -arg3 * var12) / 4096.0F + arg0;
        float var15 = (-arg3 * var13 + arg2 * var12) / 4096.0F + arg1;
        float var16 = (((float) this.method781() - arg2) * var13 + -arg3 * var12) / 4096.0F + arg0;
        float var17 = (-((float) this.method781() - arg2) * var12 + -arg3 * var13) / 4096.0F + arg1;
        float var18 = (-arg2 * var13 + ((float) this.method792() - arg3) * var12) / 4096.0F + arg0;
        float var19 = (arg2 * var12 + ((float) this.method792() - arg3) * var13) / 4096.0F + arg1;
        this.method784(var14, var15, var16, var17, var18, var19, arg6, arg7, arg8);
    }

    @OriginalMember(owner = "client!qda", name = "b", descriptor = "()I")
    public abstract int method781();

    @OriginalMember(owner = "client!qda", name = "a", descriptor = "(IIIIII)V")
    public abstract void method782(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5);

    @OriginalMember(owner = "client!qda", name = "a", descriptor = "(IIII)V")
    public final void method783(int arg0, int arg1, int arg2, int arg3) {
        this.method778(arg0, arg1, arg2, arg3, 1, 0, 1, 1);
    }

    @OriginalMember(owner = "client!qda", name = "a", descriptor = "(FFFFFFIII)V")
    private final void method784(float arg0, float arg1, float arg2, float arg3, float arg4, float arg5, int arg6, int arg7, int arg8) {
        this.method779(arg0, arg1, arg2, arg3, arg4, arg5, arg6, arg7, arg8, 1);
    }

    @OriginalMember(owner = "client!qda", name = "a", descriptor = "(II)V")
    public final void method785(int arg0, int arg1) {
        this.method795(arg0, arg1, 1, 0, 1);
    }

    @OriginalMember(owner = "client!qda", name = "a", descriptor = "(IIIIIII)V")
    public final void method786(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        this.method778(arg0, arg1, arg2, arg3, arg4, arg5, arg6, 1);
    }

    @OriginalMember(owner = "client!qda", name = "a", descriptor = "([I)V")
    public abstract void method787(int[] arg0);

    @OriginalMember(owner = "client!qda", name = "b", descriptor = "(IIIIIII)V")
    public abstract void method788(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6);

    @OriginalMember(owner = "client!qda", name = "c", descriptor = "()I")
    public abstract int method789();

    @OriginalMember(owner = "client!qda", name = "b", descriptor = "(IIII)V")
    public abstract void method790(int arg0, int arg1, int arg2, int arg3);

    @OriginalMember(owner = "client!qda", name = "c", descriptor = "(IIII)V")
    public final void method791(int arg0, int arg1, int arg2, int arg3) {
        this.method788(arg0, arg1, arg2, arg3, 1, 0, 1);
    }

    @OriginalMember(owner = "client!qda", name = "d", descriptor = "()I")
    public abstract int method792();

    @OriginalMember(owner = "client!qda", name = "a", descriptor = "(FFFFFFILaa;II)V")
    public abstract void method793(float arg0, float arg1, float arg2, float arg3, float arg4, float arg5, int arg6, class510 arg7, int arg8, int arg9);

    @OriginalMember(owner = "client!qda", name = "a", descriptor = "(III)V")
    public abstract void method794(int arg0, int arg1, int arg2);

    @OriginalMember(owner = "client!qda", name = "a", descriptor = "(IIIII)V")
    public abstract void method795(int arg0, int arg1, int arg2, int arg3, int arg4);

    @OriginalMember(owner = "client!qda", name = "a", descriptor = "(FFIIIII)V")
    public final void method796(float arg0, float arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        this.method780(arg0, arg1, (float) this.method781() / 2.0F, (float) this.method792() / 2.0F, arg2, arg3, arg4, arg5, arg6);
    }

    @OriginalMember(owner = "client!qda", name = "a", descriptor = "(FFIILaa;II)V")
    public final void method797(float arg0, float arg1, int arg2, int arg3, class510 arg4, int arg5, int arg6) {
        this.method801(arg0, arg1, (float) this.method781() / 2.0F, (float) this.method792() / 2.0F, arg2, arg3, arg4, arg5, arg6);
    }

    @OriginalMember(owner = "client!qda", name = "a", descriptor = "(FFFFFFLaa;II)V")
    private final void method798(float arg0, float arg1, float arg2, float arg3, float arg4, float arg5, class510 arg6, int arg7, int arg8) {
        this.method793(arg0, arg1, arg2, arg3, arg4, arg5, 1, arg6, arg7, arg8);
    }

    @OriginalMember(owner = "client!qda", name = "a", descriptor = "(FFII)V")
    public final void method799(float arg0, float arg1, int arg2, int arg3) {
        this.method780(arg0, arg1, (float) this.method781() / 2.0F, (float) this.method792() / 2.0F, arg2, arg3, 1, 0, 1);
    }

    @OriginalMember(owner = "client!qda", name = "a", descriptor = "(IILaa;II)V")
    public abstract void method800(int arg0, int arg1, class510 arg2, int arg3, int arg4);

    @OriginalMember(owner = "client!qda", name = "a", descriptor = "(FFFFIILaa;II)V")
    public final void method801(float arg0, float arg1, float arg2, float arg3, int arg4, int arg5, class510 arg6, int arg7, int arg8) {
        if (arg4 == 0) {
            return;
        }
        double var10 = (double) (arg5 & 0xFFFF) * 9.587379924285257E-5D;
        float var12 = (float) Math.sin(var10) * (float) arg4;
        float var13 = (float) Math.cos(var10) * (float) arg4;
        float var14 = (-arg2 * var13 + -arg3 * var12) / 4096.0F + arg0;
        float var15 = (-arg3 * var13 + arg2 * var12) / 4096.0F + arg1;
        float var16 = (((float) this.method781() - arg2) * var13 + -arg3 * var12) / 4096.0F + arg0;
        float var17 = (-((float) this.method781() - arg2) * var12 + -arg3 * var13) / 4096.0F + arg1;
        float var18 = (-arg2 * var13 + ((float) this.method792() - arg3) * var12) / 4096.0F + arg0;
        float var19 = (arg2 * var12 + ((float) this.method792() - arg3) * var13) / 4096.0F + arg1;
        this.method798(var14, var15, var16, var17, var18, var19, arg6, arg7, arg8);
    }
}
