import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!pf")
public class class155 extends class121 {

    @OriginalMember(owner = "client!pf", name = "Pb", descriptor = "Lrd;")
    public static class173 field2926 = class133.method843("k", 12);

    @OriginalMember(owner = "client!pf", name = "Ob", descriptor = "I")
    public static int field2925 = 0;

    @OriginalMember(owner = "client!pf", name = "Kb", descriptor = "Lrd;")
    public static class173 field2921 = class133.method843(":clanreq:", 40);

    @OriginalMember(owner = "client!pf", name = "Sb", descriptor = "Lrd;")
    public static class173 field2929 = class133.method843("huffman", 121);

    @OriginalMember(owner = "client!pf", name = "Jb", descriptor = "I")
    public static int field2920;

    @OriginalMember(owner = "client!pf", name = "Lb", descriptor = "I")
    private int field2922;

    @OriginalMember(owner = "client!pf", name = "Mb", descriptor = "I")
    public static int field2923;

    @OriginalMember(owner = "client!pf", name = "Nb", descriptor = "I")
    public static int field2924;

    @OriginalMember(owner = "client!pf", name = "Qb", descriptor = "I")
    public static int field2927;

    @OriginalMember(owner = "client!pf", name = "Rb", descriptor = "I")
    public static int field2928;

    @OriginalMember(owner = "client!pf", name = "Tb", descriptor = "I")
    public static int field2930;

    @OriginalMember(owner = "client!pf", name = "Ub", descriptor = "I")
    public static int field2931;

    @OriginalMember(owner = "client!pf", name = "Vb", descriptor = "I")
    public static int field2932;

    @OriginalMember(owner = "client!pf", name = "Wb", descriptor = "I")
    public static int field2933;

    @OriginalMember(owner = "client!pf", name = "W", descriptor = "Lea;")
    private class42 field2919;

    @OriginalMember(owner = "client!pf", name = "<init>", descriptor = "(I)V")
    public class155(int arg0) {
        super(arg0);
    }

    @OriginalMember(owner = "client!pf", name = "e", descriptor = "(Z)Lsa;")
    public static final class180 method1020(boolean arg0) {
        ++field2920;
        if (!arg0) {
            method1020(false);
        }
        class180 var1 = new class180();
        var1.field3542 = class197.field3845;
        var1.field3548 = class166.field3189;
        var1.field3543 = class30.field622[0];
        var1.field3545 = class55.field1099[0];
        var1.field3544 = class20.field458[0];
        var1.field3547 = class97.field1775[0];
        int var2 = var1.field3547 * var1.field3543;
        var1.field3546 = new int[var2];
        byte[] var3 = class188.field3676[0];
        for (int var4 = 0; var2 > var4; ++var4) {
            var1.field3546[var4] = class112.field2074[class209.method1383(255, var3[var4])];
        }
        class184.method1246((byte) 31);
        return var1;
    }

    @OriginalMember(owner = "client!pf", name = "a", descriptor = "([IB)V")
    public final void method1021(int[] arg0, byte arg1) {
        ++field2932;
        if (arg1 == -2) {
            this.field2919 = new class42(arg0);
        }
    }

    @OriginalMember(owner = "client!pf", name = "f", descriptor = "(II)I")
    public final int method1022(int arg0, int arg1) {
        if (arg1 != 0) {
            return 28;
        } else {
            ++field2928;
            return arg0 * 8 + -this.field2922;
        }
    }

    @OriginalMember(owner = "client!pf", name = "g", descriptor = "(II)V")
    public final void method1023(int arg0, int arg1) {
        ++field2923;
        super.field2218[super.field2222++] = (byte) (this.field2919.method304(-128) + arg0);
        if (arg1 != -21822) {
            field2926 = null;
        }
    }

    @OriginalMember(owner = "client!pf", name = "k", descriptor = "(B)I")
    public final int method1024(byte arg0) {
        ++field2933;
        if (arg0 <= 38) {
            method1030(-45, -119, -85);
        }
        return super.field2218[super.field2222++] - this.field2919.method304(-119) & 255;
    }

    @OriginalMember(owner = "client!pf", name = "s", descriptor = "(I)V")
    public final void method1025(int arg0) {
        ++field2931;
        if (arg0 <= -109) {
            super.field2222 = (this.field2922 + 7) / 8;
        }
    }

    @OriginalMember(owner = "client!pf", name = "c", descriptor = "(IZ)Lrd;")
    public static final class173 method1026(int arg0, boolean arg1) {
        ++field2927;
        if (arg0 < 100000) {
            return class173.method1158(-3, new class173[] { class172.field3322, class93.method588(arg0, true), class30.field618 });
        } else if (arg1) {
            return null;
        } else {
            return ~arg0 > -10000001 ? class173.method1158(-3, new class173[] { class34.field750, class93.method588(arg0 / 1000, !arg1), class169.field3256, class30.field618 }) : class173.method1158(-3, new class173[] { class91.field1726, class93.method588(arg0 / 1000000, true), class183.field3592, class30.field618 });
        }
    }

    @OriginalMember(owner = "client!pf", name = "t", descriptor = "(I)V")
    public final void method1027(int arg0) {
        this.field2922 = super.field2222 * arg0;
        ++field2924;
    }

    @OriginalMember(owner = "client!pf", name = "u", descriptor = "(I)V")
    public static void method1028(int arg0) {
        field2926 = null;
        int var1 = -65 % ((-7 - arg0) / 55);
        field2929 = null;
        field2921 = null;
    }

    @OriginalMember(owner = "client!pf", name = "h", descriptor = "(II)I")
    public final int method1029(int arg0, int arg1) {
        ++field2930;
        int var3 = this.field2922 >> 3;
        int var4 = -(this.field2922 & 7) + 8;
        this.field2922 += arg0;
        int var5 = arg1;
        while (arg0 > var4) {
            var5 += (super.field2218[var3++] & class23.field509[var4]) << -var4 + arg0;
            arg0 -= var4;
            var4 = 8;
        }
        int var6;
        if (arg0 != var4) {
            var6 = (super.field2218[var3] >> var4 - arg0 & class23.field509[arg0]) + var5;
        } else {
            var6 = (super.field2218[var3] & class23.field509[var4]) + var5;
        }
        return var6;
    }

    @OriginalMember(owner = "client!pf", name = "a", descriptor = "(III)Lad;")
    public static final class5 method1030(int arg0, int arg1, int arg2) {
        class105 var3 = class208.field4055[arg0][arg1][arg2];
        if (var3 == null) {
            return null;
        } else {
            for (int var4 = 0; var4 < var3.field1972; ++var4) {
                class5 var5 = var3.field1948[var4];
                if ((var5.field123 >> 29 & 3L) == 2L && var5.field120 == arg1 && var5.field125 == arg2) {
                    return var5;
                }
            }
            return null;
        }
    }
}
