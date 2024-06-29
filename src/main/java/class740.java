import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ufa")
public class class740 {

    @OriginalMember(owner = "client!ufa", name = "b", descriptor = "I")
    public static int field10333;

    @OriginalMember(owner = "client!ufa", name = "c", descriptor = "I")
    public static int field10334;

    @OriginalMember(owner = "client!ufa", name = "d", descriptor = "I")
    public static int field10335;

    @OriginalMember(owner = "client!ufa", name = "e", descriptor = "I")
    public static int field10336;

    @OriginalMember(owner = "client!ufa", name = "a", descriptor = "Lhga;")
    public static class300 field10332;

    @OriginalMember(owner = "client!ufa", name = "toString", descriptor = "()Ljava/lang/String;")
    public final String toString() {
        field10334++;
        throw new IllegalStateException();
    }

    @OriginalMember(owner = "client!ufa", name = "a", descriptor = "(I)V")
    public static void method4130(int arg0) {
        if (arg0 == -461) {
            field10332 = null;
        }
    }

    @OriginalMember(owner = "client!ufa", name = "b", descriptor = "(I)[Lmfa;")
    public static final class407[] method4131(int arg0) {
        if (arg0 <= 34) {
            field10333 = -128;
        }
        field10336++;
        return new class407[] { class182.field2509, class71.field1084, class591.field8401 };
    }

    @OriginalMember(owner = "client!ufa", name = "<init>", descriptor = "(II)V")
    public class740(int arg0, int arg1) {
    }
}
