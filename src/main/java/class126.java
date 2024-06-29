import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!qca")
public class class126 extends class512 {

    @OriginalMember(owner = "client!qca", name = "G", descriptor = "Lke;")
    public static class622 field1648 = new class622(82, 9);

    @OriginalMember(owner = "client!qca", name = "H", descriptor = "I")
    public static int field1649;

    @OriginalMember(owner = "client!qca", name = "I", descriptor = "I")
    public static int field1650;

    @OriginalMember(owner = "client!qca", name = "K", descriptor = "I")
    public static int field1652;

    @OriginalMember(owner = "client!qca", name = "L", descriptor = "I")
    public static int field1653;

    @OriginalMember(owner = "client!qca", name = "M", descriptor = "Lqp;")
    public static class682 field1654;

    @OriginalMember(owner = "client!qca", name = "J", descriptor = "[[[S")
    public static short[][][] field1651;

    @OriginalMember(owner = "client!qca", name = "a", descriptor = "(IIIII)V", line = 7)
    public final void method922(int arg0, int arg1, int arg2, int arg3, int arg4) {
        ++field1653;
        int var6 = super.field7316.method781();
        int var7 = ((class543) super.field1443).field7605 * class416.method2494(0) / 10 % var6;
        super.field7316.method791(-var6 + var7 + arg3, arg1, -var7 + var6 + arg2, arg0);
        if (arg4 != -17284) {
            field1651 = null;
        }
    }

    @OriginalMember(owner = "client!qca", name = "a", descriptor = "(CI)Z", line = 22)
    public static final boolean method923(char arg0, int arg1) {
        if (arg1 != 122) {
            method924(false, (byte) -25);
        }
        ++field1650;
        return ~arg0 <= -66 && arg0 <= 'Z' || ~arg0 <= -98 && arg0 <= 'z';
    }

    @OriginalMember(owner = "client!qca", name = "<init>", descriptor = "(Lcb;Lcb;Lhha;)V", line = 34)
    public class126(class544 arg0, class544 arg1, class543 arg2) {
        super(arg0, arg1, arg2);
    }

    @OriginalMember(owner = "client!qca", name = "b", descriptor = "(ZB)V", line = 38)
    public static final void method924(boolean arg0, byte arg1) {
        if (arg1 != 102) {
            field1648 = null;
        }
        class90.method637(class251.field3546, class512.field7325, arg1 ^ -103, class638.field8980, arg0);
        ++field1649;
    }

    @OriginalMember(owner = "client!qca", name = "c", descriptor = "(Z)V", line = 51)
    public static void method925(boolean arg0) {
        field1654 = null;
        field1648 = null;
        field1651 = null;
        if (!arg0) {
            field1648 = null;
        }
    }
}
