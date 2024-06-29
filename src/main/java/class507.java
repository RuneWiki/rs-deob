import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!nd")
public class class507 {

    @OriginalMember(owner = "client!nd", name = "a", descriptor = "Lqfa;")
    public static class85 field7184 = new class85(107, 0);

    @OriginalMember(owner = "client!nd", name = "c", descriptor = "I")
    public static int field7186 = 0;

    @OriginalMember(owner = "client!nd", name = "b", descriptor = "Lte;")
    public static class571 field7185 = new class571("", 16);

    @OriginalMember(owner = "client!nd", name = "f", descriptor = "F")
    public static float field7189;

    @OriginalMember(owner = "client!nd", name = "d", descriptor = "I")
    public static int field7187;

    @OriginalMember(owner = "client!nd", name = "e", descriptor = "I")
    public static int field7188;

    @OriginalMember(owner = "client!nd", name = "a", descriptor = "(I)V")
    public static void method3009(int arg0) {
        field7184 = null;
        field7185 = null;
        if (arg0 != 0) {
            field7184 = null;
        }
    }

    @OriginalMember(owner = "client!nd", name = "a", descriptor = "(B)V")
    public static final void method3010(byte arg0) {
        if (arg0 != 91) {
            method3011(55, -110, -39);
        }
        class288.field4337 = new class300(class265.field3879.method1733(255, class140.field2466), "", class139.field2461, 1010, -1, 0L, 0, 0, true, false);
        field7187++;
    }

    @OriginalMember(owner = "client!nd", name = "a", descriptor = "(III)Z")
    public static final boolean method3011(int arg0, int arg1, int arg2) {
        field7188++;
        if (arg0 < 14) {
            field7186 = 83;
        }
        return class370.method2341(arg1, arg2, 54) | (arg1 & 0x800) != 0 || class629.method3599(arg1, -102, arg2);
    }
}
