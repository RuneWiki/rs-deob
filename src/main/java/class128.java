import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!nk")
public class class128 {

    @OriginalMember(owner = "client!nk", name = "a", descriptor = "Ljava/lang/String;")
    public static String field1882 = "Allocated memory";

    @OriginalMember(owner = "client!nk", name = "d", descriptor = "Z")
    public static boolean field1885 = false;

    @OriginalMember(owner = "client!nk", name = "c", descriptor = "I")
    public static int field1884;

    @OriginalMember(owner = "client!nk", name = "b", descriptor = "[[I")
    public static int[][] field1883;

    @OriginalMember(owner = "client!nk", name = "a", descriptor = "(II)I")
    public static int method879(int arg0, int arg1) {
        return arg0 ^ arg1;
    }

    @OriginalMember(owner = "client!nk", name = "a", descriptor = "(I)V")
    public static void method880(int arg0) {
        field1882 = null;
        if (arg0 > -12) {
            method880(84);
        }
        field1883 = null;
    }
}
