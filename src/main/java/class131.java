import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!hu")
public abstract class class131 implements class268 {

    @OriginalMember(owner = "client!hu", name = "a", descriptor = "(IIII)V", line = 4)
    public final void method814(int arg0, int arg1, int arg2, int arg3) {
        this.method505(arg0, arg1, arg2, arg3, 1, 0, 1, 1);
    }

    @OriginalMember(owner = "client!hu", name = "a", descriptor = "(FFIILaa;II)V", line = 10)
    public final void method815(float arg0, float arg1, int arg2, int arg3, class485 arg4, int arg5, int arg6) {
        this.method823(arg0, arg1, (float) this.method501() / 2.0F, (float) this.method510() / 2.0F, arg2, arg3, arg4, arg5, arg6);
    }

    @OriginalMember(owner = "client!hu", name = "a", descriptor = "(FFFFFFIII)V", line = 18)
    private final void method816(float arg0, float arg1, float arg2, float arg3, float arg4, float arg5, int arg6, int arg7, int arg8) {
        this.method506(arg0, arg1, arg2, arg3, arg4, arg5, arg6, arg7, arg8, 1);
    }

    @OriginalMember(owner = "client!hu", name = "a", descriptor = "(FFIIIII)V", line = 24)
    public final void method817(float arg0, float arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        this.method825(arg0, arg1, (float) this.method501() / 2.0F, (float) this.method510() / 2.0F, arg2, arg3, arg4, arg5, arg6);
    }

    @OriginalMember(owner = "client!hu", name = "b", descriptor = "(IIIIIII)V", line = 27)
    public final void method818(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        this.method505(arg0, arg1, arg2, arg3, arg4, arg5, arg6, 1);
    }

    @OriginalMember(owner = "client!hu", name = "c", descriptor = "(IIII)V", line = 30)
    public final void method819(int arg0, int arg1, int arg2, int arg3) {
        this.method513(arg0, arg1, arg2, arg3, 1, 0, 1);
    }

    @OriginalMember(owner = "client!hu", name = "a", descriptor = "(FFFFFFLaa;II)V", line = 35)
    private final void method820(float arg0, float arg1, float arg2, float arg3, float arg4, float arg5, class485 arg6, int arg7, int arg8) {
        this.method500(arg0, arg1, arg2, arg3, arg4, arg5, 1, arg6, arg7, arg8);
    }

    @OriginalMember(owner = "client!hu", name = "a", descriptor = "(FFII)V", line = 39)
    public final void method821(float arg0, float arg1, int arg2, int arg3) {
        this.method825(arg0, arg1, (float) this.method501() / 2.0F, (float) this.method510() / 2.0F, arg2, arg3, 1, 0, 1);
    }

    @OriginalMember(owner = "client!hu", name = "a", descriptor = "(FFFFIILaa;II)V", line = 44)
    public final void method823(float arg0, float arg1, float arg2, float arg3, int arg4, int arg5, class485 arg6, int arg7, int arg8) {
        if (arg4 == 0) {
            return;
        }
        double var10 = (double) (arg5 & 0xFFFF) * 9.587379924285257E-5D;
        float var12 = (float) Math.sin(var10) * (float) arg4;
        float var13 = (float) Math.cos(var10) * (float) arg4;
        float var14 = (-arg2 * var13 + -arg3 * var12) / 4096.0F + arg0;
        float var15 = (-arg3 * var13 + arg2 * var12) / 4096.0F + arg1;
        float var16 = (((float) this.method501() - arg2) * var13 + -arg3 * var12) / 4096.0F + arg0;
        float var17 = (-((float) this.method501() - arg2) * var12 + -arg3 * var13) / 4096.0F + arg1;
        float var18 = (-arg2 * var13 + ((float) this.method510() - arg3) * var12) / 4096.0F + arg0;
        float var19 = (arg2 * var12 + ((float) this.method510() - arg3) * var13) / 4096.0F + arg1;
        this.method820(var14, var15, var16, var17, var18, var19, arg6, arg7, arg8);
    }

    @OriginalMember(owner = "client!hu", name = "a", descriptor = "(II)V", line = 68)
    public final void method824(int arg0, int arg1) {
        this.method512(arg0, arg1, 1, 0, 1);
    }

    @OriginalMember(owner = "client!hu", name = "a", descriptor = "(FFFFIIIII)V", line = 71)
    private final void method825(float arg0, float arg1, float arg2, float arg3, int arg4, int arg5, int arg6, int arg7, int arg8) {
        if (arg4 == 0) {
            return;
        }
        double var10 = (double) (arg5 & 0xFFFF) * 9.587379924285257E-5D;
        float var12 = (float) Math.sin(var10) * (float) arg4;
        float var13 = (float) Math.cos(var10) * (float) arg4;
        float var14 = (-arg2 * var13 + -arg3 * var12) / 4096.0F + arg0;
        float var15 = (-arg3 * var13 + arg2 * var12) / 4096.0F + arg1;
        float var16 = (((float) this.method501() - arg2) * var13 + -arg3 * var12) / 4096.0F + arg0;
        float var17 = (-((float) this.method501() - arg2) * var12 + -arg3 * var13) / 4096.0F + arg1;
        float var18 = (-arg2 * var13 + ((float) this.method510() - arg3) * var12) / 4096.0F + arg0;
        float var19 = (arg2 * var12 + ((float) this.method510() - arg3) * var13) / 4096.0F + arg1;
        this.method816(var14, var15, var16, var17, var18, var19, arg6, arg7, arg8);
    }

    @OriginalMember(owner = "client!hu", name = "b", descriptor = "(IIII)V")
    public abstract void method511(int arg0, int arg1, int arg2, int arg3);

    @OriginalMember(owner = "client!hu", name = "a", descriptor = "()I")
    public abstract int method501();

    @OriginalMember(owner = "client!hu", name = "a", descriptor = "(IIIIIIII)V")
    public abstract void method505(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7);

    @OriginalMember(owner = "client!hu", name = "a", descriptor = "(IIIIIII)V")
    public abstract void method513(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6);

    @OriginalMember(owner = "client!hu", name = "b", descriptor = "()I")
    public abstract int method509();

    @OriginalMember(owner = "client!hu", name = "c", descriptor = "()I")
    public abstract int method510();

    @OriginalMember(owner = "client!hu", name = "a", descriptor = "(FFFFFFIIII)V")
    public abstract void method506(float arg0, float arg1, float arg2, float arg3, float arg4, float arg5, int arg6, int arg7, int arg8, int arg9);

    @OriginalMember(owner = "client!hu", name = "d", descriptor = "()I")
    public abstract int method503();

    @OriginalMember(owner = "client!hu", name = "a", descriptor = "(IIIII)V")
    public abstract void method512(int arg0, int arg1, int arg2, int arg3, int arg4);

    @OriginalMember(owner = "client!hu", name = "a", descriptor = "(III)V")
    public abstract void method822(int arg0, int arg1, int arg2);

    @OriginalMember(owner = "client!hu", name = "a", descriptor = "(IIIIII)V")
    public abstract void method826(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5);

    @OriginalMember(owner = "client!hu", name = "a", descriptor = "(FFFFFFILaa;II)V")
    public abstract void method500(float arg0, float arg1, float arg2, float arg3, float arg4, float arg5, int arg6, class485 arg7, int arg8, int arg9);

    @OriginalMember(owner = "client!hu", name = "a", descriptor = "(IILaa;II)V")
    public abstract void method502(int arg0, int arg1, class485 arg2, int arg3, int arg4);
}
