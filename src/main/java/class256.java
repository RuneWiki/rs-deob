import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!f")
public abstract class class256 {

    @OriginalMember(owner = "client!f", name = "a", descriptor = "(FFIILua;II)V", line = 3)
    public final void method1525(float arg0, float arg1, int arg2, int arg3, class591 arg4, int arg5, int arg6) {
        this.method1529(arg0, arg1, (float) this.method50() / 2.0F, (float) this.method43() / 2.0F, arg2, arg3, arg4, arg5, arg6);
    }

    @OriginalMember(owner = "client!f", name = "a", descriptor = "(FFIIIII)V", line = 10)
    public final void method1526(float arg0, float arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        this.method1533(arg0, arg1, (float) this.method50() / 2.0F, (float) this.method43() / 2.0F, arg2, arg3, arg4, arg5, arg6);
    }

    @OriginalMember(owner = "client!f", name = "a", descriptor = "(FFII)V", line = 13)
    public final void method1527(float arg0, float arg1, int arg2, int arg3) {
        this.method1533(arg0, arg1, (float) this.method50() / 2.0F, (float) this.method43() / 2.0F, arg2, arg3, 1, 0, 1);
    }

    @OriginalMember(owner = "client!f", name = "a", descriptor = "(IIII)V", line = 16)
    public final void method1528(int arg0, int arg1, int arg2, int arg3) {
        this.method53(arg0, arg1, arg2, arg3, 1, 0, 1);
    }

    @OriginalMember(owner = "client!f", name = "a", descriptor = "(FFFFIILua;II)V", line = 26)
    public final void method1529(float arg0, float arg1, float arg2, float arg3, int arg4, int arg5, class591 arg6, int arg7, int arg8) {
        if (arg4 == 0) {
            return;
        }
        double var10 = (double) (arg5 & 0xFFFF) * 9.587379924285257E-5D;
        float var12 = (float) Math.sin(var10) * (float) arg4;
        float var13 = (float) Math.cos(var10) * (float) arg4;
        float var14 = (-arg2 * var13 + -arg3 * var12) / 4096.0F + arg0;
        float var15 = (-arg3 * var13 + arg2 * var12) / 4096.0F + arg1;
        float var16 = (((float) this.method50() - arg2) * var13 + -arg3 * var12) / 4096.0F + arg0;
        float var17 = (-((float) this.method50() - arg2) * var12 + -arg3 * var13) / 4096.0F + arg1;
        float var18 = (-arg2 * var13 + ((float) this.method43() - arg3) * var12) / 4096.0F + arg0;
        float var19 = (arg2 * var12 + ((float) this.method43() - arg3) * var13) / 4096.0F + arg1;
        this.method1530(var14, var15, var16, var17, var18, var19, arg6, arg7, arg8);
    }

    @OriginalMember(owner = "client!f", name = "a", descriptor = "(FFFFFFLua;II)V", line = 50)
    private final void method1530(float arg0, float arg1, float arg2, float arg3, float arg4, float arg5, class591 arg6, int arg7, int arg8) {
        this.method60(arg0, arg1, arg2, arg3, arg4, arg5, 1, arg6, arg7, arg8);
    }

    @OriginalMember(owner = "client!f", name = "a", descriptor = "(FFFFFFIII)V", line = 53)
    private final void method1531(float arg0, float arg1, float arg2, float arg3, float arg4, float arg5, int arg6, int arg7, int arg8) {
        this.method57(arg0, arg1, arg2, arg3, arg4, arg5, arg6, arg7, arg8, 1);
    }

    @OriginalMember(owner = "client!f", name = "a", descriptor = "(IIIIIII)V", line = 56)
    public final void method1532(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        this.method52(arg0, arg1, arg2, arg3, arg4, arg5, arg6, 1);
    }

    @OriginalMember(owner = "client!f", name = "a", descriptor = "(FFFFIIIII)V", line = 62)
    private final void method1533(float arg0, float arg1, float arg2, float arg3, int arg4, int arg5, int arg6, int arg7, int arg8) {
        if (arg4 == 0) {
            return;
        }
        double var10 = (double) (arg5 & 0xFFFF) * 9.587379924285257E-5D;
        float var12 = (float) Math.sin(var10) * (float) arg4;
        float var13 = (float) Math.cos(var10) * (float) arg4;
        float var14 = (-arg2 * var13 + -arg3 * var12) / 4096.0F + arg0;
        float var15 = (-arg3 * var13 + arg2 * var12) / 4096.0F + arg1;
        float var16 = (((float) this.method50() - arg2) * var13 + -arg3 * var12) / 4096.0F + arg0;
        float var17 = (-((float) this.method50() - arg2) * var12 + -arg3 * var13) / 4096.0F + arg1;
        float var18 = (-arg2 * var13 + ((float) this.method43() - arg3) * var12) / 4096.0F + arg0;
        float var19 = (arg2 * var12 + ((float) this.method43() - arg3) * var13) / 4096.0F + arg1;
        this.method1531(var14, var15, var16, var17, var18, var19, arg6, arg7, arg8);
    }

    @OriginalMember(owner = "client!f", name = "a", descriptor = "(II)V", line = 87)
    public final void method1534(int arg0, int arg1) {
        this.method49(arg0, arg1, 1, 0, 1);
    }

    @OriginalMember(owner = "client!f", name = "b", descriptor = "(IIII)V", line = 92)
    public final void method1535(int arg0, int arg1, int arg2, int arg3) {
        this.method52(arg0, arg1, arg2, arg3, 1, 0, 1, 1);
    }

    @OriginalMember(owner = "client!f", name = "xa", descriptor = "(III)V")
    public abstract void method55(int arg0, int arg1, int arg2);

    @OriginalMember(owner = "client!f", name = "ca", descriptor = "()I")
    public abstract int method43();

    @OriginalMember(owner = "client!f", name = "E", descriptor = "()I")
    public abstract int method48();

    @OriginalMember(owner = "client!f", name = "da", descriptor = "(IIIIII)V")
    public abstract void method44(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5);

    @OriginalMember(owner = "client!f", name = "Q", descriptor = "(IIII)V")
    public abstract void method58(int arg0, int arg1, int arg2, int arg3);

    @OriginalMember(owner = "client!f", name = "u", descriptor = "()I")
    public abstract int method56();

    @OriginalMember(owner = "client!f", name = "qa", descriptor = "(FFFFFFIIII)V")
    public abstract void method57(float arg0, float arg1, float arg2, float arg3, float arg4, float arg5, int arg6, int arg7, int arg8, int arg9);

    @OriginalMember(owner = "client!f", name = "A", descriptor = "()I")
    public abstract int method50();

    @OriginalMember(owner = "client!f", name = "YA", descriptor = "(IIIIIIII)V")
    public abstract void method52(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7);

    @OriginalMember(owner = "client!f", name = "V", descriptor = "(IIIII)V")
    public abstract void method49(int arg0, int arg1, int arg2, int arg3, int arg4);

    @OriginalMember(owner = "client!f", name = "a", descriptor = "(IILua;II)V")
    public abstract void method51(int arg0, int arg1, class591 arg2, int arg3, int arg4);

    @OriginalMember(owner = "client!f", name = "a", descriptor = "(FFFFFFILua;II)V")
    public abstract void method60(float arg0, float arg1, float arg2, float arg3, float arg4, float arg5, int arg6, class591 arg7, int arg8, int arg9);

    @OriginalMember(owner = "client!f", name = "DA", descriptor = "(IIIIIII)V")
    public abstract void method53(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6);
}
