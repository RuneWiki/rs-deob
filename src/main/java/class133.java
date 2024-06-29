import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!pf")
public class class133 extends class425 {

    @OriginalMember(owner = "client!pf", name = "Lb", descriptor = "Lcs;")
    public static class351 field1873 = new class351(75, 4);

    @OriginalMember(owner = "client!pf", name = "Rb", descriptor = "[I")
    public static int[] field1879 = new int[] { 1, 2, 4, 8 };

    @OriginalMember(owner = "client!pf", name = "Tb", descriptor = "[I")
    public static int[] field1881 = new int[100];

    @OriginalMember(owner = "client!pf", name = "Ub", descriptor = "I")
    public static int field1882 = 0;

    @OriginalMember(owner = "client!pf", name = "Cb", descriptor = "I")
    private int field1864;

    @OriginalMember(owner = "client!pf", name = "Db", descriptor = "I")
    public static int field1865;

    @OriginalMember(owner = "client!pf", name = "Eb", descriptor = "I")
    public static int field1866;

    @OriginalMember(owner = "client!pf", name = "Fb", descriptor = "I")
    public static int field1867;

    @OriginalMember(owner = "client!pf", name = "Gb", descriptor = "I")
    public static int field1868;

    @OriginalMember(owner = "client!pf", name = "Hb", descriptor = "I")
    public static int field1869;

    @OriginalMember(owner = "client!pf", name = "Ib", descriptor = "I")
    public static int field1870;

    @OriginalMember(owner = "client!pf", name = "Kb", descriptor = "I")
    public static int field1872;

    @OriginalMember(owner = "client!pf", name = "Mb", descriptor = "I")
    public static int field1874;

    @OriginalMember(owner = "client!pf", name = "Nb", descriptor = "I")
    public static int field1875;

    @OriginalMember(owner = "client!pf", name = "Pb", descriptor = "I")
    public static int field1877;

    @OriginalMember(owner = "client!pf", name = "Qb", descriptor = "I")
    public static int field1878;

    @OriginalMember(owner = "client!pf", name = "Sb", descriptor = "I")
    public static int field1880;

    @OriginalMember(owner = "client!pf", name = "Ob", descriptor = "Ldq;")
    public static class14 field1876;

    @OriginalMember(owner = "client!pf", name = "Jb", descriptor = "Lod;")
    private class37 field1871;

    @OriginalMember(owner = "client!pf", name = "s", descriptor = "(I)V", line = 9)
    public final void method796(int arg0) {
        ++field1880;
        this.field1864 = super.field5830 * 8;
        if (arg0 >= -99) {
            field1876 = null;
        }
    }

    @OriginalMember(owner = "client!pf", name = "g", descriptor = "(IB)V", line = 21)
    public final void method797(int arg0, byte arg1) {
        if (arg1 <= 77) {
            field1873 = null;
        }
        super.field5886[super.field5830++] = (byte) (arg0 + this.field1871.method312(-1683759288));
        ++field1867;
    }

    @OriginalMember(owner = "client!pf", name = "h", descriptor = "(B)V", line = 35)
    public static void method798(byte arg0) {
        field1876 = null;
        if (arg0 == 31) {
            field1881 = null;
            field1879 = null;
            field1873 = null;
        }
    }

    @OriginalMember(owner = "client!pf", name = "h", descriptor = "(II)I", line = 53)
    public static final int method799(int arg0, int arg1) {
        if (arg1 != 127) {
            method798((byte) 7);
        }
        ++field1878;
        return arg0 & 127;
    }

    @OriginalMember(owner = "client!pf", name = "h", descriptor = "(IB)V", line = 64)
    public static final void method800(int arg0, byte arg1) {
        if (arg1 >= -29) {
            method798((byte) 78);
        }
        class280.field3862 = new int[arg0];
        ++field1875;
        class488.field6888 = new int[arg0];
        class99.field1405 = new int[arg0];
        class440.field6042 = new int[arg0];
        class435.field5976 = new int[arg0];
    }

