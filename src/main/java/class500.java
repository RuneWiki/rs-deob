import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!lm")
public class class500 extends class392 {

    @OriginalMember(owner = "client!lm", name = "v", descriptor = "I")
    public int field6809 = 0;

    @OriginalMember(owner = "client!lm", name = "x", descriptor = "Z")
    public static boolean field6811 = false;

    @OriginalMember(owner = "client!lm", name = "w", descriptor = "I")
    public static int field6810;

    @OriginalMember(owner = "client!lm", name = "y", descriptor = "I")
    public static int field6812;

    @OriginalMember(owner = "client!lm", name = "z", descriptor = "I")
    public static int field6813;

    @OriginalMember(owner = "client!lm", name = "a", descriptor = "(ILji;B)V")
    private final void method2791(int arg0, class611 arg1, byte arg2) {
        field6810++;
        if (arg2 == 95 && arg0 == 2) {
            this.field6809 = arg1.method3402((byte) 127);
        }
    }

    @OriginalMember(owner = "client!lm", name = "a", descriptor = "(Lji;I)V")
    public final void method2792(class611 arg0, int arg1) {
        if (arg1 > -124) {
            this.method2792(null, -65);
        }
        field6813++;
        while (true) {
            int var3 = arg0.method3428((byte) 124);
            if (var3 == 0) {
                return;
            }
            this.method2791(var3, arg0, (byte) 95);
        }
    }
}
