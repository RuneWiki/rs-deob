import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!o")
public abstract class class24 {

    @OriginalMember(owner = "client!o", name = "a", descriptor = "(FFFFIILta;II)V", line = 5)
    public final void method149(float arg0, float arg1, float arg2, float arg3, int arg4, int arg5, class144 arg6, int arg7, int arg8) {
        if (arg4 == 0) {
            return;
        }
        double var10 = (double) (arg5 & 0xFFFF) * 9.587379924285257E-5D;
        float var12 = (float) Math.sin(var10) * (float) arg4;
        float var13 = (float) Math.cos(var10) * (float) arg4;
        float var14 = (-arg2 * var13 + -arg3 * var12) / 4096.0F + arg0;
        float var15 = (-arg3 * var13 + arg2 * var12) / 4096.0F + arg1;
        float var16 = (((float) this.method147() - arg2) * var13 + -arg3 * var12) / 4096.0F + arg0;
        float var17 = (-((float) this.method147() - arg2) * var12 + -arg3 * var13) / 4096.0F + arg1;
        float var18 = (-arg2 * var13 + ((float) this.method165() - arg3) * var12) / 4096.0F + arg0;
        float var19 = (arg2 * var12 + ((float) this.method165() - arg3) * var13) / 4096.0F + arg1;
        this.method158(var14, var15, var16, var17, var18, var19, arg6, arg7, arg8);
    }

    @OriginalMember(owner = "client!o", name = "a", descriptor = "(IIII)V", line = 31)
    public final void method151(int arg0, int arg1, int arg2, int arg3) {
        this.method163(arg0, arg1, arg2, arg3, 1, 0, 1);
    }

    @OriginalMember(owner = "client!o", name = "a", descriptor = "(FFIILta;II)V", line = 38)
    public final void method155(float arg0, float arg1, int arg2, int arg3, class144 arg4, int arg5, int arg6) {
        this.method149(arg0, arg1, (float) this.method147() / 2.0F, (float) this.method165() / 2.0F, arg2, arg3, arg4, arg5, arg6);
    }

    @OriginalMember(owner = "client!o", name = "a", descriptor = "(FFIIIII)V", line = 41)
    public final void method156(float arg0, float arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        this.method161(arg0, arg1, (float) this.method147() / 2.0F, (float) this.method165() / 2.0F, arg2, arg3, arg4, arg5, arg6);
    }

    @OriginalMember(owner = "client!o", name = "a", descriptor = "(II)V", line = 46)
    public final void method159(int arg0, int arg1) {
        this.method167(arg0, arg1, 1, 0, 1);
    }

    @OriginalMember(owner = "client!o", name = "a", descriptor = "(FFFFIIIII)V", line = 50)
    private final void method161(float arg0, float arg1, float arg2, float arg3, int arg4, int arg5, int arg6, int arg7, int arg8) {
        if (arg4 == 0) {
            return;
        }
        double var10 = (double) (arg5 & 0xFFFF) * 9.587379924285257E-5D;
        float var12 = (float) Math.sin(var10) * (float) arg4;
        float var13 = (float) Math.cos(var10) * (float) arg4;
        float var14 = (-arg2 * var13 + -arg3 * var12) / 4096.0F + arg0;
        float var15 = (-arg3 * var13 + arg2 * var12) / 4096.0F + arg1;
        float var16 = (((float) this.method147() - arg2) * var13 + -arg3 * var12) / 4096.0F + arg0;
        float var17 = (-((float) this.method147() - arg2) * var12 + -arg3 * var13) / 4096.0F + arg1;
        float var18 = (-arg2 * var13 + ((float) this.method165() - arg3) * var12) / 4096.0F + arg0;
        float var19 = (arg2 * var12 + ((float) this.method165() - arg3) * var13) / 4096.0F + arg1;
        this.method160(var14, var15, var16, var17, var18, var19, arg6, arg7, arg8);
    }

    @OriginalMember(owner = "client!o", name = "b", descriptor = "(IIII)V", line = 74)
    public final void method162(int arg0, int arg1, int arg2, int arg3) {
        this.method152(arg0, arg1, arg2, arg3, 1, 0, 1);
    }

    @OriginalMember(owner = "client!o", name = "a", descriptor = "(FFII)V", line = 78)
    public final void method164(float arg0, float arg1, int arg2, int arg3) {
        this.method161(arg0, arg1, (float) this.method147() / 2.0F, (float) this.method165() / 2.0F, arg2, arg3, 1, 0, 1);
    }

    @OriginalMember(owner = "client!o", name = "RA", descriptor = "()I")
    public abstract int method147();

    @OriginalMember(owner = "client!o", name = "ha", descriptor = "(IIII)V")
    public abstract void method148(int arg0, int arg1, int arg2, int arg3);

    @OriginalMember(owner = "client!o", name = "XA", descriptor = "(IIIIII)V")
    public abstract void method150(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5);

    @OriginalMember(owner = "client!o", name = "la", descriptor = "(IIIIIII)V")
    public abstract void method152(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6);

    @OriginalMember(owner = "client!o", name = "oa", descriptor = "(III)V")
    public abstract void method153(int arg0, int arg1, int arg2);

    @OriginalMember(owner = "client!o", name = "ZA", descriptor = "()I")
    public abstract int method154();

    @OriginalMember(owner = "client!o", name = "YA", descriptor = "()I")
    public abstract int method157();

    @OriginalMember(owner = "client!o", name = "a", descriptor = "(FFFFFFLta;II)V")
    public abstract void method158(float arg0, float arg1, float arg2, float arg3, float arg4, float arg5, class144 arg6, int arg7, int arg8);

    @OriginalMember(owner = "client!o", name = "H", descriptor = "(FFFFFFIII)V")
    public abstract void method160(float arg0, float arg1, float arg2, float arg3, float arg4, float arg5, int arg6, int arg7, int arg8);

    @OriginalMember(owner = "client!o", name = "ya", descriptor = "(IIIIIII)V")
    public abstract void method163(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6);

    @OriginalMember(owner = "client!o", name = "Q", descriptor = "()I")
    public abstract int method165();

    @OriginalMember(owner = "client!o", name = "a", descriptor = "(IILta;II)V")
    public abstract void method166(int arg0, int arg1, class144 arg2, int arg3, int arg4);

    @OriginalMember(owner = "client!o", name = "W", descriptor = "(IIIII)V")
    public abstract void method167(int arg0, int arg1, int arg2, int arg3, int arg4);
}
