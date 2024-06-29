import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!nfa")
public class class624 {

    @OriginalMember(owner = "client!nfa", name = "a", descriptor = "Lvh;")
    public static class328 field8695 = new class328(64);

    @OriginalMember(owner = "client!nfa", name = "b", descriptor = "Luc;")
    public static class27 field8696 = new class27(43, -1);

    @OriginalMember(owner = "client!nfa", name = "c", descriptor = "F")
    public static float field8697;

    @OriginalMember(owner = "client!nfa", name = "a", descriptor = "(B)V", line = 5)
    public static void method3468(byte arg0) {
        if (arg0 != 23) {
            method3468((byte) -14);
        }
        field8696 = null;
        field8695 = null;
    }
}
