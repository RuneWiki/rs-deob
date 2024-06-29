import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!fba")
public class class24 extends class666 {

    @OriginalMember(owner = "client!fba", name = "H", descriptor = "I")
    private int field285 = 0;

    @OriginalMember(owner = "client!fba", name = "T", descriptor = "[S")
    private short[] field296 = new short[257];

    @OriginalMember(owner = "client!fba", name = "S", descriptor = "Lgl;")
    public static class547 field295 = new class547(10, -1);

    @OriginalMember(owner = "client!fba", name = "V", descriptor = "I")
    public static int field298 = 0;

    @OriginalMember(owner = "client!fba", name = "D", descriptor = "I")
    public static int field282;

    @OriginalMember(owner = "client!fba", name = "E", descriptor = "I")
    public static int field283;

    @OriginalMember(owner = "client!fba", name = "F", descriptor = "I")
    public static int field284;

    @OriginalMember(owner = "client!fba", name = "J", descriptor = "I")
    public static int field286;

    @OriginalMember(owner = "client!fba", name = "K", descriptor = "I")
    public static int field287;

    @OriginalMember(owner = "client!fba", name = "L", descriptor = "I")
    public static int field288;

    @OriginalMember(owner = "client!fba", name = "M", descriptor = "I")
    public static int field289;

    @OriginalMember(owner = "client!fba", name = "P", descriptor = "I")
    public static int field292;

    @OriginalMember(owner = "client!fba", name = "R", descriptor = "I")
    public static int field294;

    @OriginalMember(owner = "client!fba", name = "U", descriptor = "I")
    public static int field297;

    @OriginalMember(owner = "client!fba", name = "W", descriptor = "I")
    public static int field299;

    @OriginalMember(owner = "client!fba", name = "N", descriptor = "[I")
    private int[] field290;

    @OriginalMember(owner = "client!fba", name = "O", descriptor = "[I")
    private int[] field291;

    @OriginalMember(owner = "client!fba", name = "Q", descriptor = "[[I")
    private int[][] field293;

    @OriginalMember(owner = "client!fba", name = "a", descriptor = "(B)V")
    public static void method113(byte arg0) {
        if (arg0 == 79) {
            field295 = null;
        }
    }

    @OriginalMember(owner = "client!fba", name = "e", descriptor = "(III)Z")
    public static final boolean method114(int arg0, int arg1, int arg2) {
        ++field297;
        if (arg0 != 30174) {
            field295 = null;
        }
        boolean var3 = (55 & arg2) == 0 ? class270.method1523(arg2, arg1, -4) : class601.method3364(arg1, arg2, (byte) 86);
        return var3 | ~(arg1 & 65536) != -1 | class181.method1059(arg2, arg1, true);
    }

    @OriginalMember(owner = "client!fba", name = "a", descriptor = "(IIBII)V")
    public static final void method115(int arg0, int arg1, byte arg2, int arg3, int arg4) {
        class501.field7217 = arg0;
        class326.field4246 = arg4;
        ++field283;
        class58.field602 = arg1;
        class163.field1942 = arg3;
        if (arg2 < 0) {
            method114(108, 61, 121);
        }
    }

    @OriginalMember(owner = "client!fba", name = "h", descriptor = "(I)V")
    private final void method116(int arg0) {
        ++field289;
        if (arg0 != 4096) {
            method114(-21, 115, 43);
        }
        int var2 = this.field285;
        if (~var2 != -3) {
            if (~var2 == -2) {
                for (int var3 = 0; ~var3 > -258; ++var3) {
                    int var4 = var3 << 4;
                    int var5;
                    for (var5 = 1; this.field293.length + -1 > var5 && ~this.field293[var5][0] >= ~var4; ++var5) {
                    }
                    int[] var6 = this.field293[var5 - 1];
                    int[] var7 = this.field293[var5];
                    int var8 = (var4 - var6[0] << 12) / (var7[0] - var6[0]);
                    int var9 = -class277.field3512[255 & var8 >> 5] + 4096 >> 1;
                    int var10 = -var9 + 4096;
                    int var11 = var6[1] * var10 + var7[1] * var9 >> 12;
                    if (var11 <= -32768) {
                        var11 = -32767;
                    }
                    if (var11 >= 32768) {
                        var11 = 32767;
                    }
                    this.field296[var3] = (short) var11;
                }
            } else {
                for (int var12 = 0; var12 < 257; ++var12) {
                    int var13 = var12 << 4;
                    int var14;
                    for (var14 = 1; ~(this.field293.length - 1) < ~var14 && ~var13 <= ~this.field293[var14][0]; ++var14) {
                    }
                    int[] var15 = this.field293[var14 - 1];
                    int[] var16 = this.field293[var14];
                    int var17 = (-var15[0] + var13 << 12) / (var16[0] - var15[0]);
                    int var18 = -var17 + 4096;
                    int var19 = var15[1] * var18 + var16[1] * var17 >> 12;
                    if (var19 <= -32768) {
                        var19 = -32767;
                    }
                    if (var19 >= 32768) {
                        var19 = 32767;
                    }
                    this.field296[var12] = (short) var19;
                }
            }
        } else {
            for (int var20 = 0; ~var20 > -258; ++var20) {
                int var21 = var20 << 4;
                int var22;
                for (var22 = 1; var22 < this.field293.length + -1 && this.field293[var22][0] <= var21; ++var22) {
                }
                int[] var23 = this.field293[var22 + -1];
                int[] var24 = this.field293[var22];
                int var25 = this.method117((byte) -114, var22 + -2)[1];
                int var26 = var23[1];
                int var27 = var24[1];
                int var28 = this.method117((byte) -114, var22 + 1)[1];
                int var29 = (var21 - var23[0] << 12) / (var24[0] + -var23[0]);
                int var30 = var29 * var29 >> 12;
                int var31 = -var25 + var26 + -var27 + var28;
                int var32 = -var26 + var25 + -var31;
                int var33 = -var25 + var27;
                int var35 = (var29 * var31 >> 12) * var30 >> 12;
                int var36 = var30 * var32 >> 12;
                int var37 = var29 * var33 >> 12;
                int var38 = var26 + var37 + var36 + var35;
                if (~var38 >= 32767) {
                    var38 = -32767;
                }
                if (~var38 <= -32769) {
                    var38 = 32767;
                }
                this.field296[var20] = (short) var38;
            }
        }
    }

