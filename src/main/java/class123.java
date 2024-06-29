import jaclib.memory.Buffer;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ik")
public class class123 extends class441 implements class211 {

    @OriginalMember(owner = "client!ik", name = "f", descriptor = "I")
    private int field1625;

    @OriginalMember(owner = "client!ik", name = "j", descriptor = "Lqk;")
    public static class1 field1629 = new class1(45, 4);

    @OriginalMember(owner = "client!ik", name = "c", descriptor = "I")
    public static int field1622;

    @OriginalMember(owner = "client!ik", name = "d", descriptor = "I")
    public static int field1623;

    @OriginalMember(owner = "client!ik", name = "e", descriptor = "I")
    public static int field1624;

    @OriginalMember(owner = "client!ik", name = "g", descriptor = "I")
    public static int field1626;

    @OriginalMember(owner = "client!ik", name = "h", descriptor = "I")
    public static int field1627;

    @OriginalMember(owner = "client!ik", name = "i", descriptor = "I")
    public static int field1628;

    @OriginalMember(owner = "client!ik", name = "k", descriptor = "I")
    public static int field1630;

    @OriginalMember(owner = "client!ik", name = "a", descriptor = "(II[BI)V", line = 3)
    public final void method864(int arg0, int arg1, byte[] arg2, int arg3) {
        if (arg3 != -26434) {
            this.method866(-33);
        }
        ++field1627;
        this.method2635(arg2, arg0);
        this.field1625 = arg1;
    }

    @OriginalMember(owner = "client!ik", name = "<init>", descriptor = "(Lpq;ILjaclib/memory/Buffer;)V", line = 15)
    public class123(class194 arg0, int arg1, Buffer arg2) {
        super(arg0, arg2);
        this.field1625 = arg1;
    }

    @OriginalMember(owner = "client!ik", name = "a", descriptor = "(III)Z", line = 23)
    public static final boolean method865(int arg0, int arg1, int arg2) {
        int var3 = -78 % ((arg2 - -21) / 34);
        ++field1628;
        if (arg0 >= 0 && arg1 >= 0 && ~class533.field7338[1].length < ~arg0 && ~arg1 > ~class533.field7338[1][arg0].length) {
            return ~(class533.field7338[1][arg0][arg1] & 2) != -1;
        } else {
            return false;
        }
    }

    @OriginalMember(owner = "client!ik", name = "a", descriptor = "(I)I", line = 40)
    public final int method866(int arg0) {
        if (arg0 >= -2) {
            field1630 = -81;
        }
        ++field1623;
        return 0;
    }

    @OriginalMember(owner = "client!ik", name = "a", descriptor = "(Z)I", line = 51)
    public final int method867(boolean arg0) {
        if (!arg0) {
            this.field1625 = -69;
        }
        ++field1626;
        return this.field1625;
    }

    @OriginalMember(owner = "client!ik", name = "b", descriptor = "(I)V", line = 62)
    public static void method868(int arg0) {
        field1629 = null;
        if (arg0 <= 61) {
            field1630 = 84;
        }
    }

    @OriginalMember(owner = "client!ik", name = "b", descriptor = "(Z)J", line = 81)
    public final long method869(boolean arg0) {
        if (arg0) {
            return -69L;
        } else {
            ++field1624;
            return super.field6077.getAddress();
        }
    }

    @OriginalMember(owner = "client!ik", name = "<init>", descriptor = "(Lpq;I[BI)V", line = 92)
    public class123(class194 arg0, int arg1, byte[] arg2, int arg3) {
        super(arg0, arg2, arg3);
        this.field1625 = arg1;
    }
}
