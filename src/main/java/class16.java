import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!l")
public abstract class class16 {

    @OriginalMember(owner = "client!l", name = "a", descriptor = "(IIII)V", line = 4)
    public final void method83(int arg0, int arg1, int arg2, int arg3) {
        this.method82(arg0, arg1, arg2, arg3, 1, 0, 1);
    }

    @OriginalMember(owner = "client!l", name = "a", descriptor = "(II)V", line = 8)
    public final void method85(int arg0, int arg1) {
        this.method100(arg0, arg1, 1, 0, 1);
    }

    @OriginalMember(owner = "client!l", name = "a", descriptor = "(FFIILma;II)V", line = 13)
    public final void method87(float arg0, float arg1, int arg2, int arg3, class10 arg4, int arg5, int arg6) {
        this.method96(arg0, arg1, (float) this.method84() / 2.0F, (float) this.method93() / 2.0F, arg2, arg3, arg4, arg5, arg6);
    }

    @OriginalMember(owner = "client!l", name = "a", descriptor = "(FFIIIII)V", line = 18)
    public final void method90(float arg0, float arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        this.method91(arg0, arg1, (float) this.method84() / 2.0F, (float) this.method93() / 2.0F, arg2, arg3, arg4, arg5, arg6);
    }

    @OriginalMember(owner = "client!l", name = "a", descriptor = "(FFFFIIIII)V", line = 21)
    private final void method91(float arg0, float arg1, float arg2, float arg3, int arg4, int arg5, int arg6, int arg7, int arg8) {
        if (arg4 == 0) {
            return;
        }
        double var10 = (double) (arg5 & 0xFFFF) * 9.587379924285257E-5D;
        float var12 = (float) Math.sin(var10) * (float) arg4;
        float var13 = (float) Math.cos(var10) * (float) arg4;
        float var14 = (-arg2 * var13 + -arg3 * var12) / 4096.0F + arg0;
        float var15 = (-arg3 * var13 + arg2 * var12) / 4096.0F + arg1;
        float var16 = (((float) this.method84() - arg2) * var13 + -arg3 * var12) / 4096.0F + arg0;
        float var17 = (-((float) this.method84() - arg2) * var12 + -arg3 * var13) / 4096.0F + arg1;
        float var18 = (-arg2 * var13 + ((float) this.method93() - arg3) * var12) / 4096.0F + arg0;
        float var19 = (arg2 * var12 + ((float) this.method93() - arg3) * var13) / 4096.0F + arg1;
        this.method101(var14, var15, var16, var17, var18, var19, arg6, arg7, arg8);
    }

    @OriginalMember(owner = "client!l", name = "a", descriptor = "(FFII)V", line = 45)
    public final void method92(float arg0, float arg1, int arg2, int arg3) {
        this.method91(arg0, arg1, (float) this.method84() / 2.0F, (float) this.method93() / 2.0F, arg2, arg3, 1, 0, 1);
    }

    @OriginalMember(owner = "client!l", name = "a", descriptor = "(FFFFIILma;II)V", line = 52)
    public final void method96(float arg0, float arg1, float arg2, float arg3, int arg4, int arg5, class10 arg6, int arg7, int arg8) {
        if (arg4 == 0) {
            return;
        }
        double var10 = (double) (arg5 & 0xFFFF) * 9.587379924285257E-5D;
        float var12 = (float) Math.sin(var10) * (float) arg4;
        float var13 = (float) Math.cos(var10) * (float) arg4;
        float var14 = (-arg2 * var13 + -arg3 * var12) / 4096.0F + arg0;
        float var15 = (-arg3 * var13 + arg2 * var12) / 4096.0F + arg1;
        float var16 = (((float) this.method84() - arg2) * var13 + -arg3 * var12) / 4096.0F + arg0;
        float var17 = (-((float) this.method84() - arg2) * var12 + -arg3 * var13) / 4096.0F + arg1;
        float var18 = (-arg2 * var13 + ((float) this.method93() - arg3) * var12) / 4096.0F + arg0;
        float var19 = (arg2 * var12 + ((float) this.method93() - arg3) * var13) / 4096.0F + arg1;
        this.method86(var14, var15, var16, var17, var18, var19, arg6, arg7, arg8);
    }

    @OriginalMember(owner = "client!l", name = "b", descriptor = "(IIII)V", line = 79)
    public final void method99(int arg0, int arg1, int arg2, int arg3) {
        this.method94(arg0, arg1, arg2, arg3, 1, 0, 1);
    }

    @OriginalMember(owner = "client!l", name = "JA", descriptor = "(IIIIIII)V")
    public abstract void method82(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6);

    @OriginalMember(owner = "client!l", name = "j", descriptor = "()I")
    public abstract int method84();

    @OriginalMember(owner = "client!l", name = "b", descriptor = "(FFFFFFLma;II)V")
    public abstract void method86(float arg0, float arg1, float arg2, float arg3, float arg4, float arg5, class10 arg6, int arg7, int arg8);

    @OriginalMember(owner = "client!l", name = "t", descriptor = "(IIIIII)V")
    public abstract void method88(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5);

    @OriginalMember(owner = "client!l", name = "BA", descriptor = "(III)V")
    public abstract void method89(int arg0, int arg1, int arg2);

    @OriginalMember(owner = "client!l", name = "T", descriptor = "()I")
    public abstract int method93();

    @OriginalMember(owner = "client!l", name = "s", descriptor = "(IIIIIII)V")
    public abstract void method94(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6);

    @OriginalMember(owner = "client!l", name = "a", descriptor = "(IILma;II)V")
    public abstract void method95(int arg0, int arg1, class10 arg2, int arg3, int arg4);

    @OriginalMember(owner = "client!l", name = "MA", descriptor = "(IIII)V")
    public abstract void method97(int arg0, int arg1, int arg2, int arg3);

    @OriginalMember(owner = "client!l", name = "ma", descriptor = "()I")
    public abstract int method98();

    @OriginalMember(owner = "client!l", name = "r", descriptor = "(IIIII)V")
    public abstract void method100(int arg0, int arg1, int arg2, int arg3, int arg4);

    @OriginalMember(owner = "client!l", name = "a", descriptor = "(FFFFFFIII)V")
    public abstract void method101(float arg0, float arg1, float arg2, float arg3, float arg4, float arg5, int arg6, int arg7, int arg8);

    @OriginalMember(owner = "client!l", name = "la", descriptor = "()I")
    public abstract int method102();
}
