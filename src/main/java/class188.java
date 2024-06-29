import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!rh")
public class class188 extends class66 {

    @OriginalMember(owner = "client!rh", name = "Jb", descriptor = "Ldj;")
    public static class44 field3240 = class89.method650(255, "sl_arrows");

    @OriginalMember(owner = "client!rh", name = "Ob", descriptor = "Ldj;")
    private static class44 field3245 = class89.method650(255, "Loading config )2 ");

    @OriginalMember(owner = "client!rh", name = "Mb", descriptor = "Ldj;")
    public static class44 field3243 = field3245;

    @OriginalMember(owner = "client!rh", name = "Sb", descriptor = "I")
    public static int field3249 = 7759444;

    @OriginalMember(owner = "client!rh", name = "Pb", descriptor = "Lih;")
    public static class95 field3246 = new class95(4);

    @OriginalMember(owner = "client!rh", name = "Yb", descriptor = "I")
    public static int field3255 = 0;

    @OriginalMember(owner = "client!rh", name = "Hb", descriptor = "I")
    public static int field3238;

    @OriginalMember(owner = "client!rh", name = "Ib", descriptor = "I")
    public static int field3239;

    @OriginalMember(owner = "client!rh", name = "Kb", descriptor = "I")
    private int field3241;

    @OriginalMember(owner = "client!rh", name = "Lb", descriptor = "I")
    public static int field3242;

    @OriginalMember(owner = "client!rh", name = "Nb", descriptor = "I")
    public static int field3244;

    @OriginalMember(owner = "client!rh", name = "Qb", descriptor = "I")
    public static int field3247;

    @OriginalMember(owner = "client!rh", name = "Rb", descriptor = "I")
    public static int field3248;

    @OriginalMember(owner = "client!rh", name = "Tb", descriptor = "I")
    public static int field3250;

    @OriginalMember(owner = "client!rh", name = "Ub", descriptor = "I")
    public static int field3251;

    @OriginalMember(owner = "client!rh", name = "Vb", descriptor = "I")
    public static int field3252;

    @OriginalMember(owner = "client!rh", name = "Wb", descriptor = "I")
    public static int field3253;

    @OriginalMember(owner = "client!rh", name = "Xb", descriptor = "I")
    public static int field3254;

    @OriginalMember(owner = "client!rh", name = "Gb", descriptor = "Lta;")
    private class201 field3237;

    @OriginalMember(owner = "client!rh", name = "p", descriptor = "(I)I")
    public final int method1164(int arg0) {
        ++field3254;
        return arg0 != 20 ? -62 : super.field1219[super.field1195++] - this.field3237.method1299(-27588) & 255;
    }

    @OriginalMember(owner = "client!rh", name = "a", descriptor = "([BBII)V")
    public final void method1165(byte[] arg0, byte arg1, int arg2, int arg3) {
        for (int var5 = 0; ~arg2 < ~var5; ++var5) {
            arg0[arg3 + var5] = (byte) (super.field1219[super.field1195++] + -this.field3237.method1299(-27588));
        }
        ++field3247;
        if (arg1 <= 24) {
            field3249 = -64;
        }
    }

    @OriginalMember(owner = "client!rh", name = "n", descriptor = "(B)V")
    public final void method1166(byte arg0) {
        ++field3244;
        super.field1195 = (this.field3241 + 7) / 8;
        if (arg0 != 9) {
            field3240 = null;
        }
    }

    @OriginalMember(owner = "client!rh", name = "a", descriptor = "(III)I")
    public static final int method1167(int arg0, int arg1, int arg2) {
        ++field3250;
        if (~arg1 > ~arg0) {
            int var3 = arg1;
            arg1 = arg0;
            arg0 = var3;
        }
        if (arg2 != 41) {
            field3246 = null;
        }
        while (arg0 != 0) {
            int var4 = arg1 % arg0;
            arg1 = arg0;
            arg0 = var4;
        }
        return arg1;
    }

