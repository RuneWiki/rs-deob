import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ad")
public class class359 {

    @OriginalMember(owner = "client!ad", name = "a", descriptor = "[I")
    public static int[] field4726;

    @OriginalMember(owner = "client!ad", name = "b", descriptor = "F")
    public static float field4727;

    @OriginalMember(owner = "client!ad", name = "a", descriptor = "(B)V")
    public static void method2017(byte arg0) {
        field4726 = null;
        if (arg0 <= 102) {
            field4727 = 0.22581065F;
        }
    }

    static {
        new class180("That user is not in this channel.", "Dieser Benutzer befindet sich nicht in diesem Chatraum.", "Cet utilisateur n'est pas dans ce canal.", "Esse usuário não está no canal.");
        field4726 = new int[1];
    }
}