    @OriginalMember(owner = "client!pf", name = "d", descriptor = "(BI)I", line = 81)
    public final int method801(byte arg0, int arg1) {
        ++field1869;
        int var3 = this.field1864 >> 3;
        int var4 = -(7 & this.field1864) + 8;
        if (arg0 != -87) {
            field1873 = null;
        }
        this.field1864 += arg1;
        int var5 = 0;
        while (var4 < arg1) {
            var5 += (super.field5886[var3++] & class489.field6901[var4]) << -var4 + arg1;
            arg1 -= var4;
            var4 = 8;
        }
        int var6;
        if (arg1 != var4) {
            var6 = (super.field5886[var3] >> -arg1 + var4 & class489.field6901[arg1]) + var5;
        } else {
            var6 = (super.field5886[var3] & class489.field6901[var4]) + var5;
        }
        return var6;
    }

    @OriginalMember(owner = "client!pf", name = "a", descriptor = "(III)I", line = 111)
    public static final int method802(int arg0, int arg1, int arg2) {
        int var3 = 118 / ((28 - arg2) / 39);
        ++field1865;
        if (~arg0 > ~arg1) {
            int var4 = arg0;
            arg0 = arg1;
            arg1 = var4;
        }
        while (~arg1 != -1) {
            int var5 = arg0 % arg1;
            arg0 = arg1;
            arg1 = var5;
        }
        return arg0;
    }

    @OriginalMember(owner = "client!pf", name = "<init>", descriptor = "(I)V", line = 146)
    public class133(int arg0) {
        super(arg0);
    }

    @OriginalMember(owner = "client!pf", name = "a", descriptor = "(III[B)V", line = 152)
    public final void method803(int arg0, int arg1, int arg2, byte[] arg3) {
        ++field1874;
        for (int var5 = arg1; ~var5 > ~arg2; ++var5) {
            arg3[arg0 + var5] = (byte) (super.field5886[super.field5830++] + -this.field1871.method312(-1683759288));
        }
    }

    @OriginalMember(owner = "client!pf", name = "i", descriptor = "(B)I", line = 166)
    public final int method804(byte arg0) {
        ++field1870;
        int var2 = 255 & super.field5886[super.field5830++] - this.field1871.method312(-1683759288);
        if (var2 < 128) {
            return var2;
        } else {
            if (arg0 >= -124) {
                this.field1871 = null;
            }
            return (super.field5886[super.field5830++] + -this.field1871.method312(-1683759288) & 255) + (var2 + -128 << 8);
        }
    }

    @OriginalMember(owner = "client!pf", name = "a", descriptor = "(I[I)V", line = 182)
    public final void method805(int arg0, int[] arg1) {
        int var3 = -117 % ((-5 - arg0) / 55);
        ++field1877;
        this.field1871 = new class37(arg1);
    }

    @OriginalMember(owner = "client!pf", name = "j", descriptor = "(B)V", line = 192)
    public final void method806(byte arg0) {
        super.field5830 = (this.field1864 - -7) / 8;
        ++field1872;
        if (arg0 > -34) {
            this.method801((byte) -100, 127);
        }
    }

    @OriginalMember(owner = "client!pf", name = "i", descriptor = "(IB)I", line = 208)
    public final int method807(int arg0, byte arg1) {
        if (arg1 >= -78) {
            field1882 = -74;
        }
        ++field1868;
        return arg0 * 8 - this.field1864;
    }

    @OriginalMember(owner = "client!pf", name = "k", descriptor = "(B)Z", line = 221)
    public final boolean method808(byte arg0) {
        ++field1866;
        if (arg0 > -59) {
            return true;
        } else {
            int var2 = 255 & super.field5886[super.field5830] - this.field1871.method314(-108);
            return ~var2 <= -129;
        }
    }
}
