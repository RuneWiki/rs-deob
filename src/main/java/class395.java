import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!rg")
public abstract class class395 {

    @OriginalMember(owner = "client!rg", name = "a", descriptor = "(FFIIIII)V", line = 4)
    public final void method2362(float arg0, float arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        this.method2368(arg0, arg1, (float) this.method216() / 2.0F, (float) this.method222() / 2.0F, arg2, arg3, arg4, arg5, arg6);
    }

    @OriginalMember(owner = "client!rg", name = "a", descriptor = "(II)V", line = 9)
    public final void method2363(int arg0, int arg1) {
        this.method214(arg0, arg1, 0, 0, 1);
    }

    @OriginalMember(owner = "client!rg", name = "a", descriptor = "(IIII)V", line = 15)
    public final void method2364(int arg0, int arg1, int arg2, int arg3) {
        this.method225(arg0, arg1, arg2, arg3, 0, 0, 1);
    }

    @OriginalMember(owner = "client!rg", name = "a", descriptor = "(FFFFIILhg;II)V", line = 20)
    public final void method2365(float arg0, float arg1, float arg2, float arg3, int arg4, int arg5, class313 arg6, int arg7, int arg8) {
        if (arg4 == 0) {
            return;
        }
        double var10 = (double) (arg5 & 0xFFFF) * 9.587379924285257E-5D;
        float var12 = (float) Math.sin(var10) * (float) arg4;
        float var13 = (float) Math.cos(var10) * (float) arg4;
        float var14 = (-arg2 * var13 + -arg3 * var12) / 4096.0F + arg0;
        float var15 = (-arg3 * var13 + arg2 * var12) / 4096.0F + arg1;
        float var16 = (((float) this.method216() - arg2) * var13 + -arg3 * var12) / 4096.0F + arg0;
        float var17 = (-((float) this.method216() - arg2) * var12 + -arg3 * var13) / 4096.0F + arg1;
        float var18 = (-arg2 * var13 + ((float) this.method222() - arg3) * var12) / 4096.0F + arg0;
        float var19 = (arg2 * var12 + ((float) this.method222() - arg3) * var13) / 4096.0F + arg1;
        this.method221(var14, var15, var16, var17, var18, var19, arg6, arg7, arg8);
    }

    @OriginalMember(owner = "client!rg", name = "a", descriptor = "(FFII)V", line = 49)
    public final void method2366(float arg0, float arg1, int arg2, int arg3) {
        this.method2368(arg0, arg1, (float) this.method216() / 2.0F, (float) this.method222() / 2.0F, arg2, arg3, 0, 0, 1);
    }

    @OriginalMember(owner = "client!rg", name = "a", descriptor = "(FFIILhg;II)V", line = 52)
    public final void method2367(float arg0, float arg1, int arg2, int arg3, class313 arg4, int arg5, int arg6) {
        this.method2365(arg0, arg1, (float) this.method216() / 2.0F, (float) this.method222() / 2.0F, arg2, arg3, arg4, arg5, arg6);
    }

    @OriginalMember(owner = "client!rg", name = "a", descriptor = "(FFFFIIIII)V", line = 56)
    private final void method2368(float arg0, float arg1, float arg2, float arg3, int arg4, int arg5, int arg6, int arg7, int arg8) {
        if (arg4 == 0) {
            return;
        }
        double var10 = (double) (arg5 & 0xFFFF) * 9.587379924285257E-5D;
        float var12 = (float) Math.sin(var10) * (float) arg4;
        float var13 = (float) Math.cos(var10) * (float) arg4;
        float var14 = (-arg2 * var13 + -arg3 * var12) / 4096.0F + arg0;
        float var15 = (-arg3 * var13 + arg2 * var12) / 4096.0F + arg1;
        float var16 = (((float) this.method216() - arg2) * var13 + -arg3 * var12) / 4096.0F + arg0;
        float var17 = (-((float) this.method216() - arg2) * var12 + -arg3 * var13) / 4096.0F + arg1;
        float var18 = (-arg2 * var13 + ((float) this.method222() - arg3) * var12) / 4096.0F + arg0;
        float var19 = (arg2 * var12 + ((float) this.method222() - arg3) * var13) / 4096.0F + arg1;
        this.method226(var14, var15, var16, var17, var18, var19, arg6, arg7, arg8);
    }

    @OriginalMember(owner = "client!rg", name = "a", descriptor = "()I")
    public abstract int method216();

    @OriginalMember(owner = "client!rg", name = "a", descriptor = "(IIIII)V")
    public abstract void method214(int arg0, int arg1, int arg2, int arg3, int arg4);

    @OriginalMember(owner = "client!rg", name = "b", descriptor = "()I")
    public abstract int method220();

    @OriginalMember(owner = "client!rg", name = "a", descriptor = "(FFFFFFIII)V")
    public abstract void method226(float arg0, float arg1, float arg2, float arg3, float arg4, float arg5, int arg6, int arg7, int arg8);

    @OriginalMember(owner = "client!rg", name = "a", descriptor = "(IIIIII)V")
    public abstract void method1963(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5);

    @OriginalMember(owner = "client!rg", name = "b", descriptor = "(IIII)V")
    public abstract void method219(int arg0, int arg1, int arg2, int arg3);

    @OriginalMember(owner = "client!rg", name = "a", descriptor = "(FFFFFFLhg;II)V")
    public abstract void method221(float arg0, float arg1, float arg2, float arg3, float arg4, float arg5, class313 arg6, int arg7, int arg8);

    @OriginalMember(owner = "client!rg", name = "c", descriptor = "()I")
    public abstract int method223();

    @OriginalMember(owner = "client!rg", name = "d", descriptor = "()I")
    public abstract int method222();

    @OriginalMember(owner = "client!rg", name = "a", descriptor = "(IIIIIII)V")
    public abstract void method215(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6);

    @OriginalMember(owner = "client!rg", name = "a", descriptor = "(III)V")
    public abstract void method1962(int arg0, int arg1, int arg2);

    @OriginalMember(owner = "client!rg", name = "b", descriptor = "(IIIIIII)V")
    public abstract void method225(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6);

    @OriginalMember(owner = "client!rg", name = "a", descriptor = "(IILhg;II)V")
    public abstract void method217(int arg0, int arg1, class313 arg2, int arg3, int arg4);
}
