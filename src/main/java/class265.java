import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!fu")
public class class265 extends class354 {

    @OriginalMember(owner = "client!fu", name = "I", descriptor = "I")
    private int field3821 = 0;

    @OriginalMember(owner = "client!fu", name = "S", descriptor = "[S")
    private short[] field3831 = new short[257];

    @OriginalMember(owner = "client!fu", name = "R", descriptor = "[I")
    public static int[] field3830 = new int[32];

    @OriginalMember(owner = "client!fu", name = "J", descriptor = "I")
    public static int field3822;

    @OriginalMember(owner = "client!fu", name = "K", descriptor = "I")
    public static int field3823;

    @OriginalMember(owner = "client!fu", name = "L", descriptor = "I")
    public static int field3824;

    @OriginalMember(owner = "client!fu", name = "M", descriptor = "I")
    public static int field3825;

    @OriginalMember(owner = "client!fu", name = "P", descriptor = "I")
    public static int field3828;

    @OriginalMember(owner = "client!fu", name = "Q", descriptor = "I")
    public static int field3829;

    @OriginalMember(owner = "client!fu", name = "T", descriptor = "I")
    public static int field3832;

    @OriginalMember(owner = "client!fu", name = "V", descriptor = "I")
    public static int field3834;

    @OriginalMember(owner = "client!fu", name = "W", descriptor = "I")
    public static int field3835;

    @OriginalMember(owner = "client!fu", name = "H", descriptor = "[I")
    private int[] field3820;

    @OriginalMember(owner = "client!fu", name = "N", descriptor = "[I")
    private int[] field3826;

    @OriginalMember(owner = "client!fu", name = "O", descriptor = "[I")
    public static int[] field3827;

    @OriginalMember(owner = "client!fu", name = "U", descriptor = "[[I")
    private int[][] field3833;

    @OriginalMember(owner = "client!fu", name = "a", descriptor = "(ILti;I)V", line = 9)
    public final void method206(int arg0, class303 arg1, int arg2) {
        if (arg2 == 0) {
            this.field3821 = arg1.method1918((byte) -57);
            this.field3833 = new int[arg1.method1918((byte) -111)][2];
            for (int var4 = 0; ~this.field3833.length < ~var4; ++var4) {
                this.field3833[var4][0] = arg1.method1868(arg0 + -15180);
                this.field3833[var4][1] = arg1.method1868(0);
            }
        }
        ++field3828;
        if (arg0 != 15180) {
            this.field3831 = null;
        }
    }

    @OriginalMember(owner = "client!fu", name = "e", descriptor = "(I)V", line = 36)
    private final void method1695(int arg0) {
        ++field3834;
        if (arg0 != -32768) {
            method1700(-55, 55L);
        }
        int var2 = this.field3821;
        if (var2 != 2) {
            if (var2 == 1) {
                for (int var3 = 0; var3 < 257; ++var3) {
                    int var4 = var3 << 4;
                    int var5;
                    for (var5 = 1; ~(this.field3833.length + -1) < ~var5 && this.field3833[var5][0] <= var4; ++var5) {
                    }
                    int[] var6 = this.field3833[var5 + -1];
                    int[] var7 = this.field3833[var5];
                    int var8 = (var4 - var6[0] << 12) / (var7[0] + -var6[0]);
                    int var9 = -class461.field6801[var8 >> 5 & 255] + 4096 >> 1;
                    int var10 = -var9 + 4096;
                    int var11 = var6[1] * var10 + var7[1] * var9 >> 12;
                    if (var11 <= -32768) {
                        var11 = -32767;
                    }
                    if (~var11 <= -32769) {
                        var11 = 32767;
                    }
                    this.field3831[var3] = (short) var11;
                }
            } else {
                for (int var12 = 0; var12 < 257; ++var12) {
                    int var13 = var12 << 4;
                    int var14;
                    for (var14 = 1; ~(this.field3833.length + -1) < ~var14 && ~this.field3833[var14][0] >= ~var13; ++var14) {
                    }
                    int[] var15 = this.field3833[var14 + -1];
                    int[] var16 = this.field3833[var14];
                    int var17 = (var13 - var15[0] << 12) / (var16[0] + -var15[0]);
                    int var18 = -var17 + 4096;
                    int var19 = var15[1] * var18 + var16[1] * var17 >> 12;
                    if (var19 <= -32768) {
                        var19 = -32767;
                    }
                    if (var19 >= 32768) {
                        var19 = 32767;
                    }
                    this.field3831[var12] = (short) var19;
                }
            }
        } else {
            for (int var20 = 0; var20 < 257; ++var20) {
                int var21 = var20 << 4;
                int var22;
                for (var22 = 1; ~var22 > ~(this.field3833.length + -1) && ~var21 <= ~this.field3833[var22][0]; ++var22) {
                }
                int[] var23 = this.field3833[var22 + -1];
                int[] var24 = this.field3833[var22];
                int var25 = this.method1699(true, var22 + -2)[1];
                int var26 = var23[1];
                int var27 = var24[1];
                int var28 = this.method1699(true, var22 + 1)[1];
                int var29 = (-var23[0] + var21 << 12) / (var24[0] + -var23[0]);
                int var30 = var29 * var29 >> 12;
                int var31 = -var25 - -var26 + -var27 + var28;
                int var32 = -var31 + var25 - var26;
                int var33 = -var25 + var27;
                int var35 = (var29 * var31 >> 12) * var30 >> 12;
                int var36 = var30 * var32 >> 12;
                int var37 = var29 * var33 >> 12;
                int var38 = var26 + var37 + var36 + var35;
                if (var38 <= -32768) {
                    var38 = -32767;
                }
                if (var38 >= 32768) {
                    var38 = 32767;
                }
                this.field3831[var20] = (short) var38;
            }
        }
    }

