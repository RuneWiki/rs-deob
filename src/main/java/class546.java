import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!nd")
public class class546 {

    @OriginalMember(owner = "client!nd", name = "a", descriptor = "I")
    public int field7796;

    @OriginalMember(owner = "client!nd", name = "b", descriptor = "I")
    public static int field7797;

    @OriginalMember(owner = "client!nd", name = "c", descriptor = "I")
    public static int field7798;

    @OriginalMember(owner = "client!nd", name = "d", descriptor = "I")
    public static int field7799;

    @OriginalMember(owner = "client!nd", name = "toString", descriptor = "()Ljava/lang/String;", line = 4)
    public final String toString() {
        field7798++;
        throw new IllegalStateException();
    }

    @OriginalMember(owner = "client!nd", name = "a", descriptor = "(IBI)Z", line = 12)
    public static final boolean method3196(int arg0, byte arg1, int arg2) {
        field7799++;
        if (arg1 <= 35) {
            method3197((byte) 24);
        }
        return (arg0 & 0x800) != 0;
    }

    @OriginalMember(owner = "client!nd", name = "a", descriptor = "(B)V", line = 27)
    public static final void method3197(byte arg0) {
        class704.field9884 = null;
        class707.field9960 = null;
        class581.field8252 = false;
        if (arg0 < 21) {
            method3197((byte) -48);
        }
        class21.field226 = null;
        field7797++;
        class531.field7562 = null;
        class624.field8737 = null;
    }

    @OriginalMember(owner = "client!nd", name = "<init>", descriptor = "(II)V", line = 42)
    public class546(int arg0, int arg1) {
        this.field7796 = arg0;
    }
}
