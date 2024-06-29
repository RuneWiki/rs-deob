import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ufa")
public abstract class class680 implements class451 {

    @OriginalMember(owner = "client!ufa", name = "a", descriptor = "(FFFFIIIII)V", line = 3)
    private final void method3854(float arg0, float arg1, float arg2, float arg3, int arg4, int arg5, int arg6, int arg7, int arg8) {
        if (arg4 == 0) {
            return;
        }
        double var10 = (double) (arg5 & 0xFFFF) * 9.587379924285257E-5D;
        float var12 = (float) Math.sin(var10) * (float) arg4;
        float var13 = (float) Math.cos(var10) * (float) arg4;
        float var14 = (-arg2 * var13 + -arg3 * var12) / 4096.0F + arg0;
        float var15 = (-arg3 * var13 + arg2 * var12) / 4096.0F + arg1;
        float var16 = (((float) this.method666() - arg2) * var13 + -arg3 * var12) / 4096.0F + arg0;
        float var17 = (-((float) this.method666() - arg2) * var12 + -arg3 * var13) / 4096.0F + arg1;
        float var18 = (-arg2 * var13 + ((float) this.method663() - arg3) * var12) / 4096.0F + arg0;
        float var19 = (arg2 * var12 + ((float) this.method663() - arg3) * var13) / 4096.0F + arg1;
        this.method3858(var14, var15, var16, var17, var18, var19, arg6, arg7, arg8);
    }

    @OriginalMember(owner = "client!ufa", name = "a", descriptor = "(IIII)V", line = 28)
    public final void method3855(int arg0, int arg1, int arg2, int arg3) {
        this.method675(arg0, arg1, arg2, arg3, 1, 0, 1, 1);
    }

    @OriginalMember(owner = "client!ufa", name = "a", descriptor = "(IIIIIII)V", line = 31)
    public final void method3856(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        this.method675(arg0, arg1, arg2, arg3, arg4, arg5, arg6, 1);
    }

    @OriginalMember(owner = "client!ufa", name = "a", descriptor = "(FFII)V", line = 37)
    public final void method3857(float arg0, float arg1, int arg2, int arg3) {
        this.method3854(arg0, arg1, (float) this.method666() / 2.0F, (float) this.method663() / 2.0F, arg2, arg3, 1, 0, 1);
    }

    @OriginalMember(owner = "client!ufa", name = "a", descriptor = "(FFFFFFIII)V", line = 41)
    private final void method3858(float arg0, float arg1, float arg2, float arg3, float arg4, float arg5, int arg6, int arg7, int arg8) {
        this.method668(arg0, arg1, arg2, arg3, arg4, arg5, arg6, arg7, arg8, 1);
    }

    @OriginalMember(owner = "client!ufa", name = "a", descriptor = "(II)V", line = 46)
    public final void method3859(int arg0, int arg1) {
        this.method677(arg0, arg1, 1, 0, 1);
    }

    @OriginalMember(owner = "client!ufa", name = "b", descriptor = "(IIII)V", line = 51)
    public final void method3860(int arg0, int arg1, int arg2, int arg3) {
        this.method671(arg0, arg1, arg2, arg3, 1, 0, 1);
    }

    @OriginalMember(owner = "client!ufa", name = "a", descriptor = "(FFIILaa;II)V", line = 54)
    public final void method3861(float arg0, float arg1, int arg2, int arg3, class487 arg4, int arg5, int arg6) {
        this.method3864(arg0, arg1, (float) this.method666() / 2.0F, (float) this.method663() / 2.0F, arg2, arg3, arg4, arg5, arg6);
    }

    @OriginalMember(owner = "client!ufa", name = "a", descriptor = "(FFIIIII)V", line = 63)
    public final void method3862(float arg0, float arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        this.method3854(arg0, arg1, (float) this.method666() / 2.0F, (float) this.method663() / 2.0F, arg2, arg3, arg4, arg5, arg6);
    }

