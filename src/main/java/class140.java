import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!hc")
public class class140 {

    @OriginalMember(owner = "client!hc", name = "q", descriptor = "I")
    public int field1581 = 128;

    @OriginalMember(owner = "client!hc", name = "p", descriptor = "I")
    public int field1580 = 128;

    @OriginalMember(owner = "client!hc", name = "m", descriptor = "I")
    public int field1577;

    @OriginalMember(owner = "client!hc", name = "j", descriptor = "I")
    public int field1574;

    @OriginalMember(owner = "client!hc", name = "n", descriptor = "I")
    public int field1578;

    @OriginalMember(owner = "client!hc", name = "a", descriptor = "I")
    public int field1565;

    @OriginalMember(owner = "client!hc", name = "b", descriptor = "Ldh;")
    public static class320 field1566 = new class320(58, 7);

    @OriginalMember(owner = "client!hc", name = "d", descriptor = "F")
    public static float field1568;

    @OriginalMember(owner = "client!hc", name = "c", descriptor = "I")
    public int field1567;

    @OriginalMember(owner = "client!hc", name = "e", descriptor = "I")
    public static int field1569;

    @OriginalMember(owner = "client!hc", name = "f", descriptor = "I")
    public int field1570;

    @OriginalMember(owner = "client!hc", name = "g", descriptor = "I")
    public static int field1571;

    @OriginalMember(owner = "client!hc", name = "h", descriptor = "I")
    public int field1572;

    @OriginalMember(owner = "client!hc", name = "i", descriptor = "I")
    public static int field1573;

    @OriginalMember(owner = "client!hc", name = "k", descriptor = "I")
    public int field1575;

    @OriginalMember(owner = "client!hc", name = "l", descriptor = "I")
    public static int field1576;

    @OriginalMember(owner = "client!hc", name = "o", descriptor = "I")
    public int field1579;

    @OriginalMember(owner = "client!hc", name = "s", descriptor = "I")
    public static int field1583;

    @OriginalMember(owner = "client!hc", name = "r", descriptor = "[[I")
    public static int[][] field1582;

    @OriginalMember(owner = "client!hc", name = "a", descriptor = "(B)V")
    public static final void method879(byte arg0) {
        for (class456 var1 = (class456) class228.field2651.method1753(0); var1 != null; var1 = (class456) class228.field2651.method1755(-111)) {
            if (var1.field6538) {
                var1.field6538 = false;
            } else {
                class459.method2805(var1.field6544, -72);
            }
        }
        if (arg0 < 40) {
            field1568 = -0.64841145F;
        }
        field1583++;
    }

    @OriginalMember(owner = "client!hc", name = "a", descriptor = "(Lha;B)V")
    public static final void method880(class58 arg0, byte arg1) {
        field1573++;
        if (class85.field904 == class90.field937.field4628 || class638.field9170 == null) {
            return;
        }
        if (class312.method1854(class90.field937.field4628, 4, arg0)) {
            class85.field904 = class90.field937.field4628;
        }
        if (arg1 >= -121) {
            field1582 = null;
        }
    }

    @OriginalMember(owner = "client!hc", name = "a", descriptor = "(I)Lhc;")
    public final class140 method881(int arg0) {
        field1571++;
        return arg0 == -2 ? new class140(this.field1577, this.field1580, this.field1581, this.field1574, this.field1578, this.field1565) : null;
    }

    @OriginalMember(owner = "client!hc", name = "a", descriptor = "(BLhc;)V")
    public final void method882(byte arg0, class140 arg1) {
        this.field1578 = arg1.field1578;
        int var3 = -128 % ((-arg0 - 50) / 40);
        field1569++;
        this.field1565 = arg1.field1565;
        this.field1577 = arg1.field1577;
        this.field1580 = arg1.field1580;
        this.field1581 = arg1.field1581;
        this.field1574 = arg1.field1574;
    }

    @OriginalMember(owner = "client!hc", name = "a", descriptor = "(III)V")
    public static final void method883(int arg0, int arg1, int arg2) {
        if (class634.field9120 == 1) {
            class229.method1326(arg1, (byte) 68, class713.field10035, arg0);
        } else if (class634.field9120 == 2) {
            if (class397.field5443) {
                class439.method2740(arg1 + class389.method2400(69), 0, class752.method4192(1) + arg0);
            } else {
                class439.method2740(arg1, 0, arg0);
            }
        }
        field1576++;
        if (arg2 <= -86) {
            class634.field9120 = 0;
            class713.field10035 = null;
        }
    }

    @OriginalMember(owner = "client!hc", name = "b", descriptor = "(I)V")
    public static void method884(int arg0) {
        field1566 = null;
        if (arg0 == 128) {
            field1582 = null;
        }
    }

    @OriginalMember(owner = "client!hc", name = "<init>", descriptor = "(I)V")
    public class140(int arg0) {
        this.field1577 = arg0;
    }

    @OriginalMember(owner = "client!hc", name = "<init>", descriptor = "(IIIIII)V")
    private class140(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        this.field1574 = arg3;
        this.field1580 = arg1;
        this.field1577 = arg0;
        this.field1581 = arg2;
        this.field1578 = arg4;
        this.field1565 = arg5;
    }
}
