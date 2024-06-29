import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!bka")
public class class178 {

    @OriginalMember(owner = "client!bka", name = "a", descriptor = "Lhv;")
    public static class546 field2374 = new class546(9, 2);

    @OriginalMember(owner = "client!bka", name = "c", descriptor = "[[I")
    public static int[][] field2376 = new int[][] { { 0, 1, 2, 3 }, { 1, -1, -1, 0 }, { -1, 2, -1, 0 }, { -1, 0, -1, 2 }, { 0, 1, -1, 2 }, { 1, 2, -1, 0 }, { -1, 4, -1, 1 }, { -1, 3, 4, -1 }, { -1, 0, 2, -1 }, { -1, -1, 2, 0 }, { 0, 2, 5, 3 }, { 0, -1, 6, -1 }, { 0, 1, 2, 3 } };

    @OriginalMember(owner = "client!bka", name = "d", descriptor = "I")
    public static int field2377 = 0;

    @OriginalMember(owner = "client!bka", name = "b", descriptor = "I")
    public static int field2375;

    @OriginalMember(owner = "client!bka", name = "a", descriptor = "(I)V")
    public static void method1252(int arg0) {
        field2376 = null;
        field2374 = null;
        if (arg0 != -22272) {
            field2374 = null;
        }
    }

    @OriginalMember(owner = "client!bka", name = "a", descriptor = "(BI)V")
    public static final void method1253(byte arg0, int arg1) {
        field2375++;
        class754.field10432.method1546(arg1, (byte) -8);
        if (arg0 >= -11) {
            field2374 = null;
        }
    }
}
