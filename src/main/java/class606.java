import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!jv")
public class class606 {

    @OriginalMember(owner = "client!jv", name = "a", descriptor = "I")
    public int field8276;

    @OriginalMember(owner = "client!jv", name = "d", descriptor = "I")
    public static int field8279 = 0;

    @OriginalMember(owner = "client!jv", name = "g", descriptor = "Z")
    public static boolean field8282 = false;

    @OriginalMember(owner = "client!jv", name = "c", descriptor = "I")
    public static int field8278;

    @OriginalMember(owner = "client!jv", name = "f", descriptor = "I")
    public static int field8281;

    @OriginalMember(owner = "client!jv", name = "b", descriptor = "Lau;")
    public static class445 field8277;

    @OriginalMember(owner = "client!jv", name = "e", descriptor = "Loa;")
    public static class689 field8280;

    @OriginalMember(owner = "client!jv", name = "toString", descriptor = "()Ljava/lang/String;", line = 7)
    public final String toString() {
        field8281++;
        throw new IllegalStateException();
    }

    @OriginalMember(owner = "client!jv", name = "a", descriptor = "(IJZILjava/lang/String;IILjava/lang/String;IZZ)V", line = 20)
    public static final void method3350(int arg0, long arg1, boolean arg2, int arg3, String arg4, int arg5, int arg6, String arg7, int arg8, boolean arg9, boolean arg10) {
        field8278++;
        if (class483.field6542 || class179.field2242 >= 500) {
            return;
        }
        int var12 = arg5 == -1 ? class664.field9413 : arg5;
        if (!arg2) {
            class69 var13 = new class69(arg4, arg7, var12, arg6, arg8, arg1, arg3, arg0, arg9, arg10);
            class37.field371.method378(var13, 31316);
            class179.field2242++;
        }
    }

    @OriginalMember(owner = "client!jv", name = "a", descriptor = "(Z)V", line = 40)
    public static void method3351(boolean arg0) {
        field8280 = null;
        if (!arg0) {
            field8277 = null;
        }
    }

    @OriginalMember(owner = "client!jv", name = "<init>", descriptor = "(II)V", line = 53)
    public class606(int arg0, int arg1) {
        this.field8276 = arg1;
    }
}
