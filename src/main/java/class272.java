import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!nd")
public class class272 extends class135 {

    @OriginalMember(owner = "client!nd", name = "Ub", descriptor = "Lvf;")
    public static class265 field4837 = class87.method582(-46, "Fermer");

    @OriginalMember(owner = "client!nd", name = "Rb", descriptor = "Lvf;")
    public static class265 field4834 = class87.method582(-46, " zuerst von Ihrer Ignorieren)2Liste(Q");

    @OriginalMember(owner = "client!nd", name = "Pb", descriptor = "I")
    public static int field4832 = 0;

    @OriginalMember(owner = "client!nd", name = "Lb", descriptor = "Lvf;")
    public static class265 field4828 = class87.method582(-46, "S-Blectionner");

    @OriginalMember(owner = "client!nd", name = "Gb", descriptor = "I")
    public static int field4823;

    @OriginalMember(owner = "client!nd", name = "Hb", descriptor = "I")
    public static int field4824;

    @OriginalMember(owner = "client!nd", name = "Ib", descriptor = "I")
    public static int field4825;

    @OriginalMember(owner = "client!nd", name = "Kb", descriptor = "I")
    private int field4827;

    @OriginalMember(owner = "client!nd", name = "Mb", descriptor = "I")
    public static int field4829;

    @OriginalMember(owner = "client!nd", name = "Nb", descriptor = "I")
    public static int field4830;

    @OriginalMember(owner = "client!nd", name = "Ob", descriptor = "I")
    public static int field4831;

    @OriginalMember(owner = "client!nd", name = "Qb", descriptor = "I")
    public static int field4833;

    @OriginalMember(owner = "client!nd", name = "Sb", descriptor = "I")
    public static int field4835;

    @OriginalMember(owner = "client!nd", name = "Tb", descriptor = "I")
    public static int field4836;

    @OriginalMember(owner = "client!nd", name = "Vb", descriptor = "I")
    public static int field4838;

    @OriginalMember(owner = "client!nd", name = "Wb", descriptor = "I")
    public static int field4839;

    @OriginalMember(owner = "client!nd", name = "Jb", descriptor = "Lle;")
    private class208 field4826;

    @OriginalMember(owner = "client!nd", name = "a", descriptor = "(ILng;)Ljd;")
    public static final class118 method1856(int arg0, class135 arg1) {
        if (arg0 != -1) {
            field4828 = null;
        }
        ++field4838;
        return new class118(arg1.method894(-124), arg1.method894(arg0 + -115), arg1.method894(-103), arg1.method894(-113), arg1.method894(-105), arg1.method894(-101), arg1.method894(-120), arg1.method894(-103), arg1.method909(arg0 + -917770351), arg1.method920((byte) 65));
    }

    @OriginalMember(owner = "client!nd", name = "a", descriptor = "([BIIB)V")
    public final void method1857(byte[] arg0, int arg1, int arg2, byte arg3) {
        if (arg3 > 71) {
            for (int var5 = 0; var5 < arg1; ++var5) {
                arg0[arg2 + var5] = (byte) (super.field2483[super.field2449++] + -this.field4826.method1426(255));
            }
            ++field4833;
        }
    }

    @OriginalMember(owner = "client!nd", name = "m", descriptor = "(II)I")
    public final int method1858(int arg0, int arg1) {
        if (arg1 <= 29) {
            field4832 = 89;
        }
        ++field4830;
        return arg0 * 8 + -this.field4827;
    }

    @OriginalMember(owner = "client!nd", name = "a", descriptor = "(IBI)I")
    public static final int method1859(int arg0, byte arg1, int arg2) {
        ++field4825;
        class256 var3 = (class256) class4.field52.method1842(-1, (long) arg0);
        if (var3 == null) {
            return -1;
        } else {
            if (arg1 != -77) {
                method1856(28, (class135) null);
            }
            return ~arg2 <= -1 && var3.field4378.length > arg2 ? var3.field4378[arg2] : -1;
        }
    }

