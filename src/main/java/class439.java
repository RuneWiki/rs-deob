import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!gia")
public class class439 {

    @OriginalMember(owner = "client!gia", name = "a", descriptor = "Lbt;")
    public static class437 field5766 = new class437(14, 16);

    @OriginalMember(owner = "client!gia", name = "d", descriptor = "[I")
    public static int[] field5769 = new int[] { 16, 32, 64, 128 };

    @OriginalMember(owner = "client!gia", name = "b", descriptor = "I")
    public static int field5767;

    @OriginalMember(owner = "client!gia", name = "e", descriptor = "I")
    public static int field5770;

    @OriginalMember(owner = "client!gia", name = "c", descriptor = "[I")
    public static int[] field5768;

    @OriginalMember(owner = "client!gia", name = "a", descriptor = "(B)V")
    public static void method2512(byte arg0) {
        field5769 = null;
        if (arg0 == -104) {
            field5766 = null;
            field5768 = null;
        }
    }

    @OriginalMember(owner = "client!gia", name = "a", descriptor = "(Lmc;I)Lib;")
    public static final class1 method2513(class234 arg0, int arg1) {
        field5767++;
        int var2 = arg0.method1553((byte) 56);
        class759 var3 = class166.method1061(0)[arg0.method1509(true)];
        if (arg1 > -51) {
            field5768 = null;
        }
        class20 var4 = class549.method2972(-2)[arg0.method1509(true)];
        int var5 = arg0.method1542(27067);
        int var6 = arg0.method1542(27067);
        return new class1(var2, var3, var4, var5, var6);
    }
}
