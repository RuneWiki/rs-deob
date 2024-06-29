import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!hh")
public abstract class class140 implements class461 {

    @OriginalMember(owner = "client!hh", name = "a", descriptor = "(II)V", line = 3)
    public final void method968(int arg0, int arg1) {
        this.method358(arg0, arg1, 1, 0, 1);
    }

    @OriginalMember(owner = "client!hh", name = "a", descriptor = "(FFFFIIIII)V", line = 6)
    private final void method969(float arg0, float arg1, float arg2, float arg3, int arg4, int arg5, int arg6, int arg7, int arg8) {
        if (arg4 == 0) {
            return;
        }
        double var10 = (double) (arg5 & 0xFFFF) * 9.587379924285257E-5D;
        float var12 = (float) Math.sin(var10) * (float) arg4;
        float var13 = (float) Math.cos(var10) * (float) arg4;
        float var14 = (-arg2 * var13 + -arg3 * var12) / 4096.0F + arg0;
        float var15 = (-arg3 * var13 + arg2 * var12) / 4096.0F + arg1;
        float var16 = (((float) this.method343() - arg2) * var13 + -arg3 * var12) / 4096.0F + arg0;
        float var17 = (-((float) this.method343() - arg2) * var12 + -arg3 * var13) / 4096.0F + arg1;
        float var18 = (-arg2 * var13 + ((float) this.method340() - arg3) * var12) / 4096.0F + arg0;
        float var19 = (arg2 * var12 + ((float) this.method340() - arg3) * var13) / 4096.0F + arg1;
        this.method972(var14, var15, var16, var17, var18, var19, arg6, arg7, arg8);
    }

    @OriginalMember(owner = "client!hh", name = "a", descriptor = "(FFIIIII)V", line = 30)
    public final void method970(float arg0, float arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        this.method969(arg0, arg1, (float) this.method343() / 2.0F, (float) this.method340() / 2.0F, arg2, arg3, arg4, arg5, arg6);
    }

    @OriginalMember(owner = "client!hh", name = "a", descriptor = "(IIII)V", line = 36)
    public final void method971(int arg0, int arg1, int arg2, int arg3) {
        this.method342(arg0, arg1, arg2, arg3, 1, 0, 1, 1);
    }

    @OriginalMember(owner = "client!hh", name = "a", descriptor = "(FFFFFFIII)V", line = 42)
    private final void method972(float arg0, float arg1, float arg2, float arg3, float arg4, float arg5, int arg6, int arg7, int arg8) {
        this.method353(arg0, arg1, arg2, arg3, arg4, arg5, arg6, arg7, arg8, 1);
    }

    @OriginalMember(owner = "client!hh", name = "a", descriptor = "(FFII)V", line = 47)
    public final void method973(float arg0, float arg1, int arg2, int arg3) {
        this.method969(arg0, arg1, (float) this.method343() / 2.0F, (float) this.method340() / 2.0F, arg2, arg3, 1, 0, 1);
    }

    @OriginalMember(owner = "client!hh", name = "a", descriptor = "(FFFFIILaa;II)V", line = 56)
    public final void method974(float arg0, float arg1, float arg2, float arg3, int arg4, int arg5, class512 arg6, int arg7, int arg8) {
        if (arg4 == 0) {
            return;
        }
        double var10 = (double) (arg5 & 0xFFFF) * 9.587379924285257E-5D;
        float var12 = (float) Math.sin(var10) * (float) arg4;
        float var13 = (float) Math.cos(var10) * (float) arg4;
        float var14 = (-arg2 * var13 + -arg3 * var12) / 4096.0F + arg0;
        float var15 = (-arg3 * var13 + arg2 * var12) / 4096.0F + arg1;
        float var16 = (((float) this.method343() - arg2) * var13 + -arg3 * var12) / 4096.0F + arg0;
        float var17 = (-((float) this.method343() - arg2) * var12 + -arg3 * var13) / 4096.0F + arg1;
        float var18 = (-arg2 * var13 + ((float) this.method340() - arg3) * var12) / 4096.0F + arg0;
        float var19 = (arg2 * var12 + ((float) this.method340() - arg3) * var13) / 4096.0F + arg1;
        this.method977(var14, var15, var16, var17, var18, var19, arg6, arg7, arg8);
    }

