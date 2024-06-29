import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ih")
public class class81 extends class189 {

    @OriginalMember(owner = "client!ih", name = "tb", descriptor = "I")
    private int field1957 = 0;

    @OriginalMember(owner = "client!ih", name = "jb", descriptor = "[I")
    public static int[] field1947 = new int[4000];

    @OriginalMember(owner = "client!ih", name = "mb", descriptor = "Lgg;")
    public static class63 field1950 = class116.method911(43, "T");

    @OriginalMember(owner = "client!ih", name = "kb", descriptor = "[[[I")
    public static int[][][] field1948 = new int[4][105][105];

    @OriginalMember(owner = "client!ih", name = "nb", descriptor = "Lgg;")
    public static class63 field1951 = class116.method911(43, "hitmarks");

    @OriginalMember(owner = "client!ih", name = "rb", descriptor = "Lgg;")
    public static class63 field1955 = class116.method911(43, " )2> <col=ffffff>");

    @OriginalMember(owner = "client!ih", name = "sb", descriptor = "Lbh;")
    public static class19 field1956 = null;

    @OriginalMember(owner = "client!ih", name = "gb", descriptor = "I")
    public static int field1944;

    @OriginalMember(owner = "client!ih", name = "hb", descriptor = "I")
    public static int field1945;

    @OriginalMember(owner = "client!ih", name = "ib", descriptor = "I")
    public static int field1946;

    @OriginalMember(owner = "client!ih", name = "lb", descriptor = "I")
    public static int field1949;

    @OriginalMember(owner = "client!ih", name = "qb", descriptor = "I")
    public static int field1954;

    @OriginalMember(owner = "client!ih", name = "vb", descriptor = "I")
    public static int field1959;

    @OriginalMember(owner = "client!ih", name = "wb", descriptor = "Lmc;")
    public static class111 field1960;

    @OriginalMember(owner = "client!ih", name = "ob", descriptor = "[I")
    private int[] field1952;

    @OriginalMember(owner = "client!ih", name = "pb", descriptor = "[I")
    private int[] field1953;

    @OriginalMember(owner = "client!ih", name = "ub", descriptor = "[[I")
    private int[][] field1958;

    @OriginalMember(owner = "client!ih", name = "d", descriptor = "(Z)V")
    private final void method724(boolean arg0) {
        ++field1954;
        if (!arg0) {
            int[] var2 = this.field1958[1];
            int[] var3 = this.field1958[this.field1958.length - 2];
            int[] var4 = this.field1958[this.field1958.length - 1];
            int[] var5 = this.field1958[0];
            this.field1953 = new int[] { -var2[0] - (-var5[0] - var5[0]), -var2[1] - -var5[1] + var5[1] };
            this.field1952 = new int[] { var3[0] - (var4[0] + -var3[0]), var3[1] + var3[1] + -var4[1] };
        }
    }

    @OriginalMember(owner = "client!ih", name = "a", descriptor = "(II)[I")
    public final int[] method90(int arg0, int arg1) {
        ++field1949;
        if (arg0 != 0) {
            field1960 = null;
        }
        int[] var3 = super.field3825.method681(arg1, (byte) -114);
        if (super.field3825.field1840) {
            int[] var4 = this.method1245(0, arg1, 11433);
            int var5 = this.field1957;
            if (var5 != 2) {
                if (var5 == 1) {
                    for (int var6 = 0; class54.field1430 > var6; ++var6) {
                        int var7 = var4[var6];
                        int var8;
                        for (var8 = 1; this.field1958.length - 1 > var8 && ~this.field1958[var8][0] >= ~var7; ++var8) {
                        }
                        int[] var9 = this.field1958[var8];
                        int[] var10 = this.field1958[var8 + -1];
                        int var11 = (-var10[0] + var7 << 12) / (var9[0] - var10[0]);
                        int var12 = -class30.field773[(8184 & var11) >> 5] + 4096 >> 1;
                        int var13 = -var12 + 4096;
                        var3[var6] = var9[1] * var12 + var10[1] * var13 >> 12;
                    }
                } else {
                    for (int var14 = 0; ~class54.field1430 < ~var14; ++var14) {
                        int var15 = var4[var14];
                        int var16;
                        for (var16 = 1; var16 < this.field1958.length + -1 && ~var15 <= ~this.field1958[var16][0]; ++var16) {
                        }
                        int[] var17 = this.field1958[var16];
                        int[] var18 = this.field1958[var16 + -1];
                        int var19 = (-var18[0] + var15 << 12) / (var17[0] - var18[0]);
                        int var20 = -var19 + 4096;
                        var3[var14] = var18[1] * var20 - -(var17[1] * var19) >> 12;
                    }
                }
            } else {
                for (int var21 = 0; ~class54.field1430 < ~var21; ++var21) {
                    int var22 = var4[var21];
                    int var23;
                    for (var23 = 1; ~var23 > ~(this.field1958.length + -1) && this.field1958[var23][0] <= var22; ++var23) {
                    }
                    int[] var24 = this.field1958[var23 + -1];
                    int[] var25 = this.field1958[var23];
                    int var26 = this.method725((byte) 0, var23 + -2)[1];
                    int var27 = var24[1];
                    int var28 = var25[1];
                    int var29 = this.method725((byte) 0, var23 + 1)[1];
                    int var30 = var29 - var28 + -var26 + var27;
                    int var31 = (-var24[0] + var22 << 12) / (var25[0] - var24[0]);
                    int var33 = var28 - var26;
                    int var34 = var31 * var33 >> 12;
                    int var35 = -var27 + -var30 + var26;
                    int var36 = var31 * var31 >> 12;
                    int var37 = (var30 * var31 >> 12) * var36 >> 12;
                    int var38 = var35 * var36 >> 12;
                    var3[var21] = var34 + var37 + var27 + var38;
                }
            }
        }
        return var3;
    }

