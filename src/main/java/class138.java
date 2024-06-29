import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!fg")
public class class138 extends class585 {

    @OriginalMember(owner = "client!fg", name = "K", descriptor = "I")
    private int field2056 = 0;

    @OriginalMember(owner = "client!fg", name = "S", descriptor = "[S")
    private short[] field2064 = new short[257];

    @OriginalMember(owner = "client!fg", name = "G", descriptor = "I")
    public static int field2052 = 0;

    @OriginalMember(owner = "client!fg", name = "L", descriptor = "I")
    public static int field2057 = 0;

    @OriginalMember(owner = "client!fg", name = "R", descriptor = "I")
    public static int field2063 = -1;

    @OriginalMember(owner = "client!fg", name = "Q", descriptor = "[I")
    public static int[] field2062 = new int[] { 1, 2, 4, 8 };

    @OriginalMember(owner = "client!fg", name = "E", descriptor = "I")
    public static int field2050;

    @OriginalMember(owner = "client!fg", name = "H", descriptor = "I")
    public static int field2053;

    @OriginalMember(owner = "client!fg", name = "J", descriptor = "I")
    public static int field2055;

    @OriginalMember(owner = "client!fg", name = "M", descriptor = "I")
    public static int field2058;

    @OriginalMember(owner = "client!fg", name = "N", descriptor = "I")
    public static int field2059;

    @OriginalMember(owner = "client!fg", name = "P", descriptor = "I")
    public static int field2061;

    @OriginalMember(owner = "client!fg", name = "F", descriptor = "[I")
    private int[] field2051;

    @OriginalMember(owner = "client!fg", name = "I", descriptor = "[I")
    private int[] field2054;

    @OriginalMember(owner = "client!fg", name = "O", descriptor = "[[I")
    private int[][] field2060;

    @OriginalMember(owner = "client!fg", name = "<init>", descriptor = "()V")
    public class138() {
        super(1, true);
    }

    @OriginalMember(owner = "client!fg", name = "a", descriptor = "(Lso;II)V")
    public final void method54(class494 arg0, int arg1, int arg2) {
        ++field2053;
        if (arg2 == 0) {
            this.field2056 = arg0.method2964((byte) 36);
            this.field2060 = new int[arg0.method2964((byte) 58)][2];
            for (int var4 = 0; this.field2060.length > var4; ++var4) {
                this.field2060[var4][0] = arg0.method2998(true);
                this.field2060[var4][1] = arg0.method2998(true);
            }
        }
        if (arg1 != 1) {
            this.method54((class494) null, -116, 59);
        }
    }

    @OriginalMember(owner = "client!fg", name = "a", descriptor = "(I)V")
    public final void method52(int arg0) {
        ++field2058;
        if (arg0 != -4096) {
            this.field2056 = -83;
        }
        if (this.field2060 == null) {
            this.field2060 = new int[][] { new int[2], { 4096, 4096 } };
        }
        if (~this.field2060.length > -3) {
            throw new RuntimeException("Curve operation requires at least two markers");
        } else {
            if (~this.field2056 == -3) {
                this.method1003(-97);
            }
            class635.method3634((byte) -88);
            this.method1002(0);
        }
    }

