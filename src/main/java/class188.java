import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!qe")
public class class188 {

    @OriginalMember(owner = "client!qe", name = "a", descriptor = "[[I")
    public static int[][] field3285 = new int[5][5000];

    @OriginalMember(owner = "client!qe", name = "b", descriptor = "I")
    public static int field3286 = 0;

    @OriginalMember(owner = "client!qe", name = "c", descriptor = "[Lrm;")
    public static class248[] field3287;

    @OriginalMember(owner = "client!qe", name = "a", descriptor = "(Z)V", line = 23)
    public static void method1304(boolean arg0) {
        field3287 = null;
        field3285 = (int[][]) null;
        if (arg0) {
            field3286 = 46;
        }
    }
}
