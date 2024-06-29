import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!sg")
public abstract class class226 {

    @OriginalMember(owner = "client!sg", name = "a", descriptor = "()I")
    public abstract int method597();

    @OriginalMember(owner = "client!sg", name = "b", descriptor = "()I")
    public abstract int method598();

    @OriginalMember(owner = "client!sg", name = "a", descriptor = "(IIIII)V")
    public abstract void method587(int arg0, int arg1, int arg2, int arg3, int arg4);

    @OriginalMember(owner = "client!sg", name = "a", descriptor = "(FFIIIII)V")
    public final void method1497(float arg0, float arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        this.method1503(arg0, arg1, (float) this.method597() / 2.0F, (float) this.method596() / 2.0F, arg2, arg3, arg4, arg5, arg6);
    }

    @OriginalMember(owner = "client!sg", name = "a", descriptor = "(FFFFFFIII)V")
    public abstract void method594(float arg0, float arg1, float arg2, float arg3, float arg4, float arg5, int arg6, int arg7, int arg8);

    @OriginalMember(owner = "client!sg", name = "a", descriptor = "(III)V")
    public abstract void method591(int arg0, int arg1, int arg2);

    @OriginalMember(owner = "client!sg", name = "a", descriptor = "(IIII)V")
    public final void method1498(int arg0, int arg1, int arg2, int arg3) {
        this.method588(arg0, arg1, arg2, arg3, 0, 0, 1);
    }

    @OriginalMember(owner = "client!sg", name = "b", descriptor = "(IIII)V")
    public abstract void method595(int arg0, int arg1, int arg2, int arg3);

    @OriginalMember(owner = "client!sg", name = "a", descriptor = "(IIIIIII)V")
    public abstract void method588(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6);

    @OriginalMember(owner = "client!sg", name = "a", descriptor = "(IIIIII)V")
    public abstract void method590(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5);

    @OriginalMember(owner = "client!sg", name = "a", descriptor = "(IILep;II)V")
    public abstract void method585(int arg0, int arg1, class241 arg2, int arg3, int arg4);

    @OriginalMember(owner = "client!sg", name = "a", descriptor = "(FFII)V")
    public final void method1499(float arg0, float arg1, int arg2, int arg3) {
        this.method1503(arg0, arg1, (float) this.method597() / 2.0F, (float) this.method596() / 2.0F, arg2, arg3, 0, 0, 1);
    }

    @OriginalMember(owner = "client!sg", name = "a", descriptor = "(FFIILep;II)V")
    public final void method1500(float arg0, float arg1, int arg2, int arg3, class241 arg4, int arg5, int arg6) {
        this.method1502(arg0, arg1, (float) this.method597() / 2.0F, (float) this.method596() / 2.0F, arg2, arg3, arg4, arg5, arg6);
    }

    @OriginalMember(owner = "client!sg", name = "a", descriptor = "(II)V")
    public final void method1501(int arg0, int arg1) {
        this.method587(arg0, arg1, 0, 0, 1);
    }

    @OriginalMember(owner = "client!sg", name = "a", descriptor = "(FFFFIILep;II)V")
    public final void method1502(float arg0, float arg1, float arg2, float arg3, int arg4, int arg5, class241 arg6, int arg7, int arg8) {
        if (arg4 == 0) {
            return;
        }
        double var10 = (double) (arg5 & 0xFFFF) * 9.587379924285257E-5D;
        float var12 = (float) Math.sin(var10) * (float) arg4;
        float var13 = (float) Math.cos(var10) * (float) arg4;
        float var14 = (-arg2 * var13 + -arg3 * var12) / 4096.0F + arg0;
        float var15 = (-arg3 * var13 + arg2 * var12) / 4096.0F + arg1;
        float var16 = (((float) this.method597() - arg2) * var13 + -arg3 * var12) / 4096.0F + arg0;
        float var17 = (-((float) this.method597() - arg2) * var12 + -arg3 * var13) / 4096.0F + arg1;
        float var18 = (-arg2 * var13 + ((float) this.method596() - arg3) * var12) / 4096.0F + arg0;
        float var19 = (arg2 * var12 + ((float) this.method596() - arg3) * var13) / 4096.0F + arg1;
        this.method592(var14, var15, var16, var17, var18, var19, arg6, arg7, arg8);
    }

    @OriginalMember(owner = "client!sg", name = "c", descriptor = "()I")
    public abstract int method596();

    @OriginalMember(owner = "client!sg", name = "d", descriptor = "()I")
    public abstract int method600();

    @OriginalMember(owner = "client!sg", name = "b", descriptor = "(IIIIIII)V")
    public abstract void method593(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6);

    @OriginalMember(owner = "client!sg", name = "a", descriptor = "(FFFFIIIII)V")
    private final void method1503(float arg0, float arg1, float arg2, float arg3, int arg4, int arg5, int arg6, int arg7, int arg8) {
        if (arg4 == 0) {
            return;
        }
        double var10 = (double) (arg5 & 0xFFFF) * 9.587379924285257E-5D;
        float var12 = (float) Math.sin(var10) * (float) arg4;
        float var13 = (float) Math.cos(var10) * (float) arg4;
        float var14 = (-arg2 * var13 + -arg3 * var12) / 4096.0F + arg0;
        float var15 = (-arg3 * var13 + arg2 * var12) / 4096.0F + arg1;
        float var16 = (((float) this.method597() - arg2) * var13 + -arg3 * var12) / 4096.0F + arg0;
        float var17 = (-((float) this.method597() - arg2) * var12 + -arg3 * var13) / 4096.0F + arg1;
        float var18 = (-arg2 * var13 + ((float) this.method596() - arg3) * var12) / 4096.0F + arg0;
        float var19 = (arg2 * var12 + ((float) this.method596() - arg3) * var13) / 4096.0F + arg1;
        this.method594(var14, var15, var16, var17, var18, var19, arg6, arg7, arg8);
    }

    @OriginalMember(owner = "client!sg", name = "a", descriptor = "(FFFFFFLep;II)V")
    public abstract void method592(float arg0, float arg1, float arg2, float arg3, float arg4, float arg5, class241 arg6, int arg7, int arg8);
}
