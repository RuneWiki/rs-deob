import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!co")
public class class62 extends class40 {

    @OriginalMember(owner = "client!co", name = "M", descriptor = "[S")
    private short[] field820 = new short[257];

    @OriginalMember(owner = "client!co", name = "L", descriptor = "I")
    private int field819 = 0;

    @OriginalMember(owner = "client!co", name = "K", descriptor = "I")
    public static int field818;

    @OriginalMember(owner = "client!co", name = "N", descriptor = "I")
    public static int field821;

    @OriginalMember(owner = "client!co", name = "O", descriptor = "I")
    public static int field822;

    @OriginalMember(owner = "client!co", name = "P", descriptor = "I")
    public static int field823;

    @OriginalMember(owner = "client!co", name = "T", descriptor = "I")
    public static int field827;

    @OriginalMember(owner = "client!co", name = "U", descriptor = "I")
    public static int field828;

    @OriginalMember(owner = "client!co", name = "V", descriptor = "I")
    public static int field829;

    @OriginalMember(owner = "client!co", name = "W", descriptor = "I")
    public static int field830;

    @OriginalMember(owner = "client!co", name = "X", descriptor = "I")
    public static int field831;

    @OriginalMember(owner = "client!co", name = "Y", descriptor = "I")
    public static int field832;

    @OriginalMember(owner = "client!co", name = "Z", descriptor = "I")
    public static int field833;

    @OriginalMember(owner = "client!co", name = "ab", descriptor = "I")
    public static int field834;

    @OriginalMember(owner = "client!co", name = "R", descriptor = "[I")
    private int[] field825;

    @OriginalMember(owner = "client!co", name = "S", descriptor = "[I")
    private int[] field826;

    @OriginalMember(owner = "client!co", name = "Q", descriptor = "[[I")
    private int[][] field824;

    @OriginalMember(owner = "client!co", name = "b", descriptor = "(BI)V", line = 4)
    public static final void method396(byte arg0, int arg1) {
        int var2 = -16 % ((arg0 - 81) / 35);
        ++field827;
        class439.field6263 = arg1;
        class243.field3604.method102((byte) -109);
    }

    @OriginalMember(owner = "client!co", name = "b", descriptor = "(II)[I", line = 18)
    private final int[] method397(int arg0, int arg1) {
        ++field823;
        if (~arg1 > arg0) {
            return this.field826;
        } else {
            return ~arg1 <= ~this.field824.length ? this.field825 : this.field824[arg1];
        }
    }

    @OriginalMember(owner = "client!co", name = "<init>", descriptor = "()V", line = 33)
    public class62() {
        super(1, true);
    }

    @OriginalMember(owner = "client!co", name = "a", descriptor = "(IIIIIII)V", line = 39)
    public static final void method398(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        ++field822;
        if (arg3 != -15537) {
            method396((byte) 33, -32);
        }
        if (arg2 >= class408.field5789 && ~arg5 >= ~class231.field3415 && ~arg4 <= ~class245.field3659 && arg1 <= class240.field3547) {
            if (~arg0 == -2) {
                class266.method1824(arg5, arg1, (byte) -114, arg2, arg6, arg4);
            } else {
                class419.method2641(arg6, arg2, arg4, arg1, arg0, (byte) 24, arg5);
            }
        } else if (~arg0 == -2) {
            class28.method153(arg5, 1, arg4, arg2, arg6, arg1);
        } else {
            class394.method2476(arg6, arg2, arg4, (byte) 104, arg5, arg0, arg1);
        }
    }

