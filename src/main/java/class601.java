import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ai")
public class class601 {

    @OriginalMember(owner = "client!ai", name = "c", descriptor = "I")
    public int field8503 = 1;

    @OriginalMember(owner = "client!ai", name = "e", descriptor = "Lhe;")
    public static class372 field8505 = new class372(32);

    @OriginalMember(owner = "client!ai", name = "j", descriptor = "I")
    public static int field8510 = -1;

    @OriginalMember(owner = "client!ai", name = "d", descriptor = "C")
    public char field8504;

    @OriginalMember(owner = "client!ai", name = "a", descriptor = "I")
    public static int field8501;

    @OriginalMember(owner = "client!ai", name = "b", descriptor = "I")
    public static int field8502;

    @OriginalMember(owner = "client!ai", name = "f", descriptor = "I")
    public static int field8506;

    @OriginalMember(owner = "client!ai", name = "g", descriptor = "I")
    public static int field8507;

    @OriginalMember(owner = "client!ai", name = "h", descriptor = "I")
    public static int field8508;

    @OriginalMember(owner = "client!ai", name = "i", descriptor = "I")
    public static int field8509;

    @OriginalMember(owner = "client!ai", name = "a", descriptor = "(B)V")
    public static void method3492(byte arg0) {
        if (arg0 < 43) {
            method3492((byte) 17);
        }
        field8505 = null;
    }

    @OriginalMember(owner = "client!ai", name = "a", descriptor = "(Lrg;I)V")
    public final void method3493(class645 arg0, int arg1) {
        if (arg1 != 0) {
            field8505 = null;
        }
        field8507++;
        while (true) {
            int var3 = arg0.method3745(arg1 ^ 0xFFFFE756);
            if (var3 == 0) {
                return;
            }
            this.method3494(arg0, -7948, var3);
        }
    }

    @OriginalMember(owner = "client!ai", name = "a", descriptor = "(Lrg;II)V")
    private final void method3494(class645 arg0, int arg1, int arg2) {
        field8502++;
        if (arg1 != -7948) {
            method3492((byte) -115);
        }
        if (arg2 == 1) {
            this.field8504 = class33.method166(false, arg0.method3743(true));
        } else if (arg2 == 2) {
            this.field8503 = 0;
        }
    }
}
