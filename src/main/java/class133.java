import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!he")
public class class133 extends class124 {

    @OriginalMember(owner = "client!he", name = "Z", descriptor = "I")
    private int field2237 = 4;

    @OriginalMember(owner = "client!he", name = "W", descriptor = "I")
    private int field2234 = 4;

    @OriginalMember(owner = "client!he", name = "X", descriptor = "Le;")
    public static class191 field2235 = class54.method368("Lade Sprites )2 ", 2047);

    @OriginalMember(owner = "client!he", name = "R", descriptor = "I")
    public static int field2229 = 0;

    @OriginalMember(owner = "client!he", name = "P", descriptor = "I")
    public static int field2227;

    @OriginalMember(owner = "client!he", name = "Q", descriptor = "I")
    public static int field2228;

    @OriginalMember(owner = "client!he", name = "S", descriptor = "I")
    public static int field2230;

    @OriginalMember(owner = "client!he", name = "U", descriptor = "I")
    public static int field2232;

    @OriginalMember(owner = "client!he", name = "Y", descriptor = "I")
    public static int field2236;

    @OriginalMember(owner = "client!he", name = "ab", descriptor = "I")
    public static int field2238;

    @OriginalMember(owner = "client!he", name = "bb", descriptor = "I")
    public static int field2239;

    @OriginalMember(owner = "client!he", name = "cb", descriptor = "I")
    public static int field2240;

    @OriginalMember(owner = "client!he", name = "T", descriptor = "Lng;")
    public static class121 field2231;

    @OriginalMember(owner = "client!he", name = "V", descriptor = "[Lwa;")
    public static class226[] field2233;

    @OriginalMember(owner = "client!he", name = "a", descriptor = "(IB)[[I")
    public final int[][] method137(int arg0, byte arg1) {
        ++field2228;
        if (arg1 != -7) {
            this.method131((byte) -56, -124);
        }
        int[][] var3 = super.field2053.method1775((byte) -104, arg0);
        if (super.field2053.field4558) {
            int var4 = class64.field1132 / this.field2234;
            int var5 = class87.field1423 / this.field2237;
            int[][] var6;
            if (var5 <= 0) {
                var6 = this.method843((byte) -126, 0, 0);
            } else {
                int var7 = arg0 % var5;
                var6 = this.method843((byte) -47, class87.field1423 * var7 / var5, 0);
            }
            int[] var8 = var6[1];
            int[] var9 = var6[0];
            int[] var10 = var3[0];
            int[] var11 = var3[1];
            int[] var12 = var3[2];
            int[] var13 = var6[2];
            for (int var14 = 0; var14 < class64.field1132; ++var14) {
                int var16;
                if (var4 > 0) {
                    int var15 = var14 % var4;
                    var16 = class64.field1132 * var15 / var4;
                } else {
                    var16 = 0;
                }
                var10[var14] = var9[var16];
                var11[var14] = var8[var16];
                var12[var14] = var13[var16];
            }
        }
        return var3;
    }

    @OriginalMember(owner = "client!he", name = "a", descriptor = "(BI)[I")
    public final int[] method131(byte arg0, int arg1) {
        int[] var3 = super.field2064.method378(arg1, 0);
        ++field2239;
        if (arg0 < 68) {
            method895((class191) null, -117);
        }
        if (super.field2064.field1035) {
            int var4 = class64.field1132 / this.field2234;
            int var5 = class87.field1423 / this.field2237;
            int[] var7;
            if (~var5 < -1) {
                int var6 = arg1 % var5;
                var7 = this.method844(0, 125, class87.field1423 * var6 / var5);
            } else {
                var7 = this.method844(0, 32, 0);
            }
            for (int var8 = 0; ~var8 > ~class64.field1132; ++var8) {
                if (var4 <= 0) {
                    var3[var8] = var7[0];
                } else {
                    int var9 = var8 % var4;
                    var3[var8] = var7[class64.field1132 * var9 / var4];
                }
            }
        }
        return var3;
    }

