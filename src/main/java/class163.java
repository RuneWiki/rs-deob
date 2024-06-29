import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!la")
public class class163 {

    @OriginalMember(owner = "client!la", name = "c", descriptor = "Z")
    public static boolean field2758 = false;

    @OriginalMember(owner = "client!la", name = "a", descriptor = "Lwe;")
    public static class147 field2756 = new class147(100);

    @OriginalMember(owner = "client!la", name = "g", descriptor = "Z")
    public static boolean field2762 = false;

    @OriginalMember(owner = "client!la", name = "i", descriptor = "Z")
    public static boolean field2764 = false;

    @OriginalMember(owner = "client!la", name = "j", descriptor = "Le;")
    private static class191 field2765 = class54.method368("Started 3d library", 2047);

    @OriginalMember(owner = "client!la", name = "f", descriptor = "Z")
    public static volatile boolean field2761 = true;

    @OriginalMember(owner = "client!la", name = "h", descriptor = "Le;")
    public static class191 field2763 = field2765;

    @OriginalMember(owner = "client!la", name = "b", descriptor = "I")
    public static int field2757;

    @OriginalMember(owner = "client!la", name = "d", descriptor = "I")
    public static int field2759;

    @OriginalMember(owner = "client!la", name = "e", descriptor = "I")
    public static int field2760;

    @OriginalMember(owner = "client!la", name = "a", descriptor = "(II)I")
    public static final int method1104(int arg0, int arg1) {
        if (arg1 != 0) {
            method1104(-37, -118);
        }
        field2759++;
        return arg0 >>> 8;
    }

    @OriginalMember(owner = "client!la", name = "a", descriptor = "(ZIII)I")
    public static final int method1105(boolean arg0, int arg1, int arg2, int arg3) {
        field2760++;
        if ((class270.field4755[arg3][arg2][arg1] & 0x8) == 0) {
            if (!arg0) {
                field2762 = true;
            }
            return arg3 <= 0 || (class270.field4755[1][arg2][arg1] & 0x2) == 0 ? arg3 : arg3 - 1;
        } else {
            return 0;
        }
    }

    @OriginalMember(owner = "client!la", name = "a", descriptor = "(B)V")
    public static void method1106(byte arg0) {
        field2765 = null;
        field2756 = null;
        field2763 = null;
        if (arg0 <= 51) {
            method1104(-117, -113);
        }
    }
}
