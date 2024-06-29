import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!rn")
public class class135 extends class176 {

    @OriginalMember(owner = "client!rn", name = "h", descriptor = "I")
    public static int field1928 = 0;

    @OriginalMember(owner = "client!rn", name = "i", descriptor = "[[I")
    public static int[][] field1929 = new int[][] { { 0, 1, 2, 3 }, { 1, 2, 3, 0 }, { 1, 2, -1, 0 }, { 2, 0, -1, 1 }, { 0, 1, -1, 2 }, { 1, 2, -1, 0 }, { -1, 4, -1, 1 }, { -1, 1, 3, -1 }, { -1, 0, 2, -1 }, { 3, 5, 2, 0 }, { 0, 2, 5, 3 }, { 0, 2, 3, 5 }, { 0, 1, 2, 3 } };

    @OriginalMember(owner = "client!rn", name = "j", descriptor = "[Z")
    public static boolean[] field1930 = new boolean[100];

    @OriginalMember(owner = "client!rn", name = "g", descriptor = "I")
    public static int field1927;

    @OriginalMember(owner = "client!rn", name = "k", descriptor = "I")
    public static int field1931;

    @OriginalMember(owner = "client!rn", name = "l", descriptor = "I")
    public static int field1932;

    @OriginalMember(owner = "client!rn", name = "a", descriptor = "(Z)V", line = 8)
    public static void method1075(boolean arg0) {
        field1929 = null;
        if (arg0) {
            field1930 = null;
        }
        field1930 = null;
    }

    @OriginalMember(owner = "client!rn", name = "a", descriptor = "(I)V", line = 24)
    public static final void method1076(int arg0) {
        field1932++;
        if (class445.field6400 != arg0) {
            try {
                class117.method936("tbrefresh", true, class244.field3371);
            } catch (Throwable var1) {
            }
        }
    }

    @OriginalMember(owner = "client!rn", name = "a", descriptor = "(Lrk;B)V", line = 48)
    public static final void method1077(class427 arg0, byte arg1) {
        class213.field2956 = arg0;
        if (arg1 <= 50) {
            method1075(true);
        }
        field1931++;
    }
}
