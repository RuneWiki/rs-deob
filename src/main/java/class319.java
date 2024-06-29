import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!dp")
public abstract class class319 {

    @OriginalMember(owner = "client!dp", name = "a", descriptor = "(IIIIIII)V")
    public abstract void method794(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6);

    @OriginalMember(owner = "client!dp", name = "a", descriptor = "(FFFFFFIII)V")
    public abstract void method790(float arg0, float arg1, float arg2, float arg3, float arg4, float arg5, int arg6, int arg7, int arg8);

    @OriginalMember(owner = "client!dp", name = "a", descriptor = "(III)V")
    public abstract void method814(int arg0, int arg1, int arg2);

    @OriginalMember(owner = "client!dp", name = "a", descriptor = "(II)V")
    public final void method1958(int arg0, int arg1) {
        this.method793(arg0, arg1, 0, 0, 1);
    }

    @OriginalMember(owner = "client!dp", name = "a", descriptor = "(IIIIII)V")
    public abstract void method813(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5);

    @OriginalMember(owner = "client!dp", name = "a", descriptor = "(IIIII)V")
    public abstract void method793(int arg0, int arg1, int arg2, int arg3, int arg4);

    @OriginalMember(owner = "client!dp", name = "a", descriptor = "(IIII)V")
    public abstract void method797(int arg0, int arg1, int arg2, int arg3);

    @OriginalMember(owner = "client!dp", name = "a", descriptor = "()I")
    public abstract int method789();

    @OriginalMember(owner = "client!dp", name = "a", descriptor = "(FFFFIIIII)V")
    private final void method1959(float arg0, float arg1, float arg2, float arg3, int arg4, int arg5, int arg6, int arg7, int arg8) {
        if (arg4 == 0) {
            return;
        }
        double var10 = (double) (arg5 & 0xFFFF) * 9.587379924285257E-5D;
        float var12 = (float) Math.sin(var10) * (float) arg4;
        float var13 = (float) Math.cos(var10) * (float) arg4;
        float var14 = (-arg2 * var13 + -arg3 * var12) / 4096.0F + arg0;
        float var15 = (-arg3 * var13 + arg2 * var12) / 4096.0F + arg1;
        float var16 = (((float) this.method791() - arg2) * var13 + -arg3 * var12) / 4096.0F + arg0;
        float var17 = (-((float) this.method791() - arg2) * var12 + -arg3 * var13) / 4096.0F + arg1;
        float var18 = (-arg2 * var13 + ((float) this.method789() - arg3) * var12) / 4096.0F + arg0;
        float var19 = (arg2 * var12 + ((float) this.method789() - arg3) * var13) / 4096.0F + arg1;
        this.method790(var14, var15, var16, var17, var18, var19, arg6, arg7, arg8);
    }

    @OriginalMember(owner = "client!dp", name = "a", descriptor = "(IILus;II)V")
    public abstract void method795(int arg0, int arg1, class401 arg2, int arg3, int arg4);

    @OriginalMember(owner = "client!dp", name = "a", descriptor = "(FFIILus;II)V")
    public final void method1960(float arg0, float arg1, int arg2, int arg3, class401 arg4, int arg5, int arg6) {
        this.method1963(arg0, arg1, (float) this.method791() / 2.0F, (float) this.method789() / 2.0F, arg2, arg3, arg4, arg5, arg6);
    }

    @OriginalMember(owner = "client!dp", name = "b", descriptor = "(IIIIIII)V")
    public abstract void method792(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6);

    @OriginalMember(owner = "client!dp", name = "a", descriptor = "(FFII)V")
    public final void method1961(float arg0, float arg1, int arg2, int arg3) {
        this.method1959(arg0, arg1, (float) this.method791() / 2.0F, (float) this.method789() / 2.0F, arg2, arg3, 0, 0, 1);
    }

    @OriginalMember(owner = "client!dp", name = "b", descriptor = "(IIII)V")
    public final void method1962(int arg0, int arg1, int arg2, int arg3) {
        this.method792(arg0, arg1, arg2, arg3, 0, 0, 1);
    }

    @OriginalMember(owner = "client!dp", name = "a", descriptor = "(FFFFIILus;II)V")
    public final void method1963(float arg0, float arg1, float arg2, float arg3, int arg4, int arg5, class401 arg6, int arg7, int arg8) {
        if (arg4 == 0) {
            return;
        }
        double var10 = (double) (arg5 & 0xFFFF) * 9.587379924285257E-5D;
        float var12 = (float) Math.sin(var10) * (float) arg4;
        float var13 = (float) Math.cos(var10) * (float) arg4;
        float var14 = (-arg2 * var13 + -arg3 * var12) / 4096.0F + arg0;
        float var15 = (-arg3 * var13 + arg2 * var12) / 4096.0F + arg1;
        float var16 = (((float) this.method791() - arg2) * var13 + -arg3 * var12) / 4096.0F + arg0;
        float var17 = (-((float) this.method791() - arg2) * var12 + -arg3 * var13) / 4096.0F + arg1;
        float var18 = (-arg2 * var13 + ((float) this.method789() - arg3) * var12) / 4096.0F + arg0;
        float var19 = (arg2 * var12 + ((float) this.method789() - arg3) * var13) / 4096.0F + arg1;
        this.method800(var14, var15, var16, var17, var18, var19, arg6, arg7, arg8);
    }

    @OriginalMember(owner = "client!dp", name = "b", descriptor = "()I")
    public abstract int method796();

    @OriginalMember(owner = "client!dp", name = "c", descriptor = "()I")
    public abstract int method791();

    @OriginalMember(owner = "client!dp", name = "a", descriptor = "(FFIIIII)V")
    public final void method1964(float arg0, float arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        this.method1959(arg0, arg1, (float) this.method791() / 2.0F, (float) this.method789() / 2.0F, arg2, arg3, arg4, arg5, arg6);
    }

    @OriginalMember(owner = "client!dp", name = "a", descriptor = "(FFFFFFLus;II)V")
    public abstract void method800(float arg0, float arg1, float arg2, float arg3, float arg4, float arg5, class401 arg6, int arg7, int arg8);

    @OriginalMember(owner = "client!dp", name = "d", descriptor = "()I")
    public abstract int method798();
}
