import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!fs")
public abstract class class581 implements class485 {

    @OriginalMember(owner = "client!fs", name = "a", descriptor = "(FFIIIII)V")
    public final void method4341(float arg0, float arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        this.method4351(arg0, arg1, (float) this.method988() / 2.0F, (float) this.method997() / 2.0F, arg2, arg3, arg4, arg5, arg6);
    }

    @OriginalMember(owner = "client!fs", name = "a", descriptor = "(IIIIIIII)V")
    public abstract void method993(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7);

    @OriginalMember(owner = "client!fs", name = "a", descriptor = "()I")
    public abstract int method986();

    @OriginalMember(owner = "client!fs", name = "a", descriptor = "(IILaa;II)V")
    public abstract void method989(int arg0, int arg1, class512 arg2, int arg3, int arg4);

    @OriginalMember(owner = "client!fs", name = "a", descriptor = "(FFII)V")
    public final void method4342(float arg0, float arg1, int arg2, int arg3) {
        this.method4351(arg0, arg1, (float) this.method988() / 2.0F, (float) this.method997() / 2.0F, arg2, arg3, 1, 0, 1);
    }

    @OriginalMember(owner = "client!fs", name = "b", descriptor = "(IIIIIII)V")
    public abstract void method998(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6);

    @OriginalMember(owner = "client!fs", name = "a", descriptor = "([I)V")
    public abstract void method994(int[] arg0);

    @OriginalMember(owner = "client!fs", name = "a", descriptor = "(FFFFFFIIII)V")
    public abstract void method1000(float arg0, float arg1, float arg2, float arg3, float arg4, float arg5, int arg6, int arg7, int arg8, int arg9);

    @OriginalMember(owner = "client!fs", name = "a", descriptor = "(IIIIII)V")
    public abstract void method987(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5);

    @OriginalMember(owner = "client!fs", name = "a", descriptor = "(IIIIIII)V")
    public final void method4343(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        this.method993(arg0, arg1, arg2, arg3, arg4, arg5, arg6, 1);
    }

    @OriginalMember(owner = "client!fs", name = "c", descriptor = "(IIII)V")
    public final void method4344(int arg0, int arg1, int arg2, int arg3) {
        this.method993(arg0, arg1, arg2, arg3, 1, 0, 1, 1);
    }

    @OriginalMember(owner = "client!fs", name = "a", descriptor = "(FFFFFFLaa;II)V")
    private final void method4345(float arg0, float arg1, float arg2, float arg3, float arg4, float arg5, class512 arg6, int arg7, int arg8) {
        this.method1001(arg0, arg1, arg2, arg3, arg4, arg5, 1, arg6, arg7, arg8);
    }

    @OriginalMember(owner = "client!fs", name = "b", descriptor = "(IIII)V")
    public abstract void method990(int arg0, int arg1, int arg2, int arg3);

    @OriginalMember(owner = "client!fs", name = "a", descriptor = "(IIIII)V")
    public abstract void method999(int arg0, int arg1, int arg2, int arg3, int arg4);

    @OriginalMember(owner = "client!fs", name = "b", descriptor = "()I")
    public abstract int method988();

    @OriginalMember(owner = "client!fs", name = "c", descriptor = "()I")
    public abstract int method997();

    @OriginalMember(owner = "client!fs", name = "a", descriptor = "(FFFFFFILaa;II)V")
    public abstract void method1001(float arg0, float arg1, float arg2, float arg3, float arg4, float arg5, int arg6, class512 arg7, int arg8, int arg9);

    @OriginalMember(owner = "client!fs", name = "a", descriptor = "(FFFFFFIII)V")
    private final void method4346(float arg0, float arg1, float arg2, float arg3, float arg4, float arg5, int arg6, int arg7, int arg8) {
        this.method1000(arg0, arg1, arg2, arg3, arg4, arg5, arg6, arg7, arg8, 1);
    }

    @OriginalMember(owner = "client!fs", name = "a", descriptor = "(II)V")
    public final void method4347(int arg0, int arg1) {
        this.method999(arg0, arg1, 1, 0, 1);
    }

    @OriginalMember(owner = "client!fs", name = "d", descriptor = "()I")
    public abstract int method991();

    @OriginalMember(owner = "client!fs", name = "a", descriptor = "(FFFFIILaa;II)V")
    public final void method4348(float arg0, float arg1, float arg2, float arg3, int arg4, int arg5, class512 arg6, int arg7, int arg8) {
        if (arg4 == 0) {
            return;
        }
        double var10 = (double) (arg5 & 0xFFFF) * 9.587379924285257E-5D;
        float var12 = (float) Math.sin(var10) * (float) arg4;
        float var13 = (float) Math.cos(var10) * (float) arg4;
        float var14 = (-arg2 * var13 + -arg3 * var12) / 4096.0F + arg0;
        float var15 = (-arg3 * var13 + arg2 * var12) / 4096.0F + arg1;
        float var16 = (((float) this.method988() - arg2) * var13 + -arg3 * var12) / 4096.0F + arg0;
        float var17 = (-((float) this.method988() - arg2) * var12 + -arg3 * var13) / 4096.0F + arg1;
        float var18 = (-arg2 * var13 + ((float) this.method997() - arg3) * var12) / 4096.0F + arg0;
        float var19 = (arg2 * var12 + ((float) this.method997() - arg3) * var13) / 4096.0F + arg1;
        this.method4345(var14, var15, var16, var17, var18, var19, arg6, arg7, arg8);
    }

    @OriginalMember(owner = "client!fs", name = "a", descriptor = "(III)V")
    public abstract void method992(int arg0, int arg1, int arg2);

    @OriginalMember(owner = "client!fs", name = "a", descriptor = "(FFIILaa;II)V")
    public final void method4349(float arg0, float arg1, int arg2, int arg3, class512 arg4, int arg5, int arg6) {
        this.method4348(arg0, arg1, (float) this.method988() / 2.0F, (float) this.method997() / 2.0F, arg2, arg3, arg4, arg5, arg6);
    }

    @OriginalMember(owner = "client!fs", name = "a", descriptor = "(IIII)V")
    public final void method4350(int arg0, int arg1, int arg2, int arg3) {
        this.method998(arg0, arg1, arg2, arg3, 1, 0, 1);
    }

    @OriginalMember(owner = "client!fs", name = "a", descriptor = "(FFFFIIIII)V")
    private final void method4351(float arg0, float arg1, float arg2, float arg3, int arg4, int arg5, int arg6, int arg7, int arg8) {
        if (arg4 == 0) {
            return;
        }
        double var10 = (double) (arg5 & 0xFFFF) * 9.587379924285257E-5D;
        float var12 = (float) Math.sin(var10) * (float) arg4;
        float var13 = (float) Math.cos(var10) * (float) arg4;
        float var14 = (-arg2 * var13 + -arg3 * var12) / 4096.0F + arg0;
        float var15 = (-arg3 * var13 + arg2 * var12) / 4096.0F + arg1;
        float var16 = (((float) this.method988() - arg2) * var13 + -arg3 * var12) / 4096.0F + arg0;
        float var17 = (-((float) this.method988() - arg2) * var12 + -arg3 * var13) / 4096.0F + arg1;
        float var18 = (-arg2 * var13 + ((float) this.method997() - arg3) * var12) / 4096.0F + arg0;
        float var19 = (arg2 * var12 + ((float) this.method997() - arg3) * var13) / 4096.0F + arg1;
        this.method4346(var14, var15, var16, var17, var18, var19, arg6, arg7, arg8);
    }
}
