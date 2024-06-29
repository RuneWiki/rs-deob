import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!uca")
public class class320 {

    @OriginalMember(owner = "client!uca", name = "a", descriptor = "I")
    public static int field4528;

    @OriginalMember(owner = "client!uca", name = "b", descriptor = "I")
    public int field4529;

    @OriginalMember(owner = "client!uca", name = "c", descriptor = "I")
    public static int field4530;

    @OriginalMember(owner = "client!uca", name = "d", descriptor = "I")
    public int field4531;

    @OriginalMember(owner = "client!uca", name = "e", descriptor = "I")
    public int field4532;

    @OriginalMember(owner = "client!uca", name = "a", descriptor = "(BLgga;I)V", line = 3)
    private final void method2039(byte arg0, class511 arg1, int arg2) {
        if (arg2 == 1) {
            this.field4529 = arg1.method3002(-1);
            this.field4532 = arg1.method3013(105);
            this.field4531 = arg1.method3013(-125);
        }
        field4530++;
        if (arg0 <= 73) {
            this.field4531 = -62;
        }
    }

    @OriginalMember(owner = "client!uca", name = "a", descriptor = "(BLgga;)V", line = 29)
    public final void method2040(byte arg0, class511 arg1) {
        if (arg0 != -51) {
            return;
        }
        field4528++;
        while (true) {
            int var3 = arg1.method3013(-120);
            if (var3 == 0) {
                return;
            }
            this.method2039((byte) 94, arg1, var3);
        }
    }
}
