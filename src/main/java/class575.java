import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!gt")
public class class575 extends class747 {

    @OriginalMember(owner = "client!gt", name = "H", descriptor = "[S")
    private short[] field7918 = new short[257];

    @OriginalMember(owner = "client!gt", name = "J", descriptor = "I")
    private int field7920 = 0;

    @OriginalMember(owner = "client!gt", name = "F", descriptor = "I")
    public static int field7916;

    @OriginalMember(owner = "client!gt", name = "G", descriptor = "I")
    public static int field7917;

    @OriginalMember(owner = "client!gt", name = "I", descriptor = "I")
    public static int field7919;

    @OriginalMember(owner = "client!gt", name = "K", descriptor = "I")
    public static int field7921;

    @OriginalMember(owner = "client!gt", name = "N", descriptor = "I")
    public static int field7924;

    @OriginalMember(owner = "client!gt", name = "O", descriptor = "I")
    public static int field7925;

    @OriginalMember(owner = "client!gt", name = "E", descriptor = "[I")
    private int[] field7915;

    @OriginalMember(owner = "client!gt", name = "M", descriptor = "[I")
    private int[] field7923;

    @OriginalMember(owner = "client!gt", name = "L", descriptor = "[[I")
    private int[][] field7922;

    @OriginalMember(owner = "client!gt", name = "a", descriptor = "(II)[I")
    public final int[] method182(int arg0, int arg1) {
        ++field7916;
        if (arg1 > -89) {
            this.method3362((byte) -123, 74);
        }
        int[] var3 = super.field10279.method3479(true, arg0);
        if (super.field10279.field8263) {
            int[] var4 = this.method4156(7, arg0, 0);
            for (int var5 = 0; ~class73.field1095 < ~var5; ++var5) {
                int var6 = var4[var5] >> 4;
                if (~var6 > -1) {
                    var6 = 0;
                }
                if (~var6 < -257) {
                    var6 = 256;
                }
                var3[var5] = this.field7918[var6];
            }
        }
        return var3;
    }

    @OriginalMember(owner = "client!gt", name = "a", descriptor = "(BI)[I")
    private final int[] method3362(byte arg0, int arg1) {
        ++field7924;
        if (~arg1 > -1) {
            return this.field7915;
        } else {
            int var3 = -17 / ((30 - arg0) / 37);
            return ~arg1 <= ~this.field7922.length ? this.field7923 : this.field7922[arg1];
        }
    }