    @OriginalMember(owner = "client!ih", name = "c", descriptor = "(Z)V")
    public final void method84(boolean arg0) {
        ++field1944;
        if (this.field1958 == null) {
            this.field1958 = new int[][] { new int[2], { 4096, 4096 } };
        }
        if (this.field1958.length < 2) {
            throw new RuntimeException("Curve operation requires at least two markers");
        } else {
            if (!arg0) {
                this.method725((byte) -32, -76);
            }
            if (this.field1957 == 2) {
                this.method724(false);
            }
            class166.method1123(100);
        }
    }

    @OriginalMember(owner = "client!ih", name = "a", descriptor = "(IBLab;)V")
    public final void method77(int arg0, byte arg1, class3 arg2) {
        ++field1959;
        if (arg1 <= 32) {
            field1950 = null;
        }
        if (~arg0 == -1) {
            this.field1957 = arg2.method64(31790);
            this.field1958 = new int[arg2.method64(31790)][2];
            for (int var4 = 0; ~this.field1958.length < ~var4; ++var4) {
                this.field1958[var4][0] = arg2.method46((byte) 65);
                this.field1958[var4][1] = arg2.method46((byte) 65);
            }
        }
    }

    @OriginalMember(owner = "client!ih", name = "<init>", descriptor = "()V")
    public class81() {
        super(1, true);
    }

    @OriginalMember(owner = "client!ih", name = "b", descriptor = "(BI)[I")
    private final int[] method725(byte arg0, int arg1) {
        ++field1945;
        if (arg1 < 0) {
            return this.field1953;
        } else {
            if (arg0 != 0) {
                field1956 = null;
            }
            return arg1 >= this.field1958.length ? this.field1952 : this.field1958[arg1];
        }
    }

    @OriginalMember(owner = "client!ih", name = "a", descriptor = "(IB[B[Lie;I)V")
    public static final void method726(int arg0, byte arg1, byte[] arg2, class79[] arg3, int arg4) {
        if (arg1 != -45) {
            method727((byte) -18);
        }
        ++field1946;
        class3 var5 = new class3(arg2);
        int var6 = -1;
        while (true) {
            int var7 = var5.method45(-6498);
            if (var7 == 0) {
                return;
            }
            int var8 = 0;
            var6 += var7;
            while (true) {
                int var9 = var5.method45(arg1 + -6453);
                if (~var9 == -1) {
                    break;
                }
                var8 += var9 + -1;
                int var10 = var8 >> 12;
                int var11 = var5.method64(31790);
                int var12 = (var8 & 4084) >> 6;
                int var13 = 63 & var8;
                int var14 = var11 >> 2;
                int var15 = 3 & var11;
                int var16 = arg0 + var12;
                int var17 = arg4 + var13;
                if (var16 > 0 && ~var17 < -1 && var16 < 103 && ~var17 > -104) {
                    int var18 = var10;
                    class79 var19 = null;
                    if (~(class49.field1194[1][var16][var17] & 2) == -3) {
                        var18 = var10 - 1;
                    }
                    if (var18 >= 0) {
                        var19 = arg3[var18];
                    }
                    class189.method1243(var17, var10, 0, var16, var15, var6, var14, var19);
                }
            }
        }
    }

    @OriginalMember(owner = "client!ih", name = "d", descriptor = "(B)V")
    public static void method727(byte arg0) {
        if (arg0 <= 81) {
            field1950 = null;
        }
        field1950 = null;
        field1951 = null;
        field1947 = null;
        field1948 = null;
        field1955 = null;
        field1960 = null;
    }
}
