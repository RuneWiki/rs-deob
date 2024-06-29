import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!p")
public class class186 {

    @OriginalMember(owner = "client!p", name = "a", descriptor = "Lh;")
    public static class572 field2779 = new class572("Discard", "Ablegen", "Jeter", "Descartar");

    @OriginalMember(owner = "client!p", name = "b", descriptor = "[[I")
    public static int[][] field2780 = new int[][] { { 0, 1, 2, 3 }, { 1, -1, -1, 0 }, { -1, 2, -1, 0 }, { -1, 0, -1, 2 }, { 0, 1, -1, 2 }, { 1, 2, -1, 0 }, { -1, 4, -1, 1 }, { -1, 3, 4, -1 }, { -1, 0, 2, -1 }, { -1, -1, 2, 0 }, { 0, 2, 5, 3 }, { 0, -1, 6, -1 }, { 0, 1, 2, 3 } };

    @OriginalMember(owner = "client!p", name = "c", descriptor = "Lmt;")
    public static class336 field2781 = new class336("LIVE", 0);

    @OriginalMember(owner = "client!p", name = "d", descriptor = "Lha;")
    public static class53 field2782;

    @OriginalMember(owner = "client!p", name = "a", descriptor = "(Z)V")
    public static void method1287(boolean arg0) {
        field2780 = null;
        if (!arg0) {
            field2782 = null;
            field2781 = null;
            field2779 = null;
        }
    }

    static {
        new class572("You are temporarily banned from this clan channel.", "Du wurdest temporär aus diesem Chatraum verbannt.", "Vous êtes temporairement exclu de ce canal de clan.", "Você está temporariamente vetado de entrar nesse canal de clã.");
    }
}
