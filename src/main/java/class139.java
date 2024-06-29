import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!jd")
public abstract class class139 {

    @OriginalMember(owner = "client!jd", name = "a", descriptor = "()I")
    public abstract int method771();

    @OriginalMember(owner = "client!jd", name = "a", descriptor = "(IILkf;II)V")
    public abstract void method770(int arg0, int arg1, class152 arg2, int arg3, int arg4);

    @OriginalMember(owner = "client!jd", name = "b", descriptor = "()I")
    public abstract int method774();

    @OriginalMember(owner = "client!jd", name = "a", descriptor = "(II)V")
    public final void method836(int arg0, int arg1) {
        this.method768(arg0, arg1, 0, 0, 1);
    }

    @OriginalMember(owner = "client!jd", name = "a", descriptor = "(FFII)V")
    public final void method837(float arg0, float arg1, int arg2, int arg3) {
        this.method841(arg0, arg1, (float) this.method777() / 2.0F, (float) this.method774() / 2.0F, arg2, arg3, 0, 0, 1);
    }

    @OriginalMember(owner = "client!jd", name = "a", descriptor = "(FFFFFFLkf;II)V")
    public abstract void method766(float arg0, float arg1, float arg2, float arg3, float arg4, float arg5, class152 arg6, int arg7, int arg8);

    @OriginalMember(owner = "client!jd", name = "a", descriptor = "(IIII)V")
    public final void method838(int arg0, int arg1, int arg2, int arg3) {
        this.method773(arg0, arg1, arg2, arg3, 0, 0, 1);
    }

    @OriginalMember(owner = "client!jd", name = "c", descriptor = "()I")
    public abstract int method775();

    @OriginalMember(owner = "client!jd", name = "a", descriptor = "(IIIIII)V")
    public abstract void method839(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5);

    @OriginalMember(owner = "client!jd", name = "b", descriptor = "(IIII)V")
    public abstract void method772(int arg0, int arg1, int arg2, int arg3);

    @OriginalMember(owner = "client!jd", name = "a", descriptor = "(III)V")
    public abstract void method840(int arg0, int arg1, int arg2);

    @OriginalMember(owner = "client!jd", name = "a", descriptor = "(FFFFIIIII)V")
    private final void method841(float arg0, float arg1, float arg2, float arg3, int arg4, int arg5, int arg6, int arg7, int arg8) {
        if (arg4 == 0) {
            return;
        }
        double var10 = (double) (arg5 & 0xFFFF) * 9.587379924285257E-5D;
        float var12 = (float) Math.sin(var10) * (float) arg4;
        float var13 = (float) Math.cos(var10) * (float) arg4;
        float var14 = (-arg2 * var13 + -arg3 * var12) / 4096.0F + arg0;
        float var15 = (-arg3 * var13 + arg2 * var12) / 4096.0F + arg1;
        float var16 = (((float) this.method777() - arg2) * var13 + -arg3 * var12) / 4096.0F + arg0;
        float var17 = (-((float) this.method777() - arg2) * var12 + -arg3 * var13) / 4096.0F + arg1;
        float var18 = (-arg2 * var13 + ((float) this.method774() - arg3) * var12) / 4096.0F + arg0;
        float var19 = (arg2 * var12 + ((float) this.method774() - arg3) * var13) / 4096.0F + arg1;
        this.method769(var14, var15, var16, var17, var18, var19, arg6, arg7, arg8);
    }

    @OriginalMember(owner = "client!jd", name = "a", descriptor = "(FFFFFFIII)V")
    public abstract void method769(float arg0, float arg1, float arg2, float arg3, float arg4, float arg5, int arg6, int arg7, int arg8);

    @OriginalMember(owner = "client!jd", name = "a", descriptor = "(IIIIIII)V")
    public abstract void method773(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6);

    @OriginalMember(owner = "client!jd", name = "a", descriptor = "(FFFFIILkf;II)V")
    public final void method842(float arg0, float arg1, float arg2, float arg3, int arg4, int arg5, class152 arg6, int arg7, int arg8) {
        if (arg4 == 0) {
            return;
        }
        double var10 = (double) (arg5 & 0xFFFF) * 9.587379924285257E-5D;
        float var12 = (float) Math.sin(var10) * (float) arg4;
        float var13 = (float) Math.cos(var10) * (float) arg4;
        float var14 = (-arg2 * var13 + -arg3 * var12) / 4096.0F + arg0;
        float var15 = (-arg3 * var13 + arg2 * var12) / 4096.0F + arg1;
        float var16 = (((float) this.method777() - arg2) * var13 + -arg3 * var12) / 4096.0F + arg0;
        float var17 = (-((float) this.method777() - arg2) * var12 + -arg3 * var13) / 4096.0F + arg1;
        float var18 = (-arg2 * var13 + ((float) this.method774() - arg3) * var12) / 4096.0F + arg0;
        float var19 = (arg2 * var12 + ((float) this.method774() - arg3) * var13) / 4096.0F + arg1;
        this.method766(var14, var15, var16, var17, var18, var19, arg6, arg7, arg8);
    }

    @OriginalMember(owner = "client!jd", name = "b", descriptor = "(IIIIIII)V")
    public abstract void method776(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6);

    @OriginalMember(owner = "client!jd", name = "a", descriptor = "(FFIILkf;II)V")
    public final void method843(float arg0, float arg1, int arg2, int arg3, class152 arg4, int arg5, int arg6) {
        this.method842(arg0, arg1, (float) this.method777() / 2.0F, (float) this.method774() / 2.0F, arg2, arg3, arg4, arg5, arg6);
    }

    @OriginalMember(owner = "client!jd", name = "d", descriptor = "()I")
    public abstract int method777();

    @OriginalMember(owner = "client!jd", name = "a", descriptor = "(FFIIIII)V")
    public final void method844(float arg0, float arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        this.method841(arg0, arg1, (float) this.method777() / 2.0F, (float) this.method774() / 2.0F, arg2, arg3, arg4, arg5, arg6);
    }

    @OriginalMember(owner = "client!jd", name = "a", descriptor = "(IIIII)V")
    public abstract void method768(int arg0, int arg1, int arg2, int arg3, int arg4);
}
