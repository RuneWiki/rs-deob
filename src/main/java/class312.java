import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!tf")
public abstract class class312 implements class726 {

    @OriginalMember(owner = "client!tf", name = "a", descriptor = "(IIII)V")
    public final void method1837(int arg0, int arg1, int arg2, int arg3) {
        this.method234(arg0, arg1, arg2, arg3, 1, 0, 1, 1);
    }

    @OriginalMember(owner = "client!tf", name = "a", descriptor = "(II)V")
    public final void method1838(int arg0, int arg1) {
        this.method240(arg0, arg1, 1, 0, 1);
    }

    @OriginalMember(owner = "client!tf", name = "a", descriptor = "(FFIILaa;II)V")
    public final void method1839(float arg0, float arg1, int arg2, int arg3, class513 arg4, int arg5, int arg6) {
        this.method1842(arg0, arg1, (float) this.method1634() / 2.0F, (float) this.method1636() / 2.0F, arg2, arg3, arg4, arg5, arg6);
    }

    @OriginalMember(owner = "client!tf", name = "a", descriptor = "(FFFFFFIII)V")
    private final void method1840(float arg0, float arg1, float arg2, float arg3, float arg4, float arg5, int arg6, int arg7, int arg8) {
        this.method1638(arg0, arg1, arg2, arg3, arg4, arg5, arg6, arg7, arg8, 1);
    }

    @OriginalMember(owner = "client!tf", name = "a", descriptor = "(FFFFFFILaa;II)V")
    public abstract void method1641(float arg0, float arg1, float arg2, float arg3, float arg4, float arg5, int arg6, class513 arg7, int arg8, int arg9);

    @OriginalMember(owner = "client!tf", name = "b", descriptor = "(IIII)V")
    public abstract void method1632(int arg0, int arg1, int arg2, int arg3);

    @OriginalMember(owner = "client!tf", name = "a", descriptor = "()I")
    public abstract int method1636();

    @OriginalMember(owner = "client!tf", name = "a", descriptor = "(FFII)V")
    public final void method1841(float arg0, float arg1, int arg2, int arg3) {
        this.method1847(arg0, arg1, (float) this.method1634() / 2.0F, (float) this.method1636() / 2.0F, arg2, arg3, 1, 0, 1);
    }

    @OriginalMember(owner = "client!tf", name = "b", descriptor = "()I")
    public abstract int method1637();

    @OriginalMember(owner = "client!tf", name = "a", descriptor = "(III)V")
    public abstract void method233(int arg0, int arg1, int arg2);

    @OriginalMember(owner = "client!tf", name = "a", descriptor = "(IIIIIII)V")
    public abstract void method1635(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6);

    @OriginalMember(owner = "client!tf", name = "c", descriptor = "()I")
    public abstract int method1634();

    @OriginalMember(owner = "client!tf", name = "a", descriptor = "(IIIIIIII)V")
    public abstract void method234(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7);

    @OriginalMember(owner = "client!tf", name = "a", descriptor = "(FFFFIILaa;II)V")
    public final void method1842(float arg0, float arg1, float arg2, float arg3, int arg4, int arg5, class513 arg6, int arg7, int arg8) {
        if (arg4 == 0) {
            return;
        }
        double var10 = (double) (arg5 & 0xFFFF) * 9.587379924285257E-5D;
        float var12 = (float) Math.sin(var10) * (float) arg4;
        float var13 = (float) Math.cos(var10) * (float) arg4;
        float var14 = (-arg2 * var13 + -arg3 * var12) / 4096.0F + arg0;
        float var15 = (-arg3 * var13 + arg2 * var12) / 4096.0F + arg1;
        float var16 = (((float) this.method1634() - arg2) * var13 + -arg3 * var12) / 4096.0F + arg0;
        float var17 = (-((float) this.method1634() - arg2) * var12 + -arg3 * var13) / 4096.0F + arg1;
        float var18 = (-arg2 * var13 + ((float) this.method1636() - arg3) * var12) / 4096.0F + arg0;
        float var19 = (arg2 * var12 + ((float) this.method1636() - arg3) * var13) / 4096.0F + arg1;
        this.method1845(var14, var15, var16, var17, var18, var19, arg6, arg7, arg8);
    }

