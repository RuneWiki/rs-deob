import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!tn")
public class class721 {

    @OriginalMember(owner = "client!tn", name = "e", descriptor = "I")
    public static int field10031 = 0;

    @OriginalMember(owner = "client!tn", name = "a", descriptor = "I")
    public int field10027;

    @OriginalMember(owner = "client!tn", name = "b", descriptor = "I")
    public static int field10028;

    @OriginalMember(owner = "client!tn", name = "c", descriptor = "I")
    public static int field10029;

    @OriginalMember(owner = "client!tn", name = "d", descriptor = "I")
    public static int field10030;

    @OriginalMember(owner = "client!tn", name = "f", descriptor = "I")
    public int field10032;

    @OriginalMember(owner = "client!tn", name = "g", descriptor = "I")
    public int field10033;

    @OriginalMember(owner = "client!tn", name = "i", descriptor = "I")
    public static int field10035;

    @OriginalMember(owner = "client!tn", name = "h", descriptor = "Z")
    public boolean field10034;

    @OriginalMember(owner = "client!tn", name = "a", descriptor = "(Z)I", line = 6)
    public static final int method4038(boolean arg0) {
        if (!arg0) {
            field10028 = 92;
        }
        field10035++;
        return class521.field7260 == 1 ? class26.field325 : 0;
    }

    @OriginalMember(owner = "client!tn", name = "a", descriptor = "(ZII)Z", line = 21)
    public static final boolean method4039(boolean arg0, int arg1, int arg2) {
        field10029++;
        if (arg0) {
            field10031 = -121;
        }
        return (arg1 & 0xC580) != 0;
    }

    @OriginalMember(owner = "client!tn", name = "a", descriptor = "(IB)V", line = 44)
    public static final void method4040(int arg0, byte arg1) {
        class459.field6373 = arg0;
        if (arg1 > -9) {
            field10031 = -35;
        }
        class217.field2826 = 1;
        class517.field7221 = 0;
        class524.field7281 = null;
        class202.field2679 = false;
        class720.field10022 = -1;
        class123.field1689 = null;
        class438.field6107 = -1;
        field10030++;
    }
}
