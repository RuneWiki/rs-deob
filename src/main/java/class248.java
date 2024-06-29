import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!tc")
public class class248 {

    @OriginalMember(owner = "client!tc", name = "a", descriptor = "I")
    public static int field3570 = 0;

    @OriginalMember(owner = "client!tc", name = "d", descriptor = "Lhi;")
    public static class192 field3573 = new class192();

    @OriginalMember(owner = "client!tc", name = "e", descriptor = "Lqc;")
    public static class99 field3574 = new class99(64);

    @OriginalMember(owner = "client!tc", name = "b", descriptor = "I")
    public static int field3571;

    @OriginalMember(owner = "client!tc", name = "c", descriptor = "I")
    public static int field3572;

    @OriginalMember(owner = "client!tc", name = "a", descriptor = "(I)V", line = 11)
    public static final void method1695(int arg0) {
        if (arg0 <= 119) {
            method1696(26, (byte) -121);
        }
        class45.field549.method724(0);
        field3571++;
    }

    @OriginalMember(owner = "client!tc", name = "a", descriptor = "(IB)V", line = 32)
    public static final void method1696(int arg0, byte arg1) {
        int var2 = 45 / ((arg1 - 14) / 56);
        class31.method181((byte) -89);
        class188.method1320((byte) 109);
        field3572++;
        int var3 = class129.method928(arg0, 14).field1995;
        if (var3 == 0) {
            return;
        }
        int var4 = class324.field4920[arg0];
        if (var3 == 5) {
            class252.field3616 = var4;
        }
        if (var3 == 9) {
            class295.field4383 = var4;
        }
        if (var3 == 6) {
            class234.field3316 = var4;
        }
    }

    @OriginalMember(owner = "client!tc", name = "b", descriptor = "(I)V", line = 60)
    public static void method1697(int arg0) {
        if (arg0 != 0) {
            field3570 = 60;
        }
        field3573 = null;
        field3574 = null;
    }
}
