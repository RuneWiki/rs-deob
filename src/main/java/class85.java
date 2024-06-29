import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ib")
public class class85 {

    @OriginalMember(owner = "client!ib", name = "b", descriptor = "I")
    public static int field1050 = 0;

    @OriginalMember(owner = "client!ib", name = "a", descriptor = "I")
    public static int field1049;

    @OriginalMember(owner = "client!ib", name = "d", descriptor = "I")
    public static int field1052;

    @OriginalMember(owner = "client!ib", name = "c", descriptor = "Lmo;")
    public static class447 field1051;

    @OriginalMember(owner = "client!ib", name = "a", descriptor = "(B)V", line = 19)
    public static void method520(byte arg0) {
        field1051 = null;
        if (arg0 != 119) {
            method520((byte) 86);
        }
    }
}
