import java.awt.Color;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!mt")
public class class273 {

    @OriginalMember(owner = "client!mt", name = "a", descriptor = "[Ljava/awt/Color;")
    public static Color[] field3638 = new Color[] { new Color(9179409), new Color(16777215) };

    @OriginalMember(owner = "client!mt", name = "g", descriptor = "I")
    public static int field3644 = -1;

    @OriginalMember(owner = "client!mt", name = "b", descriptor = "I")
    public static int field3639;

    @OriginalMember(owner = "client!mt", name = "c", descriptor = "I")
    public static int field3640;

    @OriginalMember(owner = "client!mt", name = "e", descriptor = "I")
    public static int field3642;

    @OriginalMember(owner = "client!mt", name = "f", descriptor = "I")
    public static int field3643;

    @OriginalMember(owner = "client!mt", name = "h", descriptor = "I")
    public static int field3645;

    @OriginalMember(owner = "client!mt", name = "d", descriptor = "Lfo;")
    public static class361 field3641;

    @OriginalMember(owner = "client!mt", name = "a", descriptor = "(I)V", line = 3)
    public static void method1660(int arg0) {
        if (arg0 != -1) {
            method1662(-6, false);
        }
        field3638 = null;
        field3641 = null;
    }

    @OriginalMember(owner = "client!mt", name = "a", descriptor = "(B)V", line = 15)
    public static final void method1661(byte arg0) {
        class40.field429 = new class282[50];
        if (arg0 >= -15) {
            field3638 = null;
        }
        class347.field4621 = 0;
        field3643++;
    }

    @OriginalMember(owner = "client!mt", name = "a", descriptor = "(IZ)I", line = 33)
    public static final int method1662(int arg0, boolean arg1) {
        if (arg1) {
            method1661((byte) 123);
        }
        field3640++;
        return arg0 & 0x7F;
    }

    @OriginalMember(owner = "client!mt", name = "a", descriptor = "(CB)Z", line = 44)
    public static final boolean method1663(char arg0, byte arg1) {
        field3642++;
        if (arg1 <= 91) {
            field3641 = null;
        }
        return arg0 >= '0' && arg0 <= '9' || arg0 >= 'A' && arg0 <= 'Z' || arg0 >= 'a' && arg0 <= 'z';
    }
}
