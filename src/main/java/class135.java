import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ie")
public class class135 extends class303 {

    @OriginalMember(owner = "client!ie", name = "m", descriptor = "I")
    private int field1884 = 0;

    @OriginalMember(owner = "client!ie", name = "o", descriptor = "Lvd;")
    private class216 field1886 = new class216();

    @OriginalMember(owner = "client!ie", name = "p", descriptor = "[I")
    public static int[] field1887 = new int[200];

    @OriginalMember(owner = "client!ie", name = "A", descriptor = "Lsq;")
    public static class454 field1898 = new class454(64);

    @OriginalMember(owner = "client!ie", name = "n", descriptor = "I")
    public static int field1885;

    @OriginalMember(owner = "client!ie", name = "q", descriptor = "I")
    public static int field1888;

    @OriginalMember(owner = "client!ie", name = "r", descriptor = "I")
    public static int field1889;

    @OriginalMember(owner = "client!ie", name = "s", descriptor = "I")
    public static int field1890;

    @OriginalMember(owner = "client!ie", name = "t", descriptor = "I")
    public static int field1891;

    @OriginalMember(owner = "client!ie", name = "u", descriptor = "I")
    public static int field1892;

    @OriginalMember(owner = "client!ie", name = "v", descriptor = "I")
    public static int field1893;

    @OriginalMember(owner = "client!ie", name = "w", descriptor = "I")
    public static int field1894;

    @OriginalMember(owner = "client!ie", name = "x", descriptor = "I")
    public static int field1895;

    @OriginalMember(owner = "client!ie", name = "y", descriptor = "I")
    public static int field1896;

    @OriginalMember(owner = "client!ie", name = "z", descriptor = "I")
    public static int field1897;

    @OriginalMember(owner = "client!ie", name = "a", descriptor = "(IIFLdh;Z)V", line = 3)
    public final void method810(int arg0, int arg1, float arg2, class269 arg3, boolean arg4) {
        if (arg0 == -7792) {
            ++field1893;
            super.field4153[super.field4145] = (byte) (!arg4 ? arg1 + 30 : arg1 + 40);
            super.field4152[super.field4145] = arg3;
            super.field4148[super.field4145] = arg2;
            ++super.field4145;
            if (super.field4145 >= 5000) {
                super.field4145 = 0;
            }
        }
    }

    @OriginalMember(owner = "client!ie", name = "b", descriptor = "(II)V", line = 21)
    public final void method811(int arg0, int arg1) {
        ++field1889;
        if (arg0 != 4) {
            field1887 = null;
        }
        super.field4153[super.field4145] = (byte) arg1;
        ++super.field4145;
        if (~super.field4145 <= -5001) {
            super.field4145 = 0;
        }
    }

    @OriginalMember(owner = "client!ie", name = "a", descriptor = "(Lui;B)V", line = 38)
    public final void method812(class406 arg0, byte arg1) {
        ++field1892;
        super.field4153[super.field4145] = 21;
        super.field4152[super.field4145] = arg0;
        ++super.field4145;
        if (arg1 != 10) {
            this.method817(true);
        }
        if (super.field4145 >= 5000) {
            super.field4145 = 0;
        }
    }

    @OriginalMember(owner = "client!ie", name = "a", descriptor = "(II)V", line = 61)
    public final void method813(int arg0, int arg1) {
        ++field1891;
        if (arg0 > -75) {
            this.method811(9, -121);
        }
    }

    @OriginalMember(owner = "client!ie", name = "c", descriptor = "(I)V", line = 75)
    public final void method814(int arg0) {
        while (~super.field4149 != ~super.field4145) {
            this.method819(-83);
        }
        if (arg0 != -13417) {
            field1887 = null;
        }
        ++field1885;
    }

