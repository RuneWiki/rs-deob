import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!gj")
public abstract class class381 {

    @OriginalMember(owner = "client!gj", name = "a", descriptor = "(II)V", line = 6)
    public final void method2446(int arg0, int arg1) {
        this.method756(arg0, arg1, 0, 0, 1);
    }

    @OriginalMember(owner = "client!gj", name = "a", descriptor = "(FFIIIII)V", line = 14)
    public final void method2447(float arg0, float arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        this.method2451(arg0, arg1, (float) this.method762() / 2.0F, (float) this.method761() / 2.0F, arg2, arg3, arg4, arg5, arg6);
    }

    @OriginalMember(owner = "client!gj", name = "a", descriptor = "(FFII)V", line = 18)
    public final void method2448(float arg0, float arg1, int arg2, int arg3) {
        this.method2451(arg0, arg1, (float) this.method762() / 2.0F, (float) this.method761() / 2.0F, arg2, arg3, 0, 0, 1);
    }

    @OriginalMember(owner = "client!gj", name = "a", descriptor = "(FFIILhb;II)V", line = 21)
    public final void method2449(float arg0, float arg1, int arg2, int arg3, class433 arg4, int arg5, int arg6) {
        this.method2450(arg0, arg1, (float) this.method762() / 2.0F, (float) this.method761() / 2.0F, arg2, arg3, arg4, arg5, arg6);
    }

    @OriginalMember(owner = "client!gj", name = "a", descriptor = "(FFFFIILhb;II)V", line = 29)
    public final void method2450(float arg0, float arg1, float arg2, float arg3, int arg4, int arg5, class433 arg6, int arg7, int arg8) {
        if (arg4 == 0) {
            return;
        }
        double var10 = (double) (arg5 & 0xFFFF) * 9.587379924285257E-5D;
        float var12 = (float) Math.sin(var10) * (float) arg4;
        float var13 = (float) Math.cos(var10) * (float) arg4;
        float var14 = (-arg2 * var13 + -arg3 * var12) / 4096.0F + arg0;
        float var15 = (-arg3 * var13 + arg2 * var12) / 4096.0F + arg1;
        float var16 = (((float) this.method762() - arg2) * var13 + -arg3 * var12) / 4096.0F + arg0;
        float var17 = (-((float) this.method762() - arg2) * var12 + -arg3 * var13) / 4096.0F + arg1;
        float var18 = (-arg2 * var13 + ((float) this.method761() - arg3) * var12) / 4096.0F + arg0;
        float var19 = (arg2 * var12 + ((float) this.method761() - arg3) * var13) / 4096.0F + arg1;
        this.method757(var14, var15, var16, var17, var18, var19, arg6, arg7, arg8);
    }

    @OriginalMember(owner = "client!gj", name = "a", descriptor = "(FFFFIIIII)V", line = 53)
    private final void method2451(float arg0, float arg1, float arg2, float arg3, int arg4, int arg5, int arg6, int arg7, int arg8) {
        if (arg4 == 0) {
            return;
        }
        double var10 = (double) (arg5 & 0xFFFF) * 9.587379924285257E-5D;
        float var12 = (float) Math.sin(var10) * (float) arg4;
        float var13 = (float) Math.cos(var10) * (float) arg4;
        float var14 = (-arg2 * var13 + -arg3 * var12) / 4096.0F + arg0;
        float var15 = (-arg3 * var13 + arg2 * var12) / 4096.0F + arg1;
        float var16 = (((float) this.method762() - arg2) * var13 + -arg3 * var12) / 4096.0F + arg0;
        float var17 = (-((float) this.method762() - arg2) * var12 + -arg3 * var13) / 4096.0F + arg1;
        float var18 = (-arg2 * var13 + ((float) this.method761() - arg3) * var12) / 4096.0F + arg0;
        float var19 = (arg2 * var12 + ((float) this.method761() - arg3) * var13) / 4096.0F + arg1;
        this.method753(var14, var15, var16, var17, var18, var19, arg6, arg7, arg8);
    }

    @OriginalMember(owner = "client!gj", name = "b", descriptor = "(IIII)V", line = 77)
    public final void method2452(int arg0, int arg1, int arg2, int arg3) {
        this.method752(arg0, arg1, arg2, arg3, 0, 0, 1);
    }

    @OriginalMember(owner = "client!gj", name = "a", descriptor = "(IILhb;II)V")
    public abstract void method755(int arg0, int arg1, class433 arg2, int arg3, int arg4);

    @OriginalMember(owner = "client!gj", name = "a", descriptor = "(FFFFFFIII)V")
    public abstract void method753(float arg0, float arg1, float arg2, float arg3, float arg4, float arg5, int arg6, int arg7, int arg8);

    @OriginalMember(owner = "client!gj", name = "a", descriptor = "()I")
    public abstract int method762();

    @OriginalMember(owner = "client!gj", name = "b", descriptor = "()I")
    public abstract int method761();

    @OriginalMember(owner = "client!gj", name = "a", descriptor = "(IIIII)V")
    public abstract void method756(int arg0, int arg1, int arg2, int arg3, int arg4);

    @OriginalMember(owner = "client!gj", name = "a", descriptor = "(FFFFFFLhb;II)V")
    public abstract void method757(float arg0, float arg1, float arg2, float arg3, float arg4, float arg5, class433 arg6, int arg7, int arg8);

    @OriginalMember(owner = "client!gj", name = "a", descriptor = "(III)V")
    public abstract void method764(int arg0, int arg1, int arg2);

    @OriginalMember(owner = "client!gj", name = "a", descriptor = "(IIIIIII)V")
    public abstract void method760(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6);

    @OriginalMember(owner = "client!gj", name = "a", descriptor = "(IIII)V")
    public abstract void method763(int arg0, int arg1, int arg2, int arg3);

    @OriginalMember(owner = "client!gj", name = "a", descriptor = "(IIIIII)V")
    public abstract void method758(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5);

    @OriginalMember(owner = "client!gj", name = "b", descriptor = "(IIIIIII)V")
    public abstract void method752(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6);

    @OriginalMember(owner = "client!gj", name = "c", descriptor = "()I")
    public abstract int method765();

    @OriginalMember(owner = "client!gj", name = "d", descriptor = "()I")
    public abstract int method759();
}
