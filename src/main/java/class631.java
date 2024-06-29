import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!nfa")
public class class631 implements class264 {

    @OriginalMember(owner = "client!nfa", name = "c", descriptor = "I")
    public int field8881;

    @OriginalMember(owner = "client!nfa", name = "b", descriptor = "[Z")
    public static boolean[] field8880 = new boolean[5];

    @OriginalMember(owner = "client!nfa", name = "a", descriptor = "I")
    public static int field8879;

    @OriginalMember(owner = "client!nfa", name = "a", descriptor = "(I)Leu;", line = 3)
    public final class444 method1247(int arg0) {
        if (arg0 != 3848) {
            method3668(true);
        }
        field8879++;
        return class24.field379;
    }

    @OriginalMember(owner = "client!nfa", name = "a", descriptor = "(Z)V", line = 19)
    public static void method3668(boolean arg0) {
        field8880 = null;
        if (!arg0) {
            method3668(true);
        }
    }

    @OriginalMember(owner = "client!nfa", name = "<init>", descriptor = "(I)V", line = 31)
    public class631(int arg0) {
        this.field8881 = arg0;
    }
}
