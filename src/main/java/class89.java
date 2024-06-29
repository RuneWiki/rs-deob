import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ub")
public class class89 {

    @OriginalMember(owner = "client!ub", name = "d", descriptor = "Loa;")
    public static class99 field1534 = class221.method1463(2844, "k");

    @OriginalMember(owner = "client!ub", name = "c", descriptor = "[Z")
    public static boolean[] field1533 = new boolean[200];

    @OriginalMember(owner = "client!ub", name = "a", descriptor = "I")
    public static int field1531;

    @OriginalMember(owner = "client!ub", name = "b", descriptor = "[Loa;")
    public static class99[] field1532;

    @OriginalMember(owner = "client!ub", name = "a", descriptor = "(IZI)I")
    public static final int method607(int arg0, boolean arg1, int arg2) {
        field1531++;
        int var3 = class175.method1175(125, arg2 - 1, arg0 + -1) + (class175.method1175(123, arg2 + 1, arg0 - 1) + class175.method1175(125, arg2 - 1, arg0 - -1) + class175.method1175(121, arg2 + 1, arg0 - -1));
        if (!arg1) {
            field1534 = null;
        }
        int var4 = class175.method1175(120, arg2 - 1, arg0) + class175.method1175(124, arg2 + 1, arg0) - (-class175.method1175(124, arg2, arg0 - 1) - class175.method1175(114, arg2, arg0 - -1));
        int var5 = class175.method1175(116, arg2, arg0);
        return var3 / 16 + (var4 / 8) + (var5 / 4);
    }

    @OriginalMember(owner = "client!ub", name = "a", descriptor = "(I)V")
    public static void method608(int arg0) {
        if (arg0 >= -79) {
            method607(-42, false, 41);
        }
        field1534 = null;
        field1533 = null;
        field1532 = null;
    }
}
