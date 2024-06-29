import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!pj")
public class class131 extends class30 {

    @OriginalMember(owner = "client!pj", name = "H", descriptor = "[S")
    private short[] field1881 = new short[257];

    @OriginalMember(owner = "client!pj", name = "K", descriptor = "I")
    private int field1884 = 0;

    @OriginalMember(owner = "client!pj", name = "J", descriptor = "I")
    public static int field1883 = 0;

    @OriginalMember(owner = "client!pj", name = "Q", descriptor = "[I")
    public static int[] field1888 = new int[500];

    @OriginalMember(owner = "client!pj", name = "D", descriptor = "Lfc;")
    public static class235 field1878 = new class235("WTWIP", 3);

    @OriginalMember(owner = "client!pj", name = "R", descriptor = "[[I")
    public static int[][] field1889 = new int[][] { { 2, 4, 6, 0 }, { 0, 2, 4, 6 }, { 0, 2, 4 }, { 4, 0, 2 }, { 2, 4, 0 }, { 0, 2, 4 }, { 6, 0, 1, 2, 4, 5 }, { 0, 4, 7, 6 }, { 4, 7, 6, 0 }, { 0, 8, 6, 2, 9, 4 }, { 2, 9, 4, 0, 8, 6 }, { 2, 11, 4, 6, 10, 0 }, { 2, 4, 6, 0 } };

    @OriginalMember(owner = "client!pj", name = "z", descriptor = "I")
    public static int field1874;

    @OriginalMember(owner = "client!pj", name = "A", descriptor = "I")
    public static int field1875;

    @OriginalMember(owner = "client!pj", name = "B", descriptor = "I")
    public static int field1876;

    @OriginalMember(owner = "client!pj", name = "C", descriptor = "I")
    public static int field1877;

    @OriginalMember(owner = "client!pj", name = "G", descriptor = "I")
    public static int field1880;

    @OriginalMember(owner = "client!pj", name = "L", descriptor = "I")
    public static int field1885;

    @OriginalMember(owner = "client!pj", name = "P", descriptor = "I")
    public static int field1887;

    @OriginalMember(owner = "client!pj", name = "T", descriptor = "I")
    public static int field1891;

    @OriginalMember(owner = "client!pj", name = "S", descriptor = "Lem;")
    public static class206 field1890;

    @OriginalMember(owner = "client!pj", name = "I", descriptor = "[I")
    private int[] field1882;

    @OriginalMember(owner = "client!pj", name = "N", descriptor = "[I")
    private int[] field1886;

    @OriginalMember(owner = "client!pj", name = "F", descriptor = "[[I")
    private int[][] field1879;

    @OriginalMember(owner = "client!pj", name = "a", descriptor = "(II)[I")
    public final int[] method48(int arg0, int arg1) {
        ++field1875;
        int[] var3 = super.field374.method3664(arg1, (byte) 8);
        if (arg0 != 1) {
            field1889 = null;
        }
        if (super.field374.field9032) {
            int[] var4 = this.method294(arg1, 0, (byte) -121);
            for (int var5 = 0; ~var5 > ~class31.field399; ++var5) {
                int var6 = var4[var5] >> 4;
                if (var6 < 0) {
                    var6 = 0;
                }
                if (var6 > 256) {
                    var6 = 256;
                }
                var3[var5] = this.field1881[var6];
            }
        }
        return var3;
    }

    @OriginalMember(owner = "client!pj", name = "d", descriptor = "(I)V")
    public static void method926(int arg0) {
        field1890 = null;
        field1878 = null;
        field1888 = null;
        field1889 = null;
        if (arg0 != -3451) {
            method928(98, 33, -66);
        }
    }

    @OriginalMember(owner = "client!pj", name = "g", descriptor = "(I)V")
    private final void method927(int arg0) {
        ++field1874;
        if (arg0 != 1) {
            method931((class295) null, -61, 4, 27);
        }
        int var2 = this.field1884;
        if (var2 != 2) {
            if (var2 == 1) {
                for (int var3 = 0; ~var3 > -258; ++var3) {
                    int var4 = var3 << 4;
                    int var5;
                    for (var5 = 1; ~var5 > ~(this.field1879.length + -1) && this.field1879[var5][0] <= var4; ++var5) {
                    }
                    int[] var6 = this.field1879[var5 + -1];
                    int[] var7 = this.field1879[var5];
                    int var8 = (var4 - var6[0] << 12) / (var7[0] + -var6[0]);
                    int var9 = -class76.field995[var8 >> 5 & 255] + 4096 >> 1;
                    int var10 = -var9 + 4096;
                    int var11 = var6[1] * var10 + var7[1] * var9 >> 12;
                    if (~var11 >= 32767) {
                        var11 = -32767;
                    }
                    if (~var11 <= -32769) {
                        var11 = 32767;
                    }
                    this.field1881[var3] = (short) var11;
                }
            } else {
                for (int var12 = 0; var12 < 257; ++var12) {
                    int var13 = var12 << 4;
                    int var14;
                    for (var14 = 1; ~var14 > ~(this.field1879.length + -1) && this.field1879[var14][0] <= var13; ++var14) {
                    }
                    int[] var15 = this.field1879[var14 + -1];
                    int[] var16 = this.field1879[var14];
                    int var17 = (-var15[0] + var13 << 12) / (var16[0] + -var15[0]);
                    int var18 = -var17 + 4096;
                    int var19 = var15[1] * var18 + var16[1] * var17 >> 12;
                    if (var19 <= -32768) {
                        var19 = -32767;
                    }
                    if (~var19 <= -32769) {
                        var19 = 32767;
                    }
                    this.field1881[var12] = (short) var19;
                }
            }
        } else {
            for (int var20 = 0; ~var20 > -258; ++var20) {
                int var21 = var20 << 4;
                int var22;
                for (var22 = 1; ~(this.field1879.length + -1) < ~var22 && ~var21 <= ~this.field1879[var22][0]; ++var22) {
                }
                int[] var23 = this.field1879[var22 - 1];
                int[] var24 = this.field1879[var22];
                int var25 = this.method930((byte) -88, var22 - 2)[1];
                int var26 = var23[1];
                int var27 = var24[1];
                int var28 = this.method930((byte) -115, var22 - -1)[1];
                int var29 = (-var23[0] + var21 << 12) / (var24[0] + -var23[0]);
                int var30 = var29 * var29 >> 12;
                int var31 = -var27 + var28 + -var25 + var26;
                int var32 = -var26 + var25 + -var31;
                int var33 = -var25 + var27;
                int var35 = (var29 * var31 >> 12) * var30 >> 12;
                int var36 = var30 * var32 >> 12;
                int var37 = var29 * var33 >> 12;
                int var38 = var35 + var36 + var26 + var37;
                if (~var38 >= 32767) {
                    var38 = -32767;
                }
                if (var38 >= 32768) {
                    var38 = 32767;
                }
                this.field1881[var20] = (short) var38;
            }
        }
    }

