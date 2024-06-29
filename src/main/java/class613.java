import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!dw")
public class class613 extends class287 {

    @OriginalMember(owner = "client!dw", name = "l", descriptor = "Laq;")
    public static class141 field9072 = new class141(1);

    @OriginalMember(owner = "client!dw", name = "m", descriptor = "Llt;")
    public static class581 field9073 = new class581("RC", 1);

    @OriginalMember(owner = "client!dw", name = "h", descriptor = "I")
    public static int field9068;

    @OriginalMember(owner = "client!dw", name = "i", descriptor = "I")
    public static int field9069;

    @OriginalMember(owner = "client!dw", name = "n", descriptor = "I")
    public static int field9074;

    @OriginalMember(owner = "client!dw", name = "j", descriptor = "Ldw;")
    public class613 field9070;

    @OriginalMember(owner = "client!dw", name = "k", descriptor = "Ldw;")
    public class613 field9071;

    @OriginalMember(owner = "client!dw", name = "a", descriptor = "(III)Z", line = 4)
    public static final boolean method3590(int arg0, int arg1, int arg2) {
        if (arg0 >= -43) {
            return false;
        } else {
            field9068++;
            return (arg1 & 0x800) != 0;
        }
    }

    @OriginalMember(owner = "client!dw", name = "b", descriptor = "(B)V", line = 21)
    public final void method3591(byte arg0) {
        field9069++;
        if (this.field9071 == null) {
            return;
        }
        this.field9071.field9070 = this.field9070;
        this.field9070.field9071 = this.field9071;
        this.field9070 = null;
        this.field9071 = null;
        if (arg0 != 81) {
            field9073 = null;
        }
    }

    @OriginalMember(owner = "client!dw", name = "a", descriptor = "(Z)V", line = 45)
    public static void method3592(boolean arg0) {
        field9073 = null;
        field9072 = null;
        if (!arg0) {
            field9072 = null;
        }
    }
}
