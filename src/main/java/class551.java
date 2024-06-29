import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!re")
public class class551 {

    @OriginalMember(owner = "client!re", name = "c", descriptor = "[I")
    public static int[] field7456 = new int[500];

    @OriginalMember(owner = "client!re", name = "d", descriptor = "[I")
    public static int[] field7457 = new int[2];

    @OriginalMember(owner = "client!re", name = "f", descriptor = "[[I")
    public static int[][] field7459 = new int[][] { { 2, 4 }, { 2, 4 }, { 5, 2, 4 }, { 4, 5, 2 }, { 2, 4, 5 }, { 5, 2, 4 }, { 1, 6, 2, 5 }, { 1, 6, 7, 1 }, { 6, 7, 1, 1 }, { 0, 8, 9, 8, 9, 4 }, { 8, 9, 4, 0, 8, 9 }, { 2, 10, 0, 10, 11, 11 }, { 2, 4 }, { 1, 6, 7, 1 }, { 1, 6, 7, 1 } };

    @OriginalMember(owner = "client!re", name = "b", descriptor = "I")
    public static int field7455;

    @OriginalMember(owner = "client!re", name = "e", descriptor = "I")
    public static int field7458;

    @OriginalMember(owner = "client!re", name = "a", descriptor = "Lqa;")
    public class224 field7454;

    @OriginalMember(owner = "client!re", name = "a", descriptor = "(ILjava/lang/String;)I", line = 4)
    public static final int method3028(int arg0, String arg1) {
        if (arg0 != 4) {
            field7456 = null;
        }
        field7455++;
        return class403.method2308(true, arg1, 10, true);
    }

    @OriginalMember(owner = "client!re", name = "a", descriptor = "(I)[Lhs;", line = 15)
    public static final class295[] method3029(int arg0) {
        int var1 = 57 / ((arg0 + 85) / 37);
        field7458++;
        return new class295[] { class466.field6556, class520.field7080, class389.field5463, class125.field1743, class357.field5107, class238.field3435, class270.field3827, class539.field7316, class22.field306 };
    }

    @OriginalMember(owner = "client!re", name = "a", descriptor = "(B)V", line = 25)
    public static void method3030(byte arg0) {
        field7457 = null;
        field7459 = null;
        int var1 = 47 / ((-arg0 - 62) / 40);
        field7456 = null;
    }
}
