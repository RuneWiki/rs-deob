import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!oo")
public class class629 {

    @OriginalMember(owner = "client!oo", name = "c", descriptor = "Lmia;")
    public static class63 field8790 = new class63(6, 5);

    @OriginalMember(owner = "client!oo", name = "d", descriptor = "I")
    public static int field8791 = 1;

    @OriginalMember(owner = "client!oo", name = "a", descriptor = "I")
    public static int field8788;

    @OriginalMember(owner = "client!oo", name = "b", descriptor = "I")
    public static int field8789;

    @OriginalMember(owner = "client!oo", name = "e", descriptor = "Lge;")
    public static class711 field8792;

    @OriginalMember(owner = "client!oo", name = "a", descriptor = "(B)V", line = 3)
    public static void method3629(byte arg0) {
        field8792 = null;
        if (arg0 < 32) {
            field8790 = null;
        }
        field8790 = null;
    }

    @OriginalMember(owner = "client!oo", name = "a", descriptor = "(III)Z", line = 14)
    public static final boolean method3630(int arg0, int arg1, int arg2) {
        field8788++;
        if (arg0 > -114) {
            return false;
        } else {
            return (arg2 & 0x22) != 0;
        }
    }

    @OriginalMember(owner = "client!oo", name = "toString", descriptor = "()Ljava/lang/String;", line = 34)
    public final String toString() {
        field8789++;
        throw new IllegalStateException();
    }

    @OriginalMember(owner = "client!oo", name = "<init>", descriptor = "(II)V", line = 47)
    public class629(int arg0, int arg1) {
    }
}
