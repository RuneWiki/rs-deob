import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!tp")
public class class606 {

    @OriginalMember(owner = "client!tp", name = "a", descriptor = "I")
    public static int field8489;

    @OriginalMember(owner = "client!tp", name = "c", descriptor = "I")
    public int field8491;

    @OriginalMember(owner = "client!tp", name = "d", descriptor = "I")
    public static int field8492;

    @OriginalMember(owner = "client!tp", name = "e", descriptor = "I")
    public static int field8493;

    @OriginalMember(owner = "client!tp", name = "f", descriptor = "I")
    public int field8494;

    @OriginalMember(owner = "client!tp", name = "g", descriptor = "I")
    private int field8495;

    @OriginalMember(owner = "client!tp", name = "b", descriptor = "Luea;")
    public class284 field8490;

    @OriginalMember(owner = "client!tp", name = "a", descriptor = "(Lgga;I)V", line = 9)
    public final void method3496(class511 arg0, int arg1) {
        int var3 = -38 % ((56 - arg1) / 57);
        while (true) {
            int var4 = arg0.method3013(29);
            if (var4 == 0) {
                field8489++;
                return;
            }
            this.method3498((byte) -121, arg0, var4);
        }
    }

    @OriginalMember(owner = "client!tp", name = "a", descriptor = "(Z)Lfm;", line = 35)
    public final synchronized class279 method3497(boolean arg0) {
        if (arg0) {
            this.method3496(null, 82);
        }
        field8492++;
        class279 var2 = (class279) this.field8490.field4096.method312(0, (long) this.field8495);
        if (var2 != null) {
            return var2;
        }
        class279 var3 = class279.method1821(this.field8490.field4095, this.field8495, 0);
        if (var3 != null) {
            this.field8490.field4096.method305(var3, (long) this.field8495, 18320);
        }
        return var3;
    }

    @OriginalMember(owner = "client!tp", name = "a", descriptor = "(BLgga;I)V", line = 55)
    private final void method3498(byte arg0, class511 arg1, int arg2) {
        if (arg2 == 1) {
            this.field8495 = arg1.method3002(-1);
        } else if (arg2 == 2) {
            this.field8494 = arg1.method3013(-112);
            this.field8491 = arg1.method3013(-128);
        }
        field8493++;
        if (arg0 != -121) {
            this.method3498((byte) 93, null, 15);
        }
    }
}
