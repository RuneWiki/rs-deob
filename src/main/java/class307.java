import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!qg")
public abstract class class307 {

    @OriginalMember(owner = "client!qg", name = "a", descriptor = "(FFIIIII)V", line = 9)
    public final void method1842(float arg0, float arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        this.method1849(arg0, arg1, (float) this.method87() / 2.0F, (float) this.method94() / 2.0F, arg2, arg3, arg4, arg5, arg6);
    }

    @OriginalMember(owner = "client!qg", name = "b", descriptor = "(IIII)V", line = 13)
    public final void method1843(int arg0, int arg1, int arg2, int arg3) {
        this.method92(arg0, arg1, arg2, arg3, 1, 0, 1);
    }

    @OriginalMember(owner = "client!qg", name = "c", descriptor = "(IIII)V", line = 20)
    public final void method1844(int arg0, int arg1, int arg2, int arg3) {
        this.method86(arg0, arg1, arg2, arg3, 1, 0, 1);
    }

    @OriginalMember(owner = "client!qg", name = "a", descriptor = "(II)V", line = 25)
    public final void method1845(int arg0, int arg1) {
        this.method90(arg0, arg1, 1, 0, 1);
    }

    @OriginalMember(owner = "client!qg", name = "a", descriptor = "(FFII)V", line = 29)
    public final void method1846(float arg0, float arg1, int arg2, int arg3) {
        this.method1849(arg0, arg1, (float) this.method87() / 2.0F, (float) this.method94() / 2.0F, arg2, arg3, 1, 0, 1);
    }

    @OriginalMember(owner = "client!qg", name = "a", descriptor = "(FFFFIILfs;II)V", line = 34)
    public final void method1847(float arg0, float arg1, float arg2, float arg3, int arg4, int arg5, class372 arg6, int arg7, int arg8) {
        if (arg4 == 0) {
            return;
        }
        double var10 = (double) (arg5 & 0xFFFF) * 9.587379924285257E-5D;
        float var12 = (float) Math.sin(var10) * (float) arg4;
        float var13 = (float) Math.cos(var10) * (float) arg4;
        float var14 = (-arg2 * var13 + -arg3 * var12) / 4096.0F + arg0;
        float var15 = (-arg3 * var13 + arg2 * var12) / 4096.0F + arg1;
        float var16 = (((float) this.method87() - arg2) * var13 + -arg3 * var12) / 4096.0F + arg0;
        float var17 = (-((float) this.method87() - arg2) * var12 + -arg3 * var13) / 4096.0F + arg1;
        float var18 = (-arg2 * var13 + ((float) this.method94() - arg3) * var12) / 4096.0F + arg0;
        float var19 = (arg2 * var12 + ((float) this.method94() - arg3) * var13) / 4096.0F + arg1;
        this.method89(var14, var15, var16, var17, var18, var19, arg6, arg7, arg8);
    }

    @OriginalMember(owner = "client!qg", name = "a", descriptor = "(FFIILfs;II)V", line = 58)
    public final void method1848(float arg0, float arg1, int arg2, int arg3, class372 arg4, int arg5, int arg6) {
        this.method1847(arg0, arg1, (float) this.method87() / 2.0F, (float) this.method94() / 2.0F, arg2, arg3, arg4, arg5, arg6);
    }

    @OriginalMember(owner = "client!qg", name = "a", descriptor = "(FFFFIIIII)V", line = 62)
    private final void method1849(float arg0, float arg1, float arg2, float arg3, int arg4, int arg5, int arg6, int arg7, int arg8) {
        if (arg4 == 0) {
            return;
        }
        double var10 = (double) (arg5 & 0xFFFF) * 9.587379924285257E-5D;
        float var12 = (float) Math.sin(var10) * (float) arg4;
        float var13 = (float) Math.cos(var10) * (float) arg4;
        float var14 = (-arg2 * var13 + -arg3 * var12) / 4096.0F + arg0;
        float var15 = (-arg3 * var13 + arg2 * var12) / 4096.0F + arg1;
        float var16 = (((float) this.method87() - arg2) * var13 + -arg3 * var12) / 4096.0F + arg0;
        float var17 = (-((float) this.method87() - arg2) * var12 + -arg3 * var13) / 4096.0F + arg1;
        float var18 = (-arg2 * var13 + ((float) this.method94() - arg3) * var12) / 4096.0F + arg0;
        float var19 = (arg2 * var12 + ((float) this.method94() - arg3) * var13) / 4096.0F + arg1;
        this.method88(var14, var15, var16, var17, var18, var19, arg6, arg7, arg8);
    }

    @OriginalMember(owner = "client!qg", name = "a", descriptor = "(FFFFFFIII)V")
    public abstract void method88(float arg0, float arg1, float arg2, float arg3, float arg4, float arg5, int arg6, int arg7, int arg8);

    @OriginalMember(owner = "client!qg", name = "a", descriptor = "()I")
    public abstract int method85();

    @OriginalMember(owner = "client!qg", name = "b", descriptor = "()I")
    public abstract int method93();

    @OriginalMember(owner = "client!qg", name = "a", descriptor = "(IIII)V")
    public abstract void method91(int arg0, int arg1, int arg2, int arg3);

    @OriginalMember(owner = "client!qg", name = "a", descriptor = "(FFFFFFLfs;II)V")
    public abstract void method89(float arg0, float arg1, float arg2, float arg3, float arg4, float arg5, class372 arg6, int arg7, int arg8);

    @OriginalMember(owner = "client!qg", name = "a", descriptor = "(IIIII)V")
    public abstract void method90(int arg0, int arg1, int arg2, int arg3, int arg4);

    @OriginalMember(owner = "client!qg", name = "c", descriptor = "()I")
    public abstract int method94();

    @OriginalMember(owner = "client!qg", name = "a", descriptor = "(IILfs;II)V")
    public abstract void method83(int arg0, int arg1, class372 arg2, int arg3, int arg4);

    @OriginalMember(owner = "client!qg", name = "a", descriptor = "(III)V")
    public abstract void method1325(int arg0, int arg1, int arg2);

    @OriginalMember(owner = "client!qg", name = "d", descriptor = "()I")
    public abstract int method87();

    @OriginalMember(owner = "client!qg", name = "a", descriptor = "(IIIIII)V")
    public abstract void method1326(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5);

    @OriginalMember(owner = "client!qg", name = "a", descriptor = "(IIIIIII)V")
    public abstract void method86(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6);

    @OriginalMember(owner = "client!qg", name = "b", descriptor = "(IIIIIII)V")
    public abstract void method92(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6);
}
