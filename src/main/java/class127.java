import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!l")
public abstract class class127 {

    @OriginalMember(owner = "client!l", name = "a", descriptor = "(IIII)V", line = 4)
    public final void method932(int arg0, int arg1, int arg2, int arg3) {
        this.method469(arg0, arg1, arg2, arg3, 1, 0, 1);
    }

    @OriginalMember(owner = "client!l", name = "a", descriptor = "(FFFFIIIII)V", line = 9)
    private final void method933(float arg0, float arg1, float arg2, float arg3, int arg4, int arg5, int arg6, int arg7, int arg8) {
        if (arg4 == 0) {
            return;
        }
        double var10 = (double) (arg5 & 0xFFFF) * 9.587379924285257E-5D;
        float var12 = (float) Math.sin(var10) * (float) arg4;
        float var13 = (float) Math.cos(var10) * (float) arg4;
        float var14 = (-arg2 * var13 + -arg3 * var12) / 4096.0F + arg0;
        float var15 = (-arg3 * var13 + arg2 * var12) / 4096.0F + arg1;
        float var16 = (((float) this.method468() - arg2) * var13 + -arg3 * var12) / 4096.0F + arg0;
        float var17 = (-((float) this.method468() - arg2) * var12 + -arg3 * var13) / 4096.0F + arg1;
        float var18 = (-arg2 * var13 + ((float) this.method467() - arg3) * var12) / 4096.0F + arg0;
        float var19 = (arg2 * var12 + ((float) this.method467() - arg3) * var13) / 4096.0F + arg1;
        this.method475(var14, var15, var16, var17, var18, var19, arg6, arg7, arg8);
    }

    @OriginalMember(owner = "client!l", name = "a", descriptor = "(FFIIIII)V", line = 34)
    public final void method934(float arg0, float arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        this.method933(arg0, arg1, (float) this.method468() / 2.0F, (float) this.method467() / 2.0F, arg2, arg3, arg4, arg5, arg6);
    }

    @OriginalMember(owner = "client!l", name = "a", descriptor = "(FFII)V", line = 37)
    public final void method935(float arg0, float arg1, int arg2, int arg3) {
        this.method933(arg0, arg1, (float) this.method468() / 2.0F, (float) this.method467() / 2.0F, arg2, arg3, 1, 0, 1);
    }

    @OriginalMember(owner = "client!l", name = "a", descriptor = "(II)V", line = 41)
    public final void method936(int arg0, int arg1) {
        this.method299(arg0, arg1, 1, 0, 1);
    }

    @OriginalMember(owner = "client!l", name = "a", descriptor = "(FFFFIILma;II)V", line = 52)
    public final void method937(float arg0, float arg1, float arg2, float arg3, int arg4, int arg5, class249 arg6, int arg7, int arg8) {
        if (arg4 == 0) {
            return;
        }
        double var10 = (double) (arg5 & 0xFFFF) * 9.587379924285257E-5D;
        float var12 = (float) Math.sin(var10) * (float) arg4;
        float var13 = (float) Math.cos(var10) * (float) arg4;
        float var14 = (-arg2 * var13 + -arg3 * var12) / 4096.0F + arg0;
        float var15 = (-arg3 * var13 + arg2 * var12) / 4096.0F + arg1;
        float var16 = (((float) this.method468() - arg2) * var13 + -arg3 * var12) / 4096.0F + arg0;
        float var17 = (-((float) this.method468() - arg2) * var12 + -arg3 * var13) / 4096.0F + arg1;
        float var18 = (-arg2 * var13 + ((float) this.method467() - arg3) * var12) / 4096.0F + arg0;
        float var19 = (arg2 * var12 + ((float) this.method467() - arg3) * var13) / 4096.0F + arg1;
        this.method474(var14, var15, var16, var17, var18, var19, arg6, arg7, arg8);
    }

    @OriginalMember(owner = "client!l", name = "a", descriptor = "(FFIILma;II)V", line = 78)
    public final void method938(float arg0, float arg1, int arg2, int arg3, class249 arg4, int arg5, int arg6) {
        this.method937(arg0, arg1, (float) this.method468() / 2.0F, (float) this.method467() / 2.0F, arg2, arg3, arg4, arg5, arg6);
    }

    @OriginalMember(owner = "client!l", name = "b", descriptor = "(IIII)V", line = 84)
    public final void method939(int arg0, int arg1, int arg2, int arg3) {
        this.method293(arg0, arg1, arg2, arg3, 1, 0, 1);
    }

    @OriginalMember(owner = "client!l", name = "j", descriptor = "()I")
    public abstract int method468();

    @OriginalMember(owner = "client!l", name = "r", descriptor = "(IIIII)V")
    public abstract void method299(int arg0, int arg1, int arg2, int arg3, int arg4);

    @OriginalMember(owner = "client!l", name = "MA", descriptor = "(IIII)V")
    public abstract void method464(int arg0, int arg1, int arg2, int arg3);

    @OriginalMember(owner = "client!l", name = "JA", descriptor = "(IIIIIII)V")
    public abstract void method469(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6);

    @OriginalMember(owner = "client!l", name = "T", descriptor = "()I")
    public abstract int method467();

    @OriginalMember(owner = "client!l", name = "b", descriptor = "(FFFFFFLma;II)V")
    public abstract void method474(float arg0, float arg1, float arg2, float arg3, float arg4, float arg5, class249 arg6, int arg7, int arg8);

    @OriginalMember(owner = "client!l", name = "a", descriptor = "(IILma;II)V")
    public abstract void method294(int arg0, int arg1, class249 arg2, int arg3, int arg4);

    @OriginalMember(owner = "client!l", name = "a", descriptor = "(FFFFFFIII)V")
    public abstract void method475(float arg0, float arg1, float arg2, float arg3, float arg4, float arg5, int arg6, int arg7, int arg8);

    @OriginalMember(owner = "client!l", name = "s", descriptor = "(IIIIIII)V")
    public abstract void method293(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6);

    @OriginalMember(owner = "client!l", name = "ma", descriptor = "()I")
    public abstract int method465();

    @OriginalMember(owner = "client!l", name = "la", descriptor = "()I")
    public abstract int method470();

    @OriginalMember(owner = "client!l", name = "BA", descriptor = "(III)V")
    public abstract void method295(int arg0, int arg1, int arg2);

    @OriginalMember(owner = "client!l", name = "t", descriptor = "(IIIIII)V")
    public abstract void method298(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5);
}
