import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!aq")
public abstract class class385 {

    @OriginalMember(owner = "client!aq", name = "a", descriptor = "(FFFFIIIII)V")
    private final void method2295(float arg0, float arg1, float arg2, float arg3, int arg4, int arg5, int arg6, int arg7, int arg8) {
        if (arg4 == 0) {
            return;
        }
        double var10 = (double) (arg5 & 0xFFFF) * 9.587379924285257E-5D;
        float var12 = (float) Math.sin(var10) * (float) arg4;
        float var13 = (float) Math.cos(var10) * (float) arg4;
        float var14 = (-arg2 * var13 + -arg3 * var12) / 4096.0F + arg0;
        float var15 = (-arg3 * var13 + arg2 * var12) / 4096.0F + arg1;
        float var16 = (((float) this.method382() - arg2) * var13 + -arg3 * var12) / 4096.0F + arg0;
        float var17 = (-((float) this.method382() - arg2) * var12 + -arg3 * var13) / 4096.0F + arg1;
        float var18 = (-arg2 * var13 + ((float) this.method389() - arg3) * var12) / 4096.0F + arg0;
        float var19 = (arg2 * var12 + ((float) this.method389() - arg3) * var13) / 4096.0F + arg1;
        this.method387(var14, var15, var16, var17, var18, var19, arg6, arg7, arg8);
    }

    @OriginalMember(owner = "client!aq", name = "a", descriptor = "(FFFFIILvb;II)V")
    public final void method2296(float arg0, float arg1, float arg2, float arg3, int arg4, int arg5, class90 arg6, int arg7, int arg8) {
        if (arg4 == 0) {
            return;
        }
        double var10 = (double) (arg5 & 0xFFFF) * 9.587379924285257E-5D;
        float var12 = (float) Math.sin(var10) * (float) arg4;
        float var13 = (float) Math.cos(var10) * (float) arg4;
        float var14 = (-arg2 * var13 + -arg3 * var12) / 4096.0F + arg0;
        float var15 = (-arg3 * var13 + arg2 * var12) / 4096.0F + arg1;
        float var16 = (((float) this.method382() - arg2) * var13 + -arg3 * var12) / 4096.0F + arg0;
        float var17 = (-((float) this.method382() - arg2) * var12 + -arg3 * var13) / 4096.0F + arg1;
        float var18 = (-arg2 * var13 + ((float) this.method389() - arg3) * var12) / 4096.0F + arg0;
        float var19 = (arg2 * var12 + ((float) this.method389() - arg3) * var13) / 4096.0F + arg1;
        this.method391(var14, var15, var16, var17, var18, var19, arg6, arg7, arg8);
    }

    @OriginalMember(owner = "client!aq", name = "a", descriptor = "(IIIIIII)V")
    public abstract void method383(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6);

    @OriginalMember(owner = "client!aq", name = "a", descriptor = "()I")
    public abstract int method382();

    @OriginalMember(owner = "client!aq", name = "a", descriptor = "(IIII)V")
    public final void method2297(int arg0, int arg1, int arg2, int arg3) {
        this.method384(arg0, arg1, arg2, arg3, 0, 0, 1);
    }

    @OriginalMember(owner = "client!aq", name = "b", descriptor = "()I")
    public abstract int method389();

    @OriginalMember(owner = "client!aq", name = "a", descriptor = "(FFII)V")
    public final void method2298(float arg0, float arg1, int arg2, int arg3) {
        this.method2295(arg0, arg1, (float) this.method382() / 2.0F, (float) this.method389() / 2.0F, arg2, arg3, 0, 0, 1);
    }

    @OriginalMember(owner = "client!aq", name = "b", descriptor = "(IIII)V")
    public abstract void method392(int arg0, int arg1, int arg2, int arg3);

    @OriginalMember(owner = "client!aq", name = "a", descriptor = "(IILvb;II)V")
    public abstract void method393(int arg0, int arg1, class90 arg2, int arg3, int arg4);

    @OriginalMember(owner = "client!aq", name = "a", descriptor = "(FFIIIII)V")
    public final void method2299(float arg0, float arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        this.method2295(arg0, arg1, (float) this.method382() / 2.0F, (float) this.method389() / 2.0F, arg2, arg3, arg4, arg5, arg6);
    }

    @OriginalMember(owner = "client!aq", name = "a", descriptor = "(III)V")
    public abstract void method612(int arg0, int arg1, int arg2);

    @OriginalMember(owner = "client!aq", name = "a", descriptor = "(FFFFFFIII)V")
    public abstract void method387(float arg0, float arg1, float arg2, float arg3, float arg4, float arg5, int arg6, int arg7, int arg8);

    @OriginalMember(owner = "client!aq", name = "c", descriptor = "()I")
    public abstract int method394();

    @OriginalMember(owner = "client!aq", name = "b", descriptor = "(IIIIIII)V")
    public abstract void method384(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6);

    @OriginalMember(owner = "client!aq", name = "a", descriptor = "(FFFFFFLvb;II)V")
    public abstract void method391(float arg0, float arg1, float arg2, float arg3, float arg4, float arg5, class90 arg6, int arg7, int arg8);

    @OriginalMember(owner = "client!aq", name = "d", descriptor = "()I")
    public abstract int method388();

    @OriginalMember(owner = "client!aq", name = "a", descriptor = "(FFIILvb;II)V")
    public final void method2300(float arg0, float arg1, int arg2, int arg3, class90 arg4, int arg5, int arg6) {
        this.method2296(arg0, arg1, (float) this.method382() / 2.0F, (float) this.method389() / 2.0F, arg2, arg3, arg4, arg5, arg6);
    }

    @OriginalMember(owner = "client!aq", name = "a", descriptor = "(II)V")
    public final void method2301(int arg0, int arg1) {
        this.method385(arg0, arg1, 0, 0, 1);
    }

    @OriginalMember(owner = "client!aq", name = "a", descriptor = "(IIIIII)V")
    public abstract void method613(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5);

    @OriginalMember(owner = "client!aq", name = "a", descriptor = "(IIIII)V")
    public abstract void method385(int arg0, int arg1, int arg2, int arg3, int arg4);
}
