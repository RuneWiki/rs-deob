import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!gda")
public class class53 {

    @OriginalMember(owner = "client!gda", name = "b", descriptor = "I")
    private int field602;

    @OriginalMember(owner = "client!gda", name = "h", descriptor = "I")
    public int field608;

    @OriginalMember(owner = "client!gda", name = "e", descriptor = "I")
    public static int field605 = 0;

    @OriginalMember(owner = "client!gda", name = "d", descriptor = "I")
    public static int field604 = 0;

    @OriginalMember(owner = "client!gda", name = "a", descriptor = "I")
    public static int field601;

    @OriginalMember(owner = "client!gda", name = "c", descriptor = "I")
    public static int field603;

    @OriginalMember(owner = "client!gda", name = "f", descriptor = "I")
    public static int field606;

    @OriginalMember(owner = "client!gda", name = "g", descriptor = "I")
    public static int field607;

    @OriginalMember(owner = "client!gda", name = "i", descriptor = "I")
    public static int field609;

    @OriginalMember(owner = "client!gda", name = "a", descriptor = "(III)Z", line = 6)
    public static final boolean method327(int arg0, int arg1, int arg2) {
        if (arg2 == 1485) {
            field607++;
            return (arg0 & 0x800) != 0 && (arg1 & 0x37) != 0;
        } else {
            return false;
        }
    }

    @OriginalMember(owner = "client!gda", name = "toString", descriptor = "()Ljava/lang/String;", line = 18)
    public final String toString() {
        field603++;
        throw new IllegalStateException();
    }

    @OriginalMember(owner = "client!gda", name = "a", descriptor = "(ZLsi;)I", line = 35)
    public static final int method328(boolean arg0, class559 arg1) {
        field609++;
        if (arg0) {
            field605 = 57;
        }
        if (class719.field9987 == arg1) {
            return 7681;
        } else if (class502.field7202 == arg1) {
            return 8448;
        } else if (class589.field8300 == arg1) {
            return 34165;
        } else if (class170.field2330 == arg1) {
            return 260;
        } else if (class116.field1400 == arg1) {
            return 34023;
        } else {
            throw new IllegalArgumentException();
        }
    }

    @OriginalMember(owner = "client!gda", name = "a", descriptor = "(I)I", line = 69)
    public final int method329(int arg0) {
        field601++;
        return arg0 == -20537 ? this.field602 : 72;
    }

    @OriginalMember(owner = "client!gda", name = "<init>", descriptor = "(II)V", line = 83)
    public class53(int arg0, int arg1) {
        this.field602 = arg0;
        this.field608 = arg1;
    }
}
