import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!k")
public class class380 {

    @OriginalMember(owner = "client!k", name = "a", descriptor = "I")
    public int field5544;

    @OriginalMember(owner = "client!k", name = "c", descriptor = "I")
    public static int field5546;

    @OriginalMember(owner = "client!k", name = "d", descriptor = "I")
    public int field5547;

    @OriginalMember(owner = "client!k", name = "e", descriptor = "I")
    public static int field5548;

    @OriginalMember(owner = "client!k", name = "f", descriptor = "I")
    public int field5549;

    @OriginalMember(owner = "client!k", name = "b", descriptor = "Lpm;")
    public static class396 field5545;

    @OriginalMember(owner = "client!k", name = "a", descriptor = "(BLha;)V")
    public final void method2283(byte arg0, class40 arg1) {
        if (arg0 != -108) {
            this.field5547 = 21;
        }
        field5548++;
        while (true) {
            int var3 = arg1.method257((byte) 50);
            if (var3 == 0) {
                return;
            }
            this.method2284(var3, arg0 ^ 0xFFFFFF95, arg1);
        }
    }

    @OriginalMember(owner = "client!k", name = "a", descriptor = "(IILha;)V")
    private final void method2284(int arg0, int arg1, class40 arg2) {
        if (arg0 == arg1) {
            this.field5549 = arg2.method254((byte) -123);
            this.field5547 = arg2.method257((byte) 28);
            this.field5544 = arg2.method257((byte) 42);
        }
        field5546++;
    }

    @OriginalMember(owner = "client!k", name = "a", descriptor = "(Z)V")
    public static void method2285(boolean arg0) {
        if (arg0) {
            field5545 = null;
        }
    }
}
