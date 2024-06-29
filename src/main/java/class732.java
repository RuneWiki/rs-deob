import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!gj")
public class class732 {

    @OriginalMember(owner = "client!gj", name = "a", descriptor = "I")
    public static int field10110;

    @OriginalMember(owner = "client!gj", name = "c", descriptor = "I")
    public static int field10112;

    @OriginalMember(owner = "client!gj", name = "d", descriptor = "I")
    public static int field10113;

    @OriginalMember(owner = "client!gj", name = "b", descriptor = "Loo;")
    public static class12 field10111;

    @OriginalMember(owner = "client!gj", name = "e", descriptor = "Lee;")
    public static class506 field10114;

    @OriginalMember(owner = "client!gj", name = "a", descriptor = "(I[B)Z", line = 5)
    public static final boolean method4071(int arg0, byte[] arg1) {
        if (arg0 >= -45) {
            return true;
        }
        field10112++;
        class511 var2 = new class511(arg1);
        int var3 = var2.method3013(-119);
        if (var3 != 2) {
            return false;
        }
        boolean var4 = var2.method3013(21) == 1;
        if (var4) {
            class217.method1348((byte) 73, var2);
        }
        class41.method325(1, var2);
        return true;
    }

    @OriginalMember(owner = "client!gj", name = "a", descriptor = "(I)V", line = 30)
    public static void method4072(int arg0) {
        field10114 = null;
        int var1 = 3 / ((90 - arg0) / 34);
        field10111 = null;
    }

    @OriginalMember(owner = "client!gj", name = "a", descriptor = "(CB)Z", line = 40)
    public static final boolean method4073(char arg0, byte arg1) {
        if (arg1 == -51) {
            field10113++;
            return arg0 >= 'A' && arg0 <= 'Z' || arg0 >= 'a' && arg0 <= 'z';
        } else {
            return true;
        }
    }
}
