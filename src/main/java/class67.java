import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!cq")
public abstract class class67 {

    @OriginalMember(owner = "client!cq", name = "a", descriptor = "(FFII)V", line = 3)
    public final void method448(float arg0, float arg1, int arg2, int arg3) {
        this.method449(arg0, arg1, (float) this.method411() / 2.0F, (float) this.method409() / 2.0F, arg2, arg3, 0, 0, 1);
    }

    @OriginalMember(owner = "client!cq", name = "a", descriptor = "(FFFFIIIII)V", line = 6)
    private final void method449(float arg0, float arg1, float arg2, float arg3, int arg4, int arg5, int arg6, int arg7, int arg8) {
        if (arg4 == 0) {
            return;
        }
        double var10 = (double) (arg5 & 0xFFFF) * 9.587379924285257E-5D;
        float var12 = (float) Math.sin(var10) * (float) arg4;
        float var13 = (float) Math.cos(var10) * (float) arg4;
        float var14 = (-arg2 * var13 + -arg3 * var12) / 4096.0F + arg0;
        float var15 = (-arg3 * var13 + arg2 * var12) / 4096.0F + arg1;
        float var16 = (((float) this.method411() - arg2) * var13 + -arg3 * var12) / 4096.0F + arg0;
        float var17 = (-((float) this.method411() - arg2) * var12 + -arg3 * var13) / 4096.0F + arg1;
        float var18 = (-arg2 * var13 + ((float) this.method409() - arg3) * var12) / 4096.0F + arg0;
        float var19 = (arg2 * var12 + ((float) this.method409() - arg3) * var13) / 4096.0F + arg1;
        this.method406(var14, var15, var16, var17, var18, var19, arg6, arg7, arg8);
    }

    @OriginalMember(owner = "client!cq", name = "a", descriptor = "(FFFFIILud;II)V", line = 39)
    public final void method450(float arg0, float arg1, float arg2, float arg3, int arg4, int arg5, class2 arg6, int arg7, int arg8) {
        if (arg4 == 0) {
            return;
        }
        double var10 = (double) (arg5 & 0xFFFF) * 9.587379924285257E-5D;
        float var12 = (float) Math.sin(var10) * (float) arg4;
        float var13 = (float) Math.cos(var10) * (float) arg4;
        float var14 = (-arg2 * var13 + -arg3 * var12) / 4096.0F + arg0;
        float var15 = (-arg3 * var13 + arg2 * var12) / 4096.0F + arg1;
        float var16 = (((float) this.method411() - arg2) * var13 + -arg3 * var12) / 4096.0F + arg0;
        float var17 = (-((float) this.method411() - arg2) * var12 + -arg3 * var13) / 4096.0F + arg1;
        float var18 = (-arg2 * var13 + ((float) this.method409() - arg3) * var12) / 4096.0F + arg0;
        float var19 = (arg2 * var12 + ((float) this.method409() - arg3) * var13) / 4096.0F + arg1;
        this.method404(var14, var15, var16, var17, var18, var19, arg6, arg7, arg8);
    }

    @OriginalMember(owner = "client!cq", name = "a", descriptor = "(FFIILud;II)V", line = 63)
    public final void method451(float arg0, float arg1, int arg2, int arg3, class2 arg4, int arg5, int arg6) {
        this.method450(arg0, arg1, (float) this.method411() / 2.0F, (float) this.method409() / 2.0F, arg2, arg3, arg4, arg5, arg6);
    }

    @OriginalMember(owner = "client!cq", name = "a", descriptor = "(FFIIIII)V", line = 66)
    public final void method452(float arg0, float arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        this.method449(arg0, arg1, (float) this.method411() / 2.0F, (float) this.method409() / 2.0F, arg2, arg3, arg4, arg5, arg6);
    }

    @OriginalMember(owner = "client!cq", name = "b", descriptor = "(IIII)V", line = 69)
    public final void method453(int arg0, int arg1, int arg2, int arg3) {
        this.method402(arg0, arg1, arg2, arg3, 0, 0, 1);
    }

    @OriginalMember(owner = "client!cq", name = "a", descriptor = "(II)V", line = 74)
    public final void method454(int arg0, int arg1) {
        this.method407(arg0, arg1, 0, 0, 1);
    }

    @OriginalMember(owner = "client!cq", name = "a", descriptor = "()I")
    public abstract int method411();

    @OriginalMember(owner = "client!cq", name = "b", descriptor = "()I")
    public abstract int method398();

    @OriginalMember(owner = "client!cq", name = "c", descriptor = "()I")
    public abstract int method408();

    @OriginalMember(owner = "client!cq", name = "a", descriptor = "(IILud;II)V")
    public abstract void method403(int arg0, int arg1, class2 arg2, int arg3, int arg4);

    @OriginalMember(owner = "client!cq", name = "a", descriptor = "(IIIIII)V")
    public abstract void method405(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5);

    @OriginalMember(owner = "client!cq", name = "a", descriptor = "(IIII)V")
    public abstract void method410(int arg0, int arg1, int arg2, int arg3);

    @OriginalMember(owner = "client!cq", name = "a", descriptor = "(IIIIIII)V")
    public abstract void method402(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6);

    @OriginalMember(owner = "client!cq", name = "a", descriptor = "(FFFFFFLud;II)V")
    public abstract void method404(float arg0, float arg1, float arg2, float arg3, float arg4, float arg5, class2 arg6, int arg7, int arg8);

    @OriginalMember(owner = "client!cq", name = "a", descriptor = "(IIIII)V")
    public abstract void method407(int arg0, int arg1, int arg2, int arg3, int arg4);

    @OriginalMember(owner = "client!cq", name = "d", descriptor = "()I")
    public abstract int method409();

    @OriginalMember(owner = "client!cq", name = "b", descriptor = "(IIIIIII)V")
    public abstract void method412(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6);

    @OriginalMember(owner = "client!cq", name = "a", descriptor = "(FFFFFFIII)V")
    public abstract void method406(float arg0, float arg1, float arg2, float arg3, float arg4, float arg5, int arg6, int arg7, int arg8);

    @OriginalMember(owner = "client!cq", name = "a", descriptor = "(III)V")
    public abstract void method401(int arg0, int arg1, int arg2);
}
