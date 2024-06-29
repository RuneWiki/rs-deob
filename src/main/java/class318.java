import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ho")
public abstract class class318 implements class621 {

    @OriginalMember(owner = "client!ho", name = "a", descriptor = "(FFFFIILaa;II)V", line = 3)
    public final void method2023(float arg0, float arg1, float arg2, float arg3, int arg4, int arg5, class87 arg6, int arg7, int arg8) {
        if (arg4 == 0) {
            return;
        }
        double var10 = (double) (arg5 & 0xFFFF) * 9.587379924285257E-5D;
        float var12 = (float) Math.sin(var10) * (float) arg4;
        float var13 = (float) Math.cos(var10) * (float) arg4;
        float var14 = (-arg2 * var13 + -arg3 * var12) / 4096.0F + arg0;
        float var15 = (-arg3 * var13 + arg2 * var12) / 4096.0F + arg1;
        float var16 = (((float) this.method749() - arg2) * var13 + -arg3 * var12) / 4096.0F + arg0;
        float var17 = (-((float) this.method749() - arg2) * var12 + -arg3 * var13) / 4096.0F + arg1;
        float var18 = (-arg2 * var13 + ((float) this.method736() - arg3) * var12) / 4096.0F + arg0;
        float var19 = (arg2 * var12 + ((float) this.method736() - arg3) * var13) / 4096.0F + arg1;
        this.method2026(var14, var15, var16, var17, var18, var19, arg6, arg7, arg8);
    }

    @OriginalMember(owner = "client!ho", name = "a", descriptor = "(FFII)V", line = 29)
    public final void method2024(float arg0, float arg1, int arg2, int arg3) {
        this.method2032(arg0, arg1, (float) this.method749() / 2.0F, (float) this.method736() / 2.0F, arg2, arg3, 1, 0, 1);
    }

    @OriginalMember(owner = "client!ho", name = "a", descriptor = "(II)V", line = 34)
    public final void method2025(int arg0, int arg1) {
        this.method746(arg0, arg1, 1, 0, 1);
    }

    @OriginalMember(owner = "client!ho", name = "a", descriptor = "(FFFFFFLaa;II)V", line = 37)
    private final void method2026(float arg0, float arg1, float arg2, float arg3, float arg4, float arg5, class87 arg6, int arg7, int arg8) {
        this.method745(arg0, arg1, arg2, arg3, arg4, arg5, 1, arg6, arg7, arg8);
    }

    @OriginalMember(owner = "client!ho", name = "a", descriptor = "(FFIILaa;II)V", line = 41)
    public final void method2027(float arg0, float arg1, int arg2, int arg3, class87 arg4, int arg5, int arg6) {
        this.method2023(arg0, arg1, (float) this.method749() / 2.0F, (float) this.method736() / 2.0F, arg2, arg3, arg4, arg5, arg6);
    }

    @OriginalMember(owner = "client!ho", name = "a", descriptor = "(IIIIIII)V", line = 45)
    public final void method2028(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        this.method735(arg0, arg1, arg2, arg3, arg4, arg5, arg6, 1);
    }

    @OriginalMember(owner = "client!ho", name = "a", descriptor = "(FFFFFFIII)V", line = 48)
    private final void method2029(float arg0, float arg1, float arg2, float arg3, float arg4, float arg5, int arg6, int arg7, int arg8) {
        this.method742(arg0, arg1, arg2, arg3, arg4, arg5, arg6, arg7, arg8, 1);
    }

    @OriginalMember(owner = "client!ho", name = "a", descriptor = "(FFIIIII)V", line = 52)
    public final void method2030(float arg0, float arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        this.method2032(arg0, arg1, (float) this.method749() / 2.0F, (float) this.method736() / 2.0F, arg2, arg3, arg4, arg5, arg6);
    }

