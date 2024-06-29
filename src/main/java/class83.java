import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!cc")
public class class83 extends class249 {

    @OriginalMember(owner = "client!cc", name = "Ob", descriptor = "Lr;")
    public static class66 field1610 = class93.method641(43, "<col=ffff00>");

    @OriginalMember(owner = "client!cc", name = "Kb", descriptor = "[Lne;")
    public static class118[] field1606 = new class118[4];

    @OriginalMember(owner = "client!cc", name = "Db", descriptor = "[I")
    public static int[] field1599 = new int[2048];

    @OriginalMember(owner = "client!cc", name = "Nb", descriptor = "Lr;")
    public static class66 field1609 = class93.method641(43, "Ladevorgang )2 bitte warten Sie)3");

    @OriginalMember(owner = "client!cc", name = "Ub", descriptor = "Z")
    public static boolean field1616 = false;

    @OriginalMember(owner = "client!cc", name = "Zb", descriptor = "[I")
    public static int[] field1621 = new int[] { 76, 8, 137, 4, 0, 1, 38, 2, 19 };

    @OriginalMember(owner = "client!cc", name = "Lb", descriptor = "Lqc;")
    public static class245 field1607 = new class245(64);

    @OriginalMember(owner = "client!cc", name = "bc", descriptor = "Lr;")
    public static class66 field1623 = class93.method641(43, "sl_arrows");

    @OriginalMember(owner = "client!cc", name = "Eb", descriptor = "I")
    public static int field1600;

    @OriginalMember(owner = "client!cc", name = "Fb", descriptor = "I")
    public static int field1601;

    @OriginalMember(owner = "client!cc", name = "Gb", descriptor = "I")
    public static int field1602;

    @OriginalMember(owner = "client!cc", name = "Hb", descriptor = "I")
    public static int field1603;

    @OriginalMember(owner = "client!cc", name = "Ib", descriptor = "I")
    public static int field1604;

    @OriginalMember(owner = "client!cc", name = "Mb", descriptor = "I")
    public static int field1608;

    @OriginalMember(owner = "client!cc", name = "Pb", descriptor = "I")
    public static int field1611;

    @OriginalMember(owner = "client!cc", name = "Qb", descriptor = "I")
    public static int field1612;

    @OriginalMember(owner = "client!cc", name = "Rb", descriptor = "I")
    public static int field1613;

    @OriginalMember(owner = "client!cc", name = "Sb", descriptor = "I")
    public static int field1614;

    @OriginalMember(owner = "client!cc", name = "Tb", descriptor = "I")
    private int field1615;

    @OriginalMember(owner = "client!cc", name = "Vb", descriptor = "I")
    public static int field1617;

    @OriginalMember(owner = "client!cc", name = "Wb", descriptor = "I")
    public static int field1618;

    @OriginalMember(owner = "client!cc", name = "Xb", descriptor = "I")
    public static int field1619;

    @OriginalMember(owner = "client!cc", name = "Yb", descriptor = "I")
    public static int field1620;

    @OriginalMember(owner = "client!cc", name = "ac", descriptor = "Lsg;")
    public static class247 field1622;

    @OriginalMember(owner = "client!cc", name = "Jb", descriptor = "Lng;")
    private class64 field1605;

    @OriginalMember(owner = "client!cc", name = "a", descriptor = "([II)V")
    public final void method569(int[] arg0, int arg1) {
        if (arg1 != 3426) {
            field1609 = null;
        }
        this.field1605 = new class64(arg0);
        ++field1614;
    }

    @OriginalMember(owner = "client!cc", name = "s", descriptor = "(I)V")
    public final void method570(int arg0) {
        int var2 = 2 % ((arg0 - 58) / 51);
        this.field1615 = super.field4335 * 8;
        ++field1601;
    }

    @OriginalMember(owner = "client!cc", name = "f", descriptor = "(B)V")
    public final void method571(byte arg0) {
        if (arg0 != -59) {
            field1599 = null;
        }
        super.field4335 = (this.field1615 + 7) / 8;
        ++field1613;
    }

    @OriginalMember(owner = "client!cc", name = "e", descriptor = "(BI)I")
    public final int method572(byte arg0, int arg1) {
        ++field1619;
        int var3 = this.field1615 >> 3;
        if (arg0 != 0) {
            field1616 = true;
        }
        int var4 = 8 - (this.field1615 & 7);
        this.field1615 += arg1;
        int var5 = 0;
        while (~var4 > ~arg1) {
            var5 += (super.field4350[var3++] & class170.field3027[var4]) << arg1 - var4;
            arg1 -= var4;
            var4 = 8;
        }
        int var6;
        if (~arg1 != ~var4) {
            var6 = (super.field4350[var3] >> var4 - arg1 & class170.field3027[arg1]) + var5;
        } else {
            var6 = (class170.field3027[var4] & super.field4350[var3]) + var5;
        }
        return var6;
    }