    @OriginalMember(owner = "client!tf", name = "b", descriptor = "(IIIIIII)V")
    public final void method1843(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        this.method234(arg0, arg1, arg2, arg3, arg4, arg5, arg6, 1);
    }

    @OriginalMember(owner = "client!tf", name = "a", descriptor = "(IIIII)V")
    public abstract void method240(int arg0, int arg1, int arg2, int arg3, int arg4);

    @OriginalMember(owner = "client!tf", name = "c", descriptor = "(IIII)V")
    public final void method1844(int arg0, int arg1, int arg2, int arg3) {
        this.method1635(arg0, arg1, arg2, arg3, 1, 0, 1);
    }

    @OriginalMember(owner = "client!tf", name = "a", descriptor = "(FFFFFFIIII)V")
    public abstract void method1638(float arg0, float arg1, float arg2, float arg3, float arg4, float arg5, int arg6, int arg7, int arg8, int arg9);

    @OriginalMember(owner = "client!tf", name = "a", descriptor = "(FFFFFFLaa;II)V")
    private final void method1845(float arg0, float arg1, float arg2, float arg3, float arg4, float arg5, class513 arg6, int arg7, int arg8) {
        this.method1641(arg0, arg1, arg2, arg3, arg4, arg5, 1, arg6, arg7, arg8);
    }

    @OriginalMember(owner = "client!tf", name = "a", descriptor = "(IILaa;II)V")
    public abstract void method238(int arg0, int arg1, class513 arg2, int arg3, int arg4);

    @OriginalMember(owner = "client!tf", name = "a", descriptor = "(FFIIIII)V")
    public final void method1846(float arg0, float arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        this.method1847(arg0, arg1, (float) this.method1634() / 2.0F, (float) this.method1636() / 2.0F, arg2, arg3, arg4, arg5, arg6);
    }

    @OriginalMember(owner = "client!tf", name = "a", descriptor = "(FFFFIIIII)V")
    private final void method1847(float arg0, float arg1, float arg2, float arg3, int arg4, int arg5, int arg6, int arg7, int arg8) {
        if (arg4 == 0) {
            return;
        }
        double var10 = (double) (arg5 & 0xFFFF) * 9.587379924285257E-5D;
        float var12 = (float) Math.sin(var10) * (float) arg4;
        float var13 = (float) Math.cos(var10) * (float) arg4;
        float var14 = (-arg2 * var13 + -arg3 * var12) / 4096.0F + arg0;
        float var15 = (-arg3 * var13 + arg2 * var12) / 4096.0F + arg1;
        float var16 = (((float) this.method1634() - arg2) * var13 + -arg3 * var12) / 4096.0F + arg0;
        float var17 = (-((float) this.method1634() - arg2) * var12 + -arg3 * var13) / 4096.0F + arg1;
        float var18 = (-arg2 * var13 + ((float) this.method1636() - arg3) * var12) / 4096.0F + arg0;
        float var19 = (arg2 * var12 + ((float) this.method1636() - arg3) * var13) / 4096.0F + arg1;
        this.method1840(var14, var15, var16, var17, var18, var19, arg6, arg7, arg8);
    }

    @OriginalMember(owner = "client!tf", name = "a", descriptor = "([I)V")
    public abstract void method1633(int[] arg0);

    @OriginalMember(owner = "client!tf", name = "d", descriptor = "()I")
    public abstract int method1640();

    @OriginalMember(owner = "client!tf", name = "a", descriptor = "(IIIIII)V")
    public abstract void method239(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5);
}
