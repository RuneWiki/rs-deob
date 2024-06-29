import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ig")
public abstract class class154 {

    @OriginalMember(owner = "client!ig", name = "a", descriptor = "(FFIIIII)V", line = 3)
    public final void method986(float arg0, float arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        this.method990(arg0, arg1, (float) this.method988() / 2.0F, (float) this.method989() / 2.0F, arg2, arg3, arg4, arg5, arg6);
    }

    @OriginalMember(owner = "client!ig", name = "a", descriptor = "(FFFFIILbe;II)V", line = 6)
    public final void method987(float arg0, float arg1, float arg2, float arg3, int arg4, int arg5, class28 arg6, int arg7, int arg8) {
        if (arg4 == 0) {
            return;
        }
        double var10 = (double) (arg5 & 0xFFFF) * 9.587379924285257E-5D;
        float var12 = (float) Math.sin(var10) * (float) arg4;
        float var13 = (float) Math.cos(var10) * (float) arg4;
        float var14 = (-arg2 * var13 + -arg3 * var12) / 4096.0F + arg0;
        float var15 = (-arg3 * var13 + arg2 * var12) / 4096.0F + arg1;
        float var16 = (((float) this.method988() - arg2) * var13 + -arg3 * var12) / 4096.0F + arg0;
        float var17 = (-((float) this.method988() - arg2) * var12 + -arg3 * var13) / 4096.0F + arg1;
        float var18 = (-arg2 * var13 + ((float) this.method989() - arg3) * var12) / 4096.0F + arg0;
        float var19 = (arg2 * var12 + ((float) this.method989() - arg3) * var13) / 4096.0F + arg1;
        this.method1000(var14, var15, var16, var17, var18, var19, arg6, arg7, arg8);
    }

    @OriginalMember(owner = "client!ig", name = "a", descriptor = "(FFFFIIIII)V", line = 34)
    private final void method990(float arg0, float arg1, float arg2, float arg3, int arg4, int arg5, int arg6, int arg7, int arg8) {
        if (arg4 == 0) {
            return;
        }
        double var10 = (double) (arg5 & 0xFFFF) * 9.587379924285257E-5D;
        float var12 = (float) Math.sin(var10) * (float) arg4;
        float var13 = (float) Math.cos(var10) * (float) arg4;
        float var14 = (-arg2 * var13 + -arg3 * var12) / 4096.0F + arg0;
        float var15 = (-arg3 * var13 + arg2 * var12) / 4096.0F + arg1;
        float var16 = (((float) this.method988() - arg2) * var13 + -arg3 * var12) / 4096.0F + arg0;
        float var17 = (-((float) this.method988() - arg2) * var12 + -arg3 * var13) / 4096.0F + arg1;
        float var18 = (-arg2 * var13 + ((float) this.method989() - arg3) * var12) / 4096.0F + arg0;
        float var19 = (arg2 * var12 + ((float) this.method989() - arg3) * var13) / 4096.0F + arg1;
        this.method997(var14, var15, var16, var17, var18, var19, arg6, arg7, arg8);
    }

    @OriginalMember(owner = "client!ig", name = "a", descriptor = "(FFIILbe;II)V", line = 62)
    public final void method991(float arg0, float arg1, int arg2, int arg3, class28 arg4, int arg5, int arg6) {
        this.method987(arg0, arg1, (float) this.method988() / 2.0F, (float) this.method989() / 2.0F, arg2, arg3, arg4, arg5, arg6);
    }

    @OriginalMember(owner = "client!ig", name = "a", descriptor = "(II)V", line = 68)
    public final void method994(int arg0, int arg1) {
        this.method577(arg0, arg1, 1, 0, 1);
    }

    @OriginalMember(owner = "client!ig", name = "b", descriptor = "(IIII)V", line = 71)
    public final void method995(int arg0, int arg1, int arg2, int arg3) {
        this.method998(arg0, arg1, arg2, arg3, 1, 0, 1);
    }

    @OriginalMember(owner = "client!ig", name = "c", descriptor = "(IIII)V", line = 74)
    public final void method996(int arg0, int arg1, int arg2, int arg3) {
        this.method572(arg0, arg1, arg2, arg3, 1, 0, 1);
    }

    @OriginalMember(owner = "client!ig", name = "a", descriptor = "(FFII)V", line = 79)
    public final void method999(float arg0, float arg1, int arg2, int arg3) {
        this.method990(arg0, arg1, (float) this.method988() / 2.0F, (float) this.method989() / 2.0F, arg2, arg3, 1, 0, 1);
    }

    @OriginalMember(owner = "client!ig", name = "a", descriptor = "()I")
    public abstract int method988();

    @OriginalMember(owner = "client!ig", name = "b", descriptor = "()I")
    public abstract int method989();

    @OriginalMember(owner = "client!ig", name = "a", descriptor = "(IIIIII)V")
    public abstract void method576(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5);

    @OriginalMember(owner = "client!ig", name = "a", descriptor = "(IIIII)V")
    public abstract void method577(int arg0, int arg1, int arg2, int arg3, int arg4);

    @OriginalMember(owner = "client!ig", name = "a", descriptor = "(IIIIIII)V")
    public abstract void method572(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6);

    @OriginalMember(owner = "client!ig", name = "a", descriptor = "(III)V")
    public abstract void method575(int arg0, int arg1, int arg2);

    @OriginalMember(owner = "client!ig", name = "a", descriptor = "(IILbe;II)V")
    public abstract void method574(int arg0, int arg1, class28 arg2, int arg3, int arg4);

    @OriginalMember(owner = "client!ig", name = "a", descriptor = "(IIII)V")
    public abstract void method992(int arg0, int arg1, int arg2, int arg3);

    @OriginalMember(owner = "client!ig", name = "c", descriptor = "()I")
    public abstract int method993();

    @OriginalMember(owner = "client!ig", name = "a", descriptor = "(FFFFFFIII)V")
    public abstract void method997(float arg0, float arg1, float arg2, float arg3, float arg4, float arg5, int arg6, int arg7, int arg8);

    @OriginalMember(owner = "client!ig", name = "b", descriptor = "(IIIIIII)V")
    public abstract void method998(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6);

    @OriginalMember(owner = "client!ig", name = "a", descriptor = "(FFFFFFLbe;II)V")
    public abstract void method1000(float arg0, float arg1, float arg2, float arg3, float arg4, float arg5, class28 arg6, int arg7, int arg8);

    @OriginalMember(owner = "client!ig", name = "d", descriptor = "()I")
    public abstract int method1001();
}
