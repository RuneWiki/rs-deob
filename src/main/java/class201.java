import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!iq")
public class class201 {

    @OriginalMember(owner = "client!iq", name = "i", descriptor = "I")
    public static int field2542 = 0;

    @OriginalMember(owner = "client!iq", name = "g", descriptor = "Lae;")
    public static class40 field2540 = new class40();

    @OriginalMember(owner = "client!iq", name = "c", descriptor = "I")
    public static int field2536;

    @OriginalMember(owner = "client!iq", name = "d", descriptor = "I")
    public static int field2537;

    @OriginalMember(owner = "client!iq", name = "f", descriptor = "I")
    public static int field2539;

    @OriginalMember(owner = "client!iq", name = "h", descriptor = "I")
    public static int field2541;

    @OriginalMember(owner = "client!iq", name = "j", descriptor = "I")
    public static int field2543;

    @OriginalMember(owner = "client!iq", name = "a", descriptor = "[B")
    public byte[] field2534;

    @OriginalMember(owner = "client!iq", name = "b", descriptor = "[S")
    public short[] field2535;

    @OriginalMember(owner = "client!iq", name = "e", descriptor = "[S")
    public short[] field2538;

    @OriginalMember(owner = "client!iq", name = "k", descriptor = "[S")
    public short[] field2544;

    @OriginalMember(owner = "client!iq", name = "a", descriptor = "(Z)V", line = 3)
    public static final void method1213(boolean arg0) {
        if (!arg0) {
            method1214((char) 65428, false);
        }
        for (int var1 = 0; var1 < 100; var1++) {
            class233.field2904[var1] = null;
        }
        field2539++;
        class612.field8581 = 0;
    }

    @OriginalMember(owner = "client!iq", name = "a", descriptor = "(CZ)Z", line = 32)
    public static final boolean method1214(char arg0, boolean arg1) {
        if (!arg1) {
            method1213(false);
        }
        field2541++;
        return arg0 >= 'A' && arg0 <= 'Z' || arg0 >= 'a' && arg0 <= 'z';
    }

    @OriginalMember(owner = "client!iq", name = "b", descriptor = "(Z)V", line = 43)
    public static void method1215(boolean arg0) {
        if (arg0) {
            method1213(false);
        }
        field2540 = null;
    }
}
