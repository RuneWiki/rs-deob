import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!fd")
public abstract class class298 implements class106 {

    @OriginalMember(owner = "client!fd", name = "a", descriptor = "(FFFFIIIII)V", line = 6)
    private final void method1954(float arg0, float arg1, float arg2, float arg3, int arg4, int arg5, int arg6, int arg7, int arg8) {
        if (arg4 == 0) {
            return;
        }
        double var10 = (double) (arg5 & 0xFFFF) * 9.587379924285257E-5D;
        float var12 = (float) Math.sin(var10) * (float) arg4;
        float var13 = (float) Math.cos(var10) * (float) arg4;
        float var14 = (-arg2 * var13 + -arg3 * var12) / 4096.0F + arg0;
        float var15 = (-arg3 * var13 + arg2 * var12) / 4096.0F + arg1;
        float var16 = (((float) this.method1963() - arg2) * var13 + -arg3 * var12) / 4096.0F + arg0;
        float var17 = (-((float) this.method1963() - arg2) * var12 + -arg3 * var13) / 4096.0F + arg1;
        float var18 = (-arg2 * var13 + ((float) this.method1961() - arg3) * var12) / 4096.0F + arg0;
        float var19 = (arg2 * var12 + ((float) this.method1961() - arg3) * var13) / 4096.0F + arg1;
        this.method1957(var14, var15, var16, var17, var18, var19, arg6, arg7, arg8);
    }

    @OriginalMember(owner = "client!fd", name = "a", descriptor = "(FFFFIILaa;II)V", line = 34)
    public final void method1956(float arg0, float arg1, float arg2, float arg3, int arg4, int arg5, class573 arg6, int arg7, int arg8) {
        if (arg4 == 0) {
            return;
        }
        double var10 = (double) (arg5 & 0xFFFF) * 9.587379924285257E-5D;
        float var12 = (float) Math.sin(var10) * (float) arg4;
        float var13 = (float) Math.cos(var10) * (float) arg4;
        float var14 = (-arg2 * var13 + -arg3 * var12) / 4096.0F + arg0;
        float var15 = (-arg3 * var13 + arg2 * var12) / 4096.0F + arg1;
        float var16 = (((float) this.method1963() - arg2) * var13 + -arg3 * var12) / 4096.0F + arg0;
        float var17 = (-((float) this.method1963() - arg2) * var12 + -arg3 * var13) / 4096.0F + arg1;
        float var18 = (-arg2 * var13 + ((float) this.method1961() - arg3) * var12) / 4096.0F + arg0;
        float var19 = (arg2 * var12 + ((float) this.method1961() - arg3) * var13) / 4096.0F + arg1;
        this.method1958(var14, var15, var16, var17, var18, var19, arg6, arg7, arg8);
    }

    @OriginalMember(owner = "client!fd", name = "a", descriptor = "(FFFFFFIII)V", line = 58)
    private final void method1957(float arg0, float arg1, float arg2, float arg3, float arg4, float arg5, int arg6, int arg7, int arg8) {
        this.method1966(arg0, arg1, arg2, arg3, arg4, arg5, arg6, arg7, arg8, 1);
    }

    @OriginalMember(owner = "client!fd", name = "a", descriptor = "(FFFFFFLaa;II)V", line = 63)
    private final void method1958(float arg0, float arg1, float arg2, float arg3, float arg4, float arg5, class573 arg6, int arg7, int arg8) {
        this.method1962(arg0, arg1, arg2, arg3, arg4, arg5, 1, arg6, arg7, arg8);
    }

    @OriginalMember(owner = "client!fd", name = "b", descriptor = "(IIII)V", line = 67)
    public final void method1959(int arg0, int arg1, int arg2, int arg3) {
        this.method1008(arg0, arg1, arg2, arg3, 1, 0, 1, 1);
    }

