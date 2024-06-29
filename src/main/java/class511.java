import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!xa")
public abstract class class511 {

    @OriginalMember(owner = "client!xa", name = "t", descriptor = "(III)V")
    public abstract void method597(int arg0, int arg1, int arg2);

    @OriginalMember(owner = "client!xa", name = "a", descriptor = "(FFII)V")
    public final void method2750(float arg0, float arg1, int arg2, int arg3) {
        this.method2755(arg0, arg1, (float) this.method602() / 2.0F, (float) this.method595() / 2.0F, arg2, arg3, 1, 0, 1);
    }

    @OriginalMember(owner = "client!xa", name = "I", descriptor = "(IIIII)V")
    public abstract void method606(int arg0, int arg1, int arg2, int arg3, int arg4);

    @OriginalMember(owner = "client!xa", name = "a", descriptor = "(II)V")
    public final void method2751(int arg0, int arg1) {
        this.method606(arg0, arg1, 1, 0, 1);
    }

    @OriginalMember(owner = "client!xa", name = "a", descriptor = "(IILfa;II)V")
    public abstract void method594(int arg0, int arg1, class619 arg2, int arg3, int arg4);

    @OriginalMember(owner = "client!xa", name = "a", descriptor = "()I")
    public abstract int method595();

    @OriginalMember(owner = "client!xa", name = "a", descriptor = "(FFIIIII)V")
    public final void method2752(float arg0, float arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        this.method2755(arg0, arg1, (float) this.method602() / 2.0F, (float) this.method595() / 2.0F, arg2, arg3, arg4, arg5, arg6);
    }

    @OriginalMember(owner = "client!xa", name = "GA", descriptor = "(IIIIII)V")
    public abstract void method603(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5);

    @OriginalMember(owner = "client!xa", name = "EA", descriptor = "(IIII)V")
    public abstract void method610(int arg0, int arg1, int arg2, int arg3);

    @OriginalMember(owner = "client!xa", name = "QA", descriptor = "()I")
    public abstract int method608();

    @OriginalMember(owner = "client!xa", name = "a", descriptor = "(FFFFIILfa;II)V")
    public final void method2753(float arg0, float arg1, float arg2, float arg3, int arg4, int arg5, class619 arg6, int arg7, int arg8) {
        if (arg4 == 0) {
            return;
        }
        double var10 = (double) (arg5 & 0xFFFF) * 9.587379924285257E-5D;
        float var12 = (float) Math.sin(var10) * (float) arg4;
        float var13 = (float) Math.cos(var10) * (float) arg4;
        float var14 = (-arg2 * var13 + -arg3 * var12) / 4096.0F + arg0;
        float var15 = (-arg3 * var13 + arg2 * var12) / 4096.0F + arg1;
        float var16 = (((float) this.method602() - arg2) * var13 + -arg3 * var12) / 4096.0F + arg0;
        float var17 = (-((float) this.method602() - arg2) * var12 + -arg3 * var13) / 4096.0F + arg1;
        float var18 = (-arg2 * var13 + ((float) this.method595() - arg3) * var12) / 4096.0F + arg0;
        float var19 = (arg2 * var12 + ((float) this.method595() - arg3) * var13) / 4096.0F + arg1;
        this.method609(var14, var15, var16, var17, var18, var19, arg6, arg7, arg8);
    }

    @OriginalMember(owner = "client!xa", name = "sa", descriptor = "(FFFFFFIII)V")
    public abstract void method598(float arg0, float arg1, float arg2, float arg3, float arg4, float arg5, int arg6, int arg7, int arg8);

    @OriginalMember(owner = "client!xa", name = "b", descriptor = "()I")
    public abstract int method607();

    @OriginalMember(owner = "client!xa", name = "a", descriptor = "(IIII)V")
    public final void method2754(int arg0, int arg1, int arg2, int arg3) {
        this.method604(arg0, arg1, arg2, arg3, 1, 0, 1);
    }

    @OriginalMember(owner = "client!xa", name = "KA", descriptor = "(IIIIIII)V")
    public abstract void method604(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6);

    @OriginalMember(owner = "client!xa", name = "ba", descriptor = "(IIIIIII)V")
    public abstract void method596(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6);

    @OriginalMember(owner = "client!xa", name = "a", descriptor = "(FFFFFFLfa;II)V")
    public abstract void method609(float arg0, float arg1, float arg2, float arg3, float arg4, float arg5, class619 arg6, int arg7, int arg8);

    @OriginalMember(owner = "client!xa", name = "AA", descriptor = "()I")
    public abstract int method602();

    @OriginalMember(owner = "client!xa", name = "a", descriptor = "(FFFFIIIII)V")
    private final void method2755(float arg0, float arg1, float arg2, float arg3, int arg4, int arg5, int arg6, int arg7, int arg8) {
        if (arg4 == 0) {
            return;
        }
        double var10 = (double) (arg5 & 0xFFFF) * 9.587379924285257E-5D;
        float var12 = (float) Math.sin(var10) * (float) arg4;
        float var13 = (float) Math.cos(var10) * (float) arg4;
        float var14 = (-arg2 * var13 + -arg3 * var12) / 4096.0F + arg0;
        float var15 = (-arg3 * var13 + arg2 * var12) / 4096.0F + arg1;
        float var16 = (((float) this.method602() - arg2) * var13 + -arg3 * var12) / 4096.0F + arg0;
        float var17 = (-((float) this.method602() - arg2) * var12 + -arg3 * var13) / 4096.0F + arg1;
        float var18 = (-arg2 * var13 + ((float) this.method595() - arg3) * var12) / 4096.0F + arg0;
        float var19 = (arg2 * var12 + ((float) this.method595() - arg3) * var13) / 4096.0F + arg1;
        this.method598(var14, var15, var16, var17, var18, var19, arg6, arg7, arg8);
    }

    @OriginalMember(owner = "client!xa", name = "b", descriptor = "(IIII)V")
    public final void method2756(int arg0, int arg1, int arg2, int arg3) {
        this.method596(arg0, arg1, arg2, arg3, 1, 0, 1);
    }

    @OriginalMember(owner = "client!xa", name = "a", descriptor = "(FFIILfa;II)V")
    public final void method2757(float arg0, float arg1, int arg2, int arg3, class619 arg4, int arg5, int arg6) {
        this.method2753(arg0, arg1, (float) this.method602() / 2.0F, (float) this.method595() / 2.0F, arg2, arg3, arg4, arg5, arg6);
    }
}
