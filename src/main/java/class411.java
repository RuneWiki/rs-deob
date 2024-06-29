import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!fu")
public class class411 {

    @OriginalMember(owner = "client!fu", name = "c", descriptor = "I")
    public static int field5378 = 328;

    @OriginalMember(owner = "client!fu", name = "a", descriptor = "I")
    public static int field5376;

    @OriginalMember(owner = "client!fu", name = "b", descriptor = "I")
    public static int field5377;

    @OriginalMember(owner = "client!fu", name = "a", descriptor = "(III)Z", line = 3)
    public static final boolean method2454(int arg0, int arg1, int arg2) {
        if (arg0 == 256) {
            field5377++;
            return (arg2 & 0x100) != 0;
        } else {
            return true;
        }
    }

    @OriginalMember(owner = "client!fu", name = "a", descriptor = "(IB)V", line = 17)
    public static final void method2455(int arg0, byte arg1) {
        field5376++;
        class587.field7997 = arg0;
        if (arg1 != 88) {
            method2455(-103, (byte) -3);
        }
        class137.field1713 = -1;
        class720.field10105 = 100;
        class446.field5988 = 3;
    }
}
