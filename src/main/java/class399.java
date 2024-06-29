import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!mea")
public class class399 {

    @OriginalMember(owner = "client!mea", name = "b", descriptor = "Lgj;")
    public static class593 field5298 = new class593();

    @OriginalMember(owner = "client!mea", name = "a", descriptor = "I")
    public static int field5297;

    @OriginalMember(owner = "client!mea", name = "c", descriptor = "I")
    public static int field5299;

    @OriginalMember(owner = "client!mea", name = "a", descriptor = "(IZ)Z")
    public static final boolean method2287(int arg0, boolean arg1) {
        if (arg1) {
            return true;
        } else {
            field5297++;
            return arg0 == 4 || arg0 == 50 || arg0 == 1006 || arg0 == 10 || arg0 == 12;
        }
    }

    @OriginalMember(owner = "client!mea", name = "a", descriptor = "(II)V")
    public static final void method2288(int arg0, int arg1) {
        field5299++;
        class382 var2 = class396.method2276(arg0 - 52, arg0, arg1);
        var2.method2228((byte) -55);
    }

    @OriginalMember(owner = "client!mea", name = "a", descriptor = "(Z)V")
    public static void method2289(boolean arg0) {
        if (!arg0) {
            method2287(106, true);
        }
        field5298 = null;
    }
}
