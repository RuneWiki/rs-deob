import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!mo")
public class class695 {

    @OriginalMember(owner = "client!mo", name = "c", descriptor = "I")
    public int field9793;

    @OriginalMember(owner = "client!mo", name = "a", descriptor = "I")
    public static int field9791;

    @OriginalMember(owner = "client!mo", name = "b", descriptor = "I")
    public static int field9792;

    @OriginalMember(owner = "client!mo", name = "d", descriptor = "I")
    public static int field9794;

    @OriginalMember(owner = "client!mo", name = "e", descriptor = "I")
    public static int field9795;

    @OriginalMember(owner = "client!mo", name = "f", descriptor = "I")
    public static int field9796;

    @OriginalMember(owner = "client!mo", name = "a", descriptor = "(III)I")
    public static final int method3890(int arg0, int arg1, int arg2) {
        field9794++;
        if (arg0 == -1) {
            return 12345678;
        }
        int var3 = (arg0 & 0x7F) * arg1 >> 7;
        if (arg2 < ~var3) {
            var3 = 2;
        } else if (var3 > 126) {
            var3 = 126;
        }
        return (arg0 & 0xFF80) + var3;
    }

    @OriginalMember(owner = "client!mo", name = "toString", descriptor = "()Ljava/lang/String;")
    public final String toString() {
        field9795++;
        throw new IllegalStateException();
    }

    @OriginalMember(owner = "client!mo", name = "a", descriptor = "(I)I")
    public final int method3891(int arg0) {
        field9791++;
        return arg0 == -6 ? this.field9793 : -38;
    }

    @OriginalMember(owner = "client!mo", name = "a", descriptor = "(BJ)V")
    public static final void method3892(byte arg0, long arg1) {
        if (arg0 != -11) {
            field9792 = 93;
        }
        if (class257.field3792 != null) {
            if (class423.field6123 == 1 || class423.field6123 == 5) {
                class132.method1104(arg1, -17342);
            } else if (class423.field6123 == 4) {
                class391.method2412(arg1, arg0 + 10);
            }
        }
        field9796++;
        class194.method1397((long) class336.field5031, class623.field9017, 0);
        if (class361.field5368 != -1) {
            class437.method2647(1, class361.field5368);
        }
        for (int var3 = 0; var3 < class152.field2587; var3++) {
            if (class248.field3731[var3]) {
                class480.field6901[var3] = true;
            }
            class338.field5050[var3] = class248.field3731[var3];
            class248.field3731[var3] = false;
        }
        class545.field7632 = class336.field5031;
        if (class361.field5368 != -1) {
            class152.field2587 = 0;
            class363.method2309((byte) 110);
        }
        class623.field9017.method107();
        class461.method2760(1, class623.field9017);
        int var4 = class141.method1143(arg0 + 11);
        if (var4 == -1) {
            var4 = class139.field2461;
        }
        if (var4 == -1) {
            var4 = class617.field8961;
        }
        class605.method3474(var4, 23637);
        class638.method3638(class620.field8990, class532.field7456.field9806, class532.field7456.field9815, class532.field7456.field9814, false);
        class620.field8990 = 0;
    }

    @OriginalMember(owner = "client!mo", name = "<init>", descriptor = "(Ljava/lang/String;I)V")
    public class695(String arg0, int arg1) {
        this.field9793 = arg1;
    }
}
