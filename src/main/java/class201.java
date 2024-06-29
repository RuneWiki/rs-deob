import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!um")
public class class201 {

    @OriginalMember(owner = "client!um", name = "b", descriptor = "Lsd;")
    public static class74 field2786 = new class74(14, 1);

    @OriginalMember(owner = "client!um", name = "e", descriptor = "Z")
    public static boolean field2789;

    @OriginalMember(owner = "client!um", name = "a", descriptor = "I")
    public static int field2785;

    @OriginalMember(owner = "client!um", name = "c", descriptor = "I")
    public static int field2787;

    @OriginalMember(owner = "client!um", name = "d", descriptor = "I")
    public static int field2788;

    @OriginalMember(owner = "client!um", name = "a", descriptor = "(III)V")
    public static final void method1100(int arg0, int arg1, int arg2) {
        field2788++;
        class89 var3 = class146.method695(12, arg0, (byte) -122);
        var3.method449(true);
        if (arg2 < -106) {
            var3.field1106 = arg1;
        }
    }

    @OriginalMember(owner = "client!um", name = "a", descriptor = "(B)V")
    public static final void method1101(byte arg0) {
        if (arg0 != 103) {
            field2786 = null;
        }
        class274.field3912.method1492(class484.field6869, class397.field5643, class121.field1507);
        field2785++;
    }

    @OriginalMember(owner = "client!um", name = "a", descriptor = "(I)V")
    public static void method1102(int arg0) {
        field2786 = null;
        if (arg0 != -13607) {
            field2789 = false;
        }
    }

    static {
        new class40("You can spot a Jagex moderator by the gold crown next to their name.", "Jagex-Mitarbeiter haben eine goldene Krone neben ihrem Namen.", "Vous pouvez reconnaître les modérateurs Jagex à la couronne dorée en regard de leur nom.", "Os moderadores da Jagex são identificados por uma coroa dourada próxima ao \u007fnome.");
        field2789 = false;
    }
}
