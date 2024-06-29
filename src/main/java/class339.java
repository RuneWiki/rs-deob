import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ew")
public class class339 extends class371 {

    @OriginalMember(owner = "client!ew", name = "S", descriptor = "[S")
    private short[] field4973 = new short[257];

    @OriginalMember(owner = "client!ew", name = "R", descriptor = "I")
    private int field4972 = 0;

    @OriginalMember(owner = "client!ew", name = "O", descriptor = "Lqp;")
    public static class586 field4969 = new class586(15, 2);

    @OriginalMember(owner = "client!ew", name = "Y", descriptor = "I")
    public static int field4979 = 0;

    @OriginalMember(owner = "client!ew", name = "J", descriptor = "I")
    public static int field4965;

    @OriginalMember(owner = "client!ew", name = "M", descriptor = "I")
    public static int field4967;

    @OriginalMember(owner = "client!ew", name = "N", descriptor = "I")
    public static int field4968;

    @OriginalMember(owner = "client!ew", name = "P", descriptor = "I")
    public static int field4970;

    @OriginalMember(owner = "client!ew", name = "T", descriptor = "I")
    public static int field4974;

    @OriginalMember(owner = "client!ew", name = "U", descriptor = "I")
    public static int field4975;

    @OriginalMember(owner = "client!ew", name = "V", descriptor = "I")
    public static int field4976;

    @OriginalMember(owner = "client!ew", name = "W", descriptor = "I")
    public static int field4977;

    @OriginalMember(owner = "client!ew", name = "X", descriptor = "I")
    public static int field4978;

    @OriginalMember(owner = "client!ew", name = "I", descriptor = "[I")
    private int[] field4964;

    @OriginalMember(owner = "client!ew", name = "Q", descriptor = "[I")
    private int[] field4971;

    @OriginalMember(owner = "client!ew", name = "L", descriptor = "[[I")
    private int[][] field4966;

    @OriginalMember(owner = "client!ew", name = "a", descriptor = "(Lhba;I)I", line = 5)
    public static final int method2104(class404 arg0, int arg1) {
        ++field4978;
        if (arg1 != 16868) {
            return -71;
        } else if (class248.field3625 != arg0) {
            if (class524.field7760 != arg0) {
                if (class352.field5118 != arg0) {
                    if (class455.field6635 == arg0) {
                        return 34166;
                    } else {
                        throw new IllegalArgumentException();
                    }
                } else {
                    return 34168;
                }
            } else {
                return 34167;
            }
        } else {
            return 5890;
        }
    }

    @OriginalMember(owner = "client!ew", name = "<init>", descriptor = "()V", line = 32)
    public class339() {
        super(1, true);
    }

    @OriginalMember(owner = "client!ew", name = "a", descriptor = "(I)V", line = 35)
    public final void method212(int arg0) {
        if (this.field4966 == null) {
            this.field4966 = new int[][] { new int[2], { 4096, 4096 } };
        }
        ++field4977;
        if (~this.field4966.length > -3) {
            throw new RuntimeException("Curve operation requires at least two markers");
        } else {
            if (arg0 != -19103) {
                this.field4972 = 62;
            }
            if (~this.field4972 == -3) {
                this.method2108(1);
            }
            class568.method3315(false);
            this.method2110(0);
        }
    }

    @OriginalMember(owner = "client!ew", name = "a", descriptor = "(II)[I", line = 58)
    private final int[] method2105(int arg0, int arg1) {
        ++field4965;
        if (arg1 <= 111) {
            return null;
        } else if (~arg0 > -1) {
            return this.field4964;
        } else {
            return this.field4966.length <= arg0 ? this.field4971 : this.field4966[arg0];
        }
    }

