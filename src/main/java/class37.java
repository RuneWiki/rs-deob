import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!vg")
public class class37 {

    @OriginalMember(owner = "client!vg", name = "a", descriptor = "Lla;")
    public static class319 field528 = new class319(80, 1);

    @OriginalMember(owner = "client!vg", name = "b", descriptor = "Z")
    public static boolean field529 = false;

    @OriginalMember(owner = "client!vg", name = "c", descriptor = "I")
    public static int field530;

    @OriginalMember(owner = "client!vg", name = "d", descriptor = "I")
    public static int field531;

    @OriginalMember(owner = "client!vg", name = "a", descriptor = "(B)V")
    public static void method316(byte arg0) {
        field528 = null;
        if (arg0 != 61) {
            field528 = null;
        }
    }

    @OriginalMember(owner = "client!vg", name = "a", descriptor = "(IIZ)Z")
    public static final boolean method317(int arg0, int arg1, boolean arg2) {
        field530++;
        if (arg2) {
            method316((byte) -101);
        }
        return (arg1 & 0x34) != 0;
    }
}
