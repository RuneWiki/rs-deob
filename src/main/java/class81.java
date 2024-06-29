import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!jv")
public class class81 {

    @OriginalMember(owner = "client!jv", name = "a", descriptor = "I")
    public static int field1110 = 0;

    @OriginalMember(owner = "client!jv", name = "b", descriptor = "[I")
    public static int[] field1111 = new int[1000];

    @OriginalMember(owner = "client!jv", name = "d", descriptor = "Z")
    public static boolean field1113 = false;

    @OriginalMember(owner = "client!jv", name = "c", descriptor = "I")
    public static int field1112;

    @OriginalMember(owner = "client!jv", name = "a", descriptor = "(B)V", line = 9)
    public static void method683(byte arg0) {
        int var1 = -108 % ((60 - arg0) / 53);
        field1111 = null;
    }

    @OriginalMember(owner = "client!jv", name = "toString", descriptor = "()Ljava/lang/String;", line = 26)
    public final String toString() {
        field1112++;
        throw new IllegalStateException();
    }
}
