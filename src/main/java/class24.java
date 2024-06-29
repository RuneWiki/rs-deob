import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!o")
public abstract class class24 {

    @OriginalMember(owner = "client!o", name = "a", descriptor = "(FFII)V", line = 3)
    public final void method142(float arg0, float arg1, int arg2, int arg3) {
        this.method149(arg0, arg1, (float) this.method145() / 2.0F, (float) this.method157() / 2.0F, arg2, arg3, 1, 0, 1);
    }

    @OriginalMember(owner = "client!o", name = "a", descriptor = "(FFIILta;II)V", line = 6)
    public final void method143(float arg0, float arg1, int arg2, int arg3, class145 arg4, int arg5, int arg6) {
        this.method156(arg0, arg1, (float) this.method145() / 2.0F, (float) this.method157() / 2.0F, arg2, arg3, arg4, arg5, arg6);
    }

    @OriginalMember(owner = "client!o", name = "a", descriptor = "(FFFFIIIII)V", line = 14)
    private final void method149(float arg0, float arg1, float arg2, float arg3, int arg4, int arg5, int arg6, int arg7, int arg8) {
        if (arg4 == 0) {
            return;
        }
        double var10 = (double) (arg5 & 0xFFFF) * 9.587379924285257E-5D;
        float var12 = (float) Math.sin(var10) * (float) arg4;
        float var13 = (float) Math.cos(var10) * (float) arg4;
        float var14 = (-arg2 * var13 + -arg3 * var12) / 4096.0F + arg0;
        float var15 = (-arg3 * var13 + arg2 * var12) / 4096.0F + arg1;
        float var16 = (((float) this.method145() - arg2) * var13 + -arg3 * var12) / 4096.0F + arg0;
        float var17 = (-((float) this.method145() - arg2) * var12 + -arg3 * var13) / 4096.0F + arg1;
        float var18 = (-arg2 * var13 + ((float) this.method157() - arg3) * var12) / 4096.0F + arg0;
        float var19 = (arg2 * var12 + ((float) this.method157() - arg3) * var13) / 4096.0F + arg1;
        this.method158(var14, var15, var16, var17, var18, var19, arg6, arg7, arg8);
    }

    @OriginalMember(owner = "client!o", name = "a", descriptor = "(IIII)V", line = 38)
    public final void method150(int arg0, int arg1, int arg2, int arg3) {
        this.method162(arg0, arg1, arg2, arg3, 1, 0, 1);
    }

    @OriginalMember(owner = "client!o", name = "a", descriptor = "(II)V", line = 41)
    public final void method151(int arg0, int arg1) {
        this.method144(arg0, arg1, 1, 0, 1);
    }

    @OriginalMember(owner = "client!o", name = "a", descriptor = "(FFIIIII)V", line = 45)
    public final void method153(float arg0, float arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        this.method149(arg0, arg1, (float) this.method145() / 2.0F, (float) this.method157() / 2.0F, arg2, arg3, arg4, arg5, arg6);
    }

    @OriginalMember(owner = "client!o", name = "a", descriptor = "(FFFFIILta;II)V", line = 53)
    public final void method156(float arg0, float arg1, float arg2, float arg3, int arg4, int arg5, class145 arg6, int arg7, int arg8) {
        if (arg4 == 0) {
            return;
        }
        double var10 = (double) (arg5 & 0xFFFF) * 9.587379924285257E-5D;
        float var12 = (float) Math.sin(var10) * (float) arg4;
        float var13 = (float) Math.cos(var10) * (float) arg4;
        float var14 = (-arg2 * var13 + -arg3 * var12) / 4096.0F + arg0;
        float var15 = (-arg3 * var13 + arg2 * var12) / 4096.0F + arg1;
        float var16 = (((float) this.method145() - arg2) * var13 + -arg3 * var12) / 4096.0F + arg0;
        float var17 = (-((float) this.method145() - arg2) * var12 + -arg3 * var13) / 4096.0F + arg1;
        float var18 = (-arg2 * var13 + ((float) this.method157() - arg3) * var12) / 4096.0F + arg0;
        float var19 = (arg2 * var12 + ((float) this.method157() - arg3) * var13) / 4096.0F + arg1;
        this.method154(var14, var15, var16, var17, var18, var19, arg6, arg7, arg8);
    }

    @OriginalMember(owner = "client!o", name = "b", descriptor = "(IIII)V", line = 82)
    public final void method161(int arg0, int arg1, int arg2, int arg3) {
        this.method159(arg0, arg1, arg2, arg3, 1, 0, 1);
    }

    @OriginalMember(owner = "client!o", name = "W", descriptor = "(IIIII)V")
    public abstract void method144(int arg0, int arg1, int arg2, int arg3, int arg4);

    @OriginalMember(owner = "client!o", name = "RA", descriptor = "()I")
    public abstract int method145();

    @OriginalMember(owner = "client!o", name = "YA", descriptor = "()I")
    public abstract int method146();

    @OriginalMember(owner = "client!o", name = "XA", descriptor = "(IIIIII)V")
    public abstract void method147(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5);

    @OriginalMember(owner = "client!o", name = "a", descriptor = "(IILta;II)V")
    public abstract void method148(int arg0, int arg1, class145 arg2, int arg3, int arg4);

    @OriginalMember(owner = "client!o", name = "ha", descriptor = "(IIII)V")
    public abstract void method152(int arg0, int arg1, int arg2, int arg3);

    @OriginalMember(owner = "client!o", name = "a", descriptor = "(FFFFFFLta;II)V")
    public abstract void method154(float arg0, float arg1, float arg2, float arg3, float arg4, float arg5, class145 arg6, int arg7, int arg8);

    @OriginalMember(owner = "client!o", name = "ZA", descriptor = "()I")
    public abstract int method155();

    @OriginalMember(owner = "client!o", name = "Q", descriptor = "()I")
    public abstract int method157();

    @OriginalMember(owner = "client!o", name = "H", descriptor = "(FFFFFFIII)V")
    public abstract void method158(float arg0, float arg1, float arg2, float arg3, float arg4, float arg5, int arg6, int arg7, int arg8);

    @OriginalMember(owner = "client!o", name = "la", descriptor = "(IIIIIII)V")
    public abstract void method159(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6);

    @OriginalMember(owner = "client!o", name = "oa", descriptor = "(III)V")
    public abstract void method160(int arg0, int arg1, int arg2);

    @OriginalMember(owner = "client!o", name = "ya", descriptor = "(IIIIIII)V")
    public abstract void method162(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6);
}
