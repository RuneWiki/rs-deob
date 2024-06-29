import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ufa")
public class class680 {

    @OriginalMember(owner = "client!ufa", name = "a", descriptor = "Lmu;")
    public static class303 field9213 = new class303(56, 2);

    @OriginalMember(owner = "client!ufa", name = "f", descriptor = "I")
    public static int field9218 = 0;

    @OriginalMember(owner = "client!ufa", name = "d", descriptor = "I")
    public static int field9216 = 0;

    @OriginalMember(owner = "client!ufa", name = "e", descriptor = "[I")
    public static int[] field9217 = new int[1];

    @OriginalMember(owner = "client!ufa", name = "b", descriptor = "I")
    public static int field9214;

    @OriginalMember(owner = "client!ufa", name = "c", descriptor = "Lin;")
    public static class91 field9215;

    @OriginalMember(owner = "client!ufa", name = "a", descriptor = "(BI)Z", line = 6)
    public static final boolean method3814(byte arg0, int arg1) {
        if (arg0 == -79) {
            field9214++;
            return arg1 == 3 || arg1 == 7 || arg1 == 10;
        } else {
            return false;
        }
    }

    @OriginalMember(owner = "client!ufa", name = "a", descriptor = "()V", line = 24)
    public static final void method3815() {
        for (int var0 = 0; var0 < class170.field2657.length; var0++) {
            class170.field2657[var0].method3918();
        }
        class170.field2657 = null;
    }

    @OriginalMember(owner = "client!ufa", name = "a", descriptor = "(B)V", line = 38)
    public static void method3816(byte arg0) {
        field9215 = null;
        field9217 = null;
        if (arg0 < 105) {
            method3815();
        }
        field9213 = null;
    }
}