    @OriginalMember(owner = "client!hh", name = "a", descriptor = "(FFIILaa;II)V", line = 83)
    public final void method975(float arg0, float arg1, int arg2, int arg3, class512 arg4, int arg5, int arg6) {
        this.method974(arg0, arg1, (float) this.method343() / 2.0F, (float) this.method340() / 2.0F, arg2, arg3, arg4, arg5, arg6);
    }

    @OriginalMember(owner = "client!hh", name = "a", descriptor = "(IIIIIII)V", line = 88)
    public final void method976(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        this.method342(arg0, arg1, arg2, arg3, arg4, arg5, arg6, 1);
    }

    @OriginalMember(owner = "client!hh", name = "a", descriptor = "(FFFFFFLaa;II)V", line = 93)
    private final void method977(float arg0, float arg1, float arg2, float arg3, float arg4, float arg5, class512 arg6, int arg7, int arg8) {
        this.method356(arg0, arg1, arg2, arg3, arg4, arg5, 1, arg6, arg7, arg8);
    }

    @OriginalMember(owner = "client!hh", name = "c", descriptor = "(IIII)V", line = 96)
    public final void method978(int arg0, int arg1, int arg2, int arg3) {
        this.method344(arg0, arg1, arg2, arg3, 1, 0, 1);
    }

    @OriginalMember(owner = "client!hh", name = "a", descriptor = "([I)V")
    public abstract void method346(int[] arg0);

    @OriginalMember(owner = "client!hh", name = "a", descriptor = "()I")
    public abstract int method350();

    @OriginalMember(owner = "client!hh", name = "a", descriptor = "(III)V")
    public abstract void method345(int arg0, int arg1, int arg2);

    @OriginalMember(owner = "client!hh", name = "a", descriptor = "(IIIIII)V")
    public abstract void method341(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5);

    @OriginalMember(owner = "client!hh", name = "b", descriptor = "(IIII)V")
    public abstract void method347(int arg0, int arg1, int arg2, int arg3);

    @OriginalMember(owner = "client!hh", name = "a", descriptor = "(IIIIIIII)V")
    public abstract void method342(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7);

    @OriginalMember(owner = "client!hh", name = "a", descriptor = "(FFFFFFIIII)V")
    public abstract void method353(float arg0, float arg1, float arg2, float arg3, float arg4, float arg5, int arg6, int arg7, int arg8, int arg9);

    @OriginalMember(owner = "client!hh", name = "a", descriptor = "(FFFFFFILaa;II)V")
    public abstract void method356(float arg0, float arg1, float arg2, float arg3, float arg4, float arg5, int arg6, class512 arg7, int arg8, int arg9);

    @OriginalMember(owner = "client!hh", name = "b", descriptor = "()I")
    public abstract int method343();

    @OriginalMember(owner = "client!hh", name = "a", descriptor = "(IILaa;II)V")
    public abstract void method352(int arg0, int arg1, class512 arg2, int arg3, int arg4);

    @OriginalMember(owner = "client!hh", name = "a", descriptor = "(IIIII)V")
    public abstract void method358(int arg0, int arg1, int arg2, int arg3, int arg4);

    @OriginalMember(owner = "client!hh", name = "c", descriptor = "()I")
    public abstract int method340();

    @OriginalMember(owner = "client!hh", name = "d", descriptor = "()I")
    public abstract int method351();

    @OriginalMember(owner = "client!hh", name = "b", descriptor = "(IIIIIII)V")
    public abstract void method344(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6);
}
