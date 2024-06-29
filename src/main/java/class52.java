import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ha")
public abstract class class52 {

    @OriginalMember(owner = "client!ha", name = "a", descriptor = "(IIII)V")
    public final void method284(int arg0, int arg1, int arg2, int arg3) {
        this.method6(arg0, arg1, arg2, arg3, 1, 0, 1);
    }

    @OriginalMember(owner = "client!ha", name = "CA", descriptor = "(FFFFFFIII)V")
    public abstract void method285(float arg0, float arg1, float arg2, float arg3, float arg4, float arg5, int arg6, int arg7, int arg8);

    @OriginalMember(owner = "client!ha", name = "ra", descriptor = "(IIIIIII)V")
    public abstract void method6(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6);

    @OriginalMember(owner = "client!ha", name = "ma", descriptor = "()I")
    public abstract int method286();

    @OriginalMember(owner = "client!ha", name = "a", descriptor = "(FFIIIII)V")
    public final void method287(float arg0, float arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        this.method294(arg0, arg1, (float) this.method292() / 2.0F, (float) this.method286() / 2.0F, arg2, arg3, arg4, arg5, arg6);
    }

    @OriginalMember(owner = "client!ha", name = "a", descriptor = "(FFIILpa;II)V")
    public final void method288(float arg0, float arg1, int arg2, int arg3, class309 arg4, int arg5, int arg6) {
        this.method289(arg0, arg1, (float) this.method292() / 2.0F, (float) this.method286() / 2.0F, arg2, arg3, arg4, arg5, arg6);
    }

    @OriginalMember(owner = "client!ha", name = "a", descriptor = "(FFFFIILpa;II)V")
    public final void method289(float arg0, float arg1, float arg2, float arg3, int arg4, int arg5, class309 arg6, int arg7, int arg8) {
        if (arg4 == 0) {
            return;
        }
        double var10 = (double) (arg5 & 0xFFFF) * 9.587379924285257E-5D;
        float var12 = (float) Math.sin(var10) * (float) arg4;
        float var13 = (float) Math.cos(var10) * (float) arg4;
        float var14 = (-arg2 * var13 + -arg3 * var12) / 4096.0F + arg0;
        float var15 = (-arg3 * var13 + arg2 * var12) / 4096.0F + arg1;
        float var16 = (((float) this.method292() - arg2) * var13 + -arg3 * var12) / 4096.0F + arg0;
        float var17 = (-((float) this.method292() - arg2) * var12 + -arg3 * var13) / 4096.0F + arg1;
        float var18 = (-arg2 * var13 + ((float) this.method286() - arg3) * var12) / 4096.0F + arg0;
        float var19 = (arg2 * var12 + ((float) this.method286() - arg3) * var13) / 4096.0F + arg1;
        this.method298(var14, var15, var16, var17, var18, var19, arg6, arg7, arg8);
    }

    @OriginalMember(owner = "client!ha", name = "la", descriptor = "()I")
    public abstract int method290();

    @OriginalMember(owner = "client!ha", name = "c", descriptor = "()I")
    public abstract int method291();

    @OriginalMember(owner = "client!ha", name = "DA", descriptor = "(IIIII)V")
    public abstract void method3(int arg0, int arg1, int arg2, int arg3, int arg4);

    @OriginalMember(owner = "client!ha", name = "a", descriptor = "(IILpa;II)V")
    public abstract void method7(int arg0, int arg1, class309 arg2, int arg3, int arg4);

    @OriginalMember(owner = "client!ha", name = "EA", descriptor = "()I")
    public abstract int method292();

    @OriginalMember(owner = "client!ha", name = "BA", descriptor = "(III)V")
    public abstract void method5(int arg0, int arg1, int arg2);

    @OriginalMember(owner = "client!ha", name = "b", descriptor = "(IIII)V")
    public final void method293(int arg0, int arg1, int arg2, int arg3) {
        this.method296(arg0, arg1, arg2, arg3, 1, 0, 1);
    }

    @OriginalMember(owner = "client!ha", name = "a", descriptor = "(FFFFIIIII)V")
    private final void method294(float arg0, float arg1, float arg2, float arg3, int arg4, int arg5, int arg6, int arg7, int arg8) {
        if (arg4 == 0) {
            return;
        }
        double var10 = (double) (arg5 & 0xFFFF) * 9.587379924285257E-5D;
        float var12 = (float) Math.sin(var10) * (float) arg4;
        float var13 = (float) Math.cos(var10) * (float) arg4;
        float var14 = (-arg2 * var13 + -arg3 * var12) / 4096.0F + arg0;
        float var15 = (-arg3 * var13 + arg2 * var12) / 4096.0F + arg1;
        float var16 = (((float) this.method292() - arg2) * var13 + -arg3 * var12) / 4096.0F + arg0;
        float var17 = (-((float) this.method292() - arg2) * var12 + -arg3 * var13) / 4096.0F + arg1;
        float var18 = (-arg2 * var13 + ((float) this.method286() - arg3) * var12) / 4096.0F + arg0;
        float var19 = (arg2 * var12 + ((float) this.method286() - arg3) * var13) / 4096.0F + arg1;
        this.method285(var14, var15, var16, var17, var18, var19, arg6, arg7, arg8);
    }

    @OriginalMember(owner = "client!ha", name = "a", descriptor = "(FFII)V")
    public final void method295(float arg0, float arg1, int arg2, int arg3) {
        this.method294(arg0, arg1, (float) this.method292() / 2.0F, (float) this.method286() / 2.0F, arg2, arg3, 1, 0, 1);
    }

    @OriginalMember(owner = "client!ha", name = "i", descriptor = "(IIIIIII)V")
    public abstract void method296(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6);

    @OriginalMember(owner = "client!ha", name = "P", descriptor = "(IIIIII)V")
    public abstract void method4(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5);

    @OriginalMember(owner = "client!ha", name = "KA", descriptor = "(IIII)V")
    public abstract void method297(int arg0, int arg1, int arg2, int arg3);

    @OriginalMember(owner = "client!ha", name = "a", descriptor = "(FFFFFFLpa;II)V")
    public abstract void method298(float arg0, float arg1, float arg2, float arg3, float arg4, float arg5, class309 arg6, int arg7, int arg8);

    @OriginalMember(owner = "client!ha", name = "a", descriptor = "(II)V")
    public final void method299(int arg0, int arg1) {
        this.method3(arg0, arg1, 1, 0, 1);
    }
}
