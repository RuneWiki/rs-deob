import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!jb")
public class class379 extends class263 {

    @OriginalMember(owner = "client!jb", name = "I", descriptor = "[S")
    private short[] field5701 = new short[257];

    @OriginalMember(owner = "client!jb", name = "Q", descriptor = "I")
    private int field5709 = 0;

    @OriginalMember(owner = "client!jb", name = "L", descriptor = "I")
    public static int field5704 = 0;

    @OriginalMember(owner = "client!jb", name = "P", descriptor = "[S")
    public static short[] field5708 = new short[] { -10304, 9104, -1, -1, -1 };

    @OriginalMember(owner = "client!jb", name = "E", descriptor = "I")
    public static int field5697;

    @OriginalMember(owner = "client!jb", name = "F", descriptor = "I")
    public static int field5698;

    @OriginalMember(owner = "client!jb", name = "G", descriptor = "I")
    public static int field5699;

    @OriginalMember(owner = "client!jb", name = "H", descriptor = "I")
    public static int field5700;

    @OriginalMember(owner = "client!jb", name = "K", descriptor = "I")
    public static int field5703;

    @OriginalMember(owner = "client!jb", name = "M", descriptor = "I")
    public static int field5705;

    @OriginalMember(owner = "client!jb", name = "R", descriptor = "I")
    public static int field5710;

    @OriginalMember(owner = "client!jb", name = "T", descriptor = "I")
    public static int field5712;

    @OriginalMember(owner = "client!jb", name = "N", descriptor = "[I")
    private int[] field5706;

    @OriginalMember(owner = "client!jb", name = "O", descriptor = "[I")
    private int[] field5707;

    @OriginalMember(owner = "client!jb", name = "S", descriptor = "[I")
    public static int[] field5711;

    @OriginalMember(owner = "client!jb", name = "J", descriptor = "[[I")
    private int[][] field5702;

    @OriginalMember(owner = "client!jb", name = "b", descriptor = "(II)[I", line = 4)
    private final int[] method2234(int arg0, int arg1) {
        ++field5710;
        if (~arg0 > -1) {
            return this.field5707;
        } else if (arg1 >= -87) {
            return null;
        } else {
            return this.field5702.length <= arg0 ? this.field5706 : this.field5702[arg0];
        }
    }

    @OriginalMember(owner = "client!jb", name = "a", descriptor = "(IIIIIZZ)V", line = 22)
    public static final void method2235(int arg0, int arg1, int arg2, int arg3, int arg4, boolean arg5, boolean arg6) {
        class9.field75 = arg0;
        class324.field5060 = 1 << class9.field75;
        class280.field4230 = class324.field5060 >> 1;
        class187.field2750 = (int) Math.sqrt((double) (class280.field4230 * class280.field4230 + class280.field4230 * class280.field4230));
        class145.field2181 = class324.field5060 >> 2;
        class342.field5254 = class324.field5060;
        class445.field6562 = arg2;
        class167.field2473 = arg3;
        class489.field7290 = arg4;
        class175.field2574 = new class306[arg1][class445.field6562][class167.field2473];
        class213.field3048 = new class337[arg1];
        if (arg5) {
            class521.field7668 = new int[class445.field6562][class167.field2473];
            class282.field4269 = new byte[class445.field6562][class167.field2473];
            class364.field5563 = new short[class445.field6562][class167.field2473];
            class435.field6422 = new class306[1][class445.field6562][class167.field2473];
            class420.field6281 = new class337[1];
        } else {
            class521.field7668 = null;
            class282.field4269 = null;
            class364.field5563 = null;
            class435.field6422 = null;
            class420.field6281 = null;
        }
        if (arg6) {
            class98.field1508 = new long[arg1][arg2][arg3];
            class486.field7238 = new class466[65535];
            class120.field1839 = new boolean[65535];
            class309.field4634 = 0;
        } else {
            class98.field1508 = null;
            class486.field7238 = null;
            class120.field1839 = null;
            class309.field4634 = 0;
        }
        class502.method2975(false);
        class426.field6353 = new class355[1000];
        class146.field2190 = 0;
        class95.field1476 = new class355[1000];
        class386.field5813 = 0;
        class500.field7400 = new int[arg1][class445.field6562 + 1][class167.field2473 + 1];
        class132.field1979 = new class522[5000];
        class468.field6866 = 0;
        class522.field7677 = new boolean[class489.field7290 + class489.field7290 + 1][class489.field7290 + class489.field7290 + 1];
        class283.field4278 = new boolean[class489.field7290 + class489.field7290 + 2][class489.field7290 + class489.field7290 + 2];
        class159.field2393 = null;
    }

