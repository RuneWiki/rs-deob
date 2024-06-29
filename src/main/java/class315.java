import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!l")
public abstract class class315 {

    @OriginalMember(owner = "client!l", name = "a", descriptor = "(IIII)V", line = 3)
    public final void method2065(int arg0, int arg1, int arg2, int arg3) {
        this.method200(arg0, arg1, arg2, arg3, 0, 0, 1);
    }

    @OriginalMember(owner = "client!l", name = "a", descriptor = "(FFFFIIIII)V", line = 10)
    private final void method2066(float arg0, float arg1, float arg2, float arg3, int arg4, int arg5, int arg6, int arg7, int arg8) {
        if (arg4 == 0) {
            return;
        }
        double var10 = (double) (arg5 & 0xFFFF) * 9.587379924285257E-5D;
        float var12 = (float) Math.sin(var10) * (float) arg4;
        float var13 = (float) Math.cos(var10) * (float) arg4;
        float var14 = (-arg2 * var13 + -arg3 * var12) / 4096.0F + arg0;
        float var15 = (-arg3 * var13 + arg2 * var12) / 4096.0F + arg1;
        float var16 = (((float) this.method199() - arg2) * var13 + -arg3 * var12) / 4096.0F + arg0;
        float var17 = (-((float) this.method199() - arg2) * var12 + -arg3 * var13) / 4096.0F + arg1;
        float var18 = (-arg2 * var13 + ((float) this.method207() - arg3) * var12) / 4096.0F + arg0;
        float var19 = (arg2 * var12 + ((float) this.method207() - arg3) * var13) / 4096.0F + arg1;
        this.method206(var14, var15, var16, var17, var18, var19, arg6, arg7, arg8);
    }

    @OriginalMember(owner = "client!l", name = "a", descriptor = "(FFII)V", line = 36)
    public final void method2067(float arg0, float arg1, int arg2, int arg3) {
        this.method2066(arg0, arg1, (float) this.method199() / 2.0F, (float) this.method207() / 2.0F, arg2, arg3, 0, 0, 1);
    }

    @OriginalMember(owner = "client!l", name = "a", descriptor = "(FFIIIII)V", line = 40)
    public final void method2068(float arg0, float arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        this.method2066(arg0, arg1, (float) this.method199() / 2.0F, (float) this.method207() / 2.0F, arg2, arg3, arg4, arg5, arg6);
    }

    @OriginalMember(owner = "client!l", name = "a", descriptor = "(FFIILsf;II)V", line = 47)
    public final void method2069(float arg0, float arg1, int arg2, int arg3, class421 arg4, int arg5, int arg6) {
        this.method2071(arg0, arg1, (float) this.method199() / 2.0F, (float) this.method207() / 2.0F, arg2, arg3, arg4, arg5, arg6);
    }

    @OriginalMember(owner = "client!l", name = "a", descriptor = "(II)V", line = 56)
    public final void method2070(int arg0, int arg1) {
        this.method211(arg0, arg1, 0, 0, 1);
    }

    @OriginalMember(owner = "client!l", name = "a", descriptor = "(FFFFIILsf;II)V", line = 61)
    public final void method2071(float arg0, float arg1, float arg2, float arg3, int arg4, int arg5, class421 arg6, int arg7, int arg8) {
        if (arg4 == 0) {
            return;
        }
        double var10 = (double) (arg5 & 0xFFFF) * 9.587379924285257E-5D;
        float var12 = (float) Math.sin(var10) * (float) arg4;
        float var13 = (float) Math.cos(var10) * (float) arg4;
        float var14 = (-arg2 * var13 + -arg3 * var12) / 4096.0F + arg0;
        float var15 = (-arg3 * var13 + arg2 * var12) / 4096.0F + arg1;
        float var16 = (((float) this.method199() - arg2) * var13 + -arg3 * var12) / 4096.0F + arg0;
        float var17 = (-((float) this.method199() - arg2) * var12 + -arg3 * var13) / 4096.0F + arg1;
        float var18 = (-arg2 * var13 + ((float) this.method207() - arg3) * var12) / 4096.0F + arg0;
        float var19 = (arg2 * var12 + ((float) this.method207() - arg3) * var13) / 4096.0F + arg1;
        this.method198(var14, var15, var16, var17, var18, var19, arg6, arg7, arg8);
    }

    @OriginalMember(owner = "client!l", name = "a", descriptor = "(IIIIII)V")
    public abstract void method262(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5);

    @OriginalMember(owner = "client!l", name = "a", descriptor = "()I")
    public abstract int method199();

    @OriginalMember(owner = "client!l", name = "a", descriptor = "(FFFFFFIII)V")
    public abstract void method206(float arg0, float arg1, float arg2, float arg3, float arg4, float arg5, int arg6, int arg7, int arg8);

    @OriginalMember(owner = "client!l", name = "b", descriptor = "(IIII)V")
    public abstract void method205(int arg0, int arg1, int arg2, int arg3);

    @OriginalMember(owner = "client!l", name = "a", descriptor = "(FFFFFFLsf;II)V")
    public abstract void method198(float arg0, float arg1, float arg2, float arg3, float arg4, float arg5, class421 arg6, int arg7, int arg8);

    @OriginalMember(owner = "client!l", name = "b", descriptor = "()I")
    public abstract int method208();

    @OriginalMember(owner = "client!l", name = "c", descriptor = "()I")
    public abstract int method207();

    @OriginalMember(owner = "client!l", name = "a", descriptor = "(IIIIIII)V")
    public abstract void method210(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6);

    @OriginalMember(owner = "client!l", name = "a", descriptor = "(IILsf;II)V")
    public abstract void method209(int arg0, int arg1, class421 arg2, int arg3, int arg4);

    @OriginalMember(owner = "client!l", name = "a", descriptor = "(III)V")
    public abstract void method261(int arg0, int arg1, int arg2);

    @OriginalMember(owner = "client!l", name = "a", descriptor = "(IIIII)V")
    public abstract void method211(int arg0, int arg1, int arg2, int arg3, int arg4);

    @OriginalMember(owner = "client!l", name = "d", descriptor = "()I")
    public abstract int method202();

    @OriginalMember(owner = "client!l", name = "b", descriptor = "(IIIIIII)V")
    public abstract void method200(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6);
}
