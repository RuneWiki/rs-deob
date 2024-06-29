import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!pga")
public abstract class class536 implements class482 {

    @OriginalMember(owner = "client!pga", name = "a", descriptor = "(FFFFFFIII)V")
    private final void method3140(float arg0, float arg1, float arg2, float arg3, float arg4, float arg5, int arg6, int arg7, int arg8) {
        this.method1508(arg0, arg1, arg2, arg3, arg4, arg5, arg6, arg7, arg8, 1);
    }

    @OriginalMember(owner = "client!pga", name = "a", descriptor = "(FFFFFFILaa;II)V")
    public abstract void method1518(float arg0, float arg1, float arg2, float arg3, float arg4, float arg5, int arg6, class488 arg7, int arg8, int arg9);

    @OriginalMember(owner = "client!pga", name = "a", descriptor = "(FFIIIII)V")
    public final void method3141(float arg0, float arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        this.method3146(arg0, arg1, (float) this.method1504() / 2.0F, (float) this.method1514() / 2.0F, arg2, arg3, arg4, arg5, arg6);
    }

    @OriginalMember(owner = "client!pga", name = "a", descriptor = "(II)V")
    public final void method3142(int arg0, int arg1) {
        this.method133(arg0, arg1, 1, 0, 1);
    }

    @OriginalMember(owner = "client!pga", name = "a", descriptor = "()I")
    public abstract int method1517();

    @OriginalMember(owner = "client!pga", name = "a", descriptor = "(IIII)V")
    public abstract void method1505(int arg0, int arg1, int arg2, int arg3);

    @OriginalMember(owner = "client!pga", name = "a", descriptor = "(FFFFFFLaa;II)V")
    private final void method3143(float arg0, float arg1, float arg2, float arg3, float arg4, float arg5, class488 arg6, int arg7, int arg8) {
        this.method1518(arg0, arg1, arg2, arg3, arg4, arg5, 1, arg6, arg7, arg8);
    }

    @OriginalMember(owner = "client!pga", name = "a", descriptor = "(IILaa;II)V")
    public abstract void method131(int arg0, int arg1, class488 arg2, int arg3, int arg4);

    @OriginalMember(owner = "client!pga", name = "a", descriptor = "(IIIIIII)V")
    public final void method3144(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        this.method132(arg0, arg1, arg2, arg3, arg4, arg5, arg6, 1);
    }

    @OriginalMember(owner = "client!pga", name = "b", descriptor = "()I")
    public abstract int method1510();

    @OriginalMember(owner = "client!pga", name = "a", descriptor = "(FFFFFFIIII)V")
    public abstract void method1508(float arg0, float arg1, float arg2, float arg3, float arg4, float arg5, int arg6, int arg7, int arg8, int arg9);

    @OriginalMember(owner = "client!pga", name = "c", descriptor = "()I")
    public abstract int method1514();

    @OriginalMember(owner = "client!pga", name = "d", descriptor = "()I")
    public abstract int method1504();

    @OriginalMember(owner = "client!pga", name = "a", descriptor = "(FFFFIILaa;II)V")
    public final void method3145(float arg0, float arg1, float arg2, float arg3, int arg4, int arg5, class488 arg6, int arg7, int arg8) {
        if (arg4 == 0) {
            return;
        }
        double var10 = (double) (arg5 & 0xFFFF) * 9.587379924285257E-5D;
        float var12 = (float) Math.sin(var10) * (float) arg4;
        float var13 = (float) Math.cos(var10) * (float) arg4;
        float var14 = (-arg2 * var13 + -arg3 * var12) / 4096.0F + arg0;
        float var15 = (-arg3 * var13 + arg2 * var12) / 4096.0F + arg1;
        float var16 = (((float) this.method1504() - arg2) * var13 + -arg3 * var12) / 4096.0F + arg0;
        float var17 = (-((float) this.method1504() - arg2) * var12 + -arg3 * var13) / 4096.0F + arg1;
        float var18 = (-arg2 * var13 + ((float) this.method1514() - arg3) * var12) / 4096.0F + arg0;
        float var19 = (arg2 * var12 + ((float) this.method1514() - arg3) * var13) / 4096.0F + arg1;
        this.method3143(var14, var15, var16, var17, var18, var19, arg6, arg7, arg8);
    }

