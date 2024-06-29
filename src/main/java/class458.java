import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!xa")
public abstract class class458 {

    @OriginalMember(owner = "client!xa", name = "b", descriptor = "()I")
    public abstract int method417();

    @OriginalMember(owner = "client!xa", name = "KA", descriptor = "(IIIIIII)V")
    public abstract void method413(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6);

    @OriginalMember(owner = "client!xa", name = "QA", descriptor = "()I")
    public abstract int method415();

    @OriginalMember(owner = "client!xa", name = "a", descriptor = "(IIII)V")
    public final void method2608(int arg0, int arg1, int arg2, int arg3) {
        this.method420(arg0, arg1, arg2, arg3, 1, 0, 1);
    }

    @OriginalMember(owner = "client!xa", name = "I", descriptor = "(IIIII)V")
    public abstract void method416(int arg0, int arg1, int arg2, int arg3, int arg4);

    @OriginalMember(owner = "client!xa", name = "a", descriptor = "(FFII)V")
    public final void method2609(float arg0, float arg1, int arg2, int arg3) {
        this.method2610(arg0, arg1, (float) this.method418() / 2.0F, (float) this.method408() / 2.0F, arg2, arg3, 1, 0, 1);
    }

    @OriginalMember(owner = "client!xa", name = "ba", descriptor = "(IIIIIII)V")
    public abstract void method420(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6);

    @OriginalMember(owner = "client!xa", name = "EA", descriptor = "(IIII)V")
    public abstract void method409(int arg0, int arg1, int arg2, int arg3);

    @OriginalMember(owner = "client!xa", name = "a", descriptor = "(FFFFIIIII)V")
    private final void method2610(float arg0, float arg1, float arg2, float arg3, int arg4, int arg5, int arg6, int arg7, int arg8) {
        if (arg4 == 0) {
            return;
        }
        double var10 = (double) (arg5 & 0xFFFF) * 9.587379924285257E-5D;
        float var12 = (float) Math.sin(var10) * (float) arg4;
        float var13 = (float) Math.cos(var10) * (float) arg4;
        float var14 = (-arg2 * var13 + -arg3 * var12) / 4096.0F + arg0;
        float var15 = (-arg3 * var13 + arg2 * var12) / 4096.0F + arg1;
        float var16 = (((float) this.method418() - arg2) * var13 + -arg3 * var12) / 4096.0F + arg0;
        float var17 = (-((float) this.method418() - arg2) * var12 + -arg3 * var13) / 4096.0F + arg1;
        float var18 = (-arg2 * var13 + ((float) this.method408() - arg3) * var12) / 4096.0F + arg0;
        float var19 = (arg2 * var12 + ((float) this.method408() - arg3) * var13) / 4096.0F + arg1;
        this.method419(var14, var15, var16, var17, var18, var19, arg6, arg7, arg8);
    }

    @OriginalMember(owner = "client!xa", name = "a", descriptor = "(IILfa;II)V")
    public abstract void method410(int arg0, int arg1, class213 arg2, int arg3, int arg4);

    @OriginalMember(owner = "client!xa", name = "a", descriptor = "(FFFFFFLfa;II)V")
    public abstract void method421(float arg0, float arg1, float arg2, float arg3, float arg4, float arg5, class213 arg6, int arg7, int arg8);

    @OriginalMember(owner = "client!xa", name = "b", descriptor = "(IIII)V")
    public final void method2611(int arg0, int arg1, int arg2, int arg3) {
        this.method413(arg0, arg1, arg2, arg3, 1, 0, 1);
    }

    @OriginalMember(owner = "client!xa", name = "sa", descriptor = "(FFFFFFIII)V")
    public abstract void method419(float arg0, float arg1, float arg2, float arg3, float arg4, float arg5, int arg6, int arg7, int arg8);

    @OriginalMember(owner = "client!xa", name = "GA", descriptor = "(IIIIII)V")
    public abstract void method411(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5);

    @OriginalMember(owner = "client!xa", name = "a", descriptor = "(II)V")
    public final void method2612(int arg0, int arg1) {
        this.method416(arg0, arg1, 1, 0, 1);
    }

    @OriginalMember(owner = "client!xa", name = "a", descriptor = "(FFIILfa;II)V")
    public final void method2613(float arg0, float arg1, int arg2, int arg3, class213 arg4, int arg5, int arg6) {
        this.method2615(arg0, arg1, (float) this.method418() / 2.0F, (float) this.method408() / 2.0F, arg2, arg3, arg4, arg5, arg6);
    }

    @OriginalMember(owner = "client!xa", name = "AA", descriptor = "()I")
    public abstract int method418();

    @OriginalMember(owner = "client!xa", name = "a", descriptor = "(FFIIIII)V")
    public final void method2614(float arg0, float arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        this.method2610(arg0, arg1, (float) this.method418() / 2.0F, (float) this.method408() / 2.0F, arg2, arg3, arg4, arg5, arg6);
    }

    @OriginalMember(owner = "client!xa", name = "a", descriptor = "()I")
    public abstract int method408();

    @OriginalMember(owner = "client!xa", name = "a", descriptor = "(FFFFIILfa;II)V")
    public final void method2615(float arg0, float arg1, float arg2, float arg3, int arg4, int arg5, class213 arg6, int arg7, int arg8) {
        if (arg4 == 0) {
            return;
        }
        double var10 = (double) (arg5 & 0xFFFF) * 9.587379924285257E-5D;
        float var12 = (float) Math.sin(var10) * (float) arg4;
        float var13 = (float) Math.cos(var10) * (float) arg4;
        float var14 = (-arg2 * var13 + -arg3 * var12) / 4096.0F + arg0;
        float var15 = (-arg3 * var13 + arg2 * var12) / 4096.0F + arg1;
        float var16 = (((float) this.method418() - arg2) * var13 + -arg3 * var12) / 4096.0F + arg0;
        float var17 = (-((float) this.method418() - arg2) * var12 + -arg3 * var13) / 4096.0F + arg1;
        float var18 = (-arg2 * var13 + ((float) this.method408() - arg3) * var12) / 4096.0F + arg0;
        float var19 = (arg2 * var12 + ((float) this.method408() - arg3) * var13) / 4096.0F + arg1;
        this.method421(var14, var15, var16, var17, var18, var19, arg6, arg7, arg8);
    }

    @OriginalMember(owner = "client!xa", name = "t", descriptor = "(III)V")
    public abstract void method414(int arg0, int arg1, int arg2);
}
