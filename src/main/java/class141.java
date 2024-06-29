import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!qo")
public class class141 extends class499 {

    @OriginalMember(owner = "client!qo", name = "f", descriptor = "Lqv;")
    public static class49 field2331 = new class49();

    @OriginalMember(owner = "client!qo", name = "h", descriptor = "I")
    public static int field2333;

    @OriginalMember(owner = "client!qo", name = "g", descriptor = "[[Z")
    public static boolean[][] field2332;

    @OriginalMember(owner = "client!qo", name = "a", descriptor = "(BII)V")
    public static final void method1046(byte arg0, int arg1, int arg2) {
        field2333++;
        class266 var3 = class308.method1961(true, arg2, 7);
        int var4 = 6 / ((arg0 + 44) / 32);
        var3.method1781((byte) 95);
        var3.field4454 = arg1;
    }

    @OriginalMember(owner = "client!qo", name = "a", descriptor = "(I)V")
    public static void method1047(int arg0) {
        field2332 = null;
        field2331 = null;
        if (arg0 != -1) {
            method1047(-11);
        }
    }
}
