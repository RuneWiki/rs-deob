import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!uk")
public class class263 {

    @OriginalMember(owner = "client!uk", name = "b", descriptor = "I")
    public int field3673;

    @OriginalMember(owner = "client!uk", name = "c", descriptor = "I")
    public static int field3674 = 0;

    @OriginalMember(owner = "client!uk", name = "a", descriptor = "I")
    public static int field3672;

    @OriginalMember(owner = "client!uk", name = "d", descriptor = "I")
    public static int field3675;

    @OriginalMember(owner = "client!uk", name = "e", descriptor = "I")
    public static int field3676;

    @OriginalMember(owner = "client!uk", name = "a", descriptor = "(I)Z", line = 15)
    public static final boolean method1598(int arg0) {
        field3675++;
        if (arg0 != -1) {
            method1598(29);
        }
        return class181.field2730 > 0;
    }

    @OriginalMember(owner = "client!uk", name = "toString", descriptor = "()Ljava/lang/String;", line = 27)
    public final String toString() {
        field3672++;
        throw new IllegalStateException();
    }

    @OriginalMember(owner = "client!uk", name = "<init>", descriptor = "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;I)V", line = 36)
    public class263(String arg0, String arg1, String arg2, int arg3) {
        this.field3673 = arg3;
    }
}
