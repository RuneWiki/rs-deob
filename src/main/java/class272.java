import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!mt")
public class class272 extends class11 {

    @OriginalMember(owner = "client!mt", name = "H", descriptor = "[S")
    private short[] field3745 = new short[257];

    @OriginalMember(owner = "client!mt", name = "T", descriptor = "I")
    private int field3756 = 0;

    @OriginalMember(owner = "client!mt", name = "Q", descriptor = "[J")
    public static long[] field3753;

    @OriginalMember(owner = "client!mt", name = "P", descriptor = "S")
    public static short field3752;

    @OriginalMember(owner = "client!mt", name = "V", descriptor = "I")
    public static int field3758;

    @OriginalMember(owner = "client!mt", name = "U", descriptor = "I")
    public static int field3757;

    @OriginalMember(owner = "client!mt", name = "G", descriptor = "I")
    public static int field3744;

    @OriginalMember(owner = "client!mt", name = "I", descriptor = "I")
    public static int field3746;

    @OriginalMember(owner = "client!mt", name = "K", descriptor = "I")
    public static int field3747;

    @OriginalMember(owner = "client!mt", name = "L", descriptor = "I")
    public static int field3748;

    @OriginalMember(owner = "client!mt", name = "M", descriptor = "I")
    public static int field3749;

    @OriginalMember(owner = "client!mt", name = "O", descriptor = "I")
    public static int field3751;

    @OriginalMember(owner = "client!mt", name = "R", descriptor = "[I")
    private int[] field3754;

    @OriginalMember(owner = "client!mt", name = "S", descriptor = "[I")
    private int[] field3755;

    @OriginalMember(owner = "client!mt", name = "N", descriptor = "[[I")
    private int[][] field3750;

    @OriginalMember(owner = "client!mt", name = "c", descriptor = "(Z)V")
    private final void method1623(boolean arg0) {
        ++field3744;
        int[] var2 = this.field3750[0];
        int[] var3 = this.field3750[1];
        int[] var4 = this.field3750[this.field3750.length + -2];
        int[] var5 = this.field3750[this.field3750.length + -1];
        this.field3755 = new int[] { var2[0] + -var3[0] + var2[0], var2[1] + var2[1] - var3[1] };
        if (!arg0) {
            this.method1626(-76, (byte) -111);
        }
        this.field3754 = new int[] { var4[0] - var5[0] - -var4[0], var4[1] - (var5[1] + -var4[1]) };
    }

    @OriginalMember(owner = "client!mt", name = "b", descriptor = "(Z)V")
    public final void method42(boolean arg0) {
        if (this.field3750 == null) {
            this.field3750 = new int[][] { new int[2], { 4096, 4096 } };
        }
        ++field3751;
        if (this.field3750.length < 2) {
            throw new RuntimeException("Curve operation requires at least two markers");
        } else {
            if (~this.field3756 == -3) {
                this.method1623(true);
            }
            class144.method971((byte) 26);
            this.method1624(1);
            if (!arg0) {
                method1625(true);
            }
        }
    }

    @OriginalMember(owner = "client!mt", name = "d", descriptor = "(II)[I")
    public final int[] method44(int arg0, int arg1) {
        ++field3746;
        int[] var3 = super.field158.method1312(arg1, (byte) 74);
        if (arg0 > -42) {
            field3753 = null;
        }
        if (super.field158.field2966) {
            int[] var4 = this.method48(arg1, 0, (byte) -82);
            for (int var5 = 0; var5 < class90.field1316; ++var5) {
                int var6 = var4[var5] >> 4;
                if (~var6 > -1) {
                    var6 = 0;
                }
                if (~var6 < -257) {
                    var6 = 256;
                }
                var3[var5] = this.field3745[var6];
            }
        }
        return var3;
    }

    @OriginalMember(owner = "client!mt", name = "a", descriptor = "(Lsi;II)V")
    public final void method43(class391 arg0, int arg1, int arg2) {
        ++field3747;
        if (arg1 > -40) {
            field3753 = null;
        }
        if (arg2 == 0) {
            this.field3756 = arg0.method2348(-2);
            this.field3750 = new int[arg0.method2348(-2)][2];
            for (int var4 = 0; this.field3750.length > var4; ++var4) {
                this.field3750[var4][0] = arg0.method2353((byte) 117);
                this.field3750[var4][1] = arg0.method2353((byte) 78);
            }
        }
    }

