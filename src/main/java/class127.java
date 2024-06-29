import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!oe")
public class class127 {

    @OriginalMember(owner = "client!oe", name = "c", descriptor = "I")
    public int field2054;

    @OriginalMember(owner = "client!oe", name = "e", descriptor = "I")
    private int field2056;

    @OriginalMember(owner = "client!oe", name = "b", descriptor = "Z")
    public static boolean field2053 = false;

    @OriginalMember(owner = "client!oe", name = "a", descriptor = "I")
    public static int field2052;

    @OriginalMember(owner = "client!oe", name = "d", descriptor = "I")
    public static int field2055;

    @OriginalMember(owner = "client!oe", name = "f", descriptor = "I")
    public static int field2057;

    @OriginalMember(owner = "client!oe", name = "toString", descriptor = "()Ljava/lang/String;", line = 13)
    public final String toString() {
        field2055++;
        throw new IllegalStateException();
    }

    @OriginalMember(owner = "client!oe", name = "<init>", descriptor = "(II)V", line = 20)
    public class127(int arg0, int arg1) {
        this.field2054 = arg1;
        this.field2056 = arg0;
    }

    @OriginalMember(owner = "client!oe", name = "a", descriptor = "(I)I", line = 29)
    public final int method865(int arg0) {
        field2052++;
        return arg0 == 97 ? this.field2056 : 35;
    }

    @OriginalMember(owner = "client!oe", name = "a", descriptor = "(CB)Z", line = 43)
    public static final boolean method866(char arg0, byte arg1) {
        field2057++;
        int var2 = 52 % ((80 - arg1) / 43);
        return arg0 >= '0' && arg0 <= '9' || arg0 >= 'A' && arg0 <= 'Z' || arg0 >= 'a' && arg0 <= 'z';
    }
}
