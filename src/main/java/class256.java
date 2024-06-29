import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!vj")
public abstract class class256 {

    @OriginalMember(owner = "client!vj", name = "a", descriptor = "(III)V")
    public abstract void method84(int arg0, int arg1, int arg2);

    @OriginalMember(owner = "client!vj", name = "a", descriptor = "(FFFFIILsg;II)V")
    public final void method1771(float arg0, float arg1, float arg2, float arg3, int arg4, int arg5, class226 arg6, int arg7, int arg8) {
        if (arg4 == 0) {
            return;
        }
        double var10 = (double) (arg5 & 0xFFFF) * 9.587379924285257E-5D;
        float var12 = (float) Math.sin(var10) * (float) arg4;
        float var13 = (float) Math.cos(var10) * (float) arg4;
        float var14 = (-arg2 * var13 + -arg3 * var12) / 4096.0F + arg0;
        float var15 = (-arg3 * var13 + arg2 * var12) / 4096.0F + arg1;
        float var16 = (((float) this.method83() - arg2) * var13 + -arg3 * var12) / 4096.0F + arg0;
        float var17 = (-((float) this.method83() - arg2) * var12 + -arg3 * var13) / 4096.0F + arg1;
        float var18 = (-arg2 * var13 + ((float) this.method75() - arg3) * var12) / 4096.0F + arg0;
        float var19 = (arg2 * var12 + ((float) this.method75() - arg3) * var13) / 4096.0F + arg1;
        this.method82(var14, var15, var16, var17, var18, var19, arg6, arg7, arg8);
    }

    @OriginalMember(owner = "client!vj", name = "a", descriptor = "(II)V")
    public final void method1772(int arg0, int arg1) {
        this.method86(arg0, arg1, 0, 0, 1);
    }

    @OriginalMember(owner = "client!vj", name = "a", descriptor = "(IILsg;II)V")
    public abstract void method78(int arg0, int arg1, class226 arg2, int arg3, int arg4);

    @OriginalMember(owner = "client!vj", name = "a", descriptor = "(IIIIIII)V")
    public abstract void method88(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6);

    @OriginalMember(owner = "client!vj", name = "b", descriptor = "(IIIIIII)V")
    public abstract void method74(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6);

    @OriginalMember(owner = "client!vj", name = "a", descriptor = "(IIIIII)V")
    public abstract void method77(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5);

    @OriginalMember(owner = "client!vj", name = "a", descriptor = "()I")
    public abstract int method80();

    @OriginalMember(owner = "client!vj", name = "a", descriptor = "(FFFFFFLsg;II)V")
    public abstract void method82(float arg0, float arg1, float arg2, float arg3, float arg4, float arg5, class226 arg6, int arg7, int arg8);

    @OriginalMember(owner = "client!vj", name = "a", descriptor = "(IIIII)V")
    public abstract void method86(int arg0, int arg1, int arg2, int arg3, int arg4);

    @OriginalMember(owner = "client!vj", name = "a", descriptor = "(FFIILsg;II)V")
    public final void method1773(float arg0, float arg1, int arg2, int arg3, class226 arg4, int arg5, int arg6) {
        this.method1771(arg0, arg1, (float) this.method83() / 2.0F, (float) this.method75() / 2.0F, arg2, arg3, arg4, arg5, arg6);
    }

    @OriginalMember(owner = "client!vj", name = "a", descriptor = "(IIII)V")
    public final void method1774(int arg0, int arg1, int arg2, int arg3) {
        this.method74(arg0, arg1, arg2, arg3, 0, 0, 1);
    }

    @OriginalMember(owner = "client!vj", name = "b", descriptor = "()I")
    public abstract int method87();

    @OriginalMember(owner = "client!vj", name = "b", descriptor = "(IIII)V")
    public abstract void method85(int arg0, int arg1, int arg2, int arg3);

    @OriginalMember(owner = "client!vj", name = "a", descriptor = "(FFFFFFIII)V")
    public abstract void method81(float arg0, float arg1, float arg2, float arg3, float arg4, float arg5, int arg6, int arg7, int arg8);

    @OriginalMember(owner = "client!vj", name = "c", descriptor = "()I")
    public abstract int method83();

    @OriginalMember(owner = "client!vj", name = "a", descriptor = "(FFIIIII)V")
    public final void method1775(float arg0, float arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        this.method1777(arg0, arg1, (float) this.method83() / 2.0F, (float) this.method75() / 2.0F, arg2, arg3, arg4, arg5, arg6);
    }

    @OriginalMember(owner = "client!vj", name = "a", descriptor = "(FFII)V")
    public final void method1776(float arg0, float arg1, int arg2, int arg3) {
        this.method1777(arg0, arg1, (float) this.method83() / 2.0F, (float) this.method75() / 2.0F, arg2, arg3, 0, 0, 1);
    }

    @OriginalMember(owner = "client!vj", name = "a", descriptor = "(FFFFIIIII)V")
    private final void method1777(float arg0, float arg1, float arg2, float arg3, int arg4, int arg5, int arg6, int arg7, int arg8) {
        if (arg4 == 0) {
            return;
        }
        double var10 = (double) (arg5 & 0xFFFF) * 9.587379924285257E-5D;
        float var12 = (float) Math.sin(var10) * (float) arg4;
        float var13 = (float) Math.cos(var10) * (float) arg4;
        float var14 = (-arg2 * var13 + -arg3 * var12) / 4096.0F + arg0;
        float var15 = (-arg3 * var13 + arg2 * var12) / 4096.0F + arg1;
        float var16 = (((float) this.method83() - arg2) * var13 + -arg3 * var12) / 4096.0F + arg0;
        float var17 = (-((float) this.method83() - arg2) * var12 + -arg3 * var13) / 4096.0F + arg1;
        float var18 = (-arg2 * var13 + ((float) this.method75() - arg3) * var12) / 4096.0F + arg0;
        float var19 = (arg2 * var12 + ((float) this.method75() - arg3) * var13) / 4096.0F + arg1;
        this.method81(var14, var15, var16, var17, var18, var19, arg6, arg7, arg8);
    }

    @OriginalMember(owner = "client!vj", name = "d", descriptor = "()I")
    public abstract int method75();
}
