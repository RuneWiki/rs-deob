import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!aca")
public class class757 extends class380 {

    @OriginalMember(owner = "client!aca", name = "h", descriptor = "Luh;")
    public static class176 field10436 = new class176(15, 0, 1, 0);

    @OriginalMember(owner = "client!aca", name = "f", descriptor = "I")
    public static int field10434;

    @OriginalMember(owner = "client!aca", name = "g", descriptor = "I")
    public static int field10435;

    @OriginalMember(owner = "client!aca", name = "i", descriptor = "Lqja;")
    public static class326 field10437;

    @OriginalMember(owner = "client!aca", name = "c", descriptor = "(I)V", line = 4)
    public static void method4203(int arg0) {
        if (arg0 != 9422) {
            field10437 = null;
        }
        field10436 = null;
        field10437 = null;
    }

    @OriginalMember(owner = "client!aca", name = "a", descriptor = "(II)V", line = 15)
    public static final void method4204(int arg0, int arg1) {
        if (class104.field1206 == arg1) {
            class745.field10318 = arg0;
        } else if (class104.field1206 == 2) {
            class200.field3046 = arg0;
        }
        field10434++;
    }

    @OriginalMember(owner = "client!aca", name = "a", descriptor = "(B)V", line = 41)
    public static final void method4205(byte arg0) {
        field10435++;
        class559.field7954.method1729((byte) -113);
        int var1 = -21 / ((arg0 - 1) / 39);
        class308.field4416 = 0;
    }
}
