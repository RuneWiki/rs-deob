import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ib")
public class class135 extends class145 {

    @OriginalMember(owner = "client!ib", name = "G", descriptor = "[S")
    private short[] field1679 = new short[257];

    @OriginalMember(owner = "client!ib", name = "S", descriptor = "I")
    private int field1691 = 0;

    @OriginalMember(owner = "client!ib", name = "P", descriptor = "[Z")
    public static boolean[] field1688 = new boolean[100];

    @OriginalMember(owner = "client!ib", name = "R", descriptor = "Lhb;")
    public static class629 field1690 = new class629(7, 19);

    @OriginalMember(owner = "client!ib", name = "E", descriptor = "I")
    public static int field1678;

    @OriginalMember(owner = "client!ib", name = "H", descriptor = "I")
    public static int field1680;

    @OriginalMember(owner = "client!ib", name = "J", descriptor = "I")
    public static int field1682;

    @OriginalMember(owner = "client!ib", name = "K", descriptor = "I")
    public static int field1683;

    @OriginalMember(owner = "client!ib", name = "N", descriptor = "I")
    public static int field1686;

    @OriginalMember(owner = "client!ib", name = "O", descriptor = "I")
    public static int field1687;

    @OriginalMember(owner = "client!ib", name = "Q", descriptor = "I")
    public static int field1689;

    @OriginalMember(owner = "client!ib", name = "I", descriptor = "[I")
    private int[] field1681;

    @OriginalMember(owner = "client!ib", name = "L", descriptor = "[I")
    private int[] field1684;

    @OriginalMember(owner = "client!ib", name = "M", descriptor = "[[I")
    private int[][] field1685;

    @OriginalMember(owner = "client!ib", name = "a", descriptor = "(II)[I", line = 4)
    private final int[] method824(int arg0, int arg1) {
        if (arg0 > -102) {
            return null;
        } else {
            ++field1683;
            if (~arg1 > -1) {
                return this.field1681;
            } else {
                return ~this.field1685.length >= ~arg1 ? this.field1684 : this.field1685[arg1];
            }
        }
    }

    @OriginalMember(owner = "client!ib", name = "i", descriptor = "(I)V", line = 24)
    private final void method825(int arg0) {
        int var2 = 80 / ((11 - arg0) / 45);
        ++field1682;
        int[] var3 = this.field1685[0];
        int[] var4 = this.field1685[1];
        int[] var5 = this.field1685[this.field1685.length + -2];
        int[] var6 = this.field1685[this.field1685.length + -1];
        this.field1684 = new int[] { var5[0] - -var5[0] - var6[0], var5[1] - var6[1] + var5[1] };
        this.field1681 = new int[] { -var4[0] - (-var3[0] - var3[0]), var3[1] + -var4[1] + var3[1] };
    }

    @OriginalMember(owner = "client!ib", name = "j", descriptor = "(I)V", line = 47)
    public static void method826(int arg0) {
        field1688 = null;
        field1690 = null;
        if (arg0 != -14897) {
            method826(26);
        }
    }

    @OriginalMember(owner = "client!ib", name = "a", descriptor = "(ZI)[I", line = 60)
    public final int[] method27(boolean arg0, int arg1) {
        ++field1689;
        int[] var3 = super.field1779.method2069(-2, arg1);
        if (super.field1779.field4602) {
            int[] var4 = this.method865(0, arg1, (byte) -109);
            for (int var5 = 0; ~class647.field9368 < ~var5; ++var5) {
                int var6 = var4[var5] >> 4;
                if (~var6 > -1) {
                    var6 = 0;
                }
                if (var6 > 256) {
                    var6 = 256;
                }
                var3[var5] = this.field1679[var6];
            }
        }
        if (arg0) {
            this.field1691 = -87;
        }
        return var3;
    }

    @OriginalMember(owner = "client!ib", name = "a", descriptor = "(IILrt;)V", line = 103)
    public final void method28(int arg0, int arg1, class194 arg2) {
        ++field1680;
        if (arg1 >= -67) {
            field1690 = null;
        }
        if (~arg0 == -1) {
            this.field1691 = arg2.method1177(255);
            this.field1685 = new int[arg2.method1177(255)][2];
            for (int var4 = 0; var4 < this.field1685.length; ++var4) {
                this.field1685[var4][0] = arg2.method1220(123);
                this.field1685[var4][1] = arg2.method1220(122);
            }
        }
    }

