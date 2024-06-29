import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!dq")
public class class606 extends class182 {

    @OriginalMember(owner = "client!dq", name = "R", descriptor = "[S")
    public static short[] field8863 = new short[] { -4160, -4163, -8256, -8259, 22461 };

    @OriginalMember(owner = "client!dq", name = "Q", descriptor = "I")
    public static int field8862;

    @OriginalMember(owner = "client!dq", name = "P", descriptor = "Lwh;")
    public static class129 field8861;

    @OriginalMember(owner = "client!dq", name = "a", descriptor = "(B)V", line = 5)
    public static void method3528(byte arg0) {
        if (arg0 >= -53) {
            method3529(-43, (byte) 123);
        }
        field8863 = null;
        field8861 = null;
    }

    @OriginalMember(owner = "client!dq", name = "a", descriptor = "(IB)I", line = 18)
    public static final int method3529(int arg0, byte arg1) {
        field8862++;
        if (arg1 <= 109) {
            field8863 = null;
        }
        return arg0 & 0xFF;
    }
}
