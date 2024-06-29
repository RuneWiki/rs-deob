import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ul")
public abstract class class597 {

    @OriginalMember(owner = "client!ul", name = "a", descriptor = "Lbu;")
    public static class21 field8397 = new class21(75, -2);

    @OriginalMember(owner = "client!ul", name = "b", descriptor = "I")
    public static int field8398;

    @OriginalMember(owner = "client!ul", name = "c", descriptor = "I")
    public static int field8399;

    @OriginalMember(owner = "client!ul", name = "d", descriptor = "I")
    public static int field8400;

    @OriginalMember(owner = "client!ul", name = "f", descriptor = "I")
    public static int field8402;

    @OriginalMember(owner = "client!ul", name = "e", descriptor = "Lwia;")
    public static class791 field8401;

    @OriginalMember(owner = "client!ul", name = "a", descriptor = "(II)V", line = 12)
    public static final void method3484(int arg0, int arg1) {
        field8399++;
        class313 var2 = class312.method1998((long) arg0, arg1, -1);
        var2.method2006(94);
    }

    @OriginalMember(owner = "client!ul", name = "d", descriptor = "(B)V", line = 30)
    public static void method3485(byte arg0) {
        field8397 = null;
        field8401 = null;
        if (arg0 != 67) {
            method3485((byte) 127);
        }
    }

    @OriginalMember(owner = "client!ul", name = "e", descriptor = "(I)Z", line = 43)
    public final boolean method3486(int arg0) {
        if (arg0 != 9) {
            this.method2655((byte) 1);
        }
        field8400++;
        return this.method2647(arg0 + 108) || this.method2653((byte) -57) || this.method2658(-2);
    }

    @OriginalMember(owner = "client!ul", name = "a", descriptor = "(I)Z")
    public abstract boolean method2647(int arg0);

    @OriginalMember(owner = "client!ul", name = "a", descriptor = "(B)Z")
    public abstract boolean method2653(byte arg0);

    @OriginalMember(owner = "client!ul", name = "b", descriptor = "(I)Lrm;")
    public abstract class430 method2651(int arg0);

    @OriginalMember(owner = "client!ul", name = "c", descriptor = "(I)Z")
    public abstract boolean method2658(int arg0);

    @OriginalMember(owner = "client!ul", name = "b", descriptor = "(B)V")
    public abstract void method2655(byte arg0);

    @OriginalMember(owner = "client!ul", name = "d", descriptor = "(I)V")
    public abstract void method2652(int arg0);

    @OriginalMember(owner = "client!ul", name = "c", descriptor = "(B)I")
    public abstract int method2650(byte arg0);

    @OriginalMember(owner = "client!ul", name = "f", descriptor = "(I)I")
    public abstract int method2646(int arg0);
}
