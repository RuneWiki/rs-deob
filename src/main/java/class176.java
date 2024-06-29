import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!tr")
public abstract class class176 {

    @OriginalMember(owner = "client!tr", name = "a", descriptor = "(IILsm;II)V")
    public abstract void method141(int arg0, int arg1, class171 arg2, int arg3, int arg4);

    @OriginalMember(owner = "client!tr", name = "a", descriptor = "(IIIII)V")
    public abstract void method144(int arg0, int arg1, int arg2, int arg3, int arg4);

    @OriginalMember(owner = "client!tr", name = "a", descriptor = "(FFFFIIIII)V")
    private final void method1077(float arg0, float arg1, float arg2, float arg3, int arg4, int arg5, int arg6, int arg7, int arg8) {
        if (arg4 == 0) {
            return;
        }
        double var10 = (double) (arg5 & 0xFFFF) * 9.587379924285257E-5D;
        float var12 = (float) Math.sin(var10) * (float) arg4;
        float var13 = (float) Math.cos(var10) * (float) arg4;
        float var14 = (-arg2 * var13 + -arg3 * var12) / 4096.0F + arg0;
        float var15 = (-arg3 * var13 + arg2 * var12) / 4096.0F + arg1;
        float var16 = (((float) this.method516() - arg2) * var13 + -arg3 * var12) / 4096.0F + arg0;
        float var17 = (-((float) this.method516() - arg2) * var12 + -arg3 * var13) / 4096.0F + arg1;
        float var18 = (-arg2 * var13 + ((float) this.method524() - arg3) * var12) / 4096.0F + arg0;
        float var19 = (arg2 * var12 + ((float) this.method524() - arg3) * var13) / 4096.0F + arg1;
        this.method523(var14, var15, var16, var17, var18, var19, arg6, arg7, arg8);
    }

    @OriginalMember(owner = "client!tr", name = "a", descriptor = "(IIII)V")
    public abstract void method520(int arg0, int arg1, int arg2, int arg3);

    @OriginalMember(owner = "client!tr", name = "a", descriptor = "(FFFFFFIII)V")
    public abstract void method523(float arg0, float arg1, float arg2, float arg3, float arg4, float arg5, int arg6, int arg7, int arg8);

    @OriginalMember(owner = "client!tr", name = "a", descriptor = "(FFFFFFLsm;II)V")
    public abstract void method522(float arg0, float arg1, float arg2, float arg3, float arg4, float arg5, class171 arg6, int arg7, int arg8);

    @OriginalMember(owner = "client!tr", name = "a", descriptor = "()I")
    public abstract int method521();

    @OriginalMember(owner = "client!tr", name = "b", descriptor = "()I")
    public abstract int method518();

    @OriginalMember(owner = "client!tr", name = "a", descriptor = "(FFII)V")
    public final void method1078(float arg0, float arg1, int arg2, int arg3) {
        this.method1077(arg0, arg1, (float) this.method516() / 2.0F, (float) this.method524() / 2.0F, arg2, arg3, 0, 0, 1);
    }

    @OriginalMember(owner = "client!tr", name = "a", descriptor = "(IIIIIII)V")
    public abstract void method519(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6);

    @OriginalMember(owner = "client!tr", name = "a", descriptor = "(II)V")
    public final void method1079(int arg0, int arg1) {
        this.method144(arg0, arg1, 0, 0, 1);
    }

    @OriginalMember(owner = "client!tr", name = "a", descriptor = "(FFIILsm;II)V")
    public final void method1080(float arg0, float arg1, int arg2, int arg3, class171 arg4, int arg5, int arg6) {
        this.method1081(arg0, arg1, (float) this.method516() / 2.0F, (float) this.method524() / 2.0F, arg2, arg3, arg4, arg5, arg6);
    }

    @OriginalMember(owner = "client!tr", name = "a", descriptor = "(FFFFIILsm;II)V")
    public final void method1081(float arg0, float arg1, float arg2, float arg3, int arg4, int arg5, class171 arg6, int arg7, int arg8) {
        if (arg4 == 0) {
            return;
        }
        double var10 = (double) (arg5 & 0xFFFF) * 9.587379924285257E-5D;
        float var12 = (float) Math.sin(var10) * (float) arg4;
        float var13 = (float) Math.cos(var10) * (float) arg4;
        float var14 = (-arg2 * var13 + -arg3 * var12) / 4096.0F + arg0;
        float var15 = (-arg3 * var13 + arg2 * var12) / 4096.0F + arg1;
        float var16 = (((float) this.method516() - arg2) * var13 + -arg3 * var12) / 4096.0F + arg0;
        float var17 = (-((float) this.method516() - arg2) * var12 + -arg3 * var13) / 4096.0F + arg1;
        float var18 = (-arg2 * var13 + ((float) this.method524() - arg3) * var12) / 4096.0F + arg0;
        float var19 = (arg2 * var12 + ((float) this.method524() - arg3) * var13) / 4096.0F + arg1;
        this.method522(var14, var15, var16, var17, var18, var19, arg6, arg7, arg8);
    }

    @OriginalMember(owner = "client!tr", name = "c", descriptor = "()I")
    public abstract int method524();

    @OriginalMember(owner = "client!tr", name = "a", descriptor = "(IIIIII)V")
    public abstract void method138(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5);

    @OriginalMember(owner = "client!tr", name = "a", descriptor = "(III)V")
    public abstract void method142(int arg0, int arg1, int arg2);

    @OriginalMember(owner = "client!tr", name = "a", descriptor = "(FFIIIII)V")
    public final void method1082(float arg0, float arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        this.method1077(arg0, arg1, (float) this.method516() / 2.0F, (float) this.method524() / 2.0F, arg2, arg3, arg4, arg5, arg6);
    }

    @OriginalMember(owner = "client!tr", name = "d", descriptor = "()I")
    public abstract int method516();

    @OriginalMember(owner = "client!tr", name = "b", descriptor = "(IIII)V")
    public final void method1083(int arg0, int arg1, int arg2, int arg3) {
        this.method140(arg0, arg1, arg2, arg3, 0, 0, 1);
    }

    @OriginalMember(owner = "client!tr", name = "b", descriptor = "(IIIIIII)V")
    public abstract void method140(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6);
}
