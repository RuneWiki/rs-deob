import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!f")
public abstract class class404 {

    @OriginalMember(owner = "client!f", name = "a", descriptor = "(FFIILea;II)V", line = 3)
    public final void method2401(float arg0, float arg1, int arg2, int arg3, class113 arg4, int arg5, int arg6) {
        this.method2408(arg0, arg1, (float) this.method370() / 2.0F, (float) this.method369() / 2.0F, arg2, arg3, arg4, arg5, arg6);
    }

    @OriginalMember(owner = "client!f", name = "a", descriptor = "(FFIIIII)V", line = 7)
    public final void method2402(float arg0, float arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        this.method2404(arg0, arg1, (float) this.method370() / 2.0F, (float) this.method369() / 2.0F, arg2, arg3, arg4, arg5, arg6);
    }

    @OriginalMember(owner = "client!f", name = "a", descriptor = "(FFII)V", line = 11)
    public final void method2403(float arg0, float arg1, int arg2, int arg3) {
        this.method2404(arg0, arg1, (float) this.method370() / 2.0F, (float) this.method369() / 2.0F, arg2, arg3, 1, 0, 1);
    }

    @OriginalMember(owner = "client!f", name = "a", descriptor = "(FFFFIIIII)V", line = 16)
    private final void method2404(float arg0, float arg1, float arg2, float arg3, int arg4, int arg5, int arg6, int arg7, int arg8) {
        if (arg4 == 0) {
            return;
        }
        double var10 = (double) (arg5 & 0xFFFF) * 9.587379924285257E-5D;
        float var12 = (float) Math.sin(var10) * (float) arg4;
        float var13 = (float) Math.cos(var10) * (float) arg4;
        float var14 = (-arg2 * var13 + -arg3 * var12) / 4096.0F + arg0;
        float var15 = (-arg3 * var13 + arg2 * var12) / 4096.0F + arg1;
        float var16 = (((float) this.method370() - arg2) * var13 + -arg3 * var12) / 4096.0F + arg0;
        float var17 = (-((float) this.method370() - arg2) * var12 + -arg3 * var13) / 4096.0F + arg1;
        float var18 = (-arg2 * var13 + ((float) this.method369() - arg3) * var12) / 4096.0F + arg0;
        float var19 = (arg2 * var12 + ((float) this.method369() - arg3) * var13) / 4096.0F + arg1;
        this.method371(var14, var15, var16, var17, var18, var19, arg6, arg7, arg8);
    }

    @OriginalMember(owner = "client!f", name = "a", descriptor = "(IIII)V", line = 40)
    public final void method2405(int arg0, int arg1, int arg2, int arg3) {
        this.method377(arg0, arg1, arg2, arg3, 1, 0, 1);
    }

    @OriginalMember(owner = "client!f", name = "a", descriptor = "(II)V", line = 53)
    public final void method2406(int arg0, int arg1) {
        this.method353(arg0, arg1, 1, 0, 1);
    }

    @OriginalMember(owner = "client!f", name = "b", descriptor = "(IIII)V", line = 56)
    public final void method2407(int arg0, int arg1, int arg2, int arg3) {
        this.method356(arg0, arg1, arg2, arg3, 1, 0, 1);
    }

    @OriginalMember(owner = "client!f", name = "a", descriptor = "(FFFFIILea;II)V", line = 61)
    public final void method2408(float arg0, float arg1, float arg2, float arg3, int arg4, int arg5, class113 arg6, int arg7, int arg8) {
        if (arg4 == 0) {
            return;
        }
        double var10 = (double) (arg5 & 0xFFFF) * 9.587379924285257E-5D;
        float var12 = (float) Math.sin(var10) * (float) arg4;
        float var13 = (float) Math.cos(var10) * (float) arg4;
        float var14 = (-arg2 * var13 + -arg3 * var12) / 4096.0F + arg0;
        float var15 = (-arg3 * var13 + arg2 * var12) / 4096.0F + arg1;
        float var16 = (((float) this.method370() - arg2) * var13 + -arg3 * var12) / 4096.0F + arg0;
        float var17 = (-((float) this.method370() - arg2) * var12 + -arg3 * var13) / 4096.0F + arg1;
        float var18 = (-arg2 * var13 + ((float) this.method369() - arg3) * var12) / 4096.0F + arg0;
        float var19 = (arg2 * var12 + ((float) this.method369() - arg3) * var13) / 4096.0F + arg1;
        this.method372(var14, var15, var16, var17, var18, var19, arg6, arg7, arg8);
    }

    @OriginalMember(owner = "client!f", name = "ja", descriptor = "()I")
    public abstract int method370();

    @OriginalMember(owner = "client!f", name = "a", descriptor = "(IILea;II)V")
    public abstract void method351(int arg0, int arg1, class113 arg2, int arg3, int arg4);

    @OriginalMember(owner = "client!f", name = "UA", descriptor = "()I")
    public abstract int method375();

    @OriginalMember(owner = "client!f", name = "a", descriptor = "(FFFFFFLea;II)V")
    public abstract void method372(float arg0, float arg1, float arg2, float arg3, float arg4, float arg5, class113 arg6, int arg7, int arg8);

    @OriginalMember(owner = "client!f", name = "D", descriptor = "(IIIIIII)V")
    public abstract void method377(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6);

    @OriginalMember(owner = "client!f", name = "V", descriptor = "(III)V")
    public abstract void method355(int arg0, int arg1, int arg2);

    @OriginalMember(owner = "client!f", name = "qa", descriptor = "()I")
    public abstract int method378();

    @OriginalMember(owner = "client!f", name = "YA", descriptor = "(IIIII)V")
    public abstract void method353(int arg0, int arg1, int arg2, int arg3, int arg4);

    @OriginalMember(owner = "client!f", name = "W", descriptor = "(IIIIII)V")
    public abstract void method354(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5);

    @OriginalMember(owner = "client!f", name = "JA", descriptor = "()I")
    public abstract int method369();

    @OriginalMember(owner = "client!f", name = "ka", descriptor = "(IIII)V")
    public abstract void method379(int arg0, int arg1, int arg2, int arg3);

    @OriginalMember(owner = "client!f", name = "M", descriptor = "(IIIIIII)V")
    public abstract void method356(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6);

    @OriginalMember(owner = "client!f", name = "aa", descriptor = "(FFFFFFIII)V")
    public abstract void method371(float arg0, float arg1, float arg2, float arg3, float arg4, float arg5, int arg6, int arg7, int arg8);
}
