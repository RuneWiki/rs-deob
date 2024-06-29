import java.awt.event.ActionEvent;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!dw")
public abstract class class720 {

    @OriginalMember(owner = "client!dw", name = "a", descriptor = "I")
    public static int field10027;

    @OriginalMember(owner = "client!dw", name = "b", descriptor = "I")
    public static int field10028;

    @OriginalMember(owner = "client!dw", name = "c", descriptor = "I")
    public static int field10029;

    @OriginalMember(owner = "client!dw", name = "a", descriptor = "(BLjava/lang/Object;Lqg;)V", line = 8)
    public static final void method4024(byte arg0, Object arg1, class465 arg2) {
        field10029++;
        if (arg2.field6237 == null) {
            return;
        }
        for (int var3 = 0; var3 < 50 && arg2.field6237.peekEvent() != null; var3++) {
            class149.method1052(1L, true);
        }
        try {
            if (arg1 != null) {
                arg2.field6237.postEvent(new ActionEvent(arg1, 1001, "dummy"));
            }
        } catch (Exception var4) {
        }
        if (arg0 <= -80) {
            ;
        }
    }

    @OriginalMember(owner = "client!dw", name = "a", descriptor = "(IIII)I", line = 39)
    public static final int method4025(int arg0, int arg1, int arg2, int arg3) {
        if (arg3 != 0) {
            return -15;
        }
        field10028++;
        if (arg0 <= arg1) {
            return arg1 <= arg2 ? arg1 : arg2;
        } else {
            return arg0;
        }
    }

    @OriginalMember(owner = "client!dw", name = "b", descriptor = "(IZ)V", line = 51)
    public static final void method4026(int arg0, boolean arg1) {
        field10027++;
        if (!arg1) {
            class433.field5780 = arg0;
            class515.field7222.method3065(true);
        }
    }

    @OriginalMember(owner = "client!dw", name = "a", descriptor = "(I)Lrf;")
    public abstract class85 method2694(int arg0);

    @OriginalMember(owner = "client!dw", name = "a", descriptor = "(II)[B")
    public abstract byte[] method2691(int arg0, int arg1);

    @OriginalMember(owner = "client!dw", name = "a", descriptor = "(IZ)V")
    public abstract void method2704(int arg0, boolean arg1);

    @OriginalMember(owner = "client!dw", name = "b", descriptor = "(II)I")
    public abstract int method2698(int arg0, int arg1);
}
