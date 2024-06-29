import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!wn")
public abstract class class77 {

    @OriginalMember(owner = "client!wn", name = "a", descriptor = "(IIII)V", line = 4)
    public final void method615(int arg0, int arg1, int arg2, int arg3) {
        this.method618(arg0, arg1, arg2, arg3, 0, 0, 1);
    }

    @OriginalMember(owner = "client!wn", name = "a", descriptor = "(II)V", line = 7)
    public final void method616(int arg0, int arg1) {
        this.method617(arg0, arg1, 0, 0, 1);
    }

    @OriginalMember(owner = "client!wn", name = "a", descriptor = "(FFIILde;II)V", line = 13)
    public final void method620(float arg0, float arg1, int arg2, int arg3, class165 arg4, int arg5, int arg6) {
        this.method626(arg0, arg1, (float) this.method632() / 2.0F, (float) this.method619() / 2.0F, arg2, arg3, arg4, arg5, arg6);
    }

    @OriginalMember(owner = "client!wn", name = "a", descriptor = "(FFFFIIIII)V", line = 25)
    private final void method625(float arg0, float arg1, float arg2, float arg3, int arg4, int arg5, int arg6, int arg7, int arg8) {
        if (arg4 == 0) {
            return;
        }
        double var10 = (double) (arg5 & 0xFFFF) * 9.587379924285257E-5D;
        float var12 = (float) Math.sin(var10) * (float) arg4;
        float var13 = (float) Math.cos(var10) * (float) arg4;
        float var14 = (-arg2 * var13 + -arg3 * var12) / 4096.0F + arg0;
        float var15 = (-arg3 * var13 + arg2 * var12) / 4096.0F + arg1;
        float var16 = (((float) this.method632() - arg2) * var13 + -arg3 * var12) / 4096.0F + arg0;
        float var17 = (-((float) this.method632() - arg2) * var12 + -arg3 * var13) / 4096.0F + arg1;
        float var18 = (-arg2 * var13 + ((float) this.method619() - arg3) * var12) / 4096.0F + arg0;
        float var19 = (arg2 * var12 + ((float) this.method619() - arg3) * var13) / 4096.0F + arg1;
        this.method633(var14, var15, var16, var17, var18, var19, arg6, arg7, arg8);
    }

    @OriginalMember(owner = "client!wn", name = "a", descriptor = "(FFFFIILde;II)V", line = 49)
    public final void method626(float arg0, float arg1, float arg2, float arg3, int arg4, int arg5, class165 arg6, int arg7, int arg8) {
        if (arg4 == 0) {
            return;
        }
        double var10 = (double) (arg5 & 0xFFFF) * 9.587379924285257E-5D;
        float var12 = (float) Math.sin(var10) * (float) arg4;
        float var13 = (float) Math.cos(var10) * (float) arg4;
        float var14 = (-arg2 * var13 + -arg3 * var12) / 4096.0F + arg0;
        float var15 = (-arg3 * var13 + arg2 * var12) / 4096.0F + arg1;
        float var16 = (((float) this.method632() - arg2) * var13 + -arg3 * var12) / 4096.0F + arg0;
        float var17 = (-((float) this.method632() - arg2) * var12 + -arg3 * var13) / 4096.0F + arg1;
        float var18 = (-arg2 * var13 + ((float) this.method619() - arg3) * var12) / 4096.0F + arg0;
        float var19 = (arg2 * var12 + ((float) this.method619() - arg3) * var13) / 4096.0F + arg1;
        this.method614(var14, var15, var16, var17, var18, var19, arg6, arg7, arg8);
    }

    @OriginalMember(owner = "client!wn", name = "a", descriptor = "(FFIIIII)V", line = 75)
    public final void method629(float arg0, float arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        this.method625(arg0, arg1, (float) this.method632() / 2.0F, (float) this.method619() / 2.0F, arg2, arg3, arg4, arg5, arg6);
    }

    @OriginalMember(owner = "client!wn", name = "a", descriptor = "(FFII)V", line = 78)
    public final void method630(float arg0, float arg1, int arg2, int arg3) {
        this.method625(arg0, arg1, (float) this.method632() / 2.0F, (float) this.method619() / 2.0F, arg2, arg3, 0, 0, 1);
    }

    @OriginalMember(owner = "client!wn", name = "a", descriptor = "(FFFFFFLde;II)V")
    public abstract void method614(float arg0, float arg1, float arg2, float arg3, float arg4, float arg5, class165 arg6, int arg7, int arg8);

    @OriginalMember(owner = "client!wn", name = "a", descriptor = "(IIIII)V")
    public abstract void method617(int arg0, int arg1, int arg2, int arg3, int arg4);

    @OriginalMember(owner = "client!wn", name = "a", descriptor = "(IIIIIII)V")
    public abstract void method618(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6);

    @OriginalMember(owner = "client!wn", name = "a", descriptor = "()I")
    public abstract int method619();

    @OriginalMember(owner = "client!wn", name = "b", descriptor = "(IIII)V")
    public abstract void method621(int arg0, int arg1, int arg2, int arg3);

    @OriginalMember(owner = "client!wn", name = "a", descriptor = "(IIIIII)V")
    public abstract void method622(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5);

    @OriginalMember(owner = "client!wn", name = "a", descriptor = "(IILde;II)V")
    public abstract void method623(int arg0, int arg1, class165 arg2, int arg3, int arg4);

    @OriginalMember(owner = "client!wn", name = "a", descriptor = "(III)V")
    public abstract void method624(int arg0, int arg1, int arg2);

    @OriginalMember(owner = "client!wn", name = "b", descriptor = "(IIIIIII)V")
    public abstract void method627(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6);

    @OriginalMember(owner = "client!wn", name = "b", descriptor = "()I")
    public abstract int method628();

    @OriginalMember(owner = "client!wn", name = "c", descriptor = "()I")
    public abstract int method631();

    @OriginalMember(owner = "client!wn", name = "d", descriptor = "()I")
    public abstract int method632();

    @OriginalMember(owner = "client!wn", name = "a", descriptor = "(FFFFFFIII)V")
    public abstract void method633(float arg0, float arg1, float arg2, float arg3, float arg4, float arg5, int arg6, int arg7, int arg8);
}
