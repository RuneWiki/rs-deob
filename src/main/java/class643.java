import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ev")
public class class643 {

    @OriginalMember(owner = "client!ev", name = "a", descriptor = "Lhga;")
    public static class158 field9049 = new class158(117, 17);

    @OriginalMember(owner = "client!ev", name = "b", descriptor = "I")
    public static int field9050;

    @OriginalMember(owner = "client!ev", name = "a", descriptor = "(III)Lht;")
    public static final class539 method3728(int arg0, int arg1, int arg2) {
        class252 var3 = class454.field6818[arg0][arg1][arg2];
        return var3 == null || var3.field4025 == null ? null : var3.field4025;
    }

    @OriginalMember(owner = "client!ev", name = "b", descriptor = "(III)Z")
    public static final boolean method3729(int arg0, int arg1, int arg2) {
        if (arg0 != -1) {
            field9049 = null;
        }
        field9050++;
        return (arg1 & 0x21) != 0;
    }

    @OriginalMember(owner = "client!ev", name = "a", descriptor = "(I)V")
    public static void method3730(int arg0) {
        if (arg0 == 117) {
            field9049 = null;
        }
    }
}
