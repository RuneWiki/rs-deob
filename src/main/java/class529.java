import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!f")
public abstract class class529 {

    @OriginalMember(owner = "client!f", name = "a", descriptor = "(II)V", line = 3)
    public final void method3121(int arg0, int arg1) {
        this.method110(arg0, arg1, 1, 0, 1);
    }

    @OriginalMember(owner = "client!f", name = "a", descriptor = "(FFIILea;II)V", line = 7)
    public final void method3122(float arg0, float arg1, int arg2, int arg3, class381 arg4, int arg5, int arg6) {
        this.method3127(arg0, arg1, (float) this.method105() / 2.0F, (float) this.method100() / 2.0F, arg2, arg3, arg4, arg5, arg6);
    }

    @OriginalMember(owner = "client!f", name = "a", descriptor = "(IIII)V", line = 15)
    public final void method3123(int arg0, int arg1, int arg2, int arg3) {
        this.method106(arg0, arg1, arg2, arg3, 1, 0, 1);
    }

    @OriginalMember(owner = "client!f", name = "a", descriptor = "(FFII)V", line = 18)
    public final void method3124(float arg0, float arg1, int arg2, int arg3) {
        this.method3128(arg0, arg1, (float) this.method105() / 2.0F, (float) this.method100() / 2.0F, arg2, arg3, 1, 0, 1);
    }

    @OriginalMember(owner = "client!f", name = "b", descriptor = "(IIII)V", line = 24)
    public final void method3125(int arg0, int arg1, int arg2, int arg3) {
        this.method109(arg0, arg1, arg2, arg3, 1, 0, 1);
    }

    @OriginalMember(owner = "client!f", name = "a", descriptor = "(FFIIIII)V", line = 30)
    public final void method3126(float arg0, float arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        this.method3128(arg0, arg1, (float) this.method105() / 2.0F, (float) this.method100() / 2.0F, arg2, arg3, arg4, arg5, arg6);
    }

    @OriginalMember(owner = "client!f", name = "a", descriptor = "(FFFFIILea;II)V", line = 37)
    public final void method3127(float arg0, float arg1, float arg2, float arg3, int arg4, int arg5, class381 arg6, int arg7, int arg8) {
        if (arg4 == 0) {
            return;
        }
        double var10 = (double) (arg5 & 0xFFFF) * 9.587379924285257E-5D;
        float var12 = (float) Math.sin(var10) * (float) arg4;
        float var13 = (float) Math.cos(var10) * (float) arg4;
        float var14 = (-arg2 * var13 + -arg3 * var12) / 4096.0F + arg0;
        float var15 = (-arg3 * var13 + arg2 * var12) / 4096.0F + arg1;
        float var16 = (((float) this.method105() - arg2) * var13 + -arg3 * var12) / 4096.0F + arg0;
        float var17 = (-((float) this.method105() - arg2) * var12 + -arg3 * var13) / 4096.0F + arg1;
        float var18 = (-arg2 * var13 + ((float) this.method100() - arg3) * var12) / 4096.0F + arg0;
        float var19 = (arg2 * var12 + ((float) this.method100() - arg3) * var13) / 4096.0F + arg1;
        this.method95(var14, var15, var16, var17, var18, var19, arg6, arg7, arg8);
    }

    @OriginalMember(owner = "client!f", name = "a", descriptor = "(FFFFIIIII)V", line = 63)
    private final void method3128(float arg0, float arg1, float arg2, float arg3, int arg4, int arg5, int arg6, int arg7, int arg8) {
        if (arg4 == 0) {
            return;
        }
        double var10 = (double) (arg5 & 0xFFFF) * 9.587379924285257E-5D;
        float var12 = (float) Math.sin(var10) * (float) arg4;
        float var13 = (float) Math.cos(var10) * (float) arg4;
        float var14 = (-arg2 * var13 + -arg3 * var12) / 4096.0F + arg0;
        float var15 = (-arg3 * var13 + arg2 * var12) / 4096.0F + arg1;
        float var16 = (((float) this.method105() - arg2) * var13 + -arg3 * var12) / 4096.0F + arg0;
        float var17 = (-((float) this.method105() - arg2) * var12 + -arg3 * var13) / 4096.0F + arg1;
        float var18 = (-arg2 * var13 + ((float) this.method100() - arg3) * var12) / 4096.0F + arg0;
        float var19 = (arg2 * var12 + ((float) this.method100() - arg3) * var13) / 4096.0F + arg1;
        this.method111(var14, var15, var16, var17, var18, var19, arg6, arg7, arg8);
    }

    @OriginalMember(owner = "client!f", name = "M", descriptor = "(IIIIIII)V")
    public abstract void method106(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6);

    @OriginalMember(owner = "client!f", name = "ja", descriptor = "()I")
    public abstract int method105();

    @OriginalMember(owner = "client!f", name = "UA", descriptor = "()I")
    public abstract int method108();

    @OriginalMember(owner = "client!f", name = "D", descriptor = "(IIIIIII)V")
    public abstract void method109(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6);

    @OriginalMember(owner = "client!f", name = "a", descriptor = "(IILea;II)V")
    public abstract void method98(int arg0, int arg1, class381 arg2, int arg3, int arg4);

    @OriginalMember(owner = "client!f", name = "a", descriptor = "(FFFFFFLea;II)V")
    public abstract void method95(float arg0, float arg1, float arg2, float arg3, float arg4, float arg5, class381 arg6, int arg7, int arg8);

    @OriginalMember(owner = "client!f", name = "YA", descriptor = "(IIIII)V")
    public abstract void method110(int arg0, int arg1, int arg2, int arg3, int arg4);

    @OriginalMember(owner = "client!f", name = "JA", descriptor = "()I")
    public abstract int method100();

    @OriginalMember(owner = "client!f", name = "V", descriptor = "(III)V")
    public abstract void method99(int arg0, int arg1, int arg2);

    @OriginalMember(owner = "client!f", name = "aa", descriptor = "(FFFFFFIII)V")
    public abstract void method111(float arg0, float arg1, float arg2, float arg3, float arg4, float arg5, int arg6, int arg7, int arg8);

    @OriginalMember(owner = "client!f", name = "ka", descriptor = "(IIII)V")
    public abstract void method96(int arg0, int arg1, int arg2, int arg3);

    @OriginalMember(owner = "client!f", name = "W", descriptor = "(IIIIII)V")
    public abstract void method102(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5);

    @OriginalMember(owner = "client!f", name = "qa", descriptor = "()I")
    public abstract int method103();
}
