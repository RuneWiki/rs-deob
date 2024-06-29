import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!aa")
public abstract class class343 {

    @OriginalMember(owner = "client!aa", name = "a", descriptor = "(FFFFIILi;II)V")
    public final void method2168(float arg0, float arg1, float arg2, float arg3, int arg4, int arg5, class31 arg6, int arg7, int arg8) {
        if (arg4 == 0) {
            return;
        }
        double var10 = (double) (arg5 & 0xFFFF) * 9.587379924285257E-5D;
        float var12 = (float) Math.sin(var10) * (float) arg4;
        float var13 = (float) Math.cos(var10) * (float) arg4;
        float var14 = (-arg2 * var13 + -arg3 * var12) / 4096.0F + arg0;
        float var15 = (-arg3 * var13 + arg2 * var12) / 4096.0F + arg1;
        float var16 = (((float) this.method376() - arg2) * var13 + -arg3 * var12) / 4096.0F + arg0;
        float var17 = (-((float) this.method376() - arg2) * var12 + -arg3 * var13) / 4096.0F + arg1;
        float var18 = (-arg2 * var13 + ((float) this.method374() - arg3) * var12) / 4096.0F + arg0;
        float var19 = (arg2 * var12 + ((float) this.method374() - arg3) * var13) / 4096.0F + arg1;
        this.method379(var14, var15, var16, var17, var18, var19, arg6, arg7, arg8);
    }

    @OriginalMember(owner = "client!aa", name = "a", descriptor = "(FFFFFFLi;II)V")
    public abstract void method379(float arg0, float arg1, float arg2, float arg3, float arg4, float arg5, class31 arg6, int arg7, int arg8);

    @OriginalMember(owner = "client!aa", name = "a", descriptor = "(IIII)V")
    public final void method2169(int arg0, int arg1, int arg2, int arg3) {
        this.method372(arg0, arg1, arg2, arg3, 1, 0, 1);
    }

    @OriginalMember(owner = "client!aa", name = "E", descriptor = "(IIIII)V")
    public abstract void method370(int arg0, int arg1, int arg2, int arg3, int arg4);

    @OriginalMember(owner = "client!aa", name = "J", descriptor = "(III)V")
    public abstract void method369(int arg0, int arg1, int arg2);

    @OriginalMember(owner = "client!aa", name = "XA", descriptor = "(IIIIIII)V")
    public abstract void method372(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6);

    @OriginalMember(owner = "client!aa", name = "ta", descriptor = "(FFFFFFIII)V")
    public abstract void method377(float arg0, float arg1, float arg2, float arg3, float arg4, float arg5, int arg6, int arg7, int arg8);

    @OriginalMember(owner = "client!aa", name = "a", descriptor = "(FFFFIIIII)V")
    private final void method2170(float arg0, float arg1, float arg2, float arg3, int arg4, int arg5, int arg6, int arg7, int arg8) {
        if (arg4 == 0) {
            return;
        }
        double var10 = (double) (arg5 & 0xFFFF) * 9.587379924285257E-5D;
        float var12 = (float) Math.sin(var10) * (float) arg4;
        float var13 = (float) Math.cos(var10) * (float) arg4;
        float var14 = (-arg2 * var13 + -arg3 * var12) / 4096.0F + arg0;
        float var15 = (-arg3 * var13 + arg2 * var12) / 4096.0F + arg1;
        float var16 = (((float) this.method376() - arg2) * var13 + -arg3 * var12) / 4096.0F + arg0;
        float var17 = (-((float) this.method376() - arg2) * var12 + -arg3 * var13) / 4096.0F + arg1;
        float var18 = (-arg2 * var13 + ((float) this.method374() - arg3) * var12) / 4096.0F + arg0;
        float var19 = (arg2 * var12 + ((float) this.method374() - arg3) * var13) / 4096.0F + arg1;
        this.method377(var14, var15, var16, var17, var18, var19, arg6, arg7, arg8);
    }

    @OriginalMember(owner = "client!aa", name = "a", descriptor = "(IILi;II)V")
    public abstract void method368(int arg0, int arg1, class31 arg2, int arg3, int arg4);

    @OriginalMember(owner = "client!aa", name = "PA", descriptor = "(IIIIIII)V")
    public abstract void method380(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6);

    @OriginalMember(owner = "client!aa", name = "a", descriptor = "(FFIILi;II)V")
    public final void method2171(float arg0, float arg1, int arg2, int arg3, class31 arg4, int arg5, int arg6) {
        this.method2168(arg0, arg1, (float) this.method376() / 2.0F, (float) this.method374() / 2.0F, arg2, arg3, arg4, arg5, arg6);
    }

    @OriginalMember(owner = "client!aa", name = "ga", descriptor = "()I")
    public abstract int method374();

    @OriginalMember(owner = "client!aa", name = "l", descriptor = "(IIII)V")
    public abstract void method375(int arg0, int arg1, int arg2, int arg3);

    @OriginalMember(owner = "client!aa", name = "b", descriptor = "(IIII)V")
    public final void method2172(int arg0, int arg1, int arg2, int arg3) {
        this.method380(arg0, arg1, arg2, arg3, 1, 0, 1);
    }

    @OriginalMember(owner = "client!aa", name = "a", descriptor = "(FFIIIII)V")
    public final void method2173(float arg0, float arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        this.method2170(arg0, arg1, (float) this.method376() / 2.0F, (float) this.method374() / 2.0F, arg2, arg3, arg4, arg5, arg6);
    }

    @OriginalMember(owner = "client!aa", name = "D", descriptor = "(IIIIII)V")
    public abstract void method365(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5);

    @OriginalMember(owner = "client!aa", name = "a", descriptor = "(FFII)V")
    public final void method2174(float arg0, float arg1, int arg2, int arg3) {
        this.method2170(arg0, arg1, (float) this.method376() / 2.0F, (float) this.method374() / 2.0F, arg2, arg3, 1, 0, 1);
    }

    @OriginalMember(owner = "client!aa", name = "TA", descriptor = "()I")
    public abstract int method378();

    @OriginalMember(owner = "client!aa", name = "V", descriptor = "()I")
    public abstract int method367();

    @OriginalMember(owner = "client!aa", name = "d", descriptor = "()I")
    public abstract int method376();

    @OriginalMember(owner = "client!aa", name = "a", descriptor = "(II)V")
    public final void method2175(int arg0, int arg1) {
        this.method370(arg0, arg1, 1, 0, 1);
    }
}
