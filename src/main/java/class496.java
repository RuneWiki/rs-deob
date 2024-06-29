import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!mi")
public abstract class class496 implements class372 {

    @OriginalMember(owner = "client!mi", name = "a", descriptor = "(FFFFIIIII)V", line = 3)
    private final void method2920(float arg0, float arg1, float arg2, float arg3, int arg4, int arg5, int arg6, int arg7, int arg8) {
        if (arg4 == 0) {
            return;
        }
        double var10 = (double) (arg5 & 0xFFFF) * 9.587379924285257E-5D;
        float var12 = (float) Math.sin(var10) * (float) arg4;
        float var13 = (float) Math.cos(var10) * (float) arg4;
        float var14 = (-arg2 * var13 + -arg3 * var12) / 4096.0F + arg0;
        float var15 = (-arg3 * var13 + arg2 * var12) / 4096.0F + arg1;
        float var16 = (((float) this.method1618() - arg2) * var13 + -arg3 * var12) / 4096.0F + arg0;
        float var17 = (-((float) this.method1618() - arg2) * var12 + -arg3 * var13) / 4096.0F + arg1;
        float var18 = (-arg2 * var13 + ((float) this.method1614() - arg3) * var12) / 4096.0F + arg0;
        float var19 = (arg2 * var12 + ((float) this.method1614() - arg3) * var13) / 4096.0F + arg1;
        this.method2929(var14, var15, var16, var17, var18, var19, arg6, arg7, arg8);
    }

    @OriginalMember(owner = "client!mi", name = "a", descriptor = "(FFFFIILaa;II)V", line = 32)
    public final void method2921(float arg0, float arg1, float arg2, float arg3, int arg4, int arg5, class487 arg6, int arg7, int arg8) {
        if (arg4 == 0) {
            return;
        }
        double var10 = (double) (arg5 & 0xFFFF) * 9.587379924285257E-5D;
        float var12 = (float) Math.sin(var10) * (float) arg4;
        float var13 = (float) Math.cos(var10) * (float) arg4;
        float var14 = (-arg2 * var13 + -arg3 * var12) / 4096.0F + arg0;
        float var15 = (-arg3 * var13 + arg2 * var12) / 4096.0F + arg1;
        float var16 = (((float) this.method1618() - arg2) * var13 + -arg3 * var12) / 4096.0F + arg0;
        float var17 = (-((float) this.method1618() - arg2) * var12 + -arg3 * var13) / 4096.0F + arg1;
        float var18 = (-arg2 * var13 + ((float) this.method1614() - arg3) * var12) / 4096.0F + arg0;
        float var19 = (arg2 * var12 + ((float) this.method1614() - arg3) * var13) / 4096.0F + arg1;
        this.method2926(var14, var15, var16, var17, var18, var19, arg6, arg7, arg8);
    }

    @OriginalMember(owner = "client!mi", name = "b", descriptor = "(IIIIIII)V", line = 58)
    public final void method2922(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        this.method1196(arg0, arg1, arg2, arg3, arg4, arg5, arg6, 1);
    }

    @OriginalMember(owner = "client!mi", name = "a", descriptor = "(IIII)V", line = 63)
    public final void method2923(int arg0, int arg1, int arg2, int arg3) {
        this.method1622(arg0, arg1, arg2, arg3, 1, 0, 1);
    }

    @OriginalMember(owner = "client!mi", name = "b", descriptor = "(IIII)V", line = 66)
    public final void method2924(int arg0, int arg1, int arg2, int arg3) {
        this.method1196(arg0, arg1, arg2, arg3, 1, 0, 1, 1);
    }

    @OriginalMember(owner = "client!mi", name = "a", descriptor = "(II)V", line = 69)
    public final void method2925(int arg0, int arg1) {
        this.method1200(arg0, arg1, 1, 0, 1);
    }

