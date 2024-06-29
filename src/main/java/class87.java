import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ae")
public class class87 {

    @OriginalMember(owner = "client!ae", name = "d", descriptor = "Le;")
    public static class191 field1424 = class54.method368("; Expires=", 2047);

    @OriginalMember(owner = "client!ae", name = "a", descriptor = "I")
    public static int field1421 = 3;

    @OriginalMember(owner = "client!ae", name = "h", descriptor = "[Z")
    public static boolean[] field1428 = new boolean[100];

    @OriginalMember(owner = "client!ae", name = "b", descriptor = "Le;")
    private static class191 field1422 = class54.method368("You can(Wt add yourself to your own ignore list)3", 2047);

    @OriginalMember(owner = "client!ae", name = "g", descriptor = "Le;")
    public static class191 field1427 = field1422;

    @OriginalMember(owner = "client!ae", name = "i", descriptor = "Le;")
    private static class191 field1429 = class54.method368("Select a world", 2047);

    @OriginalMember(owner = "client!ae", name = "j", descriptor = "J")
    public static long field1430 = 0L;

    @OriginalMember(owner = "client!ae", name = "f", descriptor = "Le;")
    public static class191 field1426 = field1429;

    @OriginalMember(owner = "client!ae", name = "c", descriptor = "I")
    public static int field1423;

    @OriginalMember(owner = "client!ae", name = "e", descriptor = "I")
    public static int field1425;

    @OriginalMember(owner = "client!ae", name = "a", descriptor = "(Lsb;IILqb;ILaf;BI)V")
    public static final void method531(class102 arg0, int arg1, int arg2, class76 arg3, int arg4, class156 arg5, byte arg6, int arg7) {
        if (arg6 > -15) {
            field1430 = 115L;
        }
        field1425++;
        class57 var8 = new class57();
        var8.field1060 = arg1 * 128;
        var8.field1066 = arg4 * 128;
        var8.field1055 = arg7;
        if (arg0 != null) {
            var8.field1046 = arg0.field1680 * 128;
            var8.field1049 = arg0;
            int var10 = arg0.field1652;
            var8.field1044 = arg0.field1640;
            var8.field1045 = arg0.field1688;
            int var11 = arg0.field1686;
            var8.field1042 = arg0.field1692;
            var8.field1063 = arg0.field1674;
            if (arg2 == 1 || arg2 == 3) {
                var10 = arg0.field1686;
                var11 = arg0.field1652;
            }
            var8.field1048 = (arg4 + var10) * 128;
            var8.field1065 = (arg1 + var11) * 128;
            if (arg0.field1649 != null) {
                var8.field1053 = true;
                var8.method384(0);
            }
            if (var8.field1042 != null) {
                var8.field1050 = (int) (Math.random() * (double) (var8.field1044 - var8.field1045)) + var8.field1045;
            }
            class191.field3397.method1176(var8, (byte) 38);
        } else if (arg5 != null) {
            class184 var9 = arg5.field2663;
            var8.field1041 = arg5;
            if (var9.field3225 != null) {
                var8.field1053 = true;
                var9 = var9.method1245((byte) -125);
            }
            if (var9 != null) {
                var8.field1065 = (arg1 + var9.field3208) * 128;
                var8.field1048 = (arg4 + var9.field3208) * 128;
                var8.field1063 = class242.method1699(arg5, -1);
                var8.field1046 = var9.field3173 * 128;
            }
            class269.field4750.method1176(var8, (byte) 38);
        } else if (arg3 != null) {
            var8.field1062 = arg3;
            var8.field1048 = (arg3.method490((byte) -4) + arg4) * 128;
            var8.field1065 = (arg3.method490((byte) -4) + arg1) * 128;
            var8.field1063 = class1.method4((byte) -116, arg3);
            var8.field1046 = arg3.field1299 * 128;
            class228.field4110.method605(arg3.field1315.method1352(65), -3, var8);
            return;
        }
    }

    @OriginalMember(owner = "client!ae", name = "a", descriptor = "(B)V")
    public static void method532(byte arg0) {
        field1424 = null;
        field1422 = null;
        field1426 = null;
        if (arg0 != -87) {
            method531((class102) null, -116, -63, (class76) null, 21, (class156) null, (byte) 29, 9);
        }
        field1428 = null;
        field1429 = null;
        field1427 = null;
    }
}
