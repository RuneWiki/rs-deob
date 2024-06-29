import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!of")
public class class321 extends class91 {

    @OriginalMember(owner = "client!of", name = "Jb", descriptor = "Lcm;")
    public static class449 field4919 = new class449(78, 3);

    @OriginalMember(owner = "client!of", name = "U", descriptor = "I")
    public static int field4915;

    @OriginalMember(owner = "client!of", name = "Gb", descriptor = "I")
    public static int field4916;

    @OriginalMember(owner = "client!of", name = "Hb", descriptor = "I")
    public static int field4917;

    @OriginalMember(owner = "client!of", name = "Ib", descriptor = "I")
    public static int field4918;

    @OriginalMember(owner = "client!of", name = "Kb", descriptor = "I")
    public static int field4920;

    @OriginalMember(owner = "client!of", name = "Lb", descriptor = "I")
    public static int field4921;

    @OriginalMember(owner = "client!of", name = "Mb", descriptor = "I")
    public static int field4922;

    @OriginalMember(owner = "client!of", name = "Nb", descriptor = "I")
    public static int field4923;

    @OriginalMember(owner = "client!of", name = "Pb", descriptor = "I")
    public static int field4925;

    @OriginalMember(owner = "client!of", name = "Qb", descriptor = "I")
    private int field4926;

    @OriginalMember(owner = "client!of", name = "Rb", descriptor = "I")
    public static int field4927;

    @OriginalMember(owner = "client!of", name = "Sb", descriptor = "I")
    public static int field4928;

    @OriginalMember(owner = "client!of", name = "Ob", descriptor = "Lkr;")
    private class76 field4924;

    @OriginalMember(owner = "client!of", name = "s", descriptor = "(I)Z")
    public final boolean method2076(int arg0) {
        ++field4916;
        int var2 = 255 & super.field1277[super.field1292] - this.field4924.method504(-20256);
        return ~var2 <= arg0;
    }

    @OriginalMember(owner = "client!of", name = "t", descriptor = "(I)V")
    public final void method2077(int arg0) {
        this.field4926 = super.field1292 * arg0;
        ++field4927;
    }

    @OriginalMember(owner = "client!of", name = "<init>", descriptor = "(I)V")
    public class321(int arg0) {
        super(arg0);
    }

    @OriginalMember(owner = "client!of", name = "a", descriptor = "(I[I)V")
    public final void method2078(int arg0, int[] arg1) {
        ++field4920;
        this.field4924 = new class76(arg1);
        if (arg0 != -13147) {
            this.method2077(-59);
        }
    }

    @OriginalMember(owner = "client!of", name = "m", descriptor = "(B)I")
    public final int method2079(byte arg0) {
        ++field4918;
        int var2 = super.field1277[super.field1292++] - this.field4924.method502(-9746) & 255;
        if (var2 < 128) {
            return var2;
        } else {
            return arg0 >= -3 ? 1 : (255 & super.field1277[super.field1292++] + -this.field4924.method502(-9746)) + (var2 + -128 << 8);
        }
    }

    @OriginalMember(owner = "client!of", name = "d", descriptor = "(BI)I")
    public final int method2080(byte arg0, int arg1) {
        if (arg0 != -67) {
            this.method2079((byte) 87);
        }
        ++field4917;
        return arg1 * 8 + -this.field4926;
    }

    @OriginalMember(owner = "client!of", name = "a", descriptor = "([BIII)V")
    public final void method2081(byte[] arg0, int arg1, int arg2, int arg3) {
        int var5 = 0;
        if (arg1 != 255) {
            field4915 = 25;
        }
        while (~arg3 < ~var5) {
            arg0[arg2 + var5] = (byte) (super.field1277[super.field1292++] + -this.field4924.method502(-9746));
            ++var5;
        }
        ++field4925;
    }

    @OriginalMember(owner = "client!of", name = "n", descriptor = "(II)V")
    public final void method2082(int arg0, int arg1) {
        ++field4928;
        if (arg0 <= 15) {
            field4919 = null;
        }
        super.field1277[super.field1292++] = (byte) (arg1 + this.field4924.method502(-9746));
    }

    @OriginalMember(owner = "client!of", name = "n", descriptor = "(B)V")
    public static void method2083(byte arg0) {
        if (arg0 != 93) {
            field4919 = null;
        }
        field4919 = null;
    }

    @OriginalMember(owner = "client!of", name = "e", descriptor = "(BI)I")
    public final int method2084(byte arg0, int arg1) {
        ++field4922;
        int var3 = this.field4926 >> 3;
        int var4 = 8 - (this.field4926 & 7);
        if (arg0 != -118) {
            this.method2076(55);
        }
        int var5 = 0;
        this.field4926 += arg1;
        while (arg1 > var4) {
            var5 += (super.field1277[var3++] & class185.field2612[var4]) << arg1 - var4;
            arg1 -= var4;
            var4 = 8;
        }
        int var6;
        if (~arg1 != ~var4) {
            var6 = (super.field1277[var3] >> -arg1 + var4 & class185.field2612[arg1]) + var5;
        } else {
            var6 = (super.field1277[var3] & class185.field2612[var4]) + var5;
        }
        return var6;
    }

    @OriginalMember(owner = "client!of", name = "u", descriptor = "(I)V")
    public final void method2085(int arg0) {
        ++field4921;
        super.field1292 = (this.field4926 + arg0) / 8;
    }
}
