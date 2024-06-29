import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!oh")
public class class427 extends class362 {

    @OriginalMember(owner = "client!oh", name = "I", descriptor = "I")
    private int field5833 = 0;

    @OriginalMember(owner = "client!oh", name = "R", descriptor = "[S")
    private short[] field5842 = new short[257];

    @OriginalMember(owner = "client!oh", name = "y", descriptor = "I")
    public static int field5824 = 0;

    @OriginalMember(owner = "client!oh", name = "C", descriptor = "I")
    public static int field5828 = 0;

    @OriginalMember(owner = "client!oh", name = "z", descriptor = "I")
    public static int field5825;

    @OriginalMember(owner = "client!oh", name = "A", descriptor = "I")
    public static int field5826;

    @OriginalMember(owner = "client!oh", name = "B", descriptor = "I")
    public static int field5827;

    @OriginalMember(owner = "client!oh", name = "D", descriptor = "I")
    public static int field5829;

    @OriginalMember(owner = "client!oh", name = "E", descriptor = "I")
    public static int field5830;

    @OriginalMember(owner = "client!oh", name = "F", descriptor = "I")
    public static int field5831;

    @OriginalMember(owner = "client!oh", name = "H", descriptor = "I")
    public static int field5832;

    @OriginalMember(owner = "client!oh", name = "K", descriptor = "I")
    public static int field5835;

    @OriginalMember(owner = "client!oh", name = "L", descriptor = "I")
    public static int field5836;

    @OriginalMember(owner = "client!oh", name = "M", descriptor = "I")
    public static int field5837;

    @OriginalMember(owner = "client!oh", name = "P", descriptor = "I")
    public static int field5840;

    @OriginalMember(owner = "client!oh", name = "J", descriptor = "[I")
    public static int[] field5834;

    @OriginalMember(owner = "client!oh", name = "O", descriptor = "[I")
    private int[] field5839;

    @OriginalMember(owner = "client!oh", name = "Q", descriptor = "[I")
    private int[] field5841;

    @OriginalMember(owner = "client!oh", name = "N", descriptor = "[[I")
    private int[][] field5838;

    @OriginalMember(owner = "client!oh", name = "a", descriptor = "(ZLlt;)V", line = 3)
    public static final void method2513(boolean arg0, class704 arg1) {
        arg1.field9681 = null;
        if (arg0) {
            field5824 = 33;
        }
        ++field5831;
        if (~class478.field6465 > -21) {
            class84.field1147.method1600(arg1, -3);
            ++class478.field6465;
        }
    }

    @OriginalMember(owner = "client!oh", name = "c", descriptor = "(I)V", line = 21)
    public static void method2514(int arg0) {
        field5834 = null;
        int var1 = -108 % ((51 - arg0) / 51);
    }

    @OriginalMember(owner = "client!oh", name = "a", descriptor = "(I)V", line = 32)
    public final void method160(int arg0) {
        ++field5826;
        if (this.field5838 == null) {
            this.field5838 = new int[][] { new int[2], { 4096, 4096 } };
        }
        if (this.field5838.length < 2) {
            throw new RuntimeException("Curve operation requires at least two markers");
        } else {
            if (this.field5833 == 2) {
                this.method2519(arg0 + 996226837);
            }
            if (arg0 != -996226836) {
                field5828 = -90;
            }
            class713.method3968(0);
            this.method2515(-31);
        }
    }

    @OriginalMember(owner = "client!oh", name = "f", descriptor = "(I)V", line = 57)
    private final void method2515(int arg0) {
        ++field5836;
        int var2 = this.field5833;
        if (~var2 != -3) {
            if (var2 == 1) {
                for (int var3 = 0; ~var3 > -258; ++var3) {
                    int var4 = var3 << 4;
                    int var5;
                    for (var5 = 1; ~var5 > ~(this.field5838.length + -1) && ~this.field5838[var5][0] >= ~var4; ++var5) {
                    }
                    int[] var6 = this.field5838[var5 + -1];
                    int[] var7 = this.field5838[var5];
                    int var8 = (-var6[0] + var4 << 12) / (var7[0] + -var6[0]);
                    int var9 = -class551.field7540[255 & var8 >> 5] + 4096 >> 1;
                    int var10 = -var9 + 4096;
                    int var11 = var6[1] * var10 - -(var7[1] * var9) >> 12;
                    if (var11 <= -32768) {
                        var11 = -32767;
                    }
                    if (var11 >= 32768) {
                        var11 = 32767;
                    }
                    this.field5842[var3] = (short) var11;
                }
            } else {
                for (int var12 = 0; var12 < 257; ++var12) {
                    int var13 = var12 << 4;
                    int var14;
                    for (var14 = 1; ~(this.field5838.length + -1) < ~var14 && this.field5838[var14][0] <= var13; ++var14) {
                    }
                    int[] var15 = this.field5838[var14 - 1];
                    int[] var16 = this.field5838[var14];
                    int var17 = (-var15[0] + var13 << 12) / (var16[0] - var15[0]);
                    int var18 = -var17 + 4096;
                    int var19 = var15[1] * var18 + var16[1] * var17 >> 12;
                    if (~var19 >= 32767) {
                        var19 = -32767;
                    }
                    if (~var19 <= -32769) {
                        var19 = 32767;
                    }
                    this.field5842[var12] = (short) var19;
                }
            }
        } else {
            for (int var20 = 0; ~var20 > -258; ++var20) {
                int var21 = var20 << 4;
                int var22;
                for (var22 = 1; ~(this.field5838.length + -1) < ~var22 && ~var21 <= ~this.field5838[var22][0]; ++var22) {
                }
                int[] var23 = this.field5838[var22 + -1];
                int[] var24 = this.field5838[var22];
                int var25 = this.method2516(var22 - 2, -95)[1];
                int var26 = var23[1];
                int var27 = var24[1];
                int var28 = this.method2516(var22 - -1, -108)[1];
                int var29 = (-var23[0] + var21 << 12) / (var24[0] - var23[0]);
                int var30 = var29 * var29 >> 12;
                int var31 = -var27 + var28 - -var26 + -var25;
                int var32 = -var26 + var25 + -var31;
                int var33 = -var25 + var27;
                int var35 = (var29 * var31 >> 12) * var30 >> 12;
                int var36 = var30 * var32 >> 12;
                int var37 = var29 * var33 >> 12;
                int var38 = var36 - -var26 + var35 + var37;
                if (~var38 >= 32767) {
                    var38 = -32767;
                }
                if (var38 >= 32768) {
                    var38 = 32767;
                }
                this.field5842[var20] = (short) var38;
            }
        }
        if (arg0 > -29) {
            this.method154((class93) null, -7, 85);
        }
    }

