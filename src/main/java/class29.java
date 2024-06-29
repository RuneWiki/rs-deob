import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!wm")
public class class29 {

    @OriginalMember(owner = "client!wm", name = "c", descriptor = "[I")
    public static int[] field356 = new int[1];

    @OriginalMember(owner = "client!wm", name = "a", descriptor = "[[I")
    public static int[][] field354 = new int[][] { { 2, 4, 6, 0 }, { 0, 2, 4, 6 }, { 0, 2, 4 }, { 4, 0, 2 }, { 2, 4, 0 }, { 0, 2, 4 }, { 6, 0, 1, 2, 4, 5 }, { 0, 4, 7, 6 }, { 4, 7, 6, 0 }, { 0, 8, 6, 2, 9, 4 }, { 2, 9, 4, 0, 8, 6 }, { 2, 11, 4, 6, 10, 0 }, { 2, 4, 6, 0 } };

    @OriginalMember(owner = "client!wm", name = "b", descriptor = "Ldl;")
    public static class698 field355 = new class698();

    @OriginalMember(owner = "client!wm", name = "a", descriptor = "(B)V", line = 25)
    public static void method162(byte arg0) {
        field355 = null;
        field354 = null;
        field356 = null;
        if (arg0 < 75) {
            method162((byte) -81);
        }
    }
}
