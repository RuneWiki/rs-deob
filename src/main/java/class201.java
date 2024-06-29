import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ov")
public class class201 extends class156 {

    @OriginalMember(owner = "client!ov", name = "g", descriptor = "I")
    public static int field3057 = 0;

    @OriginalMember(owner = "client!ov", name = "c", descriptor = "Lfja;")
    public static class783 field3053 = new class783(130, -1);

    @OriginalMember(owner = "client!ov", name = "h", descriptor = "I")
    public static int field3058;

    @OriginalMember(owner = "client!ov", name = "f", descriptor = "Lwha;")
    public static class299 field3056;

    @OriginalMember(owner = "client!ov", name = "d", descriptor = "[I")
    public static int[] field3054;

    @OriginalMember(owner = "client!ov", name = "e", descriptor = "[I")
    public static int[] field3055;

    @OriginalMember(owner = "client!ov", name = "a", descriptor = "([BB)Z", line = 7)
    public static final boolean method1446(byte[] arg0, byte arg1) {
        field3058++;
        class93 var2 = new class93(arg0);
        int var3 = var2.method793((byte) 87);
        if (var3 != 2) {
            return false;
        }
        boolean var4 = var2.method793((byte) 75) == 1;
        if (var4) {
            class720.method3995(var2, -34073);
        }
        class427.method2518(arg1 - 11240, var2);
        if (arg1 != 40) {
            field3054 = null;
        }
        return true;
    }

    @OriginalMember(owner = "client!ov", name = "a", descriptor = "(I)V", line = 33)
    public static void method1447(int arg0) {
        field3054 = null;
        if (arg0 == 30847) {
            field3056 = null;
            field3053 = null;
            field3055 = null;
        }
    }
}
