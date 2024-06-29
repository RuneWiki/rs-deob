import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!hm")
public class class226 {

    @OriginalMember(owner = "client!hm", name = "a", descriptor = "Ltd;")
    public static class225 field3534 = new class225(16);

    @OriginalMember(owner = "client!hm", name = "c", descriptor = "[I")
    public static int[] field3536 = new int[] { 12543016, 15504954, 15914854, 16773818 };

    @OriginalMember(owner = "client!hm", name = "e", descriptor = "Z")
    public static boolean field3538 = false;

    @OriginalMember(owner = "client!hm", name = "b", descriptor = "I")
    public static int field3535;

    @OriginalMember(owner = "client!hm", name = "d", descriptor = "I")
    public static int field3537;

    @OriginalMember(owner = "client!hm", name = "f", descriptor = "I")
    public static int field3539;

    @OriginalMember(owner = "client!hm", name = "a", descriptor = "(I)V")
    public static void method1497(int arg0) {
        field3536 = null;
        if (arg0 != -15707) {
            method1498(46, 89, -50, 104, (class202) null, (class202) null, -80, -116, 36, 113, 118L);
        }
        field3534 = null;
    }

    @OriginalMember(owner = "client!hm", name = "a", descriptor = "(IIIILsk;Lsk;IIIIJ)V")
    public static final void method1498(int arg0, int arg1, int arg2, int arg3, class202 arg4, class202 arg5, int arg6, int arg7, int arg8, int arg9, long arg10) {
        if (arg4 == null) {
            return;
        }
        class75 var12 = new class75();
        var12.field1055 = arg10;
        var12.field1048 = arg1 * 128 + 64;
        var12.field1051 = arg2 * 128 + 64;
        var12.field1058 = arg3;
        var12.field1047 = arg4;
        var12.field1057 = arg5;
        var12.field1053 = arg6;
        var12.field1046 = arg7;
        var12.field1052 = arg8;
        var12.field1049 = arg9;
        for (int var13 = arg0; var13 >= 0; var13--) {
            if (class246.field3856[var13][arg1][arg2] == null) {
                class246.field3856[var13][arg1][arg2] = new class91(var13, arg1, arg2);
            }
        }
        class246.field3856[arg0][arg1][arg2].field1329 = var12;
    }
}
