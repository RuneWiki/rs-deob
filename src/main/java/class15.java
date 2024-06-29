import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!cb")
public class class15 extends class127 {

    @OriginalMember(owner = "client!cb", name = "z", descriptor = "Lhb;")
    public static class44 field280 = class102.method810("auf einer freien Welt zu spielen)3", -28606);

    @OriginalMember(owner = "client!cb", name = "A", descriptor = "Lhb;")
    private static class44 field281 = class102.method810("Please use a different world)3", -28606);

    @OriginalMember(owner = "client!cb", name = "B", descriptor = "I")
    public static int field282 = 0;

    @OriginalMember(owner = "client!cb", name = "F", descriptor = "I")
    public static int field286 = -1;

    @OriginalMember(owner = "client!cb", name = "C", descriptor = "Lhb;")
    private static class44 field283 = class102.method810("Loaded sprites", -28606);

    @OriginalMember(owner = "client!cb", name = "O", descriptor = "I")
    public static int field295 = 0;

    @OriginalMember(owner = "client!cb", name = "G", descriptor = "Lhb;")
    public static class44 field287 = field283;

    @OriginalMember(owner = "client!cb", name = "R", descriptor = "Lhb;")
    private static class44 field298 = class102.method810("Loading sprites )2 ", -28606);

    @OriginalMember(owner = "client!cb", name = "L", descriptor = "Lhb;")
    public static class44 field292 = class102.method810("titlebutton", -28606);

    @OriginalMember(owner = "client!cb", name = "I", descriptor = "Z")
    public static boolean field289 = false;

    @OriginalMember(owner = "client!cb", name = "D", descriptor = "Lhb;")
    private static class44 field284 = class102.method810("Enter name of friend to delete from list", -28606);

    @OriginalMember(owner = "client!cb", name = "K", descriptor = "Lhb;")
    public static class44 field291 = field284;

    @OriginalMember(owner = "client!cb", name = "W", descriptor = "Lhb;")
    public static class44 field303 = class102.method810("Welt", -28606);

    @OriginalMember(owner = "client!cb", name = "P", descriptor = "Lhb;")
    public static class44 field296 = class102.method810(")1", -28606);

    @OriginalMember(owner = "client!cb", name = "X", descriptor = "[I")
    public static int[] field304 = new int[50];

    @OriginalMember(owner = "client!cb", name = "V", descriptor = "Lhb;")
    public static class44 field302 = field281;

    @OriginalMember(owner = "client!cb", name = "Q", descriptor = "Lhb;")
    public static class44 field297 = field298;

    @OriginalMember(owner = "client!cb", name = "y", descriptor = "Lhb;")
    public static class44 field279 = class102.method810("Keine Antwort vom Server)3", -28606);

    @OriginalMember(owner = "client!cb", name = "E", descriptor = "I")
    public static int field285;

    @OriginalMember(owner = "client!cb", name = "J", descriptor = "I")
    public static int field290;

    @OriginalMember(owner = "client!cb", name = "N", descriptor = "I")
    public static int field294;

    @OriginalMember(owner = "client!cb", name = "S", descriptor = "I")
    public static int field299;

    @OriginalMember(owner = "client!cb", name = "T", descriptor = "I")
    public static int field300;

    @OriginalMember(owner = "client!cb", name = "Y", descriptor = "I")
    public static int field305;

    @OriginalMember(owner = "client!cb", name = "M", descriptor = "Lhb;")
    public class44 field293;

    @OriginalMember(owner = "client!cb", name = "H", descriptor = "Lne;")
    public static class83 field288;

    @OriginalMember(owner = "client!cb", name = "U", descriptor = "[I")
    public static int[] field301;

    @OriginalMember(owner = "client!cb", name = "a", descriptor = "(ILjc;IIII)V", line = 38)
    public static final void method102(int arg0, class57 arg1, int arg2, int arg3, int arg4, int arg5) {
        if (arg0 != -23283) {
            field296 = null;
        }
        field290++;
        class61 var6 = new class61();
        var6.field1563 = arg1.field1471;
        var6.field1554 = arg1.field1469;
        int var7 = arg1.field1498;
        var6.field1556 = arg1.field1457;
        var6.field1544 = arg5 * 128;
        var6.field1537 = arg3 * 128;
        var6.field1555 = arg1.field1490;
        var6.field1540 = arg1.field1452 * 128;
        var6.field1536 = arg2;
        int var8 = arg1.field1458;
        if (arg4 == 1 || arg4 == 3) {
            var8 = arg1.field1498;
            var7 = arg1.field1458;
        }
        var6.field1534 = (arg3 + var7) * 128;
        var6.field1547 = (arg5 + var8) * 128;
        if (arg1.field1446 != null) {
            var6.field1539 = arg1;
            var6.method563((byte) -9);
        }
        class46.field1134.method448(var6, true);
        if (var6.field1554 != null) {
            var6.field1551 = var6.field1555 + (int) (Math.random() * (double) (var6.field1563 - var6.field1555));
        }
    }

    @OriginalMember(owner = "client!cb", name = "a", descriptor = "(Ltd;Ltd;Z)V", line = 98)
    public static final void method103(class116 arg0, class116 arg1, boolean arg2) {
        class121.field2957 = arg1;
        field294++;
        class35.field848 = arg0;
        if (arg2) {
            method103(null, null, false);
        }
    }

    @OriginalMember(owner = "client!cb", name = "a", descriptor = "(IZII)I", line = 116)
    public static final int method104(int arg0, boolean arg1, int arg2, int arg3) {
        int var4 = arg0 - 1 & arg3;
        field300++;
        int var5 = arg3 / arg0;
        int var6 = arg2 / arg0;
        int var7 = class122.method937(var6, 60, var5);
        int var8 = arg0 - 1 & arg2;
        if (!arg1) {
            field283 = null;
        }
        int var9 = class122.method937(var6, 60, var5 + 1);
        int var10 = class122.method937(var6 + 1, 60, var5);
        int var11 = class122.method937(var6 + 1, 60, var5 + 1);
        int var12 = class120.method926(var7, var9, false, arg0, var4);
        int var13 = class120.method926(var10, var11, false, arg0, var4);
        return class120.method926(var12, var13, false, arg0, var8);
    }

    @OriginalMember(owner = "client!cb", name = "b", descriptor = "(B)V", line = 151)
    public static void method105(byte arg0) {
        field292 = null;
        field288 = null;
        field304 = null;
        field298 = null;
        field280 = null;
        if (arg0 != 104) {
            method105((byte) -71);
        }
        field296 = null;
        field302 = null;
        field284 = null;
        field281 = null;
        field297 = null;
        field287 = null;
        field279 = null;
        field301 = null;
        field283 = null;
        field291 = null;
        field303 = null;
    }
}
