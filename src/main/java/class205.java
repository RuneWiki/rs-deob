import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!sn")
public class class205 {

    @OriginalMember(owner = "client!sn", name = "a", descriptor = "I")
    public static int field2951;

    @OriginalMember(owner = "client!sn", name = "b", descriptor = "I")
    public static int field2952;

    @OriginalMember(owner = "client!sn", name = "toString", descriptor = "()Ljava/lang/String;")
    public final String toString() {
        field2951++;
        throw new IllegalStateException();
    }

    @OriginalMember(owner = "client!sn", name = "a", descriptor = "(III)Z")
    public static final boolean method1314(int arg0, int arg1, int arg2) {
        field2952++;
        int var3 = -71 % ((arg2 + 1) / 57);
        return (arg0 & 0x800) != 0;
    }

    @OriginalMember(owner = "client!sn", name = "<init>", descriptor = "(II)V")
    public class205(int arg0, int arg1) {
    }
}
