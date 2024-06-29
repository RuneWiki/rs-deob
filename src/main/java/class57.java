import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ea")
public class class57 extends class250 {

    @OriginalMember(owner = "client!ea", name = "Ib", descriptor = "Ljava/lang/String;")
    public static String field575 = "K";

    @OriginalMember(owner = "client!ea", name = "Tb", descriptor = "Ljava/lang/String;")
    public static String field586 = "rating: ";

    @OriginalMember(owner = "client!ea", name = "Eb", descriptor = "I")
    public static int field571;

    @OriginalMember(owner = "client!ea", name = "Fb", descriptor = "I")
    public static int field572;

    @OriginalMember(owner = "client!ea", name = "Gb", descriptor = "I")
    public static int field573;

    @OriginalMember(owner = "client!ea", name = "Hb", descriptor = "I")
    public static int field574;

    @OriginalMember(owner = "client!ea", name = "Jb", descriptor = "I")
    public static int field576;

    @OriginalMember(owner = "client!ea", name = "Kb", descriptor = "I")
    public static int field577;

    @OriginalMember(owner = "client!ea", name = "Lb", descriptor = "I")
    public static int field578;

    @OriginalMember(owner = "client!ea", name = "Mb", descriptor = "I")
    public static int field579;

    @OriginalMember(owner = "client!ea", name = "Nb", descriptor = "I")
    public static int field580;

    @OriginalMember(owner = "client!ea", name = "Ob", descriptor = "I")
    public static int field581;

    @OriginalMember(owner = "client!ea", name = "Pb", descriptor = "I")
    public static int field582;

    @OriginalMember(owner = "client!ea", name = "Qb", descriptor = "I")
    private int field583;

    @OriginalMember(owner = "client!ea", name = "Sb", descriptor = "I")
    public static int field585;

    @OriginalMember(owner = "client!ea", name = "Rb", descriptor = "Lco;")
    private class192 field584;

    @OriginalMember(owner = "client!ea", name = "a", descriptor = "([IB)V")
    public final void method294(int[] arg0, byte arg1) {
        this.field584 = new class192(arg0);
        if (arg1 != 100) {
            method301(68, (byte) 70);
        }
        ++field579;
    }

    @OriginalMember(owner = "client!ea", name = "n", descriptor = "(II)V")
    public final void method295(int arg0, int arg1) {
        super.field3406[super.field3389++] = (byte) (arg1 + this.field584.method1031(-31));
        if (arg0 != 20579) {
            this.method304(57, 109);
        }
        ++field585;
    }

    @OriginalMember(owner = "client!ea", name = "z", descriptor = "(I)I")
    public final int method296(int arg0) {
        if (arg0 != -23095) {
            return 1;
        } else {
            ++field578;
            return 255 & super.field3406[super.field3389++] - this.field584.method1031(arg0 + 22985);
        }
    }

    @OriginalMember(owner = "client!ea", name = "b", descriptor = "(Z)V")
    public final void method297(boolean arg0) {
        this.field583 = super.field3389 * 8;
        if (!arg0) {
            ++field574;
        }
    }

    @OriginalMember(owner = "client!ea", name = "a", descriptor = "(ZIIZI)V")
    public static final void method298(boolean arg0, int arg1, int arg2, boolean arg3, int arg4) {
        ++field573;
        class21.method113(arg4, arg0, class5.field41.length + arg2, 0, arg3, (byte) -6, arg1);
        class212.field2877 = null;
        class393.field5657 = 0;
    }

    @OriginalMember(owner = "client!ea", name = "j", descriptor = "(B)V")
    public final void method299(byte arg0) {
        super.field3389 = (this.field583 + 7) / 8;
        if (arg0 != 76) {
            method301(-42, (byte) -18);
        }
        ++field580;
    }

    @OriginalMember(owner = "client!ea", name = "A", descriptor = "(I)V")
    public static final void method300(int arg0) {
        class235.field3242.method1568(((float) class168.field2125 * 0.1F + 0.7F) * 1.1523438F);
        ++field577;
        class235.field3242.method1587(class109.field1339, 0.69921875F, 1.2F, -50.0F, (float) arg0, -50.0F);
        class235.field3242.method1603(class305.field4141, -1);
        class235.field3242.method1561(class75.field826);
    }

    @OriginalMember(owner = "client!ea", name = "<init>", descriptor = "(I)V")
    public class57(int arg0) {
        super(arg0);
    }

    @OriginalMember(owner = "client!ea", name = "f", descriptor = "(IB)Lfd;")
    public static final class194 method301(int arg0, byte arg1) {
        ++field576;
        int var2 = arg0 >> 16;
        int var3 = arg0 & 65535;
        if (class235.field3227[var2] == null || class235.field3227[var2][var3] == null) {
            boolean var4 = class262.method1460((byte) -128, var2);
            if (!var4) {
                return null;
            }
        }
        if (arg1 < 59) {
            field575 = null;
        }
        return class235.field3227[var2][var3];
    }

    @OriginalMember(owner = "client!ea", name = "b", descriptor = "([BBII)V")
    public final void method302(byte[] arg0, byte arg1, int arg2, int arg3) {
        if (arg1 >= 79) {
            for (int var5 = 0; arg3 > var5; ++var5) {
                arg0[arg2 + var5] = (byte) (super.field3406[super.field3389++] + -this.field584.method1031(-107));
            }
            ++field571;
        }
    }

    @OriginalMember(owner = "client!ea", name = "k", descriptor = "(B)V")
    public static final void method303(byte arg0) {
        int var1 = 115 / ((-58 - arg0) / 33);
        ++field572;
        class155.method835((byte) -51);
        class41.field434 = null;
        class21.field197 = null;
        class235.field3242 = null;
        class366.field5125 = null;
        class75.field826 = null;
    }

    @OriginalMember(owner = "client!ea", name = "o", descriptor = "(II)I")
    public final int method304(int arg0, int arg1) {
        ++field582;
        return arg0 > -100 ? 122 : arg1 * 8 + -this.field583;
    }

    @OriginalMember(owner = "client!ea", name = "p", descriptor = "(II)I")
    public final int method305(int arg0, int arg1) {
        ++field581;
        int var3 = this.field583 >> 3;
        if (arg1 != -7985) {
            this.method294((int[]) null, (byte) -3);
        }
        int var4 = -(7 & this.field583) + 8;
        this.field583 += arg0;
        int var5 = 0;
        while (~arg0 < ~var4) {
            var5 += (super.field3406[var3++] & class128.field1656[var4]) << -var4 + arg0;
            arg0 -= var4;
            var4 = 8;
        }
        int var6;
        if (arg0 != var4) {
            var6 = (super.field3406[var3] >> -arg0 + var4 & class128.field1656[arg0]) + var5;
        } else {
            var6 = (class128.field1656[var4] & super.field3406[var3]) + var5;
        }
        return var6;
    }

    @OriginalMember(owner = "client!ea", name = "l", descriptor = "(B)V")
    public static void method306(byte arg0) {
        if (arg0 > -105) {
            field586 = null;
        }
        field575 = null;
        field586 = null;
    }
}