    @OriginalMember(owner = "client!ufa", name = "a", descriptor = "(FFFFFFLaa;II)V", line = 66)
    private final void method3863(float arg0, float arg1, float arg2, float arg3, float arg4, float arg5, class487 arg6, int arg7, int arg8) {
        this.method673(arg0, arg1, arg2, arg3, arg4, arg5, 1, arg6, arg7, arg8);
    }

    @OriginalMember(owner = "client!ufa", name = "a", descriptor = "(FFFFIILaa;II)V", line = 70)
    public final void method3864(float arg0, float arg1, float arg2, float arg3, int arg4, int arg5, class487 arg6, int arg7, int arg8) {
        if (arg4 == 0) {
            return;
        }
        double var10 = (double) (arg5 & 0xFFFF) * 9.587379924285257E-5D;
        float var12 = (float) Math.sin(var10) * (float) arg4;
        float var13 = (float) Math.cos(var10) * (float) arg4;
        float var14 = (-arg2 * var13 + -arg3 * var12) / 4096.0F + arg0;
        float var15 = (-arg3 * var13 + arg2 * var12) / 4096.0F + arg1;
        float var16 = (((float) this.method666() - arg2) * var13 + -arg3 * var12) / 4096.0F + arg0;
        float var17 = (-((float) this.method666() - arg2) * var12 + -arg3 * var13) / 4096.0F + arg1;
        float var18 = (-arg2 * var13 + ((float) this.method663() - arg3) * var12) / 4096.0F + arg0;
        float var19 = (arg2 * var12 + ((float) this.method663() - arg3) * var13) / 4096.0F + arg1;
        this.method3863(var14, var15, var16, var17, var18, var19, arg6, arg7, arg8);
    }

    @OriginalMember(owner = "client!ufa", name = "b", descriptor = "(IIIIIII)V")
    public abstract void method671(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6);

    @OriginalMember(owner = "client!ufa", name = "a", descriptor = "(IILaa;II)V")
    public abstract void method672(int arg0, int arg1, class487 arg2, int arg3, int arg4);

    @OriginalMember(owner = "client!ufa", name = "a", descriptor = "()I")
    public abstract int method676();

    @OriginalMember(owner = "client!ufa", name = "a", descriptor = "(FFFFFFIIII)V")
    public abstract void method668(float arg0, float arg1, float arg2, float arg3, float arg4, float arg5, int arg6, int arg7, int arg8, int arg9);

    @OriginalMember(owner = "client!ufa", name = "b", descriptor = "()I")
    public abstract int method674();

    @OriginalMember(owner = "client!ufa", name = "a", descriptor = "(IIIIII)V")
    public abstract void method662(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5);

    @OriginalMember(owner = "client!ufa", name = "c", descriptor = "()I")
    public abstract int method666();

    @OriginalMember(owner = "client!ufa", name = "c", descriptor = "(IIII)V")
    public abstract void method670(int arg0, int arg1, int arg2, int arg3);

    @OriginalMember(owner = "client!ufa", name = "a", descriptor = "([I)V")
    public abstract void method667(int[] arg0);

    @OriginalMember(owner = "client!ufa", name = "a", descriptor = "(III)V")
    public abstract void method669(int arg0, int arg1, int arg2);

    @OriginalMember(owner = "client!ufa", name = "a", descriptor = "(IIIIIIII)V")
    public abstract void method675(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7);

    @OriginalMember(owner = "client!ufa", name = "a", descriptor = "(FFFFFFILaa;II)V")
    public abstract void method673(float arg0, float arg1, float arg2, float arg3, float arg4, float arg5, int arg6, class487 arg7, int arg8, int arg9);

    @OriginalMember(owner = "client!ufa", name = "a", descriptor = "(IIIII)V")
    public abstract void method677(int arg0, int arg1, int arg2, int arg3, int arg4);

    @OriginalMember(owner = "client!ufa", name = "d", descriptor = "()I")
    public abstract int method663();
}
