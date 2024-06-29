import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!lba")
public class class198 {

    @OriginalMember(owner = "client!lba", name = "a", descriptor = "I")
    public static int field2595;

    @OriginalMember(owner = "client!lba", name = "b", descriptor = "I")
    public static int field2596;

    @OriginalMember(owner = "client!lba", name = "c", descriptor = "I")
    public static int field2597;

    @OriginalMember(owner = "client!lba", name = "a", descriptor = "(ZII)Z")
    public static final boolean method1305(boolean arg0, int arg1, int arg2) {
        field2595++;
        if (arg0) {
            return (arg2 & 0x10000) != 0;
        } else {
            return true;
        }
    }

    @OriginalMember(owner = "client!lba", name = "a", descriptor = "(ILoa;)V")
    public static final void method1306(int arg0, class43 arg1) {
        field2596++;
        if (class165.field2055 == class233.field3130.field508 || class483.field6438 == null) {
            return;
        }
        if (class314.method1833((byte) -22, arg1, class233.field3130.field508)) {
            class165.field2055 = class233.field3130.field508;
        }
        if (arg0 == -22) {
            ;
        }
    }
}
