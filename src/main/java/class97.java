import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!qg")
public class class97 extends class128 {

    @OriginalMember(owner = "client!qg", name = "p", descriptor = "Lqd;")
    public static class173 field1557 = new class173(64);

    @OriginalMember(owner = "client!qg", name = "s", descriptor = "I")
    public static int field1560 = 0;

    @OriginalMember(owner = "client!qg", name = "m", descriptor = "I")
    public int field1554;

    @OriginalMember(owner = "client!qg", name = "n", descriptor = "I")
    public static int field1555;

    @OriginalMember(owner = "client!qg", name = "o", descriptor = "I")
    public int field1556;

    @OriginalMember(owner = "client!qg", name = "q", descriptor = "I")
    public static int field1558;

    @OriginalMember(owner = "client!qg", name = "r", descriptor = "I")
    public static int field1559;

    @OriginalMember(owner = "client!qg", name = "t", descriptor = "I")
    public static int field1561;

    @OriginalMember(owner = "client!qg", name = "a", descriptor = "(IB)Ldm;")
    public static final class182 method666(int arg0, byte arg1) {
        field1558++;
        class182 var2 = (class182) class156.field2439.method1261(0, (long) arg0);
        if (var2 != null) {
            return var2;
        }
        int var3 = 109 / ((4 - arg1) / 34);
        byte[] var4 = class162.field2596.method1680(arg0, 32, -87);
        class182 var5 = new class182();
        if (var4 != null) {
            var5.method1322(new class162(var4), 0);
        }
        var5.method1320(125);
        class156.field2439.method1264(-1, (long) arg0, var5);
        return var5;
    }

    @OriginalMember(owner = "client!qg", name = "f", descriptor = "(I)V")
    public static void method667(int arg0) {
        field1557 = null;
        if (arg0 != 3652) {
            method667(-83);
        }
    }

    @OriginalMember(owner = "client!qg", name = "a", descriptor = "(BII)V")
    public static final void method668(byte arg0, int arg1, int arg2) {
        if (arg0 != -82) {
            method667(-5);
        }
        field1559++;
        class175 var3 = class182.method1317(13, arg1, false);
        var3.method1279((byte) -80);
        var3.field2855 = arg2;
    }

    @OriginalMember(owner = "client!qg", name = "a", descriptor = "(ZILfm;)V")
    public static final void method669(boolean arg0, int arg1, class93 arg2) {
        field1555++;
        if (arg0) {
            int var3 = class310.field4964;
            int var4 = var3 * 956 / 503;
            class266.field4284.method1019((class294.field4709 - var4) / 2, 0, var4, var3);
            class34.field513.method1517(class294.field4709 / 2 - (class34.field513.field3603 / 2), 18);
        }
        arg2.method642(class299.field4792 == 1 ? class117.field1890 : class57.field946, class294.field4709 / 2, class310.field4964 / 2 - 26, 16777215, -1);
        int var5 = class310.field4964 / arg1 - 18;
        class127.method898(class294.field4709 / 2 - 152, var5, 304, 34, 9179409);
        class127.method898(class294.field4709 / 2 - 151, var5 + 1, 302, 32, 0);
        class127.method886(class294.field4709 / 2 - 150, var5 + 2, class195.field3157 * 3, 30, 9179409);
        class127.method886(class294.field4709 / 2 + class195.field3157 * 3 - 150, var5 - -2, 300 - (class195.field3157 * 3), 30, 0);
        arg2.method642(class186.field3032, class294.field4709 / 2, class310.field4964 / 2 + 4, 16777215, -1);
    }
}
