import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ue")
public class class189 {

    @OriginalMember(owner = "client!ue", name = "a", descriptor = "[[I")
    public static int[][] field2642 = new int[][] { { 2, 4, 6, 0 }, { 0, 2, 4, 6 }, { 0, 2, 4 }, { 4, 0, 2 }, { 2, 4, 0 }, { 0, 2, 4 }, { 6, 0, 1, 2, 4, 5 }, { 0, 4, 7, 6 }, { 4, 7, 6, 0 }, { 0, 8, 6, 2, 9, 4 }, { 2, 9, 4, 0, 8, 6 }, { 2, 11, 4, 6, 10, 0 }, { 2, 4, 6, 0 } };

    @OriginalMember(owner = "client!ue", name = "c", descriptor = "I")
    public static int field2644;

    @OriginalMember(owner = "client!ue", name = "b", descriptor = "Leda;")
    public static class14 field2643;

    @OriginalMember(owner = "client!ue", name = "a", descriptor = "(I)V")
    public static void method1328(int arg0) {
        if (arg0 >= 61) {
            field2642 = null;
            field2643 = null;
        }
    }
}
