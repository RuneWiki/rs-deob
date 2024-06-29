import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ub")
public class class301 implements class272 {

    @OriginalMember(owner = "client!ub", name = "b", descriptor = "I")
    public int field4111;

    @OriginalMember(owner = "client!ub", name = "a", descriptor = "J")
    public static volatile long field4110 = 0L;

    @OriginalMember(owner = "client!ub", name = "c", descriptor = "I")
    public static int field4112;

    @OriginalMember(owner = "client!ub", name = "d", descriptor = "I")
    public static int field4113;

    @OriginalMember(owner = "client!ub", name = "e", descriptor = "I")
    public static int field4114;

    @OriginalMember(owner = "client!ub", name = "f", descriptor = "I")
    public static int field4115;

    @OriginalMember(owner = "client!ub", name = "a", descriptor = "(B)Z", line = 6)
    public static final boolean method1749(byte arg0) {
        field4115++;
        if (arg0 < 28) {
            field4110 = -113L;
        }
        return class81.field1144 != class523.field7659 || class136.field2064 >= 2;
    }

    @OriginalMember(owner = "client!ub", name = "<init>", descriptor = "(Ljava/lang/String;I)V", line = 28)
    public class301(String arg0, int arg1) {
        this.field4111 = arg1;
    }

    @OriginalMember(owner = "client!ub", name = "toString", descriptor = "()Ljava/lang/String;", line = 42)
    public final String toString() {
        field4113++;
        throw new IllegalStateException();
    }
}
