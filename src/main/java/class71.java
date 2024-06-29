import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ge")
public class class71 extends class67 {

    @OriginalMember(owner = "client!ge", name = "C", descriptor = "I")
    public static int field1316 = 0;

    @OriginalMember(owner = "client!ge", name = "G", descriptor = "Li;")
    private static class88 field1320 = class208.method1425(105, "shake:");

    @OriginalMember(owner = "client!ge", name = "A", descriptor = "Li;")
    private static class88 field1314 = class208.method1425(105, "World");

    @OriginalMember(owner = "client!ge", name = "E", descriptor = "Li;")
    public static class88 field1318 = class208.method1425(105, "Hier wechseln");

    @OriginalMember(owner = "client!ge", name = "y", descriptor = "Li;")
    public static class88 field1312 = field1314;

    @OriginalMember(owner = "client!ge", name = "z", descriptor = "Li;")
    public static class88 field1313 = field1320;

    @OriginalMember(owner = "client!ge", name = "L", descriptor = "Li;")
    public static class88 field1325 = class208.method1425(105, "Mem:");

    @OriginalMember(owner = "client!ge", name = "u", descriptor = "Li;")
    public static class88 field1308 = field1320;

    @OriginalMember(owner = "client!ge", name = "M", descriptor = "Li;")
    public static class88 field1326 = field1314;

    @OriginalMember(owner = "client!ge", name = "x", descriptor = "Li;")
    private static class88 field1311 = class208.method1425(105, "Loading interfaces )2 ");

    @OriginalMember(owner = "client!ge", name = "O", descriptor = "I")
    public static int field1328 = 0;

    @OriginalMember(owner = "client!ge", name = "Q", descriptor = "Li;")
    public static class88 field1330 = class208.method1425(105, "Registrierter Benutzer");

    @OriginalMember(owner = "client!ge", name = "I", descriptor = "Li;")
    public static class88 field1322 = field1311;

    @OriginalMember(owner = "client!ge", name = "B", descriptor = "B")
    public byte field1315;

    @OriginalMember(owner = "client!ge", name = "t", descriptor = "I")
    public static int field1307;

    @OriginalMember(owner = "client!ge", name = "v", descriptor = "I")
    public static int field1309;

    @OriginalMember(owner = "client!ge", name = "w", descriptor = "I")
    public static int field1310;

    @OriginalMember(owner = "client!ge", name = "D", descriptor = "I")
    public int field1317;

    @OriginalMember(owner = "client!ge", name = "F", descriptor = "I")
    public static int field1319;

    @OriginalMember(owner = "client!ge", name = "K", descriptor = "I")
    public static int field1324;

    @OriginalMember(owner = "client!ge", name = "N", descriptor = "I")
    public static int field1327;

    @OriginalMember(owner = "client!ge", name = "P", descriptor = "I")
    public static int field1329;

    @OriginalMember(owner = "client!ge", name = "H", descriptor = "Li;")
    public class88 field1321;

    @OriginalMember(owner = "client!ge", name = "J", descriptor = "Li;")
    public class88 field1323;

    @OriginalMember(owner = "client!ge", name = "b", descriptor = "(I)V")
    public static void method471(int arg0) {
        field1318 = null;
        field1313 = null;
        field1314 = null;
        field1308 = null;
        field1330 = null;
        field1322 = null;
        field1312 = null;
        if (arg0 != -1) {
            field1326 = null;
        }
        field1325 = null;
        field1311 = null;
        field1320 = null;
        field1326 = null;
    }

    @OriginalMember(owner = "client!ge", name = "a", descriptor = "(IB)Lng;")
    public static final class149 method472(int arg0, byte arg1) {
        field1319++;
        class149 var2 = (class149) class211.field4000.method666((long) arg0, 0);
        if (arg1 >= -87) {
            field1313 = null;
        }
        if (var2 != null) {
            return var2;
        }
        byte[] var3 = class236.field4402.method941((byte) 56, class129.method874(115, arg0), class138.method922(arg0, -27988));
        class149 var4 = new class149();
        var4.field2846 = arg0;
        if (var3 != null) {
            var4.method1016(-1, new class46(var3));
        }
        var4.method1015(-1);
        if (var4.field2869 != -1) {
            var4.method1021(50, method472(var4.field2843, (byte) -119), method472(var4.field2869, (byte) -107));
        }
        if (var4.field2886 != -1) {
            var4.method1022(method472(var4.field2876, (byte) -125), -15574, method472(var4.field2886, (byte) -113));
        }
        if (!class142.field2625 && var4.field2879) {
            var4.field2838 = 0;
            var4.field2900 = null;
            var4.field2863 = false;
            var4.field2894 = class176.field3535;
            var4.field2906 = null;
        }
        class211.field4000.method664((long) arg0, var4, false);
        return var4;
    }

    @OriginalMember(owner = "client!ge", name = "a", descriptor = "(BI)I")
    public static final int method473(byte arg0, int arg1) {
        if (arg0 != 44) {
            field1312 = null;
        }
        field1307++;
        return arg1 & 0x3FF;
    }

    @OriginalMember(owner = "client!ge", name = "b", descriptor = "(Z)V")
    public static final void method474(boolean arg0) {
        field1324++;
        class108.field1957.method671(107);
        if (!arg0) {
            field1322 = null;
        }
    }

    @OriginalMember(owner = "client!ge", name = "a", descriptor = "(ILq;)Z")
    public static final boolean method475(int arg0, class174 arg1) {
        if (arg0 != 0) {
            method471(-74);
        }
        field1327++;
        if (class116.field2105) {
            if (class80.method530(-881710560, arg1) != 0) {
                return false;
            }
            if (arg1.field3392 == 0) {
                return false;
            }
        }
        return arg1.field3380;
    }
}
