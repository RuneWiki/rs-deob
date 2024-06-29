import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!kr")
public abstract class class234 {

    @OriginalMember(owner = "client!kr", name = "a", descriptor = "(II)V")
    public final void method1408(int arg0, int arg1) {
        this.method1218(arg0, arg1, 0, 0, 1);
    }

    @OriginalMember(owner = "client!kr", name = "a", descriptor = "(IIIIIII)V")
    public abstract void method1228(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6);

    @OriginalMember(owner = "client!kr", name = "a", descriptor = "(IILor;II)V")
    public abstract void method1217(int arg0, int arg1, class153 arg2, int arg3, int arg4);

    @OriginalMember(owner = "client!kr", name = "a", descriptor = "()I")
    public abstract int method1227();

    @OriginalMember(owner = "client!kr", name = "a", descriptor = "(IIII)V")
    public abstract void method1220(int arg0, int arg1, int arg2, int arg3);

    @OriginalMember(owner = "client!kr", name = "b", descriptor = "(IIII)V")
    public final void method1409(int arg0, int arg1, int arg2, int arg3) {
        this.method1222(arg0, arg1, arg2, arg3, 0, 0, 1);
    }

    @OriginalMember(owner = "client!kr", name = "b", descriptor = "()I")
    public abstract int method1219();

    @OriginalMember(owner = "client!kr", name = "c", descriptor = "()I")
    public abstract int method1229();

    @OriginalMember(owner = "client!kr", name = "a", descriptor = "(III)V")
    public abstract void method1410(int arg0, int arg1, int arg2);

    @OriginalMember(owner = "client!kr", name = "a", descriptor = "(FFFFIIIII)V")
    private final void method1411(float arg0, float arg1, float arg2, float arg3, int arg4, int arg5, int arg6, int arg7, int arg8) {
        if (arg4 == 0) {
            return;
        }
        double var10 = (double) (arg5 & 0xFFFF) * 9.587379924285257E-5D;
        float var12 = (float) Math.sin(var10) * (float) arg4;
        float var13 = (float) Math.cos(var10) * (float) arg4;
        float var14 = (-arg2 * var13 + -arg3 * var12) / 4096.0F + arg0;
        float var15 = (-arg3 * var13 + arg2 * var12) / 4096.0F + arg1;
        float var16 = (((float) this.method1226() - arg2) * var13 + -arg3 * var12) / 4096.0F + arg0;
        float var17 = (-((float) this.method1226() - arg2) * var12 + -arg3 * var13) / 4096.0F + arg1;
        float var18 = (-arg2 * var13 + ((float) this.method1219() - arg3) * var12) / 4096.0F + arg0;
        float var19 = (arg2 * var12 + ((float) this.method1219() - arg3) * var13) / 4096.0F + arg1;
        this.method1221(var14, var15, var16, var17, var18, var19, arg6, arg7, arg8);
    }

    @OriginalMember(owner = "client!kr", name = "b", descriptor = "(IIIIIII)V")
    public abstract void method1222(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6);

    @OriginalMember(owner = "client!kr", name = "a", descriptor = "(FFFFIILor;II)V")
    public final void method1412(float arg0, float arg1, float arg2, float arg3, int arg4, int arg5, class153 arg6, int arg7, int arg8) {
        if (arg4 == 0) {
            return;
        }
        double var10 = (double) (arg5 & 0xFFFF) * 9.587379924285257E-5D;
        float var12 = (float) Math.sin(var10) * (float) arg4;
        float var13 = (float) Math.cos(var10) * (float) arg4;
        float var14 = (-arg2 * var13 + -arg3 * var12) / 4096.0F + arg0;
        float var15 = (-arg3 * var13 + arg2 * var12) / 4096.0F + arg1;
        float var16 = (((float) this.method1226() - arg2) * var13 + -arg3 * var12) / 4096.0F + arg0;
        float var17 = (-((float) this.method1226() - arg2) * var12 + -arg3 * var13) / 4096.0F + arg1;
        float var18 = (-arg2 * var13 + ((float) this.method1219() - arg3) * var12) / 4096.0F + arg0;
        float var19 = (arg2 * var12 + ((float) this.method1219() - arg3) * var13) / 4096.0F + arg1;
        this.method1216(var14, var15, var16, var17, var18, var19, arg6, arg7, arg8);
    }

    @OriginalMember(owner = "client!kr", name = "a", descriptor = "(FFFFFFIII)V")
    public abstract void method1221(float arg0, float arg1, float arg2, float arg3, float arg4, float arg5, int arg6, int arg7, int arg8);

    @OriginalMember(owner = "client!kr", name = "a", descriptor = "(IIIIII)V")
    public abstract void method1413(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5);

    @OriginalMember(owner = "client!kr", name = "a", descriptor = "(FFII)V")
    public final void method1414(float arg0, float arg1, int arg2, int arg3) {
        this.method1411(arg0, arg1, (float) this.method1226() / 2.0F, (float) this.method1219() / 2.0F, arg2, arg3, 0, 0, 1);
    }

    @OriginalMember(owner = "client!kr", name = "d", descriptor = "()I")
    public abstract int method1226();

    @OriginalMember(owner = "client!kr", name = "a", descriptor = "(FFIILor;II)V")
    public final void method1415(float arg0, float arg1, int arg2, int arg3, class153 arg4, int arg5, int arg6) {
        this.method1412(arg0, arg1, (float) this.method1226() / 2.0F, (float) this.method1219() / 2.0F, arg2, arg3, arg4, arg5, arg6);
    }

    @OriginalMember(owner = "client!kr", name = "a", descriptor = "(FFIIIII)V")
    public final void method1416(float arg0, float arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        this.method1411(arg0, arg1, (float) this.method1226() / 2.0F, (float) this.method1219() / 2.0F, arg2, arg3, arg4, arg5, arg6);
    }

    @OriginalMember(owner = "client!kr", name = "a", descriptor = "(IIIII)V")
    public abstract void method1218(int arg0, int arg1, int arg2, int arg3, int arg4);

    @OriginalMember(owner = "client!kr", name = "a", descriptor = "(FFFFFFLor;II)V")
    public abstract void method1216(float arg0, float arg1, float arg2, float arg3, float arg4, float arg5, class153 arg6, int arg7, int arg8);
}
