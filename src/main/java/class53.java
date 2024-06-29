import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ha")
public abstract class class53 {

    @OriginalMember(owner = "client!ha", name = "a", descriptor = "(FFIILpa;II)V")
    public final void method313(float arg0, float arg1, int arg2, int arg3, class311 arg4, int arg5, int arg6) {
        this.method330(arg0, arg1, (float) this.method326() / 2.0F, (float) this.method322() / 2.0F, arg2, arg3, arg4, arg5, arg6);
    }

    @OriginalMember(owner = "client!ha", name = "ra", descriptor = "(IIIIIII)V")
    public abstract void method314(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6);

    @OriginalMember(owner = "client!ha", name = "a", descriptor = "(FFFFFFLpa;II)V")
    public abstract void method315(float arg0, float arg1, float arg2, float arg3, float arg4, float arg5, class311 arg6, int arg7, int arg8);

    @OriginalMember(owner = "client!ha", name = "a", descriptor = "(II)V")
    public final void method316(int arg0, int arg1) {
        this.method333(arg0, arg1, 1, 0, 1);
    }

    @OriginalMember(owner = "client!ha", name = "a", descriptor = "(IIII)V")
    public final void method317(int arg0, int arg1, int arg2, int arg3) {
        this.method314(arg0, arg1, arg2, arg3, 1, 0, 1);
    }

    @OriginalMember(owner = "client!ha", name = "la", descriptor = "()I")
    public abstract int method318();

    @OriginalMember(owner = "client!ha", name = "b", descriptor = "(IIII)V")
    public final void method319(int arg0, int arg1, int arg2, int arg3) {
        this.method329(arg0, arg1, arg2, arg3, 1, 0, 1);
    }

    @OriginalMember(owner = "client!ha", name = "P", descriptor = "(IIIIII)V")
    public abstract void method320(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5);

    @OriginalMember(owner = "client!ha", name = "BA", descriptor = "(III)V")
    public abstract void method321(int arg0, int arg1, int arg2);

    @OriginalMember(owner = "client!ha", name = "ma", descriptor = "()I")
    public abstract int method322();

    @OriginalMember(owner = "client!ha", name = "a", descriptor = "(IILpa;II)V")
    public abstract void method323(int arg0, int arg1, class311 arg2, int arg3, int arg4);

    @OriginalMember(owner = "client!ha", name = "KA", descriptor = "(IIII)V")
    public abstract void method324(int arg0, int arg1, int arg2, int arg3);

    @OriginalMember(owner = "client!ha", name = "c", descriptor = "()I")
    public abstract int method325();

    @OriginalMember(owner = "client!ha", name = "EA", descriptor = "()I")
    public abstract int method326();

    @OriginalMember(owner = "client!ha", name = "a", descriptor = "(FFIIIII)V")
    public final void method327(float arg0, float arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        this.method332(arg0, arg1, (float) this.method326() / 2.0F, (float) this.method322() / 2.0F, arg2, arg3, arg4, arg5, arg6);
    }

    @OriginalMember(owner = "client!ha", name = "a", descriptor = "(FFII)V")
    public final void method328(float arg0, float arg1, int arg2, int arg3) {
        this.method332(arg0, arg1, (float) this.method326() / 2.0F, (float) this.method322() / 2.0F, arg2, arg3, 1, 0, 1);
    }

    @OriginalMember(owner = "client!ha", name = "i", descriptor = "(IIIIIII)V")
    public abstract void method329(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6);

    @OriginalMember(owner = "client!ha", name = "a", descriptor = "(FFFFIILpa;II)V")
    public final void method330(float arg0, float arg1, float arg2, float arg3, int arg4, int arg5, class311 arg6, int arg7, int arg8) {
        if (arg4 == 0) {
            return;
        }
        double var10 = (double) (arg5 & 0xFFFF) * 9.587379924285257E-5D;
        float var12 = (float) Math.sin(var10) * (float) arg4;
        float var13 = (float) Math.cos(var10) * (float) arg4;
        float var14 = (-arg2 * var13 + -arg3 * var12) / 4096.0F + arg0;
        float var15 = (-arg3 * var13 + arg2 * var12) / 4096.0F + arg1;
        float var16 = (((float) this.method326() - arg2) * var13 + -arg3 * var12) / 4096.0F + arg0;
        float var17 = (-((float) this.method326() - arg2) * var12 + -arg3 * var13) / 4096.0F + arg1;
        float var18 = (-arg2 * var13 + ((float) this.method322() - arg3) * var12) / 4096.0F + arg0;
        float var19 = (arg2 * var12 + ((float) this.method322() - arg3) * var13) / 4096.0F + arg1;
        this.method315(var14, var15, var16, var17, var18, var19, arg6, arg7, arg8);
    }

    @OriginalMember(owner = "client!ha", name = "CA", descriptor = "(FFFFFFIII)V")
    public abstract void method331(float arg0, float arg1, float arg2, float arg3, float arg4, float arg5, int arg6, int arg7, int arg8);

    @OriginalMember(owner = "client!ha", name = "a", descriptor = "(FFFFIIIII)V")
    private final void method332(float arg0, float arg1, float arg2, float arg3, int arg4, int arg5, int arg6, int arg7, int arg8) {
        if (arg4 == 0) {
            return;
        }
        double var10 = (double) (arg5 & 0xFFFF) * 9.587379924285257E-5D;
        float var12 = (float) Math.sin(var10) * (float) arg4;
        float var13 = (float) Math.cos(var10) * (float) arg4;
        float var14 = (-arg2 * var13 + -arg3 * var12) / 4096.0F + arg0;
        float var15 = (-arg3 * var13 + arg2 * var12) / 4096.0F + arg1;
        float var16 = (((float) this.method326() - arg2) * var13 + -arg3 * var12) / 4096.0F + arg0;
        float var17 = (-((float) this.method326() - arg2) * var12 + -arg3 * var13) / 4096.0F + arg1;
        float var18 = (-arg2 * var13 + ((float) this.method322() - arg3) * var12) / 4096.0F + arg0;
        float var19 = (arg2 * var12 + ((float) this.method322() - arg3) * var13) / 4096.0F + arg1;
        this.method331(var14, var15, var16, var17, var18, var19, arg6, arg7, arg8);
    }

    @OriginalMember(owner = "client!ha", name = "DA", descriptor = "(IIIII)V")
    public abstract void method333(int arg0, int arg1, int arg2, int arg3, int arg4);
}
