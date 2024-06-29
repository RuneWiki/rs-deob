import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!f")
public abstract class class536 {

    @OriginalMember(owner = "client!f", name = "a", descriptor = "(IIII)V")
    public final void method2899(int arg0, int arg1, int arg2, int arg3) {
        this.method154(arg0, arg1, arg2, arg3, 1, 0, 1, 1);
    }

    @OriginalMember(owner = "client!f", name = "a", descriptor = "(FFIIIII)V")
    public final void method2900(float arg0, float arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        this.method2908(arg0, arg1, (float) this.method160() / 2.0F, (float) this.method166() / 2.0F, arg2, arg3, arg4, arg5, arg6);
    }

    @OriginalMember(owner = "client!f", name = "a", descriptor = "(IIIIIII)V")
    public final void method2901(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        this.method154(arg0, arg1, arg2, arg3, arg4, arg5, arg6, 1);
    }

    @OriginalMember(owner = "client!f", name = "a", descriptor = "(II)V")
    public final void method2902(int arg0, int arg1) {
        this.method155(arg0, arg1, 1, 0, 1);
    }

    @OriginalMember(owner = "client!f", name = "a", descriptor = "(FFFFIILua;II)V")
    public final void method2903(float arg0, float arg1, float arg2, float arg3, int arg4, int arg5, class600 arg6, int arg7, int arg8) {
        if (arg4 == 0) {
            return;
        }
        double var10 = (double) (arg5 & 0xFFFF) * 9.587379924285257E-5D;
        float var12 = (float) Math.sin(var10) * (float) arg4;
        float var13 = (float) Math.cos(var10) * (float) arg4;
        float var14 = (-arg2 * var13 + -arg3 * var12) / 4096.0F + arg0;
        float var15 = (-arg3 * var13 + arg2 * var12) / 4096.0F + arg1;
        float var16 = (((float) this.method160() - arg2) * var13 + -arg3 * var12) / 4096.0F + arg0;
        float var17 = (-((float) this.method160() - arg2) * var12 + -arg3 * var13) / 4096.0F + arg1;
        float var18 = (-arg2 * var13 + ((float) this.method166() - arg3) * var12) / 4096.0F + arg0;
        float var19 = (arg2 * var12 + ((float) this.method166() - arg3) * var13) / 4096.0F + arg1;
        this.method2905(var14, var15, var16, var17, var18, var19, arg6, arg7, arg8);
    }

    @OriginalMember(owner = "client!f", name = "E", descriptor = "()I")
    public abstract int method167();

    @OriginalMember(owner = "client!f", name = "qa", descriptor = "(FFFFFFIIII)V")
    public abstract void method159(float arg0, float arg1, float arg2, float arg3, float arg4, float arg5, int arg6, int arg7, int arg8, int arg9);

    @OriginalMember(owner = "client!f", name = "xa", descriptor = "(III)V")
    public abstract void method158(int arg0, int arg1, int arg2);

    @OriginalMember(owner = "client!f", name = "a", descriptor = "(FFIILua;II)V")
    public final void method2904(float arg0, float arg1, int arg2, int arg3, class600 arg4, int arg5, int arg6) {
        this.method2903(arg0, arg1, (float) this.method160() / 2.0F, (float) this.method166() / 2.0F, arg2, arg3, arg4, arg5, arg6);
    }

    @OriginalMember(owner = "client!f", name = "A", descriptor = "()I")
    public abstract int method160();

    @OriginalMember(owner = "client!f", name = "a", descriptor = "(FFFFFFLua;II)V")
    private final void method2905(float arg0, float arg1, float arg2, float arg3, float arg4, float arg5, class600 arg6, int arg7, int arg8) {
        this.method163(arg0, arg1, arg2, arg3, arg4, arg5, 1, arg6, arg7, arg8);
    }

    @OriginalMember(owner = "client!f", name = "a", descriptor = "(FFFFFFIII)V")
    private final void method2906(float arg0, float arg1, float arg2, float arg3, float arg4, float arg5, int arg6, int arg7, int arg8) {
        this.method159(arg0, arg1, arg2, arg3, arg4, arg5, arg6, arg7, arg8, 1);
    }

    @OriginalMember(owner = "client!f", name = "DA", descriptor = "(IIIIIII)V")
    public abstract void method164(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6);

    @OriginalMember(owner = "client!f", name = "YA", descriptor = "(IIIIIIII)V")
    public abstract void method154(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7);

    @OriginalMember(owner = "client!f", name = "a", descriptor = "(FFFFFFILua;II)V")
    public abstract void method163(float arg0, float arg1, float arg2, float arg3, float arg4, float arg5, int arg6, class600 arg7, int arg8, int arg9);

    @OriginalMember(owner = "client!f", name = "a", descriptor = "(FFII)V")
    public final void method2907(float arg0, float arg1, int arg2, int arg3) {
        this.method2908(arg0, arg1, (float) this.method160() / 2.0F, (float) this.method166() / 2.0F, arg2, arg3, 1, 0, 1);
    }

    @OriginalMember(owner = "client!f", name = "da", descriptor = "(IIIIII)V")
    public abstract void method156(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5);

    @OriginalMember(owner = "client!f", name = "a", descriptor = "(FFFFIIIII)V")
    private final void method2908(float arg0, float arg1, float arg2, float arg3, int arg4, int arg5, int arg6, int arg7, int arg8) {
        if (arg4 == 0) {
            return;
        }
        double var10 = (double) (arg5 & 0xFFFF) * 9.587379924285257E-5D;
        float var12 = (float) Math.sin(var10) * (float) arg4;
        float var13 = (float) Math.cos(var10) * (float) arg4;
        float var14 = (-arg2 * var13 + -arg3 * var12) / 4096.0F + arg0;
        float var15 = (-arg3 * var13 + arg2 * var12) / 4096.0F + arg1;
        float var16 = (((float) this.method160() - arg2) * var13 + -arg3 * var12) / 4096.0F + arg0;
        float var17 = (-((float) this.method160() - arg2) * var12 + -arg3 * var13) / 4096.0F + arg1;
        float var18 = (-arg2 * var13 + ((float) this.method166() - arg3) * var12) / 4096.0F + arg0;
        float var19 = (arg2 * var12 + ((float) this.method166() - arg3) * var13) / 4096.0F + arg1;
        this.method2906(var14, var15, var16, var17, var18, var19, arg6, arg7, arg8);
    }

    @OriginalMember(owner = "client!f", name = "a", descriptor = "(IILua;II)V")
    public abstract void method153(int arg0, int arg1, class600 arg2, int arg3, int arg4);

    @OriginalMember(owner = "client!f", name = "b", descriptor = "(IIII)V")
    public final void method2909(int arg0, int arg1, int arg2, int arg3) {
        this.method164(arg0, arg1, arg2, arg3, 1, 0, 1);
    }

    @OriginalMember(owner = "client!f", name = "u", descriptor = "()I")
    public abstract int method162();

    @OriginalMember(owner = "client!f", name = "Q", descriptor = "(IIII)V")
    public abstract void method161(int arg0, int arg1, int arg2, int arg3);

    @OriginalMember(owner = "client!f", name = "ca", descriptor = "()I")
    public abstract int method166();

    @OriginalMember(owner = "client!f", name = "V", descriptor = "(IIIII)V")
    public abstract void method155(int arg0, int arg1, int arg2, int arg3, int arg4);
}
