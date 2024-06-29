import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!up")
public class class547 {

    @OriginalMember(owner = "client!up", name = "d", descriptor = "Lnea;")
    public static class600 field7573 = new class600(1);

    @OriginalMember(owner = "client!up", name = "e", descriptor = "Lbn;")
    public static class517 field7574 = new class517("WTRC", "office", "_rc", 1);

    @OriginalMember(owner = "client!up", name = "h", descriptor = "I")
    public static int field7577 = 0;

    @OriginalMember(owner = "client!up", name = "g", descriptor = "D")
    public static double field7576;

    @OriginalMember(owner = "client!up", name = "a", descriptor = "I")
    public static int field7570;

    @OriginalMember(owner = "client!up", name = "b", descriptor = "I")
    public static int field7571;

    @OriginalMember(owner = "client!up", name = "c", descriptor = "I")
    public static int field7572;

    @OriginalMember(owner = "client!up", name = "f", descriptor = "[Lth;")
    public static class131[] field7575;

    @OriginalMember(owner = "client!up", name = "a", descriptor = "(Lgga;Lgga;BLgga;Lgga;)V")
    public static final void method3162(class513 arg0, class513 arg1, byte arg2, class513 arg3, class513 arg4) {
        class246.field3531 = arg3;
        field7572++;
        class180.field2751 = arg1;
        int var5 = -5 / ((arg2 - 63) / 44);
        class720.field10061 = arg0;
        class610.field8661 = new class519[class720.field10061.method3011((byte) 126)][];
        class120.field2047 = new boolean[class720.field10061.method3011((byte) 63)];
    }

    @OriginalMember(owner = "client!up", name = "toString", descriptor = "()Ljava/lang/String;")
    public final String toString() {
        field7571++;
        throw new IllegalStateException();
    }

    @OriginalMember(owner = "client!up", name = "a", descriptor = "(BII)Z")
    public static final boolean method3163(byte arg0, int arg1, int arg2) {
        int var3 = 82 % ((arg0 + 24) / 53);
        field7570++;
        return ((arg2 & 0x2000) != 0 | class637.method3628(true, arg1, arg2) | class377.method2273(124, arg1, arg2)) & class453.method2662(arg2, (byte) -45, arg1);
    }

    @OriginalMember(owner = "client!up", name = "a", descriptor = "(Z)V")
    public static void method3164(boolean arg0) {
        if (arg0) {
            field7577 = -110;
        }
        field7574 = null;
        field7573 = null;
        field7575 = null;
    }
}
