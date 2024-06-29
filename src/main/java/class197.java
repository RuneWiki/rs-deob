import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ac")
public abstract class class197 extends class43 {

    @OriginalMember(owner = "client!ac", name = "k", descriptor = "Z")
    public static boolean field2333 = false;

    @OriginalMember(owner = "client!ac", name = "m", descriptor = "[I")
    public static int[] field2335 = new int[32];

    @OriginalMember(owner = "client!ac", name = "l", descriptor = "I")
    public static int field2334;

    @OriginalMember(owner = "client!ac", name = "a", descriptor = "(III)V", line = 10)
    public static final void method1218(int arg0, int arg1, int arg2) {
        int var3 = class162.field1895 * arg2 >> 8;
        field2334++;
        if (arg1 == -1 && !class344.field4679) {
            class228.method1396(1);
        } else if (arg1 != -1 && (class346.field4702 != arg1 || !class384.method2395(true)) && var3 != 0 && !class344.field4679) {
            class367.method2320(2, arg1, class150.field1738, false, 0, arg0 ^ 0x739A, var3);
        }
        class346.field4702 = arg1;
        if (arg0 != 29595) {
            method1219((byte) -88);
        }
    }

    @OriginalMember(owner = "client!ac", name = "b", descriptor = "(B)V", line = 46)
    public static void method1219(byte arg0) {
        field2335 = null;
        if (arg0 != -103) {
            field2333 = true;
        }
    }
}