    @OriginalMember(owner = "client!ew", name = "a", descriptor = "(I[Lwca;I)V", line = 77)
    public static final void method2106(int arg0, class311[] arg1, int arg2) {
        for (int var3 = 0; arg1.length > var3; ++var3) {
            class311 var4 = arg1[var3];
            if (var4 != null && var4.field4551 == arg2 && !client.method3618(var4)) {
                if (~var4.field4655 == -1) {
                    method2106(-1, arg1, var4.field4667);
                    if (var4.field4652 != null) {
                        method2106(-1, var4.field4652, var4.field4667);
                    }
                    class184 var5 = (class184) class600.field8865.method1333((long) var4.field4667, false);
                    if (var5 != null) {
                        class611.method3566(var5.field2796, -1);
                    }
                }
                if (~var4.field4655 == -7 && ~var4.field4628 != 0) {
                    class224 var6 = class470.field7205.method3498(false, var4.field4628);
                    if (var6 != null) {
                        var4.field4542 += class394.field5735;
                        while (var4.field4542 > var6.field3307[var4.field4613]) {
                            var4.field4542 -= var6.field3307[var4.field4613];
                            ++var4.field4613;
                            if (~var4.field4613 <= ~var6.field3296.length) {
                                var4.field4613 -= var6.field3290;
                                if (var4.field4613 < 0 || var6.field3296.length <= var4.field4613) {
                                    var4.field4613 = 0;
                                }
                            }
                            var4.field4516 = var4.field4613 - -1;
                            if (~var4.field4516 <= ~var6.field3296.length) {
                                var4.field4516 -= var6.field3290;
                                if (~var4.field4516 > -1 || ~var6.field3296.length >= ~var4.field4516) {
                                    var4.field4516 = -1;
                                }
                            }
                            class619.method3586(51, var4);
                        }
                    }
                }
            }
        }
        ++field4975;
        if (arg0 != -1) {
            method2106(114, (class311[]) null, -51);
        }
    }

    @OriginalMember(owner = "client!ew", name = "b", descriptor = "(B)V", line = 162)
    public static void method2107(byte arg0) {
        if (arg0 < 74) {
            method2109(25);
        }
        field4969 = null;
    }

    @OriginalMember(owner = "client!ew", name = "g", descriptor = "(I)V", line = 175)
    private final void method2108(int arg0) {
        ++field4967;
        int[] var2 = this.field4966[0];
        int[] var3 = this.field4966[arg0];
        int[] var4 = this.field4966[this.field4966.length + -2];
        int[] var5 = this.field4966[this.field4966.length + -1];
        this.field4964 = new int[] { var2[0] - var3[0] - -var2[0], var2[1] - var3[1] - -var2[1] };
        this.field4971 = new int[] { var4[0] + -var5[0] + var4[0], var4[1] - (-var4[1] - -var5[1]) };
    }

    @OriginalMember(owner = "client!ew", name = "b", descriptor = "(BI)[I", line = 200)
    public final int[] method79(byte arg0, int arg1) {
        ++field4968;
        int[] var3 = super.field5378.method1451(-119, arg1);
        if (super.field5378.field3254) {
            int[] var4 = this.method2260((byte) -52, arg1, 0);
            for (int var5 = 0; var5 < class41.field455; ++var5) {
                int var6 = var4[var5] >> 4;
                if (var6 < 0) {
                    var6 = 0;
                }
                if (var6 > 256) {
                    var6 = 256;
                }
                var3[var5] = this.field4973[var6];
            }
        }
        return arg0 >= -80 ? null : var3;
    }

    @OriginalMember(owner = "client!ew", name = "h", descriptor = "(I)V", line = 241)
    public static final void method2109(int arg0) {
        class455.field6637 = null;
        class532.field7878 = null;
        class597.field8787 = null;
        ++field4970;
        class145.field1878 = null;
        if (arg0 != -30415) {
            field4979 = 124;
        }
        class125.field1644 = null;
        class94.field1164 = null;
        class32.field329 = null;
        class257.field3761 = null;
        class465.field6720 = null;
    }