    @OriginalMember(owner = "client!jb", name = "d", descriptor = "(I)V", line = 80)
    private final void method2236(int arg0) {
        ++field5697;
        int var2 = this.field5709;
        if (var2 != 2) {
            if (var2 == 1) {
                for (int var3 = 0; ~var3 > -258; ++var3) {
                    int var4 = var3 << 4;
                    int var5;
                    for (var5 = 1; this.field5702.length + -1 > var5 && ~var4 <= ~this.field5702[var5][0]; ++var5) {
                    }
                    int[] var6 = this.field5702[var5 + -1];
                    int[] var7 = this.field5702[var5];
                    int var8 = (-var6[0] + var4 << 12) / (var7[0] + -var6[0]);
                    int var9 = -class14.field188[255 & var8 >> 5] + 4096 >> 1;
                    int var10 = -var9 + 4096;
                    int var11 = var6[1] * var10 + var7[1] * var9 >> 12;
                    if (~var11 >= 32767) {
                        var11 = -32767;
                    }
                    if (~var11 <= -32769) {
                        var11 = 32767;
                    }
                    this.field5701[var3] = (short) var11;
                }
            } else {
                for (int var12 = 0; ~var12 > -258; ++var12) {
                    int var13 = var12 << 4;
                    int var14;
                    for (var14 = 1; var14 < this.field5702.length - 1 && this.field5702[var14][0] <= var13; ++var14) {
                    }
                    int[] var15 = this.field5702[var14 + -1];
                    int[] var16 = this.field5702[var14];
                    int var17 = (-var15[0] + var13 << 12) / (var16[0] + -var15[0]);
                    int var18 = -var17 + 4096;
                    int var19 = var15[1] * var18 + var16[1] * var17 >> 12;
                    if (var19 <= -32768) {
                        var19 = -32767;
                    }
                    if (~var19 <= -32769) {
                        var19 = 32767;
                    }
                    this.field5701[var12] = (short) var19;
                }
            }
        } else {
            for (int var20 = 0; var20 < 257; ++var20) {
                int var21 = var20 << 4;
                int var22;
                for (var22 = 1; this.field5702.length + -1 > var22 && ~var21 <= ~this.field5702[var22][0]; ++var22) {
                }
                int[] var23 = this.field5702[var22 + -1];
                int[] var24 = this.field5702[var22];
                int var25 = this.method2234(var22 + -2, -100)[1];
                int var26 = var23[1];
                int var27 = var24[1];
                int var28 = this.method2234(var22 + 1, -92)[1];
                int var29 = (var21 - var23[0] << 12) / (var24[0] - var23[0]);
                int var30 = var29 * var29 >> 12;
                int var31 = -var25 - -var26 + -var27 + var28;
                int var32 = -var31 + var25 + -var26;
                int var33 = -var25 + var27;
                int var35 = (var29 * var31 >> 12) * var30 >> 12;
                int var36 = var30 * var32 >> 12;
                int var37 = var29 * var33 >> 12;
                int var38 = var35 + var37 + var36 + var26;
                if (~var38 >= 32767) {
                    var38 = -32767;
                }
                if (var38 >= 32768) {
                    var38 = 32767;
                }
                this.field5701[var20] = (short) var38;
            }
        }
        if (arg0 <= 65) {
            method2239(59, (String) null);
        }
    }

