import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!cm")
public class class560 {

    @OriginalMember(owner = "client!cm", name = "d", descriptor = "I")
    public static int field8129 = -2;

    @OriginalMember(owner = "client!cm", name = "a", descriptor = "I")
    public static int field8126;

    @OriginalMember(owner = "client!cm", name = "b", descriptor = "I")
    public static int field8127;

    @OriginalMember(owner = "client!cm", name = "c", descriptor = "Lqk;")
    public static class146 field8128;

    @OriginalMember(owner = "client!cm", name = "a", descriptor = "(B)V")
    public static void method3357(byte arg0) {
        if (arg0 <= -32) {
            field8128 = null;
        }
    }
}
