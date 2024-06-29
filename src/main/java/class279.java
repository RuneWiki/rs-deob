import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ni")
public class class279 extends class341 {

    @OriginalMember(owner = "client!ni", name = "Lb", descriptor = "[I")
    public static int[] field4098 = new int[] { 2047, 16383, 65535 };

    @OriginalMember(owner = "client!ni", name = "zb", descriptor = "I")
    public static int field4086;

    @OriginalMember(owner = "client!ni", name = "Ab", descriptor = "I")
    public static int field4087;

    @OriginalMember(owner = "client!ni", name = "Bb", descriptor = "I")
    public static int field4088;

    @OriginalMember(owner = "client!ni", name = "Cb", descriptor = "I")
    public static int field4089;

    @OriginalMember(owner = "client!ni", name = "Db", descriptor = "I")
    public static int field4090;

    @OriginalMember(owner = "client!ni", name = "Eb", descriptor = "I")
    public static int field4091;

    @OriginalMember(owner = "client!ni", name = "Fb", descriptor = "I")
    public static int field4092;

    @OriginalMember(owner = "client!ni", name = "Gb", descriptor = "I")
    public static int field4093;

    @OriginalMember(owner = "client!ni", name = "Hb", descriptor = "I")
    public static int field4094;

    @OriginalMember(owner = "client!ni", name = "Ib", descriptor = "I")
    public static int field4095;

    @OriginalMember(owner = "client!ni", name = "Kb", descriptor = "I")
    public static int field4097;

    @OriginalMember(owner = "client!ni", name = "Mb", descriptor = "I")
    public static int field4099;

    @OriginalMember(owner = "client!ni", name = "Nb", descriptor = "I")
    public static int field4100;

    @OriginalMember(owner = "client!ni", name = "Ob", descriptor = "I")
    public static int field4101;

    @OriginalMember(owner = "client!ni", name = "Pb", descriptor = "I")
    private int field4102;

    @OriginalMember(owner = "client!ni", name = "Jb", descriptor = "Lsg;")
    private class181 field4096;

    @OriginalMember(owner = "client!ni", name = "a", descriptor = "([BIBI)V", line = 5)
    public final void method1827(byte[] arg0, int arg1, byte arg2, int arg3) {
        ++field4088;
        for (int var5 = 0; var5 < arg3; ++var5) {
            arg0[arg1 + var5] = (byte) (super.field5042[super.field5049++] + -this.field4096.method1187(20647));
        }
        if (arg2 != -16) {
            this.field4096 = null;
        }
    }

    @OriginalMember(owner = "client!ni", name = "a", descriptor = "(IZ)I", line = 24)
    public final int method1828(int arg0, boolean arg1) {
        if (arg1) {
            field4099 = -62;
        }
        ++field4092;
        return arg0 * 8 + -this.field4102;
    }

    @OriginalMember(owner = "client!ni", name = "a", descriptor = "(BLir;Lir;)I", line = 35)
    public static final int method1829(byte arg0, class185 arg1, class185 arg2) {
        ++field4093;
        int var3 = 27 / ((12 - arg0) / 53);
        int var4 = 0;
        if (arg1.method1205((byte) -48, class340.field5019)) {
            ++var4;
        }
        if (arg1.method1205((byte) -48, class409.field5942)) {
            ++var4;
        }
        if (arg1.method1205((byte) -48, class387.field5668)) {
            ++var4;
        }
        if (arg2.method1205((byte) -48, class340.field5019)) {
            ++var4;
        }
        if (arg2.method1205((byte) -48, class409.field5942)) {
            ++var4;
        }
        if (arg2.method1205((byte) -48, class387.field5668)) {
            ++var4;
        }
        return var4;
    }