    @OriginalMember(owner = "client!fu", name = "f", descriptor = "(I)V", line = 215)
    public static void method1696(int arg0) {
        field3830 = null;
        field3827 = null;
        if (arg0 < 105) {
            method1700(83, 115L);
        }
    }

    @OriginalMember(owner = "client!fu", name = "b", descriptor = "(IB)V", line = 227)
    public static final void method1697(int arg0, byte arg1) {
        if (arg1 == -124) {
            ++field3825;
            class434 var2 = class483.method2888(arg0, -108, 8);
            var2.method2628(113);
        }
    }

    @OriginalMember(owner = "client!fu", name = "d", descriptor = "(Z)V", line = 240)
    private final void method1698(boolean arg0) {
        ++field3832;
        int[] var2 = this.field3833[0];
        int[] var3 = this.field3833[1];
        if (arg0) {
            int[] var4 = this.field3833[this.field3833.length + -2];
            int[] var5 = this.field3833[this.field3833.length + -1];
            this.field3820 = new int[] { var4[0] + -var5[0] + var4[0], var4[1] - -var4[1] - var5[1] };
            this.field3826 = new int[] { var2[0] + -var3[0] + var2[0], var2[1] - (-var2[1] - -var3[1]) };
        }
    }

    @OriginalMember(owner = "client!fu", name = "<init>", descriptor = "()V", line = 264)
    public class265() {
        super(1, true);
    }

    @OriginalMember(owner = "client!fu", name = "a", descriptor = "(IB)[I", line = 270)
    public final int[] method253(int arg0, byte arg1) {
        ++field3823;
        int[] var3 = super.field5357.method861(true, arg0);
        if (arg1 != -95) {
            this.method206(111, (class303) null, 91);
        }
        if (super.field5357.field1869) {
            int[] var4 = this.method2293(0, arg0, (byte) 69);
            for (int var5 = 0; var5 < class404.field5952; ++var5) {
                int var6 = var4[var5] >> 4;
                if (~var6 > -1) {
                    var6 = 0;
                }
                if (var6 > 256) {
                    var6 = 256;
                }
                var3[var5] = this.field3831[var6];
            }
        }
        return var3;
    }

    @OriginalMember(owner = "client!fu", name = "b", descriptor = "(ZI)[I", line = 317)
    private final int[] method1699(boolean arg0, int arg1) {
        if (!arg0) {
            return null;
        } else {
            ++field3835;
            if (~arg1 > -1) {
                return this.field3826;
            } else {
                return ~arg1 <= ~this.field3833.length ? this.field3820 : this.field3833[arg1];
            }
        }
    }

    @OriginalMember(owner = "client!fu", name = "a", descriptor = "(Z)V", line = 340)
    public final void method771(boolean arg0) {
        if (this.field3833 == null) {
            this.field3833 = new int[][] { new int[2], { 4096, 4096 } };
        }
        ++field3822;
        if (~this.field3833.length > -3) {
            throw new RuntimeException("Curve operation requires at least two markers");
        } else {
            if (~this.field3821 == -3) {
                this.method1698(true);
            }
            class291.method1807(arg0);
            this.method1695(-32768);
        }
    }

    @OriginalMember(owner = "client!fu", name = "a", descriptor = "(IJ)V", line = 360)
    public static final void method1700(int arg0, long arg1) {
        ++field3824;
        int var3 = class117.field1850;
        if (arg0 != 31074) {
            field3829 = -128;
        }
        int var4 = class380.field5663;
        if (class510.field7532 != var3) {
            int var5 = -class510.field7532 + var3;
            int var6 = (int) ((long) var5 * arg1 / 320L);
            if (var5 > 0) {
                if (~var6 != -1) {
                    if (var6 > var5) {
                        var6 = var5;
                    }
                } else {
                    var6 = 1;
                }
            } else if (var6 == 0) {
                var6 = -1;
            } else if (~var5 < ~var6) {
                var6 = var5;
            }
            class510.field7532 += var6;
        }
        if (class87.field1460 != var4) {
            int var7 = -class87.field1460 + var4;
            int var8 = (int) ((long) var7 * arg1 / 320L);
            if (~var7 < -1) {
                if (~var8 != -1) {
                    if (var8 > var7) {
                        var8 = var7;
                    }
                } else {
                    var8 = 1;
                }
            } else if (~var8 != -1) {
                if (~var7 < ~var8) {
                    var8 = var7;
                }
            } else {
                var8 = -1;
            }
            class87.field1460 += var8;
        }
        if (!class397.field5830.field150) {
            class382.field5684 += (float) arg1 * class434.field6315 / 40.0F * 8.0F;
            class66.field1161 += (float) arg1 * class278.field4008 / 40.0F * 8.0F;
        }
        class111.method822(4);
    }
}