    @OriginalMember(owner = "client!oh", name = "a", descriptor = "(Lfca;II)V", line = 239)
    public final void method154(class93 arg0, int arg1, int arg2) {
        if (~arg1 == arg2) {
            this.field5833 = arg0.method793((byte) 77);
            this.field5838 = new int[arg0.method793((byte) 91)][2];
            for (int var4 = 0; ~this.field5838.length < ~var4; ++var4) {
                this.field5838[var4][0] = arg0.method763(74);
                this.field5838[var4][1] = arg0.method763(96);
            }
        }
        ++field5829;
    }

    @OriginalMember(owner = "client!oh", name = "b", descriptor = "(II)[I", line = 268)
    private final int[] method2516(int arg0, int arg1) {
        ++field5840;
        if (arg0 < 0) {
            return this.field5841;
        } else if (this.field5838.length <= arg0) {
            return this.field5839;
        } else {
            if (arg1 >= -80) {
                this.field5839 = null;
            }
            return this.field5838[arg0];
        }
    }

    @OriginalMember(owner = "client!oh", name = "a", descriptor = "(II)[I", line = 287)
    public final int[] method156(int arg0, int arg1) {
        ++field5827;
        int[] var3 = super.field4927.method808(-124, arg1);
        if (super.field4927.field1471) {
            int[] var4 = this.method2221(0, arg1, arg0 ^ -2026769294);
            for (int var5 = 0; ~class769.field10597 < ~var5; ++var5) {
                int var6 = var4[var5] >> 4;
                if (~var6 > -1) {
                    var6 = 0;
                }
                if (~var6 < -257) {
                    var6 = 256;
                }
                var3[var5] = this.field5842[var6];
            }
        }
        return arg0 != -2026769311 ? null : var3;
    }

    @OriginalMember(owner = "client!oh", name = "<init>", descriptor = "()V", line = 401)
    public class427() {
        super(1, true);
    }

    @OriginalMember(owner = "client!oh", name = "a", descriptor = "(BI)V", line = 339)
    public static final void method2517(byte arg0, int arg1) {
        class211.field3161 = arg1;
        ++field5825;
        int var2 = 110 % ((-46 - arg0) / 44);
        class499.field6826 = -1;
        class499.field6826 = -1;
        class538.method3044(-98);
    }

    @OriginalMember(owner = "client!oh", name = "a", descriptor = "(ILfca;)V", line = 352)
    public static final void method2518(int arg0, class93 arg1) {
        ++field5837;
        for (int var2 = 0; ~class686.field9541 < ~var2; ++var2) {
            int var3 = arg1.method746(false);
            int var4 = arg1.method763(arg0 ^ 11138);
            if (~var4 == -65536) {
                var4 = -1;
            }
            if (class224.field3283[var3] != null) {
                class224.field3283[var3].field5326 = var4;
            }
        }
        if (arg0 != -11200) {
            method2518(-42, (class93) null);
        }
    }

    @OriginalMember(owner = "client!oh", name = "g", descriptor = "(I)V", line = 382)
    private final void method2519(int arg0) {
        ++field5832;
        int[] var2 = this.field5838[0];
        int[] var3 = this.field5838[1];
        int[] var4 = this.field5838[this.field5838.length - 2];
        int[] var5 = this.field5838[this.field5838.length + -1];
        this.field5841 = new int[] { var2[0] - (var3[0] - var2[0]), var2[arg0] - var3[1] - -var2[1] };
        this.field5839 = new int[] { -var5[0] - -var4[0] + var4[0], -var5[1] - (-var4[1] - var4[1]) };
    }
}
