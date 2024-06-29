import jaclib.memory.Buffer;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!bu")
public class class141 extends class65 implements class585 {

    @OriginalMember(owner = "client!bu", name = "n", descriptor = "I")
    private int field1823;

    @OriginalMember(owner = "client!bu", name = "u", descriptor = "Lgb;")
    public static class162 field1830 = new class162();

    @OriginalMember(owner = "client!bu", name = "o", descriptor = "I")
    public static int field1824;

    @OriginalMember(owner = "client!bu", name = "p", descriptor = "I")
    public static int field1825;

    @OriginalMember(owner = "client!bu", name = "q", descriptor = "I")
    public static int field1826;

    @OriginalMember(owner = "client!bu", name = "r", descriptor = "I")
    public static int field1827;

    @OriginalMember(owner = "client!bu", name = "s", descriptor = "I")
    public static int field1828;

    @OriginalMember(owner = "client!bu", name = "t", descriptor = "I")
    public static int field1829;

    @OriginalMember(owner = "client!bu", name = "a", descriptor = "(I)I", line = 9)
    public final int method824(int arg0) {
        if (arg0 != 30991) {
            return 37;
        } else {
            ++field1829;
            return this.field1823;
        }
    }

    @OriginalMember(owner = "client!bu", name = "b", descriptor = "(B)V", line = 20)
    public final void method389(byte arg0) {
        super.field885.method3000((byte) -124, this);
        if (arg0 != -54) {
            this.field1823 = -29;
        }
        ++field1827;
    }

    @OriginalMember(owner = "client!bu", name = "<init>", descriptor = "(Lqj;ILjaclib/memory/Buffer;IZ)V", line = 32)
    public class141(class548 arg0, int arg1, Buffer arg2, int arg3, boolean arg4) {
        super(arg0, 34962, arg2, arg3, arg4);
        this.field1823 = arg1;
    }

    @OriginalMember(owner = "client!bu", name = "a", descriptor = "(B)J", line = 41)
    public final long method825(byte arg0) {
        int var2 = 55 / ((-48 - arg0) / 35);
        ++field1824;
        return 0L;
    }

    @OriginalMember(owner = "client!bu", name = "d", descriptor = "(I)V", line = 52)
    public static void method826(int arg0) {
        int var1 = 98 % ((-54 - arg0) / 43);
        field1830 = null;
    }

    @OriginalMember(owner = "client!bu", name = "<init>", descriptor = "(Lqj;I[BIZ)V", line = 61)
    public class141(class548 arg0, int arg1, byte[] arg2, int arg3, boolean arg4) {
        super(arg0, 34962, arg2, arg3, arg4);
        this.field1823 = arg1;
    }

    @OriginalMember(owner = "client!bu", name = "a", descriptor = "(Lrj;Lpl;I)V", line = 72)
    public static final void method827(class648 arg0, class612 arg1, int arg2) {
        class491.field6490 = "";
        class560.field7786 = arg0;
        ++field1826;
        class635.field8918 = arg1;
        if (class367.field4661.startsWith("win")) {
            class491.field6490 = class491.field6490 + "windows/";
        } else if (!class367.field4661.startsWith("linux")) {
            if (class367.field4661.startsWith("mac")) {
                class491.field6490 = class491.field6490 + "macos/";
            }
        } else {
            class491.field6490 = class491.field6490 + "linux/";
        }
        if (arg2 == -3550) {
            if (class560.field7786.field9138) {
                class491.field6490 = class491.field6490 + "msjava/";
            } else if (!class367.field4664.startsWith("amd64") && !class367.field4664.startsWith("x86_64")) {
                if (!class367.field4664.startsWith("i386") && !class367.field4664.startsWith("i486") && !class367.field4664.startsWith("i586") && !class367.field4664.startsWith("x86")) {
                    if (!class367.field4664.startsWith("ppc")) {
                        class491.field6490 = class491.field6490 + "universal/";
                    } else {
                        class491.field6490 = class491.field6490 + "ppc/";
                    }
                } else {
                    class491.field6490 = class491.field6490 + "x86/";
                }
            } else {
                class491.field6490 = class491.field6490 + "x86_64/";
            }
        }
    }

    @OriginalMember(owner = "client!bu", name = "b", descriptor = "(I)I", line = 121)
    public final int method828(int arg0) {
        ++field1828;
        return arg0 != 13003 ? -100 : super.field886;
    }

    @OriginalMember(owner = "client!bu", name = "a", descriptor = "([BIIB)V", line = 133)
    public final void method829(byte[] arg0, int arg1, int arg2, byte arg3) {
        if (arg3 == -80) {
            this.method388((byte) 120, arg0, arg1);
            ++field1825;
            this.field1823 = arg2;
        }
    }
}
