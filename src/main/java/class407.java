import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!qba")
public class class407 {

    @OriginalMember(owner = "client!qba", name = "a", descriptor = "I")
    public static int field6147;

    @OriginalMember(owner = "client!qba", name = "c", descriptor = "I")
    public static int field6149;

    @OriginalMember(owner = "client!qba", name = "d", descriptor = "I")
    public static int field6150;

    @OriginalMember(owner = "client!qba", name = "b", descriptor = "Ljo;")
    public static class336 field6148;

    @OriginalMember(owner = "client!qba", name = "a", descriptor = "(B)I")
    public static final int method2589(byte arg0) {
        field6147++;
        if (class22.field234 == 1) {
            return class304.field4305;
        } else if (arg0 == -45) {
            return 0;
        } else {
            return 9;
        }
    }

    @OriginalMember(owner = "client!qba", name = "b", descriptor = "(B)I")
    public static final int method2590(byte arg0) {
        if (arg0 < 104) {
            return -27;
        } else {
            field6150++;
            return class547.field7816;
        }
    }

    @OriginalMember(owner = "client!qba", name = "a", descriptor = "(Z)V")
    public static void method2591(boolean arg0) {
        field6148 = null;
        if (!arg0) {
            field6148 = null;
        }
    }

    @OriginalMember(owner = "client!qba", name = "a", descriptor = "(I)V")
    public static final void method2592(int arg0) {
        field6149++;
        if (class218.field3211 == null) {
            return;
        }
        if (arg0 != -2) {
            method2589((byte) -15);
        }
        class218.field3211 = null;
        class235.method1563(100, class128.field1706, class582.field8289, class600.field8491, class304.field4300);
    }
}
