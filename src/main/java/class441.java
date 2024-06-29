import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ap")
public class class441 {

    @OriginalMember(owner = "client!ap", name = "c", descriptor = "I")
    public int field6103 = 0;

    @OriginalMember(owner = "client!ap", name = "a", descriptor = "F")
    public static float field6101;

    @OriginalMember(owner = "client!ap", name = "b", descriptor = "I")
    public static int field6102;

    @OriginalMember(owner = "client!ap", name = "d", descriptor = "I")
    public static int field6104;

    @OriginalMember(owner = "client!ap", name = "e", descriptor = "I")
    public static int field6105;

    @OriginalMember(owner = "client!ap", name = "a", descriptor = "(IBLac;)V", line = 12)
    private final void method2508(int arg0, byte arg1, class501 arg2) {
        field6104++;
        int var4 = 36 % ((-arg1 - 94) / 32);
        if (arg0 == 5) {
            this.field6103 = arg2.method2845(-1);
        }
    }

    @OriginalMember(owner = "client!ap", name = "a", descriptor = "(Lac;I)V", line = 31)
    public final void method2509(class501 arg0, int arg1) {
        if (arg1 != 0) {
            return;
        }
        field6105++;
        while (true) {
            int var3 = arg0.method2874((byte) -75);
            if (var3 == 0) {
                return;
            }
            this.method2508(var3, (byte) -126, arg0);
        }
    }
}
