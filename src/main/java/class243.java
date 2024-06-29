import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!qa")
public abstract class class243 {

    @OriginalMember(owner = "client!qa", name = "a", descriptor = "(IIII)V", line = 6)
    public final void method1495(int arg0, int arg1, int arg2, int arg3) {
        this.method32(arg0, arg1, arg2, arg3, 0, 0, 1);
    }

    @OriginalMember(owner = "client!qa", name = "a", descriptor = "(FFFFIIIII)V", line = 13)
    private final void method1496(float arg0, float arg1, float arg2, float arg3, int arg4, int arg5, int arg6, int arg7, int arg8) {
        if (arg4 == 0) {
            return;
        }
        double var10 = (double) (arg5 & 0xFFFF) * 9.587379924285257E-5D;
        float var12 = (float) Math.sin(var10) * (float) arg4;
        float var13 = (float) Math.cos(var10) * (float) arg4;
        float var14 = (-arg2 * var13 + -arg3 * var12) / 4096.0F + arg0;
        float var15 = (-arg3 * var13 + arg2 * var12) / 4096.0F + arg1;
        float var16 = (((float) this.method1088() - arg2) * var13 + -arg3 * var12) / 4096.0F + arg0;
        float var17 = (-((float) this.method1088() - arg2) * var12 + -arg3 * var13) / 4096.0F + arg1;
        float var18 = (-arg2 * var13 + ((float) this.method1091() - arg3) * var12) / 4096.0F + arg0;
        float var19 = (arg2 * var12 + ((float) this.method1091() - arg3) * var13) / 4096.0F + arg1;
        this.method1092(var14, var15, var16, var17, var18, var19, arg6, arg7, arg8);
    }

    @OriginalMember(owner = "client!qa", name = "a", descriptor = "(FFII)V", line = 42)
    public final void method1497(float arg0, float arg1, int arg2, int arg3) {
        this.method1496(arg0, arg1, (float) this.method1088() / 2.0F, (float) this.method1091() / 2.0F, arg2, arg3, 0, 0, 1);
    }

    @OriginalMember(owner = "client!qa", name = "a", descriptor = "(FFIIIII)V", line = 45)
    public final void method1498(float arg0, float arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        this.method1496(arg0, arg1, (float) this.method1088() / 2.0F, (float) this.method1091() / 2.0F, arg2, arg3, arg4, arg5, arg6);
    }

    @OriginalMember(owner = "client!qa", name = "a", descriptor = "(II)V", line = 48)
    public final void method1499(int arg0, int arg1) {
        this.method35(arg0, arg1, 0, 0, 1);
    }

    @OriginalMember(owner = "client!qa", name = "a", descriptor = "(FFIILsn;II)V", line = 51)
    public final void method1500(float arg0, float arg1, int arg2, int arg3, class449 arg4, int arg5, int arg6) {
        this.method1501(arg0, arg1, (float) this.method1088() / 2.0F, (float) this.method1091() / 2.0F, arg2, arg3, arg4, arg5, arg6);
    }

    @OriginalMember(owner = "client!qa", name = "a", descriptor = "(FFFFIILsn;II)V", line = 56)
    public final void method1501(float arg0, float arg1, float arg2, float arg3, int arg4, int arg5, class449 arg6, int arg7, int arg8) {
        if (arg4 == 0) {
            return;
        }
        double var10 = (double) (arg5 & 0xFFFF) * 9.587379924285257E-5D;
        float var12 = (float) Math.sin(var10) * (float) arg4;
        float var13 = (float) Math.cos(var10) * (float) arg4;
        float var14 = (-arg2 * var13 + -arg3 * var12) / 4096.0F + arg0;
        float var15 = (-arg3 * var13 + arg2 * var12) / 4096.0F + arg1;
        float var16 = (((float) this.method1088() - arg2) * var13 + -arg3 * var12) / 4096.0F + arg0;
        float var17 = (-((float) this.method1088() - arg2) * var12 + -arg3 * var13) / 4096.0F + arg1;
        float var18 = (-arg2 * var13 + ((float) this.method1091() - arg3) * var12) / 4096.0F + arg0;
        float var19 = (arg2 * var12 + ((float) this.method1091() - arg3) * var13) / 4096.0F + arg1;
        this.method1094(var14, var15, var16, var17, var18, var19, arg6, arg7, arg8);
    }

    @OriginalMember(owner = "client!qa", name = "a", descriptor = "()I")
    public abstract int method1091();

    @OriginalMember(owner = "client!qa", name = "a", descriptor = "(III)V")
    public abstract void method33(int arg0, int arg1, int arg2);

    @OriginalMember(owner = "client!qa", name = "a", descriptor = "(IIIIIII)V")
    public abstract void method32(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6);

    @OriginalMember(owner = "client!qa", name = "a", descriptor = "(IIIII)V")
    public abstract void method35(int arg0, int arg1, int arg2, int arg3, int arg4);

    @OriginalMember(owner = "client!qa", name = "b", descriptor = "()I")
    public abstract int method1090();

    @OriginalMember(owner = "client!qa", name = "b", descriptor = "(IIIIIII)V")
    public abstract void method1087(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6);

    @OriginalMember(owner = "client!qa", name = "c", descriptor = "()I")
    public abstract int method1095();

    @OriginalMember(owner = "client!qa", name = "a", descriptor = "(FFFFFFLsn;II)V")
    public abstract void method1094(float arg0, float arg1, float arg2, float arg3, float arg4, float arg5, class449 arg6, int arg7, int arg8);

    @OriginalMember(owner = "client!qa", name = "b", descriptor = "(IIII)V")
    public abstract void method1089(int arg0, int arg1, int arg2, int arg3);

    @OriginalMember(owner = "client!qa", name = "a", descriptor = "(IILsn;II)V")
    public abstract void method34(int arg0, int arg1, class449 arg2, int arg3, int arg4);

    @OriginalMember(owner = "client!qa", name = "a", descriptor = "(IIIIII)V")
    public abstract void method36(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5);

    @OriginalMember(owner = "client!qa", name = "d", descriptor = "()I")
    public abstract int method1088();

    @OriginalMember(owner = "client!qa", name = "a", descriptor = "(FFFFFFIII)V")
    public abstract void method1092(float arg0, float arg1, float arg2, float arg3, float arg4, float arg5, int arg6, int arg7, int arg8);
}