    @OriginalMember(owner = "client!he", name = "a", descriptor = "(ILji;Z)V")
    public final void method136(int arg0, class225 arg1, boolean arg2) {
        if (~arg0 != -1) {
            if (arg0 == 1) {
                this.field2237 = arg1.method1580(-97);
            }
        } else {
            this.field2234 = arg1.method1580(-60);
        }
        ++field2230;
        if (!arg2) {
            field2233 = null;
        }
    }

    @OriginalMember(owner = "client!he", name = "a", descriptor = "(Le;I)I")
    public static final int method895(class191 arg0, int arg1) {
        ++field2232;
        if (arg0 == null) {
            return -1;
        } else if (arg1 <= 124) {
            return -96;
        } else {
            for (int var2 = 0; ~class270.field4759 < ~var2; ++var2) {
                if (arg0.method1351(-23098, class252.field4466[var2])) {
                    return var2;
                }
            }
            return -1;
        }
    }

    @OriginalMember(owner = "client!he", name = "h", descriptor = "(I)V")
    public static void method896(int arg0) {
        field2235 = null;
        field2233 = null;
        if (arg0 != -13185) {
            field2235 = null;
        }
        field2231 = null;
    }

    @OriginalMember(owner = "client!he", name = "a", descriptor = "(IILjb;)V")
    public static final void method897(int arg0, int arg1, class176 arg2) {
        if (~class135.field2267 > ~arg2.field2984) {
            class263.method1804(arg1, arg2);
        } else if (~class135.field2267 < ~arg2.field2962) {
            class175.method1169(arg2, (byte) -57);
        } else {
            class141.method931((byte) -78, arg2);
        }
        ++field2238;
        if (arg2.field3003 < 128 || ~arg2.field2972 > -129 || ~arg2.field3003 <= -13185 || arg2.field2972 >= 13184) {
            arg2.field3009 = -1;
            arg2.field2962 = 0;
            arg2.field2984 = 0;
            arg2.field3019 = -1;
            arg2.field3003 = arg2.field2953[0] * 128 + 64 * arg2.method490((byte) -4);
            arg2.field2972 = arg2.field3014[0] * 128 - -(arg2.method490((byte) -4) * 64);
            arg2.method1180((byte) -51);
        }
        if (class175.field2946 == arg2 && (~arg2.field3003 > -1537 || ~arg2.field2972 > -1537 || ~arg2.field3003 <= -11777 || arg2.field2972 >= 11776)) {
            arg2.field3019 = -1;
            arg2.field2962 = 0;
            arg2.field3009 = -1;
            arg2.field2984 = 0;
            arg2.field3003 = arg2.field2953[0] * 128 - -(arg2.method490((byte) -4) * 64);
            arg2.field2972 = arg2.field3014[0] * 128 + arg2.method490((byte) -4) * 64;
            arg2.method1180((byte) -51);
        }
        class258.method1778(arg2, 43);
        if (arg1 == 0) {
            class191.method1316(false, arg2);
        }
    }

    @OriginalMember(owner = "client!he", name = "i", descriptor = "(I)V")
    public static final void method898(int arg0) {
        class90.field1460 = 0;
        class79.field1350 = 0;
        class73.method477(arg0 + 143300694);
        class239.method1680((byte) 81);
        if (arg0 != 20026) {
            method898(67);
        }
        class222.method1548(1);
        ++field2236;
        class3.method9(1);
        for (int var1 = 0; class79.field1350 > var1; ++var1) {
            int var3 = class54.field1012[var1];
            if (~class135.field2267 != ~class245.field4357[var3].field2992) {
                if (class245.field4357[var3].field1299 > 0) {
                    class250.method1743(-56, class245.field4357[var3]);
                }
                class245.field4357[var3] = null;
            }
        }
        if (class253.field4486 != class107.field1776.field3996) {
            throw new RuntimeException("gpp1 pos:" + class107.field1776.field3996 + " psize:" + class253.field4486);
        } else {
            for (int var2 = 0; ~class260.field4586 < ~var2; ++var2) {
                if (class245.field4357[class73.field1271[var2]] == null) {
                    throw new RuntimeException("gpp2 pos:" + var2 + " size:" + class260.field4586);
                }
            }
        }
    }

    @OriginalMember(owner = "client!he", name = "<init>", descriptor = "()V")
    public class133() {
        super(1, false);
    }
}
