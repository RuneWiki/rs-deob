import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!mba")
public class class383 {

    @OriginalMember(owner = "client!mba", name = "d", descriptor = "[I")
    public static int[] field5414 = new int[4];

    @OriginalMember(owner = "client!mba", name = "a", descriptor = "I")
    public static int field5411;

    @OriginalMember(owner = "client!mba", name = "b", descriptor = "I")
    public static int field5412;

    @OriginalMember(owner = "client!mba", name = "c", descriptor = "Lwt;")
    public static class279 field5413;

    @OriginalMember(owner = "client!mba", name = "a", descriptor = "(III)Lsj;", line = 8)
    public static final class423 method2293(int arg0, int arg1, int arg2) {
        class40 var3 = class153.field2210[arg0][arg1][arg2];
        if (var3 == null) {
            return null;
        } else {
            class423 var4 = var3.field664;
            var3.field664 = null;
            class300.method1929(var4);
            return var4;
        }
    }

    @OriginalMember(owner = "client!mba", name = "a", descriptor = "(Z)V", line = 22)
    public static void method2294(boolean arg0) {
        field5414 = null;
        if (!arg0) {
            field5413 = null;
        }
    }

    @OriginalMember(owner = "client!mba", name = "a", descriptor = "(B)I", line = 33)
    public static final int method2295(byte arg0) {
        field5411++;
        if (arg0 != -28) {
            field5412 = 24;
        }
        return 46;
    }
}
