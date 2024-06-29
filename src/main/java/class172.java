import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ln")
public class class172 extends class202 {

    @OriginalMember(owner = "client!ln", name = "K", descriptor = "[S")
    private short[] field2509 = new short[257];

    @OriginalMember(owner = "client!ln", name = "O", descriptor = "I")
    private int field2512 = 0;

    @OriginalMember(owner = "client!ln", name = "X", descriptor = "Lss;")
    public static class213 field2521 = new class213("Checking for updates - ", "Suche nach Updates - ", "Vérification des mises à jour - ", "Verificando atualizações - ");

    @OriginalMember(owner = "client!ln", name = "Y", descriptor = "Lbi;")
    public static class104 field2522 = new class104(52, 2);

    @OriginalMember(owner = "client!ln", name = "ab", descriptor = "[S")
    public static short[] field2524 = new short[] { -10304, 9104, -1, -1, -1 };

    @OriginalMember(owner = "client!ln", name = "Z", descriptor = "Lgf;")
    public static class46 field2523 = new class46("", 14);

    @OriginalMember(owner = "client!ln", name = "J", descriptor = "I")
    public static int field2508;

    @OriginalMember(owner = "client!ln", name = "L", descriptor = "I")
    public static int field2510;

    @OriginalMember(owner = "client!ln", name = "M", descriptor = "I")
    public static int field2511;

    @OriginalMember(owner = "client!ln", name = "P", descriptor = "I")
    public static int field2513;

    @OriginalMember(owner = "client!ln", name = "Q", descriptor = "I")
    public static int field2514;

    @OriginalMember(owner = "client!ln", name = "T", descriptor = "I")
    public static int field2517;

    @OriginalMember(owner = "client!ln", name = "U", descriptor = "I")
    public static int field2518;

    @OriginalMember(owner = "client!ln", name = "W", descriptor = "I")
    public static int field2520;

    @OriginalMember(owner = "client!ln", name = "bb", descriptor = "I")
    public static int field2525;

    @OriginalMember(owner = "client!ln", name = "I", descriptor = "Lsk;")
    public static class341 field2507;

    @OriginalMember(owner = "client!ln", name = "R", descriptor = "[I")
    private int[] field2515;

    @OriginalMember(owner = "client!ln", name = "V", descriptor = "[I")
    private int[] field2519;

    @OriginalMember(owner = "client!ln", name = "cb", descriptor = "[Lo;")
    public static class139[] field2526;

    @OriginalMember(owner = "client!ln", name = "S", descriptor = "[[I")
    private int[][] field2516;

    @OriginalMember(owner = "client!ln", name = "a", descriptor = "([JI[Ljava/lang/Object;)V")
    public static final void method1083(long[] arg0, int arg1, Object[] arg2) {
        ++field2520;
        if (arg1 != 25437) {
            field2522 = null;
        }
        class42.method259(arg0, arg0.length + -1, (byte) -54, arg2, 0);
    }

    @OriginalMember(owner = "client!ln", name = "g", descriptor = "(I)V")
    private final void method1084(int arg0) {
        ++field2513;
        int[] var2 = this.field2516[0];
        int[] var3 = this.field2516[1];
        int var4 = -59 / ((arg0 - -93) / 32);
        int[] var5 = this.field2516[this.field2516.length + -2];
        int[] var6 = this.field2516[this.field2516.length + -1];
        this.field2519 = new int[] { var5[0] - var6[0] - -var5[0], var5[1] - var6[1] + var5[1] };
        this.field2515 = new int[] { var2[0] + -var3[0] + var2[0], var2[1] - var3[1] + var2[1] };
    }

    @OriginalMember(owner = "client!ln", name = "h", descriptor = "(I)V")
    public static void method1085(int arg0) {
        field2521 = null;
        if (arg0 != -508058780) {
            field2524 = null;
        }
        field2522 = null;
        field2526 = null;
        field2523 = null;
        field2507 = null;
        field2524 = null;
    }

