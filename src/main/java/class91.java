import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!uh")
public class class91 extends class98 {

    @OriginalMember(owner = "client!uh", name = "Y", descriptor = "I")
    private int field1102 = 0;

    @OriginalMember(owner = "client!uh", name = "X", descriptor = "[S")
    private short[] field1101 = new short[257];

    @OriginalMember(owner = "client!uh", name = "W", descriptor = "[I")
    public static int[] field1100 = new int[] { 0, 0, 0, 64, 128, 128, 128, 64, 64, 96, 32, 32, 64 };

    @OriginalMember(owner = "client!uh", name = "M", descriptor = "I")
    public static int field1090;

    @OriginalMember(owner = "client!uh", name = "N", descriptor = "I")
    public static int field1091;

    @OriginalMember(owner = "client!uh", name = "O", descriptor = "I")
    public static int field1092;

    @OriginalMember(owner = "client!uh", name = "P", descriptor = "I")
    public static int field1093;

    @OriginalMember(owner = "client!uh", name = "Q", descriptor = "I")
    public static int field1094;

    @OriginalMember(owner = "client!uh", name = "U", descriptor = "I")
    public static int field1098;

    @OriginalMember(owner = "client!uh", name = "V", descriptor = "I")
    public static int field1099;

    @OriginalMember(owner = "client!uh", name = "R", descriptor = "[I")
    public static int[] field1095;

    @OriginalMember(owner = "client!uh", name = "T", descriptor = "[I")
    private int[] field1097;

    @OriginalMember(owner = "client!uh", name = "Z", descriptor = "[I")
    private int[] field1103;

    @OriginalMember(owner = "client!uh", name = "S", descriptor = "[[I")
    private int[][] field1096;

    @OriginalMember(owner = "client!uh", name = "e", descriptor = "(I)V")
    public static void method497(int arg0) {
        field1100 = null;
        if (arg0 != 4985) {
            method501(-3, (class134) null, (class376) null, (class376) null);
        }
        field1095 = null;
    }

    @OriginalMember(owner = "client!uh", name = "f", descriptor = "(B)V")
    private final void method498(byte arg0) {
        ++field1093;
        if (arg0 > -35) {
            method501(89, (class134) null, (class376) null, (class376) null);
        }
        int var2 = this.field1102;
        if (var2 != 2) {
            if (~var2 == -2) {
                for (int var3 = 0; ~var3 > -258; ++var3) {
                    int var4 = var3 << 4;
                    int var5;
                    for (var5 = 1; this.field1096.length + -1 > var5 && var4 >= this.field1096[var5][0]; ++var5) {
                    }
                    int[] var6 = this.field1096[var5 + -1];
                    int[] var7 = this.field1096[var5];
                    int var8 = (-var6[0] + var4 << 12) / (var7[0] + -var6[0]);
                    int var9 = -class247.field3531[var8 >> 5 & 255] + 4096 >> 1;
                    int var10 = -var9 + 4096;
                    int var11 = var6[1] * var10 + var7[1] * var9 >> 12;
                    if (var11 <= -32768) {
                        var11 = -32767;
                    }
                    if (~var11 <= -32769) {
                        var11 = 32767;
                    }
                    this.field1101[var3] = (short) var11;
                }
            } else {
                for (int var12 = 0; var12 < 257; ++var12) {
                    int var13 = var12 << 4;
                    int var14;
                    for (var14 = 1; ~(this.field1096.length - 1) < ~var14 && ~this.field1096[var14][0] >= ~var13; ++var14) {
                    }
                    int[] var15 = this.field1096[var14 + -1];
                    int[] var16 = this.field1096[var14];
                    int var17 = (-var15[0] + var13 << 12) / (var16[0] + -var15[0]);
                    int var18 = -var17 + 4096;
                    int var19 = var15[1] * var18 - -(var16[1] * var17) >> 12;
                    if (~var19 >= 32767) {
                        var19 = -32767;
                    }
                    if (~var19 <= -32769) {
                        var19 = 32767;
                    }
                    this.field1101[var12] = (short) var19;
                }
            }
        } else {
            for (int var20 = 0; ~var20 > -258; ++var20) {
                int var21 = var20 << 4;
                int var22;
                for (var22 = 1; ~var22 > ~(this.field1096.length + -1) && this.field1096[var22][0] <= var21; ++var22) {
                }
                int[] var23 = this.field1096[var22 - 1];
                int[] var24 = this.field1096[var22];
                int var25 = this.method500(var22 + -2, (byte) 60)[1];
                int var26 = var23[1];
                int var27 = var24[1];
                int var28 = this.method500(var22 + 1, (byte) 123)[1];
                int var29 = (-var23[0] + var21 << 12) / (var24[0] + -var23[0]);
                int var30 = var29 * var29 >> 12;
                int var31 = var28 - var27 + -var25 + var26;
                int var32 = -var31 + var25 + -var26;
                int var33 = -var25 + var27;
                int var35 = (var29 * var31 >> 12) * var30 >> 12;
                int var36 = var30 * var32 >> 12;
                int var37 = var29 * var33 >> 12;
                int var38 = var35 - -var36 - (-var26 + -var37);
                if (~var38 >= 32767) {
                    var38 = -32767;
                }
                if (~var38 <= -32769) {
                    var38 = 32767;
                }
                this.field1101[var20] = (short) var38;
            }
        }
    }

