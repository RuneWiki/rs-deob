import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!tm")
public abstract class class242 extends class272 {

    @OriginalMember(owner = "client!tm", name = "y", descriptor = "Ldk;")
    public static class326 field3619 = new class326(" has logged out.", " loggt sich aus.", " s'est déconnecté.", " saiu do jogo.");

    @OriginalMember(owner = "client!tm", name = "A", descriptor = "[I")
    public static int[] field3621 = new int[50];

    @OriginalMember(owner = "client!tm", name = "x", descriptor = "I")
    public static int field3618;

    @OriginalMember(owner = "client!tm", name = "z", descriptor = "I")
    public static int field3620;

    @OriginalMember(owner = "client!tm", name = "B", descriptor = "I")
    public static int field3622;

    @OriginalMember(owner = "client!tm", name = "d", descriptor = "(B)V")
    public static void method1530(byte arg0) {
        field3619 = null;
        if (arg0 <= 105) {
            method1532((byte) -100, -111);
        }
        field3621 = null;
    }

    @OriginalMember(owner = "client!tm", name = "a", descriptor = "(IIIIIZIIIIIIII)V")
    public static final void method1531(int arg0, int arg1, int arg2, int arg3, int arg4, boolean arg5, int arg6, int arg7, int arg8, int arg9, int arg10, int arg11, int arg12, int arg13) {
        field3620++;
        if (class53.field725 == null) {
            return;
        }
        class146 var15;
        if (arg7 >= 0) {
            int var14 = arg7 - 1;
            var15 = class139.field1851[var14];
        } else {
            int var16 = -arg7 - 1;
            if (class295.field4273 == var16) {
                var15 = class492.field6935;
            } else {
                var15 = class124.field1559[var16];
            }
        }
        if (var15 == null) {
            return;
        }
        class453 var17 = class156.field2325.method808(arg4, 0);
        int var18;
        int var19;
        if (arg0 == 1 || arg0 == 3) {
            var18 = var17.field6325;
            var19 = var17.field6385;
        } else {
            var18 = var17.field6385;
            var19 = var17.field6325;
        }
        if (arg5) {
            field3619 = null;
        }
        int var20 = (var19 >> 1) + arg3;
        int var21 = (var19 + 1 >> 1) + arg3;
        int var22 = arg11 + (var18 >> 1);
        int var23 = (var18 + 1 >> 1) + arg11;
        class426 var24 = class53.field725[arg9];
        int var25 = var24.method1218(var20, var22) + var24.method1218(var21, var22) + var24.method1218(var20, var23) + var24.method1218(var21, var23) >> 2;
        class113 var26 = new class113();
        var26.field1425 = arg12;
        var26.field1431 = class353.field5090 + arg8;
        var26.field1435 = var15.field4319;
        var26.field1442 = arg4;
        var26.field1434 = arg11;
        if (arg6 < arg10) {
            int var27 = arg10;
            arg10 = arg6;
            arg6 = var27;
        }
        var26.field1444 = arg0;
        var26.field1428 = class353.field5090 + arg13;
        var26.field1436 = arg3;
        var26.field1437 = arg3 + arg6;
        var26.field1430 = arg3 + arg10;
        if (arg2 > arg1) {
            int var28 = arg2;
            arg2 = arg1;
            arg1 = var28;
        }
        var26.field1439 = arg11 + arg2;
        var26.field1426 = arg11 + arg1;
        var26.field1441 = var25;
        var26.field1427 = (var26.field1434 << 7) + (var18 << 6);
        var26.field1433 = (var26.field1436 << 7) + (var19 << 6);
        class447.field6192.method2845(var26, (byte) 37);
        var15.field2167 = var26;
    }

    @OriginalMember(owner = "client!tm", name = "a", descriptor = "(BI)Z")
    public static final boolean method1532(byte arg0, int arg1) {
        field3618++;
        if (arg1 == 57 || arg1 == 17 || arg1 == 50 || arg1 == 51 || arg1 == 13) {
            return true;
        } else if (arg1 == 5 || arg1 == 1008) {
            return true;
        } else {
            if (arg0 > -100) {
                method1531(51, -72, -7, 7, 119, true, 53, -73, 32, 57, 57, 48, 73, 111);
            }
            return false;
        }
    }
}
