import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!vm")
public class class75 {

    @OriginalMember(owner = "client!vm", name = "a", descriptor = "I")
    public static int field1102;

    @OriginalMember(owner = "client!vm", name = "b", descriptor = "Lq;")
    public static class669 field1103;

    @OriginalMember(owner = "client!vm", name = "a", descriptor = "(B)V", line = 6)
    public static void method635(byte arg0) {
        field1103 = null;
        if (arg0 >= -26) {
            method635((byte) -37);
        }
    }
}
