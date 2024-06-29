import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!cca")
public class class236 {

    @OriginalMember(owner = "client!cca", name = "a", descriptor = "I")
    public static int field3456;

    @OriginalMember(owner = "client!cca", name = "a", descriptor = "(IIB)Z")
    public static final boolean method1527(int arg0, int arg1, byte arg2) {
        if (arg2 != 84) {
            return false;
        }
        field3456++;
        class158 var3 = class312.field4690.method2004(false, arg1);
        if (arg0 == 11) {
            arg0 = 10;
        }
        if (arg0 >= 5 && arg0 <= 8) {
            arg0 = 4;
        }
        return var3.method921(arg2 - 20402, arg0);
    }
}
