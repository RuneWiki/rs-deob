import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!jq")
public abstract class class472 extends class375 {

    @OriginalMember(owner = "client!jq", name = "v", descriptor = "I")
    public int field6747;

    @OriginalMember(owner = "client!jq", name = "u", descriptor = "Lqt;")
    public class589 field6746;

    @OriginalMember(owner = "client!jq", name = "t", descriptor = "[I")
    public static int[] field6745 = new int[14];

    @OriginalMember(owner = "client!jq", name = "w", descriptor = "Lle;")
    public static class277 field6748;

    @OriginalMember(owner = "client!jq", name = "c", descriptor = "(Z)V")
    public static void method2775(boolean arg0) {
        if (!arg0) {
            field6748 = null;
        }
        field6745 = null;
        field6748 = null;
    }

    @OriginalMember(owner = "client!jq", name = "d", descriptor = "(B)Z")
    public abstract boolean method2776(byte arg0);

    @OriginalMember(owner = "client!jq", name = "a", descriptor = "(I)Ljava/lang/Object;")
    public abstract Object method2777(int arg0);

    @OriginalMember(owner = "client!jq", name = "<init>", descriptor = "(Lqt;I)V")
    public class472(class589 arg0, int arg1) {
        this.field6747 = arg1;
        this.field6746 = arg0;
    }
}