    @OriginalMember(owner = "client!nd", name = "a", descriptor = "([IB)V")
    public final void method1860(int[] arg0, byte arg1) {
        ++field4829;
        this.field4826 = new class208(arg0);
        if (arg1 != 116) {
            method1856(-38, (class135) null);
        }
    }

    @OriginalMember(owner = "client!nd", name = "x", descriptor = "(I)I")
    public final int method1861(int arg0) {
        int var2 = 42 % ((31 - arg0) / 49);
        ++field4839;
        return 255 & super.field2483[super.field2449++] + -this.field4826.method1426(255);
    }

    @OriginalMember(owner = "client!nd", name = "g", descriptor = "(B)V")
    public final void method1862(byte arg0) {
        super.field2449 = (this.field4827 - -7) / 8;
        int var2 = -66 % ((arg0 - -1) / 40);
        ++field4823;
    }

    @OriginalMember(owner = "client!nd", name = "b", descriptor = "(ZI)V")
    public final void method1863(boolean arg0, int arg1) {
        if (!arg0) {
            field4832 = -65;
        }
        ++field4824;
        super.field2483[super.field2449++] = (byte) (arg1 + this.field4826.method1426(255));
    }

    @OriginalMember(owner = "client!nd", name = "a", descriptor = "()V")
    public static final void method1864() {
        if (class211.field3800 != null) {
            for (int var0 = 0; var0 < class211.field3800.length; ++var0) {
                for (int var1 = 0; var1 < class2.field40; ++var1) {
                    for (int var2 = 0; var2 < class263.field4588; ++var2) {
                        class211.field3800[var0][var1][var2] = null;
                    }
                }
            }
        }
        if (class183.field3255 != null) {
            for (int var3 = 0; var3 < class183.field3255.length; ++var3) {
                for (int var4 = 0; var4 < class2.field40; ++var4) {
                    for (int var5 = 0; var5 < class263.field4588; ++var5) {
                        class183.field3255[var3][var4][var5] = null;
                    }
                }
            }
        }
        class112.field1966 = 0;
        if (class118.field2082 != null) {
            for (int var6 = 0; var6 < class112.field1966; ++var6) {
                class118.field2082[var6] = null;
            }
        }
        if (class33.field817 != null) {
            for (int var7 = 0; var7 < class16.field454; ++var7) {
                class33.field817[var7] = null;
            }
            class16.field454 = 0;
        }
        if (class179.field3194 != null) {
            for (int var8 = 0; var8 < class179.field3194.length; ++var8) {
                class179.field3194[var8] = null;
            }
        }
    }

    @OriginalMember(owner = "client!nd", name = "<init>", descriptor = "(I)V")
    public class272(int arg0) {
        super(arg0);
    }

    @OriginalMember(owner = "client!nd", name = "h", descriptor = "(B)V")
    public static void method1865(byte arg0) {
        field4828 = null;
        field4834 = null;
        if (arg0 != 0) {
            field4828 = null;
        }
        field4837 = null;
    }

    @OriginalMember(owner = "client!nd", name = "y", descriptor = "(I)V")
    public final void method1866(int arg0) {
        ++field4836;
        this.field4827 = super.field2449 * arg0;
    }

    @OriginalMember(owner = "client!nd", name = "n", descriptor = "(II)I")
    public final int method1867(int arg0, int arg1) {
        ++field4835;
        int var3 = this.field4827 >> 3;
        int var4 = -(7 & this.field4827) + arg1;
        int var5 = 0;
        this.field4827 += arg0;
        while (var4 < arg0) {
            var5 += (super.field2483[var3++] & class26.field709[var4]) << arg0 - var4;
            arg0 -= var4;
            var4 = 8;
        }
        int var6;
        if (~arg0 == ~var4) {
            var6 = (super.field2483[var3] & class26.field709[var4]) + var5;
        } else {
            var6 = (super.field2483[var3] >> -arg0 + var4 & class26.field709[arg0]) + var5;
        }
        return var6;
    }
}
