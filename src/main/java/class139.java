import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!o")
public abstract class class139 {

    @OriginalMember(owner = "client!o", name = "XA", descriptor = "(IIIIII)V")
    public abstract void method631(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5);

    @OriginalMember(owner = "client!o", name = "W", descriptor = "(IIIII)V")
    public abstract void method620(int arg0, int arg1, int arg2, int arg3, int arg4);

    @OriginalMember(owner = "client!o", name = "oa", descriptor = "(III)V")
    public abstract void method616(int arg0, int arg1, int arg2);

    @OriginalMember(owner = "client!o", name = "YA", descriptor = "()I")
    public abstract int method626();

    @OriginalMember(owner = "client!o", name = "ha", descriptor = "(IIII)V")
    public abstract void method627(int arg0, int arg1, int arg2, int arg3);

    @OriginalMember(owner = "client!o", name = "a", descriptor = "(IILta;II)V")
    public abstract void method632(int arg0, int arg1, class453 arg2, int arg3, int arg4);

    @OriginalMember(owner = "client!o", name = "a", descriptor = "(FFIIIII)V")
    public final void method845(float arg0, float arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        this.method850(arg0, arg1, (float) this.method623() / 2.0F, (float) this.method618() / 2.0F, arg2, arg3, arg4, arg5, arg6);
    }

    @OriginalMember(owner = "client!o", name = "la", descriptor = "(IIIIIII)V")
    public abstract void method619(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6);

    @OriginalMember(owner = "client!o", name = "a", descriptor = "(FFII)V")
    public final void method846(float arg0, float arg1, int arg2, int arg3) {
        this.method850(arg0, arg1, (float) this.method623() / 2.0F, (float) this.method618() / 2.0F, arg2, arg3, 1, 0, 1);
    }

    @OriginalMember(owner = "client!o", name = "a", descriptor = "(IIII)V")
    public final void method847(int arg0, int arg1, int arg2, int arg3) {
        this.method619(arg0, arg1, arg2, arg3, 1, 0, 1);
    }

    @OriginalMember(owner = "client!o", name = "H", descriptor = "(FFFFFFIII)V")
    public abstract void method621(float arg0, float arg1, float arg2, float arg3, float arg4, float arg5, int arg6, int arg7, int arg8);

    @OriginalMember(owner = "client!o", name = "Q", descriptor = "()I")
    public abstract int method618();

    @OriginalMember(owner = "client!o", name = "a", descriptor = "(FFFFIILta;II)V")
    public final void method848(float arg0, float arg1, float arg2, float arg3, int arg4, int arg5, class453 arg6, int arg7, int arg8) {
        if (arg4 == 0) {
            return;
        }
        double var10 = (double) (arg5 & 0xFFFF) * 9.587379924285257E-5D;
        float var12 = (float) Math.sin(var10) * (float) arg4;
        float var13 = (float) Math.cos(var10) * (float) arg4;
        float var14 = (-arg2 * var13 + -arg3 * var12) / 4096.0F + arg0;
        float var15 = (-arg3 * var13 + arg2 * var12) / 4096.0F + arg1;
        float var16 = (((float) this.method623() - arg2) * var13 + -arg3 * var12) / 4096.0F + arg0;
        float var17 = (-((float) this.method623() - arg2) * var12 + -arg3 * var13) / 4096.0F + arg1;
        float var18 = (-arg2 * var13 + ((float) this.method618() - arg3) * var12) / 4096.0F + arg0;
        float var19 = (arg2 * var12 + ((float) this.method618() - arg3) * var13) / 4096.0F + arg1;
        this.method629(var14, var15, var16, var17, var18, var19, arg6, arg7, arg8);
    }

    @OriginalMember(owner = "client!o", name = "a", descriptor = "(FFIILta;II)V")
    public final void method849(float arg0, float arg1, int arg2, int arg3, class453 arg4, int arg5, int arg6) {
        this.method848(arg0, arg1, (float) this.method623() / 2.0F, (float) this.method618() / 2.0F, arg2, arg3, arg4, arg5, arg6);
    }

    @OriginalMember(owner = "client!o", name = "ya", descriptor = "(IIIIIII)V")
    public abstract void method630(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6);

    @OriginalMember(owner = "client!o", name = "ZA", descriptor = "()I")
    public abstract int method622();

    @OriginalMember(owner = "client!o", name = "a", descriptor = "(FFFFIIIII)V")
    private final void method850(float arg0, float arg1, float arg2, float arg3, int arg4, int arg5, int arg6, int arg7, int arg8) {
        if (arg4 == 0) {
            return;
        }
        double var10 = (double) (arg5 & 0xFFFF) * 9.587379924285257E-5D;
        float var12 = (float) Math.sin(var10) * (float) arg4;
        float var13 = (float) Math.cos(var10) * (float) arg4;
        float var14 = (-arg2 * var13 + -arg3 * var12) / 4096.0F + arg0;
        float var15 = (-arg3 * var13 + arg2 * var12) / 4096.0F + arg1;
        float var16 = (((float) this.method623() - arg2) * var13 + -arg3 * var12) / 4096.0F + arg0;
        float var17 = (-((float) this.method623() - arg2) * var12 + -arg3 * var13) / 4096.0F + arg1;
        float var18 = (-arg2 * var13 + ((float) this.method618() - arg3) * var12) / 4096.0F + arg0;
        float var19 = (arg2 * var12 + ((float) this.method618() - arg3) * var13) / 4096.0F + arg1;
        this.method621(var14, var15, var16, var17, var18, var19, arg6, arg7, arg8);
    }

    @OriginalMember(owner = "client!o", name = "b", descriptor = "(IIII)V")
    public final void method851(int arg0, int arg1, int arg2, int arg3) {
        this.method630(arg0, arg1, arg2, arg3, 1, 0, 1);
    }

    @OriginalMember(owner = "client!o", name = "RA", descriptor = "()I")
    public abstract int method623();

    @OriginalMember(owner = "client!o", name = "a", descriptor = "(II)V")
    public final void method852(int arg0, int arg1) {
        this.method620(arg0, arg1, 1, 0, 1);
    }

    @OriginalMember(owner = "client!o", name = "a", descriptor = "(FFFFFFLta;II)V")
    public abstract void method629(float arg0, float arg1, float arg2, float arg3, float arg4, float arg5, class453 arg6, int arg7, int arg8);
}
