import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ad")
public class class61 extends class89 {

    @OriginalMember(owner = "client!ad", name = "Q", descriptor = "[S")
    private short[] field1018 = new short[257];

    @OriginalMember(owner = "client!ad", name = "hb", descriptor = "I")
    private int field1034 = 0;

    @OriginalMember(owner = "client!ad", name = "S", descriptor = "I")
    public static int field1019 = 127;

    @OriginalMember(owner = "client!ad", name = "X", descriptor = "[[S")
    public static short[][] field1024 = new short[][] { { 6798, 107, 10283, 16, 4797, 7744, 5799, 4634, -31839, 22433, 2983, -11343, 8, 5281, 10438, 3650, -27322, -21845, 200, 571, 908, 21830, 28946, -15701, -14010 }, { 8741, 12, -1506, -22374, 7735, 8404, 1701, -27106, 24094, 10153, -8915, 4783, 1341, 16578, -30533, 25239, 8, 5281, 10438, 3650, -27322, -21845, 200, 571, 908, 21830, 28946, -15701, -14010 }, { 25238, 8742, 12, -1506, -22374, 7735, 8404, 1701, -27106, 24094, 10153, -8915, 4783, 1341, 16578, -30533, 8, 5281, 10438, 3650, -27322, -21845, 200, 571, 908, 21830, 28946, -15701, -14010 }, { 4626, 11146, 6439, 12, 4758, 10270 }, { 4550, 4537, 5681, 5673, 5790, 6806, 8076, 4574 } };

    @OriginalMember(owner = "client!ad", name = "V", descriptor = "I")
    public static int field1022;

    @OriginalMember(owner = "client!ad", name = "W", descriptor = "I")
    public static int field1023;

    @OriginalMember(owner = "client!ad", name = "Z", descriptor = "I")
    public static int field1026;

    @OriginalMember(owner = "client!ad", name = "ab", descriptor = "I")
    public static int field1027;

    @OriginalMember(owner = "client!ad", name = "bb", descriptor = "I")
    public static int field1028;

    @OriginalMember(owner = "client!ad", name = "cb", descriptor = "I")
    public static int field1029;

    @OriginalMember(owner = "client!ad", name = "db", descriptor = "I")
    public static int field1030;

    @OriginalMember(owner = "client!ad", name = "fb", descriptor = "I")
    public static int field1032;

    @OriginalMember(owner = "client!ad", name = "gb", descriptor = "I")
    public static int field1033;

    @OriginalMember(owner = "client!ad", name = "ib", descriptor = "I")
    public static int field1035;

    @OriginalMember(owner = "client!ad", name = "T", descriptor = "[I")
    private int[] field1020;

    @OriginalMember(owner = "client!ad", name = "Y", descriptor = "[I")
    private int[] field1025;

    @OriginalMember(owner = "client!ad", name = "eb", descriptor = "[I")
    public static int[] field1031;

    @OriginalMember(owner = "client!ad", name = "U", descriptor = "[[I")
    private int[][] field1021;

    @OriginalMember(owner = "client!ad", name = "a", descriptor = "(Z)V")
    public static void method381(boolean arg0) {
        field1031 = null;
        if (!arg0) {
            method383((byte) -61, -96, -101);
        }
        field1024 = null;
    }

    @OriginalMember(owner = "client!ad", name = "b", descriptor = "(Z)V")
    private final void method382(boolean arg0) {
        int[] var2 = this.field1021[0];
        ++field1027;
        int[] var3 = this.field1021[1];
        int[] var4 = this.field1021[this.field1021.length + -2];
        int[] var5 = this.field1021[this.field1021.length - 1];
        this.field1020 = new int[] { var2[0] - -var2[0] + -var3[0], var2[1] - -var2[1] - var3[1] };
        if (!arg0) {
            this.field1018 = null;
        }
        this.field1025 = new int[] { var4[0] - var5[0] - -var4[0], -var5[1] - (-var4[1] - var4[1]) };
    }

