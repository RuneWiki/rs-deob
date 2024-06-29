import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!uaa")
public class class432 {

    @OriginalMember(owner = "client!uaa", name = "a", descriptor = "I")
    public static int field5805;

    @OriginalMember(owner = "client!uaa", name = "a", descriptor = "(Lir;)V")
    public static final void method2434(class27 arg0) {
        class377.field4985.method1118(arg0.field398, arg0.field388 + (arg0.method176((byte) -122) >> 1), arg0.field397, class445.field5892);
        arg0.field390 = class445.field5892[0];
        arg0.field384 = class445.field5892[1];
        arg0.field383 = class445.field5892[2];
    }

    @OriginalMember(owner = "client!uaa", name = "a", descriptor = "(BLkr;)V")
    public static final void method2435(byte arg0, class354 arg1) {
        field5805++;
        if (!class674.field9590 && arg0 == 48) {
            arg1.method242(true);
            class137.field1873--;
        }
    }
}
