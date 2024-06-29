import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!gq")
public class class478 extends class386 {

    @OriginalMember(owner = "client!gq", name = "J", descriptor = "I")
    private int field6705 = 0;

    @OriginalMember(owner = "client!gq", name = "E", descriptor = "[S")
    private short[] field6701 = new short[257];

    @OriginalMember(owner = "client!gq", name = "O", descriptor = "Lhq;")
    public static class142 field6709 = new class142("WTI", 5);

    @OriginalMember(owner = "client!gq", name = "C", descriptor = "I")
    public static int field6699;

    @OriginalMember(owner = "client!gq", name = "D", descriptor = "I")
    public static int field6700;

    @OriginalMember(owner = "client!gq", name = "F", descriptor = "I")
    public static int field6702;

    @OriginalMember(owner = "client!gq", name = "L", descriptor = "I")
    public static int field6706;

    @OriginalMember(owner = "client!gq", name = "M", descriptor = "I")
    public static int field6707;

    @OriginalMember(owner = "client!gq", name = "P", descriptor = "I")
    public static int field6710;

    @OriginalMember(owner = "client!gq", name = "Q", descriptor = "I")
    public static int field6711;

    @OriginalMember(owner = "client!gq", name = "S", descriptor = "Lhea;")
    public static class390 field6713;

    @OriginalMember(owner = "client!gq", name = "G", descriptor = "[I")
    public static int[] field6703;

    @OriginalMember(owner = "client!gq", name = "H", descriptor = "[I")
    private int[] field6704;

    @OriginalMember(owner = "client!gq", name = "R", descriptor = "[I")
    private int[] field6712;

    @OriginalMember(owner = "client!gq", name = "N", descriptor = "[[I")
    private int[][] field6708;

    @OriginalMember(owner = "client!gq", name = "a", descriptor = "(IBLun;)V")
    public final void method355(int arg0, byte arg1, class389 arg2) {
        ++field6699;
        if (~arg0 == -1) {
            this.field6705 = arg2.method2229(255);
            this.field6708 = new int[arg2.method2229(255)][2];
            for (int var4 = 0; var4 < this.field6708.length; ++var4) {
                this.field6708[var4][0] = arg2.method2260(-83);
                this.field6708[var4][1] = arg2.method2260(-46);
            }
        }
        if (arg1 < 111) {
            this.field6712 = null;
        }
    }

    @OriginalMember(owner = "client!gq", name = "a", descriptor = "(I)V")
    public final void method358(int arg0) {
        if (this.field6708 == null) {
            this.field6708 = new int[][] { new int[2], { 4096, 4096 } };
        }
        ++field6700;
        if (~this.field6708.length > -3) {
            throw new RuntimeException("Curve operation requires at least two markers");
        } else {
            if (this.field6705 == 2) {
                this.method2809(19502);
            }
            class265.method1609((byte) -45);
            if (arg0 < 0) {
                field6713 = null;
            }
            this.method2808(-286637560);
        }
    }

    @OriginalMember(owner = "client!gq", name = "<init>", descriptor = "()V")
    public class478() {
        super(1, true);
    }

    @OriginalMember(owner = "client!gq", name = "a", descriptor = "(BI)[I")
    private final int[] method2805(byte arg0, int arg1) {
        ++field6702;
        if (arg1 < 0) {
            return this.field6712;
        } else if (~this.field6708.length >= ~arg1) {
            return this.field6704;
        } else {
            if (arg0 <= 86) {
                field6709 = null;
            }
            return this.field6708[arg1];
        }
    }

    @OriginalMember(owner = "client!gq", name = "e", descriptor = "(I)V")
    public static void method2806(int arg0) {
        field6713 = null;
        field6709 = null;
        field6703 = null;
        if (arg0 != -772285076) {
            method2807((byte) -113, -117, -84);
        }
    }

    @OriginalMember(owner = "client!gq", name = "b", descriptor = "(BII)I")
    public static final int method2807(byte arg0, int arg1, int arg2) {
        ++field6710;
        int var3 = arg2 >>> 24;
        int var4 = (16711680 & (arg2 & 65280) * var3 | -16711936 & (16711935 & arg2) * var3) >>> 8;
        int var5 = -var3 + 255;
        if (arg0 <= 55) {
            field6713 = null;
        }
        return (((arg1 & 16711935) * var5 & -16711936 | (arg1 & 65280) * var5 & 16711680) >>> 8) - -var4;
    }

