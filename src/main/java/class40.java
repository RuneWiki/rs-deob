import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ra")
public class class40 extends class87 {

    @OriginalMember(owner = "client!ra", name = "K", descriptor = "I")
    private int field528 = 0;

    @OriginalMember(owner = "client!ra", name = "N", descriptor = "[S")
    private short[] field530 = new short[257];

    @OriginalMember(owner = "client!ra", name = "P", descriptor = "Lpi;")
    public static class201 field531 = new class201(16);

    @OriginalMember(owner = "client!ra", name = "X", descriptor = "[I")
    public static int[] field538 = new int[1000];

    @OriginalMember(owner = "client!ra", name = "W", descriptor = "I")
    public static int field537 = 0;

    @OriginalMember(owner = "client!ra", name = "G", descriptor = "I")
    public static int field524;

    @OriginalMember(owner = "client!ra", name = "H", descriptor = "I")
    public static int field525;

    @OriginalMember(owner = "client!ra", name = "I", descriptor = "I")
    public static int field526;

    @OriginalMember(owner = "client!ra", name = "J", descriptor = "I")
    public static int field527;

    @OriginalMember(owner = "client!ra", name = "S", descriptor = "I")
    public static int field533;

    @OriginalMember(owner = "client!ra", name = "T", descriptor = "I")
    public static int field534;

    @OriginalMember(owner = "client!ra", name = "U", descriptor = "I")
    public static int field535;

    @OriginalMember(owner = "client!ra", name = "V", descriptor = "I")
    public static int field536;

    @OriginalMember(owner = "client!ra", name = "Y", descriptor = "I")
    public static int field539;

    @OriginalMember(owner = "client!ra", name = "R", descriptor = "[I")
    private int[] field532;

    @OriginalMember(owner = "client!ra", name = "Z", descriptor = "[I")
    private int[] field540;

    @OriginalMember(owner = "client!ra", name = "L", descriptor = "[[I")
    private int[][] field529;

    @OriginalMember(owner = "client!ra", name = "<init>", descriptor = "()V")
    public class40() {
        super(1, true);
    }

    @OriginalMember(owner = "client!ra", name = "a", descriptor = "(BI)[I")
    private final int[] method249(byte arg0, int arg1) {
        if (arg0 != 76) {
            return null;
        } else {
            ++field534;
            if (arg1 < 0) {
                return this.field540;
            } else {
                return this.field529.length <= arg1 ? this.field532 : this.field529[arg1];
            }
        }
    }

    @OriginalMember(owner = "client!ra", name = "a", descriptor = "(IZ)[I")
    public final int[] method37(int arg0, boolean arg1) {
        ++field533;
        int[] var3 = super.field1378.method319(arg0, arg1);
        if (super.field1378.field733) {
            int[] var4 = this.method642(0, arg0, true);
            for (int var5 = 0; var5 < class206.field3032; ++var5) {
                int var6 = var4[var5] >> 4;
                if (~var6 > -1) {
                    var6 = 0;
                }
                if (~var6 < -257) {
                    var6 = 256;
                }
                var3[var5] = this.field530[var6];
            }
        }
        return var3;
    }

