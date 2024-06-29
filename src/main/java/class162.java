import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ib")
public class class162 extends class233 {

    @OriginalMember(owner = "client!ib", name = "s", descriptor = "I")
    private int field2640;

    @OriginalMember(owner = "client!ib", name = "t", descriptor = "I")
    private int field2641;

    @OriginalMember(owner = "client!ib", name = "o", descriptor = "I")
    private int field2636;

    @OriginalMember(owner = "client!ib", name = "A", descriptor = "I")
    private int field2648;

    @OriginalMember(owner = "client!ib", name = "z", descriptor = "I")
    public static int field2647 = 0;

    @OriginalMember(owner = "client!ib", name = "p", descriptor = "I")
    public static int field2637 = 1;

    @OriginalMember(owner = "client!ib", name = "B", descriptor = "I")
    public static int field2649 = -1;

    @OriginalMember(owner = "client!ib", name = "q", descriptor = "I")
    public static int field2638;

    @OriginalMember(owner = "client!ib", name = "u", descriptor = "I")
    public static int field2642;

    @OriginalMember(owner = "client!ib", name = "v", descriptor = "I")
    public static int field2643;

    @OriginalMember(owner = "client!ib", name = "w", descriptor = "I")
    public static int field2644;

    @OriginalMember(owner = "client!ib", name = "x", descriptor = "I")
    public static int field2645;

    @OriginalMember(owner = "client!ib", name = "y", descriptor = "Lae;")
    public static class180 field2646;

    @OriginalMember(owner = "client!ib", name = "r", descriptor = "[Lag;")
    public static class197[] field2639;

    @OriginalMember(owner = "client!ib", name = "a", descriptor = "(IIZ)V")
    public final void method282(int arg0, int arg1, boolean arg2) {
        ++field2638;
        int var4 = this.field2641 * arg1 >> 12;
        int var5 = this.field2648 * arg1 >> 12;
        int var6 = this.field2640 * arg0 >> 12;
        if (!arg2) {
            this.field2648 = -127;
        }
        int var7 = this.field2636 * arg0 >> 12;
        class217.method1486(var5, var7, var6, var4, (byte) 3, super.field3648);
    }

    @OriginalMember(owner = "client!ib", name = "<init>", descriptor = "(IIIIIII)V")
    public class162(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        super(arg4, arg5, arg6);
        this.field2640 = arg1;
        this.field2641 = arg0;
        this.field2636 = arg3;
        this.field2648 = arg2;
    }

    @OriginalMember(owner = "client!ib", name = "a", descriptor = "(BI)V")
    public static final void method1112(byte arg0, int arg1) {
        ++field2642;
        class74 var2 = (class74) class57.field829.method371(-110, (long) arg1);
        if (var2 != null) {
            if (arg0 == 109) {
                var2.method952((byte) 127);
            }
        }
    }

    @OriginalMember(owner = "client!ib", name = "a", descriptor = "(III)V")
    public final void method279(int arg0, int arg1, int arg2) {
        ++field2644;
        int var4 = this.field2641 * arg1 >> 12;
        if (arg0 > -121) {
            this.field2641 = -5;
        }
        int var5 = this.field2636 * arg2 >> 12;
        int var6 = this.field2648 * arg1 >> 12;
        int var7 = this.field2640 * arg2 >> 12;
        class12.method96(-32403, var5, super.field3648, var6, super.field3641, super.field3639, var7, var4);
    }

    @OriginalMember(owner = "client!ib", name = "a", descriptor = "(IBI)V")
    public final void method281(int arg0, byte arg1, int arg2) {
        ++field2643;
        int var4 = 112 / ((-43 - arg1) / 49);
    }

    @OriginalMember(owner = "client!ib", name = "b", descriptor = "(I)V")
    public static void method1113(int arg0) {
        field2639 = null;
        int var1 = -11 / ((77 - arg0) / 49);
        field2646 = null;
    }

    @OriginalMember(owner = "client!ib", name = "a", descriptor = "(BLjava/lang/String;)J")
    public static final long method1114(byte arg0, String arg1) {
        ++field2645;
        if (arg0 > -110) {
            field2646 = null;
        }
        long var2 = 0L;
        int var4 = arg1.length();
        for (int var5 = 0; var4 > var5; ++var5) {
            var2 *= 37L;
            char var6 = arg1.charAt(var5);
            if (var6 >= 'A' && ~var6 >= -91) {
                var2 += (long) (var6 + -64);
            } else if (~var6 <= -98 && ~var6 >= -123) {
                var2 += (long) (var6 + -97 + 1);
            } else if (var6 >= '0' && ~var6 >= -58) {
                var2 += (long) (var6 + -48 + 27);
            }
            if (var2 >= 177917621779460413L) {
                break;
            }
        }
        while (~(var2 % 37L) == -1L && var2 != 0L) {
            var2 /= 37L;
        }
        return var2;
    }
}
