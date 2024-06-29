import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!kh")
public abstract class class11 {

    @OriginalMember(owner = "client!kh", name = "a", descriptor = "(FFIILhm;II)V", line = 4)
    public final void method88(float arg0, float arg1, int arg2, int arg3, class121 arg4, int arg5, int arg6) {
        this.method91(arg0, arg1, (float) this.method52() / 2.0F, (float) this.method47() / 2.0F, arg2, arg3, arg4, arg5, arg6);
    }

    @OriginalMember(owner = "client!kh", name = "a", descriptor = "(FFFFIIIII)V", line = 9)
    private final void method89(float arg0, float arg1, float arg2, float arg3, int arg4, int arg5, int arg6, int arg7, int arg8) {
        if (arg4 == 0) {
            return;
        }
        double var10 = (double) (arg5 & 0xFFFF) * 9.587379924285257E-5D;
        float var12 = (float) Math.sin(var10) * (float) arg4;
        float var13 = (float) Math.cos(var10) * (float) arg4;
        float var14 = (-arg2 * var13 + -arg3 * var12) / 4096.0F + arg0;
        float var15 = (-arg3 * var13 + arg2 * var12) / 4096.0F + arg1;
        float var16 = (((float) this.method52() - arg2) * var13 + -arg3 * var12) / 4096.0F + arg0;
        float var17 = (-((float) this.method52() - arg2) * var12 + -arg3 * var13) / 4096.0F + arg1;
        float var18 = (-arg2 * var13 + ((float) this.method47() - arg3) * var12) / 4096.0F + arg0;
        float var19 = (arg2 * var12 + ((float) this.method47() - arg3) * var13) / 4096.0F + arg1;
        this.method43(var14, var15, var16, var17, var18, var19, arg6, arg7, arg8);
    }

    @OriginalMember(owner = "client!kh", name = "a", descriptor = "(II)V", line = 40)
    public final void method90(int arg0, int arg1) {
        this.method40(arg0, arg1, 0, 0, 1);
    }

    @OriginalMember(owner = "client!kh", name = "a", descriptor = "(FFFFIILhm;II)V", line = 43)
    public final void method91(float arg0, float arg1, float arg2, float arg3, int arg4, int arg5, class121 arg6, int arg7, int arg8) {
        if (arg4 == 0) {
            return;
        }
        double var10 = (double) (arg5 & 0xFFFF) * 9.587379924285257E-5D;
        float var12 = (float) Math.sin(var10) * (float) arg4;
        float var13 = (float) Math.cos(var10) * (float) arg4;
        float var14 = (-arg2 * var13 + -arg3 * var12) / 4096.0F + arg0;
        float var15 = (-arg3 * var13 + arg2 * var12) / 4096.0F + arg1;
        float var16 = (((float) this.method52() - arg2) * var13 + -arg3 * var12) / 4096.0F + arg0;
        float var17 = (-((float) this.method52() - arg2) * var12 + -arg3 * var13) / 4096.0F + arg1;
        float var18 = (-arg2 * var13 + ((float) this.method47() - arg3) * var12) / 4096.0F + arg0;
        float var19 = (arg2 * var12 + ((float) this.method47() - arg3) * var13) / 4096.0F + arg1;
        this.method53(var14, var15, var16, var17, var18, var19, arg6, arg7, arg8);
    }

    @OriginalMember(owner = "client!kh", name = "a", descriptor = "(FFIIIII)V", line = 67)
    public final void method92(float arg0, float arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        this.method89(arg0, arg1, (float) this.method52() / 2.0F, (float) this.method47() / 2.0F, arg2, arg3, arg4, arg5, arg6);
    }

    @OriginalMember(owner = "client!kh", name = "b", descriptor = "(IIII)V", line = 79)
    public final void method93(int arg0, int arg1, int arg2, int arg3) {
        this.method46(arg0, arg1, arg2, arg3, 0, 0, 1);
    }

    @OriginalMember(owner = "client!kh", name = "a", descriptor = "(FFII)V", line = 82)
    public final void method94(float arg0, float arg1, int arg2, int arg3) {
        this.method89(arg0, arg1, (float) this.method52() / 2.0F, (float) this.method47() / 2.0F, arg2, arg3, 0, 0, 1);
    }

    @OriginalMember(owner = "client!kh", name = "a", descriptor = "()I")
    public abstract int method52();

    @OriginalMember(owner = "client!kh", name = "a", descriptor = "(IIIIII)V")
    public abstract void method54(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5);

    @OriginalMember(owner = "client!kh", name = "a", descriptor = "(FFFFFFLhm;II)V")
    public abstract void method53(float arg0, float arg1, float arg2, float arg3, float arg4, float arg5, class121 arg6, int arg7, int arg8);

    @OriginalMember(owner = "client!kh", name = "b", descriptor = "()I")
    public abstract int method49();

    @OriginalMember(owner = "client!kh", name = "a", descriptor = "(III)V")
    public abstract void method41(int arg0, int arg1, int arg2);

    @OriginalMember(owner = "client!kh", name = "a", descriptor = "(IIII)V")
    public abstract void method44(int arg0, int arg1, int arg2, int arg3);

    @OriginalMember(owner = "client!kh", name = "a", descriptor = "(IIIIIII)V")
    public abstract void method42(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6);

    @OriginalMember(owner = "client!kh", name = "a", descriptor = "(FFFFFFIII)V")
    public abstract void method43(float arg0, float arg1, float arg2, float arg3, float arg4, float arg5, int arg6, int arg7, int arg8);

    @OriginalMember(owner = "client!kh", name = "b", descriptor = "(IIIIIII)V")
    public abstract void method46(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6);

    @OriginalMember(owner = "client!kh", name = "a", descriptor = "(IILhm;II)V")
    public abstract void method45(int arg0, int arg1, class121 arg2, int arg3, int arg4);

    @OriginalMember(owner = "client!kh", name = "a", descriptor = "(IIIII)V")
    public abstract void method40(int arg0, int arg1, int arg2, int arg3, int arg4);

    @OriginalMember(owner = "client!kh", name = "c", descriptor = "()I")
    public abstract int method47();

    @OriginalMember(owner = "client!kh", name = "d", descriptor = "()I")
    public abstract int method51();
}
