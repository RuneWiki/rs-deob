import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!me")
public class class168 {

    @OriginalMember(owner = "client!me", name = "a", descriptor = "Llu;")
    public static class610 field2627 = new class610(41, 7);

    @OriginalMember(owner = "client!me", name = "b", descriptor = "[[I")
    public static int[][] field2628 = new int[][] { { 0, 1, 2, 3 }, { 1, 2, 3, 0 }, { 1, 2, -1, 0 }, { 2, 0, -1, 1 }, { 0, 1, -1, 2 }, { 1, 2, -1, 0 }, { -1, 4, -1, 1 }, { -1, 1, 3, -1 }, { -1, 0, 2, -1 }, { 3, 5, 2, 0 }, { 0, 2, 5, 3 }, { 0, 2, 3, 5 }, { 0, 1, 2, 3 } };

    @OriginalMember(owner = "client!me", name = "e", descriptor = "[I")
    public static int[] field2631 = new int[2];

    @OriginalMember(owner = "client!me", name = "d", descriptor = "F")
    public static float field2630;

    @OriginalMember(owner = "client!me", name = "c", descriptor = "Lcw;")
    public static class157 field2629;

    @OriginalMember(owner = "client!me", name = "a", descriptor = "(B)V", line = 14)
    public static void method1201(byte arg0) {
        if (arg0 == -58) {
            field2631 = null;
            field2628 = null;
            field2627 = null;
            field2629 = null;
        }
    }
}