    @OriginalMember(owner = "client!fd", name = "a", descriptor = "(FFII)V", line = 70)
    public final void method1960(float arg0, float arg1, int arg2, int arg3) {
        this.method1954(arg0, arg1, (float) this.method1963() / 2.0F, (float) this.method1961() / 2.0F, arg2, arg3, 1, 0, 1);
    }

    @OriginalMember(owner = "client!fd", name = "c", descriptor = "(IIII)V", line = 80)
    public final void method1964(int arg0, int arg1, int arg2, int arg3) {
        this.method1965(arg0, arg1, arg2, arg3, 1, 0, 1);
    }

    @OriginalMember(owner = "client!fd", name = "a", descriptor = "(FFIIIII)V", line = 87)
    public final void method1968(float arg0, float arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        this.method1954(arg0, arg1, (float) this.method1963() / 2.0F, (float) this.method1961() / 2.0F, arg2, arg3, arg4, arg5, arg6);
    }

    @OriginalMember(owner = "client!fd", name = "b", descriptor = "(IIIIIII)V", line = 90)
    public final void method1969(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        this.method1008(arg0, arg1, arg2, arg3, arg4, arg5, arg6, 1);
    }

    @OriginalMember(owner = "client!fd", name = "a", descriptor = "(II)V", line = 93)
    public final void method1970(int arg0, int arg1) {
        this.method1013(arg0, arg1, 1, 0, 1);
    }

    @OriginalMember(owner = "client!fd", name = "a", descriptor = "(FFIILaa;II)V", line = 96)
    public final void method1971(float arg0, float arg1, int arg2, int arg3, class573 arg4, int arg5, int arg6) {
        this.method1956(arg0, arg1, (float) this.method1963() / 2.0F, (float) this.method1961() / 2.0F, arg2, arg3, arg4, arg5, arg6);
    }

    @OriginalMember(owner = "client!fd", name = "a", descriptor = "(IILaa;II)V")
    public abstract void method1010(int arg0, int arg1, class573 arg2, int arg3, int arg4);

    @OriginalMember(owner = "client!fd", name = "a", descriptor = "()I")
    public abstract int method1952();

    @OriginalMember(owner = "client!fd", name = "a", descriptor = "(IIII)V")
    public abstract void method1953(int arg0, int arg1, int arg2, int arg3);

    @OriginalMember(owner = "client!fd", name = "a", descriptor = "(IIIIII)V")
    public abstract void method1015(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5);

    @OriginalMember(owner = "client!fd", name = "a", descriptor = "(IIIII)V")
    public abstract void method1013(int arg0, int arg1, int arg2, int arg3, int arg4);

    @OriginalMember(owner = "client!fd", name = "b", descriptor = "()I")
    public abstract int method1955();

    @OriginalMember(owner = "client!fd", name = "c", descriptor = "()I")
    public abstract int method1961();

    @OriginalMember(owner = "client!fd", name = "a", descriptor = "(IIIIIIII)V")
    public abstract void method1008(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7);

    @OriginalMember(owner = "client!fd", name = "a", descriptor = "(FFFFFFILaa;II)V")
    public abstract void method1962(float arg0, float arg1, float arg2, float arg3, float arg4, float arg5, int arg6, class573 arg7, int arg8, int arg9);

    @OriginalMember(owner = "client!fd", name = "d", descriptor = "()I")
    public abstract int method1963();

    @OriginalMember(owner = "client!fd", name = "a", descriptor = "(IIIIIII)V")
    public abstract void method1965(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6);

    @OriginalMember(owner = "client!fd", name = "a", descriptor = "(FFFFFFIIII)V")
    public abstract void method1966(float arg0, float arg1, float arg2, float arg3, float arg4, float arg5, int arg6, int arg7, int arg8, int arg9);

    @OriginalMember(owner = "client!fd", name = "a", descriptor = "(III)V")
    public abstract void method1014(int arg0, int arg1, int arg2);

    @OriginalMember(owner = "client!fd", name = "a", descriptor = "([I)V")
    public abstract void method1967(int[] arg0);
}
