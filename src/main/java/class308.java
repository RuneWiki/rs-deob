import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ff")
public class class308 {

    @OriginalMember(owner = "client!ff", name = "a", descriptor = "I")
    public int field4450;

    @OriginalMember(owner = "client!ff", name = "c", descriptor = "B")
    public static byte field4452 = -6;

    @OriginalMember(owner = "client!ff", name = "d", descriptor = "I")
    public static int field4453;

    @OriginalMember(owner = "client!ff", name = "b", descriptor = "Ljava/lang/Thread;")
    public static Thread field4451;

    @OriginalMember(owner = "client!ff", name = "toString", descriptor = "()Ljava/lang/String;", line = 3)
    public final String toString() {
        field4453++;
        throw new IllegalStateException();
    }

    @OriginalMember(owner = "client!ff", name = "a", descriptor = "(B)V", line = 16)
    public static void method1999(byte arg0) {
        if (arg0 < 75) {
            method1999((byte) 93);
        }
        field4451 = null;
    }

    @OriginalMember(owner = "client!ff", name = "<init>", descriptor = "(II)V", line = 31)
    public class308(int arg0, int arg1) {
        this.field4450 = arg0;
    }
}
