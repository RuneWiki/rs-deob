import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!m")
public class class108 extends class59 {

    @OriginalMember(owner = "client!m", name = "db", descriptor = "I")
    private int field2103 = 0;

    @OriginalMember(owner = "client!m", name = "Y", descriptor = "Lsd;")
    private static class166 field2098 = class135.method935("The server is being updated)3", 0);

    @OriginalMember(owner = "client!m", name = "S", descriptor = "Lsd;")
    public static class166 field2092 = class135.method935("sch-Utteln:", 0);

    @OriginalMember(owner = "client!m", name = "W", descriptor = "Lsd;")
    public static class166 field2096 = field2098;

    @OriginalMember(owner = "client!m", name = "V", descriptor = "Lb;")
    public static class11 field2095 = new class11(64);

    @OriginalMember(owner = "client!m", name = "jb", descriptor = "Lsd;")
    private static class166 field2109 = class135.method935("scroll:", 0);

    @OriginalMember(owner = "client!m", name = "kb", descriptor = "Lsd;")
    public static class166 field2110 = field2109;

    @OriginalMember(owner = "client!m", name = "lb", descriptor = "Lsd;")
    public static class166 field2111 = field2109;

    @OriginalMember(owner = "client!m", name = "X", descriptor = "I")
    public static int field2097;

    @OriginalMember(owner = "client!m", name = "bb", descriptor = "I")
    public static int field2101;

    @OriginalMember(owner = "client!m", name = "cb", descriptor = "I")
    public static int field2102;

    @OriginalMember(owner = "client!m", name = "eb", descriptor = "I")
    public static int field2104;

    @OriginalMember(owner = "client!m", name = "fb", descriptor = "I")
    public static int field2105;

    @OriginalMember(owner = "client!m", name = "gb", descriptor = "I")
    public static int field2106;

    @OriginalMember(owner = "client!m", name = "hb", descriptor = "I")
    public static int field2107;

    @OriginalMember(owner = "client!m", name = "ib", descriptor = "I")
    public static int field2108;

    @OriginalMember(owner = "client!m", name = "T", descriptor = "[I")
    private int[] field2093;

    @OriginalMember(owner = "client!m", name = "Z", descriptor = "[I")
    public static int[] field2099;

    @OriginalMember(owner = "client!m", name = "ab", descriptor = "[I")
    private int[] field2100;

    @OriginalMember(owner = "client!m", name = "U", descriptor = "[[I")
    private int[][] field2094;

    @OriginalMember(owner = "client!m", name = "f", descriptor = "(I)V")
    private final void method791(int arg0) {
        ++field2106;
        int[] var2 = this.field2094[1];
        int[] var3 = this.field2094[this.field2094.length + -2];
        int[] var4 = this.field2094[0];
        int[] var5 = this.field2094[this.field2094.length + -1];
        this.field2100 = new int[] { -var5[0] - (-var3[arg0] - var3[0]), var3[1] + -var5[1] + var3[1] };
        this.field2093 = new int[] { var4[0] + -var2[0] + var4[0], var4[1] + -var2[1] + var4[1] };
    }

    @OriginalMember(owner = "client!m", name = "a", descriptor = "(II[BI)I")
    public static final int method792(int arg0, int arg1, byte[] arg2, int arg3) {
        ++field2104;
        int var4 = -1;
        int var5 = arg1;
        int var6 = -122 / ((-15 - arg3) / 60);
        while (~arg0 < ~var5) {
            var4 = var4 >>> 8 ^ class77.field1575[(arg2[var5] ^ var4) & 255];
            ++var5;
        }
        return ~var4;
    }

