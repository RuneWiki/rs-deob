import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!it")
public abstract class class34 implements class224 {

    @OriginalMember(owner = "client!it", name = "a", descriptor = "(FFFFFFIIII)V")
    public abstract void method173(float arg0, float arg1, float arg2, float arg3, float arg4, float arg5, int arg6, int arg7, int arg8, int arg9);

    @OriginalMember(owner = "client!it", name = "a", descriptor = "(FFFFFFLaa;II)V")
    private final void method174(float arg0, float arg1, float arg2, float arg3, float arg4, float arg5, class570 arg6, int arg7, int arg8) {
        this.method180(arg0, arg1, arg2, arg3, arg4, arg5, 1, arg6, arg7, arg8);
    }

    @OriginalMember(owner = "client!it", name = "a", descriptor = "()I")
    public abstract int method175();

    @OriginalMember(owner = "client!it", name = "a", descriptor = "(FFII)V")
    public final void method176(float arg0, float arg1, int arg2, int arg3) {
        this.method190(arg0, arg1, (float) this.method177() / 2.0F, (float) this.method184() / 2.0F, arg2, arg3, 1, 0, 1);
    }

    @OriginalMember(owner = "client!it", name = "a", descriptor = "(IIIII)V")
    public abstract void method48(int arg0, int arg1, int arg2, int arg3, int arg4);

    @OriginalMember(owner = "client!it", name = "b", descriptor = "()I")
    public abstract int method177();

    @OriginalMember(owner = "client!it", name = "a", descriptor = "(FFFFFFIII)V")
    private final void method178(float arg0, float arg1, float arg2, float arg3, float arg4, float arg5, int arg6, int arg7, int arg8) {
        this.method173(arg0, arg1, arg2, arg3, arg4, arg5, arg6, arg7, arg8, 1);
    }

    @OriginalMember(owner = "client!it", name = "c", descriptor = "()I")
    public abstract int method179();

    @OriginalMember(owner = "client!it", name = "a", descriptor = "(FFFFFFILaa;II)V")
    public abstract void method180(float arg0, float arg1, float arg2, float arg3, float arg4, float arg5, int arg6, class570 arg7, int arg8, int arg9);

    @OriginalMember(owner = "client!it", name = "a", descriptor = "(IIIIIII)V")
    public abstract void method181(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6);

    @OriginalMember(owner = "client!it", name = "a", descriptor = "(II)V")
    public final void method182(int arg0, int arg1) {
        this.method48(arg0, arg1, 1, 0, 1);
    }

    @OriginalMember(owner = "client!it", name = "a", descriptor = "(FFFFIILaa;II)V")
    public final void method183(float arg0, float arg1, float arg2, float arg3, int arg4, int arg5, class570 arg6, int arg7, int arg8) {
        if (arg4 == 0) {
            return;
        }
        double var10 = (double) (arg5 & 0xFFFF) * 9.587379924285257E-5D;
        float var12 = (float) Math.sin(var10) * (float) arg4;
        float var13 = (float) Math.cos(var10) * (float) arg4;
        float var14 = (-arg2 * var13 + -arg3 * var12) / 4096.0F + arg0;
        float var15 = (-arg3 * var13 + arg2 * var12) / 4096.0F + arg1;
        float var16 = (((float) this.method177() - arg2) * var13 + -arg3 * var12) / 4096.0F + arg0;
        float var17 = (-((float) this.method177() - arg2) * var12 + -arg3 * var13) / 4096.0F + arg1;
        float var18 = (-arg2 * var13 + ((float) this.method184() - arg3) * var12) / 4096.0F + arg0;
        float var19 = (arg2 * var12 + ((float) this.method184() - arg3) * var13) / 4096.0F + arg1;
        this.method174(var14, var15, var16, var17, var18, var19, arg6, arg7, arg8);
    }

    @OriginalMember(owner = "client!it", name = "d", descriptor = "()I")
    public abstract int method184();

    @OriginalMember(owner = "client!it", name = "a", descriptor = "(IIII)V")
    public abstract void method185(int arg0, int arg1, int arg2, int arg3);

    @OriginalMember(owner = "client!it", name = "a", descriptor = "([I)V")
    public abstract void method186(int[] arg0);

    @OriginalMember(owner = "client!it", name = "a", descriptor = "(IIIIIIII)V")
    public abstract void method49(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7);

    @OriginalMember(owner = "client!it", name = "b", descriptor = "(IIII)V")
    public final void method187(int arg0, int arg1, int arg2, int arg3) {
        this.method49(arg0, arg1, arg2, arg3, 1, 0, 1, 1);
    }

    @OriginalMember(owner = "client!it", name = "c", descriptor = "(IIII)V")
    public final void method188(int arg0, int arg1, int arg2, int arg3) {
        this.method181(arg0, arg1, arg2, arg3, 1, 0, 1);
    }

    @OriginalMember(owner = "client!it", name = "a", descriptor = "(FFIIIII)V")
    public final void method189(float arg0, float arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        this.method190(arg0, arg1, (float) this.method177() / 2.0F, (float) this.method184() / 2.0F, arg2, arg3, arg4, arg5, arg6);
    }

    @OriginalMember(owner = "client!it", name = "a", descriptor = "(FFFFIIIII)V")
    private final void method190(float arg0, float arg1, float arg2, float arg3, int arg4, int arg5, int arg6, int arg7, int arg8) {
        if (arg4 == 0) {
            return;
        }
        double var10 = (double) (arg5 & 0xFFFF) * 9.587379924285257E-5D;
        float var12 = (float) Math.sin(var10) * (float) arg4;
        float var13 = (float) Math.cos(var10) * (float) arg4;
        float var14 = (-arg2 * var13 + -arg3 * var12) / 4096.0F + arg0;
        float var15 = (-arg3 * var13 + arg2 * var12) / 4096.0F + arg1;
        float var16 = (((float) this.method177() - arg2) * var13 + -arg3 * var12) / 4096.0F + arg0;
        float var17 = (-((float) this.method177() - arg2) * var12 + -arg3 * var13) / 4096.0F + arg1;
        float var18 = (-arg2 * var13 + ((float) this.method184() - arg3) * var12) / 4096.0F + arg0;
        float var19 = (arg2 * var12 + ((float) this.method184() - arg3) * var13) / 4096.0F + arg1;
        this.method178(var14, var15, var16, var17, var18, var19, arg6, arg7, arg8);
    }

    @OriginalMember(owner = "client!it", name = "a", descriptor = "(III)V")
    public abstract void method51(int arg0, int arg1, int arg2);

    @OriginalMember(owner = "client!it", name = "b", descriptor = "(IIIIIII)V")
    public final void method191(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        this.method49(arg0, arg1, arg2, arg3, arg4, arg5, arg6, 1);
    }

    @OriginalMember(owner = "client!it", name = "a", descriptor = "(IIIIII)V")
    public abstract void method47(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5);

    @OriginalMember(owner = "client!it", name = "a", descriptor = "(IILaa;II)V")
    public abstract void method52(int arg0, int arg1, class570 arg2, int arg3, int arg4);

    @OriginalMember(owner = "client!it", name = "a", descriptor = "(FFIILaa;II)V")
    public final void method192(float arg0, float arg1, int arg2, int arg3, class570 arg4, int arg5, int arg6) {
        this.method183(arg0, arg1, (float) this.method177() / 2.0F, (float) this.method184() / 2.0F, arg2, arg3, arg4, arg5, arg6);
    }
}
