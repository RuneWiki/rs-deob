import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!oj")
public class class381 extends class297 {

    @OriginalMember(owner = "client!oj", name = "O", descriptor = "I")
    private int field5536 = 0;

    @OriginalMember(owner = "client!oj", name = "S", descriptor = "[S")
    private short[] field5540 = new short[257];

    @OriginalMember(owner = "client!oj", name = "I", descriptor = "I")
    public static int field5530;

    @OriginalMember(owner = "client!oj", name = "J", descriptor = "I")
    public static int field5531;

    @OriginalMember(owner = "client!oj", name = "K", descriptor = "I")
    public static int field5532;

    @OriginalMember(owner = "client!oj", name = "M", descriptor = "I")
    public static int field5534;

    @OriginalMember(owner = "client!oj", name = "P", descriptor = "I")
    public static int field5537;

    @OriginalMember(owner = "client!oj", name = "Q", descriptor = "I")
    public static int field5538;

    @OriginalMember(owner = "client!oj", name = "L", descriptor = "[I")
    private int[] field5533;

    @OriginalMember(owner = "client!oj", name = "R", descriptor = "[I")
    private int[] field5539;

    @OriginalMember(owner = "client!oj", name = "N", descriptor = "[[I")
    private int[][] field5535;

    @OriginalMember(owner = "client!oj", name = "a", descriptor = "(Lcea;II)V")
    public final void method17(class215 arg0, int arg1, int arg2) {
        if (arg1 == 0) {
            this.field5536 = arg0.method1535(arg2 + -30760);
            this.field5535 = new int[arg0.method1535(255)][2];
            for (int var4 = 0; ~this.field5535.length < ~var4; ++var4) {
                this.field5535[var4][0] = arg0.method1478(842397944);
                this.field5535[var4][1] = arg0.method1478(842397944);
            }
        }
        if (arg2 == 31015) {
            ++field5538;
        }
    }

    @OriginalMember(owner = "client!oj", name = "f", descriptor = "(I)V")
    private final void method2407(int arg0) {
        int var2 = this.field5536;
        if (~var2 != -3) {
            if (~var2 == -2) {
                for (int var3 = 0; ~var3 > -258; ++var3) {
                    int var4 = var3 << 4;
                    int var5;
                    for (var5 = 1; ~(this.field5535.length + -1) < ~var5 && this.field5535[var5][0] <= var4; ++var5) {
                    }
                    int[] var6 = this.field5535[var5 + -1];
                    int[] var7 = this.field5535[var5];
                    int var8 = (-var6[0] + var4 << 12) / (var7[0] - var6[0]);
                    int var9 = -class551.field7593[(var8 & 8182) >> 5] + 4096 >> 1;
                    int var10 = -var9 + 4096;
                    int var11 = var6[1] * var10 + var7[1] * var9 >> 12;
                    if (var11 <= -32768) {
                        var11 = -32767;
                    }
                    if (~var11 <= -32769) {
                        var11 = 32767;
                    }
                    this.field5540[var3] = (short) var11;
                }
            } else {
                for (int var12 = 0; var12 < 257; ++var12) {
                    int var13 = var12 << 4;
                    int var14;
                    for (var14 = 1; ~var14 > ~(this.field5535.length + -1) && ~var13 <= ~this.field5535[var14][0]; ++var14) {
                    }
                    int[] var15 = this.field5535[var14 + -1];
                    int[] var16 = this.field5535[var14];
                    int var17 = (-var15[0] + var13 << 12) / (var16[0] + -var15[0]);
                    int var18 = 4096 - var17;
                    int var19 = var15[1] * var18 + var16[1] * var17 >> 12;
                    if (~var19 >= 32767) {
                        var19 = -32767;
                    }
                    if (~var19 <= -32769) {
                        var19 = 32767;
                    }
                    this.field5540[var12] = (short) var19;
                }
            }
        } else {
            for (int var20 = 0; ~var20 > -258; ++var20) {
                int var21 = var20 << 4;
                int var22;
                for (var22 = 1; this.field5535.length + -1 > var22 && this.field5535[var22][0] <= var21; ++var22) {
                }
                int[] var23 = this.field5535[var22 - 1];
                int[] var24 = this.field5535[var22];
                int var25 = this.method2409(var22 + -2, (byte) -120)[1];
                int var26 = var23[1];
                int var27 = var24[1];
                int var28 = this.method2409(var22 + 1, (byte) 81)[1];
                int var29 = (-var23[0] + var21 << 12) / (var24[0] + -var23[0]);
                int var30 = var29 * var29 >> 12;
                int var31 = -var25 + var28 + -var27 + var26;
                int var32 = -var31 + var25 - var26;
                int var33 = -var25 + var27;
                int var35 = (var29 * var31 >> 12) * var30 >> 12;
                int var36 = var30 * var32 >> 12;
                int var37 = var29 * var33 >> 12;
                int var38 = var36 + var37 + var35 + var26;
                if (~var38 >= 32767) {
                    var38 = -32767;
                }
                if (var38 >= 32768) {
                    var38 = 32767;
                }
                this.field5540[var20] = (short) var38;
            }
        }
        if (arg0 != -1) {
            this.field5540 = null;
        }
        ++field5530;
    }