    @OriginalMember(owner = "client!gq", name = "a", descriptor = "(II)[I")
    public final int[] method359(int arg0, int arg1) {
        ++field6711;
        int[] var3 = super.field5140.method1564(arg0, true);
        int var4 = -29 % ((13 - arg1) / 40);
        if (super.field5140.field3482) {
            int[] var5 = this.method2212((byte) -13, arg0, 0);
            for (int var6 = 0; class599.field8643 > var6; ++var6) {
                int var7 = var5[var6] >> 4;
                if (var7 < 0) {
                    var7 = 0;
                }
                if (var7 > 256) {
                    var7 = 256;
                }
                var3[var6] = this.field6701[var7];
            }
        }
        return var3;
    }

    @OriginalMember(owner = "client!gq", name = "f", descriptor = "(I)V")
    private final void method2808(int arg0) {
        int var2 = this.field6705;
        if (~var2 != -3) {
            if (~var2 == -2) {
                for (int var3 = 0; var3 < 257; ++var3) {
                    int var4 = var3 << 4;
                    int var5;
                    for (var5 = 1; ~(this.field6708.length + -1) < ~var5 && ~this.field6708[var5][0] >= ~var4; ++var5) {
                    }
                    int[] var6 = this.field6708[var5 - 1];
                    int[] var7 = this.field6708[var5];
                    int var8 = (-var6[0] + var4 << 12) / (var7[0] + -var6[0]);
                    int var9 = -class197.field2400[255 & var8 >> 5] + 4096 >> 1;
                    int var10 = 4096 - var9;
                    int var11 = var6[1] * var10 - -(var7[1] * var9) >> 12;
                    if (~var11 >= 32767) {
                        var11 = -32767;
                    }
                    if (~var11 <= -32769) {
                        var11 = 32767;
                    }
                    this.field6701[var3] = (short) var11;
                }
            } else {
                for (int var12 = 0; var12 < 257; ++var12) {
                    int var13 = var12 << 4;
                    int var14;
                    for (var14 = 1; ~var14 > ~(this.field6708.length + -1) && ~var13 <= ~this.field6708[var14][0]; ++var14) {
                    }
                    int[] var15 = this.field6708[var14 + -1];
                    int[] var16 = this.field6708[var14];
                    int var17 = (-var15[0] + var13 << 12) / (var16[0] + -var15[0]);
                    int var18 = 4096 - var17;
                    int var19 = var15[1] * var18 + var16[1] * var17 >> 12;
                    if (~var19 >= 32767) {
                        var19 = -32767;
                    }
                    if (var19 >= 32768) {
                        var19 = 32767;
                    }
                    this.field6701[var12] = (short) var19;
                }
            }
        } else {
            for (int var20 = 0; var20 < 257; ++var20) {
                int var21 = var20 << 4;
                int var22;
                for (var22 = 1; ~(this.field6708.length + -1) < ~var22 && var21 >= this.field6708[var22][0]; ++var22) {
                }
                int[] var23 = this.field6708[var22 + -1];
                int[] var24 = this.field6708[var22];
                int var25 = this.method2805((byte) 98, var22 - 2)[1];
                int var26 = var23[1];
                int var27 = var24[1];
                int var28 = this.method2805((byte) 93, var22 + 1)[1];
                int var29 = (-var23[0] + var21 << 12) / (var24[0] + -var23[0]);
                int var30 = var29 * var29 >> 12;
                int var31 = -var25 + var26 + -var27 + var28;
                int var32 = var25 - (var26 + var31);
                int var33 = -var25 + var27;
                int var35 = (var29 * var31 >> 12) * var30 >> 12;
                int var36 = var30 * var32 >> 12;
                int var37 = var29 * var33 >> 12;
                int var38 = var26 + var36 + var35 + var37;
                if (var38 <= -32768) {
                    var38 = -32767;
                }
                if (var38 >= 32768) {
                    var38 = 32767;
                }
                this.field6701[var20] = (short) var38;
            }
        }
        ++field6707;
        if (arg0 != -286637560) {
            this.method2808(87);
        }
    }

    @OriginalMember(owner = "client!gq", name = "g", descriptor = "(I)V")
    private final void method2809(int arg0) {
        ++field6706;
        int[] var2 = this.field6708[0];
        int[] var3 = this.field6708[1];
        if (arg0 != 19502) {
            this.method359(-97, 24);
        }
        int[] var4 = this.field6708[this.field6708.length - 2];
        int[] var5 = this.field6708[this.field6708.length - 1];
        this.field6704 = new int[] { var4[0] + var4[0] + -var5[0], var4[1] + -var5[1] + var4[1] };
        this.field6712 = new int[] { var2[0] - -var2[0] - var3[0], var2[1] + var2[1] + -var3[1] };
    }
}
