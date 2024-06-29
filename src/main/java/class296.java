import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!fda")
public abstract class class296 {

    @OriginalMember(owner = "client!fda", name = "c", descriptor = "J")
    public static long field4181 = -1L;

    @OriginalMember(owner = "client!fda", name = "d", descriptor = "F")
    public static float field4182;

    @OriginalMember(owner = "client!fda", name = "a", descriptor = "I")
    public static int field4179;

    @OriginalMember(owner = "client!fda", name = "b", descriptor = "I")
    public static int field4180;

    @OriginalMember(owner = "client!fda", name = "e", descriptor = "I")
    public static int field4183;

    @OriginalMember(owner = "client!fda", name = "a", descriptor = "(JZ)I", line = 5)
    public final int method1816(long arg0, boolean arg1) {
        if (!arg1) {
            this.method1273(4);
        }
        field4183++;
        long var4 = this.method1273(125);
        if (var4 > 0L) {
            class486.method2722(0, var4);
        }
        return this.method1271(!arg1, arg0);
    }

    @OriginalMember(owner = "client!fda", name = "c", descriptor = "(I)I", line = 25)
    public static final int method1817(int arg0) {
        field4179++;
        if (arg0 != 0) {
            method1818(null, -127);
        }
        class666 var1 = class603.field8015;
        synchronized (class603.field8015) {
            return class603.field8015.method3736(4093);
        }
    }

    @OriginalMember(owner = "client!fda", name = "a", descriptor = "(Loa;I)V", line = 47)
    public static final void method1818(class651 arg0, int arg1) {
        field4180++;
        if (class138.field2239 == class199.field2897.field8609 || class703.field9899 == null) {
            return;
        }
        if (arg1 != 28938) {
            method1818(null, 125);
        }
        if (class195.method1265(class199.field2897.field8609, arg0, 4)) {
            class138.field2239 = class199.field2897.field8609;
        }
    }

    @OriginalMember(owner = "client!fda", name = "a", descriptor = "(I)V")
    public abstract void method1269(int arg0);

    @OriginalMember(owner = "client!fda", name = "b", descriptor = "(I)J")
    public abstract long method1272(int arg0);

    @OriginalMember(owner = "client!fda", name = "a", descriptor = "(ZJ)I")
    public abstract int method1271(boolean arg0, long arg1);

    @OriginalMember(owner = "client!fda", name = "d", descriptor = "(I)J")
    public abstract long method1273(int arg0);
}
