import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!xa")
public abstract class class433 {

    @OriginalMember(owner = "client!xa", name = "a", descriptor = "(IIII)V", line = 6)
    public final void method2700(int arg0, int arg1, int arg2, int arg3) {
        this.method1582(arg0, arg1, arg2, arg3, 1, 0, 1);
    }

    @OriginalMember(owner = "client!xa", name = "a", descriptor = "(FFFFIIIII)V", line = 9)
    private final void method2701(float arg0, float arg1, float arg2, float arg3, int arg4, int arg5, int arg6, int arg7, int arg8) {
        if (arg4 == 0) {
            return;
        }
        double var10 = (double) (arg5 & 0xFFFF) * 9.587379924285257E-5D;
        float var12 = (float) Math.sin(var10) * (float) arg4;
        float var13 = (float) Math.cos(var10) * (float) arg4;
        float var14 = (-arg2 * var13 + -arg3 * var12) / 4096.0F + arg0;
        float var15 = (-arg3 * var13 + arg2 * var12) / 4096.0F + arg1;
        float var16 = (((float) this.method1577() - arg2) * var13 + -arg3 * var12) / 4096.0F + arg0;
        float var17 = (-((float) this.method1577() - arg2) * var12 + -arg3 * var13) / 4096.0F + arg1;
        float var18 = (-arg2 * var13 + ((float) this.method1568() - arg3) * var12) / 4096.0F + arg0;
        float var19 = (arg2 * var12 + ((float) this.method1568() - arg3) * var13) / 4096.0F + arg1;
        this.method1583(var14, var15, var16, var17, var18, var19, arg6, arg7, arg8);
    }

    @OriginalMember(owner = "client!xa", name = "b", descriptor = "(IIII)V", line = 36)
    public final void method2702(int arg0, int arg1, int arg2, int arg3) {
        this.method1574(arg0, arg1, arg2, arg3, 1, 0, 1);
    }

    @OriginalMember(owner = "client!xa", name = "a", descriptor = "(FFIIIII)V", line = 40)
    public final void method2703(float arg0, float arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        this.method2701(arg0, arg1, (float) this.method1577() / 2.0F, (float) this.method1568() / 2.0F, arg2, arg3, arg4, arg5, arg6);
    }

    @OriginalMember(owner = "client!xa", name = "a", descriptor = "(FFII)V", line = 52)
    public final void method2704(float arg0, float arg1, int arg2, int arg3) {
        this.method2701(arg0, arg1, (float) this.method1577() / 2.0F, (float) this.method1568() / 2.0F, arg2, arg3, 1, 0, 1);
    }

    @OriginalMember(owner = "client!xa", name = "a", descriptor = "(FFFFIILfa;II)V", line = 55)
    public final void method2705(float arg0, float arg1, float arg2, float arg3, int arg4, int arg5, class199 arg6, int arg7, int arg8) {
        if (arg4 == 0) {
            return;
        }
        double var10 = (double) (arg5 & 0xFFFF) * 9.587379924285257E-5D;
        float var12 = (float) Math.sin(var10) * (float) arg4;
        float var13 = (float) Math.cos(var10) * (float) arg4;
        float var14 = (-arg2 * var13 + -arg3 * var12) / 4096.0F + arg0;
        float var15 = (-arg3 * var13 + arg2 * var12) / 4096.0F + arg1;
        float var16 = (((float) this.method1577() - arg2) * var13 + -arg3 * var12) / 4096.0F + arg0;
        float var17 = (-((float) this.method1577() - arg2) * var12 + -arg3 * var13) / 4096.0F + arg1;
        float var18 = (-arg2 * var13 + ((float) this.method1568() - arg3) * var12) / 4096.0F + arg0;
        float var19 = (arg2 * var12 + ((float) this.method1568() - arg3) * var13) / 4096.0F + arg1;
        this.method1578(var14, var15, var16, var17, var18, var19, arg6, arg7, arg8);
    }

    @OriginalMember(owner = "client!xa", name = "a", descriptor = "(II)V", line = 80)
    public final void method2706(int arg0, int arg1) {
        this.method1571(arg0, arg1, 1, 0, 1);
    }

    @OriginalMember(owner = "client!xa", name = "a", descriptor = "(FFIILfa;II)V", line = 83)
    public final void method2707(float arg0, float arg1, int arg2, int arg3, class199 arg4, int arg5, int arg6) {
        this.method2705(arg0, arg1, (float) this.method1577() / 2.0F, (float) this.method1568() / 2.0F, arg2, arg3, arg4, arg5, arg6);
    }

    @OriginalMember(owner = "client!xa", name = "ba", descriptor = "(IIIIIII)V")
    public abstract void method1574(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6);

    @OriginalMember(owner = "client!xa", name = "EA", descriptor = "(IIII)V")
    public abstract void method1580(int arg0, int arg1, int arg2, int arg3);

    @OriginalMember(owner = "client!xa", name = "a", descriptor = "(FFFFFFLfa;II)V")
    public abstract void method1578(float arg0, float arg1, float arg2, float arg3, float arg4, float arg5, class199 arg6, int arg7, int arg8);

    @OriginalMember(owner = "client!xa", name = "QA", descriptor = "()I")
    public abstract int method1570();

    @OriginalMember(owner = "client!xa", name = "I", descriptor = "(IIIII)V")
    public abstract void method1571(int arg0, int arg1, int arg2, int arg3, int arg4);

    @OriginalMember(owner = "client!xa", name = "GA", descriptor = "(IIIIII)V")
    public abstract void method1581(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5);

    @OriginalMember(owner = "client!xa", name = "KA", descriptor = "(IIIIIII)V")
    public abstract void method1582(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6);

    @OriginalMember(owner = "client!xa", name = "a", descriptor = "()I")
    public abstract int method1568();

    @OriginalMember(owner = "client!xa", name = "t", descriptor = "(III)V")
    public abstract void method1569(int arg0, int arg1, int arg2);

    @OriginalMember(owner = "client!xa", name = "sa", descriptor = "(FFFFFFIII)V")
    public abstract void method1583(float arg0, float arg1, float arg2, float arg3, float arg4, float arg5, int arg6, int arg7, int arg8);

    @OriginalMember(owner = "client!xa", name = "b", descriptor = "()I")
    public abstract int method1576();

    @OriginalMember(owner = "client!xa", name = "AA", descriptor = "()I")
    public abstract int method1577();

    @OriginalMember(owner = "client!xa", name = "a", descriptor = "(IILfa;II)V")
    public abstract void method1572(int arg0, int arg1, class199 arg2, int arg3, int arg4);
}
