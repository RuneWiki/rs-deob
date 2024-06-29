import java.io.IOException;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!mh")
public abstract class class548 {

    @OriginalMember(owner = "client!mh", name = "a", descriptor = "I")
    public static int field7839;

    @OriginalMember(owner = "client!mh", name = "b", descriptor = "I")
    public static int field7840;

    @OriginalMember(owner = "client!mh", name = "a", descriptor = "(ZB)V", line = 5)
    public static final void method3186(boolean arg0, byte arg1) {
        field7839++;
        class453.method2798((byte) -110);
        if (!class463.method2838(arg1 ^ 0x47, class133.field1673)) {
            return;
        }
        class290.field4012++;
        if (class290.field4012 < 50 && !arg0) {
            return;
        }
        class290.field4012 = 0;
        if (!class248.field3523 && class170.field2077 != null) {
            class147.field1807++;
            class308.method2044(class193.field2552, -7434);
            try {
                class170.field2077.method1840(0, class468.field6960.field2610, class468.field6960.field2622, arg1 - 77);
                class468.field6960.field2610 = 0;
            } catch (IOException var2) {
                class248.field3523 = true;
            }
        }
        if (arg1 == 77) {
            class453.method2798((byte) -94);
        }
    }

    @OriginalMember(owner = "client!mh", name = "a", descriptor = "(IJ)I", line = 48)
    public final int method3187(int arg0, long arg1) {
        if (arg0 > -126) {
            return 37;
        }
        field7840++;
        long var4 = this.method1605(12948);
        if (var4 > 0L) {
            class646.method3696(1, var4);
        }
        return this.method1604(arg1, 50);
    }

    @OriginalMember(owner = "client!mh", name = "a", descriptor = "(JI)I")
    public abstract int method1604(long arg0, int arg1);

    @OriginalMember(owner = "client!mh", name = "a", descriptor = "(B)V")
    public abstract void method1606(byte arg0);

    @OriginalMember(owner = "client!mh", name = "a", descriptor = "(I)J")
    public abstract long method1605(int arg0);

    @OriginalMember(owner = "client!mh", name = "b", descriptor = "(B)J")
    public abstract long method1607(byte arg0);
}
