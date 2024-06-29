import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!lfa")
public class class100 {

    @OriginalMember(owner = "client!lfa", name = "a", descriptor = "[Luo;")
    public static class534[] field1648 = new class534[4];

    @OriginalMember(owner = "client!lfa", name = "c", descriptor = "[I")
    public static int[] field1650 = new int[4096];

    @OriginalMember(owner = "client!lfa", name = "b", descriptor = "Lhga;")
    public static class158 field1649 = new class158(5, 6);

    @OriginalMember(owner = "client!lfa", name = "d", descriptor = "Lrl;")
    public static class672 field1651 = new class672(3, 2);

    @OriginalMember(owner = "client!lfa", name = "a", descriptor = "(Z)V", line = 6)
    public static void method969(boolean arg0) {
        field1649 = null;
        if (!arg0) {
            field1648 = null;
        }
        field1650 = null;
        field1648 = null;
        field1651 = null;
    }
}
