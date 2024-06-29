import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!f")
public abstract class class528 {

    @OriginalMember(owner = "client!f", name = "a", descriptor = "(FFFFIILea;II)V", line = 5)
    public final void method3126(float arg0, float arg1, float arg2, float arg3, int arg4, int arg5, class381 arg6, int arg7, int arg8) {
        if (arg4 == 0) {
            return;
        }
        double var10 = (double) (arg5 & 0xFFFF) * 9.587379924285257E-5D;
        float var12 = (float) Math.sin(var10) * (float) arg4;
        float var13 = (float) Math.cos(var10) * (float) arg4;
        float var14 = (-arg2 * var13 + -arg3 * var12) / 4096.0F + arg0;
        float var15 = (-arg3 * var13 + arg2 * var12) / 4096.0F + arg1;
        float var16 = (((float) this.method134() - arg2) * var13 + -arg3 * var12) / 4096.0F + arg0;
        float var17 = (-((float) this.method134() - arg2) * var12 + -arg3 * var13) / 4096.0F + arg1;
        float var18 = (-arg2 * var13 + ((float) this.method131() - arg3) * var12) / 4096.0F + arg0;
        float var19 = (arg2 * var12 + ((float) this.method131() - arg3) * var13) / 4096.0F + arg1;
        this.method144(var14, var15, var16, var17, var18, var19, arg6, arg7, arg8);
    }

    @OriginalMember(owner = "client!f", name = "a", descriptor = "(IIII)V", line = 30)
    public final void method3127(int arg0, int arg1, int arg2, int arg3) {
        this.method136(arg0, arg1, arg2, arg3, 1, 0, 1);
    }

    @OriginalMember(owner = "client!f", name = "b", descriptor = "(IIII)V", line = 36)
    public final void method3128(int arg0, int arg1, int arg2, int arg3) {
        this.method145(arg0, arg1, arg2, arg3, 1, 0, 1);
    }

    @OriginalMember(owner = "client!f", name = "a", descriptor = "(II)V", line = 43)
    public final void method3129(int arg0, int arg1) {
        this.method133(arg0, arg1, 1, 0, 1);
    }

    @OriginalMember(owner = "client!f", name = "a", descriptor = "(FFII)V", line = 49)
    public final void method3130(float arg0, float arg1, int arg2, int arg3) {
        this.method3132(arg0, arg1, (float) this.method134() / 2.0F, (float) this.method131() / 2.0F, arg2, arg3, 1, 0, 1);
    }

    @OriginalMember(owner = "client!f", name = "a", descriptor = "(FFIIIII)V", line = 54)
    public final void method3131(float arg0, float arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        this.method3132(arg0, arg1, (float) this.method134() / 2.0F, (float) this.method131() / 2.0F, arg2, arg3, arg4, arg5, arg6);
    }

    @OriginalMember(owner = "client!f", name = "a", descriptor = "(FFFFIIIII)V", line = 59)
    private final void method3132(float arg0, float arg1, float arg2, float arg3, int arg4, int arg5, int arg6, int arg7, int arg8) {
        if (arg4 == 0) {
            return;
        }
        double var10 = (double) (arg5 & 0xFFFF) * 9.587379924285257E-5D;
        float var12 = (float) Math.sin(var10) * (float) arg4;
        float var13 = (float) Math.cos(var10) * (float) arg4;
        float var14 = (-arg2 * var13 + -arg3 * var12) / 4096.0F + arg0;
        float var15 = (-arg3 * var13 + arg2 * var12) / 4096.0F + arg1;
        float var16 = (((float) this.method134() - arg2) * var13 + -arg3 * var12) / 4096.0F + arg0;
        float var17 = (-((float) this.method134() - arg2) * var12 + -arg3 * var13) / 4096.0F + arg1;
        float var18 = (-arg2 * var13 + ((float) this.method131() - arg3) * var12) / 4096.0F + arg0;
        float var19 = (arg2 * var12 + ((float) this.method131() - arg3) * var13) / 4096.0F + arg1;
        this.method132(var14, var15, var16, var17, var18, var19, arg6, arg7, arg8);
    }

    @OriginalMember(owner = "client!f", name = "a", descriptor = "(FFIILea;II)V", line = 83)
    public final void method3133(float arg0, float arg1, int arg2, int arg3, class381 arg4, int arg5, int arg6) {
        this.method3126(arg0, arg1, (float) this.method134() / 2.0F, (float) this.method131() / 2.0F, arg2, arg3, arg4, arg5, arg6);
    }

    @OriginalMember(owner = "client!f", name = "ka", descriptor = "(IIII)V")
    public abstract void method141(int arg0, int arg1, int arg2, int arg3);

    @OriginalMember(owner = "client!f", name = "a", descriptor = "(IILea;II)V")
    public abstract void method138(int arg0, int arg1, class381 arg2, int arg3, int arg4);

    @OriginalMember(owner = "client!f", name = "JA", descriptor = "()I")
    public abstract int method131();

    @OriginalMember(owner = "client!f", name = "V", descriptor = "(III)V")
    public abstract void method140(int arg0, int arg1, int arg2);

    @OriginalMember(owner = "client!f", name = "YA", descriptor = "(IIIII)V")
    public abstract void method133(int arg0, int arg1, int arg2, int arg3, int arg4);

    @OriginalMember(owner = "client!f", name = "UA", descriptor = "()I")
    public abstract int method137();

    @OriginalMember(owner = "client!f", name = "W", descriptor = "(IIIIII)V")
    public abstract void method143(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5);

    @OriginalMember(owner = "client!f", name = "D", descriptor = "(IIIIIII)V")
    public abstract void method145(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6);

    @OriginalMember(owner = "client!f", name = "M", descriptor = "(IIIIIII)V")
    public abstract void method136(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6);

    @OriginalMember(owner = "client!f", name = "qa", descriptor = "()I")
    public abstract int method139();

    @OriginalMember(owner = "client!f", name = "aa", descriptor = "(FFFFFFIII)V")
    public abstract void method132(float arg0, float arg1, float arg2, float arg3, float arg4, float arg5, int arg6, int arg7, int arg8);

    @OriginalMember(owner = "client!f", name = "ja", descriptor = "()I")
    public abstract int method134();

    @OriginalMember(owner = "client!f", name = "a", descriptor = "(FFFFFFLea;II)V")
    public abstract void method144(float arg0, float arg1, float arg2, float arg3, float arg4, float arg5, class381 arg6, int arg7, int arg8);
}