    @OriginalMember(owner = "client!m", name = "b", descriptor = "(IB)[I")
    public final int[] method36(int arg0, byte arg1) {
        ++field2108;
        if (arg1 >= -124) {
            this.field2103 = -6;
        }
        int[] var3 = super.field1219.method721(arg0, -128);
        if (super.field1219.field1816) {
            int[] var4 = this.method499(0, arg0, 0);
            int var5 = this.field2103;
            if (var5 != 2) {
                if (~var5 == -2) {
                    for (int var6 = 0; var6 < class98.field1879; ++var6) {
                        int var7 = var4[var6];
                        int var8;
                        for (var8 = 1; this.field2094.length + -1 > var8 && this.field2094[var8][0] <= var7; ++var8) {
                        }
                        int[] var9 = this.field2094[var8 + -1];
                        int[] var10 = this.field2094[var8];
                        int var11 = (-var9[0] + var7 << 12) / (var10[0] + -var9[0]);
                        int var12 = 4096 - class92.field1808[(8177 & var11) >> 5] >> 1;
                        int var13 = 4096 - var12;
                        var3[var6] = var9[1] * var13 + var10[1] * var12 >> 12;
                    }
                } else {
                    for (int var14 = 0; var14 < class98.field1879; ++var14) {
                        int var15 = var4[var14];
                        int var16;
                        for (var16 = 1; ~var16 > ~(this.field2094.length + -1) && ~var15 <= ~this.field2094[var16][0]; ++var16) {
                        }
                        int[] var17 = this.field2094[var16 - 1];
                        int[] var18 = this.field2094[var16];
                        int var19 = (-var17[0] + var15 << 12) / (var18[0] + -var17[0]);
                        int var20 = -var19 + 4096;
                        var3[var14] = var17[1] * var20 + var18[1] * var19 >> 12;
                    }
                }
            } else {
                for (int var21 = 0; var21 < class98.field1879; ++var21) {
                    int var22 = var4[var21];
                    int var23;
                    for (var23 = 1; this.field2094.length + -1 > var23 && ~this.field2094[var23][0] >= ~var22; ++var23) {
                    }
                    int[] var24 = this.field2094[var23 + -1];
                    int[] var25 = this.field2094[var23];
                    int var26 = this.method794(var23 + -2, false)[1];
                    int var27 = var25[1];
                    int var28 = var24[1];
                    int var29 = this.method794(var23 - -1, false)[1];
                    int var30 = -var26 + var29 + -var27 + var28;
                    int var31 = (-var24[0] + var22 << 12) / (var25[0] + -var24[0]);
                    int var32 = var26 - var28 + -var30;
                    int var33 = var31 * var31 >> 12;
                    int var34 = var27 - var26;
                    int var36 = (var30 * var31 >> 12) * var33 >> 12;
                    int var37 = var32 * var33 >> 12;
                    int var38 = var31 * var34 >> 12;
                    var3[var21] = var28 + var38 + var36 - -var37;
                }
            }
        }
        return var3;
    }

    @OriginalMember(owner = "client!m", name = "b", descriptor = "(Z)V")
    public static void method793(boolean arg0) {
        field2098 = null;
        field2111 = null;
        field2110 = null;
        field2092 = null;
        field2096 = null;
        if (arg0) {
            method792(60, -20, (byte[]) null, 54);
        }
        field2109 = null;
        field2099 = null;
        field2095 = null;
    }

    @OriginalMember(owner = "client!m", name = "<init>", descriptor = "()V")
    public class108() {
        super(1, true);
    }

    @OriginalMember(owner = "client!m", name = "d", descriptor = "(I)V")
    public final void method287(int arg0) {
        if (this.field2094 == null) {
            this.field2094 = new int[][] { new int[2], { 4096, 4096 } };
        }
        ++field2102;
        if (this.field2094.length < 2) {
            throw new RuntimeException("Curve operation requires at least two markers");
        } else {
            if (~this.field2103 == -3) {
                this.method791(0);
            }
            class92.method718(true);
            if (arg0 != 23459) {
                field2110 = null;
            }
        }
    }

    @OriginalMember(owner = "client!m", name = "a", descriptor = "(IZ)[I")
    private final int[] method794(int arg0, boolean arg1) {
        ++field2105;
        if (arg0 < 0) {
            return this.field2093;
        } else {
            if (arg1) {
                this.field2094 = null;
            }
            return this.field2094.length <= arg0 ? this.field2100 : this.field2094[arg0];
        }
    }

    @OriginalMember(owner = "client!m", name = "a", descriptor = "(Lff;BI)V")
    public final void method41(class53 arg0, byte arg1, int arg2) {
        if (arg1 > 18) {
            ++field2101;
            if (~arg2 == -1) {
                this.field2103 = arg0.method400(255);
                this.field2094 = new int[arg0.method400(255)][2];
                for (int var4 = 0; var4 < this.field2094.length; ++var4) {
                    this.field2094[var4][0] = arg0.method405(2);
                    this.field2094[var4][1] = arg0.method405(2);
                }
            }
        }
    }
}
