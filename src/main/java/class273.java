import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!oca")
public class class273 extends class498 {

    @OriginalMember(owner = "client!oca", name = "r", descriptor = "I")
    private int field3811;

    @OriginalMember(owner = "client!oca", name = "l", descriptor = "I")
    private int field3805;

    @OriginalMember(owner = "client!oca", name = "m", descriptor = "I")
    private int field3806;

    @OriginalMember(owner = "client!oca", name = "w", descriptor = "I")
    private int field3816;

    @OriginalMember(owner = "client!oca", name = "p", descriptor = "Lke;")
    public static class622 field3809 = new class622(60, 0);

    @OriginalMember(owner = "client!oca", name = "t", descriptor = "I")
    public static int field3813 = 0;

    @OriginalMember(owner = "client!oca", name = "v", descriptor = "Lwq;")
    public static class176 field3815 = null;

    @OriginalMember(owner = "client!oca", name = "s", descriptor = "I")
    public static int field3812 = 0;

    @OriginalMember(owner = "client!oca", name = "k", descriptor = "I")
    public static int field3804;

    @OriginalMember(owner = "client!oca", name = "n", descriptor = "I")
    public static int field3807;

    @OriginalMember(owner = "client!oca", name = "o", descriptor = "I")
    public static int field3808;

    @OriginalMember(owner = "client!oca", name = "q", descriptor = "I")
    public static int field3810;

    @OriginalMember(owner = "client!oca", name = "u", descriptor = "Lot;")
    public static class614 field3814;

    @OriginalMember(owner = "client!oca", name = "b", descriptor = "(Z)V")
    public static void method1773(boolean arg0) {
        field3815 = null;
        if (!arg0) {
            field3809 = null;
        }
        field3809 = null;
        field3814 = null;
    }

    @OriginalMember(owner = "client!oca", name = "<init>", descriptor = "(IIIIIII)V")
    public class273(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        super(arg4, arg5, arg6);
        this.field3811 = arg0;
        this.field3805 = arg2;
        this.field3806 = arg3;
        this.field3816 = arg1;
    }

    @OriginalMember(owner = "client!oca", name = "a", descriptor = "(III)V")
    public final void method160(int arg0, int arg1, int arg2) {
        ++field3807;
        int var4 = this.field3811 * arg2 >> 12;
        int var5 = this.field3805 * arg2 >> 12;
        if (arg0 != -1) {
            this.method160(111, 56, -56);
        }
        int var6 = this.field3816 * arg1 >> 12;
        int var7 = this.field3806 * arg1 >> 12;
        class739.method4138(var5, (byte) -90, super.field7075, var4, var7, var6);
    }

    @OriginalMember(owner = "client!oca", name = "b", descriptor = "(III)V")
    public final void method159(int arg0, int arg1, int arg2) {
        ++field3810;
        if (arg2 >= -37) {
            field3809 = null;
        }
    }

    @OriginalMember(owner = "client!oca", name = "a", descriptor = "(BII)V")
    public final void method157(byte arg0, int arg1, int arg2) {
        ++field3808;
        int var4 = this.field3811 * arg1 >> 12;
        int var5 = -42 / ((53 - arg0) / 49);
        int var6 = this.field3805 * arg1 >> 12;
        int var7 = this.field3816 * arg2 >> 12;
        int var8 = this.field3806 * arg2 >> 12;
        class21.method161(var4, (byte) 93, var8, super.field7074, var7, super.field7075, super.field7081, var6);
    }
}
