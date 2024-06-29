import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!oda")
public class class99 {

    @OriginalMember(owner = "client!oda", name = "e", descriptor = "I")
    public static int field1511 = 0;

    @OriginalMember(owner = "client!oda", name = "b", descriptor = "Lh;")
    public static class571 field1508 = new class571(64);

    @OriginalMember(owner = "client!oda", name = "f", descriptor = "[I")
    public static int[] field1512 = new int[] { 16, 32, 64, 128 };

    @OriginalMember(owner = "client!oda", name = "g", descriptor = "Lcba;")
    public static class471 field1513 = new class471(73, -2);

    @OriginalMember(owner = "client!oda", name = "a", descriptor = "I")
    public static int field1507;

    @OriginalMember(owner = "client!oda", name = "c", descriptor = "I")
    public static int field1509;

    @OriginalMember(owner = "client!oda", name = "d", descriptor = "I")
    public static int field1510;

    @OriginalMember(owner = "client!oda", name = "a", descriptor = "(B)V")
    public static void method705(byte arg0) {
        field1508 = null;
        if (arg0 > -56) {
            field1511 = -38;
        }
        field1512 = null;
        field1513 = null;
    }

    @OriginalMember(owner = "client!oda", name = "a", descriptor = "(BZ)V")
    public static final void method706(byte arg0, boolean arg1) {
        class78.field1262 = 0;
        class188.field2666 = 0;
        field1507++;
        class621.method3616(-7);
        class222.method1423(true, arg1);
        class633.method3679((byte) -111);
        boolean var2 = false;
        for (int var3 = 0; var3 < class78.field1262; var3++) {
            int var5 = class269.field3761[var3];
            class576 var6 = (class576) class278.field3837.method1242(0, (long) var5);
            class109 var7 = var6.field7929;
            if (class483.field6820 && class157.method1015(var5, 16383)) {
                class300.method1907(255);
            }
            if (class405.field5763 != var7.field549) {
                if (var7.field1669.method3509((byte) -17)) {
                    class175.method1115(var7, -13);
                }
                var7.method770(null, true);
                var6.method1117(0);
                var2 = true;
            }
        }
        if (arg0 >= -119) {
            method705((byte) 85);
        }
        if (var2) {
            class204.field2859 = class278.field3837.method1250(0);
            class278.field3837.method1246(class342.field4610, -103);
        }
        if (class403.field5730 != class343.field4627.field165) {
            throw new RuntimeException("gnp1 pos:" + class343.field4627.field165 + " psize:" + class403.field5730);
        }
        for (int var4 = 0; var4 < class480.field6764; var4++) {
            if (class278.field3837.method1242(0, (long) class586.field8386[var4]) == null) {
                throw new RuntimeException("gnp2 pos:" + var4 + " size:" + class480.field6764);
            }
        }
    }

    @OriginalMember(owner = "client!oda", name = "a", descriptor = "(II)V")
    public static final void method707(int arg0, int arg1) {
        class315.field4241 = -1;
        class285.field3931 = arg0;
        class300.field4096 = -1;
        field1510++;
        class399.method2386((byte) -65);
        if (arg1 != 128) {
            method705((byte) 85);
        }
    }

    @OriginalMember(owner = "client!oda", name = "a", descriptor = "(ILsa;)V")
    public static final void method708(int arg0, class174 arg1) {
        class590.field8430[arg0] = arg1;
    }
}
