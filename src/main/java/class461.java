import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!xa")
public abstract class class461 {

    @OriginalMember(owner = "client!xa", name = "a", descriptor = "(FFFFIIIII)V", line = 10)
    private final void method2654(float arg0, float arg1, float arg2, float arg3, int arg4, int arg5, int arg6, int arg7, int arg8) {
        if (arg4 == 0) {
            return;
        }
        double var10 = (double) (arg5 & 0xFFFF) * 9.587379924285257E-5D;
        float var12 = (float) Math.sin(var10) * (float) arg4;
        float var13 = (float) Math.cos(var10) * (float) arg4;
        float var14 = (-arg2 * var13 + -arg3 * var12) / 4096.0F + arg0;
        float var15 = (-arg3 * var13 + arg2 * var12) / 4096.0F + arg1;
        float var16 = (((float) this.method33() - arg2) * var13 + -arg3 * var12) / 4096.0F + arg0;
        float var17 = (-((float) this.method33() - arg2) * var12 + -arg3 * var13) / 4096.0F + arg1;
        float var18 = (-arg2 * var13 + ((float) this.method29() - arg3) * var12) / 4096.0F + arg0;
        float var19 = (arg2 * var12 + ((float) this.method29() - arg3) * var13) / 4096.0F + arg1;
        this.method24(var14, var15, var16, var17, var18, var19, arg6, arg7, arg8);
    }

    @OriginalMember(owner = "client!xa", name = "a", descriptor = "(FFII)V", line = 34)
    public final void method2655(float arg0, float arg1, int arg2, int arg3) {
        this.method2654(arg0, arg1, (float) this.method33() / 2.0F, (float) this.method29() / 2.0F, arg2, arg3, 1, 0, 1);
    }

    @OriginalMember(owner = "client!xa", name = "a", descriptor = "(FFIIIII)V", line = 40)
    public final void method2656(float arg0, float arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        this.method2654(arg0, arg1, (float) this.method33() / 2.0F, (float) this.method29() / 2.0F, arg2, arg3, arg4, arg5, arg6);
    }

    @OriginalMember(owner = "client!xa", name = "a", descriptor = "(FFIILfa;II)V", line = 44)
    public final void method2657(float arg0, float arg1, int arg2, int arg3, class212 arg4, int arg5, int arg6) {
        this.method2658(arg0, arg1, (float) this.method33() / 2.0F, (float) this.method29() / 2.0F, arg2, arg3, arg4, arg5, arg6);
    }

    @OriginalMember(owner = "client!xa", name = "a", descriptor = "(FFFFIILfa;II)V", line = 49)
    public final void method2658(float arg0, float arg1, float arg2, float arg3, int arg4, int arg5, class212 arg6, int arg7, int arg8) {
        if (arg4 == 0) {
            return;
        }
        double var10 = (double) (arg5 & 0xFFFF) * 9.587379924285257E-5D;
        float var12 = (float) Math.sin(var10) * (float) arg4;
        float var13 = (float) Math.cos(var10) * (float) arg4;
        float var14 = (-arg2 * var13 + -arg3 * var12) / 4096.0F + arg0;
        float var15 = (-arg3 * var13 + arg2 * var12) / 4096.0F + arg1;
        float var16 = (((float) this.method33() - arg2) * var13 + -arg3 * var12) / 4096.0F + arg0;
        float var17 = (-((float) this.method33() - arg2) * var12 + -arg3 * var13) / 4096.0F + arg1;
        float var18 = (-arg2 * var13 + ((float) this.method29() - arg3) * var12) / 4096.0F + arg0;
        float var19 = (arg2 * var12 + ((float) this.method29() - arg3) * var13) / 4096.0F + arg1;
        this.method22(var14, var15, var16, var17, var18, var19, arg6, arg7, arg8);
    }

    @OriginalMember(owner = "client!xa", name = "a", descriptor = "(IIII)V", line = 73)
    public final void method2659(int arg0, int arg1, int arg2, int arg3) {
        this.method35(arg0, arg1, arg2, arg3, 1, 0, 1);
    }

    @OriginalMember(owner = "client!xa", name = "a", descriptor = "(II)V", line = 78)
    public final void method2660(int arg0, int arg1) {
        this.method30(arg0, arg1, 1, 0, 1);
    }

    @OriginalMember(owner = "client!xa", name = "b", descriptor = "(IIII)V", line = 84)
    public final void method2661(int arg0, int arg1, int arg2, int arg3) {
        this.method32(arg0, arg1, arg2, arg3, 1, 0, 1);
    }

    @OriginalMember(owner = "client!xa", name = "sa", descriptor = "(FFFFFFIII)V")
    public abstract void method24(float arg0, float arg1, float arg2, float arg3, float arg4, float arg5, int arg6, int arg7, int arg8);

    @OriginalMember(owner = "client!xa", name = "KA", descriptor = "(IIIIIII)V")
    public abstract void method35(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6);

    @OriginalMember(owner = "client!xa", name = "t", descriptor = "(III)V")
    public abstract void method182(int arg0, int arg1, int arg2);

    @OriginalMember(owner = "client!xa", name = "a", descriptor = "()I")
    public abstract int method29();

    @OriginalMember(owner = "client!xa", name = "b", descriptor = "()I")
    public abstract int method26();

    @OriginalMember(owner = "client!xa", name = "a", descriptor = "(IILfa;II)V")
    public abstract void method23(int arg0, int arg1, class212 arg2, int arg3, int arg4);

    @OriginalMember(owner = "client!xa", name = "a", descriptor = "(FFFFFFLfa;II)V")
    public abstract void method22(float arg0, float arg1, float arg2, float arg3, float arg4, float arg5, class212 arg6, int arg7, int arg8);

    @OriginalMember(owner = "client!xa", name = "AA", descriptor = "()I")
    public abstract int method33();

    @OriginalMember(owner = "client!xa", name = "GA", descriptor = "(IIIIII)V")
    public abstract void method181(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5);

    @OriginalMember(owner = "client!xa", name = "ba", descriptor = "(IIIIIII)V")
    public abstract void method32(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6);

    @OriginalMember(owner = "client!xa", name = "I", descriptor = "(IIIII)V")
    public abstract void method30(int arg0, int arg1, int arg2, int arg3, int arg4);

    @OriginalMember(owner = "client!xa", name = "EA", descriptor = "(IIII)V")
    public abstract void method34(int arg0, int arg1, int arg2, int arg3);

    @OriginalMember(owner = "client!xa", name = "QA", descriptor = "()I")
    public abstract int method31();
}