    @OriginalMember(owner = "client!pj", name = "<init>", descriptor = "()V")
    public class131() {
        super(1, true);
    }

    @OriginalMember(owner = "client!pj", name = "b", descriptor = "(B)V")
    public final void method29(byte arg0) {
        ++field1880;
        if (this.field1879 == null) {
            this.field1879 = new int[][] { new int[2], { 4096, 4096 } };
        }
        if (this.field1879.length < 2) {
            throw new RuntimeException("Curve operation requires at least two markers");
        } else if (arg0 < -10) {
            if (this.field1884 == 2) {
                this.method929(124);
            }
            class118.method841(0);
            this.method927(1);
        }
    }

    @OriginalMember(owner = "client!pj", name = "a", descriptor = "(BILac;)V")
    public final void method27(byte arg0, int arg1, class501 arg2) {
        if (arg0 < 100) {
            this.method927(-22);
        }
        if (arg1 == 0) {
            this.field1884 = arg2.method2874((byte) -75);
            this.field1879 = new int[arg2.method2874((byte) -75)][2];
            for (int var4 = 0; var4 < this.field1879.length; ++var4) {
                this.field1879[var4][0] = arg2.method2845(-1);
                this.field1879[var4][1] = arg2.method2845(-1);
            }
        }
        ++field1885;
    }

    @OriginalMember(owner = "client!pj", name = "b", descriptor = "(III)Lnn;")
    public static final class380 method928(int arg0, int arg1, int arg2) {
        ++field1876;
        class380 var3 = new class380();
        var3.field5070 = -1;
        var3.field5066 = arg0 + 5 + arg1;
        var3.field5083 = arg2 + 1 - -5;
        var3.field5069 = -1;
        var3.field5064 = new int[var3.field5066][var3.field5083];
        var3.method2183(1);
        return var3;
    }

    @OriginalMember(owner = "client!pj", name = "h", descriptor = "(I)V")
    private final void method929(int arg0) {
        ++field1877;
        int[] var2 = this.field1879[0];
        int[] var3 = this.field1879[1];
        int var4 = -102 % ((51 - arg0) / 37);
        int[] var5 = this.field1879[this.field1879.length - 2];
        int[] var6 = this.field1879[this.field1879.length + -1];
        this.field1886 = new int[] { var2[0] - (var3[0] - var2[0]), var2[1] + -var3[1] + var2[1] };
        this.field1882 = new int[] { var5[0] + var5[0] + -var6[0], var5[1] + -var6[1] + var5[1] };
    }

    @OriginalMember(owner = "client!pj", name = "a", descriptor = "(BI)[I")
    private final int[] method930(byte arg0, int arg1) {
        ++field1887;
        if (arg0 >= -76) {
            field1889 = null;
        }
        if (~arg1 > -1) {
            return this.field1886;
        } else {
            return ~arg1 <= ~this.field1879.length ? this.field1882 : this.field1879[arg1];
        }
    }

    @OriginalMember(owner = "client!pj", name = "a", descriptor = "(Lvv;III)V")
    public static final void method931(class295 arg0, int arg1, int arg2, int arg3) {
        if (arg2 < class335.field4511) {
            class390 var4 = class295.field4051[arg1][arg2 + 1][arg3];
            if (var4 != null && var4.field5524 != null && var4.field5524.method215(123)) {
                arg0.method223(var4.field5524, 0, 0, true, class401.field5619, class631.field8750, 0);
            }
        }
        if (arg3 < class335.field4511) {
            class390 var5 = class295.field4051[arg1][arg2][arg3 + 1];
            if (var5 != null && var5.field5524 != null && var5.field5524.method215(105)) {
                arg0.method223(var5.field5524, 0, class631.field8750, true, class401.field5619, 0, 0);
            }
        }
        if (arg2 < class335.field4511 && arg3 < class643.field8878) {
            class390 var6 = class295.field4051[arg1][arg2 + 1][arg3 + 1];
            if (var6 != null && var6.field5524 != null && var6.field5524.method215(58)) {
                arg0.method223(var6.field5524, 0, class631.field8750, true, class401.field5619, class631.field8750, 0);
            }
        }
        if (arg2 < class335.field4511 && arg3 > 0) {
            class390 var7 = class295.field4051[arg1][arg2 + 1][arg3 - 1];
            if (var7 != null && var7.field5524 != null && var7.field5524.method215(106)) {
                arg0.method223(var7.field5524, 0, -class631.field8750, true, class401.field5619, class631.field8750, 0);
            }
        }
    }
}
