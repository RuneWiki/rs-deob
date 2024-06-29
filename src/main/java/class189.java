import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!aj")
public class class189 extends class135 {

    @OriginalMember(owner = "client!aj", name = "W", descriptor = "I")
    private int field3300 = 0;

    @OriginalMember(owner = "client!aj", name = "hb", descriptor = "[S")
    private short[] field3311 = new short[257];

    @OriginalMember(owner = "client!aj", name = "V", descriptor = "Ldf;")
    public static class231 field3299 = new class231(512);

    @OriginalMember(owner = "client!aj", name = "fb", descriptor = "I")
    public static int field3309 = 0;

    @OriginalMember(owner = "client!aj", name = "lb", descriptor = "I")
    public static int field3315 = 127;

    @OriginalMember(owner = "client!aj", name = "Z", descriptor = "I")
    public static int field3303;

    @OriginalMember(owner = "client!aj", name = "ab", descriptor = "I")
    public static int field3304;

    @OriginalMember(owner = "client!aj", name = "bb", descriptor = "I")
    public static int field3305;

    @OriginalMember(owner = "client!aj", name = "cb", descriptor = "I")
    public static int field3306;

    @OriginalMember(owner = "client!aj", name = "eb", descriptor = "I")
    public static int field3308;

    @OriginalMember(owner = "client!aj", name = "gb", descriptor = "I")
    public static int field3310;

    @OriginalMember(owner = "client!aj", name = "ib", descriptor = "I")
    public static int field3312;

    @OriginalMember(owner = "client!aj", name = "jb", descriptor = "I")
    public static int field3313;

    @OriginalMember(owner = "client!aj", name = "kb", descriptor = "I")
    public static int field3314;

    @OriginalMember(owner = "client!aj", name = "X", descriptor = "[I")
    private int[] field3301;

    @OriginalMember(owner = "client!aj", name = "db", descriptor = "[I")
    private int[] field3307;

    @OriginalMember(owner = "client!aj", name = "Y", descriptor = "[[I")
    private int[][] field3302;

    @OriginalMember(owner = "client!aj", name = "a", descriptor = "(Lp;II)V")
    public final void method97(class56 arg0, int arg1, int arg2) {
        ++field3308;
        if (arg1 == 0) {
            this.field3300 = arg0.method367(1);
            this.field3302 = new int[arg0.method367(1)][2];
            for (int var4 = 0; this.field3302.length > var4; ++var4) {
                this.field3302[var4][0] = arg0.method318(true);
                this.field3302[var4][1] = arg0.method318(true);
            }
        }
        if (arg2 != -16231) {
            field3309 = 27;
        }
    }

    @OriginalMember(owner = "client!aj", name = "a", descriptor = "(IIBI)I")
    public static final int method1231(int arg0, int arg1, byte arg2, int arg3) {
        ++field3303;
        if (arg2 >= -74) {
            field3315 = 105;
        }
        if (~arg0 >= -244) {
            if (~arg0 >= -218) {
                if (arg0 > 192) {
                    arg1 >>= 2;
                } else if (~arg0 < -180) {
                    arg1 >>= 1;
                }
            } else {
                arg1 >>= 3;
            }
        } else {
            arg1 >>= 4;
        }
        return (arg0 >> 1) + (arg1 >> 5 << 7) + (arg3 >> 2 << 10);
    }

    @OriginalMember(owner = "client!aj", name = "d", descriptor = "(B)V")
    public final void method102(byte arg0) {
        if (this.field3302 == null) {
            this.field3302 = new int[][] { new int[2], { 4096, 4096 } };
        }
        ++field3314;
        if (~this.field3302.length > -3) {
            throw new RuntimeException("Curve operation requires at least two markers");
        } else {
            if (arg0 != -85) {
                this.method97((class56) null, 125, 107);
            }
            if (this.field3300 == 2) {
                this.method1236(-114);
            }
            class87.method546((byte) 90);
            this.method1233(78);
        }
    }

    @OriginalMember(owner = "client!aj", name = "a", descriptor = "(IB)[I")
    private final int[] method1232(int arg0, byte arg1) {
        ++field3306;
        if (arg0 < 0) {
            return this.field3307;
        } else {
            if (arg1 != 80) {
                this.method1236(-82);
            }
            return ~arg0 <= ~this.field3302.length ? this.field3301 : this.field3302[arg0];
        }
    }

    @OriginalMember(owner = "client!aj", name = "a", descriptor = "(IZ)[I")
    public final int[] method99(int arg0, boolean arg1) {
        if (arg1) {
            this.field3301 = null;
        }
        ++field3312;
        int[] var3 = super.field1954.method110(arg0, 125);
        if (super.field1954.field244) {
            int[] var4 = this.method819(-108, 0, arg0);
            for (int var5 = 0; var5 < class131.field1862; ++var5) {
                int var6 = var4[var5] >> 4;
                if (var6 < 0) {
                    var6 = 0;
                }
                if (~var6 < -257) {
                    var6 = 256;
                }
                var3[var5] = this.field3311[var6];
            }
        }
        return var3;
    }

