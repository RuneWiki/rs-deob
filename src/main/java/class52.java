import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ha")
public abstract class class52 {

    @OriginalMember(owner = "client!ha", name = "P", descriptor = "(IIIIII)V")
    public abstract void method494(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5);

    @OriginalMember(owner = "client!ha", name = "i", descriptor = "(IIIIIII)V")
    public abstract void method426(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6);

    @OriginalMember(owner = "client!ha", name = "a", descriptor = "(IIII)V")
    public final void method495(int arg0, int arg1, int arg2, int arg3) {
        this.method426(arg0, arg1, arg2, arg3, 1, 0, 1);
    }

    @OriginalMember(owner = "client!ha", name = "KA", descriptor = "(IIII)V")
    public abstract void method420(int arg0, int arg1, int arg2, int arg3);

    @OriginalMember(owner = "client!ha", name = "CA", descriptor = "(FFFFFFIII)V")
    public abstract void method424(float arg0, float arg1, float arg2, float arg3, float arg4, float arg5, int arg6, int arg7, int arg8);

    @OriginalMember(owner = "client!ha", name = "DA", descriptor = "(IIIII)V")
    public abstract void method421(int arg0, int arg1, int arg2, int arg3, int arg4);

    @OriginalMember(owner = "client!ha", name = "ma", descriptor = "()I")
    public abstract int method432();

    @OriginalMember(owner = "client!ha", name = "a", descriptor = "(FFFFIILpa;II)V")
    public final void method496(float arg0, float arg1, float arg2, float arg3, int arg4, int arg5, class310 arg6, int arg7, int arg8) {
        if (arg4 == 0) {
            return;
        }
        double var10 = (double) (arg5 & 0xFFFF) * 9.587379924285257E-5D;
        float var12 = (float) Math.sin(var10) * (float) arg4;
        float var13 = (float) Math.cos(var10) * (float) arg4;
        float var14 = (-arg2 * var13 + -arg3 * var12) / 4096.0F + arg0;
        float var15 = (-arg3 * var13 + arg2 * var12) / 4096.0F + arg1;
        float var16 = (((float) this.method419() - arg2) * var13 + -arg3 * var12) / 4096.0F + arg0;
        float var17 = (-((float) this.method419() - arg2) * var12 + -arg3 * var13) / 4096.0F + arg1;
        float var18 = (-arg2 * var13 + ((float) this.method432() - arg3) * var12) / 4096.0F + arg0;
        float var19 = (arg2 * var12 + ((float) this.method432() - arg3) * var13) / 4096.0F + arg1;
        this.method428(var14, var15, var16, var17, var18, var19, arg6, arg7, arg8);
    }

    @OriginalMember(owner = "client!ha", name = "ra", descriptor = "(IIIIIII)V")
    public abstract void method423(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6);

    @OriginalMember(owner = "client!ha", name = "a", descriptor = "(II)V")
    public final void method497(int arg0, int arg1) {
        this.method421(arg0, arg1, 1, 0, 1);
    }

    @OriginalMember(owner = "client!ha", name = "a", descriptor = "(FFIIIII)V")
    public final void method498(float arg0, float arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        this.method503(arg0, arg1, (float) this.method419() / 2.0F, (float) this.method432() / 2.0F, arg2, arg3, arg4, arg5, arg6);
    }

    @OriginalMember(owner = "client!ha", name = "EA", descriptor = "()I")
    public abstract int method419();

    @OriginalMember(owner = "client!ha", name = "c", descriptor = "()I")
    public abstract int method429();

    @OriginalMember(owner = "client!ha", name = "b", descriptor = "(IIII)V")
    public final void method499(int arg0, int arg1, int arg2, int arg3) {
        this.method423(arg0, arg1, arg2, arg3, 1, 0, 1);
    }

    @OriginalMember(owner = "client!ha", name = "a", descriptor = "(IILpa;II)V")
    public abstract void method431(int arg0, int arg1, class310 arg2, int arg3, int arg4);

    @OriginalMember(owner = "client!ha", name = "a", descriptor = "(FFII)V")
    public final void method500(float arg0, float arg1, int arg2, int arg3) {
        this.method503(arg0, arg1, (float) this.method419() / 2.0F, (float) this.method432() / 2.0F, arg2, arg3, 1, 0, 1);
    }

    @OriginalMember(owner = "client!ha", name = "la", descriptor = "()I")
    public abstract int method422();

    @OriginalMember(owner = "client!ha", name = "a", descriptor = "(FFIILpa;II)V")
    public final void method501(float arg0, float arg1, int arg2, int arg3, class310 arg4, int arg5, int arg6) {
        this.method496(arg0, arg1, (float) this.method419() / 2.0F, (float) this.method432() / 2.0F, arg2, arg3, arg4, arg5, arg6);
    }

    @OriginalMember(owner = "client!ha", name = "BA", descriptor = "(III)V")
    public abstract void method502(int arg0, int arg1, int arg2);

    @OriginalMember(owner = "client!ha", name = "a", descriptor = "(FFFFFFLpa;II)V")
    public abstract void method428(float arg0, float arg1, float arg2, float arg3, float arg4, float arg5, class310 arg6, int arg7, int arg8);

    @OriginalMember(owner = "client!ha", name = "a", descriptor = "(FFFFIIIII)V")
    private final void method503(float arg0, float arg1, float arg2, float arg3, int arg4, int arg5, int arg6, int arg7, int arg8) {
        if (arg4 == 0) {
            return;
        }
        double var10 = (double) (arg5 & 0xFFFF) * 9.587379924285257E-5D;
        float var12 = (float) Math.sin(var10) * (float) arg4;
        float var13 = (float) Math.cos(var10) * (float) arg4;
        float var14 = (-arg2 * var13 + -arg3 * var12) / 4096.0F + arg0;
        float var15 = (-arg3 * var13 + arg2 * var12) / 4096.0F + arg1;
        float var16 = (((float) this.method419() - arg2) * var13 + -arg3 * var12) / 4096.0F + arg0;
        float var17 = (-((float) this.method419() - arg2) * var12 + -arg3 * var13) / 4096.0F + arg1;
        float var18 = (-arg2 * var13 + ((float) this.method432() - arg3) * var12) / 4096.0F + arg0;
        float var19 = (arg2 * var12 + ((float) this.method432() - arg3) * var13) / 4096.0F + arg1;
        this.method424(var14, var15, var16, var17, var18, var19, arg6, arg7, arg8);
    }
}
