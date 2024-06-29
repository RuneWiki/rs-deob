import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!d")
public class class28 extends class66 {

    @OriginalMember(owner = "client!d", name = "Mb", descriptor = "[I")
    public static int[] field552 = new int[100];

    @OriginalMember(owner = "client!d", name = "Lb", descriptor = "I")
    public static int field551 = 1;

    @OriginalMember(owner = "client!d", name = "ac", descriptor = "I")
    public static int field566 = 0;

    @OriginalMember(owner = "client!d", name = "Pb", descriptor = "Lea;")
    private static class38 field555 = class9.method46((byte) 112, "Unexpected loginserver response)3");

    @OriginalMember(owner = "client!d", name = "Tb", descriptor = "Lea;")
    public static class38 field559 = field555;

    @OriginalMember(owner = "client!d", name = "Vb", descriptor = "Lea;")
    public static class38 field561 = class9.method46((byte) 115, "Einloggen");

    @OriginalMember(owner = "client!d", name = "cc", descriptor = "Lea;")
    public static class38 field568 = class9.method46((byte) 113, "<col=ffff00>");

    @OriginalMember(owner = "client!d", name = "Nb", descriptor = "I")
    public static int field553;

    @OriginalMember(owner = "client!d", name = "Qb", descriptor = "I")
    public static int field556;

    @OriginalMember(owner = "client!d", name = "Rb", descriptor = "I")
    public static int field557;

    @OriginalMember(owner = "client!d", name = "Sb", descriptor = "I")
    public static int field558;

    @OriginalMember(owner = "client!d", name = "Ub", descriptor = "I")
    public static int field560;

    @OriginalMember(owner = "client!d", name = "Wb", descriptor = "I")
    public static int field562;

    @OriginalMember(owner = "client!d", name = "Xb", descriptor = "I")
    public static int field563;

    @OriginalMember(owner = "client!d", name = "Yb", descriptor = "I")
    public static int field564;

    @OriginalMember(owner = "client!d", name = "Zb", descriptor = "I")
    public static int field565;

    @OriginalMember(owner = "client!d", name = "bc", descriptor = "I")
    private int field567;

    @OriginalMember(owner = "client!d", name = "ec", descriptor = "I")
    public static int field570;

    @OriginalMember(owner = "client!d", name = "dc", descriptor = "Lba;")
    private class11 field569;

    @OriginalMember(owner = "client!d", name = "Kb", descriptor = "Lob;")
    public static class127 field550;

    @OriginalMember(owner = "client!d", name = "Ob", descriptor = "Lfd;")
    public static class50 field554;

    @OriginalMember(owner = "client!d", name = "u", descriptor = "(I)I")
    public final int method166(int arg0) {
        if (arg0 != 7) {
            field561 = null;
        }
        ++field553;
        return super.field1627[super.field1620++] - this.field569.method57(true) & 255;
    }

    @OriginalMember(owner = "client!d", name = "b", descriptor = "(IIII)V")
    public static final void method167(int arg0, int arg1, int arg2, int arg3) {
        ++field570;
        class43 var4 = class193.method1283(arg1, (byte) -34, arg0);
        if (var4 != null && var4.field997 != null) {
            class48 var5 = new class48();
            var5.field1153 = var4;
            var5.field1166 = var4.field997;
            class113.method894(var5, (byte) 124);
        }
        class140.field2917 = arg2;
        class57.field1433 = arg0;
        class23.field489 = true;
        class86.field2002 = arg1;
        class172.method1209(var4, -1);
        if (arg3 != 18193) {
            field568 = null;
        }
    }

    @OriginalMember(owner = "client!d", name = "f", descriptor = "(Z)V")
    public final void method168(boolean arg0) {
        ++field560;
        super.field1620 = (this.field567 + 7) / 8;
        if (!arg0) {
            field554 = null;
        }
    }

    @OriginalMember(owner = "client!d", name = "j", descriptor = "(II)V")
    public final void method169(int arg0, int arg1) {
        if (arg0 != -1494101117) {
            this.method170(false, (int[]) null);
        }
        super.field1627[super.field1620++] = (byte) (arg1 + this.field569.method57(true));
        ++field562;
    }

