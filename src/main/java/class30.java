import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!rk")
public class class30 extends class11 {

    @OriginalMember(owner = "client!rk", name = "y", descriptor = "I")
    public int field488 = 0;

    @OriginalMember(owner = "client!rk", name = "x", descriptor = "I")
    public static int field487 = 0;

    @OriginalMember(owner = "client!rk", name = "u", descriptor = "F")
    public static float field484;

    @OriginalMember(owner = "client!rk", name = "t", descriptor = "I")
    public static int field483;

    @OriginalMember(owner = "client!rk", name = "v", descriptor = "I")
    public static int field485;

    @OriginalMember(owner = "client!rk", name = "w", descriptor = "I")
    public static int field486;

    @OriginalMember(owner = "client!rk", name = "a", descriptor = "(ILoa;I)Lkga;")
    public static final class511 method249(int arg0, class651 arg1, int arg2) {
        field485++;
        class305 var3 = class559.method3081(arg1, arg0, (byte) 118, true);
        if (var3 == null) {
            return null;
        } else if (arg2 == 0) {
            return var3.field4224;
        } else {
            return null;
        }
    }

    @OriginalMember(owner = "client!rk", name = "a", descriptor = "(ILeh;I)V")
    private final void method250(int arg0, class335 arg1, int arg2) {
        field483++;
        if (arg2 == 2) {
            this.field488 = arg1.method2001((byte) -83);
        }
        int var4 = 42 % ((5 - arg0) / 39);
    }

    @OriginalMember(owner = "client!rk", name = "a", descriptor = "(ILeh;)V")
    public final void method251(int arg0, class335 arg1) {
        if (arg0 != 0) {
            method249(92, null, 94);
        }
        field486++;
        while (true) {
            int var3 = arg1.method2034(255);
            if (var3 == 0) {
                return;
            }
            this.method250(-50, arg1, var3);
        }
    }
}
