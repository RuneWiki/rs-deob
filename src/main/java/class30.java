import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!vd")
public class class30 {

    @OriginalMember(owner = "client!vd", name = "a", descriptor = "Liv;")
    public static class64 field635 = new class64(75, 5);

    @OriginalMember(owner = "client!vd", name = "c", descriptor = "I")
    public static int field637 = 1401;

    @OriginalMember(owner = "client!vd", name = "b", descriptor = "[[I")
    public static int[][] field636 = new int[][] { { 0, 1, 2, 3 }, { 1, -1, -1, 0 }, { -1, 2, -1, 0 }, { -1, 0, -1, 2 }, { 0, 1, -1, 2 }, { 1, 2, -1, 0 }, { -1, 4, -1, 1 }, { -1, 3, 4, -1 }, { -1, 0, 2, -1 }, { -1, -1, 2, 0 }, { 0, 2, 5, 3 }, { 0, -1, 6, -1 }, { 0, 1, 2, 3 } };

    @OriginalMember(owner = "client!vd", name = "a", descriptor = "(Z)V", line = 5)
    public static void method339(boolean arg0) {
        if (arg0) {
            method339(false);
        }
        field635 = null;
        field636 = null;
    }
}