    @OriginalMember(owner = "client!ra", name = "c", descriptor = "(B)V")
    private final void method250(byte arg0) {
        int var2 = this.field528;
        if (var2 != 2) {
            if (var2 == 1) {
                for (int var3 = 0; var3 < 257; ++var3) {
                    int var4 = var3 << 4;
                    int var5;
                    for (var5 = 1; this.field529.length + -1 > var5 && this.field529[var5][0] <= var4; ++var5) {
                    }
                    int[] var6 = this.field529[var5 + -1];
                    int[] var7 = this.field529[var5];
                    int var8 = (-var6[0] + var4 << 12) / (var7[0] + -var6[0]);
                    int var9 = -class256.field3870[(8162 & var8) >> 5] + 4096 >> 1;
                    int var10 = -var9 + 4096;
                    int var11 = var6[1] * var10 + var7[1] * var9 >> 12;
                    if (~var11 >= 32767) {
                        var11 = -32767;
                    }
                    if (var11 >= 32768) {
                        var11 = 32767;
                    }
                    this.field530[var3] = (short) var11;
                }
            } else {
                for (int var12 = 0; ~var12 > -258; ++var12) {
                    int var13 = var12 << 4;
                    int var14;
                    for (var14 = 1; ~(this.field529.length - 1) < ~var14 && this.field529[var14][0] <= var13; ++var14) {
                    }
                    int[] var15 = this.field529[var14 - 1];
                    int[] var16 = this.field529[var14];
                    int var17 = (-var15[0] + var13 << 12) / (var16[0] + -var15[0]);
                    int var18 = -var17 + 4096;
                    int var19 = var15[1] * var18 + var16[1] * var17 >> 12;
                    if (var19 <= -32768) {
                        var19 = -32767;
                    }
                    if (var19 >= 32768) {
                        var19 = 32767;
                    }
                    this.field530[var12] = (short) var19;
                }
            }
        } else {
            for (int var20 = 0; ~var20 > -258; ++var20) {
                int var22 = var20 << 4;
                int var23;
                for (var23 = 1; ~var23 > ~(this.field529.length + -1) && var22 >= this.field529[var23][0]; ++var23) {
                }
                int[] var24 = this.field529[var23 + -1];
                int[] var25 = this.field529[var23];
                int var26 = this.method249((byte) 76, var23 + -2)[1];
                int var27 = var25[1];
                int var28 = var24[1];
                int var29 = -var26 + var27;
                int var31 = this.method249((byte) 76, var23 + 1)[1];
                int var32 = (-var24[0] + var22 << 12) / (var25[0] + -var24[0]);
                int var33 = var32 * var32 >> 12;
                int var34 = var29 * var32 >> 12;
                int var35 = var28 + var31 - (var27 - -var26);
                int var36 = -var28 + -var35 + var26;
                int var37 = (var32 * var35 >> 12) * var33 >> 12;
                int var38 = var33 * var36 >> 12;
                int var39 = var37 + var38 + var34 + var28;
                if (~var39 >= 32767) {
                    var39 = -32767;
                }
                if (~var39 <= -32769) {
                    var39 = 32767;
                }
                this.field530[var20] = (short) var39;
            }
        }
        int var21 = 25 % ((arg0 - -36) / 61);
        ++field527;
    }

    @OriginalMember(owner = "client!ra", name = "f", descriptor = "(I)V")
    public static void method251(int arg0) {
        field531 = null;
        field538 = null;
        if (arg0 != -167981236) {
            field536 = 43;
        }
    }

    @OriginalMember(owner = "client!ra", name = "a", descriptor = "(Lhc;II)V")
    public final void method40(class53 arg0, int arg1, int arg2) {
        ++field539;
        if (arg2 != 25645) {
            field537 = -122;
        }
        if (~arg1 == -1) {
            this.field528 = arg0.method366(-16505);
            this.field529 = new int[arg0.method366(-16505)][2];
            for (int var4 = 0; var4 < this.field529.length; ++var4) {
                this.field529[var4][0] = arg0.method331(-7);
                this.field529[var4][1] = arg0.method331(-75);
            }
        }
    }

    @OriginalMember(owner = "client!ra", name = "e", descriptor = "(I)V")
    public final void method136(int arg0) {
        if (this.field529 == null) {
            this.field529 = new int[][] { new int[2], { 4096, 4096 } };
        }
        ++field535;
        if (~this.field529.length > -3) {
            throw new RuntimeException("Curve operation requires at least two markers");
        } else {
            if (~this.field528 == -3) {
                this.method253(32767);
            }
            if (arg0 == 0) {
                class272.method1897(58);
                this.method250((byte) -119);
            }
        }
    }

    @OriginalMember(owner = "client!ra", name = "b", descriptor = "(IB)V")
    public static final void method252(int arg0, byte arg1) {
        ++field524;
        if (arg0 != 0) {
            if (~arg0 == -2) {
                class38.method236(77);
            } else if (arg0 != 2) {
                if (arg0 != 3) {
                    throw new RuntimeException();
                }
                class5.method28(-123);
            } else {
                class62.method472(-3365);
            }
            if (arg1 <= 1) {
                method252(-7, (byte) 63);
            }
        }
    }

    @OriginalMember(owner = "client!ra", name = "g", descriptor = "(I)V")
    private final void method253(int arg0) {
        ++field525;
        if (arg0 != 32767) {
            this.method37(-114, true);
        }
        int[] var2 = this.field529[0];
        int[] var3 = this.field529[1];
        int[] var4 = this.field529[this.field529.length + -2];
        int[] var5 = this.field529[this.field529.length - 1];
        this.field532 = new int[] { var4[0] + -var5[0] + var4[0], var4[1] + -var5[1] + var4[1] };
        this.field540 = new int[] { -var3[0] - -var2[0] + var2[0], var2[1] + -var3[1] + var2[1] };
    }
}
