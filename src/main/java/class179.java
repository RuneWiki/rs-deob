import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!cw")
public class class179 {

    @OriginalMember(owner = "client!cw", name = "a", descriptor = "I")
    public int field2572;

    @OriginalMember(owner = "client!cw", name = "b", descriptor = "Ljava/lang/String;")
    public String field2573;

    @OriginalMember(owner = "client!cw", name = "f", descriptor = "I")
    public static int field2577 = 1401;

    @OriginalMember(owner = "client!cw", name = "c", descriptor = "I")
    public static int field2574;

    @OriginalMember(owner = "client!cw", name = "d", descriptor = "I")
    public static int field2575;

    @OriginalMember(owner = "client!cw", name = "e", descriptor = "I")
    public static int field2576;

    @OriginalMember(owner = "client!cw", name = "g", descriptor = "I")
    public static int field2578;

    @OriginalMember(owner = "client!cw", name = "a", descriptor = "(IB)I", line = 8)
    public static final int method1289(int arg0, byte arg1) {
        if (arg1 != -116) {
            field2577 = 118;
        }
        field2575++;
        return arg0 >>> 8;
    }

    @OriginalMember(owner = "client!cw", name = "toString", descriptor = "()Ljava/lang/String;", line = 20)
    public final String toString() {
        field2574++;
        throw new IllegalStateException();
    }

    @OriginalMember(owner = "client!cw", name = "<init>", descriptor = "(Ljava/lang/String;I)V", line = 34)
    public class179(String arg0, int arg1) {
        this.field2572 = arg1;
        this.field2573 = arg0;
    }
}
