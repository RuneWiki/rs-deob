import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!wt")
public class class186 extends class326 {

    @OriginalMember(owner = "client!wt", name = "R", descriptor = "I")
    private int field2549 = 0;

    @OriginalMember(owner = "client!wt", name = "V", descriptor = "[S")
    private short[] field2553 = new short[257];

    @OriginalMember(owner = "client!wt", name = "ab", descriptor = "I")
    public static int field2558 = -1;

    @OriginalMember(owner = "client!wt", name = "X", descriptor = "Lh;")
    public static class434 field2555 = new class434(26, 28);

    @OriginalMember(owner = "client!wt", name = "bb", descriptor = "Lh;")
    public static class434 field2559 = new class434(6, -2);

    @OriginalMember(owner = "client!wt", name = "cb", descriptor = "I")
    public static int field2560 = 0;

    @OriginalMember(owner = "client!wt", name = "N", descriptor = "I")
    public static int field2545;

    @OriginalMember(owner = "client!wt", name = "O", descriptor = "I")
    public static int field2546;

    @OriginalMember(owner = "client!wt", name = "P", descriptor = "I")
    public static int field2547;

    @OriginalMember(owner = "client!wt", name = "Q", descriptor = "I")
    public static int field2548;

    @OriginalMember(owner = "client!wt", name = "U", descriptor = "I")
    public static int field2552;

    @OriginalMember(owner = "client!wt", name = "W", descriptor = "I")
    public static int field2554;

    @OriginalMember(owner = "client!wt", name = "Y", descriptor = "I")
    public static int field2556;

    @OriginalMember(owner = "client!wt", name = "S", descriptor = "[I")
    private int[] field2550;

    @OriginalMember(owner = "client!wt", name = "Z", descriptor = "[I")
    private int[] field2557;

    @OriginalMember(owner = "client!wt", name = "T", descriptor = "[[I")
    private int[][] field2551;

    @OriginalMember(owner = "client!wt", name = "<init>", descriptor = "()V", line = 5)
    public class186() {
        super(1, true);
    }

    @OriginalMember(owner = "client!wt", name = "a", descriptor = "(BI)[I", line = 9)
    public final int[] method30(byte arg0, int arg1) {
        if (arg0 >= -6) {
            field2560 = -79;
        }
        ++field2545;
        int[] var3 = super.field4344.method130(arg1, 68);
        if (super.field4344.field286) {
            int[] var4 = this.method1824(0, false, arg1);
            for (int var5 = 0; ~class181.field2495 < ~var5; ++var5) {
                int var6 = var4[var5] >> 4;
                if (var6 < 0) {
                    var6 = 0;
                }
                if (var6 > 256) {
                    var6 = 256;
                }
                var3[var5] = this.field2553[var6];
            }
        }
        return var3;
    }

    @OriginalMember(owner = "client!wt", name = "f", descriptor = "(I)V", line = 52)
    private final void method1075(int arg0) {
        ++field2548;
        int[] var2 = this.field2551[0];
        int var3 = 93 % ((-52 - arg0) / 34);
        int[] var4 = this.field2551[1];
        int[] var5 = this.field2551[this.field2551.length + -2];
        int[] var6 = this.field2551[this.field2551.length + -1];
        this.field2557 = new int[] { var5[0] + -var6[0] + var5[0], var5[1] + -var6[1] + var5[1] };
        this.field2550 = new int[] { var2[0] + -var4[0] + var2[0], var2[1] + -var4[1] + var2[1] };
    }

    @OriginalMember(owner = "client!wt", name = "d", descriptor = "(IZI)B", line = 78)
    public static final byte method1076(int arg0, boolean arg1, int arg2) {
        ++field2547;
        if (!arg1) {
            field2555 = null;
        }
        if (arg2 != 9) {
            return 0;
        } else {
            return (byte) (~(arg0 & 1) == -1 ? 1 : 2);
        }
    }