    @OriginalMember(owner = "client!ib", name = "<init>", descriptor = "()V", line = 129)
    public class135() {
        super(1, true);
    }

    @OriginalMember(owner = "client!ib", name = "f", descriptor = "(I)V", line = 135)
    public final void method145(int arg0) {
        int var2 = -74 / ((arg0 - -46) / 45);
        if (this.field1685 == null) {
            this.field1685 = new int[][] { new int[2], { 4096, 4096 } };
        }
        ++field1678;
        if (this.field1685.length < 2) {
            throw new RuntimeException("Curve operation requires at least two markers");
        } else {
            if (this.field1691 == 2) {
                this.method825(-121);
            }
            class315.method2072((byte) -12);
            this.method827(-476);
        }
    }

    @OriginalMember(owner = "client!ib", name = "k", descriptor = "(I)V", line = 156)
    private final void method827(int arg0) {
        if (arg0 == -476) {
            int var2 = this.field1691;
            if (~var2 != -3) {
                if (var2 == 1) {
                    for (int var3 = 0; var3 < 257; ++var3) {
                        int var4 = var3 << 4;
                        int var5;
                        for (var5 = 1; ~var5 > ~(this.field1685.length - 1) && ~var4 <= ~this.field1685[var5][0]; ++var5) {
                        }
                        int[] var6 = this.field1685[var5 + -1];
                        int[] var7 = this.field1685[var5];
                        int var8 = (-var6[0] + var4 << 12) / (var7[0] - var6[0]);
                        int var9 = 4096 - class215.field2959[(8183 & var8) >> 5] >> 1;
                        int var10 = 4096 - var9;
                        int var11 = var6[1] * var10 + var7[1] * var9 >> 12;
                        if (var11 <= -32768) {
                            var11 = -32767;
                        }
                        if (var11 >= 32768) {
                            var11 = 32767;
                        }
                        this.field1679[var3] = (short) var11;
                    }
                } else {
                    for (int var12 = 0; var12 < 257; ++var12) {
                        int var13 = var12 << 4;
                        int var14;
                        for (var14 = 1; ~var14 > ~(this.field1685.length + -1) && ~var13 <= ~this.field1685[var14][0]; ++var14) {
                        }
                        int[] var15 = this.field1685[var14 + -1];
                        int[] var16 = this.field1685[var14];
                        int var17 = (-var15[0] + var13 << 12) / (var16[0] + -var15[0]);
                        int var18 = -var17 + 4096;
                        int var19 = var15[1] * var18 + var16[1] * var17 >> 12;
                        if (~var19 >= 32767) {
                            var19 = -32767;
                        }
                        if (var19 >= 32768) {
                            var19 = 32767;
                        }
                        this.field1679[var12] = (short) var19;
                    }
                }
            } else {
                for (int var20 = 0; var20 < 257; ++var20) {
                    int var21 = var20 << 4;
                    int var22;
                    for (var22 = 1; this.field1685.length + -1 > var22 && var21 >= this.field1685[var22][0]; ++var22) {
                    }
                    int[] var23 = this.field1685[var22 - 1];
                    int[] var24 = this.field1685[var22];
                    int var25 = this.method824(-103, var22 + -2)[1];
                    int var26 = var23[1];
                    int var27 = var24[1];
                    int var28 = this.method824(-122, var22 - -1)[1];
                    int var29 = (-var23[0] + var21 << 12) / (var24[0] - var23[0]);
                    int var30 = var29 * var29 >> 12;
                    int var31 = -var25 + var28 + -var27 + var26;
                    int var32 = var25 - var26 + -var31;
                    int var33 = -var25 + var27;
                    int var35 = (var29 * var31 >> 12) * var30 >> 12;
                    int var36 = var30 * var32 >> 12;
                    int var37 = var29 * var33 >> 12;
                    int var38 = var35 + var36 + var26 + var37;
                    if (var38 <= -32768) {
                        var38 = -32767;
                    }
                    if (~var38 <= -32769) {
                        var38 = 32767;
                    }
                    this.field1679[var20] = (short) var38;
                }
            }
            ++field1687;
        }
    }
}
