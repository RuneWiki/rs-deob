import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!dda")
public class class367 extends class28 {

    @OriginalMember(owner = "client!dda", name = "u", descriptor = "[I")
    public static int[] field4731 = new int[] { 0, 0, 0, 0, 1, 1, 1, 1, 1, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 3 };

    @OriginalMember(owner = "client!dda", name = "v", descriptor = "I")
    public static int field4732;

    @OriginalMember(owner = "client!dda", name = "w", descriptor = "I")
    public static int field4733;

    @OriginalMember(owner = "client!dda", name = "x", descriptor = "I")
    public static int field4734;

    @OriginalMember(owner = "client!dda", name = "y", descriptor = "I")
    public int field4735;

    @OriginalMember(owner = "client!dda", name = "z", descriptor = "I")
    public int field4736;

    @OriginalMember(owner = "client!dda", name = "A", descriptor = "I")
    public static int field4737;

    @OriginalMember(owner = "client!dda", name = "B", descriptor = "I")
    public static int field4738;

    @OriginalMember(owner = "client!dda", name = "D", descriptor = "I")
    public static int field4740;

    @OriginalMember(owner = "client!dda", name = "E", descriptor = "I")
    public static int field4741;

    @OriginalMember(owner = "client!dda", name = "F", descriptor = "I")
    public int field4742;

    @OriginalMember(owner = "client!dda", name = "C", descriptor = "Ljava/lang/String;")
    public String field4739;

    @OriginalMember(owner = "client!dda", name = "a", descriptor = "(Z)I")
    public final int method2108(boolean arg0) {
        ++field4734;
        if (arg0) {
            this.field4735 = 32;
        }
        return (int) (super.field5499 >>> 32 & 255L);
    }

    @OriginalMember(owner = "client!dda", name = "a", descriptor = "(B)J")
    public final long method2109(byte arg0) {
        ++field4737;
        int var2 = -27 % ((-31 - arg0) / 43);
        return super.field437 & Long.MAX_VALUE;
    }

    @OriginalMember(owner = "client!dda", name = "c", descriptor = "(I)V")
    public static void method2110(int arg0) {
        if (arg0 < 44) {
            field4731 = null;
        }
        field4731 = null;
    }

    @OriginalMember(owner = "client!dda", name = "a", descriptor = "(ILjava/lang/String;)I")
    public static final int method2111(int arg0, String arg1) {
        if (arg0 != 2) {
            return -73;
        } else {
            ++field4732;
            return 1 + arg1.length();
        }
    }

    @OriginalMember(owner = "client!dda", name = "a", descriptor = "(IIZIIIIIZ)Z")
    public static final boolean method2112(int arg0, int arg1, boolean arg2, int arg3, int arg4, int arg5, int arg6, int arg7, boolean arg8) {
        ++field4738;
        int var9 = class233.field3130.field3030[0];
        int var10 = class233.field3130.field3039[0];
        if (var9 >= 0 && ~class611.field8258 < ~var9 && var10 >= 0 && class656.field9155 > var10) {
            if (arg4 >= 0 && arg4 < class611.field8258 && arg3 >= 0 && ~arg3 > ~class656.field9155) {
                int var11 = class234.method1484(arg4, arg7, arg5, class652.field9065, arg3, arg1, arg0, class690.field9429, arg6, arg2, class703.field9806[class233.field3130.field508], var9, var10, class233.field3130.method1265(94), -20943);
                if (!arg8) {
                    field4731 = null;
                }
                if (~var11 > -2) {
                    return false;
                } else {
                    class199.field2598 = class652.field9065[var11 + -1];
                    class247.field3310 = class690.field9429[var11 + -1];
                    class49.field689 = false;
                    class669.method3665(15);
                    return true;
                }
            } else {
                return false;
            }
        } else {
            return false;
        }
    }

    @OriginalMember(owner = "client!dda", name = "h", descriptor = "(I)V")
    public final void method2113(int arg0) {
        super.field437 = super.field437 & Long.MIN_VALUE | class584.method3191(1) + 500L;
        int var2 = -43 / ((-43 - arg0) / 58);
        ++field4740;
        class357.field4620.method890((byte) -22, this);
    }

    @OriginalMember(owner = "client!dda", name = "i", descriptor = "(I)I")
    public final int method2114(int arg0) {
        ++field4741;
        if (arg0 != 0) {
            this.method2109((byte) -42);
        }
        return (int) super.field5499;
    }

    @OriginalMember(owner = "client!dda", name = "<init>", descriptor = "(II)V")
    public class367(int arg0, int arg1) {
        super.field5499 = (long) arg0 << 32 | (long) arg1;
    }

    @OriginalMember(owner = "client!dda", name = "j", descriptor = "(I)V")
    public final void method2115(int arg0) {
        super.field437 |= Long.MIN_VALUE;
        if (arg0 == 1) {
            ++field4733;
            if (this.method2109((byte) -108) == 0L) {
                class457.field5988.method890((byte) -99, this);
            }
        }
    }
}