    @OriginalMember(owner = "client!d", name = "a", descriptor = "(Z[I)V")
    public final void method170(boolean arg0, int[] arg1) {
        ++field563;
        if (!arg0) {
            this.field569 = new class11(arg1);
        }
    }

    @OriginalMember(owner = "client!d", name = "k", descriptor = "(II)I")
    public final int method171(int arg0, int arg1) {
        ++field557;
        return arg1 != -1337 ? 75 : arg0 * 8 - this.field567;
    }

    @OriginalMember(owner = "client!d", name = "<init>", descriptor = "(I)V")
    public class28(int arg0) {
        super(arg0);
    }

    @OriginalMember(owner = "client!d", name = "a", descriptor = "(ILee;Z)V")
    public static final void method172(int arg0, class42 arg1, boolean arg2) {
        ++field565;
        if (arg0 != -1494101117) {
            field568 = null;
        }
        int var3 = arg1.field921;
        int var4 = (int) arg1.field2172;
        arg1.method805(false);
        if (arg2) {
            class151.method1060(var3, false);
        }
        class138.method992(var3, 82);
        class43 var5 = class98.method813(var4, arg0 + 1494105213);
        if (var5 != null) {
            class172.method1209(var5, arg0 + 1494101116);
        }
        class169.field3482 = false;
        class94.field2121 = 0;
        class45.method326(class151.field3125, class143.field2981, class127.field2727, class36.field765, arg0 ^ -1508977789);
        if (class86.field1998 != -1) {
            class65.method460(class86.field1998, 1, -127);
        }
    }

    @OriginalMember(owner = "client!d", name = "g", descriptor = "(Z)V")
    public final void method173(boolean arg0) {
        this.field567 = super.field1620 * 8;
        ++field556;
        if (arg0) {
            this.method170(true, (int[]) null);
        }
    }

    @OriginalMember(owner = "client!d", name = "l", descriptor = "(II)Lea;")
    public static final class38 method174(int arg0, int arg1) {
        if (arg1 != 3) {
            method172(116, (class42) null, false);
        }
        ++field564;
        class38 var2 = class151.method1059(arg0, (byte) -114);
        for (int var3 = var2.method276((byte) 38) + -3; var3 > 0; var3 -= 3) {
            var2 = class163.method1168(-29, new class38[] { var2.method273(0, 0, var3), class31.field618, var2.method262(var3, -1) });
        }
        if (var2.method276((byte) 38) > 9) {
            return class163.method1168(119, new class38[] { class175.field3546, var2.method273(0, 0, var2.method276((byte) 38) + -8), class155.field3220, class151.field3118, var2, class6.field159 });
        } else {
            return ~var2.method276((byte) 38) < -7 ? class163.method1168(115, new class38[] { class195.field3843, var2.method273(0, 0, var2.method276((byte) 38) + -4), class68.field1710, class151.field3118, var2, class6.field159 }) : class163.method1168(-63, new class38[] { class50.field1231, var2, class139.field2897 });
        }
    }

    @OriginalMember(owner = "client!d", name = "v", descriptor = "(I)V")
    public static void method175(int arg0) {
        field550 = null;
        if (arg0 > -126) {
            field554 = null;
        }
        field561 = null;
        field555 = null;
        field552 = null;
        field554 = null;
        field559 = null;
        field568 = null;
    }

    @OriginalMember(owner = "client!d", name = "m", descriptor = "(II)I")
    public final int method176(int arg0, int arg1) {
        ++field558;
        if (arg1 < 10) {
            field555 = null;
        }
        int var3 = this.field567 >> 3;
        int var4 = 0;
        int var5 = -(this.field567 & 7) + 8;
        this.field567 += arg0;
        while (~arg0 < ~var5) {
            var4 += (super.field1627[var3++] & class118.field2568[var5]) << -var5 + arg0;
            arg0 -= var5;
            var5 = 8;
        }
        int var6;
        if (arg0 != var5) {
            var6 = (super.field1627[var3] >> var5 - arg0 & class118.field2568[arg0]) + var4;
        } else {
            var6 = (super.field1627[var3] & class118.field2568[var5]) + var4;
        }
        return var6;
    }
}
