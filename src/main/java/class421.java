import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!of")
public abstract class class421 {

    @OriginalMember(owner = "client!of", name = "a", descriptor = "(FFII)V", line = 5)
    public final void method2642(float arg0, float arg1, int arg2, int arg3) {
        this.method2648(arg0, arg1, (float) this.method1461() / 2.0F, (float) this.method1463() / 2.0F, arg2, arg3, 0, 0, 1);
    }

    @OriginalMember(owner = "client!of", name = "a", descriptor = "(FFIIIII)V", line = 9)
    public final void method2643(float arg0, float arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        this.method2648(arg0, arg1, (float) this.method1461() / 2.0F, (float) this.method1463() / 2.0F, arg2, arg3, arg4, arg5, arg6);
    }

    @OriginalMember(owner = "client!of", name = "a", descriptor = "(IIII)V", line = 12)
    public final void method2644(int arg0, int arg1, int arg2, int arg3) {
        this.method494(arg0, arg1, arg2, arg3, 0, 0, 1);
    }

    @OriginalMember(owner = "client!of", name = "a", descriptor = "(II)V", line = 18)
    public final void method2645(int arg0, int arg1) {
        this.method498(arg0, arg1, 0, 0, 1);
    }

    @OriginalMember(owner = "client!of", name = "a", descriptor = "(FFFFIILrn;II)V", line = 24)
    public final void method2646(float arg0, float arg1, float arg2, float arg3, int arg4, int arg5, class134 arg6, int arg7, int arg8) {
        if (arg4 == 0) {
            return;
        }
        double var10 = (double) (arg5 & 0xFFFF) * 9.587379924285257E-5D;
        float var12 = (float) Math.sin(var10) * (float) arg4;
        float var13 = (float) Math.cos(var10) * (float) arg4;
        float var14 = (-arg2 * var13 + -arg3 * var12) / 4096.0F + arg0;
        float var15 = (-arg3 * var13 + arg2 * var12) / 4096.0F + arg1;
        float var16 = (((float) this.method1461() - arg2) * var13 + -arg3 * var12) / 4096.0F + arg0;
        float var17 = (-((float) this.method1461() - arg2) * var12 + -arg3 * var13) / 4096.0F + arg1;
        float var18 = (-arg2 * var13 + ((float) this.method1463() - arg3) * var12) / 4096.0F + arg0;
        float var19 = (arg2 * var12 + ((float) this.method1463() - arg3) * var13) / 4096.0F + arg1;
        this.method1466(var14, var15, var16, var17, var18, var19, arg6, arg7, arg8);
    }

    @OriginalMember(owner = "client!of", name = "a", descriptor = "(FFIILrn;II)V", line = 58)
    public final void method2647(float arg0, float arg1, int arg2, int arg3, class134 arg4, int arg5, int arg6) {
        this.method2646(arg0, arg1, (float) this.method1461() / 2.0F, (float) this.method1463() / 2.0F, arg2, arg3, arg4, arg5, arg6);
    }

    @OriginalMember(owner = "client!of", name = "a", descriptor = "(FFFFIIIII)V", line = 61)
    private final void method2648(float arg0, float arg1, float arg2, float arg3, int arg4, int arg5, int arg6, int arg7, int arg8) {
        if (arg4 == 0) {
            return;
        }
        double var10 = (double) (arg5 & 0xFFFF) * 9.587379924285257E-5D;
        float var12 = (float) Math.sin(var10) * (float) arg4;
        float var13 = (float) Math.cos(var10) * (float) arg4;
        float var14 = (-arg2 * var13 + -arg3 * var12) / 4096.0F + arg0;
        float var15 = (-arg3 * var13 + arg2 * var12) / 4096.0F + arg1;
        float var16 = (((float) this.method1461() - arg2) * var13 + -arg3 * var12) / 4096.0F + arg0;
        float var17 = (-((float) this.method1461() - arg2) * var12 + -arg3 * var13) / 4096.0F + arg1;
        float var18 = (-arg2 * var13 + ((float) this.method1463() - arg3) * var12) / 4096.0F + arg0;
        float var19 = (arg2 * var12 + ((float) this.method1463() - arg3) * var13) / 4096.0F + arg1;
        this.method1462(var14, var15, var16, var17, var18, var19, arg6, arg7, arg8);
    }

    @OriginalMember(owner = "client!of", name = "a", descriptor = "(FFFFFFIII)V")
    public abstract void method1462(float arg0, float arg1, float arg2, float arg3, float arg4, float arg5, int arg6, int arg7, int arg8);

    @OriginalMember(owner = "client!of", name = "a", descriptor = "(IILrn;II)V")
    public abstract void method499(int arg0, int arg1, class134 arg2, int arg3, int arg4);

    @OriginalMember(owner = "client!of", name = "a", descriptor = "()I")
    public abstract int method1469();

    @OriginalMember(owner = "client!of", name = "b", descriptor = "(IIII)V")
    public abstract void method1468(int arg0, int arg1, int arg2, int arg3);

    @OriginalMember(owner = "client!of", name = "b", descriptor = "()I")
    public abstract int method1467();

    @OriginalMember(owner = "client!of", name = "a", descriptor = "(IIIIIII)V")
    public abstract void method1464(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6);

    @OriginalMember(owner = "client!of", name = "a", descriptor = "(III)V")
    public abstract void method500(int arg0, int arg1, int arg2);

    @OriginalMember(owner = "client!of", name = "a", descriptor = "(FFFFFFLrn;II)V")
    public abstract void method1466(float arg0, float arg1, float arg2, float arg3, float arg4, float arg5, class134 arg6, int arg7, int arg8);

    @OriginalMember(owner = "client!of", name = "a", descriptor = "(IIIIII)V")
    public abstract void method497(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5);

    @OriginalMember(owner = "client!of", name = "b", descriptor = "(IIIIIII)V")
    public abstract void method494(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6);

    @OriginalMember(owner = "client!of", name = "c", descriptor = "()I")
    public abstract int method1461();

    @OriginalMember(owner = "client!of", name = "d", descriptor = "()I")
    public abstract int method1463();

    @OriginalMember(owner = "client!of", name = "a", descriptor = "(IIIII)V")
    public abstract void method498(int arg0, int arg1, int arg2, int arg3, int arg4);
}
