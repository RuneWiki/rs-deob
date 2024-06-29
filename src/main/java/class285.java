import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ae")
public abstract class class285 {

    @OriginalMember(owner = "client!ae", name = "a", descriptor = "(II)V")
    public final void method1915(int arg0, int arg1) {
        this.method927(arg0, arg1, 0, 0, 1);
    }

    @OriginalMember(owner = "client!ae", name = "a", descriptor = "(III)V")
    public abstract void method931(int arg0, int arg1, int arg2);

    @OriginalMember(owner = "client!ae", name = "a", descriptor = "(IIIIIII)V")
    public abstract void method1866(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6);

    @OriginalMember(owner = "client!ae", name = "a", descriptor = "(IIIIII)V")
    public abstract void method930(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5);

    @OriginalMember(owner = "client!ae", name = "a", descriptor = "()I")
    public abstract int method1862();

    @OriginalMember(owner = "client!ae", name = "a", descriptor = "(FFFFFFLtm;II)V")
    public abstract void method1863(float arg0, float arg1, float arg2, float arg3, float arg4, float arg5, class195 arg6, int arg7, int arg8);

    @OriginalMember(owner = "client!ae", name = "a", descriptor = "(FFIILtm;II)V")
    public final void method1916(float arg0, float arg1, int arg2, int arg3, class195 arg4, int arg5, int arg6) {
        this.method1918(arg0, arg1, (float) this.method1861() / 2.0F, (float) this.method1860() / 2.0F, arg2, arg3, arg4, arg5, arg6);
    }

    @OriginalMember(owner = "client!ae", name = "b", descriptor = "(IIIIIII)V")
    public abstract void method929(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6);

    @OriginalMember(owner = "client!ae", name = "a", descriptor = "(FFIIIII)V")
    public final void method1917(float arg0, float arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        this.method1920(arg0, arg1, (float) this.method1861() / 2.0F, (float) this.method1860() / 2.0F, arg2, arg3, arg4, arg5, arg6);
    }

    @OriginalMember(owner = "client!ae", name = "a", descriptor = "(IIIII)V")
    public abstract void method927(int arg0, int arg1, int arg2, int arg3, int arg4);

    @OriginalMember(owner = "client!ae", name = "a", descriptor = "(FFFFIILtm;II)V")
    public final void method1918(float arg0, float arg1, float arg2, float arg3, int arg4, int arg5, class195 arg6, int arg7, int arg8) {
        if (arg4 == 0) {
            return;
        }
        double var10 = (double) (arg5 & 0xFFFF) * 9.587379924285257E-5D;
        float var12 = (float) Math.sin(var10) * (float) arg4;
        float var13 = (float) Math.cos(var10) * (float) arg4;
        float var14 = (-arg2 * var13 + -arg3 * var12) / 4096.0F + arg0;
        float var15 = (-arg3 * var13 + arg2 * var12) / 4096.0F + arg1;
        float var16 = (((float) this.method1861() - arg2) * var13 + -arg3 * var12) / 4096.0F + arg0;
        float var17 = (-((float) this.method1861() - arg2) * var12 + -arg3 * var13) / 4096.0F + arg1;
        float var18 = (-arg2 * var13 + ((float) this.method1860() - arg3) * var12) / 4096.0F + arg0;
        float var19 = (arg2 * var12 + ((float) this.method1860() - arg3) * var13) / 4096.0F + arg1;
        this.method1863(var14, var15, var16, var17, var18, var19, arg6, arg7, arg8);
    }

    @OriginalMember(owner = "client!ae", name = "a", descriptor = "(FFFFFFIII)V")
    public abstract void method1864(float arg0, float arg1, float arg2, float arg3, float arg4, float arg5, int arg6, int arg7, int arg8);

    @OriginalMember(owner = "client!ae", name = "a", descriptor = "(IILtm;II)V")
    public abstract void method926(int arg0, int arg1, class195 arg2, int arg3, int arg4);

    @OriginalMember(owner = "client!ae", name = "b", descriptor = "()I")
    public abstract int method1861();

    @OriginalMember(owner = "client!ae", name = "c", descriptor = "()I")
    public abstract int method1868();

    @OriginalMember(owner = "client!ae", name = "d", descriptor = "()I")
    public abstract int method1860();

    @OriginalMember(owner = "client!ae", name = "a", descriptor = "(IIII)V")
    public final void method1919(int arg0, int arg1, int arg2, int arg3) {
        this.method929(arg0, arg1, arg2, arg3, 0, 0, 1);
    }

    @OriginalMember(owner = "client!ae", name = "b", descriptor = "(IIII)V")
    public abstract void method1867(int arg0, int arg1, int arg2, int arg3);

    @OriginalMember(owner = "client!ae", name = "a", descriptor = "(FFFFIIIII)V")
    private final void method1920(float arg0, float arg1, float arg2, float arg3, int arg4, int arg5, int arg6, int arg7, int arg8) {
        if (arg4 == 0) {
            return;
        }
        double var10 = (double) (arg5 & 0xFFFF) * 9.587379924285257E-5D;
        float var12 = (float) Math.sin(var10) * (float) arg4;
        float var13 = (float) Math.cos(var10) * (float) arg4;
        float var14 = (-arg2 * var13 + -arg3 * var12) / 4096.0F + arg0;
        float var15 = (-arg3 * var13 + arg2 * var12) / 4096.0F + arg1;
        float var16 = (((float) this.method1861() - arg2) * var13 + -arg3 * var12) / 4096.0F + arg0;
        float var17 = (-((float) this.method1861() - arg2) * var12 + -arg3 * var13) / 4096.0F + arg1;
        float var18 = (-arg2 * var13 + ((float) this.method1860() - arg3) * var12) / 4096.0F + arg0;
        float var19 = (arg2 * var12 + ((float) this.method1860() - arg3) * var13) / 4096.0F + arg1;
        this.method1864(var14, var15, var16, var17, var18, var19, arg6, arg7, arg8);
    }

    @OriginalMember(owner = "client!ae", name = "a", descriptor = "(FFII)V")
    public final void method1921(float arg0, float arg1, int arg2, int arg3) {
        this.method1920(arg0, arg1, (float) this.method1861() / 2.0F, (float) this.method1860() / 2.0F, arg2, arg3, 0, 0, 1);
    }
}
