import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!cw")
public abstract class class21 implements class358 {

    @OriginalMember(owner = "client!cw", name = "a", descriptor = "(IIII)V")
    public final void method100(int arg0, int arg1, int arg2, int arg3) {
        this.method107(arg0, arg1, arg2, arg3, 1, 0, 1, 1);
    }

    @OriginalMember(owner = "client!cw", name = "a", descriptor = "(II)V")
    public final void method101(int arg0, int arg1) {
        this.method104(arg0, arg1, 1, 0, 1);
    }

    @OriginalMember(owner = "client!cw", name = "a", descriptor = "(FFFFIILaa;II)V")
    public final void method102(float arg0, float arg1, float arg2, float arg3, int arg4, int arg5, class571 arg6, int arg7, int arg8) {
        if (arg4 == 0) {
            return;
        }
        double var10 = (double) (arg5 & 0xFFFF) * 9.587379924285257E-5D;
        float var12 = (float) Math.sin(var10) * (float) arg4;
        float var13 = (float) Math.cos(var10) * (float) arg4;
        float var14 = (-arg2 * var13 + -arg3 * var12) / 4096.0F + arg0;
        float var15 = (-arg3 * var13 + arg2 * var12) / 4096.0F + arg1;
        float var16 = (((float) this.method116() - arg2) * var13 + -arg3 * var12) / 4096.0F + arg0;
        float var17 = (-((float) this.method116() - arg2) * var12 + -arg3 * var13) / 4096.0F + arg1;
        float var18 = (-arg2 * var13 + ((float) this.method108() - arg3) * var12) / 4096.0F + arg0;
        float var19 = (arg2 * var12 + ((float) this.method108() - arg3) * var13) / 4096.0F + arg1;
        this.method113(var14, var15, var16, var17, var18, var19, arg6, arg7, arg8);
    }

    @OriginalMember(owner = "client!cw", name = "a", descriptor = "(FFFFFFILaa;II)V")
    public abstract void method103(float arg0, float arg1, float arg2, float arg3, float arg4, float arg5, int arg6, class571 arg7, int arg8, int arg9);

    @OriginalMember(owner = "client!cw", name = "a", descriptor = "(IIIII)V")
    public abstract void method104(int arg0, int arg1, int arg2, int arg3, int arg4);

    @OriginalMember(owner = "client!cw", name = "a", descriptor = "(IIIIIII)V")
    public abstract void method105(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6);

    @OriginalMember(owner = "client!cw", name = "b", descriptor = "(IIII)V")
    public abstract void method106(int arg0, int arg1, int arg2, int arg3);

    @OriginalMember(owner = "client!cw", name = "a", descriptor = "(IIIIIIII)V")
    public abstract void method107(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7);

    @OriginalMember(owner = "client!cw", name = "a", descriptor = "()I")
    public abstract int method108();

    @OriginalMember(owner = "client!cw", name = "c", descriptor = "(IIII)V")
    public final void method109(int arg0, int arg1, int arg2, int arg3) {
        this.method105(arg0, arg1, arg2, arg3, 1, 0, 1);
    }

    @OriginalMember(owner = "client!cw", name = "b", descriptor = "(IIIIIII)V")
    public final void method110(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        this.method107(arg0, arg1, arg2, arg3, arg4, arg5, arg6, 1);
    }

    @OriginalMember(owner = "client!cw", name = "a", descriptor = "(FFFFIIIII)V")
    private final void method111(float arg0, float arg1, float arg2, float arg3, int arg4, int arg5, int arg6, int arg7, int arg8) {
        if (arg4 == 0) {
            return;
        }
        double var10 = (double) (arg5 & 0xFFFF) * 9.587379924285257E-5D;
        float var12 = (float) Math.sin(var10) * (float) arg4;
        float var13 = (float) Math.cos(var10) * (float) arg4;
        float var14 = (-arg2 * var13 + -arg3 * var12) / 4096.0F + arg0;
        float var15 = (-arg3 * var13 + arg2 * var12) / 4096.0F + arg1;
        float var16 = (((float) this.method116() - arg2) * var13 + -arg3 * var12) / 4096.0F + arg0;
        float var17 = (-((float) this.method116() - arg2) * var12 + -arg3 * var13) / 4096.0F + arg1;
        float var18 = (-arg2 * var13 + ((float) this.method108() - arg3) * var12) / 4096.0F + arg0;
        float var19 = (arg2 * var12 + ((float) this.method108() - arg3) * var13) / 4096.0F + arg1;
        this.method121(var14, var15, var16, var17, var18, var19, arg6, arg7, arg8);
    }

    @OriginalMember(owner = "client!cw", name = "a", descriptor = "(FFII)V")
    public final void method112(float arg0, float arg1, int arg2, int arg3) {
        this.method111(arg0, arg1, (float) this.method116() / 2.0F, (float) this.method108() / 2.0F, arg2, arg3, 1, 0, 1);
    }

    @OriginalMember(owner = "client!cw", name = "a", descriptor = "(FFFFFFLaa;II)V")
    private final void method113(float arg0, float arg1, float arg2, float arg3, float arg4, float arg5, class571 arg6, int arg7, int arg8) {
        this.method103(arg0, arg1, arg2, arg3, arg4, arg5, 1, arg6, arg7, arg8);
    }

    @OriginalMember(owner = "client!cw", name = "a", descriptor = "(FFIILaa;II)V")
    public final void method114(float arg0, float arg1, int arg2, int arg3, class571 arg4, int arg5, int arg6) {
        this.method102(arg0, arg1, (float) this.method116() / 2.0F, (float) this.method108() / 2.0F, arg2, arg3, arg4, arg5, arg6);
    }

    @OriginalMember(owner = "client!cw", name = "b", descriptor = "()I")
    public abstract int method115();

    @OriginalMember(owner = "client!cw", name = "c", descriptor = "()I")
    public abstract int method116();

    @OriginalMember(owner = "client!cw", name = "d", descriptor = "()I")
    public abstract int method117();

    @OriginalMember(owner = "client!cw", name = "a", descriptor = "(IIIIII)V")
    public abstract void method118(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5);

    @OriginalMember(owner = "client!cw", name = "a", descriptor = "(IILaa;II)V")
    public abstract void method119(int arg0, int arg1, class571 arg2, int arg3, int arg4);

    @OriginalMember(owner = "client!cw", name = "a", descriptor = "(III)V")
    public abstract void method120(int arg0, int arg1, int arg2);

    @OriginalMember(owner = "client!cw", name = "a", descriptor = "(FFFFFFIII)V")
    private final void method121(float arg0, float arg1, float arg2, float arg3, float arg4, float arg5, int arg6, int arg7, int arg8) {
        this.method123(arg0, arg1, arg2, arg3, arg4, arg5, arg6, arg7, arg8, 1);
    }

    @OriginalMember(owner = "client!cw", name = "a", descriptor = "(FFIIIII)V")
    public final void method122(float arg0, float arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        this.method111(arg0, arg1, (float) this.method116() / 2.0F, (float) this.method108() / 2.0F, arg2, arg3, arg4, arg5, arg6);
    }

    @OriginalMember(owner = "client!cw", name = "a", descriptor = "(FFFFFFIIII)V")
    public abstract void method123(float arg0, float arg1, float arg2, float arg3, float arg4, float arg5, int arg6, int arg7, int arg8, int arg9);
}
