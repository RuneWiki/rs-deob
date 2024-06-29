import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!fu")
public class class666 extends class86 {

    @OriginalMember(owner = "client!fu", name = "g", descriptor = "I")
    public static int field8670 = -1;

    @OriginalMember(owner = "client!fu", name = "h", descriptor = "I")
    public static int field8671;

    @OriginalMember(owner = "client!fu", name = "i", descriptor = "I")
    public static int field8672;

    @OriginalMember(owner = "client!fu", name = "j", descriptor = "I")
    public static int field8673;

    @OriginalMember(owner = "client!fu", name = "k", descriptor = "I")
    public static int field8674;

    @OriginalMember(owner = "client!fu", name = "l", descriptor = "I")
    public static int field8675;

    @OriginalMember(owner = "client!fu", name = "a", descriptor = "(Z)I")
    public final int method3616(boolean arg0) {
        if (arg0) {
            return -66;
        } else {
            ++field8673;
            return super.field1200;
        }
    }

    @OriginalMember(owner = "client!fu", name = "b", descriptor = "(I)I")
    public final int method73(int arg0) {
        if (arg0 != 0) {
            field8670 = 48;
        }
        ++field8671;
        return 2;
    }

    @OriginalMember(owner = "client!fu", name = "<init>", descriptor = "(Lsf;)V")
    public class666(class551 arg0) {
        super(arg0);
    }

    @OriginalMember(owner = "client!fu", name = "a", descriptor = "(IZ)V")
    public final void method76(int arg0, boolean arg1) {
        ++field8675;
        if (arg1) {
            this.method73(46);
        }
        super.field1200 = arg0;
    }

    @OriginalMember(owner = "client!fu", name = "a", descriptor = "(B)V")
    public final void method71(byte arg0) {
        ++field8672;
        if (super.field1203.field6927.method1820((byte) -124) && ~super.field1200 == -3) {
            super.field1200 = 1;
        }
        if (arg0 != -65) {
            this.method71((byte) 82);
        }
        if (super.field1200 < 0 || ~super.field1200 < -3) {
            super.field1200 = this.method73(0);
        }
    }

    @OriginalMember(owner = "client!fu", name = "<init>", descriptor = "(ILsf;)V")
    public class666(int arg0, class551 arg1) {
        super(arg0, arg1);
    }

    @OriginalMember(owner = "client!fu", name = "b", descriptor = "(II)I")
    public final int method72(int arg0, int arg1) {
        ++field8674;
        if (arg1 != -2) {
            field8670 = -47;
        }
        return 1;
    }
}
