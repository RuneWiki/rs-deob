import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!iq")
public class class633 {

    @OriginalMember(owner = "client!iq", name = "b", descriptor = "Z")
    public static boolean field8636 = false;

    @OriginalMember(owner = "client!iq", name = "g", descriptor = "I")
    public static int field8641 = 0;

    @OriginalMember(owner = "client!iq", name = "o", descriptor = "[Lwj;")
    public static class415[] field8649 = new class415[4];

    @OriginalMember(owner = "client!iq", name = "a", descriptor = "I")
    public int field8635;

    @OriginalMember(owner = "client!iq", name = "c", descriptor = "I")
    public int field8637;

    @OriginalMember(owner = "client!iq", name = "d", descriptor = "I")
    public static int field8638;

    @OriginalMember(owner = "client!iq", name = "e", descriptor = "I")
    public int field8639;

    @OriginalMember(owner = "client!iq", name = "f", descriptor = "I")
    public int field8640;

    @OriginalMember(owner = "client!iq", name = "h", descriptor = "I")
    public int field8642;

    @OriginalMember(owner = "client!iq", name = "i", descriptor = "I")
    public int field8643;

    @OriginalMember(owner = "client!iq", name = "j", descriptor = "I")
    public static int field8644;

    @OriginalMember(owner = "client!iq", name = "k", descriptor = "I")
    public int field8645;

    @OriginalMember(owner = "client!iq", name = "l", descriptor = "I")
    public int field8646;

    @OriginalMember(owner = "client!iq", name = "m", descriptor = "I")
    public int field8647;

    @OriginalMember(owner = "client!iq", name = "n", descriptor = "I")
    public int field8648;

    @OriginalMember(owner = "client!iq", name = "p", descriptor = "I")
    public int field8650;

    @OriginalMember(owner = "client!iq", name = "q", descriptor = "I")
    public int field8651;

    @OriginalMember(owner = "client!iq", name = "a", descriptor = "(Lbt;I)V")
    public static final void method3572(class48 arg0, int arg1) {
        if (arg1 == 4) {
            class651.field8990 = arg0;
            field8638++;
        }
    }

    @OriginalMember(owner = "client!iq", name = "a", descriptor = "(BLiq;)Z")
    public final boolean method3573(byte arg0, class633 arg1) {
        field8644++;
        if (this.field8648 == arg1.field8648 && this.field8642 == arg1.field8642 && this.field8651 == arg1.field8651) {
            return true;
        } else {
            if (arg0 > -57) {
                this.field8643 = 11;
            }
            return false;
        }
    }

    @OriginalMember(owner = "client!iq", name = "a", descriptor = "(III)V")
    public static final void method3574(int arg0, int arg1, int arg2) {
        class727 var3 = class107.field1351[arg0][arg1][arg2];
        if (var3 == null) {
            return;
        }
        class502.method3001(var3.field10171);
        class502.method3001(var3.field10181);
        if (var3.field10171 != null) {
            var3.field10171 = null;
        }
        if (var3.field10181 != null) {
            var3.field10181 = null;
        }
    }

    @OriginalMember(owner = "client!iq", name = "a", descriptor = "(Z)V")
    public static void method3575(boolean arg0) {
        field8649 = null;
        if (!arg0) {
            method3575(true);
        }
    }
}