    @OriginalMember(owner = "client!ni", name = "a", descriptor = "(BII)I", line = 74)
    public static final int method1830(byte arg0, int arg1, int arg2) {
        ++field4086;
        class387 var3 = (class387) class67.field982.method2826(false, (long) arg2);
        if (arg0 != 27) {
            method1829((byte) 97, (class185) null, (class185) null);
        }
        if (var3 == null) {
            return 0;
        } else {
            return ~arg1 <= -1 && var3.field5657.length > arg1 ? var3.field5657[arg1] : 0;
        }
    }

    @OriginalMember(owner = "client!ni", name = "v", descriptor = "(I)V", line = 98)
    public final void method1831(int arg0) {
        ++field4089;
        super.field5049 = (this.field4102 + 7) / 8;
        if (arg0 != -15939) {
            method1834(-38, (class248) null, -61);
        }
    }

    @OriginalMember(owner = "client!ni", name = "e", descriptor = "(IB)I", line = 117)
    public final int method1832(int arg0, byte arg1) {
        ++field4095;
        int var3 = this.field4102 >> 3;
        int var4 = 8 - (7 & this.field4102);
        int var5 = 0;
        this.field4102 += arg0;
        while (~var4 > ~arg0) {
            var5 += (class62.field936[var4] & super.field5042[var3++]) << -var4 + arg0;
            arg0 -= var4;
            var4 = 8;
        }
        int var6;
        if (~arg0 == ~var4) {
            var6 = (super.field5042[var3] & class62.field936[var4]) + var5;
        } else {
            var6 = (super.field5042[var3] >> -arg0 + var4 & class62.field936[arg0]) + var5;
        }
        return arg1 > -37 ? 99 : var6;
    }

    @OriginalMember(owner = "client!ni", name = "o", descriptor = "(II)V", line = 149)
    public final void method1833(int arg0, int arg1) {
        ++field4100;
        super.field5042[super.field5049++] = (byte) (this.field4096.method1187(20647) + arg1);
        if (arg0 != -20379) {
            method1836(127);
        }
    }

    @OriginalMember(owner = "client!ni", name = "<init>", descriptor = "(I)V", line = 168)
    public class279(int arg0) {
        super(arg0);
    }

    @OriginalMember(owner = "client!ni", name = "a", descriptor = "(ILsj;I)I", line = 173)
    public static final int method1834(int arg0, class248 arg1, int arg2) {
        ++field4090;
        if (arg2 != -18822) {
            return 86;
        } else if (!client.method402(arg1).method1470((byte) 65, arg0) && arg1.field3532 == null) {
            return -1;
        } else {
            return arg1.field3534 != null && arg0 < arg1.field3534.length ? arg1.field3534[arg0] : -1;
        }
    }

    @OriginalMember(owner = "client!ni", name = "a", descriptor = "(Z[I[J)V", line = 190)
    public static final void method1835(boolean arg0, int[] arg1, long[] arg2) {
        ++field4091;
        if (!arg0) {
            class122.method874(arg2, arg1, 0, arg2.length + -1, (byte) -111);
        }
    }

    @OriginalMember(owner = "client!ni", name = "w", descriptor = "(I)V", line = 201)
    public static void method1836(int arg0) {
        field4098 = null;
        if (arg0 != -9) {
            method1835(false, (int[]) null, (long[]) null);
        }
    }

    @OriginalMember(owner = "client!ni", name = "x", descriptor = "(I)I", line = 211)
    public final int method1837(int arg0) {
        ++field4094;
        if (arg0 != 255) {
            method1836(-38);
        }
        return super.field5042[super.field5049++] + -this.field4096.method1187(20647) & 255;
    }

    @OriginalMember(owner = "client!ni", name = "a", descriptor = "([IZ)V", line = 222)
    public final void method1838(int[] arg0, boolean arg1) {
        ++field4101;
        if (!arg1) {
            this.field4096 = new class181(arg0);
        }
    }

    @OriginalMember(owner = "client!ni", name = "i", descriptor = "(B)V", line = 233)
    public final void method1839(byte arg0) {
        ++field4087;
        if (arg0 == 95) {
            this.field4102 = super.field5049 * 8;
        }
    }
}