    @OriginalMember(owner = "client!oj", name = "<init>", descriptor = "()V")
    public class381() {
        super(1, true);
    }

    @OriginalMember(owner = "client!oj", name = "c", descriptor = "(II)[I")
    public final int[] method15(int arg0, int arg1) {
        ++field5532;
        int[] var3 = super.field4165.method127(0, arg0);
        if (arg1 != 255) {
            this.field5539 = null;
        }
        if (super.field4165.field266) {
            int[] var4 = this.method1951(arg0, 633706337, 0);
            for (int var5 = 0; var5 < class525.field7275; ++var5) {
                int var6 = var4[var5] >> 4;
                if (var6 < 0) {
                    var6 = 0;
                }
                if (var6 > 256) {
                    var6 = 256;
                }
                var3[var5] = this.field5540[var6];
            }
        }
        return var3;
    }

    @OriginalMember(owner = "client!oj", name = "b", descriptor = "(B)V")
    private final void method2408(byte arg0) {
        ++field5531;
        int[] var2 = this.field5535[0];
        int[] var3 = this.field5535[1];
        int[] var4 = this.field5535[this.field5535.length + -2];
        int[] var5 = this.field5535[this.field5535.length + -1];
        this.field5533 = new int[] { var4[0] - (var5[0] + -var4[0]), var4[1] - (var5[1] + -var4[1]) };
        if (arg0 != 73) {
            this.method15(75, 39);
        }
        this.field5539 = new int[] { var2[0] + -var3[0] + var2[0], var2[1] - (-var2[1] - -var3[1]) };
    }

    @OriginalMember(owner = "client!oj", name = "e", descriptor = "(I)V")
    public final void method711(int arg0) {
        if (this.field5535 == null) {
            this.field5535 = new int[][] { new int[2], { 4096, 4096 } };
        }
        if (arg0 <= 108) {
            this.field5535 = null;
        }
        ++field5534;
        if (this.field5535.length < 2) {
            throw new RuntimeException("Curve operation requires at least two markers");
        } else {
            if (this.field5536 == 2) {
                this.method2408((byte) 73);
            }
            class45.method545(26188);
            this.method2407(-1);
        }
    }

    @OriginalMember(owner = "client!oj", name = "a", descriptor = "(IB)[I")
    private final int[] method2409(int arg0, byte arg1) {
        ++field5537;
        if (arg0 < 0) {
            return this.field5539;
        } else {
            int var3 = -48 % ((arg1 - 13) / 56);
            return ~arg0 <= ~this.field5535.length ? this.field5533 : this.field5535[arg0];
        }
    }
}
