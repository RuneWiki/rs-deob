import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!pf")
public class class21 extends class149 {

    @OriginalMember(owner = "client!pf", name = "N", descriptor = "I")
    private int field326 = 0;

    @OriginalMember(owner = "client!pf", name = "U", descriptor = "[S")
    private short[] field333 = new short[257];

    @OriginalMember(owner = "client!pf", name = "S", descriptor = "I")
    public static int field331 = 0;

    @OriginalMember(owner = "client!pf", name = "I", descriptor = "Lkn;")
    public static class233 field321 = new class233();

    @OriginalMember(owner = "client!pf", name = "V", descriptor = "Lpg;")
    public static class492 field334 = new class492(91, 8);

    @OriginalMember(owner = "client!pf", name = "J", descriptor = "I")
    public static int field322;

    @OriginalMember(owner = "client!pf", name = "K", descriptor = "I")
    public static int field323;

    @OriginalMember(owner = "client!pf", name = "L", descriptor = "I")
    public static int field324;

    @OriginalMember(owner = "client!pf", name = "P", descriptor = "I")
    public static int field328;

    @OriginalMember(owner = "client!pf", name = "Q", descriptor = "I")
    public static int field329;

    @OriginalMember(owner = "client!pf", name = "R", descriptor = "I")
    public static int field330;

    @OriginalMember(owner = "client!pf", name = "X", descriptor = "I")
    public static int field336;

    @OriginalMember(owner = "client!pf", name = "W", descriptor = "Lns;")
    public static class438 field335;

    @OriginalMember(owner = "client!pf", name = "M", descriptor = "[I")
    private int[] field325;

    @OriginalMember(owner = "client!pf", name = "T", descriptor = "[I")
    private int[] field332;

    @OriginalMember(owner = "client!pf", name = "O", descriptor = "[[I")
    private int[][] field327;

    @OriginalMember(owner = "client!pf", name = "e", descriptor = "(I)V")
    public static void method165(int arg0) {
        if (arg0 == -2069709524) {
            field321 = null;
            field335 = null;
            field334 = null;
        }
    }

    @OriginalMember(owner = "client!pf", name = "a", descriptor = "(IBLtl;)V")
    public final void method93(int arg0, byte arg1, class91 arg2) {
        ++field322;
        if (arg1 != 35) {
            field335 = null;
        }
        if (~arg0 == -1) {
            this.field326 = arg2.method618((byte) 100);
            this.field327 = new int[arg2.method618((byte) 100)][2];
            for (int var4 = 0; var4 < this.field327.length; ++var4) {
                this.field327[var4][0] = arg2.method631(10494);
                this.field327[var4][1] = arg2.method631(10494);
            }
        }
    }

    @OriginalMember(owner = "client!pf", name = "d", descriptor = "(B)V")
    private final void method166(byte arg0) {
        ++field330;
        int[] var2 = this.field327[0];
        int[] var3 = this.field327[1];
        if (arg0 != -71) {
            this.method166((byte) -107);
        }
        int[] var4 = this.field327[this.field327.length - 2];
        int[] var5 = this.field327[this.field327.length + -1];
        this.field325 = new int[] { var4[0] + var4[0] + -var5[0], var4[1] - var5[1] + var4[1] };
        this.field332 = new int[] { var2[0] + -var3[0] + var2[0], var2[1] - (var3[1] + -var2[1]) };
    }

    @OriginalMember(owner = "client!pf", name = "<init>", descriptor = "()V")
    public class21() {
        super(1, true);
    }

    @OriginalMember(owner = "client!pf", name = "a", descriptor = "(II)[I")
    public final int[] method92(int arg0, int arg1) {
        ++field328;
        if (arg0 != -10835) {
            field334 = null;
        }
        int[] var3 = super.field2152.method2891(arg1, (byte) 90);
        if (super.field2152.field7051) {
            int[] var4 = this.method983(0, 24824, arg1);
            for (int var5 = 0; var5 < class316.field4838; ++var5) {
                int var6 = var4[var5] >> 4;
                if (var6 < 0) {
                    var6 = 0;
                }
                if (var6 > 256) {
                    var6 = 256;
                }
                var3[var5] = this.field333[var6];
            }
        }
        return var3;
    }

