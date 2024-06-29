import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!gm")
public class class108 {

    @OriginalMember(owner = "client!gm", name = "b", descriptor = "Z")
    public static boolean field1496 = false;

    @OriginalMember(owner = "client!gm", name = "e", descriptor = "Z")
    public static boolean field1499 = false;

    @OriginalMember(owner = "client!gm", name = "d", descriptor = "Lem;")
    public static class206 field1498 = new class206(1, -2);

    @OriginalMember(owner = "client!gm", name = "f", descriptor = "Ltb;")
    public static class365 field1500 = new class365();

    @OriginalMember(owner = "client!gm", name = "h", descriptor = "F")
    public static float field1502;

    @OriginalMember(owner = "client!gm", name = "a", descriptor = "I")
    public static int field1495;

    @OriginalMember(owner = "client!gm", name = "c", descriptor = "I")
    public static int field1497;

    @OriginalMember(owner = "client!gm", name = "g", descriptor = "Luh;")
    public static class150 field1501;

    @OriginalMember(owner = "client!gm", name = "i", descriptor = "Lem;")
    public static class206 field1503;

    @OriginalMember(owner = "client!gm", name = "a", descriptor = "(IB)V", line = 4)
    public static final void method781(int arg0, byte arg1) {
        field1495++;
        if (arg1 == -107) {
            class51 var2 = class703.method3938(-1989279584, arg0, 4);
            var2.method404(71);
        }
    }

    @OriginalMember(owner = "client!gm", name = "a", descriptor = "(Lsr;ZIZIILsr;)I", line = 21)
    public static final int method782(class228 arg0, boolean arg1, int arg2, boolean arg3, int arg4, int arg5, class228 arg6) {
        field1497++;
        int var7 = class125.method903(arg6, arg2, arg3, -86, arg0);
        if (var7 != 0) {
            return arg3 ? -var7 : var7;
        } else if (~arg4 == arg5) {
            return 0;
        } else {
            int var8 = class125.method903(arg6, arg4, arg1, -20, arg0);
            return arg1 ? -var8 : var8;
        }
    }

    @OriginalMember(owner = "client!gm", name = "a", descriptor = "(I)V", line = 54)
    public static void method783(int arg0) {
        field1503 = null;
        if (arg0 >= -42) {
            method781(5, (byte) 108);
        }
        field1500 = null;
        field1498 = null;
        field1501 = null;
    }
}
