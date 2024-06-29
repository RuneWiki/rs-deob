import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!sa")
public class class748 {

    @OriginalMember(owner = "client!sa", name = "h", descriptor = "F")
    public static float field10471 = 0.0F;

    @OriginalMember(owner = "client!sa", name = "a", descriptor = "I")
    public static int field10464;

    @OriginalMember(owner = "client!sa", name = "b", descriptor = "I")
    public static int field10465;

    @OriginalMember(owner = "client!sa", name = "c", descriptor = "I")
    public static int field10466;

    @OriginalMember(owner = "client!sa", name = "d", descriptor = "I")
    public static int field10467;

    @OriginalMember(owner = "client!sa", name = "f", descriptor = "I")
    public static int field10469;

    @OriginalMember(owner = "client!sa", name = "g", descriptor = "I")
    public int field10470;

    @OriginalMember(owner = "client!sa", name = "i", descriptor = "I")
    public int field10472;

    @OriginalMember(owner = "client!sa", name = "j", descriptor = "I")
    public int field10473;

    @OriginalMember(owner = "client!sa", name = "e", descriptor = "Ltn;")
    public static class179 field10468;

    @OriginalMember(owner = "client!sa", name = "a", descriptor = "(JJ)J", line = 4)
    public static long method4180(long arg0, long arg1) {
        return arg0 ^ arg1;
    }

    @OriginalMember(owner = "client!sa", name = "a", descriptor = "(ILtn;)V", line = 12)
    public final void method4181(int arg0, class179 arg1) {
        while (true) {
            int var3 = arg1.method1094(255);
            if (var3 == 0) {
                int var4 = 33 % ((arg0 - 55) / 42);
                field10467++;
                return;
            }
            this.method4182(var3, arg1, -2);
        }
    }

    @OriginalMember(owner = "client!sa", name = "a", descriptor = "(ILtn;I)V", line = 35)
    private final void method4182(int arg0, class179 arg1, int arg2) {
        field10464++;
        if (~arg0 == arg2) {
            this.field10472 = arg1.method1107(false);
            this.field10473 = arg1.method1094(255);
            this.field10470 = arg1.method1094(255);
        }
    }

    @OriginalMember(owner = "client!sa", name = "a", descriptor = "(II)V", line = 55)
    public static final void method4183(int arg0, int arg1) {
        field10465++;
        class548 var2 = class696.method3872(arg0, arg1, -1633381944);
        var2.method3127((byte) 118);
    }

    @OriginalMember(owner = "client!sa", name = "a", descriptor = "(III)Z", line = 66)
    public static final boolean method4184(int arg0, int arg1, int arg2) {
        field10469++;
        if (arg2 == 0) {
            return (arg1 & 0x10) != 0;
        } else {
            return true;
        }
    }

    @OriginalMember(owner = "client!sa", name = "a", descriptor = "(I)V", line = 77)
    public static void method4185(int arg0) {
        if (arg0 > 0) {
            field10466 = 73;
        }
        field10468 = null;
    }
}