    @OriginalMember(owner = "client!ad", name = "a", descriptor = "(BII)V")
    public static final void method383(byte arg0, int arg1, int arg2) {
        class94 var3 = class14.method71(true, arg1);
        ++field1028;
        int var4 = var3.field1618;
        int var5 = var3.field1616;
        int var6 = var3.field1614;
        int var7 = class262.field4548[-var6 + var5];
        if (~arg2 > -1 || ~arg2 < ~var7) {
            arg2 = 0;
        }
        int var8 = 46 % ((1 - arg0) / 57);
        int var9 = var7 << var6;
        class16.method85(0, var4, class199.field3390[var4] & ~var9 | var9 & arg2 << var6);
    }

    @OriginalMember(owner = "client!ad", name = "a", descriptor = "(BI)[I")
    private final int[] method384(byte arg0, int arg1) {
        ++field1035;
        if (arg1 < 0) {
            return this.field1020;
        } else if (~arg1 <= ~this.field1021.length) {
            return this.field1025;
        } else {
            return arg0 >= -78 ? null : this.field1021[arg1];
        }
    }

    @OriginalMember(owner = "client!ad", name = "e", descriptor = "(I)V")
    public final void method234(int arg0) {
        ++field1029;
        if (arg0 != 1) {
            field1023 = 2;
        }
        if (this.field1021 == null) {
            this.field1021 = new int[][] { new int[2], { 4096, 4096 } };
        }
        if (this.field1021.length < 2) {
            throw new RuntimeException("Curve operation requires at least two markers");
        } else {
            if (this.field1034 == 2) {
                this.method382(true);
            }
            class250.method1642((byte) 106);
            this.method385(arg0 ^ -2);
        }
    }

    @OriginalMember(owner = "client!ad", name = "a", descriptor = "(ILij;I)V")
    public final void method49(int arg0, class85 arg1, int arg2) {
        ++field1032;
        if (arg0 != -20503) {
            this.field1021 = null;
        }
        if (~arg2 == -1) {
            this.field1034 = arg1.method564((byte) 112);
            this.field1021 = new int[arg1.method564((byte) 122)][2];
            for (int var4 = 0; var4 < this.field1021.length; ++var4) {
                this.field1021[var4][0] = arg1.method608(123);
                this.field1021[var4][1] = arg1.method608(90);
            }
        }
    }

    @OriginalMember(owner = "client!ad", name = "a", descriptor = "(IZ)[I")
    public final int[] method239(int arg0, boolean arg1) {
        ++field1022;
        if (arg1) {
            method386(-127, 76, true, -96L);
        }
        int[] var3 = super.field1503.method229(arg0, (byte) -116);
        if (super.field1503.field664) {
            int[] var4 = this.method645(-126, 0, arg0);
            for (int var5 = 0; ~class65.field1070 < ~var5; ++var5) {
                int var6 = var4[var5] >> 4;
                if (~var6 > -1) {
                    var6 = 0;
                }
                if (~var6 < -257) {
                    var6 = 256;
                }
                var3[var5] = this.field1018[var6];
            }
        }
        return var3;
    }

