import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!o")
public abstract class class24 {

    @OriginalMember(owner = "client!o", name = "a", descriptor = "(FFII)V", line = 3)
    public final void method140(float arg0, float arg1, int arg2, int arg3) {
        this.method154(arg0, arg1, (float) this.method155() / 2.0F, (float) this.method153() / 2.0F, arg2, arg3, 1, 0, 1);
    }

    @OriginalMember(owner = "client!o", name = "a", descriptor = "(IIII)V", line = 7)
    public final void method141(int arg0, int arg1, int arg2, int arg3) {
        this.method6(arg0, arg1, arg2, arg3, 1, 0, 1);
    }

    @OriginalMember(owner = "client!o", name = "b", descriptor = "(IIII)V", line = 12)
    public final void method142(int arg0, int arg1, int arg2, int arg3) {
        this.method149(arg0, arg1, arg2, arg3, 1, 0, 1);
    }

    @OriginalMember(owner = "client!o", name = "a", descriptor = "(II)V", line = 20)
    public final void method144(int arg0, int arg1) {
        this.method12(arg0, arg1, 1, 0, 1);
    }

    @OriginalMember(owner = "client!o", name = "a", descriptor = "(FFIIIII)V", line = 23)
    public final void method145(float arg0, float arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        this.method154(arg0, arg1, (float) this.method155() / 2.0F, (float) this.method153() / 2.0F, arg2, arg3, arg4, arg5, arg6);
    }

    @OriginalMember(owner = "client!o", name = "a", descriptor = "(FFFFIILta;II)V", line = 29)
    public final void method148(float arg0, float arg1, float arg2, float arg3, int arg4, int arg5, class144 arg6, int arg7, int arg8) {
        if (arg4 == 0) {
            return;
        }
        double var10 = (double) (arg5 & 0xFFFF) * 9.587379924285257E-5D;
        float var12 = (float) Math.sin(var10) * (float) arg4;
        float var13 = (float) Math.cos(var10) * (float) arg4;
        float var14 = (-arg2 * var13 + -arg3 * var12) / 4096.0F + arg0;
        float var15 = (-arg3 * var13 + arg2 * var12) / 4096.0F + arg1;
        float var16 = (((float) this.method155() - arg2) * var13 + -arg3 * var12) / 4096.0F + arg0;
        float var17 = (-((float) this.method155() - arg2) * var12 + -arg3 * var13) / 4096.0F + arg1;
        float var18 = (-arg2 * var13 + ((float) this.method153() - arg3) * var12) / 4096.0F + arg0;
        float var19 = (arg2 * var12 + ((float) this.method153() - arg3) * var13) / 4096.0F + arg1;
        this.method151(var14, var15, var16, var17, var18, var19, arg6, arg7, arg8);
    }

    @OriginalMember(owner = "client!o", name = "a", descriptor = "(FFIILta;II)V", line = 56)
    public final void method152(float arg0, float arg1, int arg2, int arg3, class144 arg4, int arg5, int arg6) {
        this.method148(arg0, arg1, (float) this.method155() / 2.0F, (float) this.method153() / 2.0F, arg2, arg3, arg4, arg5, arg6);
    }

    @OriginalMember(owner = "client!o", name = "a", descriptor = "(FFFFIIIII)V", line = 62)
    private final void method154(float arg0, float arg1, float arg2, float arg3, int arg4, int arg5, int arg6, int arg7, int arg8) {
        if (arg4 == 0) {
            return;
        }
        double var10 = (double) (arg5 & 0xFFFF) * 9.587379924285257E-5D;
        float var12 = (float) Math.sin(var10) * (float) arg4;
        float var13 = (float) Math.cos(var10) * (float) arg4;
        float var14 = (-arg2 * var13 + -arg3 * var12) / 4096.0F + arg0;
        float var15 = (-arg3 * var13 + arg2 * var12) / 4096.0F + arg1;
        float var16 = (((float) this.method155() - arg2) * var13 + -arg3 * var12) / 4096.0F + arg0;
        float var17 = (-((float) this.method155() - arg2) * var12 + -arg3 * var13) / 4096.0F + arg1;
        float var18 = (-arg2 * var13 + ((float) this.method153() - arg3) * var12) / 4096.0F + arg0;
        float var19 = (arg2 * var12 + ((float) this.method153() - arg3) * var13) / 4096.0F + arg1;
        this.method143(var14, var15, var16, var17, var18, var19, arg6, arg7, arg8);
    }

    @OriginalMember(owner = "client!o", name = "XA", descriptor = "(IIIIII)V")
    public abstract void method8(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5);

    @OriginalMember(owner = "client!o", name = "a", descriptor = "(IILta;II)V")
    public abstract void method7(int arg0, int arg1, class144 arg2, int arg3, int arg4);

    @OriginalMember(owner = "client!o", name = "H", descriptor = "(FFFFFFIII)V")
    public abstract void method143(float arg0, float arg1, float arg2, float arg3, float arg4, float arg5, int arg6, int arg7, int arg8);

    @OriginalMember(owner = "client!o", name = "oa", descriptor = "(III)V")
    public abstract void method9(int arg0, int arg1, int arg2);

    @OriginalMember(owner = "client!o", name = "ya", descriptor = "(IIIIIII)V")
    public abstract void method6(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6);

    @OriginalMember(owner = "client!o", name = "ZA", descriptor = "()I")
    public abstract int method146();

    @OriginalMember(owner = "client!o", name = "ha", descriptor = "(IIII)V")
    public abstract void method147(int arg0, int arg1, int arg2, int arg3);

    @OriginalMember(owner = "client!o", name = "la", descriptor = "(IIIIIII)V")
    public abstract void method149(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6);

    @OriginalMember(owner = "client!o", name = "YA", descriptor = "()I")
    public abstract int method150();

    @OriginalMember(owner = "client!o", name = "a", descriptor = "(FFFFFFLta;II)V")
    public abstract void method151(float arg0, float arg1, float arg2, float arg3, float arg4, float arg5, class144 arg6, int arg7, int arg8);

    @OriginalMember(owner = "client!o", name = "Q", descriptor = "()I")
    public abstract int method153();

    @OriginalMember(owner = "client!o", name = "W", descriptor = "(IIIII)V")
    public abstract void method12(int arg0, int arg1, int arg2, int arg3, int arg4);

    @OriginalMember(owner = "client!o", name = "RA", descriptor = "()I")
    public abstract int method155();
}
