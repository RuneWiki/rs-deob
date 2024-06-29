import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!f")
public abstract class class534 {

    @OriginalMember(owner = "client!f", name = "a", descriptor = "(FFFFFFIII)V", line = 4)
    private final void method2994(float arg0, float arg1, float arg2, float arg3, float arg4, float arg5, int arg6, int arg7, int arg8) {
        this.method310(arg0, arg1, arg2, arg3, arg4, arg5, arg6, arg7, arg8, 1);
    }

    @OriginalMember(owner = "client!f", name = "a", descriptor = "(FFFFIILua;II)V", line = 8)
    public final void method2995(float arg0, float arg1, float arg2, float arg3, int arg4, int arg5, class598 arg6, int arg7, int arg8) {
        if (arg4 == 0) {
            return;
        }
        double var10 = (double) (arg5 & 0xFFFF) * 9.587379924285257E-5D;
        float var12 = (float) Math.sin(var10) * (float) arg4;
        float var13 = (float) Math.cos(var10) * (float) arg4;
        float var14 = (-arg2 * var13 + -arg3 * var12) / 4096.0F + arg0;
        float var15 = (-arg3 * var13 + arg2 * var12) / 4096.0F + arg1;
        float var16 = (((float) this.method312() - arg2) * var13 + -arg3 * var12) / 4096.0F + arg0;
        float var17 = (-((float) this.method312() - arg2) * var12 + -arg3 * var13) / 4096.0F + arg1;
        float var18 = (-arg2 * var13 + ((float) this.method304() - arg3) * var12) / 4096.0F + arg0;
        float var19 = (arg2 * var12 + ((float) this.method304() - arg3) * var13) / 4096.0F + arg1;
        this.method3004(var14, var15, var16, var17, var18, var19, arg6, arg7, arg8);
    }

    @OriginalMember(owner = "client!f", name = "a", descriptor = "(FFFFIIIII)V", line = 33)
    private final void method2996(float arg0, float arg1, float arg2, float arg3, int arg4, int arg5, int arg6, int arg7, int arg8) {
        if (arg4 == 0) {
            return;
        }
        double var10 = (double) (arg5 & 0xFFFF) * 9.587379924285257E-5D;
        float var12 = (float) Math.sin(var10) * (float) arg4;
        float var13 = (float) Math.cos(var10) * (float) arg4;
        float var14 = (-arg2 * var13 + -arg3 * var12) / 4096.0F + arg0;
        float var15 = (-arg3 * var13 + arg2 * var12) / 4096.0F + arg1;
        float var16 = (((float) this.method312() - arg2) * var13 + -arg3 * var12) / 4096.0F + arg0;
        float var17 = (-((float) this.method312() - arg2) * var12 + -arg3 * var13) / 4096.0F + arg1;
        float var18 = (-arg2 * var13 + ((float) this.method304() - arg3) * var12) / 4096.0F + arg0;
        float var19 = (arg2 * var12 + ((float) this.method304() - arg3) * var13) / 4096.0F + arg1;
        this.method2994(var14, var15, var16, var17, var18, var19, arg6, arg7, arg8);
    }

    @OriginalMember(owner = "client!f", name = "a", descriptor = "(IIIIIII)V", line = 57)
    public final void method2997(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        this.method311(arg0, arg1, arg2, arg3, arg4, arg5, arg6, 1);
    }

    @OriginalMember(owner = "client!f", name = "a", descriptor = "(FFIIIII)V", line = 61)
    public final void method2998(float arg0, float arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        this.method2996(arg0, arg1, (float) this.method312() / 2.0F, (float) this.method304() / 2.0F, arg2, arg3, arg4, arg5, arg6);
    }

    @OriginalMember(owner = "client!f", name = "a", descriptor = "(FFII)V", line = 67)
    public final void method2999(float arg0, float arg1, int arg2, int arg3) {
        this.method2996(arg0, arg1, (float) this.method312() / 2.0F, (float) this.method304() / 2.0F, arg2, arg3, 1, 0, 1);
    }

    @OriginalMember(owner = "client!f", name = "a", descriptor = "(FFIILua;II)V", line = 71)
    public final void method3000(float arg0, float arg1, int arg2, int arg3, class598 arg4, int arg5, int arg6) {
        this.method2995(arg0, arg1, (float) this.method312() / 2.0F, (float) this.method304() / 2.0F, arg2, arg3, arg4, arg5, arg6);
    }

    @OriginalMember(owner = "client!f", name = "a", descriptor = "(II)V", line = 75)
    public final void method3001(int arg0, int arg1) {
        this.method314(arg0, arg1, 1, 0, 1);
    }

    @OriginalMember(owner = "client!f", name = "a", descriptor = "(IIII)V", line = 80)
    public final void method3002(int arg0, int arg1, int arg2, int arg3) {
        this.method311(arg0, arg1, arg2, arg3, 1, 0, 1, 1);
    }

    @OriginalMember(owner = "client!f", name = "b", descriptor = "(IIII)V", line = 84)
    public final void method3003(int arg0, int arg1, int arg2, int arg3) {
        this.method307(arg0, arg1, arg2, arg3, 1, 0, 1);
    }

    @OriginalMember(owner = "client!f", name = "a", descriptor = "(FFFFFFLua;II)V", line = 93)
    private final void method3004(float arg0, float arg1, float arg2, float arg3, float arg4, float arg5, class598 arg6, int arg7, int arg8) {
        this.method302(arg0, arg1, arg2, arg3, arg4, arg5, 1, arg6, arg7, arg8);
    }

    @OriginalMember(owner = "client!f", name = "xa", descriptor = "(III)V")
    public abstract void method488(int arg0, int arg1, int arg2);

    @OriginalMember(owner = "client!f", name = "da", descriptor = "(IIIIII)V")
    public abstract void method485(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5);

    @OriginalMember(owner = "client!f", name = "A", descriptor = "()I")
    public abstract int method312();

    @OriginalMember(owner = "client!f", name = "YA", descriptor = "(IIIIIIII)V")
    public abstract void method311(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7);

    @OriginalMember(owner = "client!f", name = "Q", descriptor = "(IIII)V")
    public abstract void method313(int arg0, int arg1, int arg2, int arg3);

    @OriginalMember(owner = "client!f", name = "ca", descriptor = "()I")
    public abstract int method304();

    @OriginalMember(owner = "client!f", name = "V", descriptor = "(IIIII)V")
    public abstract void method314(int arg0, int arg1, int arg2, int arg3, int arg4);

    @OriginalMember(owner = "client!f", name = "u", descriptor = "()I")
    public abstract int method306();

    @OriginalMember(owner = "client!f", name = "qa", descriptor = "(FFFFFFIIII)V")
    public abstract void method310(float arg0, float arg1, float arg2, float arg3, float arg4, float arg5, int arg6, int arg7, int arg8, int arg9);

    @OriginalMember(owner = "client!f", name = "a", descriptor = "(IILua;II)V")
    public abstract void method301(int arg0, int arg1, class598 arg2, int arg3, int arg4);

    @OriginalMember(owner = "client!f", name = "DA", descriptor = "(IIIIIII)V")
    public abstract void method307(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6);

    @OriginalMember(owner = "client!f", name = "E", descriptor = "()I")
    public abstract int method315();

    @OriginalMember(owner = "client!f", name = "a", descriptor = "(FFFFFFILua;II)V")
    public abstract void method302(float arg0, float arg1, float arg2, float arg3, float arg4, float arg5, int arg6, class598 arg7, int arg8, int arg9);
}
