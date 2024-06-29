import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!c")
public abstract class class436 {

    @OriginalMember(owner = "client!c", name = "a", descriptor = "(IIIII)V")
    public abstract void method167(int arg0, int arg1, int arg2, int arg3, int arg4);

    @OriginalMember(owner = "client!c", name = "a", descriptor = "(IILem;II)V")
    public abstract void method165(int arg0, int arg1, class423 arg2, int arg3, int arg4);

    @OriginalMember(owner = "client!c", name = "a", descriptor = "(II)V")
    public final void method2659(int arg0, int arg1) {
        this.method167(arg0, arg1, 0, 0, 1);
    }

    @OriginalMember(owner = "client!c", name = "a", descriptor = "(FFIILem;II)V")
    public final void method2660(float arg0, float arg1, int arg2, int arg3, class423 arg4, int arg5, int arg6) {
        this.method2663(arg0, arg1, (float) this.method235() / 2.0F, (float) this.method236() / 2.0F, arg2, arg3, arg4, arg5, arg6);
    }

    @OriginalMember(owner = "client!c", name = "a", descriptor = "()I")
    public abstract int method237();

    @OriginalMember(owner = "client!c", name = "a", descriptor = "(FFII)V")
    public final void method2661(float arg0, float arg1, int arg2, int arg3) {
        this.method2662(arg0, arg1, (float) this.method235() / 2.0F, (float) this.method236() / 2.0F, arg2, arg3, 0, 0, 1);
    }

    @OriginalMember(owner = "client!c", name = "a", descriptor = "(IIIIIII)V")
    public abstract void method234(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6);

    @OriginalMember(owner = "client!c", name = "a", descriptor = "(IIIIII)V")
    public abstract void method168(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5);

    @OriginalMember(owner = "client!c", name = "a", descriptor = "(FFFFIIIII)V")
    private final void method2662(float arg0, float arg1, float arg2, float arg3, int arg4, int arg5, int arg6, int arg7, int arg8) {
        if (arg4 == 0) {
            return;
        }
        double var10 = (double) (arg5 & 0xFFFF) * 9.587379924285257E-5D;
        float var12 = (float) Math.sin(var10) * (float) arg4;
        float var13 = (float) Math.cos(var10) * (float) arg4;
        float var14 = (-arg2 * var13 + -arg3 * var12) / 4096.0F + arg0;
        float var15 = (-arg3 * var13 + arg2 * var12) / 4096.0F + arg1;
        float var16 = (((float) this.method235() - arg2) * var13 + -arg3 * var12) / 4096.0F + arg0;
        float var17 = (-((float) this.method235() - arg2) * var12 + -arg3 * var13) / 4096.0F + arg1;
        float var18 = (-arg2 * var13 + ((float) this.method236() - arg3) * var12) / 4096.0F + arg0;
        float var19 = (arg2 * var12 + ((float) this.method236() - arg3) * var13) / 4096.0F + arg1;
        this.method233(var14, var15, var16, var17, var18, var19, arg6, arg7, arg8);
    }

    @OriginalMember(owner = "client!c", name = "a", descriptor = "(III)V")
    public abstract void method164(int arg0, int arg1, int arg2);

    @OriginalMember(owner = "client!c", name = "b", descriptor = "()I")
    public abstract int method230();

    @OriginalMember(owner = "client!c", name = "c", descriptor = "()I")
    public abstract int method236();

    @OriginalMember(owner = "client!c", name = "a", descriptor = "(FFFFIILem;II)V")
    public final void method2663(float arg0, float arg1, float arg2, float arg3, int arg4, int arg5, class423 arg6, int arg7, int arg8) {
        if (arg4 == 0) {
            return;
        }
        double var10 = (double) (arg5 & 0xFFFF) * 9.587379924285257E-5D;
        float var12 = (float) Math.sin(var10) * (float) arg4;
        float var13 = (float) Math.cos(var10) * (float) arg4;
        float var14 = (-arg2 * var13 + -arg3 * var12) / 4096.0F + arg0;
        float var15 = (-arg3 * var13 + arg2 * var12) / 4096.0F + arg1;
        float var16 = (((float) this.method235() - arg2) * var13 + -arg3 * var12) / 4096.0F + arg0;
        float var17 = (-((float) this.method235() - arg2) * var12 + -arg3 * var13) / 4096.0F + arg1;
        float var18 = (-arg2 * var13 + ((float) this.method236() - arg3) * var12) / 4096.0F + arg0;
        float var19 = (arg2 * var12 + ((float) this.method236() - arg3) * var13) / 4096.0F + arg1;
        this.method231(var14, var15, var16, var17, var18, var19, arg6, arg7, arg8);
    }

    @OriginalMember(owner = "client!c", name = "d", descriptor = "()I")
    public abstract int method235();

    @OriginalMember(owner = "client!c", name = "a", descriptor = "(IIII)V")
    public final void method2664(int arg0, int arg1, int arg2, int arg3) {
        this.method163(arg0, arg1, arg2, arg3, 0, 0, 1);
    }

    @OriginalMember(owner = "client!c", name = "b", descriptor = "(IIIIIII)V")
    public abstract void method163(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6);

    @OriginalMember(owner = "client!c", name = "a", descriptor = "(FFFFFFLem;II)V")
    public abstract void method231(float arg0, float arg1, float arg2, float arg3, float arg4, float arg5, class423 arg6, int arg7, int arg8);

    @OriginalMember(owner = "client!c", name = "b", descriptor = "(IIII)V")
    public abstract void method232(int arg0, int arg1, int arg2, int arg3);

    @OriginalMember(owner = "client!c", name = "a", descriptor = "(FFIIIII)V")
    public final void method2665(float arg0, float arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        this.method2662(arg0, arg1, (float) this.method235() / 2.0F, (float) this.method236() / 2.0F, arg2, arg3, arg4, arg5, arg6);
    }

    @OriginalMember(owner = "client!c", name = "a", descriptor = "(FFFFFFIII)V")
    public abstract void method233(float arg0, float arg1, float arg2, float arg3, float arg4, float arg5, int arg6, int arg7, int arg8);
}
