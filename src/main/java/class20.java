import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!lg")
public abstract class class20 {

    @OriginalMember(owner = "client!lg", name = "a", descriptor = "(II)V", line = 3)
    public final void method93(int arg0, int arg1) {
        this.method100(arg0, arg1, 0, 0, 1);
    }

    @OriginalMember(owner = "client!lg", name = "a", descriptor = "(FFIILgo;II)V", line = 6)
    public final void method94(float arg0, float arg1, int arg2, int arg3, class175 arg4, int arg5, int arg6) {
        this.method112(arg0, arg1, (float) this.method101() / 2.0F, (float) this.method109() / 2.0F, arg2, arg3, arg4, arg5, arg6);
    }

    @OriginalMember(owner = "client!lg", name = "a", descriptor = "(FFIIIII)V", line = 16)
    public final void method99(float arg0, float arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        this.method102(arg0, arg1, (float) this.method101() / 2.0F, (float) this.method109() / 2.0F, arg2, arg3, arg4, arg5, arg6);
    }

    @OriginalMember(owner = "client!lg", name = "a", descriptor = "(FFFFIIIII)V", line = 21)
    private final void method102(float arg0, float arg1, float arg2, float arg3, int arg4, int arg5, int arg6, int arg7, int arg8) {
        if (arg4 == 0) {
            return;
        }
        double var10 = (double) (arg5 & 0xFFFF) * 9.587379924285257E-5D;
        float var12 = (float) Math.sin(var10) * (float) arg4;
        float var13 = (float) Math.cos(var10) * (float) arg4;
        float var14 = (-arg2 * var13 + -arg3 * var12) / 4096.0F + arg0;
        float var15 = (-arg3 * var13 + arg2 * var12) / 4096.0F + arg1;
        float var16 = (((float) this.method101() - arg2) * var13 + -arg3 * var12) / 4096.0F + arg0;
        float var17 = (-((float) this.method101() - arg2) * var12 + -arg3 * var13) / 4096.0F + arg1;
        float var18 = (-arg2 * var13 + ((float) this.method109() - arg3) * var12) / 4096.0F + arg0;
        float var19 = (arg2 * var12 + ((float) this.method109() - arg3) * var13) / 4096.0F + arg1;
        this.method98(var14, var15, var16, var17, var18, var19, arg6, arg7, arg8);
    }

    @OriginalMember(owner = "client!lg", name = "a", descriptor = "(FFII)V", line = 45)
    public final void method103(float arg0, float arg1, int arg2, int arg3) {
        this.method102(arg0, arg1, (float) this.method101() / 2.0F, (float) this.method109() / 2.0F, arg2, arg3, 0, 0, 1);
    }

    @OriginalMember(owner = "client!lg", name = "a", descriptor = "(IIII)V", line = 52)
    public final void method106(int arg0, int arg1, int arg2, int arg3) {
        this.method110(arg0, arg1, arg2, arg3, 0, 0, 1);
    }

    @OriginalMember(owner = "client!lg", name = "a", descriptor = "(FFFFIILgo;II)V", line = 60)
    public final void method112(float arg0, float arg1, float arg2, float arg3, int arg4, int arg5, class175 arg6, int arg7, int arg8) {
        if (arg4 == 0) {
            return;
        }
        double var10 = (double) (arg5 & 0xFFFF) * 9.587379924285257E-5D;
        float var12 = (float) Math.sin(var10) * (float) arg4;
        float var13 = (float) Math.cos(var10) * (float) arg4;
        float var14 = (-arg2 * var13 + -arg3 * var12) / 4096.0F + arg0;
        float var15 = (-arg3 * var13 + arg2 * var12) / 4096.0F + arg1;
        float var16 = (((float) this.method101() - arg2) * var13 + -arg3 * var12) / 4096.0F + arg0;
        float var17 = (-((float) this.method101() - arg2) * var12 + -arg3 * var13) / 4096.0F + arg1;
        float var18 = (-arg2 * var13 + ((float) this.method109() - arg3) * var12) / 4096.0F + arg0;
        float var19 = (arg2 * var12 + ((float) this.method109() - arg3) * var13) / 4096.0F + arg1;
        this.method96(var14, var15, var16, var17, var18, var19, arg6, arg7, arg8);
    }

    @OriginalMember(owner = "client!lg", name = "a", descriptor = "(IIIIII)V")
    public abstract void method95(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5);

    @OriginalMember(owner = "client!lg", name = "a", descriptor = "(FFFFFFLgo;II)V")
    public abstract void method96(float arg0, float arg1, float arg2, float arg3, float arg4, float arg5, class175 arg6, int arg7, int arg8);

    @OriginalMember(owner = "client!lg", name = "a", descriptor = "()I")
    public abstract int method97();

    @OriginalMember(owner = "client!lg", name = "a", descriptor = "(FFFFFFIII)V")
    public abstract void method98(float arg0, float arg1, float arg2, float arg3, float arg4, float arg5, int arg6, int arg7, int arg8);

    @OriginalMember(owner = "client!lg", name = "a", descriptor = "(IIIII)V")
    public abstract void method100(int arg0, int arg1, int arg2, int arg3, int arg4);

    @OriginalMember(owner = "client!lg", name = "b", descriptor = "()I")
    public abstract int method101();

    @OriginalMember(owner = "client!lg", name = "a", descriptor = "(IILgo;II)V")
    public abstract void method104(int arg0, int arg1, class175 arg2, int arg3, int arg4);

    @OriginalMember(owner = "client!lg", name = "c", descriptor = "()I")
    public abstract int method105();

    @OriginalMember(owner = "client!lg", name = "a", descriptor = "(IIIIIII)V")
    public abstract void method107(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6);

    @OriginalMember(owner = "client!lg", name = "b", descriptor = "(IIII)V")
    public abstract void method108(int arg0, int arg1, int arg2, int arg3);

    @OriginalMember(owner = "client!lg", name = "d", descriptor = "()I")
    public abstract int method109();

    @OriginalMember(owner = "client!lg", name = "b", descriptor = "(IIIIIII)V")
    public abstract void method110(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6);

    @OriginalMember(owner = "client!lg", name = "a", descriptor = "(III)V")
    public abstract void method111(int arg0, int arg1, int arg2);
}
