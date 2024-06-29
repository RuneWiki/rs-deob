import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!hh")
public class class117 {

    @OriginalMember(owner = "client!hh", name = "d", descriptor = "I")
    public static int field2105 = 0;

    @OriginalMember(owner = "client!hh", name = "f", descriptor = "Lp;")
    public static class280 field2107 = class18.method140((byte) -119, "headicons_prayer");

    @OriginalMember(owner = "client!hh", name = "g", descriptor = "I")
    public static int field2108 = -1;

    @OriginalMember(owner = "client!hh", name = "c", descriptor = "I")
    public static int field2104 = 0;

    @OriginalMember(owner = "client!hh", name = "a", descriptor = "I")
    public static int field2102;

    @OriginalMember(owner = "client!hh", name = "b", descriptor = "I")
    public static int field2103;

    @OriginalMember(owner = "client!hh", name = "h", descriptor = "I")
    public static int field2109;

    @OriginalMember(owner = "client!hh", name = "e", descriptor = "[I")
    public static int[] field2106;

    @OriginalMember(owner = "client!hh", name = "a", descriptor = "(I)V")
    public static void method841(int arg0) {
        field2106 = null;
        field2107 = null;
        if (arg0 != -1) {
            field2106 = null;
        }
    }

    @OriginalMember(owner = "client!hh", name = "a", descriptor = "(IB)V")
    public static final void method842(int arg0, byte arg1) {
        if (arg1 > -63) {
            field2104 = -80;
        }
        class97.field1558 = -1;
        class97.field1558 = -1;
        if (arg0 == 37) {
            class53.field866 = 3.0F;
        } else if (arg0 == 50) {
            class53.field866 = 4.0F;
        } else if (arg0 == 75) {
            class53.field866 = 6.0F;
        } else if (arg0 == 100) {
            class53.field866 = 8.0F;
        } else if (arg0 == 200) {
            class53.field866 = 16.0F;
        }
        field2102++;
    }
}
