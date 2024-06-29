import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!cb")
public class class548 {

    @OriginalMember(owner = "client!cb", name = "e", descriptor = "Lfja;")
    public static class783 field7452 = new class783(89, -2);

    @OriginalMember(owner = "client!cb", name = "f", descriptor = "[Z")
    public static boolean[] field7453 = new boolean[200];

    @OriginalMember(owner = "client!cb", name = "g", descriptor = "[I")
    public static int[] field7454 = new int[] { 2, 1, 1, 1, 2, 2, 2, 1, 3, 3, 3, 2, 0, 4, 0 };

    @OriginalMember(owner = "client!cb", name = "b", descriptor = "I")
    public static int field7449;

    @OriginalMember(owner = "client!cb", name = "d", descriptor = "I")
    public static int field7451;

    @OriginalMember(owner = "client!cb", name = "a", descriptor = "Lr;")
    public class196 field7448;

    @OriginalMember(owner = "client!cb", name = "c", descriptor = "Lka;")
    public class499 field7450;

    @OriginalMember(owner = "client!cb", name = "a", descriptor = "(I)V", line = 18)
    public static void method3080(int arg0) {
        if (arg0 != -7538) {
            field7454 = null;
        }
        field7452 = null;
        field7453 = null;
        field7454 = null;
    }

    @OriginalMember(owner = "client!cb", name = "a", descriptor = "(ZLbea;)Z", line = 30)
    public static final boolean method3081(boolean arg0, class237 arg1) {
        field7449++;
        if (arg0) {
            return true;
        }
        class445 var2 = class414.field5670.method2319(arg1.method1032(arg0), arg0);
        if (var2.field6027 == -1) {
            return true;
        } else {
            class6 var3 = class636.field8785.method2119(var2.field6027, (byte) 33);
            return var3.field111 == -1 ? true : var3.method43(117);
        }
    }
}
