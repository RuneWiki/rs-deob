import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!lf")
public abstract class class130 {

    @OriginalMember(owner = "client!lf", name = "a", descriptor = "(FFFFIIIII)V", line = 4)
    private final void method866(float arg0, float arg1, float arg2, float arg3, int arg4, int arg5, int arg6, int arg7, int arg8) {
        if (arg4 == 0) {
            return;
        }
        double var10 = (double) (arg5 & 0xFFFF) * 9.587379924285257E-5D;
        float var12 = (float) Math.sin(var10) * (float) arg4;
        float var13 = (float) Math.cos(var10) * (float) arg4;
        float var14 = (-arg2 * var13 + -arg3 * var12) / 4096.0F + arg0;
        float var15 = (-arg3 * var13 + arg2 * var12) / 4096.0F + arg1;
        float var16 = (((float) this.method874() - arg2) * var13 + -arg3 * var12) / 4096.0F + arg0;
        float var17 = (-((float) this.method874() - arg2) * var12 + -arg3 * var13) / 4096.0F + arg1;
        float var18 = (-arg2 * var13 + ((float) this.method877() - arg3) * var12) / 4096.0F + arg0;
        float var19 = (arg2 * var12 + ((float) this.method877() - arg3) * var13) / 4096.0F + arg1;
        this.method873(var14, var15, var16, var17, var18, var19, arg6, arg7, arg8);
    }

    @OriginalMember(owner = "client!lf", name = "a", descriptor = "(II)V", line = 28)
    public final void method867(int arg0, int arg1) {
        this.method809(arg0, arg1, 0, 0, 1);
    }

    @OriginalMember(owner = "client!lf", name = "a", descriptor = "(FFIIIII)V", line = 37)
    public final void method869(float arg0, float arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        this.method866(arg0, arg1, (float) this.method874() / 2.0F, (float) this.method877() / 2.0F, arg2, arg3, arg4, arg5, arg6);
    }

    @OriginalMember(owner = "client!lf", name = "a", descriptor = "(FFII)V", line = 41)
    public final void method871(float arg0, float arg1, int arg2, int arg3) {
        this.method866(arg0, arg1, (float) this.method874() / 2.0F, (float) this.method877() / 2.0F, arg2, arg3, 0, 0, 1);
    }

    @OriginalMember(owner = "client!lf", name = "b", descriptor = "(IIII)V", line = 45)
    public final void method872(int arg0, int arg1, int arg2, int arg3) {
        this.method807(arg0, arg1, arg2, arg3, 0, 0, 1);
    }

    @OriginalMember(owner = "client!lf", name = "a", descriptor = "(FFFFIILtm;II)V", line = 54)
    public final void method878(float arg0, float arg1, float arg2, float arg3, int arg4, int arg5, class220 arg6, int arg7, int arg8) {
        if (arg4 == 0) {
            return;
        }
        double var10 = (double) (arg5 & 0xFFFF) * 9.587379924285257E-5D;
        float var12 = (float) Math.sin(var10) * (float) arg4;
        float var13 = (float) Math.cos(var10) * (float) arg4;
        float var14 = (-arg2 * var13 + -arg3 * var12) / 4096.0F + arg0;
        float var15 = (-arg3 * var13 + arg2 * var12) / 4096.0F + arg1;
        float var16 = (((float) this.method874() - arg2) * var13 + -arg3 * var12) / 4096.0F + arg0;
        float var17 = (-((float) this.method874() - arg2) * var12 + -arg3 * var13) / 4096.0F + arg1;
        float var18 = (-arg2 * var13 + ((float) this.method877() - arg3) * var12) / 4096.0F + arg0;
        float var19 = (arg2 * var12 + ((float) this.method877() - arg3) * var13) / 4096.0F + arg1;
        this.method870(var14, var15, var16, var17, var18, var19, arg6, arg7, arg8);
    }

    @OriginalMember(owner = "client!lf", name = "a", descriptor = "(FFIILtm;II)V", line = 81)
    public final void method879(float arg0, float arg1, int arg2, int arg3, class220 arg4, int arg5, int arg6) {
        this.method878(arg0, arg1, (float) this.method874() / 2.0F, (float) this.method877() / 2.0F, arg2, arg3, arg4, arg5, arg6);
    }

    @OriginalMember(owner = "client!lf", name = "a", descriptor = "(IIIIII)V")
    public abstract void method808(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5);

    @OriginalMember(owner = "client!lf", name = "a", descriptor = "(IIIII)V")
    public abstract void method809(int arg0, int arg1, int arg2, int arg3, int arg4);

    @OriginalMember(owner = "client!lf", name = "a", descriptor = "(III)V")
    public abstract void method806(int arg0, int arg1, int arg2);

    @OriginalMember(owner = "client!lf", name = "a", descriptor = "(IIII)V")
    public abstract void method868(int arg0, int arg1, int arg2, int arg3);

    @OriginalMember(owner = "client!lf", name = "a", descriptor = "(IIIIIII)V")
    public abstract void method807(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6);

    @OriginalMember(owner = "client!lf", name = "a", descriptor = "(FFFFFFLtm;II)V")
    public abstract void method870(float arg0, float arg1, float arg2, float arg3, float arg4, float arg5, class220 arg6, int arg7, int arg8);

    @OriginalMember(owner = "client!lf", name = "a", descriptor = "(FFFFFFIII)V")
    public abstract void method873(float arg0, float arg1, float arg2, float arg3, float arg4, float arg5, int arg6, int arg7, int arg8);

    @OriginalMember(owner = "client!lf", name = "a", descriptor = "()I")
    public abstract int method874();

    @OriginalMember(owner = "client!lf", name = "b", descriptor = "(IIIIIII)V")
    public abstract void method875(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6);

    @OriginalMember(owner = "client!lf", name = "b", descriptor = "()I")
    public abstract int method876();

    @OriginalMember(owner = "client!lf", name = "c", descriptor = "()I")
    public abstract int method877();

    @OriginalMember(owner = "client!lf", name = "a", descriptor = "(IILtm;II)V")
    public abstract void method805(int arg0, int arg1, class220 arg2, int arg3, int arg4);

    @OriginalMember(owner = "client!lf", name = "d", descriptor = "()I")
    public abstract int method880();
}
