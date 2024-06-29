import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!hu")
public class class117 extends class1 {

    @OriginalMember(owner = "client!hu", name = "n", descriptor = "I")
    private int field1552;

    @OriginalMember(owner = "client!hu", name = "s", descriptor = "I")
    private int field1557;

    @OriginalMember(owner = "client!hu", name = "z", descriptor = "I")
    private int field1564;

    @OriginalMember(owner = "client!hu", name = "q", descriptor = "I")
    private int field1555;

    @OriginalMember(owner = "client!hu", name = "r", descriptor = "[I")
    public static int[] field1556 = new int[8];

    @OriginalMember(owner = "client!hu", name = "t", descriptor = "[C")
    private static char[] field1558 = new char[64];

    @OriginalMember(owner = "client!hu", name = "x", descriptor = "[I")
    public static int[] field1562;

    @OriginalMember(owner = "client!hu", name = "v", descriptor = "I")
    public static int field1560;

    @OriginalMember(owner = "client!hu", name = "l", descriptor = "I")
    public static int field1550;

    @OriginalMember(owner = "client!hu", name = "m", descriptor = "I")
    public static int field1551;

    @OriginalMember(owner = "client!hu", name = "o", descriptor = "I")
    public static int field1553;

    @OriginalMember(owner = "client!hu", name = "p", descriptor = "I")
    public static int field1554;

    @OriginalMember(owner = "client!hu", name = "y", descriptor = "I")
    public static int field1563;

    @OriginalMember(owner = "client!hu", name = "u", descriptor = "Lpj;")
    public static class132 field1559;

    @OriginalMember(owner = "client!hu", name = "w", descriptor = "Lvfa;")
    public static class616 field1561;

    static {
        for (int var0 = 0; ~var0 > -27; ++var0) {
            field1558[var0] = (char) (var0 + 65);
        }
        for (int var1 = 26; var1 < 52; ++var1) {
            field1558[var1] = (char) (var1 + 97 + -26);
        }
        for (int var2 = 52; ~var2 > -63; ++var2) {
            field1558[var2] = (char) (var2 + 48 - 52);
        }
        field1558[63] = '-';
        field1558[62] = '*';
        field1562 = new int[] { 28, 35, 40, 44 };
        field1560 = -1;
    }

    @OriginalMember(owner = "client!hu", name = "a", descriptor = "(IIZ)V", line = 4)
    public final void method8(int arg0, int arg1, boolean arg2) {
        if (arg2) {
            field1562 = null;
        }
        ++field1551;
    }

    @OriginalMember(owner = "client!hu", name = "b", descriptor = "(III)V", line = 14)
    public final void method6(int arg0, int arg1, int arg2) {
        ++field1554;
        if (arg0 <= -96) {
            int var4 = this.field1564 * arg1 >> 12;
            int var5 = this.field1555 * arg1 >> 12;
            int var6 = this.field1557 * arg2 >> 12;
            int var7 = this.field1552 * arg2 >> 12;
            class533.method2949(super.field2, var7, 1, super.field4, var5, var4, var6, super.field7);
        }
    }

    @OriginalMember(owner = "client!hu", name = "a", descriptor = "(IZI)V", line = 38)
    public final void method2(int arg0, boolean arg1, int arg2) {
        ++field1550;
        int var4 = this.field1564 * arg0 >> 12;
        int var5 = this.field1555 * arg0 >> 12;
        int var6 = this.field1557 * arg2 >> 12;
        int var7 = this.field1552 * arg2 >> 12;
        if (!arg1) {
            method854(-48, (byte) -67, -40);
        }
        class83.method648(var4, var7, (byte) 11, var5, var6, super.field7);
    }

    @OriginalMember(owner = "client!hu", name = "b", descriptor = "(I)V", line = 60)
    public static void method853(int arg0) {
        field1556 = null;
        if (arg0 == 42) {
            field1561 = null;
            field1559 = null;
            field1562 = null;
            field1558 = null;
        }
    }

    @OriginalMember(owner = "client!hu", name = "<init>", descriptor = "(IIIIIII)V", line = 78)
    public class117(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        super(arg4, arg5, arg6);
        this.field1552 = arg3;
        this.field1557 = arg1;
        this.field1564 = arg0;
        this.field1555 = arg2;
    }

    @OriginalMember(owner = "client!hu", name = "a", descriptor = "(IBI)Z", line = 90)
    public static final boolean method854(int arg0, byte arg1, int arg2) {
        ++field1553;
        if (arg1 != -82) {
            return true;
        } else {
            return (arg2 & 65536) != 0;
        }
    }
}