    @OriginalMember(owner = "client!jb", name = "b", descriptor = "(IBI)I", line = 265)
    public static final int method2237(int arg0, byte arg1, int arg2) {
        ++field5705;
        int var3 = class192.method1276(789221, arg2 - 1, arg0 + -1) - (-class192.method1276(789221, arg2 + 1, arg0 + -1) - class192.method1276(789221, arg2 + -1, arg0 + 1)) + class192.method1276(789221, arg2 + 1, arg0 + 1);
        int var4 = -62 / ((arg1 - -25) / 56);
        int var5 = class192.method1276(789221, arg2 - 1, arg0) - -class192.method1276(789221, arg2 - -1, arg0) + class192.method1276(789221, arg2, arg0 + -1) - -class192.method1276(789221, arg2, arg0 - -1);
        int var6 = class192.method1276(789221, arg2, arg0);
        return var3 / 16 + var5 / 8 + var6 / 4;
    }

    @OriginalMember(owner = "client!jb", name = "<init>", descriptor = "()V", line = 281)
    public class379() {
        super(1, true);
    }

    @OriginalMember(owner = "client!jb", name = "c", descriptor = "(B)V", line = 291)
    public final void method748(byte arg0) {
        if (this.field5702 == null) {
            this.field5702 = new int[][] { new int[2], { 4096, 4096 } };
        }
        ++field5712;
        if (this.field5702.length < 2) {
            throw new RuntimeException("Curve operation requires at least two markers");
        } else {
            if (~this.field5709 == -3) {
                this.method2238(24154);
            }
            class200.method1326(74);
            if (arg0 == 110) {
                this.method2236(arg0 + -3);
            }
        }
    }

    @OriginalMember(owner = "client!jb", name = "e", descriptor = "(I)V", line = 314)
    private final void method2238(int arg0) {
        ++field5699;
        if (arg0 == 24154) {
            int[] var2 = this.field5702[0];
            int[] var3 = this.field5702[1];
            int[] var4 = this.field5702[this.field5702.length - 2];
            int[] var5 = this.field5702[this.field5702.length - 1];
            this.field5706 = new int[] { var4[0] + var4[0] + -var5[0], -var5[1] - (-var4[1] - var4[1]) };
            this.field5707 = new int[] { var2[0] + var2[0] + -var3[0], var2[1] + var2[1] + -var3[1] };
        }
    }

    @OriginalMember(owner = "client!jb", name = "a", descriptor = "(ILjava/lang/String;)J", line = 340)
    public static final long method2239(int arg0, String arg1) {
        ++field5700;
        if (arg0 != -18015) {
            return 74L;
        } else {
            int var2 = arg1.length();
            long var3 = 0L;
            for (int var5 = 0; ~var5 > ~var2; ++var5) {
                var3 = (long) arg1.charAt(var5) + (var3 << 5) + -var3;
            }
            return var3;
        }
    }

    @OriginalMember(owner = "client!jb", name = "a", descriptor = "(IB)[I", line = 369)
    public final int[] method33(int arg0, byte arg1) {
        ++field5698;
        if (arg1 < 40) {
            field5711 = null;
        }
        int[] var3 = super.field3917.method41(arg0, 1);
        if (super.field3917.field91) {
            int[] var4 = this.method1644(0, 0, arg0);
            for (int var5 = 0; ~var5 > ~class367.field5597; ++var5) {
                int var6 = var4[var5] >> 4;
                if (~var6 > -1) {
                    var6 = 0;
                }
                if (var6 > 256) {
                    var6 = 256;
                }
                var3[var5] = this.field5701[var6];
            }
        }
        return var3;
    }

    @OriginalMember(owner = "client!jb", name = "a", descriptor = "(IZLgk;)V", line = 417)
    public final void method32(int arg0, boolean arg1, class468 arg2) {
        ++field5703;
        if (arg1) {
            if (~arg0 == -1) {
                this.field5709 = arg2.method2765(82);
                this.field5702 = new int[arg2.method2765(51)][2];
                for (int var4 = 0; ~this.field5702.length < ~var4; ++var4) {
                    this.field5702[var4][0] = arg2.method2727((byte) 43);
                    this.field5702[var4][1] = arg2.method2727((byte) 43);
                }
            }
        }
    }

    @OriginalMember(owner = "client!jb", name = "f", descriptor = "(I)V", line = 444)
    public static void method2240(int arg0) {
        field5711 = null;
        if (arg0 != 12493) {
            field5711 = null;
        }
        field5708 = null;
    }
}
