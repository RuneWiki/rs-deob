import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!f")
public abstract class class529 {

    @OriginalMember(owner = "client!f", name = "a", descriptor = "(II)V", line = 3)
    public final void method3109(int arg0, int arg1) {
        this.method158(arg0, arg1, 1, 0, 1);
    }

    @OriginalMember(owner = "client!f", name = "a", descriptor = "(FFIIIII)V", line = 6)
    public final void method3110(float arg0, float arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        this.method3116(arg0, arg1, (float) this.method151() / 2.0F, (float) this.method149() / 2.0F, arg2, arg3, arg4, arg5, arg6);
    }

    @OriginalMember(owner = "client!f", name = "a", descriptor = "(FFIILea;II)V", line = 9)
    public final void method3111(float arg0, float arg1, int arg2, int arg3, class381 arg4, int arg5, int arg6) {
        this.method3112(arg0, arg1, (float) this.method151() / 2.0F, (float) this.method149() / 2.0F, arg2, arg3, arg4, arg5, arg6);
    }

    @OriginalMember(owner = "client!f", name = "a", descriptor = "(FFFFIILea;II)V", line = 16)
    public final void method3112(float arg0, float arg1, float arg2, float arg3, int arg4, int arg5, class381 arg6, int arg7, int arg8) {
        if (arg4 == 0) {
            return;
        }
        double var10 = (double) (arg5 & 0xFFFF) * 9.587379924285257E-5D;
        float var12 = (float) Math.sin(var10) * (float) arg4;
        float var13 = (float) Math.cos(var10) * (float) arg4;
        float var14 = (-arg2 * var13 + -arg3 * var12) / 4096.0F + arg0;
        float var15 = (-arg3 * var13 + arg2 * var12) / 4096.0F + arg1;
        float var16 = (((float) this.method151() - arg2) * var13 + -arg3 * var12) / 4096.0F + arg0;
        float var17 = (-((float) this.method151() - arg2) * var12 + -arg3 * var13) / 4096.0F + arg1;
        float var18 = (-arg2 * var13 + ((float) this.method149() - arg3) * var12) / 4096.0F + arg0;
        float var19 = (arg2 * var12 + ((float) this.method149() - arg3) * var13) / 4096.0F + arg1;
        this.method162(var14, var15, var16, var17, var18, var19, arg6, arg7, arg8);
    }

    @OriginalMember(owner = "client!f", name = "a", descriptor = "(FFII)V", line = 41)
    public final void method3113(float arg0, float arg1, int arg2, int arg3) {
        this.method3116(arg0, arg1, (float) this.method151() / 2.0F, (float) this.method149() / 2.0F, arg2, arg3, 1, 0, 1);
    }

    @OriginalMember(owner = "client!f", name = "a", descriptor = "(IIII)V", line = 53)
    public final void method3114(int arg0, int arg1, int arg2, int arg3) {
        this.method155(arg0, arg1, arg2, arg3, 1, 0, 1);
    }

    @OriginalMember(owner = "client!f", name = "b", descriptor = "(IIII)V", line = 58)
    public final void method3115(int arg0, int arg1, int arg2, int arg3) {
        this.method159(arg0, arg1, arg2, arg3, 1, 0, 1);
    }

    @OriginalMember(owner = "client!f", name = "a", descriptor = "(FFFFIIIII)V", line = 63)
    private final void method3116(float arg0, float arg1, float arg2, float arg3, int arg4, int arg5, int arg6, int arg7, int arg8) {
        if (arg4 == 0) {
            return;
        }
        double var10 = (double) (arg5 & 0xFFFF) * 9.587379924285257E-5D;
        float var12 = (float) Math.sin(var10) * (float) arg4;
        float var13 = (float) Math.cos(var10) * (float) arg4;
        float var14 = (-arg2 * var13 + -arg3 * var12) / 4096.0F + arg0;
        float var15 = (-arg3 * var13 + arg2 * var12) / 4096.0F + arg1;
        float var16 = (((float) this.method151() - arg2) * var13 + -arg3 * var12) / 4096.0F + arg0;
        float var17 = (-((float) this.method151() - arg2) * var12 + -arg3 * var13) / 4096.0F + arg1;
        float var18 = (-arg2 * var13 + ((float) this.method149() - arg3) * var12) / 4096.0F + arg0;
        float var19 = (arg2 * var12 + ((float) this.method149() - arg3) * var13) / 4096.0F + arg1;
        this.method160(var14, var15, var16, var17, var18, var19, arg6, arg7, arg8);
    }

    @OriginalMember(owner = "client!f", name = "M", descriptor = "(IIIIIII)V")
    public abstract void method155(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6);

    @OriginalMember(owner = "client!f", name = "W", descriptor = "(IIIIII)V")
    public abstract void method163(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5);

    @OriginalMember(owner = "client!f", name = "qa", descriptor = "()I")
    public abstract int method161();

    @OriginalMember(owner = "client!f", name = "aa", descriptor = "(FFFFFFIII)V")
    public abstract void method160(float arg0, float arg1, float arg2, float arg3, float arg4, float arg5, int arg6, int arg7, int arg8);

    @OriginalMember(owner = "client!f", name = "JA", descriptor = "()I")
    public abstract int method149();

    @OriginalMember(owner = "client!f", name = "ka", descriptor = "(IIII)V")
    public abstract void method152(int arg0, int arg1, int arg2, int arg3);

    @OriginalMember(owner = "client!f", name = "V", descriptor = "(III)V")
    public abstract void method164(int arg0, int arg1, int arg2);

    @OriginalMember(owner = "client!f", name = "UA", descriptor = "()I")
    public abstract int method154();

    @OriginalMember(owner = "client!f", name = "D", descriptor = "(IIIIIII)V")
    public abstract void method159(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6);

    @OriginalMember(owner = "client!f", name = "ja", descriptor = "()I")
    public abstract int method151();

    @OriginalMember(owner = "client!f", name = "a", descriptor = "(IILea;II)V")
    public abstract void method157(int arg0, int arg1, class381 arg2, int arg3, int arg4);

    @OriginalMember(owner = "client!f", name = "YA", descriptor = "(IIIII)V")
    public abstract void method158(int arg0, int arg1, int arg2, int arg3, int arg4);

    @OriginalMember(owner = "client!f", name = "a", descriptor = "(FFFFFFLea;II)V")
    public abstract void method162(float arg0, float arg1, float arg2, float arg3, float arg4, float arg5, class381 arg6, int arg7, int arg8);
}