    @OriginalMember(owner = "client!mi", name = "a", descriptor = "(FFFFFFLaa;II)V", line = 72)
    private final void method2926(float arg0, float arg1, float arg2, float arg3, float arg4, float arg5, class487 arg6, int arg7, int arg8) {
        this.method1623(arg0, arg1, arg2, arg3, arg4, arg5, 1, arg6, arg7, arg8);
    }

    @OriginalMember(owner = "client!mi", name = "a", descriptor = "(FFIILaa;II)V", line = 76)
    public final void method2927(float arg0, float arg1, int arg2, int arg3, class487 arg4, int arg5, int arg6) {
        this.method2921(arg0, arg1, (float) this.method1618() / 2.0F, (float) this.method1614() / 2.0F, arg2, arg3, arg4, arg5, arg6);
    }

    @OriginalMember(owner = "client!mi", name = "a", descriptor = "(FFIIIII)V", line = 79)
    public final void method2928(float arg0, float arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        this.method2920(arg0, arg1, (float) this.method1618() / 2.0F, (float) this.method1614() / 2.0F, arg2, arg3, arg4, arg5, arg6);
    }

    @OriginalMember(owner = "client!mi", name = "a", descriptor = "(FFFFFFIII)V", line = 82)
    private final void method2929(float arg0, float arg1, float arg2, float arg3, float arg4, float arg5, int arg6, int arg7, int arg8) {
        this.method1621(arg0, arg1, arg2, arg3, arg4, arg5, arg6, arg7, arg8, 1);
    }

    @OriginalMember(owner = "client!mi", name = "a", descriptor = "(FFII)V", line = 88)
    public final void method2930(float arg0, float arg1, int arg2, int arg3) {
        this.method2920(arg0, arg1, (float) this.method1618() / 2.0F, (float) this.method1614() / 2.0F, arg2, arg3, 1, 0, 1);
    }

    @OriginalMember(owner = "client!mi", name = "a", descriptor = "(FFFFFFIIII)V")
    public abstract void method1621(float arg0, float arg1, float arg2, float arg3, float arg4, float arg5, int arg6, int arg7, int arg8, int arg9);

    @OriginalMember(owner = "client!mi", name = "a", descriptor = "(IILaa;II)V")
    public abstract void method1199(int arg0, int arg1, class487 arg2, int arg3, int arg4);

    @OriginalMember(owner = "client!mi", name = "a", descriptor = "(IIIII)V")
    public abstract void method1200(int arg0, int arg1, int arg2, int arg3, int arg4);

    @OriginalMember(owner = "client!mi", name = "a", descriptor = "(IIIIIII)V")
    public abstract void method1622(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6);

    @OriginalMember(owner = "client!mi", name = "a", descriptor = "()I")
    public abstract int method1618();

    @OriginalMember(owner = "client!mi", name = "a", descriptor = "(III)V")
    public abstract void method1194(int arg0, int arg1, int arg2);

    @OriginalMember(owner = "client!mi", name = "b", descriptor = "()I")
    public abstract int method1619();

    @OriginalMember(owner = "client!mi", name = "c", descriptor = "()I")
    public abstract int method1626();

    @OriginalMember(owner = "client!mi", name = "a", descriptor = "(IIIIII)V")
    public abstract void method1193(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5);

    @OriginalMember(owner = "client!mi", name = "d", descriptor = "()I")
    public abstract int method1614();

    @OriginalMember(owner = "client!mi", name = "a", descriptor = "(IIIIIIII)V")
    public abstract void method1196(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7);

    @OriginalMember(owner = "client!mi", name = "a", descriptor = "(FFFFFFILaa;II)V")
    public abstract void method1623(float arg0, float arg1, float arg2, float arg3, float arg4, float arg5, int arg6, class487 arg7, int arg8, int arg9);

    @OriginalMember(owner = "client!mi", name = "a", descriptor = "([I)V")
    public abstract void method1625(int[] arg0);

    @OriginalMember(owner = "client!mi", name = "c", descriptor = "(IIII)V")
    public abstract void method1615(int arg0, int arg1, int arg2, int arg3);
}
