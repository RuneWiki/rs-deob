import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!uq")
public class class147 {

    @OriginalMember(owner = "client!uq", name = "b", descriptor = "Lws;")
    public static class328 field2458 = new class328(2, -1);

    @OriginalMember(owner = "client!uq", name = "d", descriptor = "Leu;")
    public static class444 field2460 = new class444(7, 2);

    @OriginalMember(owner = "client!uq", name = "e", descriptor = "Lhw;")
    public static class116 field2461 = new class116(1);

    @OriginalMember(owner = "client!uq", name = "a", descriptor = "I")
    public static int field2457;

    @OriginalMember(owner = "client!uq", name = "c", descriptor = "I")
    public static int field2459;

    @OriginalMember(owner = "client!uq", name = "a", descriptor = "(IBI)Lnc;")
    public static final class23 method1237(int arg0, byte arg1, int arg2) {
        field2457++;
        if (arg1 != -120) {
            method1239(-64);
        }
        class23 var3 = new class23();
        var3.field353 = arg0 + 1 + 5;
        var3.field361 = -1;
        var3.field367 = -1;
        var3.field354 = arg2 + 5 + 1;
        var3.field351 = new int[var3.field354][var3.field353];
        var3.method374(32);
        return var3;
    }

    @OriginalMember(owner = "client!uq", name = "a", descriptor = "(II)Z")
    public static final boolean method1238(int arg0, int arg1) {
        field2459++;
        if (arg0 != 12081) {
            return true;
        } else if (arg1 == 44 || arg1 == 21 || arg1 == 13 || arg1 == 30 || arg1 == 11) {
            return true;
        } else {
            return arg1 == 23 || arg1 == 1009;
        }
    }

    @OriginalMember(owner = "client!uq", name = "a", descriptor = "(I)V")
    public static void method1239(int arg0) {
        field2458 = null;
        field2461 = null;
        if (arg0 == -29021) {
            field2460 = null;
        }
    }
}
