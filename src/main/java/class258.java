import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!vo")
public class class258 {

    @OriginalMember(owner = "client!vo", name = "c", descriptor = "Lgi;")
    public class429 field3603 = new class429();

    @OriginalMember(owner = "client!vo", name = "g", descriptor = "Z")
    public boolean field3607 = false;

    @OriginalMember(owner = "client!vo", name = "a", descriptor = "I")
    public static int field3601;

    @OriginalMember(owner = "client!vo", name = "b", descriptor = "I")
    public static int field3602;

    @OriginalMember(owner = "client!vo", name = "e", descriptor = "I")
    public int field3605;

    @OriginalMember(owner = "client!vo", name = "f", descriptor = "I")
    public int field3606;

    @OriginalMember(owner = "client!vo", name = "d", descriptor = "Lbd;")
    public static class326 field3604;

    @OriginalMember(owner = "client!vo", name = "a", descriptor = "(I)V", line = 13)
    public static void method1672(int arg0) {
        if (arg0 > 13) {
            field3604 = null;
        }
    }

    @OriginalMember(owner = "client!vo", name = "a", descriptor = "(IIB)B", line = 25)
    public static final byte method1673(int arg0, int arg1, byte arg2) {
        if (arg2 != 0) {
            method1672(95);
        }
        field3602++;
        if (arg0 == 9) {
            return (byte) ((arg1 & 0x1) == 0 ? 1 : 2);
        } else {
            return 0;
        }
    }
}
