import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!o")
public abstract class class363 {

    @OriginalMember(owner = "client!o", name = "a", descriptor = "(II)V", line = 6)
    public final void method2316(int arg0, int arg1) {
        this.method392(arg0, arg1, 1, 0, 1);
    }

    @OriginalMember(owner = "client!o", name = "a", descriptor = "(FFII)V", line = 9)
    public final void method2317(float arg0, float arg1, int arg2, int arg3) {
        this.method2318(arg0, arg1, (float) this.method394() / 2.0F, (float) this.method396() / 2.0F, arg2, arg3, 1, 0, 1);
    }

    @OriginalMember(owner = "client!o", name = "a", descriptor = "(FFFFIIIII)V", line = 15)
    private final void method2318(float arg0, float arg1, float arg2, float arg3, int arg4, int arg5, int arg6, int arg7, int arg8) {
        if (arg4 == 0) {
            return;
        }
        double var10 = (double) (arg5 & 0xFFFF) * 9.587379924285257E-5D;
        float var12 = (float) Math.sin(var10) * (float) arg4;
        float var13 = (float) Math.cos(var10) * (float) arg4;
        float var14 = (-arg2 * var13 + -arg3 * var12) / 4096.0F + arg0;
        float var15 = (-arg3 * var13 + arg2 * var12) / 4096.0F + arg1;
        float var16 = (((float) this.method394() - arg2) * var13 + -arg3 * var12) / 4096.0F + arg0;
        float var17 = (-((float) this.method394() - arg2) * var12 + -arg3 * var13) / 4096.0F + arg1;
        float var18 = (-arg2 * var13 + ((float) this.method396() - arg3) * var12) / 4096.0F + arg0;
        float var19 = (arg2 * var12 + ((float) this.method396() - arg3) * var13) / 4096.0F + arg1;
        this.method402(var14, var15, var16, var17, var18, var19, arg6, arg7, arg8);
    }

    @OriginalMember(owner = "client!o", name = "a", descriptor = "(FFIIIII)V", line = 41)
    public final void method2319(float arg0, float arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        this.method2318(arg0, arg1, (float) this.method394() / 2.0F, (float) this.method396() / 2.0F, arg2, arg3, arg4, arg5, arg6);
    }

    @OriginalMember(owner = "client!o", name = "a", descriptor = "(IIII)V", line = 45)
    public final void method2320(int arg0, int arg1, int arg2, int arg3) {
        this.method395(arg0, arg1, arg2, arg3, 1, 0, 1);
    }

    @OriginalMember(owner = "client!o", name = "b", descriptor = "(IIII)V", line = 57)
    public final void method2321(int arg0, int arg1, int arg2, int arg3) {
        this.method389(arg0, arg1, arg2, arg3, 1, 0, 1);
    }

    @OriginalMember(owner = "client!o", name = "a", descriptor = "(FFIILta;II)V", line = 60)
    public final void method2322(float arg0, float arg1, int arg2, int arg3, class340 arg4, int arg5, int arg6) {
        this.method2323(arg0, arg1, (float) this.method394() / 2.0F, (float) this.method396() / 2.0F, arg2, arg3, arg4, arg5, arg6);
    }

    @OriginalMember(owner = "client!o", name = "a", descriptor = "(FFFFIILta;II)V", line = 63)
    public final void method2323(float arg0, float arg1, float arg2, float arg3, int arg4, int arg5, class340 arg6, int arg7, int arg8) {
        if (arg4 == 0) {
            return;
        }
        double var10 = (double) (arg5 & 0xFFFF) * 9.587379924285257E-5D;
        float var12 = (float) Math.sin(var10) * (float) arg4;
        float var13 = (float) Math.cos(var10) * (float) arg4;
        float var14 = (-arg2 * var13 + -arg3 * var12) / 4096.0F + arg0;
        float var15 = (-arg3 * var13 + arg2 * var12) / 4096.0F + arg1;
        float var16 = (((float) this.method394() - arg2) * var13 + -arg3 * var12) / 4096.0F + arg0;
        float var17 = (-((float) this.method394() - arg2) * var12 + -arg3 * var13) / 4096.0F + arg1;
        float var18 = (-arg2 * var13 + ((float) this.method396() - arg3) * var12) / 4096.0F + arg0;
        float var19 = (arg2 * var12 + ((float) this.method396() - arg3) * var13) / 4096.0F + arg1;
        this.method401(var14, var15, var16, var17, var18, var19, arg6, arg7, arg8);
    }

    @OriginalMember(owner = "client!o", name = "W", descriptor = "(IIIII)V")
    public abstract void method392(int arg0, int arg1, int arg2, int arg3, int arg4);

    @OriginalMember(owner = "client!o", name = "ya", descriptor = "(IIIIIII)V")
    public abstract void method395(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6);

    @OriginalMember(owner = "client!o", name = "la", descriptor = "(IIIIIII)V")
    public abstract void method389(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6);

    @OriginalMember(owner = "client!o", name = "RA", descriptor = "()I")
    public abstract int method394();

    @OriginalMember(owner = "client!o", name = "ha", descriptor = "(IIII)V")
    public abstract void method400(int arg0, int arg1, int arg2, int arg3);

    @OriginalMember(owner = "client!o", name = "H", descriptor = "(FFFFFFIII)V")
    public abstract void method402(float arg0, float arg1, float arg2, float arg3, float arg4, float arg5, int arg6, int arg7, int arg8);

    @OriginalMember(owner = "client!o", name = "oa", descriptor = "(III)V")
    public abstract void method1214(int arg0, int arg1, int arg2);

    @OriginalMember(owner = "client!o", name = "YA", descriptor = "()I")
    public abstract int method398();

    @OriginalMember(owner = "client!o", name = "XA", descriptor = "(IIIIII)V")
    public abstract void method1213(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5);

    @OriginalMember(owner = "client!o", name = "a", descriptor = "(IILta;II)V")
    public abstract void method397(int arg0, int arg1, class340 arg2, int arg3, int arg4);

    @OriginalMember(owner = "client!o", name = "a", descriptor = "(FFFFFFLta;II)V")
    public abstract void method401(float arg0, float arg1, float arg2, float arg3, float arg4, float arg5, class340 arg6, int arg7, int arg8);

    @OriginalMember(owner = "client!o", name = "ZA", descriptor = "()I")
    public abstract int method399();

    @OriginalMember(owner = "client!o", name = "Q", descriptor = "()I")
    public abstract int method396();
}