    @OriginalMember(owner = "client!aj", name = "d", descriptor = "(I)V")
    private final void method1233(int arg0) {
        ++field3305;
        if (arg0 > 12) {
            int var2 = this.field3300;
            if (~var2 != -3) {
                if (~var2 == -2) {
                    for (int var3 = 0; ~var3 > -258; ++var3) {
                        int var4 = var3 << 4;
                        int var5;
                        for (var5 = 1; var5 < this.field3302.length + -1 && ~var4 <= ~this.field3302[var5][0]; ++var5) {
                        }
                        int[] var6 = this.field3302[var5];
                        int[] var7 = this.field3302[var5 + -1];
                        int var8 = (-var7[0] + var4 << 12) / (var6[0] + -var7[0]);
                        int var9 = -class20.field231[255 & var8 >> 5] + 4096 >> 1;
                        int var10 = -var9 + 4096;
                        int var11 = var6[1] * var9 + var7[1] * var10 >> 12;
                        if (var11 <= -32768) {
                            var11 = -32767;
                        }
                        if (~var11 <= -32769) {
                            var11 = 32767;
                        }
                        this.field3311[var3] = (short) var11;
                    }
                } else {
                    for (int var12 = 0; var12 < 257; ++var12) {
                        int var13 = var12 << 4;
                        int var14;
                        for (var14 = 1; var14 < this.field3302.length + -1 && var13 >= this.field3302[var14][0]; ++var14) {
                        }
                        int[] var15 = this.field3302[var14 + -1];
                        int[] var16 = this.field3302[var14];
                        int var17 = (-var15[0] + var13 << 12) / (var16[0] - var15[0]);
                        int var18 = -var17 + 4096;
                        int var19 = var15[1] * var18 + var16[1] * var17 >> 12;
                        if (var19 <= -32768) {
                            var19 = -32767;
                        }
                        if (~var19 <= -32769) {
                            var19 = 32767;
                        }
                        this.field3311[var12] = (short) var19;
                    }
                }
            } else {
                for (int var20 = 0; var20 < 257; ++var20) {
                    int var21 = var20 << 4;
                    int var22;
                    for (var22 = 1; ~var22 > ~(this.field3302.length + -1) && var21 >= this.field3302[var22][0]; ++var22) {
                    }
                    int[] var23 = this.field3302[var22];
                    int[] var24 = this.field3302[var22 + -1];
                    int var25 = this.method1232(var22 + -2, (byte) 80)[1];
                    int var26 = var24[1];
                    int var28 = var23[1];
                    int var29 = -var25 + var28;
                    int var30 = this.method1232(var22 + 1, (byte) 80)[1];
                    int var31 = (var21 - var24[0] << 12) / (var23[0] + -var24[0]);
                    int var32 = var30 - var28 - var25 + var26;
                    int var33 = -var26 + -var32 + var25;
                    int var34 = var31 * var31 >> 12;
                    int var35 = (var31 * var32 >> 12) * var34 >> 12;
                    int var36 = var33 * var34 >> 12;
                    int var37 = var29 * var31 >> 12;
                    int var38 = var35 - (-var36 - var26) + var37;
                    if (~var38 >= 32767) {
                        var38 = -32767;
                    }
                    if (~var38 <= -32769) {
                        var38 = 32767;
                    }
                    this.field3311[var20] = (short) var38;
                }
            }
        }
    }

    @OriginalMember(owner = "client!aj", name = "<init>", descriptor = "()V")
    public class189() {
        super(1, true);
    }

    @OriginalMember(owner = "client!aj", name = "c", descriptor = "(II)I")
    public static final int method1234(int arg0, int arg1) {
        if (arg1 != -202379903) {
            return -70;
        } else {
            ++field3304;
            return arg0 >> 11 & 63;
        }
    }

    @OriginalMember(owner = "client!aj", name = "e", descriptor = "(I)V")
    public static void method1235(int arg0) {
        if (arg0 != 0) {
            method1231(-77, -115, (byte) -101, -109);
        }
        field3299 = null;
    }

    @OriginalMember(owner = "client!aj", name = "f", descriptor = "(I)V")
    private final void method1236(int arg0) {
        if (arg0 > -44) {
            method1234(-87, -98);
        }
        ++field3313;
        int[] var2 = this.field3302[1];
        int[] var3 = this.field3302[this.field3302.length + -1];
        int[] var4 = this.field3302[0];
        int[] var5 = this.field3302[this.field3302.length + -2];
        this.field3301 = new int[] { var5[0] - (var3[0] + -var5[0]), var5[1] - (-var5[1] - -var3[1]) };
        this.field3307 = new int[] { var4[0] - (var2[0] + -var4[0]), -var2[1] - -var4[1] + var4[1] };
    }
}
