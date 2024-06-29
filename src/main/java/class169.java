import jaclib.memory.Buffer;
import jaclib.memory.Source;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!jh")
public class class169 extends class116 implements class553 {

    @OriginalMember(owner = "client!jh", name = "y", descriptor = "Z")
    public static boolean field2642 = false;

    @OriginalMember(owner = "client!jh", name = "B", descriptor = "[I")
    public static int[] field2645 = new int[1];

    @OriginalMember(owner = "client!jh", name = "G", descriptor = "B")
    private byte field2649;

    @OriginalMember(owner = "client!jh", name = "x", descriptor = "I")
    public static int field2641;

    @OriginalMember(owner = "client!jh", name = "z", descriptor = "I")
    public static int field2643;

    @OriginalMember(owner = "client!jh", name = "A", descriptor = "I")
    public static int field2644;

    @OriginalMember(owner = "client!jh", name = "C", descriptor = "I")
    public static int field2646;

    @OriginalMember(owner = "client!jh", name = "D", descriptor = "I")
    public static int field2647;

    @OriginalMember(owner = "client!jh", name = "F", descriptor = "I")
    public static int field2648;

    @OriginalMember(owner = "client!jh", name = "H", descriptor = "I")
    public static int field2650;

    @OriginalMember(owner = "client!jh", name = "I", descriptor = "I")
    public static int field2651;

    @OriginalMember(owner = "client!jh", name = "J", descriptor = "I")
    public static int field2652;

    @OriginalMember(owner = "client!jh", name = "K", descriptor = "I")
    public static int field2653;

    @OriginalMember(owner = "client!jh", name = "L", descriptor = "I")
    public static int field2654;

    @OriginalMember(owner = "client!jh", name = "b", descriptor = "(B)V", line = 4)
    public final void method602(byte arg0) {
        ++field2653;
        super.method602(arg0);
    }

    @OriginalMember(owner = "client!jh", name = "a", descriptor = "(I)Z", line = 14)
    public final boolean method678(int arg0) {
        ++field2648;
        if (arg0 != 14234) {
            this.method1250((byte) -123);
        }
        return super.method868((byte) 75, super.field1766.field7660);
    }

    @OriginalMember(owner = "client!jh", name = "<init>", descriptor = "(Lko;Z)V", line = 29)
    public class169(class529 arg0, boolean arg1) {
        super(arg0, 34962, arg1);
    }

    @OriginalMember(owner = "client!jh", name = "a", descriptor = "(IIZ)Z", line = 33)
    public final boolean method679(int arg0, int arg1, boolean arg2) {
        if (!arg2) {
            return true;
        } else {
            this.field2649 = (byte) arg1;
            ++field2654;
            super.method604(arg0, 127);
            return true;
        }
    }

    @OriginalMember(owner = "client!jh", name = "b", descriptor = "(I)I", line = 49)
    public final int method600(int arg0) {
        int var2 = -116 / ((-54 - arg0) / 56);
        ++field2644;
        return super.method600(-126);
    }

    @OriginalMember(owner = "client!jh", name = "a", descriptor = "(BZ)Ljaclib/memory/Buffer;", line = 59)
    public final Buffer method676(byte arg0, boolean arg1) {
        int var3 = 103 / ((21 - arg0) / 48);
        ++field2641;
        return super.method869(arg1, super.field1766.field7660, (byte) -3);
    }

    @OriginalMember(owner = "client!jh", name = "a", descriptor = "(B)I", line = 69)
    public final int method1250(byte arg0) {
        if (arg0 < 92) {
            return -117;
        } else {
            ++field2643;
            return this.field2649;
        }
    }

    @OriginalMember(owner = "client!jh", name = "a", descriptor = "(ZLfb;)V", line = 85)
    public static final void method1251(boolean arg0, class702 arg1) {
        if (arg0) {
            field2647 = -113;
        }
        ++field2651;
        class513 var2 = (class513) class585.field8269.method2242((long) arg1.field4640, -1);
        if (var2 != null) {
            if (var2.field7236 != null) {
                class184.field2828.method426(var2.field7236);
                var2.field7236 = null;
            }
            var2.method3387((byte) -50);
        }
    }

    @OriginalMember(owner = "client!jh", name = "d", descriptor = "(B)V", line = 112)
    public static void method1252(byte arg0) {
        field2645 = null;
        if (arg0 <= 61) {
            field2646 = 55;
        }
    }

    @OriginalMember(owner = "client!jh", name = "a", descriptor = "(IILjaclib/memory/Source;I)Z", line = 125)
    public final boolean method680(int arg0, int arg1, Source arg2, int arg3) {
        this.field2649 = (byte) arg0;
        ++field2652;
        if (arg1 < 71) {
            return false;
        } else {
            super.method866(arg2, arg3, 35044);
            return true;
        }
    }

    @OriginalMember(owner = "client!jh", name = "b", descriptor = "(IBI)Z", line = 141)
    public static final boolean method1253(int arg0, byte arg1, int arg2) {
        ++field2650;
        if (arg1 < 31) {
            field2642 = true;
        }
        return (34 & arg2) != 0;
    }
}