    @OriginalMember(owner = "client!fg", name = "c", descriptor = "(I)V")
    private final void method1002(int arg0) {
        if (arg0 == 0) {
            ++field2059;
            int var2 = this.field2056;
            if (~var2 != -3) {
                if (var2 == 1) {
                    for (int var3 = 0; ~var3 > -258; ++var3) {
                        int var4 = var3 << 4;
                        int var5;
                        for (var5 = 1; ~var5 > ~(this.field2060.length + -1) && ~var4 <= ~this.field2060[var5][0]; ++var5) {
                        }
                        int[] var6 = this.field2060[var5 + -1];
                        int[] var7 = this.field2060[var5];
                        int var8 = (-var6[0] + var4 << 12) / (var7[0] + -var6[0]);
                        int var9 = -class356.field5015[(var8 & 8162) >> 5] + 4096 >> 1;
                        int var10 = -var9 + 4096;
                        int var11 = var6[1] * var10 + var7[1] * var9 >> 12;
                        if (~var11 >= 32767) {
                            var11 = -32767;
                        }
                        if (var11 >= 32768) {
                            var11 = 32767;
                        }
                        this.field2064[var3] = (short) var11;
                    }
                } else {
                    for (int var12 = 0; var12 < 257; ++var12) {
                        int var13 = var12 << 4;
                        int var14;
                        for (var14 = 1; ~var14 > ~(this.field2060.length + -1) && var13 >= this.field2060[var14][0]; ++var14) {
                        }
                        int[] var15 = this.field2060[var14 + -1];
                        int[] var16 = this.field2060[var14];
                        int var17 = (-var15[0] + var13 << 12) / (var16[0] + -var15[0]);
                        int var18 = 4096 - var17;
                        int var19 = var15[1] * var18 + var16[1] * var17 >> 12;
                        if (var19 <= -32768) {
                            var19 = -32767;
                        }
                        if (var19 >= 32768) {
                            var19 = 32767;
                        }
                        this.field2064[var12] = (short) var19;
                    }
                }
            } else {
                for (int var20 = 0; ~var20 > -258; ++var20) {
                    int var21 = var20 << 4;
                    int var22;
                    for (var22 = 1; ~var22 > ~(this.field2060.length + -1) && this.field2060[var22][0] <= var21; ++var22) {
                    }
                    int[] var23 = this.field2060[var22 + -1];
                    int[] var24 = this.field2060[var22];
                    int var25 = this.method1005((byte) -52, var22 + -2)[1];
                    int var26 = var23[1];
                    int var27 = var24[1];
                    int var28 = this.method1005((byte) -52, var22 - -1)[1];
                    int var29 = (-var23[0] + var21 << 12) / (var24[0] + -var23[0]);
                    int var30 = var29 * var29 >> 12;
                    int var31 = -var25 + var28 - (var27 - var26);
                    int var32 = -var31 + var25 + -var26;
                    int var33 = -var25 + var27;
                    int var35 = (var29 * var31 >> 12) * var30 >> 12;
                    int var36 = var30 * var32 >> 12;
                    int var37 = var29 * var33 >> 12;
                    int var38 = var35 + var36 - (-var37 - var26);
                    if (~var38 >= 32767) {
                        var38 = -32767;
                    }
                    if (~var38 <= -32769) {
                        var38 = 32767;
                    }
                    this.field2064[var20] = (short) var38;
                }
            }
        }
    }

    @OriginalMember(owner = "client!fg", name = "b", descriptor = "(II)[I")
    public final int[] method55(int arg0, int arg1) {
        ++field2061;
        if (arg1 <= 123) {
            this.method52(-33);
        }
        int[] var3 = super.field8255.method1637(-29827, arg0);
        if (super.field8255.field3677) {
            int[] var4 = this.method3415(-128, 0, arg0);
            for (int var5 = 0; ~class293.field4278 < ~var5; ++var5) {
                int var6 = var4[var5] >> 4;
                if (~var6 > -1) {
                    var6 = 0;
                }
                if (~var6 < -257) {
                    var6 = 256;
                }
                var3[var5] = this.field2064[var6];
            }
        }
        return var3;
    }

    @OriginalMember(owner = "client!fg", name = "d", descriptor = "(I)V")
    private final void method1003(int arg0) {
        ++field2050;
        int[] var2 = this.field2060[0];
        int[] var3 = this.field2060[1];
        int[] var4 = this.field2060[this.field2060.length + -2];
        int var5 = -60 / ((-14 - arg0) / 51);
        int[] var6 = this.field2060[this.field2060.length + -1];
        this.field2051 = new int[] { var4[0] + -var6[0] + var4[0], var4[1] + -var6[1] + var4[1] };
        this.field2054 = new int[] { var2[0] - (-var2[0] - -var3[0]), var2[1] - var3[1] + var2[1] };
    }

    @OriginalMember(owner = "client!fg", name = "e", descriptor = "(I)V")
    public static void method1004(int arg0) {
        if (arg0 >= -33) {
            method1004(29);
        }
        field2062 = null;
    }

    @OriginalMember(owner = "client!fg", name = "b", descriptor = "(BI)[I")
    private final int[] method1005(byte arg0, int arg1) {
        ++field2055;
        if (arg0 != -52) {
            return null;
        } else if (arg1 < 0) {
            return this.field2054;
        } else {
            return ~this.field2060.length >= ~arg1 ? this.field2051 : this.field2060[arg1];
        }
    }
}
