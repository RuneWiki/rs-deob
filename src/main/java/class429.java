import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ba")
public class class429 {

    @OriginalMember(owner = "client!ba", name = "b", descriptor = "I")
    public static int field5865 = -1;

    @OriginalMember(owner = "client!ba", name = "a", descriptor = "[[I")
    public static int[][] field5864 = new int[][] { { 0, 1, 2, 3 }, { 1, 2, 3, 0 }, { 1, 2, -1, 0 }, { 2, 0, -1, 1 }, { 0, 1, -1, 2 }, { 1, 2, -1, 0 }, { -1, 4, -1, 1 }, { -1, 1, 3, -1 }, { -1, 0, 2, -1 }, { 3, 5, 2, 0 }, { 0, 2, 5, 3 }, { 0, 2, 3, 5 }, { 0, 1, 2, 3 } };

    @OriginalMember(owner = "client!ba", name = "c", descriptor = "Lwo;")
    public static class285 field5866;

    @OriginalMember(owner = "client!ba", name = "d", descriptor = "Lwo;")
    public static class285 field5867;

    @OriginalMember(owner = "client!ba", name = "a", descriptor = "(I)V", line = 14)
    public static void method2617(int arg0) {
        if (arg0 == -13806) {
            field5864 = null;
            field5866 = null;
            field5867 = null;
        }
    }
}
