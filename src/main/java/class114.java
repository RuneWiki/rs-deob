import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ql")
public class class114 extends class86 {

    @OriginalMember(owner = "client!ql", name = "g", descriptor = "Luw;")
    public static class208 field1505 = new class208(19, 4);

    @OriginalMember(owner = "client!ql", name = "m", descriptor = "Luw;")
    public static class208 field1511 = new class208(111, -2);

    @OriginalMember(owner = "client!ql", name = "h", descriptor = "I")
    public static int field1506;

    @OriginalMember(owner = "client!ql", name = "i", descriptor = "I")
    public static int field1507;

    @OriginalMember(owner = "client!ql", name = "j", descriptor = "I")
    public static int field1508;

    @OriginalMember(owner = "client!ql", name = "k", descriptor = "I")
    public static int field1509;

    @OriginalMember(owner = "client!ql", name = "l", descriptor = "I")
    public static int field1510;

    @OriginalMember(owner = "client!ql", name = "n", descriptor = "I")
    public static int field1512;

    @OriginalMember(owner = "client!ql", name = "c", descriptor = "(I)Z", line = 4)
    public final boolean method664(int arg0) {
        ++field1508;
        if (super.field1203.method2981(-14)) {
            return false;
        } else {
            int var2 = 35 % ((arg0 - -57) / 57);
            return ~super.field1203.field6913.method3304(false) != -1;
        }
    }

    @OriginalMember(owner = "client!ql", name = "a", descriptor = "(Z)I", line = 20)
    public final int method665(boolean arg0) {
        if (arg0) {
            return -12;
        } else {
            ++field1509;
            return super.field1200;
        }
    }

    @OriginalMember(owner = "client!ql", name = "d", descriptor = "(I)V", line = 33)
    public static void method666(int arg0) {
        field1511 = null;
        if (arg0 != -1) {
            field1505 = null;
        }
        field1505 = null;
    }

    @OriginalMember(owner = "client!ql", name = "b", descriptor = "(I)I", line = 44)
    public final int method73(int arg0) {
        ++field1510;
        if (arg0 != 0) {
            field1505 = null;
        }
        return 2;
    }

    @OriginalMember(owner = "client!ql", name = "a", descriptor = "(IZ)V", line = 56)
    public final void method76(int arg0, boolean arg1) {
        super.field1200 = arg0;
        ++field1506;
        if (arg1) {
            field1511 = null;
        }
    }

    @OriginalMember(owner = "client!ql", name = "a", descriptor = "(B)V", line = 69)
    public final void method71(byte arg0) {
        if (super.field1203.method2981(-14)) {
            super.field1200 = 0;
        }
        ++field1512;
        if (~super.field1203.field6913.method3304(false) == -1) {
            super.field1200 = 0;
        }
        if (~super.field1200 > -1 || super.field1200 > 2) {
            super.field1200 = this.method73(0);
        }
        if (arg0 != -65) {
            this.method76(127, false);
        }
    }

    @OriginalMember(owner = "client!ql", name = "<init>", descriptor = "(Lsf;)V", line = 89)
    public class114(class551 arg0) {
        super(arg0);
    }

    @OriginalMember(owner = "client!ql", name = "b", descriptor = "(II)I", line = 99)
    public final int method72(int arg0, int arg1) {
        if (arg1 != -2) {
            field1505 = null;
        }
        ++field1507;
        if (super.field1203.method2981(arg1 ^ 12)) {
            return 3;
        } else {
            return ~super.field1203.field6913.method3304(false) == -1 ? 3 : 1;
        }
    }

    @OriginalMember(owner = "client!ql", name = "<init>", descriptor = "(ILsf;)V", line = 121)
    public class114(int arg0, class551 arg1) {
        super(arg0, arg1);
    }
}