    @OriginalMember(owner = "client!ho", name = "a", descriptor = "(IIII)V", line = 55)
    public final void method2031(int arg0, int arg1, int arg2, int arg3) {
        this.method748(arg0, arg1, arg2, arg3, 1, 0, 1);
    }

    @OriginalMember(owner = "client!ho", name = "a", descriptor = "(FFFFIIIII)V", line = 68)
    private final void method2032(float arg0, float arg1, float arg2, float arg3, int arg4, int arg5, int arg6, int arg7, int arg8) {
        if (arg4 == 0) {
            return;
        }
        double var10 = (double) (arg5 & 0xFFFF) * 9.587379924285257E-5D;
        float var12 = (float) Math.sin(var10) * (float) arg4;
        float var13 = (float) Math.cos(var10) * (float) arg4;
        float var14 = (-arg2 * var13 + -arg3 * var12) / 4096.0F + arg0;
        float var15 = (-arg3 * var13 + arg2 * var12) / 4096.0F + arg1;
        float var16 = (((float) this.method749() - arg2) * var13 + -arg3 * var12) / 4096.0F + arg0;
        float var17 = (-((float) this.method749() - arg2) * var12 + -arg3 * var13) / 4096.0F + arg1;
        float var18 = (-arg2 * var13 + ((float) this.method736() - arg3) * var12) / 4096.0F + arg0;
        float var19 = (arg2 * var12 + ((float) this.method736() - arg3) * var13) / 4096.0F + arg1;
        this.method2029(var14, var15, var16, var17, var18, var19, arg6, arg7, arg8);
    }

    @OriginalMember(owner = "client!ho", name = "c", descriptor = "(IIII)V", line = 93)
    public final void method2033(int arg0, int arg1, int arg2, int arg3) {
        this.method735(arg0, arg1, arg2, arg3, 1, 0, 1, 1);
    }

    @OriginalMember(owner = "client!ho", name = "a", descriptor = "(IIIIIIII)V")
    public abstract void method735(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7);

    @OriginalMember(owner = "client!ho", name = "a", descriptor = "(FFFFFFILaa;II)V")
    public abstract void method745(float arg0, float arg1, float arg2, float arg3, float arg4, float arg5, int arg6, class87 arg7, int arg8, int arg9);

    @OriginalMember(owner = "client!ho", name = "a", descriptor = "()I")
    public abstract int method738();

    @OriginalMember(owner = "client!ho", name = "a", descriptor = "(IIIII)V")
    public abstract void method746(int arg0, int arg1, int arg2, int arg3, int arg4);

    @OriginalMember(owner = "client!ho", name = "a", descriptor = "([I)V")
    public abstract void method744(int[] arg0);

    @OriginalMember(owner = "client!ho", name = "b", descriptor = "(IIIIIII)V")
    public abstract void method748(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6);

    @OriginalMember(owner = "client!ho", name = "a", descriptor = "(FFFFFFIIII)V")
    public abstract void method742(float arg0, float arg1, float arg2, float arg3, float arg4, float arg5, int arg6, int arg7, int arg8, int arg9);

    @OriginalMember(owner = "client!ho", name = "b", descriptor = "()I")
    public abstract int method736();

    @OriginalMember(owner = "client!ho", name = "b", descriptor = "(IIII)V")
    public abstract void method741(int arg0, int arg1, int arg2, int arg3);

    @OriginalMember(owner = "client!ho", name = "a", descriptor = "(IIIIII)V")
    public abstract void method988(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5);

    @OriginalMember(owner = "client!ho", name = "a", descriptor = "(IILaa;II)V")
    public abstract void method747(int arg0, int arg1, class87 arg2, int arg3, int arg4);

    @OriginalMember(owner = "client!ho", name = "a", descriptor = "(III)V")
    public abstract void method992(int arg0, int arg1, int arg2);

    @OriginalMember(owner = "client!ho", name = "c", descriptor = "()I")
    public abstract int method749();

    @OriginalMember(owner = "client!ho", name = "d", descriptor = "()I")
    public abstract int method737();
}
