import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!je")
public class class253 {

    @OriginalMember(owner = "client!je", name = "b", descriptor = "I")
    public static int field3721 = 1406;

    @OriginalMember(owner = "client!je", name = "c", descriptor = "I")
    public static int field3722;

    @OriginalMember(owner = "client!je", name = "d", descriptor = "I")
    public static int field3723;

    @OriginalMember(owner = "client!je", name = "a", descriptor = "[I")
    public static int[] field3720;

    @OriginalMember(owner = "client!je", name = "a", descriptor = "(B)Z")
    public static final boolean method1577(byte arg0) {
        field3723++;
        class451 var1 = (class451) class160.field2365.field6838.field3576;
        if (var1 == null || class160.field2365.field6838 == var1) {
            return false;
        }
        int var2 = 102 / ((arg0 + 42) / 52);
        if (var1.field6245 >= 2000) {
            var1.field6245 -= 2000;
        }
        return var1.field6245 == 1004;
    }

    @OriginalMember(owner = "client!je", name = "b", descriptor = "(B)V")
    public static void method1578(byte arg0) {
        field3720 = null;
        if (arg0 <= 83) {
            field3721 = -48;
        }
    }

    @OriginalMember(owner = "client!je", name = "a", descriptor = "(CI)Z")
    public static final boolean method1579(char arg0, int arg1) {
        field3722++;
        if (arg1 != -27024) {
            method1577((byte) 94);
        }
        return arg0 >= 'A' && arg0 <= 'Z' || arg0 >= 'a' && arg0 <= 'z';
    }
}