    @OriginalMember(owner = "client!ew", name = "a", descriptor = "(IBLps;)V", line = 261)
    public final void method81(int arg0, byte arg1, class428 arg2) {
        int var4 = 105 / ((arg1 - -15) / 39);
        if (~arg0 == -1) {
            this.field4972 = arg2.method2561((byte) 119);
            this.field4966 = new int[arg2.method2561((byte) -66)][2];
            for (int var5 = 0; ~var5 > ~this.field4966.length; ++var5) {
                this.field4966[var5][0] = arg2.method2620(38);
                this.field4966[var5][1] = arg2.method2620(57);
            }
        }
        ++field4976;
    }

    @OriginalMember(owner = "client!ew", name = "i", descriptor = "(I)V", line = 297)
    private final void method2110(int arg0) {
        int var2 = this.field4972;
        if (~var2 != -3) {
            if (var2 == 1) {
                for (int var3 = 0; var3 < 257; ++var3) {
                    int var4 = var3 << 4;
                    int var5;
                    for (var5 = 1; ~var5 > ~(this.field4966.length + -1) && var4 >= this.field4966[var5][0]; ++var5) {
                    }
                    int[] var6 = this.field4966[var5 + -1];
                    int[] var7 = this.field4966[var5];
                    int var8 = (var4 - var6[0] << 12) / (var7[0] - var6[0]);
                    int var9 = -class289.field4252[(8164 & var8) >> 5] + 4096 >> 1;
                    int var10 = -var9 + 4096;
                    int var11 = var6[1] * var10 + var7[1] * var9 >> 12;
                    if (var11 <= -32768) {
                        var11 = -32767;
                    }
                    if (var11 >= 32768) {
                        var11 = 32767;
                    }
                    this.field4973[var3] = (short) var11;
                }
            } else {
                for (int var12 = 0; var12 < 257; ++var12) {
                    int var13 = var12 << 4;
                    int var14;
                    for (var14 = 1; ~var14 > ~(this.field4966.length - 1) && this.field4966[var14][0] <= var13; ++var14) {
                    }
                    int[] var15 = this.field4966[var14 - 1];
                    int[] var16 = this.field4966[var14];
                    int var17 = (-var15[0] + var13 << 12) / (var16[0] + -var15[0]);
                    int var18 = 4096 - var17;
                    int var19 = var15[1] * var18 + var16[1] * var17 >> 12;
                    if (var19 <= -32768) {
                        var19 = -32767;
                    }
                    if (~var19 <= -32769) {
                        var19 = 32767;
                    }
                    this.field4973[var12] = (short) var19;
                }
            }
        } else {
            for (int var20 = 0; ~var20 > -258; ++var20) {
                int var21 = var20 << 4;
                int var22;
                for (var22 = 1; ~(this.field4966.length - 1) < ~var22 && ~this.field4966[var22][0] >= ~var21; ++var22) {
                }
                int[] var23 = this.field4966[var22 + -1];
                int[] var24 = this.field4966[var22];
                int var25 = this.method2105(var22 - 2, arg0 ^ 112)[1];
                int var26 = var23[1];
                int var27 = var24[1];
                int var28 = this.method2105(var22 - -1, 119)[1];
                int var29 = (-var23[0] + var21 << 12) / (var24[0] + -var23[0]);
                int var30 = var29 * var29 >> 12;
                int var31 = -var25 + var26 + -var27 + var28;
                int var32 = var25 - var31 + -var26;
                int var33 = -var25 + var27;
                int var35 = (var29 * var31 >> 12) * var30 >> 12;
                int var36 = var30 * var32 >> 12;
                int var37 = var29 * var33 >> 12;
                int var38 = var35 + var36 + var26 + var37;
                if (~var38 >= 32767) {
                    var38 = -32767;
                }
                if (~var38 <= -32769) {
                    var38 = 32767;
                }
                this.field4973[var20] = (short) var38;
            }
        }
        if (arg0 != 0) {
            this.field4966 = null;
        }
        ++field4974;
    }
}
