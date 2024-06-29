import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!pb")
public class class124 extends class14 {

    @OriginalMember(owner = "client!pb", name = "Ob", descriptor = "Leb;")
    public static class230 field2167 = class68.method589(0, "logo");

    @OriginalMember(owner = "client!pb", name = "dc", descriptor = "Lv;")
    public static class147 field2182 = new class147(4);

    @OriginalMember(owner = "client!pb", name = "hc", descriptor = "[I")
    public static int[] field2186 = new int[2000];

    @OriginalMember(owner = "client!pb", name = "jc", descriptor = "Leb;")
    public static class230 field2188 = class68.method589(0, "Hierhin gehen");

    @OriginalMember(owner = "client!pb", name = "kc", descriptor = "Lpk;")
    public static class98 field2189 = new class98();

    @OriginalMember(owner = "client!pb", name = "Pb", descriptor = "I")
    public static int field2168;

    @OriginalMember(owner = "client!pb", name = "Qb", descriptor = "I")
    public static int field2169;

    @OriginalMember(owner = "client!pb", name = "Rb", descriptor = "I")
    public static int field2170;

    @OriginalMember(owner = "client!pb", name = "Sb", descriptor = "I")
    public static int field2171;

    @OriginalMember(owner = "client!pb", name = "Ub", descriptor = "I")
    public static int field2173;

    @OriginalMember(owner = "client!pb", name = "Vb", descriptor = "I")
    public static int field2174;

    @OriginalMember(owner = "client!pb", name = "Wb", descriptor = "I")
    public static int field2175;

    @OriginalMember(owner = "client!pb", name = "Xb", descriptor = "I")
    public static int field2176;

    @OriginalMember(owner = "client!pb", name = "Yb", descriptor = "I")
    public static int field2177;

    @OriginalMember(owner = "client!pb", name = "Zb", descriptor = "I")
    public static int field2178;

    @OriginalMember(owner = "client!pb", name = "ac", descriptor = "I")
    public static int field2179;

    @OriginalMember(owner = "client!pb", name = "bc", descriptor = "I")
    public static int field2180;

    @OriginalMember(owner = "client!pb", name = "cc", descriptor = "I")
    private int field2181;

    @OriginalMember(owner = "client!pb", name = "fc", descriptor = "I")
    public static int field2184;

    @OriginalMember(owner = "client!pb", name = "gc", descriptor = "I")
    public static int field2185;

    @OriginalMember(owner = "client!pb", name = "Tb", descriptor = "Loj;")
    public static class156 field2172;

    @OriginalMember(owner = "client!pb", name = "ec", descriptor = "Lpc;")
    private class21 field2183;

    @OriginalMember(owner = "client!pb", name = "ic", descriptor = "[Leh;")
    public static class80[] field2187;

    @OriginalMember(owner = "client!pb", name = "a", descriptor = "(I[BB)I")
    public static final int method969(int arg0, byte[] arg1, byte arg2) {
        ++field2171;
        if (arg2 != -15) {
            method975(5, -94, -34, -70, 14, 40, 8, 91, -74);
        }
        return class255.method1794(0, arg2 + 16, arg0, arg1);
    }

    @OriginalMember(owner = "client!pb", name = "s", descriptor = "(I)V")
    public final void method970(int arg0) {
        ++field2173;
        if (arg0 == 0) {
            this.field2181 = super.field318 * 8;
        }
    }

    @OriginalMember(owner = "client!pb", name = "o", descriptor = "(II)I")
    public final int method971(int arg0, int arg1) {
        if (arg0 > -44) {
            method969(79, (byte[]) null, (byte) -41);
        }
        ++field2178;
        int var3 = -(this.field2181 & 7) + 8;
        int var4 = this.field2181 >> 3;
        this.field2181 += arg1;
        int var5 = 0;
        while (~var3 > ~arg1) {
            var5 += (super.field269[var4++] & class271.field4783[var3]) << -var3 + arg1;
            arg1 -= var3;
            var3 = 8;
        }
        int var6;
        if (arg1 != var3) {
            var6 = (super.field269[var4] >> var3 - arg1 & class271.field4783[arg1]) + var5;
        } else {
            var6 = (super.field269[var4] & class271.field4783[var3]) + var5;
        }
        return var6;
    }

    @OriginalMember(owner = "client!pb", name = "a", descriptor = "([BIBI)V")
    public final void method972(byte[] arg0, int arg1, byte arg2, int arg3) {
        ++field2177;
        if (arg2 != 0) {
            method969(123, (byte[]) null, (byte) 14);
        }
        for (int var5 = 0; ~arg1 < ~var5; ++var5) {
            arg0[arg3 + var5] = (byte) (super.field269[super.field318++] + -this.field2183.method237((byte) 45));
        }
    }

