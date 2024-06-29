import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!aq")
public class class251 {

    @OriginalMember(owner = "client!aq", name = "d", descriptor = "I")
    public static int field3690 = 0;

    @OriginalMember(owner = "client!aq", name = "a", descriptor = "I")
    public static int field3687;

    @OriginalMember(owner = "client!aq", name = "b", descriptor = "I")
    public static int field3688;

    @OriginalMember(owner = "client!aq", name = "c", descriptor = "Lir;")
    public static class185 field3689;

    @OriginalMember(owner = "client!aq", name = "a", descriptor = "(I)V")
    public static void method1639(int arg0) {
        field3689 = null;
        if (arg0 < 102) {
            field3689 = null;
        }
    }

    @OriginalMember(owner = "client!aq", name = "a", descriptor = "(Lir;Lir;B)V")
    public static final void method1640(class185 arg0, class185 arg1, byte arg2) {
        field3688++;
        class188.field2574 = arg0;
        class127.field1662 = arg1;
        if (arg2 < 125) {
            method1639(41);
        }
    }
}
