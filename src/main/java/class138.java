import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!o")
public abstract class class138 {

    @OriginalMember(owner = "client!o", name = "a", descriptor = "(FFIILta;II)V", line = 6)
    public final void method1032(float arg0, float arg1, int arg2, int arg3, class448 arg4, int arg5, int arg6) {
        this.method1037(arg0, arg1, (float) this.method200() / 2.0F, (float) this.method198() / 2.0F, arg2, arg3, arg4, arg5, arg6);
    }

    @OriginalMember(owner = "client!o", name = "a", descriptor = "(IIII)V", line = 11)
    public final void method1033(int arg0, int arg1, int arg2, int arg3) {
        this.method202(arg0, arg1, arg2, arg3, 1, 0, 1);
    }

    @OriginalMember(owner = "client!o", name = "a", descriptor = "(FFII)V", line = 15)
    public final void method1034(float arg0, float arg1, int arg2, int arg3) {
        this.method1035(arg0, arg1, (float) this.method200() / 2.0F, (float) this.method198() / 2.0F, arg2, arg3, 1, 0, 1);
    }

    @OriginalMember(owner = "client!o", name = "a", descriptor = "(FFFFIIIII)V", line = 19)
    private final void method1035(float arg0, float arg1, float arg2, float arg3, int arg4, int arg5, int arg6, int arg7, int arg8) {
        if (arg4 == 0) {
            return;
        }
        double var10 = (double) (arg5 & 0xFFFF) * 9.587379924285257E-5D;
        float var12 = (float) Math.sin(var10) * (float) arg4;
        float var13 = (float) Math.cos(var10) * (float) arg4;
        float var14 = (-arg2 * var13 + -arg3 * var12) / 4096.0F + arg0;
        float var15 = (-arg3 * var13 + arg2 * var12) / 4096.0F + arg1;
        float var16 = (((float) this.method200() - arg2) * var13 + -arg3 * var12) / 4096.0F + arg0;
        float var17 = (-((float) this.method200() - arg2) * var12 + -arg3 * var13) / 4096.0F + arg1;
        float var18 = (-arg2 * var13 + ((float) this.method198() - arg3) * var12) / 4096.0F + arg0;
        float var19 = (arg2 * var12 + ((float) this.method198() - arg3) * var13) / 4096.0F + arg1;
        this.method201(var14, var15, var16, var17, var18, var19, arg6, arg7, arg8);
    }

    @OriginalMember(owner = "client!o", name = "a", descriptor = "(FFIIIII)V", line = 54)
    public final void method1036(float arg0, float arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        this.method1035(arg0, arg1, (float) this.method200() / 2.0F, (float) this.method198() / 2.0F, arg2, arg3, arg4, arg5, arg6);
    }

    @OriginalMember(owner = "client!o", name = "a", descriptor = "(FFFFIILta;II)V", line = 57)
    public final void method1037(float arg0, float arg1, float arg2, float arg3, int arg4, int arg5, class448 arg6, int arg7, int arg8) {
        if (arg4 == 0) {
            return;
        }
        double var10 = (double) (arg5 & 0xFFFF) * 9.587379924285257E-5D;
        float var12 = (float) Math.sin(var10) * (float) arg4;
        float var13 = (float) Math.cos(var10) * (float) arg4;
        float var14 = (-arg2 * var13 + -arg3 * var12) / 4096.0F + arg0;
        float var15 = (-arg3 * var13 + arg2 * var12) / 4096.0F + arg1;
        float var16 = (((float) this.method200() - arg2) * var13 + -arg3 * var12) / 4096.0F + arg0;
        float var17 = (-((float) this.method200() - arg2) * var12 + -arg3 * var13) / 4096.0F + arg1;
        float var18 = (-arg2 * var13 + ((float) this.method198() - arg3) * var12) / 4096.0F + arg0;
        float var19 = (arg2 * var12 + ((float) this.method198() - arg3) * var13) / 4096.0F + arg1;
        this.method211(var14, var15, var16, var17, var18, var19, arg6, arg7, arg8);
    }

    @OriginalMember(owner = "client!o", name = "b", descriptor = "(IIII)V", line = 81)
    public final void method1038(int arg0, int arg1, int arg2, int arg3) {
        this.method205(arg0, arg1, arg2, arg3, 1, 0, 1);
    }

    @OriginalMember(owner = "client!o", name = "a", descriptor = "(II)V", line = 84)
    public final void method1039(int arg0, int arg1) {
        this.method199(arg0, arg1, 1, 0, 1);
    }

    @OriginalMember(owner = "client!o", name = "RA", descriptor = "()I")
    public abstract int method200();

    @OriginalMember(owner = "client!o", name = "H", descriptor = "(FFFFFFIII)V")
    public abstract void method201(float arg0, float arg1, float arg2, float arg3, float arg4, float arg5, int arg6, int arg7, int arg8);

    @OriginalMember(owner = "client!o", name = "ya", descriptor = "(IIIIIII)V")
    public abstract void method202(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6);

    @OriginalMember(owner = "client!o", name = "oa", descriptor = "(III)V")
    public abstract void method628(int arg0, int arg1, int arg2);

    @OriginalMember(owner = "client!o", name = "a", descriptor = "(IILta;II)V")
    public abstract void method206(int arg0, int arg1, class448 arg2, int arg3, int arg4);

    @OriginalMember(owner = "client!o", name = "Q", descriptor = "()I")
    public abstract int method198();

    @OriginalMember(owner = "client!o", name = "ZA", descriptor = "()I")
    public abstract int method210();

    @OriginalMember(owner = "client!o", name = "XA", descriptor = "(IIIIII)V")
    public abstract void method626(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5);

    @OriginalMember(owner = "client!o", name = "a", descriptor = "(FFFFFFLta;II)V")
    public abstract void method211(float arg0, float arg1, float arg2, float arg3, float arg4, float arg5, class448 arg6, int arg7, int arg8);

    @OriginalMember(owner = "client!o", name = "YA", descriptor = "()I")
    public abstract int method204();

    @OriginalMember(owner = "client!o", name = "la", descriptor = "(IIIIIII)V")
    public abstract void method205(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6);

    @OriginalMember(owner = "client!o", name = "W", descriptor = "(IIIII)V")
    public abstract void method199(int arg0, int arg1, int arg2, int arg3, int arg4);

    @OriginalMember(owner = "client!o", name = "ha", descriptor = "(IIII)V")
    public abstract void method209(int arg0, int arg1, int arg2, int arg3);
}
