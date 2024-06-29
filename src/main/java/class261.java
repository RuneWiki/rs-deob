import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!jq")
public class class261 {

    @OriginalMember(owner = "client!jq", name = "e", descriptor = "I")
    public static int field3636 = 0;

    @OriginalMember(owner = "client!jq", name = "a", descriptor = "[I")
    public static int[] field3632 = new int[25];

    @OriginalMember(owner = "client!jq", name = "f", descriptor = "[Ltq;")
    public static class270[] field3637 = new class270[14];

    @OriginalMember(owner = "client!jq", name = "d", descriptor = "I")
    public static int field3635;

    @OriginalMember(owner = "client!jq", name = "g", descriptor = "I")
    public static int field3638;

    @OriginalMember(owner = "client!jq", name = "h", descriptor = "I")
    public static int field3639;

    @OriginalMember(owner = "client!jq", name = "c", descriptor = "Lf;")
    public static class191 field3634;

    @OriginalMember(owner = "client!jq", name = "b", descriptor = "Lns;")
    public static class438 field3633;

    @OriginalMember(owner = "client!jq", name = "a", descriptor = "(IIZ)Ltp;")
    public static final class410 method1684(int arg0, int arg1, boolean arg2) {
        field3638++;
        long var3 = (long) (arg0 | (arg2 ? Integer.MIN_VALUE : 0));
        return arg1 == 25 ? (class410) class353.field5477.method943(var3, -1) : null;
    }

    @OriginalMember(owner = "client!jq", name = "a", descriptor = "(I)V")
    public static void method1685(int arg0) {
        field3633 = null;
        field3634 = null;
        int var1 = -45 % ((-arg0 - 17) / 56);
        field3637 = null;
        field3632 = null;
    }
}
