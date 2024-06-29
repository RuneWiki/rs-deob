import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!cb")
public abstract class class194 {

    @OriginalMember(owner = "client!cb", name = "a", descriptor = "Leg;")
    public static class37 field3327 = class174.method1167("<col=ffff00>", -85);

    @OriginalMember(owner = "client!cb", name = "b", descriptor = "Leg;")
    public static class37 field3328 = class174.method1167("gelb:", 107);

    @OriginalMember(owner = "client!cb", name = "c", descriptor = "I")
    public static int field3329;

    @OriginalMember(owner = "client!cb", name = "d", descriptor = "I")
    public static int field3330;

    @OriginalMember(owner = "client!cb", name = "a", descriptor = "(IZ)V")
    public abstract void method1340(int arg0, boolean arg1);

    @OriginalMember(owner = "client!cb", name = "a", descriptor = "(IB)[B")
    public abstract byte[] method1341(int arg0, byte arg1);

    @OriginalMember(owner = "client!cb", name = "a", descriptor = "(II)V")
    public static final void method1342(int arg0, int arg1) {
        class274 var2 = class166.method1116(arg1, arg0, true);
        var2.method1840(arg1 ^ 0x271B);
        field3329++;
    }

    @OriginalMember(owner = "client!cb", name = "b", descriptor = "(IB)I")
    public abstract int method1343(int arg0, byte arg1);

    @OriginalMember(owner = "client!cb", name = "a", descriptor = "(I)Leb;")
    public abstract class244 method1344(int arg0);

    @OriginalMember(owner = "client!cb", name = "b", descriptor = "(I)V")
    public static void method1345(int arg0) {
        field3328 = null;
        field3327 = null;
        if (arg0 != -23001) {
            method1345(-82);
        }
    }
}