    @OriginalMember(owner = "client!fba", name = "a", descriptor = "(BI)[I")
    private final int[] method117(byte arg0, int arg1) {
        ++field284;
        if (arg0 != -114) {
            this.field291 = null;
        }
        if (arg1 < 0) {
            return this.field291;
        } else {
            return ~arg1 <= ~this.field293.length ? this.field290 : this.field293[arg1];
        }
    }

    @OriginalMember(owner = "client!fba", name = "a", descriptor = "(I)V")
    public final void method118(int arg0) {
        if (arg0 != -9) {
            field295 = null;
        }
        if (this.field293 == null) {
            this.field293 = new int[][] { new int[2], { 4096, 4096 } };
        }
        ++field288;
        if (~this.field293.length > -3) {
            throw new RuntimeException("Curve operation requires at least two markers");
        } else {
            if (this.field285 == 2) {
                this.method119(69);
            }
            class636.method3561(true);
            this.method116(4096);
        }
    }

    @OriginalMember(owner = "client!fba", name = "i", descriptor = "(I)V")
    private final void method119(int arg0) {
        ++field286;
        int[] var2 = this.field293[0];
        int[] var3 = this.field293[1];
        int[] var4 = this.field293[this.field293.length + -2];
        int[] var5 = this.field293[this.field293.length + -1];
        this.field290 = new int[] { var4[0] + -var5[0] + var4[0], -var5[1] - (-var4[1] - var4[1]) };
        this.field291 = new int[] { var2[0] + -var3[0] + var2[0], var2[1] - var3[1] + var2[1] };
        if (arg0 < 68) {
            this.method121(-49, (class452) null, false);
        }
    }

    @OriginalMember(owner = "client!fba", name = "d", descriptor = "(B)V")
    public static final void method120(byte arg0) {
        class112.field1304.method648(0);
        ++field282;
        class636.field9006 = 1;
        int var1 = 115 % ((arg0 - 9) / 39);
        class692.field9747 = null;
    }

    @OriginalMember(owner = "client!fba", name = "a", descriptor = "(ILiaa;Z)V")
    public final void method121(int arg0, class452 arg1, boolean arg2) {
        if (!arg2) {
            this.method117((byte) -5, -122);
        }
        ++field292;
        if (arg0 == 0) {
            this.field285 = arg1.method2541(37);
            this.field293 = new int[arg1.method2541(80)][2];
            for (int var4 = 0; ~var4 > ~this.field293.length; ++var4) {
                this.field293[var4][0] = arg1.method2574(-1758460248);
                this.field293[var4][1] = arg1.method2574(-1758460248);
            }
        }
    }

    @OriginalMember(owner = "client!fba", name = "a", descriptor = "(II)[I")
    public final int[] method122(int arg0, int arg1) {
        ++field287;
        if (arg0 >= -21) {
            return null;
        } else {
            int[] var3 = super.field9466.method1811(arg1, 9);
            if (super.field9466.field4172) {
                int[] var4 = this.method3739(0, -128, arg1);
                for (int var5 = 0; class501.field7222 > var5; ++var5) {
                    int var6 = var4[var5] >> 4;
                    if (var6 < 0) {
                        var6 = 0;
                    }
                    if (~var6 < -257) {
                        var6 = 256;
                    }
                    var3[var5] = this.field296[var6];
                }
            }
            return var3;
        }
    }

    @OriginalMember(owner = "client!fba", name = "<init>", descriptor = "()V")
    public class24() {
        super(1, true);
    }
}
