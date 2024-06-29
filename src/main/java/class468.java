import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!xa")
public abstract class class468 {

    @OriginalMember(owner = "client!xa", name = "a", descriptor = "(IIII)V", line = 3)
    public final void method2549(int arg0, int arg1, int arg2, int arg3) {
        this.method1553(arg0, arg1, arg2, arg3, 1, 0, 1);
    }

    @OriginalMember(owner = "client!xa", name = "a", descriptor = "(FFFFIIIII)V", line = 8)
    private final void method2550(float arg0, float arg1, float arg2, float arg3, int arg4, int arg5, int arg6, int arg7, int arg8) {
        if (arg4 == 0) {
            return;
        }
        double var10 = (double) (arg5 & 0xFFFF) * 9.587379924285257E-5D;
        float var12 = (float) Math.sin(var10) * (float) arg4;
        float var13 = (float) Math.cos(var10) * (float) arg4;
        float var14 = (-arg2 * var13 + -arg3 * var12) / 4096.0F + arg0;
        float var15 = (-arg3 * var13 + arg2 * var12) / 4096.0F + arg1;
        float var16 = (((float) this.method1552() - arg2) * var13 + -arg3 * var12) / 4096.0F + arg0;
        float var17 = (-((float) this.method1552() - arg2) * var12 + -arg3 * var13) / 4096.0F + arg1;
        float var18 = (-arg2 * var13 + ((float) this.method1549() - arg3) * var12) / 4096.0F + arg0;
        float var19 = (arg2 * var12 + ((float) this.method1549() - arg3) * var13) / 4096.0F + arg1;
        this.method1554(var14, var15, var16, var17, var18, var19, arg6, arg7, arg8);
    }

    @OriginalMember(owner = "client!xa", name = "a", descriptor = "(FFFFIILfa;II)V", line = 33)
    public final void method2551(float arg0, float arg1, float arg2, float arg3, int arg4, int arg5, class219 arg6, int arg7, int arg8) {
        if (arg4 == 0) {
            return;
        }
        double var10 = (double) (arg5 & 0xFFFF) * 9.587379924285257E-5D;
        float var12 = (float) Math.sin(var10) * (float) arg4;
        float var13 = (float) Math.cos(var10) * (float) arg4;
        float var14 = (-arg2 * var13 + -arg3 * var12) / 4096.0F + arg0;
        float var15 = (-arg3 * var13 + arg2 * var12) / 4096.0F + arg1;
        float var16 = (((float) this.method1552() - arg2) * var13 + -arg3 * var12) / 4096.0F + arg0;
        float var17 = (-((float) this.method1552() - arg2) * var12 + -arg3 * var13) / 4096.0F + arg1;
        float var18 = (-arg2 * var13 + ((float) this.method1549() - arg3) * var12) / 4096.0F + arg0;
        float var19 = (arg2 * var12 + ((float) this.method1549() - arg3) * var13) / 4096.0F + arg1;
        this.method1547(var14, var15, var16, var17, var18, var19, arg6, arg7, arg8);
    }

    @OriginalMember(owner = "client!xa", name = "b", descriptor = "(IIII)V", line = 58)
    public final void method2552(int arg0, int arg1, int arg2, int arg3) {
        this.method1551(arg0, arg1, arg2, arg3, 1, 0, 1);
    }

    @OriginalMember(owner = "client!xa", name = "a", descriptor = "(FFIILfa;II)V", line = 72)
    public final void method2553(float arg0, float arg1, int arg2, int arg3, class219 arg4, int arg5, int arg6) {
        this.method2551(arg0, arg1, (float) this.method1552() / 2.0F, (float) this.method1549() / 2.0F, arg2, arg3, arg4, arg5, arg6);
    }

    @OriginalMember(owner = "client!xa", name = "a", descriptor = "(FFIIIII)V", line = 76)
    public final void method2554(float arg0, float arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        this.method2550(arg0, arg1, (float) this.method1552() / 2.0F, (float) this.method1549() / 2.0F, arg2, arg3, arg4, arg5, arg6);
    }

    @OriginalMember(owner = "client!xa", name = "a", descriptor = "(FFII)V", line = 79)
    public final void method2555(float arg0, float arg1, int arg2, int arg3) {
        this.method2550(arg0, arg1, (float) this.method1552() / 2.0F, (float) this.method1549() / 2.0F, arg2, arg3, 1, 0, 1);
    }

    @OriginalMember(owner = "client!xa", name = "a", descriptor = "(II)V", line = 83)
    public final void method2556(int arg0, int arg1) {
        this.method1543(arg0, arg1, 1, 0, 1);
    }

    @OriginalMember(owner = "client!xa", name = "I", descriptor = "(IIIII)V")
    public abstract void method1543(int arg0, int arg1, int arg2, int arg3, int arg4);

    @OriginalMember(owner = "client!xa", name = "b", descriptor = "()I")
    public abstract int method1544();

    @OriginalMember(owner = "client!xa", name = "t", descriptor = "(III)V")
    public abstract void method1550(int arg0, int arg1, int arg2);

    @OriginalMember(owner = "client!xa", name = "a", descriptor = "(FFFFFFLfa;II)V")
    public abstract void method1547(float arg0, float arg1, float arg2, float arg3, float arg4, float arg5, class219 arg6, int arg7, int arg8);

    @OriginalMember(owner = "client!xa", name = "a", descriptor = "()I")
    public abstract int method1549();

    @OriginalMember(owner = "client!xa", name = "KA", descriptor = "(IIIIIII)V")
    public abstract void method1553(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6);

    @OriginalMember(owner = "client!xa", name = "sa", descriptor = "(FFFFFFIII)V")
    public abstract void method1554(float arg0, float arg1, float arg2, float arg3, float arg4, float arg5, int arg6, int arg7, int arg8);

    @OriginalMember(owner = "client!xa", name = "GA", descriptor = "(IIIIII)V")
    public abstract void method1546(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5);

    @OriginalMember(owner = "client!xa", name = "AA", descriptor = "()I")
    public abstract int method1552();

    @OriginalMember(owner = "client!xa", name = "a", descriptor = "(IILfa;II)V")
    public abstract void method1557(int arg0, int arg1, class219 arg2, int arg3, int arg4);

    @OriginalMember(owner = "client!xa", name = "ba", descriptor = "(IIIIIII)V")
    public abstract void method1551(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6);

    @OriginalMember(owner = "client!xa", name = "EA", descriptor = "(IIII)V")
    public abstract void method1559(int arg0, int arg1, int arg2, int arg3);

    @OriginalMember(owner = "client!xa", name = "QA", descriptor = "()I")
    public abstract int method1556();
}
