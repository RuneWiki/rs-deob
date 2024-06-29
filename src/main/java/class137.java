import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!be")
public class class137 {

    @OriginalMember(owner = "client!be", name = "a", descriptor = "[[I")
    public static int[][] field1999 = new int[][] { { 0, 1, 2, 3 }, { 1, -1, -1, 0 }, { -1, 2, -1, 0 }, { -1, 0, -1, 2 }, { 0, 1, -1, 2 }, { 1, 2, -1, 0 }, { -1, 4, -1, 1 }, { -1, 3, 4, -1 }, { -1, 0, 2, -1 }, { -1, -1, 2, 0 }, { 0, 2, 5, 3 }, { 0, -1, 6, -1 }, { 0, 1, 2, 3 } };

    @OriginalMember(owner = "client!be", name = "a", descriptor = "(B)V", line = 10)
    public static void method914(byte arg0) {
        if (arg0 != 71) {
            method914((byte) -100);
        }
        field1999 = null;
    }
}