    @OriginalMember(owner = "client!pga", name = "a", descriptor = "([I)V")
    public abstract void method1507(int[] arg0);

    @OriginalMember(owner = "client!pga", name = "b", descriptor = "(IIIIIII)V")
    public abstract void method1513(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6);

    @OriginalMember(owner = "client!pga", name = "a", descriptor = "(IIIIIIII)V")
    public abstract void method132(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7);

    @OriginalMember(owner = "client!pga", name = "a", descriptor = "(FFFFIIIII)V")
    private final void method3146(float arg0, float arg1, float arg2, float arg3, int arg4, int arg5, int arg6, int arg7, int arg8) {
        if (arg4 == 0) {
            return;
        }
        double var10 = (double) (arg5 & 0xFFFF) * 9.587379924285257E-5D;
        float var12 = (float) Math.sin(var10) * (float) arg4;
        float var13 = (float) Math.cos(var10) * (float) arg4;
        float var14 = (-arg2 * var13 + -arg3 * var12) / 4096.0F + arg0;
        float var15 = (-arg3 * var13 + arg2 * var12) / 4096.0F + arg1;
        float var16 = (((float) this.method1504() - arg2) * var13 + -arg3 * var12) / 4096.0F + arg0;
        float var17 = (-((float) this.method1504() - arg2) * var12 + -arg3 * var13) / 4096.0F + arg1;
        float var18 = (-arg2 * var13 + ((float) this.method1514() - arg3) * var12) / 4096.0F + arg0;
        float var19 = (arg2 * var12 + ((float) this.method1514() - arg3) * var13) / 4096.0F + arg1;
        this.method3140(var14, var15, var16, var17, var18, var19, arg6, arg7, arg8);
    }

    @OriginalMember(owner = "client!pga", name = "a", descriptor = "(III)V")
    public abstract void method130(int arg0, int arg1, int arg2);

    @OriginalMember(owner = "client!pga", name = "a", descriptor = "(FFII)V")
    public final void method3147(float arg0, float arg1, int arg2, int arg3) {
        this.method3146(arg0, arg1, (float) this.method1504() / 2.0F, (float) this.method1514() / 2.0F, arg2, arg3, 1, 0, 1);
    }

    @OriginalMember(owner = "client!pga", name = "a", descriptor = "(IIIII)V")
    public abstract void method133(int arg0, int arg1, int arg2, int arg3, int arg4);

    @OriginalMember(owner = "client!pga", name = "a", descriptor = "(FFIILaa;II)V")
    public final void method3148(float arg0, float arg1, int arg2, int arg3, class488 arg4, int arg5, int arg6) {
        this.method3145(arg0, arg1, (float) this.method1504() / 2.0F, (float) this.method1514() / 2.0F, arg2, arg3, arg4, arg5, arg6);
    }

    @OriginalMember(owner = "client!pga", name = "b", descriptor = "(IIII)V")
    public final void method3149(int arg0, int arg1, int arg2, int arg3) {
        this.method132(arg0, arg1, arg2, arg3, 1, 0, 1, 1);
    }

    @OriginalMember(owner = "client!pga", name = "a", descriptor = "(IIIIII)V")
    public abstract void method135(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5);

    @OriginalMember(owner = "client!pga", name = "c", descriptor = "(IIII)V")
    public final void method3150(int arg0, int arg1, int arg2, int arg3) {
        this.method1513(arg0, arg1, arg2, arg3, 1, 0, 1);
    }
}
