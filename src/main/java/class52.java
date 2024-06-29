import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!fw")
public class class52 {

    @OriginalMember(owner = "client!fw", name = "d", descriptor = "Z")
    public static boolean field847 = false;

    @OriginalMember(owner = "client!fw", name = "a", descriptor = "Ljava/lang/String;")
    public static String field844 = null;

    @OriginalMember(owner = "client!fw", name = "e", descriptor = "I")
    public static int field848 = 0;

    @OriginalMember(owner = "client!fw", name = "b", descriptor = "I")
    public static int field845;

    @OriginalMember(owner = "client!fw", name = "c", descriptor = "I")
    public static int field846;

    @OriginalMember(owner = "client!fw", name = "a", descriptor = "(Z)V", line = 8)
    public static void method558(boolean arg0) {
        if (arg0) {
            field847 = false;
        }
        field844 = null;
    }

    @OriginalMember(owner = "client!fw", name = "toString", descriptor = "()Ljava/lang/String;", line = 28)
    public final String toString() {
        field846++;
        throw new IllegalStateException();
    }
}
