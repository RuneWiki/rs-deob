import java.awt.event.ActionEvent;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!wq")
public class class705 {

    @OriginalMember(owner = "client!wq", name = "b", descriptor = "Lrs;")
    public class178 field9317 = new class178();

    @OriginalMember(owner = "client!wq", name = "d", descriptor = "I")
    public static int field9319 = -1;

    @OriginalMember(owner = "client!wq", name = "a", descriptor = "I")
    public static int field9316;

    @OriginalMember(owner = "client!wq", name = "c", descriptor = "I")
    public static int field9318;

    @OriginalMember(owner = "client!wq", name = "a", descriptor = "(ZLjava/lang/Object;Loq;)V", line = 10)
    public static final void method3815(boolean arg0, Object arg1, class775 arg2) {
        field9316++;
        if (arg2.field10575 == null) {
            return;
        }
        for (int var3 = 0; var3 < 50 && arg2.field10575.peekEvent() != null; var3++) {
            class591.method3181(1L, 0);
        }
        if (arg0) {
            field9319 = -5;
        }
        try {
            if (arg1 != null) {
                arg2.field10575.postEvent(new ActionEvent(arg1, 1001, "dummy"));
            }
        } catch (Exception var4) {
        }
    }

    @OriginalMember(owner = "client!wq", name = "a", descriptor = "(IB)V", line = 45)
    public static final void method3816(int arg0, byte arg1) {
        field9318++;
        if (arg1 > -65) {
            method3816(-78, (byte) -4);
        }
        class614 var2 = class497.method2759(2, 5977, (long) arg0);
        var2.method3279(false);
    }
}
