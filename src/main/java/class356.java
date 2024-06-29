import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!gl")
public abstract class class356 {

    @OriginalMember(owner = "client!gl", name = "a", descriptor = "(FFFFIIIII)V", line = 4)
    private final void method2313(float arg0, float arg1, float arg2, float arg3, int arg4, int arg5, int arg6, int arg7, int arg8) {
        if (arg4 == 0) {
            return;
        }
        double var10 = (double) (arg5 & 0xFFFF) * 9.587379924285257E-5D;
        float var12 = (float) Math.sin(var10) * (float) arg4;
        float var13 = (float) Math.cos(var10) * (float) arg4;
        float var14 = (-arg2 * var13 + -arg3 * var12) / 4096.0F + arg0;
        float var15 = (-arg3 * var13 + arg2 * var12) / 4096.0F + arg1;
        float var16 = (((float) this.method2318() - arg2) * var13 + -arg3 * var12) / 4096.0F + arg0;
        float var17 = (-((float) this.method2318() - arg2) * var12 + -arg3 * var13) / 4096.0F + arg1;
        float var18 = (-arg2 * var13 + ((float) this.method2315() - arg3) * var12) / 4096.0F + arg0;
        float var19 = (arg2 * var12 + ((float) this.method2315() - arg3) * var13) / 4096.0F + arg1;
        this.method2323(var14, var15, var16, var17, var18, var19, arg6, arg7, arg8);
    }

    @OriginalMember(owner = "client!gl", name = "a", descriptor = "(FFIIIII)V", line = 28)
    public final void method2314(float arg0, float arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        this.method2313(arg0, arg1, (float) this.method2318() / 2.0F, (float) this.method2315() / 2.0F, arg2, arg3, arg4, arg5, arg6);
    }

    @OriginalMember(owner = "client!gl", name = "a", descriptor = "(FFIILq;II)V", line = 32)
    public final void method2316(float arg0, float arg1, int arg2, int arg3, class245 arg4, int arg5, int arg6) {
        this.method2319(arg0, arg1, (float) this.method2318() / 2.0F, (float) this.method2315() / 2.0F, arg2, arg3, arg4, arg5, arg6);
    }

    @OriginalMember(owner = "client!gl", name = "a", descriptor = "(FFII)V", line = 35)
    public final void method2317(float arg0, float arg1, int arg2, int arg3) {
        this.method2313(arg0, arg1, (float) this.method2318() / 2.0F, (float) this.method2315() / 2.0F, arg2, arg3, 0, 0, 1);
    }

    @OriginalMember(owner = "client!gl", name = "a", descriptor = "(FFFFIILq;II)V", line = 39)
    public final void method2319(float arg0, float arg1, float arg2, float arg3, int arg4, int arg5, class245 arg6, int arg7, int arg8) {
        if (arg4 == 0) {
            return;
        }
        double var10 = (double) (arg5 & 0xFFFF) * 9.587379924285257E-5D;
        float var12 = (float) Math.sin(var10) * (float) arg4;
        float var13 = (float) Math.cos(var10) * (float) arg4;
        float var14 = (-arg2 * var13 + -arg3 * var12) / 4096.0F + arg0;
        float var15 = (-arg3 * var13 + arg2 * var12) / 4096.0F + arg1;
        float var16 = (((float) this.method2318() - arg2) * var13 + -arg3 * var12) / 4096.0F + arg0;
        float var17 = (-((float) this.method2318() - arg2) * var12 + -arg3 * var13) / 4096.0F + arg1;
        float var18 = (-arg2 * var13 + ((float) this.method2315() - arg3) * var12) / 4096.0F + arg0;
        float var19 = (arg2 * var12 + ((float) this.method2315() - arg3) * var13) / 4096.0F + arg1;
        this.method2322(var14, var15, var16, var17, var18, var19, arg6, arg7, arg8);
    }

    @OriginalMember(owner = "client!gl", name = "a", descriptor = "(IIII)V", line = 63)
    public final void method2320(int arg0, int arg1, int arg2, int arg3) {
        this.method420(arg0, arg1, arg2, arg3, 0, 0, 1);
    }

    @OriginalMember(owner = "client!gl", name = "a", descriptor = "(II)V", line = 80)
    public final void method2327(int arg0, int arg1) {
        this.method419(arg0, arg1, 0, 0, 1);
    }

    @OriginalMember(owner = "client!gl", name = "a", descriptor = "()I")
    public abstract int method2315();

    @OriginalMember(owner = "client!gl", name = "b", descriptor = "()I")
    public abstract int method2318();

    @OriginalMember(owner = "client!gl", name = "a", descriptor = "(III)V")
    public abstract void method417(int arg0, int arg1, int arg2);

    @OriginalMember(owner = "client!gl", name = "b", descriptor = "(IIII)V")
    public abstract void method2321(int arg0, int arg1, int arg2, int arg3);

    @OriginalMember(owner = "client!gl", name = "a", descriptor = "(FFFFFFLq;II)V")
    public abstract void method2322(float arg0, float arg1, float arg2, float arg3, float arg4, float arg5, class245 arg6, int arg7, int arg8);

    @OriginalMember(owner = "client!gl", name = "a", descriptor = "(IILq;II)V")
    public abstract void method418(int arg0, int arg1, class245 arg2, int arg3, int arg4);

    @OriginalMember(owner = "client!gl", name = "a", descriptor = "(IIIIIII)V")
    public abstract void method420(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6);

    @OriginalMember(owner = "client!gl", name = "a", descriptor = "(FFFFFFIII)V")
    public abstract void method2323(float arg0, float arg1, float arg2, float arg3, float arg4, float arg5, int arg6, int arg7, int arg8);

    @OriginalMember(owner = "client!gl", name = "c", descriptor = "()I")
    public abstract int method2324();

    @OriginalMember(owner = "client!gl", name = "d", descriptor = "()I")
    public abstract int method2325();

    @OriginalMember(owner = "client!gl", name = "b", descriptor = "(IIIIIII)V")
    public abstract void method2326(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6);

    @OriginalMember(owner = "client!gl", name = "a", descriptor = "(IIIII)V")
    public abstract void method419(int arg0, int arg1, int arg2, int arg3, int arg4);

    @OriginalMember(owner = "client!gl", name = "a", descriptor = "(IIIIII)V")
    public abstract void method421(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5);
}