    @OriginalMember(owner = "client!gt", name = "c", descriptor = "(I)V")
    private final void method3363(int arg0) {
        if (arg0 != 1) {
            this.method184(14);
        }
        int var2 = this.field7920;
        if (var2 != 2) {
            if (~var2 == -2) {
                for (int var3 = 0; var3 < 257; ++var3) {
                    int var4 = var3 << 4;
                    int var5;
                    for (var5 = 1; this.field7922.length + -1 > var5 && ~this.field7922[var5][0] >= ~var4; ++var5) {
                    }
                    int[] var6 = this.field7922[var5 + -1];
                    int[] var7 = this.field7922[var5];
                    int var8 = (-var6[0] + var4 << 12) / (var7[0] - var6[0]);
                    int var9 = 4096 - class639.field8569[var8 >> 5 & 255] >> 1;
                    int var10 = -var9 + 4096;
                    int var11 = var6[1] * var10 - -(var7[1] * var9) >> 12;
                    if (var11 <= -32768) {
                        var11 = -32767;
                    }
                    if (var11 >= 32768) {
                        var11 = 32767;
                    }
                    this.field7918[var3] = (short) var11;
                }
            } else {
                for (int var12 = 0; ~var12 > -258; ++var12) {
                    int var13 = var12 << 4;
                    int var14;
                    for (var14 = 1; this.field7922.length + -1 > var14 && var13 >= this.field7922[var14][0]; ++var14) {
                    }
                    int[] var15 = this.field7922[var14 - 1];
                    int[] var16 = this.field7922[var14];
                    int var17 = (var13 - var15[0] << 12) / (var16[0] - var15[0]);
                    int var18 = -var17 + 4096;
                    int var19 = var15[1] * var18 + var16[1] * var17 >> 12;
                    if (var19 <= -32768) {
                        var19 = -32767;
                    }
                    if (~var19 <= -32769) {
                        var19 = 32767;
                    }
                    this.field7918[var12] = (short) var19;
                }
            }
        } else {
            for (int var20 = 0; var20 < 257; ++var20) {
                int var21 = var20 << 4;
                int var22;
                for (var22 = 1; this.field7922.length - 1 > var22 && var21 >= this.field7922[var22][0]; ++var22) {
                }
                int[] var23 = this.field7922[var22 - 1];
                int[] var24 = this.field7922[var22];
                int var25 = this.method3362((byte) 97, var22 + -2)[1];
                int var26 = var23[1];
                int var27 = var24[1];
                int var28 = this.method3362((byte) 110, var22 + 1)[1];
                int var29 = (-var23[0] + var21 << 12) / (var24[0] + -var23[0]);
                int var30 = var29 * var29 >> 12;
                int var31 = -var27 + var26 + var28 + -var25;
                int var32 = var25 - var31 + -var26;
                int var33 = -var25 + var27;
                int var35 = (var29 * var31 >> 12) * var30 >> 12;
                int var36 = var30 * var32 >> 12;
                int var37 = var29 * var33 >> 12;
                int var38 = var35 - -var36 - -var26 + var37;
                if (~var38 >= 32767) {
                    var38 = -32767;
                }
                if (var38 >= 32768) {
                    var38 = 32767;
                }
                this.field7918[var20] = (short) var38;
            }
        }
        ++field7919;
    }

    @OriginalMember(owner = "client!gt", name = "b", descriptor = "(I)V")
    public final void method184(int arg0) {
        if (this.field7922 == null) {
            this.field7922 = new int[][] { new int[2], { 4096, 4096 } };
        }
        ++field7921;
        if (~this.field7922.length > -3) {
            throw new RuntimeException("Curve operation requires at least two markers");
        } else {
            if (this.field7920 == 2) {
                this.method3364(arg0 + 1);
            }
            class654.method3655(arg0 + 79);
            if (arg0 != -2) {
                this.field7918 = null;
            }
            this.method3363(1);
        }
    }

    @OriginalMember(owner = "client!gt", name = "d", descriptor = "(I)V")
    private final void method3364(int arg0) {
        ++field7925;
        int[] var2 = this.field7922[0];
        int[] var3 = this.field7922[1];
        int[] var4 = this.field7922[this.field7922.length + -2];
        int[] var5 = this.field7922[this.field7922.length + arg0];
        this.field7923 = new int[] { var4[0] - var5[0] + var4[0], var4[1] - (var5[1] - var4[1]) };
        this.field7915 = new int[] { var2[0] + -var3[0] + var2[0], var2[1] - var3[1] - -var2[1] };
    }

    @OriginalMember(owner = "client!gt", name = "a", descriptor = "(Ldc;II)V")
    public final void method183(class63 arg0, int arg1, int arg2) {
        ++field7917;
        if (arg1 == 11608) {
            if (arg2 == 0) {
                this.field7920 = arg0.method505((byte) -119);
                this.field7922 = new int[arg0.method505((byte) -119)][2];
                for (int var4 = 0; ~var4 > ~this.field7922.length; ++var4) {
                    this.field7922[var4][0] = arg0.method482(-772591672);
                    this.field7922[var4][1] = arg0.method482(-772591672);
                }
            }
        }
    }

    @OriginalMember(owner = "client!gt", name = "<init>", descriptor = "()V")
    public class575() {
        super(1, true);
    }
}
