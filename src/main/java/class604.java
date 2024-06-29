import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!nf")
public abstract class class604 implements class575 {

    @OriginalMember(owner = "client!nf", name = "a", descriptor = "(IIII)V", line = 3)
    public final void method3424(int arg0, int arg1, int arg2, int arg3) {
        this.method221(arg0, arg1, arg2, arg3, 1, 0, 1, 1);
    }

    @OriginalMember(owner = "client!nf", name = "a", descriptor = "(FFFFFFLaa;II)V", line = 6)
    private final void method3425(float arg0, float arg1, float arg2, float arg3, float arg4, float arg5, class514 arg6, int arg7, int arg8) {
        this.method223(arg0, arg1, arg2, arg3, arg4, arg5, 1, arg6, arg7, arg8);
    }

    @OriginalMember(owner = "client!nf", name = "b", descriptor = "(IIII)V", line = 9)
    public final void method3426(int arg0, int arg1, int arg2, int arg3) {
        this.method226(arg0, arg1, arg2, arg3, 1, 0, 1);
    }

    @OriginalMember(owner = "client!nf", name = "a", descriptor = "(FFFFIIIII)V", line = 13)
    private final void method3427(float arg0, float arg1, float arg2, float arg3, int arg4, int arg5, int arg6, int arg7, int arg8) {
        if (arg4 == 0) {
            return;
        }
        double var10 = (double) (arg5 & 0xFFFF) * 9.587379924285257E-5D;
        float var12 = (float) Math.sin(var10) * (float) arg4;
        float var13 = (float) Math.cos(var10) * (float) arg4;
        float var14 = (-arg2 * var13 + -arg3 * var12) / 4096.0F + arg0;
        float var15 = (-arg3 * var13 + arg2 * var12) / 4096.0F + arg1;
        float var16 = (((float) this.method224() - arg2) * var13 + -arg3 * var12) / 4096.0F + arg0;
        float var17 = (-((float) this.method224() - arg2) * var12 + -arg3 * var13) / 4096.0F + arg1;
        float var18 = (-arg2 * var13 + ((float) this.method218() - arg3) * var12) / 4096.0F + arg0;
        float var19 = (arg2 * var12 + ((float) this.method218() - arg3) * var13) / 4096.0F + arg1;
        this.method3432(var14, var15, var16, var17, var18, var19, arg6, arg7, arg8);
    }

    @OriginalMember(owner = "client!nf", name = "a", descriptor = "(FFFFIILaa;II)V", line = 39)
    public final void method3428(float arg0, float arg1, float arg2, float arg3, int arg4, int arg5, class514 arg6, int arg7, int arg8) {
        if (arg4 == 0) {
            return;
        }
        double var10 = (double) (arg5 & 0xFFFF) * 9.587379924285257E-5D;
        float var12 = (float) Math.sin(var10) * (float) arg4;
        float var13 = (float) Math.cos(var10) * (float) arg4;
        float var14 = (-arg2 * var13 + -arg3 * var12) / 4096.0F + arg0;
        float var15 = (-arg3 * var13 + arg2 * var12) / 4096.0F + arg1;
        float var16 = (((float) this.method224() - arg2) * var13 + -arg3 * var12) / 4096.0F + arg0;
        float var17 = (-((float) this.method224() - arg2) * var12 + -arg3 * var13) / 4096.0F + arg1;
        float var18 = (-arg2 * var13 + ((float) this.method218() - arg3) * var12) / 4096.0F + arg0;
        float var19 = (arg2 * var12 + ((float) this.method218() - arg3) * var13) / 4096.0F + arg1;
        this.method3425(var14, var15, var16, var17, var18, var19, arg6, arg7, arg8);
    }

    @OriginalMember(owner = "client!nf", name = "a", descriptor = "(FFIIIII)V", line = 68)
    public final void method3429(float arg0, float arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        this.method3427(arg0, arg1, (float) this.method224() / 2.0F, (float) this.method218() / 2.0F, arg2, arg3, arg4, arg5, arg6);
    }

