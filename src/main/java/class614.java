import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ia")
public class class614 extends class380 {

    @OriginalMember(owner = "client!ia", name = "f", descriptor = "Lfba;")
    public static class27 field8618 = new class27(38, 15);

    @OriginalMember(owner = "client!ia", name = "k", descriptor = "I")
    public static int field8623 = 0;

    @OriginalMember(owner = "client!ia", name = "g", descriptor = "I")
    public static int field8619;

    @OriginalMember(owner = "client!ia", name = "h", descriptor = "I")
    public static int field8620;

    @OriginalMember(owner = "client!ia", name = "i", descriptor = "I")
    public static int field8621;

    @OriginalMember(owner = "client!ia", name = "j", descriptor = "I")
    public static int field8622;

    @OriginalMember(owner = "client!ia", name = "a", descriptor = "(IIB)V")
    public static final void method3563(int arg0, int arg1, byte arg2) {
        field8620++;
        if (arg2 <= 28) {
            field8619 = -106;
        }
        if (class217.method1490(arg0, -1)) {
            class558.method3301(-8298, arg1, class787.field10812[arg0]);
        }
    }

    @OriginalMember(owner = "client!ia", name = "a", descriptor = "(B)V")
    public static void method3564(byte arg0) {
        field8618 = null;
        if (arg0 != 100) {
            field8618 = null;
        }
    }

    @OriginalMember(owner = "client!ia", name = "a", descriptor = "(III)Z")
    public static final boolean method3565(int arg0, int arg1, int arg2) {
        field8621++;
        if (arg2 < 80) {
            field8622 = -23;
        }
        return (arg0 & 0x400) != 0;
    }
}
