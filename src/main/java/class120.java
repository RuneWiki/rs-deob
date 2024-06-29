import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!nd")
public class class120 {

    @OriginalMember(owner = "client!nd", name = "d", descriptor = "Lcd;")
    private static class23 field2499 = class54.method414(" has logged in)3", -1);

    @OriginalMember(owner = "client!nd", name = "e", descriptor = "Lcd;")
    public static class23 field2500 = field2499;

    @OriginalMember(owner = "client!nd", name = "b", descriptor = "Lcd;")
    public static class23 field2497 = class54.method414("Lade Konfiguration )2 ", -1);

    @OriginalMember(owner = "client!nd", name = "f", descriptor = "Lcd;")
    public static class23 field2501 = class54.method414("mn", -1);

    @OriginalMember(owner = "client!nd", name = "a", descriptor = "I")
    public static int field2496;

    @OriginalMember(owner = "client!nd", name = "c", descriptor = "I")
    public static int field2498;

    @OriginalMember(owner = "client!nd", name = "a", descriptor = "(Lkh;III)[Lea;")
    public static final class38[] method748(class97 arg0, int arg1, int arg2, int arg3) {
        field2496++;
        if (arg1 == 1) {
            return class124.method765(arg2, arg3, (byte) 69, arg0) ? class155.method955(arg1 ^ 0x1) : null;
        } else {
            return null;
        }
    }

    @OriginalMember(owner = "client!nd", name = "a", descriptor = "(I)V")
    public static void method749(int arg0) {
        field2499 = null;
        field2500 = null;
        if (arg0 == -1) {
            field2497 = null;
            field2501 = null;
        }
    }

    @OriginalMember(owner = "client!nd", name = "a", descriptor = "(IIB)I")
    public static final int method750(int arg0, int arg1, byte arg2) {
        field2498++;
        if (arg2 <= 12) {
            field2500 = null;
        }
        int var3 = 1;
        while (arg0 > 1) {
            if ((arg0 & 0x1) != 0) {
                var3 = arg1 * var3;
            }
            arg0 >>= 0x1;
            arg1 *= arg1;
        }
        if (arg0 == 1) {
            return arg1 * var3;
        } else {
            return var3;
        }
    }
}