    @OriginalMember(owner = "client!pf", name = "d", descriptor = "(I)V")
    public final void method99(int arg0) {
        if (this.field327 == null) {
            this.field327 = new int[][] { new int[2], { 4096, 4096 } };
        }
        ++field324;
        if (~this.field327.length > -3) {
            throw new RuntimeException("Curve operation requires at least two markers");
        } else {
            if (arg0 > -86) {
                field336 = -45;
            }
            if (~this.field326 == -3) {
                this.method166((byte) -71);
            }
            class117.method761(0);
            this.method167(false);
        }
    }

    @OriginalMember(owner = "client!pf", name = "a", descriptor = "(Z)V")
    private final void method167(boolean arg0) {
        ++field323;
        int var2 = this.field326;
        if (~var2 != -3) {
            if (var2 == 1) {
                for (int var3 = 0; var3 < 257; ++var3) {
                    int var4 = var3 << 4;
                    int var5;
                    for (var5 = 1; ~var5 > ~(this.field327.length + -1) && ~var4 <= ~this.field327[var5][0]; ++var5) {
                    }
                    int[] var6 = this.field327[var5 + -1];
                    int[] var7 = this.field327[var5];
                    int var8 = (var4 - var6[0] << 12) / (var7[0] + -var6[0]);
                    int var9 = -class253.field3510[var8 >> 5 & 255] + 4096 >> 1;
                    int var10 = 4096 - var9;
                    int var11 = var6[1] * var10 - -(var7[1] * var9) >> 12;
                    if (~var11 >= 32767) {
                        var11 = -32767;
                    }
                    if (~var11 <= -32769) {
                        var11 = 32767;
                    }
                    this.field333[var3] = (short) var11;
                }
            } else {
                for (int var12 = 0; ~var12 > -258; ++var12) {
                    int var13 = var12 << 4;
                    int var14;
                    for (var14 = 1; this.field327.length + -1 > var14 && var13 >= this.field327[var14][0]; ++var14) {
                    }
                    int[] var15 = this.field327[var14 + -1];
                    int[] var16 = this.field327[var14];
                    int var17 = (-var15[0] + var13 << 12) / (var16[0] + -var15[0]);
                    int var18 = -var17 + 4096;
                    int var19 = var15[1] * var18 - -(var16[1] * var17) >> 12;
                    if (~var19 >= 32767) {
                        var19 = -32767;
                    }
                    if (~var19 <= -32769) {
                        var19 = 32767;
                    }
                    this.field333[var12] = (short) var19;
                }
            }
        } else {
            for (int var20 = 0; ~var20 > -258; ++var20) {
                int var21 = var20 << 4;
                int var22;
                for (var22 = 1; ~var22 > ~(this.field327.length - 1) && this.field327[var22][0] <= var21; ++var22) {
                }
                int[] var23 = this.field327[var22 + -1];
                int[] var24 = this.field327[var22];
                int var25 = this.method168(var22 + -2, (byte) 91)[1];
                int var26 = var23[1];
                int var27 = var24[1];
                int var28 = this.method168(var22 + 1, (byte) 101)[1];
                int var29 = (-var23[0] + var21 << 12) / (var24[0] - var23[0]);
                int var30 = var29 * var29 >> 12;
                int var31 = -var25 + var28 - (-var26 + var27);
                int var32 = -var26 + var25 - var31;
                int var33 = -var25 + var27;
                int var35 = (var29 * var31 >> 12) * var30 >> 12;
                int var36 = var30 * var32 >> 12;
                int var37 = var29 * var33 >> 12;
                int var38 = var26 + var36 + var35 + var37;
                if (var38 <= -32768) {
                    var38 = -32767;
                }
                if (~var38 <= -32769) {
                    var38 = 32767;
                }
                this.field333[var20] = (short) var38;
            }
        }
        if (arg0) {
            this.field332 = null;
        }
    }

    @OriginalMember(owner = "client!pf", name = "a", descriptor = "(IB)[I")
    private final int[] method168(int arg0, byte arg1) {
        ++field329;
        if (arg1 <= 70) {
            this.field326 = 101;
        }
        if (arg0 < 0) {
            return this.field332;
        } else {
            return ~arg0 <= ~this.field327.length ? this.field325 : this.field327[arg0];
        }
    }
}
