import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!lc")
public class class218 {

    @OriginalMember(owner = "client!lc", name = "a", descriptor = "Lvf;")
    public static class252 field3747 = new class252();

    @OriginalMember(owner = "client!lc", name = "b", descriptor = "I")
    public static int field3748;

    @OriginalMember(owner = "client!lc", name = "c", descriptor = "I")
    public static int field3749;

    @OriginalMember(owner = "client!lc", name = "e", descriptor = "I")
    public static int field3751;

    @OriginalMember(owner = "client!lc", name = "f", descriptor = "I")
    public static int field3752;

    @OriginalMember(owner = "client!lc", name = "d", descriptor = "Lcj;")
    public static class28 field3750;

    @OriginalMember(owner = "client!lc", name = "a", descriptor = "(I)V")
    public static void method1400(int arg0) {
        if (arg0 == 0) {
            field3747 = null;
            field3750 = null;
        }
    }

    @OriginalMember(owner = "client!lc", name = "a", descriptor = "(IZI)Lha;")
    public static final class63 method1401(int arg0, boolean arg1, int arg2) {
        if (arg1) {
            field3747 = null;
        }
        class63 var3 = class54.method367(arg0, (byte) -80);
        field3749++;
        if (arg2 == -1) {
            return var3;
        } else if (var3 == null || var3.field1092 == null || var3.field1092.length <= arg2) {
            return null;
        } else {
            return var3.field1092[arg2];
        }
    }

    @OriginalMember(owner = "client!lc", name = "a", descriptor = "(III)V")
    public static final void method1402(int arg0, int arg1, int arg2) {
        class214.field3678[arg2] = arg1;
        class151 var3 = (class151) class60.field1017.method1381((long) arg2, -88);
        field3751++;
        int var4 = 124 % ((arg0 + 11) / 61);
        if (var3 == null) {
            class151 var5 = new class151(4611686018427387905L);
            class60.field1017.method1380((byte) -57, var5, (long) arg2);
        } else if (var3.field2708 != 4611686018427387905L) {
            var3.field2708 = class3.method13(17161) + 500L | 0x4000000000000000L;
            return;
        }
    }
}
