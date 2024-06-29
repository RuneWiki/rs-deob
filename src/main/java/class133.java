import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!vf")
public class class133 {

    @OriginalMember(owner = "client!vf", name = "a", descriptor = "I")
    public static int field1821;

    @OriginalMember(owner = "client!vf", name = "b", descriptor = "[I")
    public static int[] field1822;

    @OriginalMember(owner = "client!vf", name = "a", descriptor = "(I)V")
    public static void method920(int arg0) {
        field1822 = null;
        if (arg0 <= 98) {
            field1822 = null;
        }
    }

    static {
        new class572(" left the channel.", " hat den Chatraum verlassen.", " a quitté le canal.", " deixou o canal.");
        field1821 = 4;
    }
}