    @OriginalMember(owner = "client!ie", name = "d", descriptor = "(I)V", line = 93)
    public static final void method815(int arg0) {
        ++field1895;
        if (arg0 != -1) {
            field1898 = null;
        }
        if (~class432.field5956 != 0) {
            class121.method756(-1, false, (byte) 29, -1, class432.field5956);
            class432.field5956 = -1;
        }
    }

    @OriginalMember(owner = "client!ie", name = "a", descriptor = "(Lui;I)V", line = 109)
    public final void method816(class406 arg0, int arg1) {
        ++field1896;
        --super.field4149;
        if (arg1 <= -123) {
            if (super.field4149 < 0) {
                super.field4149 = 4999;
            }
            super.field4153[super.field4149] = 21;
            super.field4152[super.field4149] = arg0;
        }
    }

    @OriginalMember(owner = "client!ie", name = "a", descriptor = "(Z)V", line = 126)
    public final void method817(boolean arg0) {
        ++field1897;
        if (!arg0) {
            this.method816((class406) null, 10);
        }
    }

    @OriginalMember(owner = "client!ie", name = "a", descriptor = "(BLui;)V", line = 139)
    public final void method818(byte arg0, class406 arg1) {
        super.field4153[super.field4145] = 20;
        ++field1890;
        super.field4152[super.field4145] = arg1;
        ++super.field4145;
        int var3 = 88 % ((-60 - arg0) / 49);
        if (super.field4145 >= 5000) {
            super.field4145 = 0;
        }
    }

    @OriginalMember(owner = "client!ie", name = "e", descriptor = "(I)V", line = 159)
    private final void method819(int arg0) {
        ++field1894;
        int var2 = super.field4149++;
        if (~super.field4149 <= -5001) {
            super.field4149 = 0;
        }
        this.field1884 = super.field4153[var2];
        Object var3 = super.field4152[var2];
        super.field4152[var2] = null;
        if (arg0 >= -5) {
            this.method810(12, -28, 0.035402015F, (class269) null, false);
        }
        if (this.field1884 == 21) {
            class432.method2526(this.field1886, (class406) var3);
        } else if (this.field1884 != 20) {
            if (this.field1884 >= 30 && ~this.field1884 >= -34) {
                class259.field3611.method1144(3000.0F, super.field4148[var2] * 1.5F);
                ((class269) var3).method703(class381.field5398, class8.field171, class125.field1713, class435.field5973, this.field1884 + -30 == 0);
            } else if (~this.field1884 <= -41 && ~this.field1884 >= -44) {
                class259.field3611.method1144(3000.0F, super.field4148[var2] * 1.5F);
                ((class269) var3).method703(class381.field5398, class8.field171, class125.field1713, class451.field6194, ~(this.field1884 + -40) == -1);
            } else if (~this.field1884 == -23) {
                class259.field3611.method1116(-1, 1583160, 40, 127);
            } else {
                if (this.field1884 != 23) {
                    if (this.field1884 == 24) {
                        class259.field3611.method1083(0, (class488[]) null);
                        return;
                    }
                } else {
                    class259.field3611.method1091();
                }
            }
        } else {
            class406 var4 = (class406) var3;
            if (var4.field5617 != null) {
                var4.field5617.method197(class259.field3611, -98);
            }
            if (var4.field5624 != null) {
                var4.field5624.method197(class259.field3611, -2);
            }
            if (var4.field5625 != null) {
                var4.field5625.method197(class259.field3611, 127);
            }
            if (var4.field5608 != null) {
                var4.field5608.method197(class259.field3611, 126);
            }
            if (var4.field5621 != null) {
                var4.field5621.method197(class259.field3611, 126);
            }
            for (class146 var5 = var4.field5613; var5 != null; var5 = var5.field2066) {
                var5.field2062.method197(class259.field3611, 124);
            }
        }
    }

    @OriginalMember(owner = "client!ie", name = "f", descriptor = "(I)V", line = 250)
    public static void method820(int arg0) {
        int var1 = 54 / ((-48 - arg0) / 42);
        field1898 = null;
        field1887 = null;
    }
}
