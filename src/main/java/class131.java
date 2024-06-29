import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ho")
public class class131 {

    @OriginalMember(owner = "client!ho", name = "d", descriptor = "I")
    public static int field1807 = 0;

    @OriginalMember(owner = "client!ho", name = "c", descriptor = "Lwf;")
    public static class117 field1806 = new class117(10);

    @OriginalMember(owner = "client!ho", name = "a", descriptor = "I")
    public int field1804;

    @OriginalMember(owner = "client!ho", name = "b", descriptor = "I")
    public static int field1805;

    @OriginalMember(owner = "client!ho", name = "e", descriptor = "I")
    public int field1808;

    @OriginalMember(owner = "client!ho", name = "f", descriptor = "I")
    public int field1809;

    @OriginalMember(owner = "client!ho", name = "g", descriptor = "I")
    public int field1810;

    @OriginalMember(owner = "client!ho", name = "a", descriptor = "(I)V", line = 8)
    public static void method913(int arg0) {
        if (arg0 != 0) {
            field1807 = -15;
        }
        field1806 = null;
    }
}