    @OriginalMember(owner = "client!rh", name = "a", descriptor = "(ILdj;I)V")
    public static final void method1168(int arg0, class44 arg1, int arg2) {
        ++field3238;
        if (arg2 < 93) {
            method1167(107, 80, -41);
        }
        class44 var3 = arg1.method317((byte) 114).method320(false);
        boolean var4 = false;
        for (int var5 = 0; ~var5 > ~class90.field1702; ++var5) {
            class24 var6 = class122.field2168[class45.field858[var5]];
            if (var6 != null && var6.field395 != null && var6.field395.method330(var3, true)) {
                class129.method884(0, class96.field1774.field2240[0], 2, 0, -129, class96.field1774.field2235[0], false, var6.field2235[0], var6.field2240[0], 0, 1, 1);
                var4 = true;
                if (~arg0 != -2) {
                    if (~arg0 == -5) {
                        ++class87.field1662;
                        class200.field3542.method1170(66, (byte) -116);
                        class200.field3542.method524(class45.field858[var5], -94667736);
                    } else if (~arg0 != -7) {
                        if (~arg0 == -8) {
                            ++client.field602;
                            class200.field3542.method1170(20, (byte) -120);
                            class200.field3542.method526(class45.field858[var5], 74);
                        }
                    } else {
                        ++class194.field3412;
                        class200.field3542.method1170(253, (byte) -93);
                        class200.field3542.method526(class45.field858[var5], -107);
                    }
                } else {
                    class200.field3542.method1170(172, (byte) -86);
                    ++class187.field3224;
                    class200.field3542.method493(class45.field858[var5], 53);
                }
                break;
            }
        }
        if (!var4) {
            class226.method1484(class70.method555(new class44[] { class218.field3950, var3 }, -3), 0, 0, class94.field1752);
        }
    }

    @OriginalMember(owner = "client!rh", name = "a", descriptor = "(ZI)I")
    public final int method1169(boolean arg0, int arg1) {
        if (!arg0) {
            field3246 = null;
        }
        ++field3252;
        return arg1 * 8 + -this.field3241;
    }

    @OriginalMember(owner = "client!rh", name = "c", descriptor = "(IB)V")
    public final void method1170(int arg0, byte arg1) {
        ++field3253;
        if (arg1 > -70) {
            this.method1173(85, -70);
        }
        super.field1219[super.field1195++] = (byte) (arg0 + this.field3237.method1299(-27588));
    }

    @OriginalMember(owner = "client!rh", name = "q", descriptor = "(I)V")
    public final void method1171(int arg0) {
        ++field3251;
        this.field3241 = super.field1195 * arg0;
    }

    @OriginalMember(owner = "client!rh", name = "a", descriptor = "([IB)V")
    public final void method1172(int[] arg0, byte arg1) {
        ++field3239;
        if (arg1 != -97) {
            this.method1170(-118, (byte) 87);
        }
        this.field3237 = new class201(arg0);
    }

    @OriginalMember(owner = "client!rh", name = "n", descriptor = "(II)I")
    public final int method1173(int arg0, int arg1) {
        ++field3242;
        if (arg0 <= 126) {
            return -19;
        } else {
            int var3 = -(this.field3241 & 7) + 8;
            int var4 = 0;
            int var5 = this.field3241 >> 3;
            this.field3241 += arg1;
            while (~var3 > ~arg1) {
                var4 += (class132.field2360[var3] & super.field1219[var5++]) << -var3 + arg1;
                arg1 -= var3;
                var3 = 8;
            }
            int var6;
            if (arg1 != var3) {
                var6 = (super.field1219[var5] >> var3 - arg1 & class132.field2360[arg1]) + var4;
            } else {
                var6 = (class132.field2360[var3] & super.field1219[var5]) + var4;
            }
            return var6;
        }
    }

    @OriginalMember(owner = "client!rh", name = "<init>", descriptor = "(I)V")
    public class188(int arg0) {
        super(arg0);
    }

    @OriginalMember(owner = "client!rh", name = "o", descriptor = "(B)V")
    public static void method1174(byte arg0) {
        field3243 = null;
        field3240 = null;
        if (arg0 > -116) {
            method1174((byte) -100);
        }
        field3246 = null;
        field3245 = null;
    }
}