    @OriginalMember(owner = "client!nf", name = "a", descriptor = "(II)V", line = 75)
    public final void method3430(int arg0, int arg1) {
        this.method215(arg0, arg1, 1, 0, 1);
    }

    @OriginalMember(owner = "client!nf", name = "a", descriptor = "(FFII)V", line = 79)
    public final void method3431(float arg0, float arg1, int arg2, int arg3) {
        this.method3427(arg0, arg1, (float) this.method224() / 2.0F, (float) this.method218() / 2.0F, arg2, arg3, 1, 0, 1);
    }

    @OriginalMember(owner = "client!nf", name = "a", descriptor = "(FFFFFFIII)V", line = 89)
    private final void method3432(float arg0, float arg1, float arg2, float arg3, float arg4, float arg5, int arg6, int arg7, int arg8) {
        this.method219(arg0, arg1, arg2, arg3, arg4, arg5, arg6, arg7, arg8, 1);
    }

    @OriginalMember(owner = "client!nf", name = "b", descriptor = "(IIIIIII)V", line = 92)
    public final void method3433(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        this.method221(arg0, arg1, arg2, arg3, arg4, arg5, arg6, 1);
    }

    @OriginalMember(owner = "client!nf", name = "a", descriptor = "(FFIILaa;II)V", line = 96)
    public final void method3434(float arg0, float arg1, int arg2, int arg3, class514 arg4, int arg5, int arg6) {
        this.method3428(arg0, arg1, (float) this.method224() / 2.0F, (float) this.method218() / 2.0F, arg2, arg3, arg4, arg5, arg6);
    }

    @OriginalMember(owner = "client!nf", name = "a", descriptor = "()I")
    public abstract int method224();

    @OriginalMember(owner = "client!nf", name = "a", descriptor = "([I)V")
    public abstract void method212(int[] arg0);

    @OriginalMember(owner = "client!nf", name = "a", descriptor = "(IIIIII)V")
    public abstract void method642(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5);

    @OriginalMember(owner = "client!nf", name = "a", descriptor = "(IIIII)V")
    public abstract void method215(int arg0, int arg1, int arg2, int arg3, int arg4);

    @OriginalMember(owner = "client!nf", name = "b", descriptor = "()I")
    public abstract int method220();

    @OriginalMember(owner = "client!nf", name = "c", descriptor = "()I")
    public abstract int method218();

    @OriginalMember(owner = "client!nf", name = "c", descriptor = "(IIII)V")
    public abstract void method213(int arg0, int arg1, int arg2, int arg3);

    @OriginalMember(owner = "client!nf", name = "a", descriptor = "(FFFFFFILaa;II)V")
    public abstract void method223(float arg0, float arg1, float arg2, float arg3, float arg4, float arg5, int arg6, class514 arg7, int arg8, int arg9);

    @OriginalMember(owner = "client!nf", name = "d", descriptor = "()I")
    public abstract int method214();

    @OriginalMember(owner = "client!nf", name = "a", descriptor = "(IIIIIII)V")
    public abstract void method226(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6);

    @OriginalMember(owner = "client!nf", name = "a", descriptor = "(FFFFFFIIII)V")
    public abstract void method219(float arg0, float arg1, float arg2, float arg3, float arg4, float arg5, int arg6, int arg7, int arg8, int arg9);

    @OriginalMember(owner = "client!nf", name = "a", descriptor = "(IILaa;II)V")
    public abstract void method211(int arg0, int arg1, class514 arg2, int arg3, int arg4);

    @OriginalMember(owner = "client!nf", name = "a", descriptor = "(III)V")
    public abstract void method641(int arg0, int arg1, int arg2);

    @OriginalMember(owner = "client!nf", name = "a", descriptor = "(IIIIIIII)V")
    public abstract void method221(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7);
}
