import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!jd")
public abstract class class241 implements class627 {

    @OriginalMember(owner = "client!jd", name = "a", descriptor = "(FFFFFFIII)V", line = 6)
    private final void method1602(float arg0, float arg1, float arg2, float arg3, float arg4, float arg5, int arg6, int arg7, int arg8) {
        this.method1503(arg0, arg1, arg2, arg3, arg4, arg5, arg6, arg7, arg8, 1);
    }

    @OriginalMember(owner = "client!jd", name = "a", descriptor = "(IIIIIII)V", line = 12)
    public final void method1603(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        this.method361(arg0, arg1, arg2, arg3, arg4, arg5, arg6, 1);
    }

    @OriginalMember(owner = "client!jd", name = "a", descriptor = "(II)V", line = 15)
    public final void method1604(int arg0, int arg1) {
        this.method364(arg0, arg1, 1, 0, 1);
    }

    @OriginalMember(owner = "client!jd", name = "a", descriptor = "(FFIIIII)V", line = 18)
    public final void method1605(float arg0, float arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        this.method1609(arg0, arg1, (float) this.method1507() / 2.0F, (float) this.method1505() / 2.0F, arg2, arg3, arg4, arg5, arg6);
    }

    @OriginalMember(owner = "client!jd", name = "a", descriptor = "(FFFFFFLaa;II)V", line = 21)
    private final void method1606(float arg0, float arg1, float arg2, float arg3, float arg4, float arg5, class511 arg6, int arg7, int arg8) {
        this.method1501(arg0, arg1, arg2, arg3, arg4, arg5, 1, arg6, arg7, arg8);
    }

    @OriginalMember(owner = "client!jd", name = "a", descriptor = "(IIII)V", line = 27)
    public final void method1607(int arg0, int arg1, int arg2, int arg3) {
        this.method361(arg0, arg1, arg2, arg3, 1, 0, 1, 1);
    }

    @OriginalMember(owner = "client!jd", name = "a", descriptor = "(FFIILaa;II)V", line = 31)
    public final void method1608(float arg0, float arg1, int arg2, int arg3, class511 arg4, int arg5, int arg6) {
        this.method1611(arg0, arg1, (float) this.method1507() / 2.0F, (float) this.method1505() / 2.0F, arg2, arg3, arg4, arg5, arg6);
    }

    @OriginalMember(owner = "client!jd", name = "a", descriptor = "(FFFFIIIII)V", line = 41)
    private final void method1609(float arg0, float arg1, float arg2, float arg3, int arg4, int arg5, int arg6, int arg7, int arg8) {
        if (arg4 == 0) {
            return;
        }
        double var10 = (double) (arg5 & 0xFFFF) * 9.587379924285257E-5D;
        float var12 = (float) Math.sin(var10) * (float) arg4;
        float var13 = (float) Math.cos(var10) * (float) arg4;
        float var14 = (-arg2 * var13 + -arg3 * var12) / 4096.0F + arg0;
        float var15 = (-arg3 * var13 + arg2 * var12) / 4096.0F + arg1;
        float var16 = (((float) this.method1507() - arg2) * var13 + -arg3 * var12) / 4096.0F + arg0;
        float var17 = (-((float) this.method1507() - arg2) * var12 + -arg3 * var13) / 4096.0F + arg1;
        float var18 = (-arg2 * var13 + ((float) this.method1505() - arg3) * var12) / 4096.0F + arg0;
        float var19 = (arg2 * var12 + ((float) this.method1505() - arg3) * var13) / 4096.0F + arg1;
        this.method1602(var14, var15, var16, var17, var18, var19, arg6, arg7, arg8);
    }

    @OriginalMember(owner = "client!jd", name = "c", descriptor = "(IIII)V", line = 65)
    public final void method1610(int arg0, int arg1, int arg2, int arg3) {
        this.method1510(arg0, arg1, arg2, arg3, 1, 0, 1);
    }

