import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!wg")
public class class244 {

    @OriginalMember(owner = "client!wg", name = "a", descriptor = "Ldc;")
    private static class37 field4465 = class185.method1233((byte) 86, "wave2:");

    @OriginalMember(owner = "client!wg", name = "c", descriptor = "Ldc;")
    public static class37 field4467 = field4465;

    @OriginalMember(owner = "client!wg", name = "h", descriptor = "Ldc;")
    public static class37 field4472 = field4465;

    @OriginalMember(owner = "client!wg", name = "f", descriptor = "Ldc;")
    private static class37 field4470 = class185.method1233((byte) 86, " is already on your friend list)3");

    @OriginalMember(owner = "client!wg", name = "j", descriptor = "Z")
    public static boolean field4474 = true;

    @OriginalMember(owner = "client!wg", name = "d", descriptor = "Ldc;")
    public static class37 field4468 = field4470;

    @OriginalMember(owner = "client!wg", name = "g", descriptor = "D")
    public static double field4471;

    @OriginalMember(owner = "client!wg", name = "b", descriptor = "I")
    public static int field4466;

    @OriginalMember(owner = "client!wg", name = "e", descriptor = "I")
    public static int field4469;

    @OriginalMember(owner = "client!wg", name = "i", descriptor = "I")
    public static int field4473;

    @OriginalMember(owner = "client!wg", name = "a", descriptor = "(II)Z")
    public static final boolean method1588(int arg0, int arg1) {
        if (arg1 != -26304) {
            method1591((byte) 30);
        }
        field4473++;
        return (arg0 >> 30 & 0x1) != 0;
    }

    @OriginalMember(owner = "client!wg", name = "a", descriptor = "(IIBIIII)V")
    public static final void method1589(int arg0, int arg1, byte arg2, int arg3, int arg4, int arg5, int arg6) {
        if (class29.field536 <= arg3 && arg1 <= class82.field1458 && arg5 >= class198.field3697 && class199.field3712 >= arg4) {
            if (arg6 == 1) {
                class143.method995(arg3, arg5, arg4, arg1, arg0, 8622);
            } else {
                class114.method798(arg4, arg6, arg1, arg3, 28, arg0, arg5);
            }
        } else if (arg6 == 1) {
            class210.method1400((byte) -51, arg0, arg4, arg5, arg3, arg1);
        } else {
            class83.method570(arg3, arg0, 117, arg5, arg6, arg4, arg1);
        }
        field4466++;
        if (arg2 != -40) {
            field4472 = null;
        }
    }

    @OriginalMember(owner = "client!wg", name = "a", descriptor = "(Ldc;Lwa;BLdc;)[Lng;")
    public static final class148[] method1590(class37 arg0, class238 arg1, byte arg2, class37 arg3) {
        field4469++;
        if (arg2 > -65) {
            return null;
        } else {
            int var4 = arg1.method1543(91, arg0);
            int var5 = arg1.method1546(arg3, -84, var4);
            return class156.method1058(var4, arg1, true, var5);
        }
    }

    @OriginalMember(owner = "client!wg", name = "a", descriptor = "(B)V")
    public static void method1591(byte arg0) {
        field4467 = null;
        field4468 = null;
        field4470 = null;
        field4465 = null;
        if (arg0 != -126) {
            method1588(-113, 87);
        }
        field4472 = null;
    }

    @OriginalMember(owner = "client!wg", name = "a", descriptor = "(III)J")
    public static final long method1592(int arg0, int arg1, int arg2) {
        class18 var3 = class180.field3354[arg0][arg1][arg2];
        return var3 == null || var3.field295 == null ? 0L : var3.field295.field2819;
    }
}
