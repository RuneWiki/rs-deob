import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!gg")
public class class163 {

    @OriginalMember(owner = "client!gg", name = "b", descriptor = "Lca;")
    public static class285 field1920 = new class285();

    @OriginalMember(owner = "client!gg", name = "a", descriptor = "I")
    public static int field1919;

    @OriginalMember(owner = "client!gg", name = "c", descriptor = "I")
    public static int field1921;

    @OriginalMember(owner = "client!gg", name = "a", descriptor = "(II)I", line = 3)
    public static final int method997(int arg0, int arg1) {
        if (arg1 != 127) {
            field1920 = null;
        }
        field1919++;
        return arg0 & 0x7F;
    }

    @OriginalMember(owner = "client!gg", name = "a", descriptor = "(B)V", line = 15)
    public static void method998(byte arg0) {
        field1920 = null;
        if (arg0 != 74) {
            field1920 = null;
        }
    }
}
