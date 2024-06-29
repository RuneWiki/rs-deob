import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!f")
public class class84 extends class99 {

    @OriginalMember(owner = "client!f", name = "T", descriptor = "Lcc;")
    public static class83 field1627 = new class83(5000);

    @OriginalMember(owner = "client!f", name = "U", descriptor = "Lqc;")
    public static class245 field1628 = new class245(64);

    @OriginalMember(owner = "client!f", name = "X", descriptor = "Ltg;")
    public static class215 field1631 = new class215(32);

    @OriginalMember(owner = "client!f", name = "Z", descriptor = "Lr;")
    public static class66 field1633 = class93.method641(43, "T");

    @OriginalMember(owner = "client!f", name = "Y", descriptor = "Lr;")
    public static class66 field1632 = class93.method641(43, "Standort");

    @OriginalMember(owner = "client!f", name = "Q", descriptor = "I")
    public static int field1624;

    @OriginalMember(owner = "client!f", name = "R", descriptor = "I")
    public static int field1625;

    @OriginalMember(owner = "client!f", name = "S", descriptor = "I")
    public static int field1626;

    @OriginalMember(owner = "client!f", name = "V", descriptor = "I")
    public static int field1629;

    @OriginalMember(owner = "client!f", name = "W", descriptor = "I")
    public static int field1630;

    @OriginalMember(owner = "client!f", name = "b", descriptor = "(II)Z")
    public static final boolean method582(int arg0, int arg1) {
        if (arg0 != 0) {
            return false;
        } else {
            ++field1625;
            return (1 & arg1 >> 29) != 0;
        }
    }

    @OriginalMember(owner = "client!f", name = "a", descriptor = "(BI)[I")
    public final int[] method10(byte arg0, int arg1) {
        ++field1630;
        if (arg0 != -61) {
            this.method10((byte) -99, 53);
        }
        int[] var3 = super.field1943.method749(false, arg1);
        if (super.field1943.field2147) {
            class46.method330(var3, 0, class199.field3432, class19.field261[arg1]);
        }
        return var3;
    }

    @OriginalMember(owner = "client!f", name = "<init>", descriptor = "()V")
    public class84() {
        super(0, true);
    }

    @OriginalMember(owner = "client!f", name = "a", descriptor = "(ILlh;I)Lr;")
    public static final class66 method583(int arg0, class249 arg1, int arg2) {
        ++field1626;
        try {
            class66 var3 = new class66();
            var3.field1308 = arg1.method1639(255);
            if (var3.field1308 > arg2) {
                var3.field1308 = arg2;
            }
            var3.field1283 = new byte[var3.field1308];
            arg1.field4335 += class82.field1595.method631(var3.field1283, arg0 + 8, arg1.field4335, var3.field1308, arg0, arg1.field4350);
            return var3;
        } catch (Exception var4) {
            return class16.field209;
        }
    }

    @OriginalMember(owner = "client!f", name = "g", descriptor = "(I)V")
    public static void method584(int arg0) {
        field1631 = null;
        field1628 = null;
        field1633 = null;
        if (arg0 != 9071) {
            field1631 = null;
        }
        field1632 = null;
        field1627 = null;
    }
}
