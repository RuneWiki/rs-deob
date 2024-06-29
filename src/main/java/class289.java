import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!jm")
public class class289 {

    @OriginalMember(owner = "client!jm", name = "d", descriptor = "Lpi;")
    public static class201 field4618 = new class201(64);

    @OriginalMember(owner = "client!jm", name = "a", descriptor = "I")
    public static int field4615;

    @OriginalMember(owner = "client!jm", name = "b", descriptor = "I")
    public static int field4616;

    @OriginalMember(owner = "client!jm", name = "c", descriptor = "I")
    public static int field4617;

    @OriginalMember(owner = "client!jm", name = "e", descriptor = "I")
    public static int field4619;

    @OriginalMember(owner = "client!jm", name = "g", descriptor = "I")
    public static int field4621;

    @OriginalMember(owner = "client!jm", name = "f", descriptor = "Lri;")
    public static class41 field4620;

    @OriginalMember(owner = "client!jm", name = "a", descriptor = "(I)V")
    public static void method1971(int arg0) {
        if (arg0 != -25502) {
            method1973((class270) null, (class270) null, (byte) 65, (class270) null);
        }
        field4618 = null;
        field4620 = null;
    }

    @OriginalMember(owner = "client!jm", name = "a", descriptor = "(IBII)I")
    public static final int method1972(int arg0, byte arg1, int arg2, int arg3) {
        field4619++;
        if (arg1 != 122) {
            return 116;
        } else if (arg2 < arg0) {
            return arg0;
        } else if (arg2 <= arg3) {
            return arg2;
        } else {
            return arg3;
        }
    }

    @OriginalMember(owner = "client!jm", name = "a", descriptor = "(Llc;Llc;BLlc;)V")
    public static final void method1973(class270 arg0, class270 arg1, byte arg2, class270 arg3) {
        class286.field4585 = arg1;
        class39.field513 = arg0;
        class142.field2309 = arg3;
        field4616++;
        if (arg2 != 101) {
            method1973((class270) null, (class270) null, (byte) -56, (class270) null);
        }
    }
}
