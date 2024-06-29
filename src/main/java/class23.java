import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!fk")
public abstract class class23 extends class295 {

    @OriginalMember(owner = "client!fk", name = "J", descriptor = "Lpc;")
    public class34 field423;

    @OriginalMember(owner = "client!fk", name = "C", descriptor = "[I")
    public static int[] field416 = new int[13];

    @OriginalMember(owner = "client!fk", name = "E", descriptor = "F")
    public static float field418;

    @OriginalMember(owner = "client!fk", name = "B", descriptor = "I")
    public static int field415;

    @OriginalMember(owner = "client!fk", name = "F", descriptor = "I")
    public static int field419;

    @OriginalMember(owner = "client!fk", name = "H", descriptor = "I")
    public static int field421;

    @OriginalMember(owner = "client!fk", name = "D", descriptor = "Lrk;")
    public static class427 field417;

    @OriginalMember(owner = "client!fk", name = "G", descriptor = "Lrk;")
    public static class427 field420;

    @OriginalMember(owner = "client!fk", name = "I", descriptor = "Lfp;")
    public static class7 field422;

    @OriginalMember(owner = "client!fk", name = "a", descriptor = "(II)Laa;", line = 10)
    public static final class275 method288(int arg0, int arg1) {
        field421++;
        class275 var2 = (class275) class303.field4106.method2537(arg0 - 82, (long) arg1);
        if (var2 != null) {
            return var2;
        }
        byte[] var3 = class36.field561.method2633(arg1, -1, 1);
        class275 var4 = new class275();
        var4.field3687 = arg1;
        if (var3 != null) {
            var4.method1760(0, new class289(var3));
        }
        if (arg0 != 5) {
            method288(-85, 46);
        }
        var4.method1761((byte) 126);
        if (var4.field3699 == 2 && class88.field1303.method614(-126, (long) arg1) == null) {
            class88.field1303.method612((long) arg1, -1, new class193(class176.field2604));
            class91.field1348[class176.field2604++] = var4;
        }
        class303.field4106.method2542(var4, (byte) 86, (long) arg1);
        return var4;
    }

    @OriginalMember(owner = "client!fk", name = "b", descriptor = "(Z)V", line = 55)
    public static void method290(boolean arg0) {
        field417 = null;
        field422 = null;
        field416 = null;
        field420 = null;
        if (!arg0) {
            field420 = null;
        }
    }

    @OriginalMember(owner = "client!fk", name = "a", descriptor = "(IJ)V", line = 72)
    public static final void method291(int arg0, long arg1) {
        field419++;
        if (class91.field1351 != null) {
            if (class184.field2675 == 1 || class184.field2675 == 5) {
                class286.method1806(arg1, false);
            } else if (class184.field2675 == 2) {
                class365.method2288(0);
            } else if (class184.field2675 == 4) {
                class3.method13(18423, arg1);
            } else {
                class243.method1599((byte) -125);
            }
        }
        class183.method1339((byte) -106, (long) class414.field5793, class249.field3415);
        if (~class149.field2288 != arg0) {
            class344.method2183(class149.field2288, (byte) -67);
        }
        for (int var3 = 0; var3 < class352.field4817; var3++) {
            if (class135.field1930[var3]) {
                class199.field2844[var3] = true;
            }
            class411.field5754[var3] = class135.field1930[var3];
            class135.field1930[var3] = false;
        }
        class266.field3577 = class414.field5793;
        if (class249.field3415.method172()) {
            class436.field6228 = true;
        }
        class293.field3965 = null;
        if (class149.field2288 != -1) {
            class352.field4817 = 0;
            class184.method1343(18412);
        }
        class249.field3415.method122();
        class221.method1500(class249.field3415, true);
        int var4 = class180.method1326(arg0 + 95);
        if (var4 == -1) {
            var4 = class24.field424;
        }
        class28.method333(var4, 99);
        class89.method786(class95.field1379.field3176, class69.field1046, class95.field1379.field3167, class339.field4628, -47);
        class339.field4628 = 0;
    }

    @OriginalMember(owner = "client!fk", name = "f", descriptor = "(B)Ltj;", line = 138)
    public static final class430 method292(byte arg0) {
        field415++;
        if (class99.field1416 == null || class383.field5373 == null) {
            return null;
        }
        class383.field5373.method1416(true, class99.field1416);
        class430 var1 = (class430) class383.field5373.method1418((byte) 81);
        if (var1 == null) {
            return null;
        }
        if (arg0 >= -94) {
            method290(true);
        }
        class384 var2 = class212.method1451(var1.field6119, 36);
        return var2 != null && var2.field5414 && var2.method2382(-14605) ? var1 : class417.method2580(4);
    }

    @OriginalMember(owner = "client!fk", name = "<init>", descriptor = "(Lpc;)V", line = 165)
    public class23(class34 arg0) {
        this.field423 = arg0;
    }

    @OriginalMember(owner = "client!fk", name = "e", descriptor = "(B)Z")
    public abstract boolean method287(byte arg0);

    @OriginalMember(owner = "client!fk", name = "e", descriptor = "(I)Ljava/lang/Object;")
    public abstract Object method289(int arg0);
}