    @OriginalMember(owner = "client!jd", name = "a", descriptor = "(FFFFIILaa;II)V", line = 69)
    public final void method1611(float arg0, float arg1, float arg2, float arg3, int arg4, int arg5, class511 arg6, int arg7, int arg8) {
        if (arg4 == 0) {
            return;
        }
        double var10 = (double) (arg5 & 0xFFFF) * 9.587379924285257E-5D;
        float var12 = (float) Math.sin(var10) * (float) arg4;
        float var13 = (float) Math.cos(var10) * (float) arg4;
        float var14 = (-arg2 * var13 + -arg3 * var12) / 4096.0F + arg0;
        float var15 = (-arg3 * var13 + arg2 * var12) / 4096.0F + arg1;
        float var16 = (((float) this.method1507() - arg2) * var13 + -arg3 * var12) / 4096.0F + arg0;
        float var17 = (-((float) this.method1507() - arg2) * var12 + -arg3 * var13) / 4096.0F + arg1;
        float var18 = (-arg2 * var13 + ((float) this.method1505() - arg3) * var12) / 4096.0F + arg0;
        float var19 = (arg2 * var12 + ((float) this.method1505() - arg3) * var13) / 4096.0F + arg1;
        this.method1606(var14, var15, var16, var17, var18, var19, arg6, arg7, arg8);
    }

    @OriginalMember(owner = "client!jd", name = "a", descriptor = "(FFII)V", line = 95)
    public final void method1612(float arg0, float arg1, int arg2, int arg3) {
        this.method1609(arg0, arg1, (float) this.method1507() / 2.0F, (float) this.method1505() / 2.0F, arg2, arg3, 1, 0, 1);
    }

    @OriginalMember(owner = "client!jd", name = "a", descriptor = "()I")
    public abstract int method1502();

    @OriginalMember(owner = "client!jd", name = "b", descriptor = "()I")
    public abstract int method1507();

    @OriginalMember(owner = "client!jd", name = "a", descriptor = "(IIIIII)V")
    public abstract void method360(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5);

    @OriginalMember(owner = "client!jd", name = "a", descriptor = "(IIIIIIII)V")
    public abstract void method361(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7);

    @OriginalMember(owner = "client!jd", name = "a", descriptor = "(IIIII)V")
    public abstract void method364(int arg0, int arg1, int arg2, int arg3, int arg4);

    @OriginalMember(owner = "client!jd", name = "a", descriptor = "(FFFFFFIIII)V")
    public abstract void method1503(float arg0, float arg1, float arg2, float arg3, float arg4, float arg5, int arg6, int arg7, int arg8, int arg9);

    @OriginalMember(owner = "client!jd", name = "a", descriptor = "(IILaa;II)V")
    public abstract void method359(int arg0, int arg1, class511 arg2, int arg3, int arg4);

    @OriginalMember(owner = "client!jd", name = "b", descriptor = "(IIIIIII)V")
    public abstract void method1510(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6);

    @OriginalMember(owner = "client!jd", name = "c", descriptor = "()I")
    public abstract int method1505();

    @OriginalMember(owner = "client!jd", name = "b", descriptor = "(IIII)V")
    public abstract void method1506(int arg0, int arg1, int arg2, int arg3);

    @OriginalMember(owner = "client!jd", name = "a", descriptor = "(III)V")
    public abstract void method365(int arg0, int arg1, int arg2);

    @OriginalMember(owner = "client!jd", name = "a", descriptor = "([I)V")
    public abstract void method1499(int[] arg0);

    @OriginalMember(owner = "client!jd", name = "d", descriptor = "()I")
    public abstract int method1508();

    @OriginalMember(owner = "client!jd", name = "a", descriptor = "(FFFFFFILaa;II)V")
    public abstract void method1501(float arg0, float arg1, float arg2, float arg3, float arg4, float arg5, int arg6, class511 arg7, int arg8, int arg9);
}
