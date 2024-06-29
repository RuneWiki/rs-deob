import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!to")
public class class216 {

    @OriginalMember(owner = "client!to", name = "a", descriptor = "Lim;")
    public static class353 field2767 = new class353(21, -1);

    @OriginalMember(owner = "client!to", name = "b", descriptor = "I")
    public static int field2768;

    @OriginalMember(owner = "client!to", name = "c", descriptor = "I")
    public static int field2769;

    @OriginalMember(owner = "client!to", name = "a", descriptor = "(B)V")
    public static void method1395(byte arg0) {
        if (arg0 != 5) {
            field2767 = null;
        }
        field2767 = null;
    }

    @OriginalMember(owner = "client!to", name = "a", descriptor = "(I)Ljava/lang/String;")
    public static final String method1396(int arg0) {
        field2768++;
        if (class264.field3373 || class84.field1136 == null) {
            return "";
        } else {
            if (arg0 > -19) {
                method1395((byte) 18);
            }
            return class84.field1136.field3105;
        }
    }

    static {
        new class344(" left the channel.", " hat den Chatraum verlassen.", " a quitté le canal.", " deixou o canal.");
    }
}
