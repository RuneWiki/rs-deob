import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!sb")
public class class123 {

    @OriginalMember(owner = "client!sb", name = "d", descriptor = "[I")
    public static int[] field2135 = new int[50];

    @OriginalMember(owner = "client!sb", name = "b", descriptor = "Lul;")
    public static class51 field2133 = new class51(4);

    @OriginalMember(owner = "client!sb", name = "a", descriptor = "I")
    public static int field2132;

    @OriginalMember(owner = "client!sb", name = "c", descriptor = "I")
    public static int field2134;

    @OriginalMember(owner = "client!sb", name = "e", descriptor = "Ldd;")
    public static class272 field2136;

    @OriginalMember(owner = "client!sb", name = "f", descriptor = "[I")
    public static int[] field2137;

    @OriginalMember(owner = "client!sb", name = "g", descriptor = "[I")
    public static int[] field2138;

    @OriginalMember(owner = "client!sb", name = "a", descriptor = "(IBII)V", line = 12)
    public static final void method1035(int arg0, byte arg1, int arg2, int arg3) {
        class30 var4 = class99.method857((byte) -22, arg0, 9);
        var4.method277(true);
        var4.field441 = arg2;
        var4.field438 = arg3;
        int var5 = -13 / ((63 - arg1) / 42);
        field2132++;
    }

    @OriginalMember(owner = "client!sb", name = "a", descriptor = "(I)V", line = 25)
    public static void method1036(int arg0) {
        field2133 = null;
        field2138 = null;
        if (arg0 != 9) {
            field2133 = (class51) null;
        }
        field2135 = null;
        field2137 = null;
        field2136 = null;
    }
}
