import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!pe")
public class class636 {

    @OriginalMember(owner = "client!pe", name = "d", descriptor = "I")
    public int field8671;

    @OriginalMember(owner = "client!pe", name = "c", descriptor = "I")
    public static int field8670 = 1;

    @OriginalMember(owner = "client!pe", name = "e", descriptor = "Z")
    public static boolean field8672 = false;

    @OriginalMember(owner = "client!pe", name = "b", descriptor = "I")
    public static int field8669;

    @OriginalMember(owner = "client!pe", name = "a", descriptor = "[Ltf;")
    public static class312[] field8668;

    @OriginalMember(owner = "client!pe", name = "a", descriptor = "(I)V", line = 5)
    public static void method3582(int arg0) {
        if (arg0 != 1) {
            field8672 = false;
        }
        field8668 = null;
    }

    @OriginalMember(owner = "client!pe", name = "<init>", descriptor = "(I)V", line = 26)
    public class636(int arg0) {
        this.field8671 = arg0;
    }

    @OriginalMember(owner = "client!pe", name = "toString", descriptor = "()Ljava/lang/String;", line = 34)
    public final String toString() {
        field8669++;
        throw new IllegalStateException();
    }
}