    @OriginalMember(owner = "client!co", name = "c", descriptor = "(I)V", line = 70)
    private final void method399(int arg0) {
        if (arg0 != -1) {
            this.method44((byte) 119, 52);
        }
        int var2 = this.field819;
        if (var2 != 2) {
            if (var2 == 1) {
                for (int var3 = 0; var3 < 257; ++var3) {
                    int var4 = var3 << 4;
                    int var5;
                    for (var5 = 1; ~var5 > ~(this.field824.length + -1) && ~var4 <= ~this.field824[var5][0]; ++var5) {
                    }
                    int[] var6 = this.field824[var5 + -1];
                    int[] var7 = this.field824[var5];
                    int var8 = (var4 - var6[0] << 12) / (var7[0] - var6[0]);
                    int var9 = -class185.field2650[255 & var8 >> 5] + 4096 >> 1;
                    int var10 = -var9 + 4096;
                    int var11 = var6[1] * var10 + var7[1] * var9 >> 12;
                    if (~var11 >= 32767) {
                        var11 = -32767;
                    }
                    if (var11 >= 32768) {
                        var11 = 32767;
                    }
                    this.field820[var3] = (short) var11;
                }
            } else {
                for (int var12 = 0; ~var12 > -258; ++var12) {
                    int var13 = var12 << 4;
                    int var14;
                    for (var14 = 1; this.field824.length - 1 > var14 && ~this.field824[var14][0] >= ~var13; ++var14) {
                    }
                    int[] var15 = this.field824[var14 + -1];
                    int[] var16 = this.field824[var14];
                    int var17 = (-var15[0] + var13 << 12) / (var16[0] + -var15[0]);
                    int var18 = -var17 + 4096;
                    int var19 = var15[1] * var18 + var16[1] * var17 >> 12;
                    if (var19 <= -32768) {
                        var19 = -32767;
                    }
                    if (~var19 <= -32769) {
                        var19 = 32767;
                    }
                    this.field820[var12] = (short) var19;
                }
            }
        } else {
            for (int var20 = 0; ~var20 > -258; ++var20) {
                int var21 = var20 << 4;
                int var22;
                for (var22 = 1; this.field824.length + -1 > var22 && ~var21 <= ~this.field824[var22][0]; ++var22) {
                }
                int[] var23 = this.field824[var22 + -1];
                int[] var24 = this.field824[var22];
                int var25 = this.method397(-1, var22 - 2)[1];
                int var26 = var23[1];
                int var27 = var24[1];
                int var28 = this.method397(-1, var22 + 1)[1];
                int var29 = (-var23[0] + var21 << 12) / (var24[0] + -var23[0]);
                int var30 = var29 * var29 >> 12;
                int var31 = -var25 + var28 - -var26 + -var27;
                int var32 = -var26 - var31 + var25;
                int var33 = -var25 + var27;
                int var35 = (var29 * var31 >> 12) * var30 >> 12;
                int var36 = var30 * var32 >> 12;
                int var37 = var29 * var33 >> 12;
                int var38 = var35 - (-var36 - (var37 - -var26));
                if (var38 <= -32768) {
                    var38 = -32767;
                }
                if (var38 >= 32768) {
                    var38 = 32767;
                }
                this.field820[var20] = (short) var38;
            }
        }
        ++field821;
    }

    @OriginalMember(owner = "client!co", name = "a", descriptor = "(BI)[I", line = 257)
    public final int[] method44(byte arg0, int arg1) {
        if (arg0 >= -20) {
            this.field819 = -18;
        }
        ++field828;
        int[] var3 = super.field551.method185(65280, arg1);
        if (super.field551.field441) {
            int[] var4 = this.method266((byte) -116, arg1, 0);
            for (int var5 = 0; ~class410.field5886 < ~var5; ++var5) {
                int var6 = var4[var5] >> 4;
                if (~var6 > -1) {
                    var6 = 0;
                }
                if (var6 > 256) {
                    var6 = 256;
                }
                var3[var5] = this.field820[var6];
            }
        }
        return var3;
    }

    @OriginalMember(owner = "client!co", name = "d", descriptor = "(I)V", line = 299)
    private final void method400(int arg0) {
        ++field830;
        if (arg0 != -15858) {
            this.field824 = null;
        }
        int[] var2 = this.field824[0];
        int[] var3 = this.field824[1];
        int[] var4 = this.field824[this.field824.length - 2];
        int[] var5 = this.field824[this.field824.length + -1];
        this.field826 = new int[] { -var3[0] - (-var2[0] - var2[0]), var2[1] - (-var2[1] - -var3[1]) };
        this.field825 = new int[] { var4[0] + -var5[0] + var4[0], var4[1] + -var5[1] + var4[1] };
    }

    @OriginalMember(owner = "client!co", name = "e", descriptor = "(I)V", line = 326)
    public static final void method401(int arg0) {
        ++field832;
        for (int var1 = 0; var1 < 5; ++var1) {
            class248.field3704[var1] = false;
        }
        class316.field4637 = 0;
        class435.field6214 = class386.field5469;
        class431.field6170 = class34.field434;
        class93.field1190 = class249.field3707;
        class194.field2801 = -1;
        class282.field4103 = class417.field5999;
        if (arg0 == -25247) {
            class223.field3324 = 0;
            class245.field3660 = -1;
            class405.field5683 = class278.field3990;
            class447.field6392 = class319.field4676;
            class336.field4878 = 5;
        }
    }

    @OriginalMember(owner = "client!co", name = "a", descriptor = "(IILlf;)V", line = 357)
    public final void method43(int arg0, int arg1, class130 arg2) {
        ++field818;
        if (~arg0 == -1) {
            this.field819 = arg2.method837(true);
            this.field824 = new int[arg2.method837(true)][2];
            for (int var4 = 0; ~this.field824.length < ~var4; ++var4) {
                this.field824[var4][0] = arg2.method798(false);
                this.field824[var4][1] = arg2.method798(false);
            }
        }
        if (arg1 < 79) {
            this.field825 = null;
        }
    }

    @OriginalMember(owner = "client!co", name = "g", descriptor = "(B)V", line = 385)
    public final void method39(byte arg0) {
        ++field833;
        if (this.field824 == null) {
            this.field824 = new int[][] { new int[2], { 4096, 4096 } };
        }
        if (this.field824.length < 2) {
            throw new RuntimeException("Curve operation requires at least two markers");
        } else {
            if (this.field819 == 2) {
                this.method400(-15858);
            }
            class187.method1341(true);
            if (arg0 != -23) {
                this.field824 = null;
            }
            this.method399(-1);
        }
    }
}
