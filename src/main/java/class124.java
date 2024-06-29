import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!lo")
public class class124 extends class86 {

    @OriginalMember(owner = "client!lo", name = "g", descriptor = "I")
    public static int field1648;

    @OriginalMember(owner = "client!lo", name = "h", descriptor = "I")
    public static int field1649;

    @OriginalMember(owner = "client!lo", name = "i", descriptor = "I")
    public static int field1650;

    @OriginalMember(owner = "client!lo", name = "j", descriptor = "I")
    public static int field1651;

    @OriginalMember(owner = "client!lo", name = "k", descriptor = "I")
    public static int field1652;

    @OriginalMember(owner = "client!lo", name = "l", descriptor = "I")
    public static int field1653;

    @OriginalMember(owner = "client!lo", name = "<init>", descriptor = "(Lsf;)V")
    public class124(class551 arg0) {
        super(arg0);
    }

    @OriginalMember(owner = "client!lo", name = "a", descriptor = "(IZ)V")
    public final void method76(int arg0, boolean arg1) {
        ++field1651;
        super.field1200 = arg0;
        if (!arg1) {
            ;
        }
    }

    @OriginalMember(owner = "client!lo", name = "b", descriptor = "(II)I")
    public final int method72(int arg0, int arg1) {
        if (arg1 != -2) {
            this.method72(37, 99);
        }
        ++field1648;
        return 1;
    }

    @OriginalMember(owner = "client!lo", name = "a", descriptor = "(Z)I")
    public final int method731(boolean arg0) {
        ++field1652;
        return arg0 ? -122 : super.field1200;
    }

    @OriginalMember(owner = "client!lo", name = "a", descriptor = "(B)V")
    public final void method71(byte arg0) {
        if (arg0 == -65) {
            ++field1650;
            if (~super.field1200 != -2 && super.field1200 != 0) {
                super.field1200 = this.method73(0);
            }
        }
    }

    @OriginalMember(owner = "client!lo", name = "b", descriptor = "(I)I")
    public final int method73(int arg0) {
        if (arg0 != 0) {
            return 28;
        } else {
            ++field1653;
            return 1;
        }
    }

    @OriginalMember(owner = "client!lo", name = "<init>", descriptor = "(ILsf;)V")
    public class124(int arg0, class551 arg1) {
        super(arg0, arg1);
    }

    @OriginalMember(owner = "client!lo", name = "c", descriptor = "(II)Z")
    public static final boolean method732(int arg0, int arg1) {
        if (arg1 <= 30) {
            return false;
        } else {
            ++field1649;
            return arg0 == 1 || ~arg0 == -4 || ~arg0 == -6;
        }
    }
}