    @OriginalMember(owner = "client!pb", name = "d", descriptor = "(Z)V")
    public static void method973(boolean arg0) {
        field2188 = null;
        field2172 = null;
        if (!arg0) {
            field2174 = 98;
        }
        field2167 = null;
        field2187 = null;
        field2186 = null;
        field2189 = null;
        field2182 = null;
    }

    @OriginalMember(owner = "client!pb", name = "p", descriptor = "(II)I")
    public final int method974(int arg0, int arg1) {
        ++field2176;
        if (arg1 != 8) {
            this.method974(-43, 29);
        }
        return arg0 * 8 + -this.field2181;
    }

    @OriginalMember(owner = "client!pb", name = "a", descriptor = "(IIIIIIIII)V")
    public static final void method975(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8) {
        for (int var9 = arg2; ~var9 > ~field2172.field2775; ++var9) {
            int var10 = field2172.field2782[var9] + -class72.field1319;
            int var11 = (var10 - arg7) * (-arg4 + arg1) / (-arg7 + arg0) + arg4;
            int var12 = 16777215;
            int var13 = class249.field4417 - (1 - (-field2172.field2780[var9] + class178.field3119));
            class73 var14 = null;
            int var15 = (-arg3 + var13) * (-arg6 + arg5) / (-arg3 + arg8) + arg6;
            int var16 = field2172.method1186(var9, (byte) -42);
            if (var16 == 0) {
                if ((double) class99.field1830 == 3.0D) {
                    var14 = class112.field2006;
                }
                if ((double) class99.field1830 == 4.0D) {
                    var14 = class260.field4627;
                }
                if ((double) class99.field1830 == 6.0D) {
                    var14 = class153.field2740;
                }
                if ((double) class99.field1830 == 8.0D) {
                    var14 = class259.field4583;
                }
            }
            if (var16 == 1) {
                if ((double) class99.field1830 == 3.0D) {
                    var14 = class153.field2740;
                }
                if ((double) class99.field1830 == 4.0D) {
                    var14 = class259.field4583;
                }
                if ((double) class99.field1830 == 6.0D) {
                    var14 = class5.field71;
                }
                if ((double) class99.field1830 == 8.0D) {
                    var14 = class96.field1732;
                }
            }
            if (var16 == 2) {
                var12 = 16755200;
                if ((double) class99.field1830 == 3.0D) {
                    var14 = class5.field71;
                }
                if ((double) class99.field1830 == 4.0D) {
                    var14 = class96.field1732;
                }
                if ((double) class99.field1830 == 6.0D) {
                    var14 = class249.field4412;
                }
                if ((double) class99.field1830 == 8.0D) {
                    var14 = class75.field1371;
                }
            }
            if (~field2172.field2776[var9] != 0) {
                var12 = field2172.field2776[var9];
            }
            if (var14 != null) {
                class230[] var17 = new class230[1 + field2172.field2777[var9].method1614(0, 60)];
                class104.field1904.method791(field2172.field2777[var9], (int[]) null, var17);
                int var18 = var17.length;
                int var19 = var15 - var14.method618() * (var18 + -1) / 2;
                int var20 = var19 + var14.method624() / 2;
                for (int var21 = 0; ~var18 < ~var21; ++var21) {
                    class230 var22 = var18 - 1 == var21 ? var17[var21] : var17[var21].method1597(0, 0, -4 + var17[var21].method1635(-38));
                    var14.method621(var22, var11, var20, var12, true);
                    var20 += var14.method618();
                }
            }
        }
        ++field2179;
    }

    @OriginalMember(owner = "client!pb", name = "<init>", descriptor = "(I)V")
    public class124(int arg0) {
        super(arg0);
    }

    @OriginalMember(owner = "client!pb", name = "t", descriptor = "(I)V")
    public final void method976(int arg0) {
        super.field318 = (this.field2181 - -7) / 8;
        if (arg0 <= 72) {
            this.method978(-119, 8);
        }
        ++field2184;
    }

    @OriginalMember(owner = "client!pb", name = "a", descriptor = "(I[I)V")
    public final void method977(int arg0, int[] arg1) {
        if (arg0 < 38) {
            this.method978(-57, -32);
        }
        ++field2175;
        this.field2183 = new class21(arg1);
    }

    @OriginalMember(owner = "client!pb", name = "q", descriptor = "(II)V")
    public final void method978(int arg0, int arg1) {
        int var3 = -95 % ((arg0 - -62) / 63);
        ++field2180;
        super.field269[super.field318++] = (byte) (arg1 + this.field2183.method237((byte) 42));
    }

    @OriginalMember(owner = "client!pb", name = "u", descriptor = "(I)I")
    public final int method979(int arg0) {
        int var2 = -109 / ((arg0 - -22) / 43);
        ++field2169;
        return super.field269[super.field318++] + -this.field2183.method237((byte) 83) & 255;
    }
}
