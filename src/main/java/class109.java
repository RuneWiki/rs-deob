import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ec")
public class class109 extends class86 {

    @OriginalMember(owner = "client!ec", name = "g", descriptor = "I")
    public static int field1469;

    @OriginalMember(owner = "client!ec", name = "h", descriptor = "I")
    public static int field1470;

    @OriginalMember(owner = "client!ec", name = "i", descriptor = "I")
    public static int field1471;

    @OriginalMember(owner = "client!ec", name = "j", descriptor = "I")
    public static int field1472;

    @OriginalMember(owner = "client!ec", name = "k", descriptor = "I")
    public static int field1473;

    @OriginalMember(owner = "client!ec", name = "a", descriptor = "(Z)I")
    public final int method643(boolean arg0) {
        if (arg0) {
            return 69;
        } else {
            ++field1469;
            return super.field1200;
        }
    }

    @OriginalMember(owner = "client!ec", name = "b", descriptor = "(II)I")
    public final int method72(int arg0, int arg1) {
        if (arg1 != -2) {
            return 110;
        } else {
            ++field1473;
            return 1;
        }
    }

    @OriginalMember(owner = "client!ec", name = "<init>", descriptor = "(Lsf;)V")
    public class109(class551 arg0) {
        super(arg0);
    }

    @OriginalMember(owner = "client!ec", name = "b", descriptor = "(I)I")
    public final int method73(int arg0) {
        ++field1472;
        if (arg0 != 0) {
            this.method643(true);
        }
        return !super.field1203.method2983(-19236).method724((byte) -97) ? 2 : 3;
    }

    @OriginalMember(owner = "client!ec", name = "<init>", descriptor = "(ILsf;)V")
    public class109(int arg0, class551 arg1) {
        super(arg0, arg1);
    }

    @OriginalMember(owner = "client!ec", name = "a", descriptor = "(B)V")
    public final void method71(byte arg0) {
        ++field1471;
        if (super.field1200 < 1 || ~super.field1200 < -4) {
            super.field1200 = this.method73(0);
        }
        if (arg0 == -65) {
            ;
        }
    }

    @OriginalMember(owner = "client!ec", name = "a", descriptor = "(IZ)V")
    public final void method76(int arg0, boolean arg1) {
        if (arg1) {
            this.method643(true);
        }
        super.field1200 = arg0;
        ++field1470;
    }
}
