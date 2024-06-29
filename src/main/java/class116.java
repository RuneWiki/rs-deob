import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ha")
public abstract class class116 {

    @OriginalMember(owner = "client!ha", name = "a", descriptor = "(FFIILpa;II)V")
    public final void method709(float arg0, float arg1, int arg2, int arg3, class594 arg4, int arg5, int arg6) {
        this.method713(arg0, arg1, (float) this.method722() / 2.0F, (float) this.method714() / 2.0F, arg2, arg3, arg4, arg5, arg6);
    }

    @OriginalMember(owner = "client!ha", name = "i", descriptor = "(IIIIIII)V")
    public abstract void method710(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6);

    @OriginalMember(owner = "client!ha", name = "a", descriptor = "(FFIIIII)V")
    public final void method711(float arg0, float arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        this.method719(arg0, arg1, (float) this.method722() / 2.0F, (float) this.method714() / 2.0F, arg2, arg3, arg4, arg5, arg6);
    }

    @OriginalMember(owner = "client!ha", name = "a", descriptor = "(FFFFFFLpa;II)V")
    public abstract void method712(float arg0, float arg1, float arg2, float arg3, float arg4, float arg5, class594 arg6, int arg7, int arg8);

    @OriginalMember(owner = "client!ha", name = "a", descriptor = "(IILpa;II)V")
    public abstract void method236(int arg0, int arg1, class594 arg2, int arg3, int arg4);

    @OriginalMember(owner = "client!ha", name = "a", descriptor = "(FFFFIILpa;II)V")
    public final void method713(float arg0, float arg1, float arg2, float arg3, int arg4, int arg5, class594 arg6, int arg7, int arg8) {
        if (arg4 == 0) {
            return;
        }
        double var10 = (double) (arg5 & 0xFFFF) * 9.587379924285257E-5D;
        float var12 = (float) Math.sin(var10) * (float) arg4;
        float var13 = (float) Math.cos(var10) * (float) arg4;
        float var14 = (-arg2 * var13 + -arg3 * var12) / 4096.0F + arg0;
        float var15 = (-arg3 * var13 + arg2 * var12) / 4096.0F + arg1;
        float var16 = (((float) this.method722() - arg2) * var13 + -arg3 * var12) / 4096.0F + arg0;
        float var17 = (-((float) this.method722() - arg2) * var12 + -arg3 * var13) / 4096.0F + arg1;
        float var18 = (-arg2 * var13 + ((float) this.method714() - arg3) * var12) / 4096.0F + arg0;
        float var19 = (arg2 * var12 + ((float) this.method714() - arg3) * var13) / 4096.0F + arg1;
        this.method712(var14, var15, var16, var17, var18, var19, arg6, arg7, arg8);
    }

    @OriginalMember(owner = "client!ha", name = "ma", descriptor = "()I")
    public abstract int method714();

    @OriginalMember(owner = "client!ha", name = "a", descriptor = "(IIII)V")
    public final void method715(int arg0, int arg1, int arg2, int arg3) {
        this.method234(arg0, arg1, arg2, arg3, 1, 0, 1);
    }

    @OriginalMember(owner = "client!ha", name = "a", descriptor = "(FFII)V")
    public final void method716(float arg0, float arg1, int arg2, int arg3) {
        this.method719(arg0, arg1, (float) this.method722() / 2.0F, (float) this.method714() / 2.0F, arg2, arg3, 1, 0, 1);
    }

    @OriginalMember(owner = "client!ha", name = "b", descriptor = "(IIII)V")
    public final void method717(int arg0, int arg1, int arg2, int arg3) {
        this.method710(arg0, arg1, arg2, arg3, 1, 0, 1);
    }

    @OriginalMember(owner = "client!ha", name = "c", descriptor = "()I")
    public abstract int method718();

    @OriginalMember(owner = "client!ha", name = "P", descriptor = "(IIIIII)V")
    public abstract void method231(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5);

    @OriginalMember(owner = "client!ha", name = "a", descriptor = "(FFFFIIIII)V")
    private final void method719(float arg0, float arg1, float arg2, float arg3, int arg4, int arg5, int arg6, int arg7, int arg8) {
        if (arg4 == 0) {
            return;
        }
        double var10 = (double) (arg5 & 0xFFFF) * 9.587379924285257E-5D;
        float var12 = (float) Math.sin(var10) * (float) arg4;
        float var13 = (float) Math.cos(var10) * (float) arg4;
        float var14 = (-arg2 * var13 + -arg3 * var12) / 4096.0F + arg0;
        float var15 = (-arg3 * var13 + arg2 * var12) / 4096.0F + arg1;
        float var16 = (((float) this.method722() - arg2) * var13 + -arg3 * var12) / 4096.0F + arg0;
        float var17 = (-((float) this.method722() - arg2) * var12 + -arg3 * var13) / 4096.0F + arg1;
        float var18 = (-arg2 * var13 + ((float) this.method714() - arg3) * var12) / 4096.0F + arg0;
        float var19 = (arg2 * var12 + ((float) this.method714() - arg3) * var13) / 4096.0F + arg1;
        this.method724(var14, var15, var16, var17, var18, var19, arg6, arg7, arg8);
    }

    @OriginalMember(owner = "client!ha", name = "KA", descriptor = "(IIII)V")
    public abstract void method720(int arg0, int arg1, int arg2, int arg3);

    @OriginalMember(owner = "client!ha", name = "la", descriptor = "()I")
    public abstract int method721();

    @OriginalMember(owner = "client!ha", name = "ra", descriptor = "(IIIIIII)V")
    public abstract void method234(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6);

    @OriginalMember(owner = "client!ha", name = "BA", descriptor = "(III)V")
    public abstract void method235(int arg0, int arg1, int arg2);

    @OriginalMember(owner = "client!ha", name = "EA", descriptor = "()I")
    public abstract int method722();

    @OriginalMember(owner = "client!ha", name = "a", descriptor = "(II)V")
    public final void method723(int arg0, int arg1) {
        this.method237(arg0, arg1, 1, 0, 1);
    }

    @OriginalMember(owner = "client!ha", name = "CA", descriptor = "(FFFFFFIII)V")
    public abstract void method724(float arg0, float arg1, float arg2, float arg3, float arg4, float arg5, int arg6, int arg7, int arg8);

    @OriginalMember(owner = "client!ha", name = "DA", descriptor = "(IIIII)V")
    public abstract void method237(int arg0, int arg1, int arg2, int arg3, int arg4);
}
