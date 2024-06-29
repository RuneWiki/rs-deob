import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!o")
public abstract class class359 {

    @OriginalMember(owner = "client!o", name = "a", descriptor = "(FFFFIILta;II)V", line = 8)
    public final void method2139(float arg0, float arg1, float arg2, float arg3, int arg4, int arg5, class336 arg6, int arg7, int arg8) {
        if (arg4 == 0) {
            return;
        }
        double var10 = (double) (arg5 & 0xFFFF) * 9.587379924285257E-5D;
        float var12 = (float) Math.sin(var10) * (float) arg4;
        float var13 = (float) Math.cos(var10) * (float) arg4;
        float var14 = (-arg2 * var13 + -arg3 * var12) / 4096.0F + arg0;
        float var15 = (-arg3 * var13 + arg2 * var12) / 4096.0F + arg1;
        float var16 = (((float) this.method204() - arg2) * var13 + -arg3 * var12) / 4096.0F + arg0;
        float var17 = (-((float) this.method204() - arg2) * var12 + -arg3 * var13) / 4096.0F + arg1;
        float var18 = (-arg2 * var13 + ((float) this.method207() - arg3) * var12) / 4096.0F + arg0;
        float var19 = (arg2 * var12 + ((float) this.method207() - arg3) * var13) / 4096.0F + arg1;
        this.method216(var14, var15, var16, var17, var18, var19, arg6, arg7, arg8);
    }

    @OriginalMember(owner = "client!o", name = "a", descriptor = "(IIII)V", line = 37)
    public final void method2140(int arg0, int arg1, int arg2, int arg3) {
        this.method206(arg0, arg1, arg2, arg3, 1, 0, 1);
    }

    @OriginalMember(owner = "client!o", name = "b", descriptor = "(IIII)V", line = 42)
    public final void method2141(int arg0, int arg1, int arg2, int arg3) {
        this.method211(arg0, arg1, arg2, arg3, 1, 0, 1);
    }

    @OriginalMember(owner = "client!o", name = "a", descriptor = "(II)V", line = 45)
    public final void method2142(int arg0, int arg1) {
        this.method215(arg0, arg1, 1, 0, 1);
    }

    @OriginalMember(owner = "client!o", name = "a", descriptor = "(FFIIIII)V", line = 52)
    public final void method2143(float arg0, float arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        this.method2144(arg0, arg1, (float) this.method204() / 2.0F, (float) this.method207() / 2.0F, arg2, arg3, arg4, arg5, arg6);
    }

    @OriginalMember(owner = "client!o", name = "a", descriptor = "(FFFFIIIII)V", line = 55)
    private final void method2144(float arg0, float arg1, float arg2, float arg3, int arg4, int arg5, int arg6, int arg7, int arg8) {
        if (arg4 == 0) {
            return;
        }
        double var10 = (double) (arg5 & 0xFFFF) * 9.587379924285257E-5D;
        float var12 = (float) Math.sin(var10) * (float) arg4;
        float var13 = (float) Math.cos(var10) * (float) arg4;
        float var14 = (-arg2 * var13 + -arg3 * var12) / 4096.0F + arg0;
        float var15 = (-arg3 * var13 + arg2 * var12) / 4096.0F + arg1;
        float var16 = (((float) this.method204() - arg2) * var13 + -arg3 * var12) / 4096.0F + arg0;
        float var17 = (-((float) this.method204() - arg2) * var12 + -arg3 * var13) / 4096.0F + arg1;
        float var18 = (-arg2 * var13 + ((float) this.method207() - arg3) * var12) / 4096.0F + arg0;
        float var19 = (arg2 * var12 + ((float) this.method207() - arg3) * var13) / 4096.0F + arg1;
        this.method209(var14, var15, var16, var17, var18, var19, arg6, arg7, arg8);
    }

    @OriginalMember(owner = "client!o", name = "a", descriptor = "(FFIILta;II)V", line = 79)
    public final void method2145(float arg0, float arg1, int arg2, int arg3, class336 arg4, int arg5, int arg6) {
        this.method2139(arg0, arg1, (float) this.method204() / 2.0F, (float) this.method207() / 2.0F, arg2, arg3, arg4, arg5, arg6);
    }

    @OriginalMember(owner = "client!o", name = "a", descriptor = "(FFII)V", line = 82)
    public final void method2146(float arg0, float arg1, int arg2, int arg3) {
        this.method2144(arg0, arg1, (float) this.method204() / 2.0F, (float) this.method207() / 2.0F, arg2, arg3, 1, 0, 1);
    }

    @OriginalMember(owner = "client!o", name = "oa", descriptor = "(III)V")
    public abstract void method201(int arg0, int arg1, int arg2);

    @OriginalMember(owner = "client!o", name = "H", descriptor = "(FFFFFFIII)V")
    public abstract void method209(float arg0, float arg1, float arg2, float arg3, float arg4, float arg5, int arg6, int arg7, int arg8);

    @OriginalMember(owner = "client!o", name = "a", descriptor = "(FFFFFFLta;II)V")
    public abstract void method216(float arg0, float arg1, float arg2, float arg3, float arg4, float arg5, class336 arg6, int arg7, int arg8);

    @OriginalMember(owner = "client!o", name = "ZA", descriptor = "()I")
    public abstract int method200();

    @OriginalMember(owner = "client!o", name = "ha", descriptor = "(IIII)V")
    public abstract void method210(int arg0, int arg1, int arg2, int arg3);

    @OriginalMember(owner = "client!o", name = "YA", descriptor = "()I")
    public abstract int method205();

    @OriginalMember(owner = "client!o", name = "la", descriptor = "(IIIIIII)V")
    public abstract void method211(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6);

    @OriginalMember(owner = "client!o", name = "ya", descriptor = "(IIIIIII)V")
    public abstract void method206(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6);

    @OriginalMember(owner = "client!o", name = "a", descriptor = "(IILta;II)V")
    public abstract void method203(int arg0, int arg1, class336 arg2, int arg3, int arg4);

    @OriginalMember(owner = "client!o", name = "Q", descriptor = "()I")
    public abstract int method207();

    @OriginalMember(owner = "client!o", name = "XA", descriptor = "(IIIIII)V")
    public abstract void method202(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5);

    @OriginalMember(owner = "client!o", name = "W", descriptor = "(IIIII)V")
    public abstract void method215(int arg0, int arg1, int arg2, int arg3, int arg4);

    @OriginalMember(owner = "client!o", name = "RA", descriptor = "()I")
    public abstract int method204();
}
