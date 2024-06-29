import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!rl")
public class class263 extends class225 {

    @OriginalMember(owner = "client!rl", name = "D", descriptor = "Lcr;")
    public static class189 field3816 = new class189(64);

    @OriginalMember(owner = "client!rl", name = "G", descriptor = "I")
    public static int field3819 = 0;

    @OriginalMember(owner = "client!rl", name = "F", descriptor = "I")
    public static int field3818 = 0;

    @OriginalMember(owner = "client!rl", name = "J", descriptor = "Z")
    public static boolean field3821 = false;

    @OriginalMember(owner = "client!rl", name = "w", descriptor = "I")
    public int field3809;

    @OriginalMember(owner = "client!rl", name = "x", descriptor = "I")
    public static int field3810;

    @OriginalMember(owner = "client!rl", name = "y", descriptor = "I")
    public static int field3811;

    @OriginalMember(owner = "client!rl", name = "A", descriptor = "I")
    public int field3813;

    @OriginalMember(owner = "client!rl", name = "B", descriptor = "I")
    public static int field3814;

    @OriginalMember(owner = "client!rl", name = "C", descriptor = "I")
    public static int field3815;

    @OriginalMember(owner = "client!rl", name = "E", descriptor = "I")
    public static int field3817;

    @OriginalMember(owner = "client!rl", name = "I", descriptor = "I")
    public int field3820;

    @OriginalMember(owner = "client!rl", name = "z", descriptor = "Ljava/lang/String;")
    public String field3812;

    @OriginalMember(owner = "client!rl", name = "e", descriptor = "(I)V", line = 8)
    public static void method1805(int arg0) {
        int var1 = -46 / ((80 - arg0) / 36);
        field3816 = null;
    }

    @OriginalMember(owner = "client!rl", name = "b", descriptor = "(Z)V", line = 19)
    public final void method1806(boolean arg0) {
        ++field3810;
        super.field2962 = class114.method735(105) + 500L | Long.MIN_VALUE & super.field2962;
        class163.field2182.method2245(this, (byte) -76);
        if (arg0) {
            field3816 = null;
        }
    }

    @OriginalMember(owner = "client!rl", name = "d", descriptor = "(B)V", line = 33)
    public final void method1807(byte arg0) {
        ++field3817;
        super.field2962 |= Long.MIN_VALUE;
        if (this.method1810(-10472) == 0L) {
            class253.field3492.method2245(this, (byte) -128);
        }
        if (arg0 >= -119) {
            method1805(-73);
        }
    }

    @OriginalMember(owner = "client!rl", name = "f", descriptor = "(I)I", line = 51)
    public final int method1808(int arg0) {
        ++field3815;
        return arg0 < 92 ? 107 : (int) super.field640;
    }

    @OriginalMember(owner = "client!rl", name = "g", descriptor = "(I)I", line = 62)
    public final int method1809(int arg0) {
        ++field3814;
        if (arg0 != 0) {
            this.method1809(-125);
        }
        return (int) (255L & super.field640 >>> 32);
    }

    @OriginalMember(owner = "client!rl", name = "h", descriptor = "(I)J", line = 77)
    public final long method1810(int arg0) {
        ++field3811;
        if (arg0 != -10472) {
            field3818 = 64;
        }
        return Long.MAX_VALUE & super.field2962;
    }

    @OriginalMember(owner = "client!rl", name = "<init>", descriptor = "(II)V", line = 103)
    public class263(int arg0, int arg1) {
        super.field640 = (long) arg1 | (long) arg0 << 32;
    }
}