    @OriginalMember(owner = "client!wt", name = "g", descriptor = "(I)V", line = 97)
    private final void method1077(int arg0) {
        int var2 = this.field2549;
        if (~var2 != -3) {
            if (var2 == 1) {
                for (int var3 = 0; ~var3 > -258; ++var3) {
                    int var4 = var3 << 4;
                    int var5;
                    for (var5 = 1; ~(this.field2551.length + -1) < ~var5 && var4 >= this.field2551[var5][0]; ++var5) {
                    }
                    int[] var6 = this.field2551[var5 + -1];
                    int[] var7 = this.field2551[var5];
                    int var8 = (-var6[0] + var4 << 12) / (var7[0] + -var6[0]);
                    int var9 = -class461.field6247[255 & var8 >> 5] + 4096 >> 1;
                    int var10 = -var9 + 4096;
                    int var11 = var6[1] * var10 + var7[1] * var9 >> 12;
                    if (~var11 >= 32767) {
                        var11 = -32767;
                    }
                    if (var11 >= 32768) {
                        var11 = 32767;
                    }
                    this.field2553[var3] = (short) var11;
                }
            } else {
                for (int var12 = 0; ~var12 > -258; ++var12) {
                    int var13 = var12 << 4;
                    int var14;
                    for (var14 = 1; ~(this.field2551.length - 1) < ~var14 && ~this.field2551[var14][0] >= ~var13; ++var14) {
                    }
                    int[] var15 = this.field2551[var14 - 1];
                    int[] var16 = this.field2551[var14];
                    int var17 = (var13 - var15[0] << 12) / (var16[0] + -var15[0]);
                    int var18 = -var17 + 4096;
                    int var19 = var15[1] * var18 + var16[1] * var17 >> 12;
                    if (var19 <= -32768) {
                        var19 = -32767;
                    }
                    if (~var19 <= -32769) {
                        var19 = 32767;
                    }
                    this.field2553[var12] = (short) var19;
                }
            }
        } else {
            for (int var20 = 0; ~var20 > -258; ++var20) {
                int var21 = var20 << 4;
                int var22;
                for (var22 = 1; var22 < this.field2551.length + -1 && ~this.field2551[var22][0] >= ~var21; ++var22) {
                }
                int[] var23 = this.field2551[var22 - 1];
                int[] var24 = this.field2551[var22];
                int var25 = this.method1078(256, var22 + -2)[1];
                int var26 = var23[1];
                int var27 = var24[1];
                int var28 = this.method1078(256, var22 + 1)[1];
                int var29 = (var21 - var23[0] << 12) / (var24[0] + -var23[0]);
                int var30 = var29 * var29 >> 12;
                int var31 = -var27 + var28 + -var25 + var26;
                int var32 = -var26 + var25 + -var31;
                int var33 = -var25 + var27;
                int var35 = (var29 * var31 >> 12) * var30 >> 12;
                int var36 = var30 * var32 >> 12;
                int var37 = var29 * var33 >> 12;
                int var38 = var35 + var37 + var36 - -var26;
                if (~var38 >= 32767) {
                    var38 = -32767;
                }
                if (var38 >= 32768) {
                    var38 = 32767;
                }
                this.field2553[var20] = (short) var38;
            }
        }
        if (arg0 != -16702) {
            this.method33(103, (class32) null, 88);
        }
        ++field2552;
    }

    @OriginalMember(owner = "client!wt", name = "d", descriptor = "(I)V", line = 274)
    public final void method65(int arg0) {
        if (this.field2551 == null) {
            this.field2551 = new int[][] { new int[2], { 4096, 4096 } };
        }
        ++field2556;
        if (this.field2551.length < 2) {
            throw new RuntimeException("Curve operation requires at least two markers");
        } else {
            if (arg0 >= -100) {
                this.method33(-36, (class32) null, 28);
            }
            if (~this.field2549 == -3) {
                this.method1075(-109);
            }
            class66.method437(false);
            this.method1077(-16702);
        }
    }

    @OriginalMember(owner = "client!wt", name = "b", descriptor = "(II)[I", line = 299)
    private final int[] method1078(int arg0, int arg1) {
        ++field2546;
        if (arg1 < 0) {
            return this.field2550;
        } else if (~this.field2551.length >= ~arg1) {
            return this.field2557;
        } else {
            if (arg0 != 256) {
                field2559 = null;
            }
            return this.field2551[arg1];
        }
    }

    @OriginalMember(owner = "client!wt", name = "a", descriptor = "(ILbt;I)V", line = 317)
    public final void method33(int arg0, class32 arg1, int arg2) {
        if (arg2 > -3) {
            field2555 = null;
        }
        if (arg0 == 0) {
            this.field2549 = arg1.method201((byte) -115);
            this.field2551 = new int[arg1.method201((byte) -121)][2];
            for (int var4 = 0; ~var4 > ~this.field2551.length; ++var4) {
                this.field2551[var4][0] = arg1.method215((byte) 110);
                this.field2551[var4][1] = arg1.method215((byte) 98);
            }
        }
        ++field2554;
    }

    @OriginalMember(owner = "client!wt", name = "c", descriptor = "(Z)V", line = 350)
    public static void method1079(boolean arg0) {
        if (!arg0) {
            method1076(47, true, -7);
        }
        field2559 = null;
        field2555 = null;
    }
}
