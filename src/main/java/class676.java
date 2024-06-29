import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ob")
public class class676 {

    @OriginalMember(owner = "client!ob", name = "c", descriptor = "[I")
    public static int[] field9547 = new int[1000];

    @OriginalMember(owner = "client!ob", name = "b", descriptor = "Lwn;")
    public static class663 field9546 = new class663();

    @OriginalMember(owner = "client!ob", name = "d", descriptor = "Luc;")
    public static class27 field9548 = new class27(69, -1);

    @OriginalMember(owner = "client!ob", name = "a", descriptor = "[[Lfaa;")
    public static class140[][] field9545;

    @OriginalMember(owner = "client!ob", name = "a", descriptor = "(Z)V", line = 5)
    public static void method3740(boolean arg0) {
        if (!arg0) {
            method3740(false);
        }
        field9545 = null;
        field9547 = null;
        field9546 = null;
        field9548 = null;
    }
}
