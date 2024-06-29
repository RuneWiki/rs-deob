import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!f")
public abstract class class702 {

    @OriginalMember(owner = "client!f", name = "a", descriptor = "(FFFFIIIII)V", line = 3)
    private final void method3925(float arg0, float arg1, float arg2, float arg3, int arg4, int arg5, int arg6, int arg7, int arg8) {
        if (arg4 == 0) {
            return;
        }
        double var10 = (double) (arg5 & 0xFFFF) * 9.587379924285257E-5D;
        float var12 = (float) Math.sin(var10) * (float) arg4;
        float var13 = (float) Math.cos(var10) * (float) arg4;
        float var14 = (-arg2 * var13 + -arg3 * var12) / 4096.0F + arg0;
        float var15 = (-arg3 * var13 + arg2 * var12) / 4096.0F + arg1;
        float var16 = (((float) this.method1660() - arg2) * var13 + -arg3 * var12) / 4096.0F + arg0;
        float var17 = (-((float) this.method1660() - arg2) * var12 + -arg3 * var13) / 4096.0F + arg1;
        float var18 = (-arg2 * var13 + ((float) this.method1661() - arg3) * var12) / 4096.0F + arg0;
        float var19 = (arg2 * var12 + ((float) this.method1661() - arg3) * var13) / 4096.0F + arg1;
        this.method3931(var14, var15, var16, var17, var18, var19, arg6, arg7, arg8);
    }

    @OriginalMember(owner = "client!f", name = "a", descriptor = "(IIII)V", line = 29)
    public final void method3926(int arg0, int arg1, int arg2, int arg3) {
        this.method1656(arg0, arg1, arg2, arg3, 1, 0, 1);
    }

    @OriginalMember(owner = "client!f", name = "a", descriptor = "(II)V", line = 32)
    public final void method3927(int arg0, int arg1) {
        this.method935(arg0, arg1, 1, 0, 1);
    }

    @OriginalMember(owner = "client!f", name = "a", descriptor = "(FFFFIILua;II)V", line = 35)
    public final void method3928(float arg0, float arg1, float arg2, float arg3, int arg4, int arg5, class618 arg6, int arg7, int arg8) {
        if (arg4 == 0) {
            return;
        }
        double var10 = (double) (arg5 & 0xFFFF) * 9.587379924285257E-5D;
        float var12 = (float) Math.sin(var10) * (float) arg4;
        float var13 = (float) Math.cos(var10) * (float) arg4;
        float var14 = (-arg2 * var13 + -arg3 * var12) / 4096.0F + arg0;
        float var15 = (-arg3 * var13 + arg2 * var12) / 4096.0F + arg1;
        float var16 = (((float) this.method1660() - arg2) * var13 + -arg3 * var12) / 4096.0F + arg0;
        float var17 = (-((float) this.method1660() - arg2) * var12 + -arg3 * var13) / 4096.0F + arg1;
        float var18 = (-arg2 * var13 + ((float) this.method1661() - arg3) * var12) / 4096.0F + arg0;
        float var19 = (arg2 * var12 + ((float) this.method1661() - arg3) * var13) / 4096.0F + arg1;
        this.method3930(var14, var15, var16, var17, var18, var19, arg6, arg7, arg8);
    }

    @OriginalMember(owner = "client!f", name = "a", descriptor = "(FFII)V", line = 60)
    public final void method3929(float arg0, float arg1, int arg2, int arg3) {
        this.method3925(arg0, arg1, (float) this.method1660() / 2.0F, (float) this.method1661() / 2.0F, arg2, arg3, 1, 0, 1);
    }

    @OriginalMember(owner = "client!f", name = "a", descriptor = "(FFFFFFLua;II)V", line = 65)
    private final void method3930(float arg0, float arg1, float arg2, float arg3, float arg4, float arg5, class618 arg6, int arg7, int arg8) {
        this.method1659(arg0, arg1, arg2, arg3, arg4, arg5, 1, arg6, arg7, arg8);
    }

    @OriginalMember(owner = "client!f", name = "a", descriptor = "(FFFFFFIII)V", line = 74)
    private final void method3931(float arg0, float arg1, float arg2, float arg3, float arg4, float arg5, int arg6, int arg7, int arg8) {
        this.method1657(arg0, arg1, arg2, arg3, arg4, arg5, arg6, arg7, arg8, 1);
    }

    @OriginalMember(owner = "client!f", name = "b", descriptor = "(IIII)V", line = 77)
    public final void method3932(int arg0, int arg1, int arg2, int arg3) {
        this.method938(arg0, arg1, arg2, arg3, 1, 0, 1, 1);
    }

    @OriginalMember(owner = "client!f", name = "a", descriptor = "(FFIIIII)V", line = 82)
    public final void method3933(float arg0, float arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        this.method3925(arg0, arg1, (float) this.method1660() / 2.0F, (float) this.method1661() / 2.0F, arg2, arg3, arg4, arg5, arg6);
    }

    @OriginalMember(owner = "client!f", name = "a", descriptor = "(IIIIIII)V", line = 88)
    public final void method3934(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        this.method938(arg0, arg1, arg2, arg3, arg4, arg5, arg6, 1);
    }

    @OriginalMember(owner = "client!f", name = "a", descriptor = "(FFIILua;II)V", line = 91)
    public final void method3935(float arg0, float arg1, int arg2, int arg3, class618 arg4, int arg5, int arg6) {
        this.method3928(arg0, arg1, (float) this.method1660() / 2.0F, (float) this.method1661() / 2.0F, arg2, arg3, arg4, arg5, arg6);
    }

    @OriginalMember(owner = "client!f", name = "ca", descriptor = "()I")
    public abstract int method1661();

    @OriginalMember(owner = "client!f", name = "Q", descriptor = "(IIII)V")
    public abstract void method1663(int arg0, int arg1, int arg2, int arg3);

    @OriginalMember(owner = "client!f", name = "E", descriptor = "()I")
    public abstract int method1658();

    @OriginalMember(owner = "client!f", name = "xa", descriptor = "(III)V")
    public abstract void method939(int arg0, int arg1, int arg2);

    @OriginalMember(owner = "client!f", name = "da", descriptor = "(IIIIII)V")
    public abstract void method936(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5);

    @OriginalMember(owner = "client!f", name = "a", descriptor = "(IILua;II)V")
    public abstract void method932(int arg0, int arg1, class618 arg2, int arg3, int arg4);

    @OriginalMember(owner = "client!f", name = "a", descriptor = "(FFFFFFILua;II)V")
    public abstract void method1659(float arg0, float arg1, float arg2, float arg3, float arg4, float arg5, int arg6, class618 arg7, int arg8, int arg9);

    @OriginalMember(owner = "client!f", name = "qa", descriptor = "(FFFFFFIIII)V")
    public abstract void method1657(float arg0, float arg1, float arg2, float arg3, float arg4, float arg5, int arg6, int arg7, int arg8, int arg9);

    @OriginalMember(owner = "client!f", name = "u", descriptor = "()I")
    public abstract int method1653();

    @OriginalMember(owner = "client!f", name = "A", descriptor = "()I")
    public abstract int method1660();

    @OriginalMember(owner = "client!f", name = "YA", descriptor = "(IIIIIIII)V")
    public abstract void method938(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7);

    @OriginalMember(owner = "client!f", name = "V", descriptor = "(IIIII)V")
    public abstract void method935(int arg0, int arg1, int arg2, int arg3, int arg4);

    @OriginalMember(owner = "client!f", name = "DA", descriptor = "(IIIIIII)V")
    public abstract void method1656(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6);
}
