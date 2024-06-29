import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!uo")
public class class142 {

    @OriginalMember(owner = "client!uo", name = "b", descriptor = "[I")
    public static int[] field2216 = new int[] { 4, 4, 1, 2, 6, 4, 2, 44, 2, 2, 2, 2, 2, 1, 2, 2, 2, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 0, 0, 0, 0, 1 };

    @OriginalMember(owner = "client!uo", name = "a", descriptor = "I")
    public static int field2215;

    @OriginalMember(owner = "client!uo", name = "d", descriptor = "I")
    public static int field2218;

    @OriginalMember(owner = "client!uo", name = "c", descriptor = "Lvm;")
    public static class72 field2217;

    @OriginalMember(owner = "client!uo", name = "a", descriptor = "(I)V")
    public static void method1104(int arg0) {
        if (arg0 != 4) {
            method1104(-8);
        }
        field2217 = null;
        field2216 = null;
    }

    @OriginalMember(owner = "client!uo", name = "a", descriptor = "(B)V")
    public static final void method1105(byte arg0) {
        class13.field119 = null;
        class478.field6939 = -1;
        class548.field7817 = null;
        class693.field9827 = null;
        class607.field8569 = -1;
        field2218++;
        class554.field7897 = -1;
        if (arg0 != -83) {
            field2217 = null;
        }
        class70.field1087 = null;
        class418.field6153 = null;
        class221.field3592 = -1;
        class377.field5673 = null;
        class118.field1823 = null;
        class666.field9451.method3(32767);
    }

    @OriginalMember(owner = "client!uo", name = "a", descriptor = "(BII)B")
    public static final byte method1106(byte arg0, int arg1, int arg2) {
        if (arg0 <= 57) {
            return -23;
        }
        field2215++;
        if (arg1 == 9) {
            return (byte) ((arg2 & 0x1) == 0 ? 1 : 2);
        } else {
            return 0;
        }
    }
}
