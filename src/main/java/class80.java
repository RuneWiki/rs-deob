import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!kb")
public abstract class class80 {

    @OriginalMember(owner = "client!kb", name = "a", descriptor = "(II)V", line = 4)
    public final void method722(int arg0, int arg1) {
        this.method730(arg0, arg1, 0, 0, 1);
    }

    @OriginalMember(owner = "client!kb", name = "a", descriptor = "(FFIIIII)V", line = 8)
    public final void method724(float arg0, float arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        this.method727(arg0, arg1, (float) this.method740() / 2.0F, (float) this.method739() / 2.0F, arg2, arg3, arg4, arg5, arg6);
    }

    @OriginalMember(owner = "client!kb", name = "a", descriptor = "(FFFFIILvj;II)V", line = 12)
    public final void method725(float arg0, float arg1, float arg2, float arg3, int arg4, int arg5, class179 arg6, int arg7, int arg8) {
        if (arg4 == 0) {
            return;
        }
        double var10 = (double) (arg5 & 0xFFFF) * 9.587379924285257E-5D;
        float var12 = (float) Math.sin(var10) * (float) arg4;
        float var13 = (float) Math.cos(var10) * (float) arg4;
        float var14 = (-arg2 * var13 + -arg3 * var12) / 4096.0F + arg0;
        float var15 = (-arg3 * var13 + arg2 * var12) / 4096.0F + arg1;
        float var16 = (((float) this.method740() - arg2) * var13 + -arg3 * var12) / 4096.0F + arg0;
        float var17 = (-((float) this.method740() - arg2) * var12 + -arg3 * var13) / 4096.0F + arg1;
        float var18 = (-arg2 * var13 + ((float) this.method739() - arg3) * var12) / 4096.0F + arg0;
        float var19 = (arg2 * var12 + ((float) this.method739() - arg3) * var13) / 4096.0F + arg1;
        this.method732(var14, var15, var16, var17, var18, var19, arg6, arg7, arg8);
    }

    @OriginalMember(owner = "client!kb", name = "a", descriptor = "(FFFFIIIII)V", line = 38)
    private final void method727(float arg0, float arg1, float arg2, float arg3, int arg4, int arg5, int arg6, int arg7, int arg8) {
        if (arg4 == 0) {
            return;
        }
        double var10 = (double) (arg5 & 0xFFFF) * 9.587379924285257E-5D;
        float var12 = (float) Math.sin(var10) * (float) arg4;
        float var13 = (float) Math.cos(var10) * (float) arg4;
        float var14 = (-arg2 * var13 + -arg3 * var12) / 4096.0F + arg0;
        float var15 = (-arg3 * var13 + arg2 * var12) / 4096.0F + arg1;
        float var16 = (((float) this.method740() - arg2) * var13 + -arg3 * var12) / 4096.0F + arg0;
        float var17 = (-((float) this.method740() - arg2) * var12 + -arg3 * var13) / 4096.0F + arg1;
        float var18 = (-arg2 * var13 + ((float) this.method739() - arg3) * var12) / 4096.0F + arg0;
        float var19 = (arg2 * var12 + ((float) this.method739() - arg3) * var13) / 4096.0F + arg1;
        this.method735(var14, var15, var16, var17, var18, var19, arg6, arg7, arg8);
    }

    @OriginalMember(owner = "client!kb", name = "a", descriptor = "(FFII)V", line = 63)
    public final void method728(float arg0, float arg1, int arg2, int arg3) {
        this.method727(arg0, arg1, (float) this.method740() / 2.0F, (float) this.method739() / 2.0F, arg2, arg3, 0, 0, 1);
    }

    @OriginalMember(owner = "client!kb", name = "a", descriptor = "(IIII)V", line = 66)
    public final void method729(int arg0, int arg1, int arg2, int arg3) {
        this.method726(arg0, arg1, arg2, arg3, 0, 0, 1);
    }

    @OriginalMember(owner = "client!kb", name = "a", descriptor = "(FFIILvj;II)V", line = 70)
    public final void method731(float arg0, float arg1, int arg2, int arg3, class179 arg4, int arg5, int arg6) {
        this.method725(arg0, arg1, (float) this.method740() / 2.0F, (float) this.method739() / 2.0F, arg2, arg3, arg4, arg5, arg6);
    }

    @OriginalMember(owner = "client!kb", name = "a", descriptor = "(IILvj;II)V")
    public abstract void method721(int arg0, int arg1, class179 arg2, int arg3, int arg4);

    @OriginalMember(owner = "client!kb", name = "a", descriptor = "()I")
    public abstract int method723();

    @OriginalMember(owner = "client!kb", name = "a", descriptor = "(IIIIIII)V")
    public abstract void method726(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6);

    @OriginalMember(owner = "client!kb", name = "a", descriptor = "(IIIII)V")
    public abstract void method730(int arg0, int arg1, int arg2, int arg3, int arg4);

    @OriginalMember(owner = "client!kb", name = "a", descriptor = "(FFFFFFLvj;II)V")
    public abstract void method732(float arg0, float arg1, float arg2, float arg3, float arg4, float arg5, class179 arg6, int arg7, int arg8);

    @OriginalMember(owner = "client!kb", name = "b", descriptor = "()I")
    public abstract int method733();

    @OriginalMember(owner = "client!kb", name = "a", descriptor = "(III)V")
    public abstract void method734(int arg0, int arg1, int arg2);

    @OriginalMember(owner = "client!kb", name = "a", descriptor = "(FFFFFFIII)V")
    public abstract void method735(float arg0, float arg1, float arg2, float arg3, float arg4, float arg5, int arg6, int arg7, int arg8);

    @OriginalMember(owner = "client!kb", name = "a", descriptor = "(IIIIII)V")
    public abstract void method736(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5);

    @OriginalMember(owner = "client!kb", name = "b", descriptor = "(IIIIIII)V")
    public abstract void method737(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6);

    @OriginalMember(owner = "client!kb", name = "b", descriptor = "(IIII)V")
    public abstract void method738(int arg0, int arg1, int arg2, int arg3);

    @OriginalMember(owner = "client!kb", name = "c", descriptor = "()I")
    public abstract int method739();

    @OriginalMember(owner = "client!kb", name = "d", descriptor = "()I")
    public abstract int method740();
}
