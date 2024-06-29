import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!f")
public abstract class class532 {

    @OriginalMember(owner = "client!f", name = "a", descriptor = "(FFIIIII)V")
    public final void method2984(float arg0, float arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        this.method2988(arg0, arg1, (float) this.method523() / 2.0F, (float) this.method532() / 2.0F, arg2, arg3, arg4, arg5, arg6);
    }

    @OriginalMember(owner = "client!f", name = "a", descriptor = "(FFFFIILua;II)V")
    public final void method2985(float arg0, float arg1, float arg2, float arg3, int arg4, int arg5, class596 arg6, int arg7, int arg8) {
        if (arg4 == 0) {
            return;
        }
        double var10 = (double) (arg5 & 0xFFFF) * 9.587379924285257E-5D;
        float var12 = (float) Math.sin(var10) * (float) arg4;
        float var13 = (float) Math.cos(var10) * (float) arg4;
        float var14 = (-arg2 * var13 + -arg3 * var12) / 4096.0F + arg0;
        float var15 = (-arg3 * var13 + arg2 * var12) / 4096.0F + arg1;
        float var16 = (((float) this.method523() - arg2) * var13 + -arg3 * var12) / 4096.0F + arg0;
        float var17 = (-((float) this.method523() - arg2) * var12 + -arg3 * var13) / 4096.0F + arg1;
        float var18 = (-arg2 * var13 + ((float) this.method532() - arg3) * var12) / 4096.0F + arg0;
        float var19 = (arg2 * var12 + ((float) this.method532() - arg3) * var13) / 4096.0F + arg1;
        this.method2987(var14, var15, var16, var17, var18, var19, arg6, arg7, arg8);
    }

    @OriginalMember(owner = "client!f", name = "da", descriptor = "(IIIIII)V")
    public abstract void method215(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5);

    @OriginalMember(owner = "client!f", name = "xa", descriptor = "(III)V")
    public abstract void method218(int arg0, int arg1, int arg2);

    @OriginalMember(owner = "client!f", name = "a", descriptor = "(FFFFFFIII)V")
    private final void method2986(float arg0, float arg1, float arg2, float arg3, float arg4, float arg5, int arg6, int arg7, int arg8) {
        this.method525(arg0, arg1, arg2, arg3, arg4, arg5, arg6, arg7, arg8, 1);
    }

    @OriginalMember(owner = "client!f", name = "a", descriptor = "(FFFFFFILua;II)V")
    public abstract void method524(float arg0, float arg1, float arg2, float arg3, float arg4, float arg5, int arg6, class596 arg7, int arg8, int arg9);

    @OriginalMember(owner = "client!f", name = "E", descriptor = "()I")
    public abstract int method530();

    @OriginalMember(owner = "client!f", name = "DA", descriptor = "(IIIIIII)V")
    public abstract void method531(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6);

    @OriginalMember(owner = "client!f", name = "V", descriptor = "(IIIII)V")
    public abstract void method217(int arg0, int arg1, int arg2, int arg3, int arg4);

    @OriginalMember(owner = "client!f", name = "a", descriptor = "(FFFFFFLua;II)V")
    private final void method2987(float arg0, float arg1, float arg2, float arg3, float arg4, float arg5, class596 arg6, int arg7, int arg8) {
        this.method524(arg0, arg1, arg2, arg3, arg4, arg5, 1, arg6, arg7, arg8);
    }

    @OriginalMember(owner = "client!f", name = "a", descriptor = "(FFFFIIIII)V")
    private final void method2988(float arg0, float arg1, float arg2, float arg3, int arg4, int arg5, int arg6, int arg7, int arg8) {
        if (arg4 == 0) {
            return;
        }
        double var10 = (double) (arg5 & 0xFFFF) * 9.587379924285257E-5D;
        float var12 = (float) Math.sin(var10) * (float) arg4;
        float var13 = (float) Math.cos(var10) * (float) arg4;
        float var14 = (-arg2 * var13 + -arg3 * var12) / 4096.0F + arg0;
        float var15 = (-arg3 * var13 + arg2 * var12) / 4096.0F + arg1;
        float var16 = (((float) this.method523() - arg2) * var13 + -arg3 * var12) / 4096.0F + arg0;
        float var17 = (-((float) this.method523() - arg2) * var12 + -arg3 * var13) / 4096.0F + arg1;
        float var18 = (-arg2 * var13 + ((float) this.method532() - arg3) * var12) / 4096.0F + arg0;
        float var19 = (arg2 * var12 + ((float) this.method532() - arg3) * var13) / 4096.0F + arg1;
        this.method2986(var14, var15, var16, var17, var18, var19, arg6, arg7, arg8);
    }

    @OriginalMember(owner = "client!f", name = "a", descriptor = "(FFII)V")
    public final void method2989(float arg0, float arg1, int arg2, int arg3) {
        this.method2988(arg0, arg1, (float) this.method523() / 2.0F, (float) this.method532() / 2.0F, arg2, arg3, 1, 0, 1);
    }

    @OriginalMember(owner = "client!f", name = "A", descriptor = "()I")
    public abstract int method523();

    @OriginalMember(owner = "client!f", name = "a", descriptor = "(II)V")
    public final void method2990(int arg0, int arg1) {
        this.method217(arg0, arg1, 1, 0, 1);
    }

    @OriginalMember(owner = "client!f", name = "qa", descriptor = "(FFFFFFIIII)V")
    public abstract void method525(float arg0, float arg1, float arg2, float arg3, float arg4, float arg5, int arg6, int arg7, int arg8, int arg9);

    @OriginalMember(owner = "client!f", name = "a", descriptor = "(IIIIIII)V")
    public final void method2991(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        this.method213(arg0, arg1, arg2, arg3, arg4, arg5, arg6, 1);
    }

    @OriginalMember(owner = "client!f", name = "a", descriptor = "(IIII)V")
    public final void method2992(int arg0, int arg1, int arg2, int arg3) {
        this.method531(arg0, arg1, arg2, arg3, 1, 0, 1);
    }

    @OriginalMember(owner = "client!f", name = "b", descriptor = "(IIII)V")
    public final void method2993(int arg0, int arg1, int arg2, int arg3) {
        this.method213(arg0, arg1, arg2, arg3, 1, 0, 1, 1);
    }

    @OriginalMember(owner = "client!f", name = "ca", descriptor = "()I")
    public abstract int method532();

    @OriginalMember(owner = "client!f", name = "a", descriptor = "(IILua;II)V")
    public abstract void method219(int arg0, int arg1, class596 arg2, int arg3, int arg4);

    @OriginalMember(owner = "client!f", name = "a", descriptor = "(FFIILua;II)V")
    public final void method2994(float arg0, float arg1, int arg2, int arg3, class596 arg4, int arg5, int arg6) {
        this.method2985(arg0, arg1, (float) this.method523() / 2.0F, (float) this.method532() / 2.0F, arg2, arg3, arg4, arg5, arg6);
    }

    @OriginalMember(owner = "client!f", name = "u", descriptor = "()I")
    public abstract int method529();

    @OriginalMember(owner = "client!f", name = "Q", descriptor = "(IIII)V")
    public abstract void method527(int arg0, int arg1, int arg2, int arg3);

    @OriginalMember(owner = "client!f", name = "YA", descriptor = "(IIIIIIII)V")
    public abstract void method213(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7);
}
