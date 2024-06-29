import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!wf")
public class class138 extends class154 {

    @OriginalMember(owner = "client!wf", name = "q", descriptor = "I")
    public int field1978 = -1;

    @OriginalMember(owner = "client!wf", name = "t", descriptor = "Z")
    public static boolean field1981 = false;

    @OriginalMember(owner = "client!wf", name = "s", descriptor = "Lde;")
    public static class534 field1980 = new class534(4);

    @OriginalMember(owner = "client!wf", name = "m", descriptor = "I")
    public static int field1974;

    @OriginalMember(owner = "client!wf", name = "o", descriptor = "I")
    public static int field1976;

    @OriginalMember(owner = "client!wf", name = "r", descriptor = "I")
    public int field1979;

    @OriginalMember(owner = "client!wf", name = "n", descriptor = "Ljava/lang/String;")
    public String field1975;

    @OriginalMember(owner = "client!wf", name = "p", descriptor = "Ljava/lang/String;")
    public String field1977;

    @OriginalMember(owner = "client!wf", name = "e", descriptor = "(I)Lms;", line = 5)
    public final class761 method1012(int arg0) {
        ++field1974;
        if (arg0 != -2) {
            this.field1978 = 101;
        }
        return class264.field3336[super.field2095];
    }

    @OriginalMember(owner = "client!wf", name = "a", descriptor = "(Z)V", line = 18)
    public static void method1013(boolean arg0) {
        field1980 = null;
        if (arg0) {
            field1981 = false;
        }
    }

    @OriginalMember(owner = "client!wf", name = "a", descriptor = "(ILaca;Z)V", line = 31)
    public static final void method1014(int arg0, class729 arg1, boolean arg2) {
        int var3 = -109 / ((arg0 - 3) / 51);
        if (!arg1.field10149) {
            if (arg1.field10146 && arg1.field10154 >= 1 && arg1.field10139 >= 1 && class409.field5183 + -2 >= arg1.field10154 && ~(class543.field7597 + -2) <= ~arg1.field10139 && (~arg1.field10138 > -1 || class267.method1593(-20700, arg1.field10138, arg1.field10148))) {
                if (!arg2) {
                    class52.method395(arg1.field10147, arg1.field10139, arg1.field10140, arg1.field10138, arg1.field10137, arg1.field10148, -1, arg1.field10154, -2);
                } else {
                    class474.method2708(arg1.field10139, true, arg1.field10140, arg1.field10147, arg1.field10152, arg1.field10154);
                }
                arg1.field10146 = false;
                if (!arg2 && arg1.field10153 == arg1.field10138 && ~arg1.field10153 == 0) {
                    arg1.method1175(-2);
                } else if (!arg2 && ~arg1.field10153 == ~arg1.field10138 && arg1.field10141 == arg1.field10137 && ~arg1.field10148 == ~arg1.field10144) {
                    arg1.method1175(-2);
                }
            }
        } else if (arg1.field10153 < 0 || class267.method1593(-20700, arg1.field10153, arg1.field10144)) {
            if (arg2) {
                class474.method2708(arg1.field10139, true, arg1.field10140, arg1.field10147, (class456) null, arg1.field10154);
            } else {
                class52.method395(arg1.field10147, arg1.field10139, arg1.field10140, arg1.field10153, arg1.field10141, arg1.field10144, -1, arg1.field10154, -2);
            }
            arg1.method1175(-2);
        }
        ++field1976;
    }
}