    @OriginalMember(owner = "client!uh", name = "b", descriptor = "(Z)V")
    private final void method499(boolean arg0) {
        ++field1091;
        int[] var2 = this.field1096[0];
        int[] var3 = this.field1096[1];
        if (!arg0) {
            this.method83(-78, -7);
        }
        int[] var4 = this.field1096[this.field1096.length - 2];
        int[] var5 = this.field1096[this.field1096.length + -1];
        this.field1103 = new int[] { var2[0] + -var3[0] + var2[0], -var3[1] - (-var2[1] - var2[1]) };
        this.field1097 = new int[] { var4[0] - (-var4[0] - -var5[0]), var4[1] + -var5[1] + var4[1] };
    }

    @OriginalMember(owner = "client!uh", name = "<init>", descriptor = "()V")
    public class91() {
        super(1, true);
    }

    @OriginalMember(owner = "client!uh", name = "a", descriptor = "(II)[I")
    public final int[] method83(int arg0, int arg1) {
        ++field1092;
        int[] var3 = super.field1177.method820(arg1, true);
        if (super.field1177.field1610) {
            int[] var4 = this.method539(0, (byte) -87, arg1);
            for (int var5 = 0; class268.field3811 > var5; ++var5) {
                int var6 = var4[var5] >> 4;
                if (var6 < 0) {
                    var6 = 0;
                }
                if (~var6 < -257) {
                    var6 = 256;
                }
                var3[var5] = this.field1101[var6];
            }
        }
        if (arg0 != 0) {
            this.method83(-118, 48);
        }
        return var3;
    }

    @OriginalMember(owner = "client!uh", name = "b", descriptor = "(IB)[I")
    private final int[] method500(int arg0, byte arg1) {
        ++field1094;
        if (~arg0 > -1) {
            return this.field1103;
        } else if (this.field1096.length <= arg0) {
            return this.field1097;
        } else {
            return arg1 <= 38 ? null : this.field1096[arg0];
        }
    }

    @OriginalMember(owner = "client!uh", name = "a", descriptor = "(ILae;Ltq;Ltq;)V")
    public static final void method501(int arg0, class134 arg1, class376 arg2, class376 arg3) {
        class152.field1879 = class365.method2335(class401.field5742, arg3, 0, 0);
        ++field1099;
        class263.field3750 = arg1.method613(class152.field1879, class375.method2401(arg2, class401.field5742, 0), true);
        class130.field1582 = class365.method2335(class278.field3941, arg3, 0, 0);
        class73.field874 = arg1.method613(class130.field1582, class375.method2401(arg2, class278.field3941, 0), true);
        class371.field5232 = class365.method2335(class396.field5584, arg3, arg0, arg0);
        class174.field2391 = arg1.method613(class371.field5232, class375.method2401(arg2, class396.field5584, 0), true);
    }

    @OriginalMember(owner = "client!uh", name = "a", descriptor = "(ILdg;I)V")
    public final void method81(int arg0, class236 arg1, int arg2) {
        ++field1090;
        if (arg0 == arg2) {
            this.field1102 = arg1.method1574(-93);
            this.field1096 = new int[arg1.method1574(-35)][2];
            for (int var4 = 0; ~var4 > ~this.field1096.length; ++var4) {
                this.field1096[var4][0] = arg1.method1617((byte) 48);
                this.field1096[var4][1] = arg1.method1617((byte) 48);
            }
        }
    }

    @OriginalMember(owner = "client!uh", name = "b", descriptor = "(I)V")
    public final void method188(int arg0) {
        if (this.field1096 == null) {
            this.field1096 = new int[][] { new int[2], { 4096, 4096 } };
        }
        ++field1098;
        if (~this.field1096.length > -3) {
            throw new RuntimeException("Curve operation requires at least two markers");
        } else {
            if (arg0 != 1) {
                this.field1096 = null;
            }
            if (~this.field1102 == -3) {
                this.method499(true);
            }
            class55.method315((byte) 42);
            this.method498((byte) -86);
        }
    }
}