    @OriginalMember(owner = "client!ln", name = "b", descriptor = "(B)V")
    private final void method1086(byte arg0) {
        ++field2510;
        int var2 = this.field2512;
        if (~var2 != -3) {
            if (~var2 == -2) {
                for (int var3 = 0; var3 < 257; ++var3) {
                    int var4 = var3 << 4;
                    int var5;
                    for (var5 = 1; var5 < this.field2516.length + -1 && ~var4 <= ~this.field2516[var5][0]; ++var5) {
                    }
                    int[] var6 = this.field2516[var5 + -1];
                    int[] var7 = this.field2516[var5];
                    int var8 = (-var6[0] + var4 << 12) / (var7[0] + -var6[0]);
                    int var9 = -class237.field3882[255 & var8 >> 5] + 4096 >> 1;
                    int var10 = -var9 + 4096;
                    int var11 = var6[1] * var10 - -(var7[1] * var9) >> 12;
                    if (~var11 >= 32767) {
                        var11 = -32767;
                    }
                    if (var11 >= 32768) {
                        var11 = 32767;
                    }
                    this.field2509[var3] = (short) var11;
                }
            } else {
                for (int var12 = 0; ~var12 > -258; ++var12) {
                    int var13 = var12 << 4;
                    int var14;
                    for (var14 = 1; this.field2516.length + -1 > var14 && ~var13 <= ~this.field2516[var14][0]; ++var14) {
                    }
                    int[] var15 = this.field2516[var14 + -1];
                    int[] var16 = this.field2516[var14];
                    int var17 = (-var15[0] + var13 << 12) / (var16[0] - var15[0]);
                    int var18 = -var17 + 4096;
                    int var19 = var15[1] * var18 + var16[1] * var17 >> 12;
                    if (var19 <= -32768) {
                        var19 = -32767;
                    }
                    if (var19 >= 32768) {
                        var19 = 32767;
                    }
                    this.field2509[var12] = (short) var19;
                }
            }
        } else {
            for (int var20 = 0; var20 < 257; ++var20) {
                int var21 = var20 << 4;
                int var22;
                for (var22 = 1; ~var22 > ~(this.field2516.length - 1) && this.field2516[var22][0] <= var21; ++var22) {
                }
                int[] var23 = this.field2516[var22 + -1];
                int[] var24 = this.field2516[var22];
                int var25 = this.method1087(73, var22 + -2)[1];
                int var26 = var23[1];
                int var27 = var24[1];
                int var28 = this.method1087(71, var22 + 1)[1];
                int var29 = (-var23[0] + var21 << 12) / (var24[0] - var23[0]);
                int var30 = var29 * var29 >> 12;
                int var31 = -var25 + var26 + -var27 + var28;
                int var32 = -var26 + var25 + -var31;
                int var33 = -var25 + var27;
                int var35 = (var29 * var31 >> 12) * var30 >> 12;
                int var36 = var30 * var32 >> 12;
                int var37 = var29 * var33 >> 12;
                int var38 = var26 + var37 + var36 + var35;
                if (var38 <= -32768) {
                    var38 = -32767;
                }
                if (~var38 <= -32769) {
                    var38 = 32767;
                }
                this.field2509[var20] = (short) var38;
            }
        }
        if (arg0 > -24) {
            method1085(-66);
        }
    }

    @OriginalMember(owner = "client!ln", name = "c", descriptor = "(II)[I")
    private final int[] method1087(int arg0, int arg1) {
        ++field2517;
        if (arg1 < 0) {
            return this.field2515;
        } else if (~arg1 <= ~this.field2516.length) {
            return this.field2519;
        } else {
            if (arg0 < 62) {
                method1085(86);
            }
            return this.field2516[arg1];
        }
    }

    @OriginalMember(owner = "client!ln", name = "a", descriptor = "(I[B[BIIIIII)V")
    public static final void method1088(int arg0, byte[] arg1, byte[] arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8) {
        if (arg4 != -1030608414) {
            method1085(51);
        }
        ++field2518;
        int var9 = -(arg8 >> 2);
        int var10 = -(arg8 & 3);
        for (int var11 = -arg0; var11 < 0; ++var11) {
            int var10001;
            for (int var12 = var9; var12 < 0; ++var12) {
                var10001 = arg7++;
                arg2[var10001] = (byte) (arg2[var10001] + -arg1[arg3++]);
                int var14 = arg7++;
                arg2[var14] = (byte) (arg2[var14] + -arg1[arg3++]);
                int var15 = arg7++;
                arg2[var15] = (byte) (arg2[var15] + -arg1[arg3++]);
                int var16 = arg7++;
                arg2[var16] = (byte) (arg2[var16] + -arg1[arg3++]);
            }
            for (int var13 = var10; var13 < 0; ++var13) {
                var10001 = arg7++;
                arg2[var10001] = (byte) (arg2[var10001] + -arg1[arg3++]);
            }
            arg3 += arg5;
            arg7 += arg6;
        }
    }

    @OriginalMember(owner = "client!ln", name = "a", descriptor = "(IZ)[I")
    public final int[] method41(int arg0, boolean arg1) {
        ++field2511;
        if (!arg1) {
            field2522 = null;
        }
        int[] var3 = super.field3064.method2452((byte) 108, arg0);
        if (super.field3064.field5837) {
            int[] var4 = this.method1376(1046794076, 0, arg0);
            for (int var5 = 0; class276.field4375 > var5; ++var5) {
                int var6 = var4[var5] >> 4;
                if (~var6 > -1) {
                    var6 = 0;
                }
                if (~var6 < -257) {
                    var6 = 256;
                }
                var3[var5] = this.field2509[var6];
            }
        }
        return var3;
    }

    @OriginalMember(owner = "client!ln", name = "<init>", descriptor = "()V")
    public class172() {
        super(1, true);
    }

    @OriginalMember(owner = "client!ln", name = "a", descriptor = "(Lhw;BI)V")
    public final void method40(class208 arg0, byte arg1, int arg2) {
        int var4 = 102 / ((arg1 - -46) / 50);
        if (~arg2 == -1) {
            this.field2512 = arg0.method1445(66);
            this.field2516 = new int[arg0.method1445(125)][2];
            for (int var5 = 0; this.field2516.length > var5; ++var5) {
                this.field2516[var5][0] = arg0.method1455(-3387);
                this.field2516[var5][1] = arg0.method1455(-3387);
            }
        }
        ++field2514;
    }

    @OriginalMember(owner = "client!ln", name = "a", descriptor = "(I)V")
    public final void method51(int arg0) {
        if (this.field2516 == null) {
            this.field2516 = new int[][] { new int[2], { 4096, 4096 } };
        }
        ++field2508;
        int var2 = -9 % ((80 - arg0) / 46);
        if (this.field2516.length < 2) {
            throw new RuntimeException("Curve operation requires at least two markers");
        } else {
            if (~this.field2512 == -3) {
                this.method1084(-57);
            }
            class62.method461(-98);
            this.method1086((byte) -93);
        }
    }
}
