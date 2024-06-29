import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!k")
public class class179 extends class120 {

    @OriginalMember(owner = "client!k", name = "o", descriptor = "I")
    public int field2791;

    @OriginalMember(owner = "client!k", name = "m", descriptor = "I")
    public static int field2789 = -1;

    @OriginalMember(owner = "client!k", name = "q", descriptor = "I")
    public static int field2793 = 0;

    @OriginalMember(owner = "client!k", name = "n", descriptor = "Llf;")
    public static class211 field2790 = new class211(64);

    @OriginalMember(owner = "client!k", name = "l", descriptor = "I")
    public static int field2788;

    @OriginalMember(owner = "client!k", name = "r", descriptor = "I")
    public static int field2794;

    @OriginalMember(owner = "client!k", name = "p", descriptor = "Lqi;")
    public static class129 field2792;

    @OriginalMember(owner = "client!k", name = "a", descriptor = "(B)V")
    public static void method1243(byte arg0) {
        field2790 = null;
        if (arg0 > -121) {
            field2793 = 18;
        }
        field2792 = null;
    }

    @OriginalMember(owner = "client!k", name = "a", descriptor = "(Ldl;III)[Lfg;")
    public static final class12[] method1244(class123 arg0, int arg1, int arg2, int arg3) {
        field2788++;
        if (class214.method1445((byte) 79, arg0, arg3, arg2)) {
            if (arg1 != 64) {
                field2793 = 25;
            }
            return class223.method1523(18);
        } else {
            return null;
        }
    }

    @OriginalMember(owner = "client!k", name = "<init>", descriptor = "()V")
    public class179() {
    }

    @OriginalMember(owner = "client!k", name = "<init>", descriptor = "(I)V")
    public class179(int arg0) {
        this.field2791 = arg0;
    }
}
