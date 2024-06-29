import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ec")
public class class45 {

    @OriginalMember(owner = "client!ec", name = "c", descriptor = "I")
    public static int field703 = 0;

    @OriginalMember(owner = "client!ec", name = "d", descriptor = "I")
    public static volatile int field704 = -1;

    @OriginalMember(owner = "client!ec", name = "a", descriptor = "I")
    public static int field701;

    @OriginalMember(owner = "client!ec", name = "e", descriptor = "I")
    public static int field705;

    @OriginalMember(owner = "client!ec", name = "f", descriptor = "I")
    public static int field706;

    @OriginalMember(owner = "client!ec", name = "g", descriptor = "I")
    public static int field707;

    @OriginalMember(owner = "client!ec", name = "b", descriptor = "Lpk;")
    public static class120 field702;

    @OriginalMember(owner = "client!ec", name = "a", descriptor = "(Laj;I)Laf;", line = 5)
    public static final class190 method389(class1 arg0, int arg1) {
        field706++;
        class190 var2 = new class190();
        int var3 = -116 % ((-arg1 - 30) / 42);
        var2.field2981 = arg0.method56(19612);
        var2.field2980 = class63.method502(-32769, var2.field2981);
        return var2;
    }

    @OriginalMember(owner = "client!ec", name = "a", descriptor = "(Lpk;Lpk;Z)V", line = 35)
    public static final void method390(class120 arg0, class120 arg1, boolean arg2) {
        class83.field1298 = arg0;
        class78.field1228 = arg1;
        field705++;
        if (arg2) {
            method390((class120) null, (class120) null, true);
        }
    }

    @OriginalMember(owner = "client!ec", name = "a", descriptor = "(I)V", line = 51)
    public static void method391(int arg0) {
        field702 = null;
        if (arg0 <= 65) {
            method391(8);
        }
    }
}
