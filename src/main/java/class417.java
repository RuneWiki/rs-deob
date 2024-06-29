import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!rn")
public abstract class class417 {

    @OriginalMember(owner = "client!rn", name = "a", descriptor = "(IIII)V")
    public abstract void method1291(int arg0, int arg1, int arg2, int arg3);

    @OriginalMember(owner = "client!rn", name = "a", descriptor = "(IIIIII)V")
    public abstract void method726(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5);

    @OriginalMember(owner = "client!rn", name = "a", descriptor = "(FFFFIIIII)V")
    private final void method2491(float arg0, float arg1, float arg2, float arg3, int arg4, int arg5, int arg6, int arg7, int arg8) {
        if (arg4 == 0) {
            return;
        }
        double var10 = (double) (arg5 & 0xFFFF) * 9.587379924285257E-5D;
        float var12 = (float) Math.sin(var10) * (float) arg4;
        float var13 = (float) Math.cos(var10) * (float) arg4;
        float var14 = (-arg2 * var13 + -arg3 * var12) / 4096.0F + arg0;
        float var15 = (-arg3 * var13 + arg2 * var12) / 4096.0F + arg1;
        float var16 = (((float) this.method1294() - arg2) * var13 + -arg3 * var12) / 4096.0F + arg0;
        float var17 = (-((float) this.method1294() - arg2) * var12 + -arg3 * var13) / 4096.0F + arg1;
        float var18 = (-arg2 * var13 + ((float) this.method1295() - arg3) * var12) / 4096.0F + arg0;
        float var19 = (arg2 * var12 + ((float) this.method1295() - arg3) * var13) / 4096.0F + arg1;
        this.method1288(var14, var15, var16, var17, var18, var19, arg6, arg7, arg8);
    }

    @OriginalMember(owner = "client!rn", name = "a", descriptor = "(FFFFFFLoj;II)V")
    public abstract void method1286(float arg0, float arg1, float arg2, float arg3, float arg4, float arg5, class405 arg6, int arg7, int arg8);

    @OriginalMember(owner = "client!rn", name = "a", descriptor = "(FFII)V")
    public final void method2492(float arg0, float arg1, int arg2, int arg3) {
        this.method2491(arg0, arg1, (float) this.method1294() / 2.0F, (float) this.method1295() / 2.0F, arg2, arg3, 0, 0, 1);
    }

    @OriginalMember(owner = "client!rn", name = "a", descriptor = "(IIIII)V")
    public abstract void method722(int arg0, int arg1, int arg2, int arg3, int arg4);

    @OriginalMember(owner = "client!rn", name = "a", descriptor = "(II)V")
    public final void method2493(int arg0, int arg1) {
        this.method722(arg0, arg1, 0, 0, 1);
    }

    @OriginalMember(owner = "client!rn", name = "a", descriptor = "(IILoj;II)V")
    public abstract void method728(int arg0, int arg1, class405 arg2, int arg3, int arg4);

    @OriginalMember(owner = "client!rn", name = "a", descriptor = "()I")
    public abstract int method1295();

    @OriginalMember(owner = "client!rn", name = "a", descriptor = "(FFIILoj;II)V")
    public final void method2494(float arg0, float arg1, int arg2, int arg3, class405 arg4, int arg5, int arg6) {
        this.method2496(arg0, arg1, (float) this.method1294() / 2.0F, (float) this.method1295() / 2.0F, arg2, arg3, arg4, arg5, arg6);
    }

    @OriginalMember(owner = "client!rn", name = "a", descriptor = "(FFIIIII)V")
    public final void method2495(float arg0, float arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        this.method2491(arg0, arg1, (float) this.method1294() / 2.0F, (float) this.method1295() / 2.0F, arg2, arg3, arg4, arg5, arg6);
    }

    @OriginalMember(owner = "client!rn", name = "b", descriptor = "()I")
    public abstract int method1293();

    @OriginalMember(owner = "client!rn", name = "c", descriptor = "()I")
    public abstract int method1294();

    @OriginalMember(owner = "client!rn", name = "a", descriptor = "(III)V")
    public abstract void method723(int arg0, int arg1, int arg2);

    @OriginalMember(owner = "client!rn", name = "a", descriptor = "(IIIIIII)V")
    public abstract void method1292(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6);

    @OriginalMember(owner = "client!rn", name = "a", descriptor = "(FFFFFFIII)V")
    public abstract void method1288(float arg0, float arg1, float arg2, float arg3, float arg4, float arg5, int arg6, int arg7, int arg8);

    @OriginalMember(owner = "client!rn", name = "a", descriptor = "(FFFFIILoj;II)V")
    public final void method2496(float arg0, float arg1, float arg2, float arg3, int arg4, int arg5, class405 arg6, int arg7, int arg8) {
        if (arg4 == 0) {
            return;
        }
        double var10 = (double) (arg5 & 0xFFFF) * 9.587379924285257E-5D;
        float var12 = (float) Math.sin(var10) * (float) arg4;
        float var13 = (float) Math.cos(var10) * (float) arg4;
        float var14 = (-arg2 * var13 + -arg3 * var12) / 4096.0F + arg0;
        float var15 = (-arg3 * var13 + arg2 * var12) / 4096.0F + arg1;
        float var16 = (((float) this.method1294() - arg2) * var13 + -arg3 * var12) / 4096.0F + arg0;
        float var17 = (-((float) this.method1294() - arg2) * var12 + -arg3 * var13) / 4096.0F + arg1;
        float var18 = (-arg2 * var13 + ((float) this.method1295() - arg3) * var12) / 4096.0F + arg0;
        float var19 = (arg2 * var12 + ((float) this.method1295() - arg3) * var13) / 4096.0F + arg1;
        this.method1286(var14, var15, var16, var17, var18, var19, arg6, arg7, arg8);
    }

    @OriginalMember(owner = "client!rn", name = "b", descriptor = "(IIIIIII)V")
    public abstract void method725(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6);

    @OriginalMember(owner = "client!rn", name = "b", descriptor = "(IIII)V")
    public final void method2497(int arg0, int arg1, int arg2, int arg3) {
        this.method725(arg0, arg1, arg2, arg3, 0, 0, 1);
    }

    @OriginalMember(owner = "client!rn", name = "d", descriptor = "()I")
    public abstract int method1287();
}
