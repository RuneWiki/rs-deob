import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!cba")
public class class516 {

    @OriginalMember(owner = "client!cba", name = "d", descriptor = "[[I")
    public static int[][] field6890 = new int[][] { { 12, 12, 12, 12 }, { 12, 12, 12, 12 }, { 5, 5, 5 }, { 5, 5, 5 }, { 5, 5, 5 }, { 5, 5, 5 }, { 12, 12, 12, 12, 12, 12 }, { 1, 1, 1, 7 }, { 1, 1, 7, 1 }, { 8, 9, 9, 8, 8, 9 }, { 8, 8, 9, 8, 9, 9 }, { 10, 10, 11, 11, 11, 10 }, { 12, 12, 12, 12 } };

    @OriginalMember(owner = "client!cba", name = "e", descriptor = "Lqw;")
    public static class71 field6891 = new class71(15, -1);

    @OriginalMember(owner = "client!cba", name = "f", descriptor = "I")
    public static int field6892 = 0;

    @OriginalMember(owner = "client!cba", name = "a", descriptor = "I")
    public static int field6887;

    @OriginalMember(owner = "client!cba", name = "c", descriptor = "I")
    public static int field6889;

    @OriginalMember(owner = "client!cba", name = "g", descriptor = "Lta;")
    public static class200 field6893;

    @OriginalMember(owner = "client!cba", name = "h", descriptor = "Lxa;")
    public static class468 field6894;

    @OriginalMember(owner = "client!cba", name = "b", descriptor = "[[Z")
    public static boolean[][] field6888;

    @OriginalMember(owner = "client!cba", name = "a", descriptor = "(IZLba;II)Ldd;")
    public static final class660 method2881(int arg0, boolean arg1, class358 arg2, int arg3, int arg4) {
        if (!arg1) {
            method2881(-3, true, null, -66, 126);
        }
        field6887++;
        return arg2 == null ? null : new class660(arg3, arg0, arg4, arg2.method1940(), arg2.method1951(), arg2.method1936(), arg2.method1939(), arg2.method1952(), arg2.method1935(), arg2.method1934());
    }

    @OriginalMember(owner = "client!cba", name = "toString", descriptor = "()Ljava/lang/String;")
    public final String toString() {
        field6889++;
        throw new IllegalStateException();
    }

    @OriginalMember(owner = "client!cba", name = "a", descriptor = "(B)V")
    public static void method2882(byte arg0) {
        field6890 = null;
        field6891 = null;
        field6893 = null;
        field6894 = null;
        if (arg0 != 54) {
            method2881(49, true, null, 74, 79);
        }
        field6888 = null;
    }
}
