import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!hea")
public class class423 {

    @OriginalMember(owner = "client!hea", name = "c", descriptor = "[Lve;")
    public static class503[] field5964 = new class503[16];

    @OriginalMember(owner = "client!hea", name = "b", descriptor = "[[I")
    public static int[][] field5963 = new int[][] { { 0, 1, 2, 3 }, { 1, 2, 3, 0 }, { 1, 2, -1, 0 }, { 2, 0, -1, 1 }, { 0, 1, -1, 2 }, { 1, 2, -1, 0 }, { -1, 4, -1, 1 }, { -1, 1, 3, -1 }, { -1, 0, 2, -1 }, { 3, 5, 2, 0 }, { 0, 2, 5, 3 }, { 0, 2, 3, 5 }, { 0, 1, 2, 3 } };

    @OriginalMember(owner = "client!hea", name = "a", descriptor = "I")
    public static int field5962;

    @OriginalMember(owner = "client!hea", name = "a", descriptor = "(I)V", line = 7)
    public static void method2590(int arg0) {
        field5964 = null;
        if (arg0 >= 98) {
            field5963 = null;
        }
    }
}