    @OriginalMember(owner = "client!cc", name = "m", descriptor = "(II)I")
    public static final int method573(int arg0, int arg1) {
        ++field1611;
        if (~arg0 == -16711936) {
            return -1;
        } else {
            return arg1 != -16844 ? -120 : class250.method1694(arg0, -82);
        }
    }

    @OriginalMember(owner = "client!cc", name = "<init>", descriptor = "(I)V")
    public class83(int arg0) {
        super(arg0);
    }

    @OriginalMember(owner = "client!cc", name = "a", descriptor = "(Lr;II)V")
    public static final void method574(class66 arg0, int arg1, int arg2) {
        ++field1603;
        ++class3.field37;
        class28.field412.method578(-51, 111);
        if (arg1 == -32443) {
            class28.field412.method1638(32, arg2);
            class28.field412.method1653(128, arg0.method479(10908));
        }
    }

    @OriginalMember(owner = "client!cc", name = "n", descriptor = "(II)I")
    public final int method575(int arg0, int arg1) {
        ++field1602;
        return arg1 > -71 ? 1 : arg0 * 8 - this.field1615;
    }

    @OriginalMember(owner = "client!cc", name = "t", descriptor = "(I)V")
    public static final void method576(int arg0) {
        class146.method1005(103);
        class226.method1441(-93);
        class180.method1197((byte) -103);
        class78.method554((byte) -88);
        class254.method1705((byte) -108);
        class97.method671((byte) -96);
        class85.method599(125);
        class95.method652(true);
        class208.method1352((byte) -115);
        ++field1617;
        class44.method319((byte) 78);
        class103.method717((byte) -59);
        class47.method336(-27434);
        class59.method391((byte) -88);
        class206.method1337(-10705);
        ((class62) class123.field2318).method406((byte) -95);
        class8.field80.method1502((byte) -11);
        class43.field758.method154(0);
        class183.field3209.method154(0);
        class176.field3106.method154(arg0 ^ arg0);
        class146.field2662.method154(arg0 ^ 137);
        class29.field427.method154(0);
        class28.field405.method154(0);
        class115.field2173.method154(0);
        class242.field4238.method154(0);
        class238.field4132.method154(0);
        class28.field418.method154(0);
        class50.field894.method154(0);
        class158.field2852.method1613((byte) 94);
    }

    @OriginalMember(owner = "client!cc", name = "u", descriptor = "(I)I")
    public final int method577(int arg0) {
        ++field1604;
        if (arg0 != 255) {
            this.method570(21);
        }
        return super.field4350[super.field4335++] + -this.field1605.method439((byte) -55) & 255;
    }

    @OriginalMember(owner = "client!cc", name = "o", descriptor = "(II)V")
    public final void method578(int arg0, int arg1) {
        ++field1608;
        super.field4350[super.field4335++] = (byte) (arg1 + this.field1605.method439((byte) -23));
        int var3 = -68 / ((arg0 - 1) / 52);
    }

    @OriginalMember(owner = "client!cc", name = "g", descriptor = "(Z)V")
    public static void method579(boolean arg0) {
        field1607 = null;
        field1610 = null;
        field1606 = null;
        if (arg0) {
            method579(true);
        }
        field1609 = null;
        field1623 = null;
        field1622 = null;
        field1621 = null;
        field1599 = null;
    }

    @OriginalMember(owner = "client!cc", name = "a", descriptor = "(III)Luf;")
    public static final class240 method580(int arg0, int arg1, int arg2) {
        ++field1612;
        for (class240 var3 = (class240) class241.field4183.method873((byte) 76); var3 != null; var3 = (class240) class241.field4183.method870((byte) -110)) {
            if (var3.field4165 && var3.method1578(67, arg1, arg0)) {
                return var3;
            }
        }
        if (arg2 != 111) {
            field1606 = null;
        }
        return null;
    }

    @OriginalMember(owner = "client!cc", name = "a", descriptor = "([BIIZ)V")
    public final void method581(byte[] arg0, int arg1, int arg2, boolean arg3) {
        for (int var5 = 0; var5 < arg1; ++var5) {
            arg0[arg2 + var5] = (byte) (super.field4350[super.field4335++] + -this.field1605.method439((byte) 64));
        }
        ++field1620;
        if (arg3) {
            field1622 = null;
        }
    }
}
