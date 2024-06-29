import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!f")
public abstract class class191 {

    @OriginalMember(owner = "client!f", name = "a", descriptor = "(II)V", line = 5)
    public final void method1332(int arg0, int arg1) {
        this.method32(arg0, arg1, 1, 0, 1);
    }

    @OriginalMember(owner = "client!f", name = "a", descriptor = "(FFII)V", line = 11)
    public final void method1333(float arg0, float arg1, int arg2, int arg3) {
        this.method1337(arg0, arg1, (float) this.method209() / 2.0F, (float) this.method219() / 2.0F, arg2, arg3, 1, 0, 1);
    }

    @OriginalMember(owner = "client!f", name = "a", descriptor = "(FFFFIILea;II)V", line = 14)
    public final void method1334(float arg0, float arg1, float arg2, float arg3, int arg4, int arg5, class15 arg6, int arg7, int arg8) {
        if (arg4 == 0) {
            return;
        }
        double var10 = (double) (arg5 & 0xFFFF) * 9.587379924285257E-5D;
        float var12 = (float) Math.sin(var10) * (float) arg4;
        float var13 = (float) Math.cos(var10) * (float) arg4;
        float var14 = (-arg2 * var13 + -arg3 * var12) / 4096.0F + arg0;
        float var15 = (-arg3 * var13 + arg2 * var12) / 4096.0F + arg1;
        float var16 = (((float) this.method209() - arg2) * var13 + -arg3 * var12) / 4096.0F + arg0;
        float var17 = (-((float) this.method209() - arg2) * var12 + -arg3 * var13) / 4096.0F + arg1;
        float var18 = (-arg2 * var13 + ((float) this.method219() - arg3) * var12) / 4096.0F + arg0;
        float var19 = (arg2 * var12 + ((float) this.method219() - arg3) * var13) / 4096.0F + arg1;
        this.method213(var14, var15, var16, var17, var18, var19, arg6, arg7, arg8);
    }

    @OriginalMember(owner = "client!f", name = "a", descriptor = "(IIII)V", line = 46)
    public final void method1335(int arg0, int arg1, int arg2, int arg3) {
        this.method212(arg0, arg1, arg2, arg3, 1, 0, 1);
    }

    @OriginalMember(owner = "client!f", name = "a", descriptor = "(FFIIIII)V", line = 49)
    public final void method1336(float arg0, float arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        this.method1337(arg0, arg1, (float) this.method209() / 2.0F, (float) this.method219() / 2.0F, arg2, arg3, arg4, arg5, arg6);
    }

    @OriginalMember(owner = "client!f", name = "a", descriptor = "(FFFFIIIII)V", line = 52)
    private final void method1337(float arg0, float arg1, float arg2, float arg3, int arg4, int arg5, int arg6, int arg7, int arg8) {
        if (arg4 == 0) {
            return;
        }
        double var10 = (double) (arg5 & 0xFFFF) * 9.587379924285257E-5D;
        float var12 = (float) Math.sin(var10) * (float) arg4;
        float var13 = (float) Math.cos(var10) * (float) arg4;
        float var14 = (-arg2 * var13 + -arg3 * var12) / 4096.0F + arg0;
        float var15 = (-arg3 * var13 + arg2 * var12) / 4096.0F + arg1;
        float var16 = (((float) this.method209() - arg2) * var13 + -arg3 * var12) / 4096.0F + arg0;
        float var17 = (-((float) this.method209() - arg2) * var12 + -arg3 * var13) / 4096.0F + arg1;
        float var18 = (-arg2 * var13 + ((float) this.method219() - arg3) * var12) / 4096.0F + arg0;
        float var19 = (arg2 * var12 + ((float) this.method219() - arg3) * var13) / 4096.0F + arg1;
        this.method217(var14, var15, var16, var17, var18, var19, arg6, arg7, arg8);
    }

    @OriginalMember(owner = "client!f", name = "a", descriptor = "(FFIILea;II)V", line = 79)
    public final void method1338(float arg0, float arg1, int arg2, int arg3, class15 arg4, int arg5, int arg6) {
        this.method1334(arg0, arg1, (float) this.method209() / 2.0F, (float) this.method219() / 2.0F, arg2, arg3, arg4, arg5, arg6);
    }

    @OriginalMember(owner = "client!f", name = "b", descriptor = "(IIII)V", line = 83)
    public final void method1339(int arg0, int arg1, int arg2, int arg3) {
        this.method34(arg0, arg1, arg2, arg3, 1, 0, 1);
    }

    @OriginalMember(owner = "client!f", name = "YA", descriptor = "(IIIII)V")
    public abstract void method32(int arg0, int arg1, int arg2, int arg3, int arg4);

    @OriginalMember(owner = "client!f", name = "a", descriptor = "(IILea;II)V")
    public abstract void method30(int arg0, int arg1, class15 arg2, int arg3, int arg4);

    @OriginalMember(owner = "client!f", name = "qa", descriptor = "()I")
    public abstract int method214();

    @OriginalMember(owner = "client!f", name = "W", descriptor = "(IIIIII)V")
    public abstract void method31(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5);

    @OriginalMember(owner = "client!f", name = "M", descriptor = "(IIIIIII)V")
    public abstract void method34(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6);

    @OriginalMember(owner = "client!f", name = "ka", descriptor = "(IIII)V")
    public abstract void method221(int arg0, int arg1, int arg2, int arg3);

    @OriginalMember(owner = "client!f", name = "V", descriptor = "(III)V")
    public abstract void method28(int arg0, int arg1, int arg2);

    @OriginalMember(owner = "client!f", name = "UA", descriptor = "()I")
    public abstract int method220();

    @OriginalMember(owner = "client!f", name = "aa", descriptor = "(FFFFFFIII)V")
    public abstract void method217(float arg0, float arg1, float arg2, float arg3, float arg4, float arg5, int arg6, int arg7, int arg8);

    @OriginalMember(owner = "client!f", name = "ja", descriptor = "()I")
    public abstract int method209();

    @OriginalMember(owner = "client!f", name = "JA", descriptor = "()I")
    public abstract int method219();

    @OriginalMember(owner = "client!f", name = "D", descriptor = "(IIIIIII)V")
    public abstract void method212(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6);

    @OriginalMember(owner = "client!f", name = "a", descriptor = "(FFFFFFLea;II)V")
    public abstract void method213(float arg0, float arg1, float arg2, float arg3, float arg4, float arg5, class15 arg6, int arg7, int arg8);
}
