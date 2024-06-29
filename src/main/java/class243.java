import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!jl")
public class class243 {

    @OriginalMember(owner = "client!jl", name = "d", descriptor = "[F")
    public static float[] field3773 = new float[] { 1.0F, 0.0F, 0.0F, 0.0F, 0.0F, 1.0F, 0.0F, 0.0F, 0.0F, 0.0F, 1.0F, 0.0F, 0.0F, 0.0F, 0.0F, 1.0F };

    @OriginalMember(owner = "client!jl", name = "l", descriptor = "[I")
    public static int[] field3781 = new int[3];

    @OriginalMember(owner = "client!jl", name = "r", descriptor = "Ldg;")
    public static class376 field3787 = new class376(36, 16);

    @OriginalMember(owner = "client!jl", name = "s", descriptor = "I")
    public static int field3788 = 0;

    @OriginalMember(owner = "client!jl", name = "t", descriptor = "I")
    public static int field3789 = -1;

    @OriginalMember(owner = "client!jl", name = "a", descriptor = "I")
    public int field3770;

    @OriginalMember(owner = "client!jl", name = "b", descriptor = "I")
    public int field3771;

    @OriginalMember(owner = "client!jl", name = "c", descriptor = "I")
    public static int field3772;

    @OriginalMember(owner = "client!jl", name = "e", descriptor = "I")
    public int field3774;

    @OriginalMember(owner = "client!jl", name = "f", descriptor = "I")
    public int field3775;

    @OriginalMember(owner = "client!jl", name = "g", descriptor = "I")
    public int field3776;

    @OriginalMember(owner = "client!jl", name = "h", descriptor = "I")
    public int field3777;

    @OriginalMember(owner = "client!jl", name = "i", descriptor = "I")
    public int field3778;

    @OriginalMember(owner = "client!jl", name = "j", descriptor = "I")
    public int field3779;

    @OriginalMember(owner = "client!jl", name = "k", descriptor = "I")
    public int field3780;

    @OriginalMember(owner = "client!jl", name = "m", descriptor = "I")
    public static int field3782;

    @OriginalMember(owner = "client!jl", name = "n", descriptor = "I")
    public int field3783;

    @OriginalMember(owner = "client!jl", name = "o", descriptor = "I")
    public int field3784;

    @OriginalMember(owner = "client!jl", name = "p", descriptor = "I")
    public static int field3785;

    @OriginalMember(owner = "client!jl", name = "q", descriptor = "I")
    public int field3786;

    @OriginalMember(owner = "client!jl", name = "a", descriptor = "(B[Ljava/lang/Object;[I)V", line = 6)
    public static final void method1648(byte arg0, Object[] arg1, int[] arg2) {
        class303.method1939(arg0 - 725, arg2.length + -1, 0, arg1, arg2);
        field3785++;
        if (arg0 != 21) {
            method1648((byte) 104, null, null);
        }
    }

    @OriginalMember(owner = "client!jl", name = "a", descriptor = "(FIFIIFFIIIF[BLtk;)V", line = 17)
    public static final void method1649(float arg0, int arg1, float arg2, int arg3, int arg4, float arg5, float arg6, int arg7, int arg8, int arg9, float arg10, byte[] arg11, class312 arg12) {
        for (int var13 = 0; var13 < arg4; var13++) {
            class441.method2613(-117, arg11, arg6, arg9, arg4, arg5, arg10, arg0, arg2, var13, arg1, arg7, arg12, arg3);
            arg1 += arg3 * arg7;
        }
        field3782++;
        if (arg8 > -81) {
            field3788 = 93;
        }
    }

    @OriginalMember(owner = "client!jl", name = "a", descriptor = "(Ljl;I)Z", line = 55)
    public final boolean method1650(class243 arg0, int arg1) {
        field3772++;
        int var3 = 108 / ((81 - arg1) / 40);
        return this.field3778 == arg0.field3778 && this.field3770 == arg0.field3770 && this.field3784 == arg0.field3784;
    }

    @OriginalMember(owner = "client!jl", name = "a", descriptor = "(I)V", line = 69)
    public static void method1651(int arg0) {
        field3787 = null;
        if (arg0 != 8021) {
            field3789 = 13;
        }
        field3773 = null;
        field3781 = null;
    }
}
