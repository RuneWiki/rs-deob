import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!lca")
public class class52 {

    @OriginalMember(owner = "client!lca", name = "b", descriptor = "[I")
    public static int[] field742 = new int[4096];

    @OriginalMember(owner = "client!lca", name = "c", descriptor = "[I")
    public static int[] field743 = new int[1000];

    @OriginalMember(owner = "client!lca", name = "a", descriptor = "[Ls;")
    public static class339[] field741;

    @OriginalMember(owner = "client!lca", name = "a", descriptor = "(I)V", line = 4)
    public static void method356(int arg0) {
        if (arg0 != 22156) {
            field742 = null;
        }
        field742 = null;
        field743 = null;
        field741 = null;
    }
}
