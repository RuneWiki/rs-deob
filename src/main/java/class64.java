import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!af")
public class class64 extends class121 {

    @OriginalMember(owner = "client!af", name = "Vb", descriptor = "[I")
    public static int[] field1044 = new int[] { 2, 0, 0, 2, 0, 0, 0, 4, 4 };

    @OriginalMember(owner = "client!af", name = "ac", descriptor = "[Z")
    public static boolean[] field1049 = new boolean[5];

    @OriginalMember(owner = "client!af", name = "Tb", descriptor = "Ldf;")
    public static class51 field1042 = class46.method233("rect_debug=", 100);

    @OriginalMember(owner = "client!af", name = "cc", descriptor = "Ldf;")
    private static class51 field1051 = class46.method233("Created gameworld", 100);

    @OriginalMember(owner = "client!af", name = "Yb", descriptor = "Ldf;")
    public static class51 field1047 = field1051;

    @OriginalMember(owner = "client!af", name = "Xb", descriptor = "Lbg;")
    public static class217 field1046 = new class217(16);

    @OriginalMember(owner = "client!af", name = "Lb", descriptor = "I")
    private int field1034;

    @OriginalMember(owner = "client!af", name = "Mb", descriptor = "I")
    public static int field1035;

    @OriginalMember(owner = "client!af", name = "Nb", descriptor = "I")
    public static int field1036;

    @OriginalMember(owner = "client!af", name = "Ob", descriptor = "I")
    public static int field1037;

    @OriginalMember(owner = "client!af", name = "Pb", descriptor = "I")
    public static int field1038;

    @OriginalMember(owner = "client!af", name = "Rb", descriptor = "I")
    public static int field1040;

    @OriginalMember(owner = "client!af", name = "Sb", descriptor = "I")
    public static int field1041;

    @OriginalMember(owner = "client!af", name = "Ub", descriptor = "I")
    public static int field1043;

    @OriginalMember(owner = "client!af", name = "Wb", descriptor = "I")
    public static int field1045;

    @OriginalMember(owner = "client!af", name = "Zb", descriptor = "I")
    public static int field1048;

    @OriginalMember(owner = "client!af", name = "bc", descriptor = "I")
    public static int field1050;

    @OriginalMember(owner = "client!af", name = "dc", descriptor = "Lld;")
    private class75 field1052;

    @OriginalMember(owner = "client!af", name = "Qb", descriptor = "[[[B")
    public static byte[][][] field1039;

    @OriginalMember(owner = "client!af", name = "<init>", descriptor = "(I)V")
    public class64(int arg0) {
        super(arg0);
    }

    @OriginalMember(owner = "client!af", name = "d", descriptor = "(BI)V")
    public final void method424(byte arg0, int arg1) {
        ++field1048;
        super.field2014[super.field2026++] = (byte) (arg1 + this.field1052.method537(52));
        if (arg0 <= 67) {
            this.field1052 = null;
        }
    }

    @OriginalMember(owner = "client!af", name = "a", descriptor = "(I[I)V")
    public final void method425(int arg0, int[] arg1) {
        this.field1052 = new class75(arg1);
        if (arg0 != 4) {
            field1044 = null;
        }
        ++field1040;
    }

    @OriginalMember(owner = "client!af", name = "p", descriptor = "(I)I")
    public final int method426(int arg0) {
        if (arg0 >= -72) {
            this.method427(false);
        }
        ++field1045;
        return super.field2014[super.field2026++] + -this.field1052.method537(-73) & 255;
    }

    @OriginalMember(owner = "client!af", name = "c", descriptor = "(Z)V")
    public final void method427(boolean arg0) {
        ++field1035;
        if (arg0) {
            this.field1052 = null;
        }
        this.field1034 = super.field2026 * 8;
    }

    @OriginalMember(owner = "client!af", name = "g", descriptor = "(IB)I")
    public final int method428(int arg0, byte arg1) {
        ++field1041;
        if (arg1 > -111) {
            field1046 = null;
        }
        int var3 = this.field1034 >> 3;
        int var4 = 8 - (7 & this.field1034);
        this.field1034 += arg0;
        int var5 = 0;
        while (~arg0 < ~var4) {
            var5 += (class74.field1181[var4] & super.field2014[var3++]) << arg0 - var4;
            arg0 -= var4;
            var4 = 8;
        }
        int var6;
        if (~arg0 != ~var4) {
            var6 = (super.field2014[var3] >> var4 - arg0 & class74.field1181[arg0]) + var5;
        } else {
            var6 = (class74.field1181[var4] & super.field2014[var3]) + var5;
        }
        return var6;
    }

    @OriginalMember(owner = "client!af", name = "p", descriptor = "(B)V")
    public static final void method429(byte arg0) {
        class120.field1993 &= 2047;
        int var1 = class170.field2784 >> 7;
        if (~class192.field3211 > -129) {
            class192.field3211 = 128;
        }
        ++field1036;
        int var2 = 0;
        if (~class192.field3211 < -384) {
            class192.field3211 = 383;
        }
        int var3 = class118.field1977 >> 7;
        if (arg0 == 65) {
            int var4 = class207.method1424(class257.field4496, class170.field2784, (byte) 105, class118.field1977);
            if (~var1 < -4 && ~var3 < -4 && var1 < 100 && ~var3 > -101) {
                for (int var5 = var1 + -4; ~var5 >= ~(var1 + 4); ++var5) {
                    for (int var6 = var3 + -4; var3 + 4 >= var6; ++var6) {
                        int var7 = class257.field4496;
                        if (var7 < 3 && ~(class160.field2626[1][var5][var6] & 2) == -3) {
                            ++var7;
                        }
                        int var8 = -class172.field2820[var7][var5][var6] + var4;
                        if (var2 < var8) {
                            var2 = var8;
                        }
                    }
                }
            }
            int var9 = var2 * 192;
            if (var9 > 98048) {
                var9 = 98048;
            }
            if (~var9 > -32769) {
                var9 = 32768;
            }
            if (~var9 < ~class62.field1009) {
                class62.field1009 += (var9 - class62.field1009) / 24;
            } else if (var9 < class62.field1009) {
                class62.field1009 += (-class62.field1009 + var9) / 80;
            }
        }
    }

    @OriginalMember(owner = "client!af", name = "a", descriptor = "(II[BI)V")
    public final void method430(int arg0, int arg1, byte[] arg2, int arg3) {
        for (int var5 = arg1; ~arg0 < ~var5; ++var5) {
            arg2[var5 - -arg3] = (byte) (super.field2014[super.field2026++] + -this.field1052.method537(arg1 + -114));
        }
        ++field1038;
    }

    @OriginalMember(owner = "client!af", name = "q", descriptor = "(I)V")
    public final void method431(int arg0) {
        ++field1050;
        super.field2026 = (this.field1034 + 7) / 8;
        if (arg0 != 98048) {
            field1044 = null;
        }
    }

    @OriginalMember(owner = "client!af", name = "d", descriptor = "(Z)V")
    public static void method432(boolean arg0) {
        field1039 = null;
        if (arg0) {
            field1049 = null;
            field1044 = null;
            field1046 = null;
            field1047 = null;
            field1042 = null;
            field1051 = null;
        }
    }

    @OriginalMember(owner = "client!af", name = "h", descriptor = "(IB)I")
    public final int method433(int arg0, byte arg1) {
        if (arg1 < 96) {
            this.method427(false);
        }
        ++field1043;
        return arg0 * 8 + -this.field1034;
    }
}
