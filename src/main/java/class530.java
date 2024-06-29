import jaclib.memory.Buffer;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!tp")
public class class530 extends class446 implements class234 {

    @OriginalMember(owner = "client!tp", name = "D", descriptor = "Lti;")
    private class438 field7511;

    @OriginalMember(owner = "client!tp", name = "E", descriptor = "I")
    public static int field7512 = 0;

    @OriginalMember(owner = "client!tp", name = "A", descriptor = "I")
    public static int field7508;

    @OriginalMember(owner = "client!tp", name = "C", descriptor = "I")
    public static int field7510;

    @OriginalMember(owner = "client!tp", name = "F", descriptor = "I")
    public static int field7513;

    @OriginalMember(owner = "client!tp", name = "G", descriptor = "I")
    public static int field7514;

    @OriginalMember(owner = "client!tp", name = "H", descriptor = "I")
    public static int field7515;

    @OriginalMember(owner = "client!tp", name = "I", descriptor = "I")
    public static int field7516;

    @OriginalMember(owner = "client!tp", name = "J", descriptor = "I")
    public static int field7517;

    @OriginalMember(owner = "client!tp", name = "K", descriptor = "I")
    public static int field7518;

    @OriginalMember(owner = "client!tp", name = "B", descriptor = "[Lkr;")
    public static class743[] field7509;

    @OriginalMember(owner = "client!tp", name = "a", descriptor = "(Z)V", line = 5)
    public final void method1496(boolean arg0) {
        super.method1496(arg0);
        ++field7515;
    }

    @OriginalMember(owner = "client!tp", name = "a", descriptor = "(II)V", line = 13)
    public final void method1600(int arg0, int arg1) {
        int var3 = -85 / ((-34 - arg1) / 62);
        ++field7513;
        super.method1600(this.field7511.field6113 * arg0, -112);
    }

    @OriginalMember(owner = "client!tp", name = "<init>", descriptor = "(Leea;Lti;Z)V", line = 25)
    public class530(class132 arg0, class438 arg1, boolean arg2) {
        super(arg0, 34963, arg2);
        this.field7511 = arg1;
    }

    @OriginalMember(owner = "client!tp", name = "c", descriptor = "(I)I", line = 33)
    public final int method1491(int arg0) {
        int var2 = -66 % ((arg0 - -42) / 46);
        ++field7518;
        return super.method1491(-114);
    }

    @OriginalMember(owner = "client!tp", name = "a", descriptor = "(I)Lti;", line = 44)
    public final class438 method1598(int arg0) {
        int var2 = 99 / ((arg0 - 70) / 40);
        ++field7510;
        return this.field7511;
    }

    @OriginalMember(owner = "client!tp", name = "c", descriptor = "(Z)V", line = 55)
    public static final void method3122(boolean arg0) {
        ++field7514;
        if (class443.field6166 != null) {
            class443.field6166.method373((byte) 79);
        }
        if (class338.field4769 != null) {
            class338.field4769.method373((byte) 84);
        }
        if (!arg0) {
            method3123(61);
        }
    }

    @OriginalMember(owner = "client!tp", name = "e", descriptor = "(I)V", line = 84)
    public static void method3123(int arg0) {
        field7509 = null;
        if (arg0 <= 45) {
            field7517 = -3;
        }
    }

    @OriginalMember(owner = "client!tp", name = "b", descriptor = "(I)Z", line = 95)
    public final boolean method1601(int arg0) {
        ++field7508;
        int var2 = -109 / ((arg0 - 79) / 42);
        return super.method2665(super.field6184.field2082, 15064);
    }

    @OriginalMember(owner = "client!tp", name = "a", descriptor = "(ZB)Ljaclib/memory/Buffer;", line = 105)
    public final Buffer method1599(boolean arg0, byte arg1) {
        ++field7516;
        int var3 = 61 / ((arg1 - -57) / 33);
        return super.method2670(arg0, 1, super.field6184.field2082);
    }
}
