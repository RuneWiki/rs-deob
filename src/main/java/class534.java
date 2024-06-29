import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!mq")
public class class534 {

    @OriginalMember(owner = "client!mq", name = "a", descriptor = "I")
    public static int field7400;

    @OriginalMember(owner = "client!mq", name = "b", descriptor = "I")
    public static int field7401;

    @OriginalMember(owner = "client!mq", name = "c", descriptor = "I")
    public static int field7402;

    @OriginalMember(owner = "client!mq", name = "d", descriptor = "I")
    public static int field7403;

    @OriginalMember(owner = "client!mq", name = "a", descriptor = "(ZLdt;)Lbi;", line = 6)
    public static final class506 method3098(boolean arg0, class254 arg1) {
        if (arg0) {
            method3099(-96, -13, 21, 108, 83);
        }
        field7400++;
        return new class506(arg1.method1695(423951304), arg1.method1695(423951304), arg1.method1695(423951304), arg1.method1695(423951304), arg1.method1722(false), arg1.method1731((byte) 64));
    }

    @OriginalMember(owner = "client!mq", name = "toString", descriptor = "()Ljava/lang/String;", line = 19)
    public final String toString() {
        field7401++;
        throw new IllegalStateException();
    }

    @OriginalMember(owner = "client!mq", name = "a", descriptor = "(IIIII)V", line = 30)
    public static final void method3099(int arg0, int arg1, int arg2, int arg3, int arg4) {
        if (class297.field4199 <= (arg1 - arg3) && (arg1 + arg3) <= class45.field472 && class291.field4156 <= (arg4 - arg3) && arg4 + arg3 <= class233.field3099) {
            class112.method832(arg4, false, arg3, arg2, arg1);
        } else {
            class765.method4207(arg4, arg3, 0, arg2, arg1);
        }
        if (arg0 == 7682) {
            field7402++;
        }
    }
}
