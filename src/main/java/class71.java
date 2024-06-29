import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!eg")
public class class71 {

    @OriginalMember(owner = "client!eg", name = "a", descriptor = "[I")
    public static int[] field1155 = new int[] { 0, 0, 0, 0, 1, 1, 1, 1, 1, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 3 };

    @OriginalMember(owner = "client!eg", name = "c", descriptor = "[[I")
    public static int[][] field1157 = new int[][] { { 12, 12, 12, 12 }, { 12, 12, 12, 12 }, { 5, 5, 5 }, { 5, 5, 5 }, { 5, 5, 5 }, { 5, 5, 5 }, { 12, 12, 12, 12, 12, 12 }, { 1, 1, 1, 7 }, { 1, 1, 7, 1 }, { 8, 9, 9, 8, 8, 9 }, { 8, 8, 9, 8, 9, 9 }, { 10, 10, 11, 11, 11, 10 }, { 12, 12, 12, 12 } };

    @OriginalMember(owner = "client!eg", name = "b", descriptor = "Lqv;")
    public static class316 field1156 = new class316(32, 12);

    @OriginalMember(owner = "client!eg", name = "e", descriptor = "[I")
    public static int[] field1159 = new int[3];

    @OriginalMember(owner = "client!eg", name = "d", descriptor = "[I")
    public static int[] field1158 = new int[5];

    @OriginalMember(owner = "client!eg", name = "a", descriptor = "(I)V", line = 9)
    public static void method546(int arg0) {
        if (arg0 < 0) {
            return;
        }
        field1156 = null;
        field1155 = null;
        field1157 = null;
        field1159 = null;
        field1158 = null;
    }
}
