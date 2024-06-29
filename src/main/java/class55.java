import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!wba")
public class class55 {

    @OriginalMember(owner = "client!wba", name = "c", descriptor = "Lbu;")
    public static class21 field707 = new class21(28, 2);

    @OriginalMember(owner = "client!wba", name = "e", descriptor = "I")
    public static int field709 = -1;

    @OriginalMember(owner = "client!wba", name = "a", descriptor = "I")
    public static int field705;

    @OriginalMember(owner = "client!wba", name = "b", descriptor = "I")
    public static int field706;

    @OriginalMember(owner = "client!wba", name = "d", descriptor = "I")
    public static int field708;

    @OriginalMember(owner = "client!wba", name = "a", descriptor = "(B)V", line = 3)
    public static void method385(byte arg0) {
        field707 = null;
        if (arg0 != -117) {
            field709 = -27;
        }
    }

    @OriginalMember(owner = "client!wba", name = "a", descriptor = "(BII)V", line = 16)
    public static final void method386(byte arg0, int arg1, int arg2) {
        field708++;
        if (!class401.method2473((byte) -39)) {
            return;
        }
        if (arg0 <= 98) {
            field705 = -65;
        }
        field709 = arg1;
        if (class449.field6142 != arg2) {
            class459.field6419 = "";
        }
        class449.field6142 = arg2;
        class225.method1539(false, 6);
    }

    @OriginalMember(owner = "client!wba", name = "a", descriptor = "(IIB)Z", line = 49)
    public static final boolean method387(int arg0, int arg1, byte arg2) {
        if (arg2 > -2) {
            return false;
        } else {
            field706++;
            return (arg0 & 0x800) != 0;
        }
    }
}
