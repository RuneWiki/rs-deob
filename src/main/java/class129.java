import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!wh")
public class class129 {

    @OriginalMember(owner = "client!wh", name = "c", descriptor = "Z")
    private boolean field1594 = false;

    @OriginalMember(owner = "client!wh", name = "d", descriptor = "I")
    public int field1595 = 43594;

    @OriginalMember(owner = "client!wh", name = "k", descriptor = "Z")
    private boolean field1602 = false;

    @OriginalMember(owner = "client!wh", name = "j", descriptor = "I")
    public int field1601 = 443;

    @OriginalMember(owner = "client!wh", name = "b", descriptor = "Lcc;")
    public static class633 field1593 = new class633(14, 1);

    @OriginalMember(owner = "client!wh", name = "i", descriptor = "Lcc;")
    public static class633 field1600 = new class633(15, 4);

    @OriginalMember(owner = "client!wh", name = "m", descriptor = "Lcc;")
    public static class633 field1604 = new class633(16, -2);

    @OriginalMember(owner = "client!wh", name = "n", descriptor = "Lcc;")
    public static class633 field1605 = new class633(17, 0);

    @OriginalMember(owner = "client!wh", name = "o", descriptor = "Lcc;")
    public static class633 field1606 = new class633(18, -2);

    @OriginalMember(owner = "client!wh", name = "p", descriptor = "Lcc;")
    public static class633 field1607 = new class633(19, -2);

    @OriginalMember(owner = "client!wh", name = "q", descriptor = "Lcc;")
    public static class633 field1608 = new class633(20, 6);

    @OriginalMember(owner = "client!wh", name = "r", descriptor = "Lcc;")
    public static class633 field1609 = new class633(21, 9);

    @OriginalMember(owner = "client!wh", name = "s", descriptor = "Lcc;")
    public static class633 field1610 = new class633(22, -2);

    @OriginalMember(owner = "client!wh", name = "t", descriptor = "Lcc;")
    public static class633 field1611 = new class633(23, 4);

    @OriginalMember(owner = "client!wh", name = "u", descriptor = "Lcc;")
    public static class633 field1612 = new class633(24, -1);

    @OriginalMember(owner = "client!wh", name = "v", descriptor = "Lcc;")
    public static class633 field1613 = new class633(25, -2);

    @OriginalMember(owner = "client!wh", name = "w", descriptor = "Lcc;")
    public static class633 field1614 = new class633(26, 0);

    @OriginalMember(owner = "client!wh", name = "x", descriptor = "Lcc;")
    public static class633 field1615 = new class633(27, 0);

    @OriginalMember(owner = "client!wh", name = "y", descriptor = "[Lcc;")
    private static class633[] field1616 = new class633[32];

    @OriginalMember(owner = "client!wh", name = "z", descriptor = "[I")
    public static int[] field1617;

    @OriginalMember(owner = "client!wh", name = "a", descriptor = "I")
    public static int field1592;

    @OriginalMember(owner = "client!wh", name = "e", descriptor = "I")
    public static int field1596;

    @OriginalMember(owner = "client!wh", name = "f", descriptor = "I")
    public static int field1597;

    @OriginalMember(owner = "client!wh", name = "h", descriptor = "I")
    public static int field1599;

    @OriginalMember(owner = "client!wh", name = "l", descriptor = "I")
    public int field1603;

    @OriginalMember(owner = "client!wh", name = "g", descriptor = "Ljava/lang/String;")
    public String field1598;

    @OriginalMember(owner = "client!wh", name = "a", descriptor = "(IZI)V")
    public static final void method794(int arg0, boolean arg1, int arg2) {
        field1592++;
        if (arg0 != -12648) {
            field1611 = null;
        }
        class594 var3 = class581.method3372(arg1, arg2, -57);
        if (var3 != null) {
            var3.method2108(true);
        }
    }

    @OriginalMember(owner = "client!wh", name = "a", descriptor = "(I)V")
    public static void method795(int arg0) {
        field1615 = null;
        field1605 = null;
        field1614 = null;
        field1606 = null;
        field1616 = null;
        field1611 = null;
        field1610 = null;
        field1609 = null;
        field1608 = null;
        field1607 = null;
        field1604 = null;
        if (arg0 != 0) {
            return;
        }
        field1617 = null;
        field1612 = null;
        field1593 = null;
        field1613 = null;
        field1600 = null;
    }

    @OriginalMember(owner = "client!wh", name = "a", descriptor = "(Lwh;I)Z")
    public final boolean method796(class129 arg0, int arg1) {
        field1596++;
        int var3 = -61 / ((arg1 - 32) / 50);
        if (arg0 == null) {
            return false;
        } else {
            return this.field1603 == arg0.field1603 && this.field1598.equals(arg0.field1598);
        }
    }

    @OriginalMember(owner = "client!wh", name = "a", descriptor = "(B)V")
    public final void method797(byte arg0) {
        if (!this.field1594) {
            this.field1602 = true;
            this.field1594 = true;
        } else if (this.field1602) {
            this.field1602 = false;
        } else {
            this.field1594 = false;
        }
        if (arg0 != -78) {
            method795(84);
        }
        field1597++;
    }

    @OriginalMember(owner = "client!wh", name = "a", descriptor = "(ILtq;)Loc;")
    public final class175 method798(int arg0, class545 arg1) {
        field1599++;
        return arg0 == 32 ? arg1.method3171(this.field1594 ? this.field1601 : this.field1595, this.field1602, -127, this.field1598) : null;
    }

    static {
        class633[] var0 = class442.method2746(3);
        for (int var1 = 0; var1 < var0.length; var1++) {
            field1616[var0[var1].field9114] = var0[var1];
        }
        field1617 = new int[2];
    }
}
