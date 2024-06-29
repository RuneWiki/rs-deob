import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ql")
public class class223 {

    @OriginalMember(owner = "client!ql", name = "b", descriptor = "Z")
    public static boolean field3417 = false;

    @OriginalMember(owner = "client!ql", name = "e", descriptor = "Ljava/lang/String;")
    public static String field3420 = "Discard";

    @OriginalMember(owner = "client!ql", name = "h", descriptor = "I")
    public static int field3423 = 0;

    @OriginalMember(owner = "client!ql", name = "a", descriptor = "I")
    public static int field3416;

    @OriginalMember(owner = "client!ql", name = "c", descriptor = "I")
    public static int field3418;

    @OriginalMember(owner = "client!ql", name = "d", descriptor = "I")
    public static int field3419;

    @OriginalMember(owner = "client!ql", name = "i", descriptor = "I")
    public static int field3424;

    @OriginalMember(owner = "client!ql", name = "f", descriptor = "Luh;")
    public static class103 field3421;

    @OriginalMember(owner = "client!ql", name = "g", descriptor = "Lhc;")
    public static class235 field3422;

    @OriginalMember(owner = "client!ql", name = "a", descriptor = "(IB)V")
    public static final void method1498(int arg0, byte arg1) {
        field3416++;
        if (arg1 >= -115) {
            method1500(false);
        }
        class25.field333.method1897(true, arg0);
    }

    @OriginalMember(owner = "client!ql", name = "a", descriptor = "(B)V")
    public static void method1499(byte arg0) {
        field3420 = null;
        if (arg0 >= -41) {
            method1499((byte) 64);
        }
        field3421 = null;
        field3422 = null;
    }

    @OriginalMember(owner = "client!ql", name = "a", descriptor = "(Z)V")
    public static final void method1500(boolean arg0) {
        field3418++;
        if (class235.field3794 == 5) {
            if (!arg0) {
                method1499((byte) -45);
            }
            class235.field3794 = 6;
        }
    }

    @OriginalMember(owner = "client!ql", name = "a", descriptor = "(IBI)V")
    public static final void method1501(int arg0, byte arg1, int arg2) {
        if (arg1 < 12) {
            field3421 = null;
        }
        field3424++;
        class4.field27 = arg2 - class101.field1697;
        class250.field4038 = class191.field2970 + class164.field2584 - arg0 - 1;
    }
}
