import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!hs")
public class class296 {

    @OriginalMember(owner = "client!hs", name = "b", descriptor = "Llh;")
    public static class487 field4058 = new class487(9, -1);

    @OriginalMember(owner = "client!hs", name = "d", descriptor = "I")
    public static int field4060 = 0;

    @OriginalMember(owner = "client!hs", name = "e", descriptor = "I")
    public static int field4061 = 0;

    @OriginalMember(owner = "client!hs", name = "g", descriptor = "[[I")
    public static int[][] field4063 = new int[][] { { 0, 2 }, { 0, 2 }, { 0, 0, 2 }, { 2, 0, 0 }, { 0, 2, 0 }, { 0, 0, 2 }, { 0, 5, 1, 4 }, { 0, 4, 4, 4 }, { 4, 4, 4, 0 }, { 6, 6, 6, 2, 2, 2 }, { 2, 2, 2, 6, 6, 6 }, { 0, 11, 6, 6, 6, 4 }, { 0, 2 }, { 0, 4, 4, 4 }, { 0, 4, 4, 4 } };

    @OriginalMember(owner = "client!hs", name = "a", descriptor = "I")
    public static int field4057;

    @OriginalMember(owner = "client!hs", name = "c", descriptor = "Lnw;")
    public static class543 field4059;

    @OriginalMember(owner = "client!hs", name = "f", descriptor = "Ljava/lang/Object;")
    public static Object field4062;

    @OriginalMember(owner = "client!hs", name = "a", descriptor = "(II)Z")
    public static final boolean method1804(int arg0, int arg1) {
        if (arg1 == 2) {
            field4057++;
            return arg0 == 4 || arg0 == 8 || arg0 == 11;
        } else {
            return true;
        }
    }

    @OriginalMember(owner = "client!hs", name = "a", descriptor = "(B)V")
    public static void method1805(byte arg0) {
        if (arg0 >= -61) {
            method1805((byte) 123);
        }
        field4058 = null;
        field4063 = null;
        field4059 = null;
        field4062 = null;
    }
}
