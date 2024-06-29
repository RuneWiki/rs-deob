import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!oia")
public abstract class class88 implements class717 {

    @OriginalMember(owner = "client!oia", name = "a", descriptor = "(FFFFIIIII)V", line = 3)
    private final void method653(float arg0, float arg1, float arg2, float arg3, int arg4, int arg5, int arg6, int arg7, int arg8) {
        if (arg4 == 0) {
            return;
        }
        double var10 = (double) (arg5 & 0xFFFF) * 9.587379924285257E-5D;
        float var12 = (float) Math.sin(var10) * (float) arg4;
        float var13 = (float) Math.cos(var10) * (float) arg4;
        float var14 = (-arg2 * var13 + -arg3 * var12) / 4096.0F + arg0;
        float var15 = (-arg3 * var13 + arg2 * var12) / 4096.0F + arg1;
        float var16 = (((float) this.method656() - arg2) * var13 + -arg3 * var12) / 4096.0F + arg0;
        float var17 = (-((float) this.method656() - arg2) * var12 + -arg3 * var13) / 4096.0F + arg1;
        float var18 = (-arg2 * var13 + ((float) this.method670() - arg3) * var12) / 4096.0F + arg0;
        float var19 = (arg2 * var12 + ((float) this.method670() - arg3) * var13) / 4096.0F + arg1;
        this.method662(var14, var15, var16, var17, var18, var19, arg6, arg7, arg8);
    }

    @OriginalMember(owner = "client!oia", name = "a", descriptor = "(IIIIIII)V", line = 27)
    public final void method654(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        this.method674(arg0, arg1, arg2, arg3, arg4, arg5, arg6, 1);
    }

    @OriginalMember(owner = "client!oia", name = "a", descriptor = "(II)V", line = 36)
    public final void method658(int arg0, int arg1) {
        this.method672(arg0, arg1, 1, 0, 1);
    }

    @OriginalMember(owner = "client!oia", name = "a", descriptor = "(FFFFFFIII)V", line = 43)
    private final void method662(float arg0, float arg1, float arg2, float arg3, float arg4, float arg5, int arg6, int arg7, int arg8) {
        this.method665(arg0, arg1, arg2, arg3, arg4, arg5, arg6, arg7, arg8, 1);
    }

    @OriginalMember(owner = "client!oia", name = "a", descriptor = "(FFII)V", line = 47)
    public final void method664(float arg0, float arg1, int arg2, int arg3) {
        this.method653(arg0, arg1, (float) this.method656() / 2.0F, (float) this.method670() / 2.0F, arg2, arg3, 1, 0, 1);
    }

    @OriginalMember(owner = "client!oia", name = "b", descriptor = "(IIII)V", line = 52)
    public final void method666(int arg0, int arg1, int arg2, int arg3) {
        this.method673(arg0, arg1, arg2, arg3, 1, 0, 1);
    }

    @OriginalMember(owner = "client!oia", name = "a", descriptor = "(FFFFFFLaa;II)V", line = 55)
    private final void method667(float arg0, float arg1, float arg2, float arg3, float arg4, float arg5, class486 arg6, int arg7, int arg8) {
        this.method676(arg0, arg1, arg2, arg3, arg4, arg5, 1, arg6, arg7, arg8);
    }

    @OriginalMember(owner = "client!oia", name = "c", descriptor = "(IIII)V", line = 58)
    public final void method668(int arg0, int arg1, int arg2, int arg3) {
        this.method674(arg0, arg1, arg2, arg3, 1, 0, 1, 1);
    }

    @OriginalMember(owner = "client!oia", name = "a", descriptor = "(FFIIIII)V", line = 61)
    public final void method669(float arg0, float arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        this.method653(arg0, arg1, (float) this.method656() / 2.0F, (float) this.method670() / 2.0F, arg2, arg3, arg4, arg5, arg6);
    }

    @OriginalMember(owner = "client!oia", name = "a", descriptor = "(FFIILaa;II)V", line = 68)
    public final void method671(float arg0, float arg1, int arg2, int arg3, class486 arg4, int arg5, int arg6) {
        this.method675(arg0, arg1, (float) this.method656() / 2.0F, (float) this.method670() / 2.0F, arg2, arg3, arg4, arg5, arg6);
    }

    @OriginalMember(owner = "client!oia", name = "a", descriptor = "(FFFFIILaa;II)V", line = 74)
    public final void method675(float arg0, float arg1, float arg2, float arg3, int arg4, int arg5, class486 arg6, int arg7, int arg8) {
        if (arg4 == 0) {
            return;
        }
        double var10 = (double) (arg5 & 0xFFFF) * 9.587379924285257E-5D;
        float var12 = (float) Math.sin(var10) * (float) arg4;
        float var13 = (float) Math.cos(var10) * (float) arg4;
        float var14 = (-arg2 * var13 + -arg3 * var12) / 4096.0F + arg0;
        float var15 = (-arg3 * var13 + arg2 * var12) / 4096.0F + arg1;
        float var16 = (((float) this.method656() - arg2) * var13 + -arg3 * var12) / 4096.0F + arg0;
        float var17 = (-((float) this.method656() - arg2) * var12 + -arg3 * var13) / 4096.0F + arg1;
        float var18 = (-arg2 * var13 + ((float) this.method670() - arg3) * var12) / 4096.0F + arg0;
        float var19 = (arg2 * var12 + ((float) this.method670() - arg3) * var13) / 4096.0F + arg1;
        this.method667(var14, var15, var16, var17, var18, var19, arg6, arg7, arg8);
    }

    @OriginalMember(owner = "client!oia", name = "a", descriptor = "(IIII)V")
    public abstract void method655(int arg0, int arg1, int arg2, int arg3);

    @OriginalMember(owner = "client!oia", name = "a", descriptor = "()I")
    public abstract int method656();

    @OriginalMember(owner = "client!oia", name = "b", descriptor = "()I")
    public abstract int method657();

    @OriginalMember(owner = "client!oia", name = "a", descriptor = "(IIIIII)V")
    public abstract void method659(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5);

    @OriginalMember(owner = "client!oia", name = "a", descriptor = "(IILaa;II)V")
    public abstract void method660(int arg0, int arg1, class486 arg2, int arg3, int arg4);

    @OriginalMember(owner = "client!oia", name = "a", descriptor = "(III)V")
    public abstract void method661(int arg0, int arg1, int arg2);

    @OriginalMember(owner = "client!oia", name = "c", descriptor = "()I")
    public abstract int method663();

    @OriginalMember(owner = "client!oia", name = "a", descriptor = "(FFFFFFIIII)V")
    public abstract void method665(float arg0, float arg1, float arg2, float arg3, float arg4, float arg5, int arg6, int arg7, int arg8, int arg9);

    @OriginalMember(owner = "client!oia", name = "d", descriptor = "()I")
    public abstract int method670();

    @OriginalMember(owner = "client!oia", name = "a", descriptor = "(IIIII)V")
    public abstract void method672(int arg0, int arg1, int arg2, int arg3, int arg4);

    @OriginalMember(owner = "client!oia", name = "b", descriptor = "(IIIIIII)V")
    public abstract void method673(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6);

    @OriginalMember(owner = "client!oia", name = "a", descriptor = "(IIIIIIII)V")
    public abstract void method674(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7);

    @OriginalMember(owner = "client!oia", name = "a", descriptor = "(FFFFFFILaa;II)V")
    public abstract void method676(float arg0, float arg1, float arg2, float arg3, float arg4, float arg5, int arg6, class486 arg7, int arg8, int arg9);
}
