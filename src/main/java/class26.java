import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!wv")
public abstract class class26 extends class80 {

    @OriginalMember(owner = "client!wv", name = "z", descriptor = "I")
    public int field403;

    @OriginalMember(owner = "client!wv", name = "y", descriptor = "Lcg;")
    public class90 field402;

    @OriginalMember(owner = "client!wv", name = "A", descriptor = "Llg;")
    public static class284 field404 = new class284(8, -1);

    @OriginalMember(owner = "client!wv", name = "B", descriptor = "[Loc;")
    public static class135[] field405 = new class135[2048];

    @OriginalMember(owner = "client!wv", name = "v", descriptor = "I")
    public static int field399;

    @OriginalMember(owner = "client!wv", name = "w", descriptor = "I")
    public static int field400;

    @OriginalMember(owner = "client!wv", name = "x", descriptor = "I")
    public static int field401;

    @OriginalMember(owner = "client!wv", name = "C", descriptor = "[Lbt;")
    public static class33[] field406;

    @OriginalMember(owner = "client!wv", name = "a", descriptor = "(II)V", line = 5)
    public static final void method185(int arg0, int arg1) {
        field401++;
        class163 var2 = class271.method1546(arg0, arg1, true);
        var2.method1010(1504);
    }

    @OriginalMember(owner = "client!wv", name = "b", descriptor = "(II)V", line = 17)
    public static final void method186(int arg0, int arg1) {
        field400++;
        if (class137.field1958 == arg0) {
            return;
        }
        if (arg1 != 8) {
            method190(67, (byte) -29);
        }
        if (class137.field1958 == 0) {
            class296.method1702(-98);
        }
        if (arg0 == 40) {
            class339.method1883((byte) -59);
        }
        if (arg0 != 40 && class152.field2137 != null) {
            class152.field2137.method644(-119);
            class152.field2137 = null;
        }
        if (class137.field1958 == 25 || class137.field1958 == 28) {
            class249.field3463.field3322 = 2;
            class288.field3883.field3322 = 2;
            class370.field5195.field3322 = 2;
            class430.field6268.field3322 = 2;
            class435.field6343.field3322 = 2;
            class204.field2893.field3322 = 2;
            class1.field16.field3322 = 2;
        }
        if (arg0 == 25 || arg0 == 28) {
            class65.field895 = 0;
            class452.field6586 = 0;
            class463.field6720 = 1;
            class388.field5453 = 0;
            class442.field6432 = 1;
            class101.method671(true, arg1 ^ 0x48);
            class249.field3463.field3322 = 1;
            class288.field3883.field3322 = 1;
            class370.field5195.field3322 = 1;
            class430.field6268.field3322 = 1;
            class435.field6343.field3322 = 1;
            class204.field2893.field3322 = 1;
            class1.field16.field3322 = 1;
        }
        if (arg0 == 25 || arg0 == 10) {
            class424.method2531(0);
        }
        if (arg0 == 5) {
            class422.method2520((byte) -126, class418.field6109, class192.field2735);
        } else {
            class223.method1316(27);
        }
        boolean var2 = arg0 == 5 || arg0 == 10 || arg0 == 28;
        boolean var3 = class137.field1958 == 5 || class137.field1958 == 10 || class137.field1958 == 28;
        if (var2 != var3) {
            if (var2) {
                class444.field6455 = class289.field3886;
                if (class437.field6374.field4252 == 0) {
                    class316.method1794(2, arg1 ^ 0xFFFFFF8C);
                } else {
                    class66.method411(class289.field3886, false, true, 0, class437.field6374.field4252, 2, class252.field3511);
                }
                class119.field1625.method2551(false, (byte) 107);
            } else {
                class316.method1794(2, -127);
                class119.field1625.method2551(true, (byte) 107);
            }
        }
        if (arg0 == 25 || arg0 == 28 || arg0 == 40) {
            class418.field6109.method498();
        }
        class137.field1958 = arg0;
    }

    @OriginalMember(owner = "client!wv", name = "a", descriptor = "(I)V", line = 119)
    public static void method187(int arg0) {
        field406 = null;
        if (arg0 == 1) {
            field404 = null;
            field405 = null;
        }
    }

    @OriginalMember(owner = "client!wv", name = "a", descriptor = "(IB)V", line = 133)
    public static final void method190(int arg0, byte arg1) {
        field399++;
        class163 var2 = class271.method1546(arg0, 6, true);
        var2.method1010(1504);
        if (arg1 != -40) {
            field406 = null;
        }
    }

    @OriginalMember(owner = "client!wv", name = "<init>", descriptor = "(Lcg;I)V", line = 145)
    public class26(class90 arg0, int arg1) {
        this.field403 = arg1;
        this.field402 = arg0;
    }

    @OriginalMember(owner = "client!wv", name = "c", descriptor = "(B)Z")
    public abstract boolean method188(byte arg0);

    @OriginalMember(owner = "client!wv", name = "g", descriptor = "(I)Ljava/lang/Object;")
    public abstract Object method189(int arg0);
}