    @OriginalMember(owner = "client!ad", name = "i", descriptor = "(I)V")
    private final void method385(int arg0) {
        int var2 = this.field1034;
        if (~var2 != -3) {
            if (~var2 == -2) {
                for (int var3 = 0; ~var3 > -258; ++var3) {
                    int var4 = var3 << 4;
                    int var5;
                    for (var5 = 1; this.field1021.length + -1 > var5 && this.field1021[var5][0] <= var4; ++var5) {
                    }
                    int[] var6 = this.field1021[var5 - 1];
                    int[] var7 = this.field1021[var5];
                    int var8 = (var4 - var6[0] << 12) / (var7[0] + -var6[0]);
                    int var9 = 4096 - class159.field2791[255 & var8 >> 5] >> 1;
                    int var10 = 4096 - var9;
                    int var11 = var6[1] * var10 + var7[1] * var9 >> 12;
                    if (var11 <= -32768) {
                        var11 = -32767;
                    }
                    if (~var11 <= -32769) {
                        var11 = 32767;
                    }
                    this.field1018[var3] = (short) var11;
                }
            } else {
                for (int var12 = 0; ~var12 > -258; ++var12) {
                    int var13 = var12 << 4;
                    int var14;
                    for (var14 = 1; ~(this.field1021.length + -1) < ~var14 && var13 >= this.field1021[var14][0]; ++var14) {
                    }
                    int[] var15 = this.field1021[var14];
                    int[] var16 = this.field1021[var14 - 1];
                    int var17 = (-var16[0] + var13 << 12) / (var15[0] + -var16[0]);
                    int var18 = -var17 + 4096;
                    int var19 = var15[1] * var17 + var16[1] * var18 >> 12;
                    if (~var19 >= 32767) {
                        var19 = -32767;
                    }
                    if (var19 >= 32768) {
                        var19 = 32767;
                    }
                    this.field1018[var12] = (short) var19;
                }
            }
        } else {
            for (int var20 = 0; ~var20 > -258; ++var20) {
                int var21 = var20 << 4;
                int var22;
                for (var22 = 1; this.field1021.length + -1 > var22 && var21 >= this.field1021[var22][0]; ++var22) {
                }
                int[] var23 = this.field1021[var22 + -1];
                int[] var24 = this.field1021[var22];
                int var25 = this.method384((byte) -89, var22 + -2)[1];
                int var26 = var23[1];
                int var28 = var24[1];
                int var29 = -var25 + var28;
                int var30 = this.method384((byte) -121, var22 + 1)[1];
                int var31 = (-var23[0] + var21 << 12) / (var24[0] + -var23[0]);
                int var32 = -var28 + var30 + var26 - var25;
                int var33 = var25 - var26 + -var32;
                int var34 = var29 * var31 >> 12;
                int var35 = var31 * var31 >> 12;
                int var36 = (var31 * var32 >> 12) * var35 >> 12;
                int var37 = var33 * var35 >> 12;
                int var38 = var26 + var37 + var34 + var36;
                if (var38 <= -32768) {
                    var38 = -32767;
                }
                if (var38 >= 32768) {
                    var38 = 32767;
                }
                this.field1018[var20] = (short) var38;
            }
        }
        if (arg0 != -1) {
            field1019 = 75;
        }
        ++field1026;
    }

    @OriginalMember(owner = "client!ad", name = "a", descriptor = "(IIZJ)Z")
    public static final boolean method386(int arg0, int arg1, boolean arg2, long arg3) {
        ++field1033;
        int var5 = (int) arg3 >> 14 & 31;
        if (!arg2) {
            method383((byte) -17, -38, 30);
        }
        int var6 = 3 & (int) arg3 >> 20;
        int var7 = (int) (arg3 >>> 32) & Integer.MAX_VALUE;
        if (var5 != 10 && ~var5 != -12 && var5 != 22) {
            class67.method453(0, var5 - -1, 0, class66.field1094.field1752[0], arg1, 0, -12782, var6, 2, class66.field1094.field1722[0], true, arg0);
        } else {
            class34 var8 = class146.method1040(-115, var7);
            int var9;
            int var10;
            if (var6 != 0 && ~var6 != -3) {
                var9 = var8.field526;
                var10 = var8.field559;
            } else {
                var10 = var8.field526;
                var9 = var8.field559;
            }
            int var11 = var8.field555;
            if (~var6 != -1) {
                var11 = (var11 >> -var6 + 4) + (15 & var11 << var6);
            }
            class67.method453(var9, 0, var11, class66.field1094.field1752[0], arg1, var10, -12782, 0, 2, class66.field1094.field1722[0], true, arg0);
        }
        class141.field2491 = class185.field3174;
        class125.field2235 = 2;
        class96.field1640 = class162.field2834;
        class94.field1611 = 0;
        return true;
    }

    @OriginalMember(owner = "client!ad", name = "b", descriptor = "(II)Ldb;")
    public static final class11 method387(int arg0, int arg1) {
        ++field1030;
        class11 var2 = (class11) class84.field1368.method252(true, (long) arg1);
        if (var2 != null) {
            return var2;
        } else {
            byte[] var3 = class131.field2344.method775(arg0, arg1, -24799);
            class11 var4 = new class11();
            if (var3 != null) {
                var4.method45(0, new class85(var3));
            }
            class84.field1368.method251(var4, (byte) -71, (long) arg1);
            return var4;
        }
    }

    @OriginalMember(owner = "client!ad", name = "<init>", descriptor = "()V")
    public class61() {
        super(1, true);
    }
}
