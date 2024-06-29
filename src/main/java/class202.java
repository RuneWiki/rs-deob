import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!nt")
public class class202 {

    @OriginalMember(owner = "client!nt", name = "b", descriptor = "I")
    public static int field2968 = 64;

    @OriginalMember(owner = "client!nt", name = "d", descriptor = "[I")
    public static int[] field2970 = new int[] { 0, 4, 3, 3, 1, 1, 3, 5, 1, 5, 3, 6, 4 };

    @OriginalMember(owner = "client!nt", name = "c", descriptor = "[Lcm;")
    public static class668[] field2969 = new class668[34];

    @OriginalMember(owner = "client!nt", name = "f", descriptor = "[I")
    public static int[] field2972 = new int[] { 2, 1, 1, 1, 2, 2, 2, 1, 3, 3, 3, 2, 0, 4, 0 };

    @OriginalMember(owner = "client!nt", name = "a", descriptor = "I")
    public static int field2967;

    @OriginalMember(owner = "client!nt", name = "e", descriptor = "I")
    public static int field2971;

    @OriginalMember(owner = "client!nt", name = "a", descriptor = "(IB)Z")
    public static final boolean method1352(int arg0, byte arg1) {
        field2971++;
        if (arg1 > -18) {
            return true;
        } else {
            return arg0 == 7 || arg0 == 8 || arg0 == 9;
        }
    }

    @OriginalMember(owner = "client!nt", name = "a", descriptor = "(IIIII)V")
    public static final void method1353(int arg0, int arg1, int arg2, int arg3, int arg4) {
        field2967++;
        class679 var5 = class669.method3708(arg1, arg3, 1403048928);
        var5.method3748(true);
        var5.field9566 = arg2;
        var5.field9574 = arg0;
        var5.field9573 = arg4;
    }

    @OriginalMember(owner = "client!nt", name = "a", descriptor = "(I)V")
    public static void method1354(int arg0) {
        field2969 = null;
        field2972 = null;
        field2970 = null;
        if (arg0 != 4) {
            field2970 = null;
        }
    }
}