    @OriginalMember(owner = "client!mt", name = "f", descriptor = "(I)V")
    private final void method1624(int arg0) {
        int var2 = this.field3756;
        if (var2 != 2) {
            if (~var2 == -2) {
                for (int var3 = 0; ~var3 > -258; ++var3) {
                    int var4 = var3 << 4;
                    int var5;
                    for (var5 = 1; ~(this.field3750.length + -1) < ~var5 && ~this.field3750[var5][0] >= ~var4; ++var5) {
                    }
                    int[] var6 = this.field3750[var5 - 1];
                    int[] var7 = this.field3750[var5];
                    int var8 = (-var6[0] + var4 << 12) / (var7[0] + -var6[0]);
                    int var9 = -class150.field2284[(var8 & 8187) >> 5] + 4096 >> 1;
                    int var10 = -var9 + 4096;
                    int var11 = var6[1] * var10 + var7[1] * var9 >> 12;
                    if (var11 <= -32768) {
                        var11 = -32767;
                    }
                    if (~var11 <= -32769) {
                        var11 = 32767;
                    }
                    this.field3745[var3] = (short) var11;
                }
            } else {
                for (int var12 = 0; var12 < 257; ++var12) {
                    int var13 = var12 << 4;
                    int var14;
                    for (var14 = 1; this.field3750.length + -1 > var14 && ~this.field3750[var14][0] >= ~var13; ++var14) {
                    }
                    int[] var15 = this.field3750[var14 + -1];
                    int[] var16 = this.field3750[var14];
                    int var17 = (-var15[0] + var13 << 12) / (var16[0] + -var15[0]);
                    int var18 = -var17 + 4096;
                    int var19 = var15[1] * var18 + var16[1] * var17 >> 12;
                    if (~var19 >= 32767) {
                        var19 = -32767;
                    }
                    if (~var19 <= -32769) {
                        var19 = 32767;
                    }
                    this.field3745[var12] = (short) var19;
                }
            }
        } else {
            for (int var20 = 0; ~var20 > -258; ++var20) {
                int var21 = var20 << 4;
                int var22;
                for (var22 = 1; ~(this.field3750.length - 1) < ~var22 && this.field3750[var22][0] <= var21; ++var22) {
                }
                int[] var23 = this.field3750[var22 + -1];
                int[] var24 = this.field3750[var22];
                int var25 = this.method1626(var22 + -2, (byte) -93)[1];
                int var26 = var23[1];
                int var27 = var24[1];
                int var28 = this.method1626(var22 - -1, (byte) -92)[1];
                int var29 = (-var23[0] + var21 << 12) / (var24[0] + -var23[0]);
                int var30 = var29 * var29 >> 12;
                int var31 = -var25 + -var27 + var28 + var26;
                int var32 = var25 - var26 + -var31;
                int var33 = -var25 + var27;
                int var35 = (var29 * var31 >> 12) * var30 >> 12;
                int var36 = var30 * var32 >> 12;
                int var37 = var29 * var33 >> 12;
                int var38 = var37 - -var26 + var35 + var36;
                if (~var38 >= 32767) {
                    var38 = -32767;
                }
                if (var38 >= 32768) {
                    var38 = 32767;
                }
                this.field3745[var20] = (short) var38;
            }
        }
        ++field3749;
        if (arg0 != 1) {
            this.method1623(true);
        }
    }

    @OriginalMember(owner = "client!mt", name = "d", descriptor = "(Z)V")
    public static void method1625(boolean arg0) {
        field3753 = null;
        if (!arg0) {
            field3753 = null;
        }
    }

    @OriginalMember(owner = "client!mt", name = "a", descriptor = "(IB)[I")
    private final int[] method1626(int arg0, byte arg1) {
        if (arg1 >= -38) {
            field3757 = -26;
        }
        ++field3748;
        if (arg0 < 0) {
            return this.field3755;
        } else {
            return arg0 >= this.field3750.length ? this.field3754 : this.field3750[arg0];
        }
    }

    @OriginalMember(owner = "client!mt", name = "<init>", descriptor = "()V")
    public class272() {
        super(1, true);
    }

    static {
        new class466("You can report that person under a different rule.", "Diese Person kann bezüglich einer anderen Regel gemeldet werden.", "Vous pouvez signaler cette personne pour une autre infraction aux règles.", "Você não pode denunciar essa pessoa de acordo com uma regra diferente.");
        field3753 = new long[256];
        field3752 = 1;
        for (int var0 = 0; ~var0 > -257; ++var0) {
            long var1 = (long) var0;
            for (int var3 = 0; var3 < 8; ++var3) {
                if ((var1 & 1L) == 1L) {
                    var1 = var1 >>> 1 ^ -3932672073523589310L;
                } else {
                    var1 >>>= 1;
                }
            }
            field3753[var0] = var1;
        }
        field3758 = 0;
        field3757 = 0;
    }
}
