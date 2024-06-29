import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!jl")
public class class106 extends class280 {

    @OriginalMember(owner = "client!jl", name = "t", descriptor = "I")
    private int field1571 = -32768;

    @OriginalMember(owner = "client!jl", name = "r", descriptor = "[Lml;")
    public static class152[] field1569 = new class152[500];

    @OriginalMember(owner = "client!jl", name = "C", descriptor = "Lma;")
    private static class5 field1580 = class12.method119("Please wait)3)3)3", (byte) 84);

    @OriginalMember(owner = "client!jl", name = "z", descriptor = "I")
    public static int field1577 = 0;

    @OriginalMember(owner = "client!jl", name = "B", descriptor = "I")
    public static int field1579 = 0;

    @OriginalMember(owner = "client!jl", name = "D", descriptor = "I")
    public static volatile int field1581 = 0;

    @OriginalMember(owner = "client!jl", name = "y", descriptor = "[I")
    public static int[] field1576 = new int[128];

    @OriginalMember(owner = "client!jl", name = "p", descriptor = "Lma;")
    public static class5 field1567 = field1580;

    @OriginalMember(owner = "client!jl", name = "F", descriptor = "[I")
    public static int[] field1583 = new int[] { 1, 4 };

    @OriginalMember(owner = "client!jl", name = "q", descriptor = "Ltj;")
    public static class73 field1568 = new class73(64);

    @OriginalMember(owner = "client!jl", name = "G", descriptor = "Lma;")
    public static class5 field1584 = class12.method119("Fps:", (byte) 89);

    @OriginalMember(owner = "client!jl", name = "s", descriptor = "I")
    public static int field1570;

    @OriginalMember(owner = "client!jl", name = "u", descriptor = "I")
    public int field1572;

    @OriginalMember(owner = "client!jl", name = "v", descriptor = "I")
    public int field1573;

    @OriginalMember(owner = "client!jl", name = "w", descriptor = "I")
    public static int field1574;

    @OriginalMember(owner = "client!jl", name = "x", descriptor = "I")
    public static int field1575;

    @OriginalMember(owner = "client!jl", name = "A", descriptor = "I")
    public static int field1578;

    @OriginalMember(owner = "client!jl", name = "E", descriptor = "I")
    public static int field1582;

    @OriginalMember(owner = "client!jl", name = "a", descriptor = "(IIIIIIIIJ)V", line = 21)
    public final void method242(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, long arg8) {
        field1575++;
        class34 var11 = class235.method1664(117, this.field1572).method1285((class33) null, 0, this.field1573, (byte) -67);
        if (var11 != null) {
            var11.method242(arg0, arg1, arg2, arg3, arg4, arg5, arg6, arg7, arg8);
            this.field1571 = var11.method248();
        }
    }

    @OriginalMember(owner = "client!jl", name = "b", descriptor = "(II)V", line = 36)
    public static final void method669(int arg0, int arg1) {
        field1582++;
        if (arg1 == -1 || !class97.field1443[arg1]) {
            return;
        }
        class29.field479.method1339(120, arg1);
        if (class256.field4376[arg1] == null) {
            return;
        }
        boolean var2 = true;
        for (int var3 = 0; var3 < class256.field4376[arg1].length; var3++) {
            if (class256.field4376[arg1][var3] != null) {
                if (class256.field4376[arg1][var3].field4216 == 2) {
                    var2 = false;
                } else {
                    class256.field4376[arg1][var3] = null;
                }
            }
        }
        if (var2) {
            class256.field4376[arg1] = null;
        }
        class97.field1443[arg1] = false;
        if (arg0 > -39) {
            method669(-84, 40);
        }
    }

    @OriginalMember(owner = "client!jl", name = "a", descriptor = "([Ljava/lang/Object;Z[J)V", line = 89)
    public static final void method670(Object[] arg0, boolean arg1, long[] arg2) {
        if (!arg1) {
            class123.method815(-2048, arg2.length - 1, arg2, arg0, 0);
            field1578++;
        }
    }

    @OriginalMember(owner = "client!jl", name = "b", descriptor = "()I", line = 100)
    public final int method248() {
        field1570++;
        return this.field1571;
    }

    @OriginalMember(owner = "client!jl", name = "b", descriptor = "(I)V", line = 108)
    public static void method671(int arg0) {
        field1583 = null;
        field1569 = null;
        field1568 = null;
        field1584 = null;
        field1576 = null;
        if (arg0 == 0) {
            field1567 = null;
            field1580 = null;
        }
    }

    @OriginalMember(owner = "client!jl", name = "c", descriptor = "(I)V", line = 130)
    public static final void method672(int arg0) {
        field1574++;
        class1.method3((byte) 119);
        class52.method391(-127);
        class116.method761(-1);
        class84.method564(arg0 ^ 0x7FC4);
        class219.method1490(-36);
        class287.method1936(true);
        class88.method581((byte) -116);
        class245.method1720(37);
        class287.method1937(-117);
        class18.method154(false);
        class246.method1725(-1762745556);
        class50.method386(8);
        class123.method816(true);
        class290.method1961(false);
        class251.field4153.method971(105);
        class172.field2647.method1349(arg0 + 32768);
        class146.field2112.method1349(0);
        class237.field3910.method1349(arg0 + 32768);
        class13.field244.method1349(0);
        class86.field1302.method1349(0);
        class182.field2775.method1349(0);
        class151.field2201.method1349(arg0 ^ 0xFFFF8000);
        class206.field3285.method1349(arg0 ^ arg0);
        class267.field4599.method1349(0);
        class172.field2652.method1349(0);
        class93.field1424.method1349(0);
        class84.field1288.method523(123);
    }
}
