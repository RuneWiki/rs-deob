import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!qd")
public class class278 extends class208 {

    @OriginalMember(owner = "client!qd", name = "s", descriptor = "I")
    private int field3788;

    @OriginalMember(owner = "client!qd", name = "t", descriptor = "I")
    private int field3789;

    @OriginalMember(owner = "client!qd", name = "r", descriptor = "I")
    private int field3787;

    @OriginalMember(owner = "client!qd", name = "m", descriptor = "I")
    private int field3782;

    @OriginalMember(owner = "client!qd", name = "k", descriptor = "I")
    private int field3780;

    @OriginalMember(owner = "client!qd", name = "u", descriptor = "I")
    private int field3790;

    @OriginalMember(owner = "client!qd", name = "e", descriptor = "I")
    private int field3774;

    @OriginalMember(owner = "client!qd", name = "q", descriptor = "I")
    private int field3786;

    @OriginalMember(owner = "client!qd", name = "o", descriptor = "[I")
    public static int[] field3784 = new int[] { 36064, 36065, 36066, 36067, 36068, 36069, 36070, 36071, 36096 };

    @OriginalMember(owner = "client!qd", name = "p", descriptor = "[I")
    public static int[] field3785 = new int[2];

    @OriginalMember(owner = "client!qd", name = "f", descriptor = "[I")
    public static int[] field3775 = new int[32];

    @OriginalMember(owner = "client!qd", name = "n", descriptor = "I")
    public static int field3783 = 1;

    @OriginalMember(owner = "client!qd", name = "d", descriptor = "I")
    public static int field3773 = 16777215;

    @OriginalMember(owner = "client!qd", name = "g", descriptor = "I")
    public static int field3776;

    @OriginalMember(owner = "client!qd", name = "h", descriptor = "I")
    public static int field3777;

    @OriginalMember(owner = "client!qd", name = "i", descriptor = "I")
    public static int field3778;

    @OriginalMember(owner = "client!qd", name = "l", descriptor = "I")
    public static int field3781;

    @OriginalMember(owner = "client!qd", name = "j", descriptor = "[I")
    public static int[] field3779;

    @OriginalMember(owner = "client!qd", name = "a", descriptor = "(III)V")
    public final void method818(int arg0, int arg1, int arg2) {
        ++field3777;
        if (arg2 != 32627) {
            field3775 = null;
        }
    }

    @OriginalMember(owner = "client!qd", name = "b", descriptor = "(III)V")
    public final void method820(int arg0, int arg1, int arg2) {
        ++field3781;
        int var4 = this.field3780 * arg0 >> 12;
        if (arg2 != 31431) {
            method1612(118);
        }
        int var5 = this.field3782 * arg1 >> 12;
        int var6 = this.field3787 * arg0 >> 12;
        int var7 = this.field3788 * arg1 >> 12;
        int var8 = this.field3790 * arg0 >> 12;
        int var9 = this.field3786 * arg1 >> 12;
        int var10 = this.field3774 * arg0 >> 12;
        int var11 = this.field3789 * arg1 >> 12;
        class288.method1652(var7, var5, arg2 ^ 31367, var9, var8, super.field2972, var4, var10, var11, var6);
    }

    @OriginalMember(owner = "client!qd", name = "a", descriptor = "(I)V")
    public static void method1612(int arg0) {
        field3779 = null;
        int var1 = 37 / ((26 - arg0) / 53);
        field3785 = null;
        field3784 = null;
        field3775 = null;
    }

    @OriginalMember(owner = "client!qd", name = "a", descriptor = "(ZII)V")
    public final void method814(boolean arg0, int arg1, int arg2) {
        ++field3776;
        if (arg0) {
            this.method814(false, 79, -8);
        }
    }

    @OriginalMember(owner = "client!qd", name = "<init>", descriptor = "(IIIIIIIIII)V")
    public class278(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9) {
        super(-1, arg8, arg9);
        this.field3788 = arg3;
        this.field3789 = arg7;
        this.field3787 = arg2;
        this.field3782 = arg1;
        this.field3780 = arg0;
        this.field3790 = arg4;
        this.field3774 = arg6;
        this.field3786 = arg5;
    }
}
