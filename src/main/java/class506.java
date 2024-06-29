import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!od")
public class class506 extends class631 {

    @OriginalMember(owner = "client!od", name = "h", descriptor = "F")
    public static float field7247;

    @OriginalMember(owner = "client!od", name = "f", descriptor = "I")
    public static int field7245;

    @OriginalMember(owner = "client!od", name = "g", descriptor = "I")
    public static int field7246;

    @OriginalMember(owner = "client!od", name = "i", descriptor = "I")
    public static int field7248;

    @OriginalMember(owner = "client!od", name = "j", descriptor = "I")
    public static int field7249;

    @OriginalMember(owner = "client!od", name = "l", descriptor = "I")
    public static int field7251;

    @OriginalMember(owner = "client!od", name = "m", descriptor = "I")
    public static int field7252;

    @OriginalMember(owner = "client!od", name = "n", descriptor = "I")
    public static int field7253;

    @OriginalMember(owner = "client!od", name = "k", descriptor = "Lvc;")
    public static class316 field7250;

    @OriginalMember(owner = "client!od", name = "a", descriptor = "(CI)Z", line = 6)
    public static final boolean method2994(char arg0, int arg1) {
        ++field7251;
        if (arg1 != -98) {
            field7247 = 0.52886814F;
        }
        return ~arg0 <= -49 && ~arg0 >= -58 || arg0 >= 'A' && ~arg0 >= -91 || ~arg0 <= -98 && ~arg0 >= -123;
    }

    @OriginalMember(owner = "client!od", name = "<init>", descriptor = "(Leea;)V", line = 17)
    public class506(class131 arg0) {
        super(arg0);
    }

    @OriginalMember(owner = "client!od", name = "a", descriptor = "(IILta;)V", line = 20)
    public final void method1508(int arg0, int arg1, class210 arg2) {
        ++field7245;
        int var4 = -40 % ((52 - arg1) / 62);
        super.field8722.method926(arg2, 107);
        super.field8722.method891(arg0, (byte) 17);
    }

    @OriginalMember(owner = "client!od", name = "d", descriptor = "(I)V", line = 31)
    public static void method2995(int arg0) {
        field7250 = null;
        if (arg0 >= -124) {
            field7247 = -0.97898906F;
        }
    }

    @OriginalMember(owner = "client!od", name = "a", descriptor = "(IZ)V", line = 42)
    public final void method1506(int arg0, boolean arg1) {
        if (arg0 != 17660) {
            this.method1509(false, false);
        }
        ++field7246;
    }

    @OriginalMember(owner = "client!od", name = "a", descriptor = "(III)V", line = 52)
    public final void method1512(int arg0, int arg1, int arg2) {
        ++field7248;
        if (arg1 < 72) {
            field7247 = 1.147347F;
        }
    }

    @OriginalMember(owner = "client!od", name = "b", descriptor = "(I)V", line = 62)
    public final void method1513(int arg0) {
        super.field8722.method916((byte) -54, false);
        if (arg0 < 74) {
            field7250 = null;
        }
        ++field7249;
    }

    @OriginalMember(owner = "client!od", name = "a", descriptor = "(ZZ)V", line = 75)
    public final void method1509(boolean arg0, boolean arg1) {
        ++field7253;
        super.field8722.method916((byte) -93, arg0);
    }

    @OriginalMember(owner = "client!od", name = "a", descriptor = "(B)Z", line = 83)
    public final boolean method1507(byte arg0) {
        ++field7252;
        int var2 = 97 % ((arg0 - -9) / 53);
        return true;
    }
}
