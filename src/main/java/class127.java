import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!fea")
public class class127 extends class573 {

    @OriginalMember(owner = "client!fea", name = "K", descriptor = "[S")
    private short[] field2312 = new short[257];

    @OriginalMember(owner = "client!fea", name = "O", descriptor = "I")
    private int field2316 = 0;

    @OriginalMember(owner = "client!fea", name = "J", descriptor = "Lqfa;")
    public static class85 field2311 = new class85(93, 19);

    @OriginalMember(owner = "client!fea", name = "U", descriptor = "Lsb;")
    public static class266 field2322 = new class266(13, 0);

    @OriginalMember(owner = "client!fea", name = "X", descriptor = "Lqfa;")
    public static class85 field2325 = new class85(19, 7);

    @OriginalMember(owner = "client!fea", name = "I", descriptor = "I")
    public static int field2310;

    @OriginalMember(owner = "client!fea", name = "L", descriptor = "I")
    public static int field2313;

    @OriginalMember(owner = "client!fea", name = "N", descriptor = "I")
    public static int field2315;

    @OriginalMember(owner = "client!fea", name = "P", descriptor = "I")
    public static int field2317;

    @OriginalMember(owner = "client!fea", name = "Q", descriptor = "I")
    public static int field2318;

    @OriginalMember(owner = "client!fea", name = "R", descriptor = "I")
    public static int field2319;

    @OriginalMember(owner = "client!fea", name = "T", descriptor = "I")
    public static int field2321;

    @OriginalMember(owner = "client!fea", name = "W", descriptor = "Lom;")
    public static class344 field2324;

    @OriginalMember(owner = "client!fea", name = "M", descriptor = "[I")
    private int[] field2314;

    @OriginalMember(owner = "client!fea", name = "S", descriptor = "[I")
    private int[] field2320;

    @OriginalMember(owner = "client!fea", name = "V", descriptor = "[[I")
    private int[][] field2323;

    @OriginalMember(owner = "client!fea", name = "h", descriptor = "(I)V")
    private final void method1086(int arg0) {
        ++field2318;
        int[] var2 = this.field2323[0];
        int[] var3 = this.field2323[1];
        int[] var4 = this.field2323[this.field2323.length + -2];
        int[] var5 = this.field2323[this.field2323.length + -1];
        this.field2314 = new int[] { -var5[arg0] - (-var4[0] - var4[0]), var4[1] - (var5[1] + -var4[1]) };
        this.field2320 = new int[] { var2[0] + -var3[0] + var2[0], var2[1] - (var3[1] - var2[1]) };
    }

    @OriginalMember(owner = "client!fea", name = "a", descriptor = "(Z)V")
    public static void method1087(boolean arg0) {
        field2311 = null;
        if (!arg0) {
            field2322 = null;
        }
        field2325 = null;
        field2324 = null;
        field2322 = null;
    }

    @OriginalMember(owner = "client!fea", name = "<init>", descriptor = "()V")
    public class127() {
        super(1, true);
    }

    @OriginalMember(owner = "client!fea", name = "a", descriptor = "(II)[I")
    public final int[] method619(int arg0, int arg1) {
        ++field2315;
        int[] var3 = super.field8321.method3164(arg0, -120);
        if (super.field8321.field7825) {
            int[] var4 = this.method3292(0, 0, arg0);
            for (int var5 = 0; ~class540.field7555 < ~var5; ++var5) {
                int var6 = var4[var5] >> 4;
                if (var6 < 0) {
                    var6 = 0;
                }
                if (~var6 < -257) {
                    var6 = 256;
                }
                var3[var5] = this.field2312[var6];
            }
        }
        if (arg1 != 1) {
            this.method1086(-45);
        }
        return var3;
    }

    @OriginalMember(owner = "client!fea", name = "i", descriptor = "(I)V")
    private final void method1088(int arg0) {
        int var2 = this.field2316;
        if (var2 != 2) {
            if (var2 == 1) {
                for (int var3 = 0; ~var3 > -258; ++var3) {
                    int var4 = var3 << 4;
                    int var5;
                    for (var5 = 1; ~var5 > ~(this.field2323.length + -1) && ~this.field2323[var5][0] >= ~var4; ++var5) {
                    }
                    int[] var6 = this.field2323[var5 + -1];
                    int[] var7 = this.field2323[var5];
                    int var8 = (-var6[0] + var4 << 12) / (var7[0] - var6[0]);
                    int var9 = -class335.field5011[255 & var8 >> 5] + 4096 >> 1;
                    int var10 = -var9 + 4096;
                    int var11 = var6[1] * var10 - -(var7[1] * var9) >> 12;
                    if (~var11 >= 32767) {
                        var11 = -32767;
                    }
                    if (~var11 <= -32769) {
                        var11 = 32767;
                    }
                    this.field2312[var3] = (short) var11;
                }
            } else {
                for (int var12 = 0; var12 < 257; ++var12) {
                    int var13 = var12 << 4;
                    int var14;
                    for (var14 = 1; this.field2323.length + -1 > var14 && ~var13 <= ~this.field2323[var14][0]; ++var14) {
                    }
                    int[] var15 = this.field2323[var14 + -1];
                    int[] var16 = this.field2323[var14];
                    int var17 = (-var15[0] + var13 << 12) / (var16[0] + -var15[0]);
                    int var18 = -var17 + 4096;
                    int var19 = var15[1] * var18 + var16[1] * var17 >> 12;
                    if (~var19 >= 32767) {
                        var19 = -32767;
                    }
                    if (~var19 <= -32769) {
                        var19 = 32767;
                    }
                    this.field2312[var12] = (short) var19;
                }
            }
        } else {
            for (int var20 = 0; ~var20 > -258; ++var20) {
                int var21 = var20 << 4;
                int var22;
                for (var22 = 1; this.field2323.length + -1 > var22 && this.field2323[var22][0] <= var21; ++var22) {
                }
                int[] var23 = this.field2323[var22 + -1];
                int[] var24 = this.field2323[var22];
                int var25 = this.method1089(-11113, var22 + -2)[1];
                int var26 = var23[1];
                int var27 = var24[1];
                int var28 = this.method1089(-11113, var22 + 1)[1];
                int var29 = (-var23[0] + var21 << 12) / (var24[0] - var23[0]);
                int var30 = var29 * var29 >> 12;
                int var31 = var28 - var27 - (var25 - var26);
                int var32 = -var26 + var25 + -var31;
                int var33 = -var25 + var27;
                int var35 = (var29 * var31 >> 12) * var30 >> 12;
                int var36 = var30 * var32 >> 12;
                int var37 = var29 * var33 >> 12;
                int var38 = var26 + var36 + var35 + var37;
                if (~var38 >= 32767) {
                    var38 = -32767;
                }
                if (~var38 <= -32769) {
                    var38 = 32767;
                }
                this.field2312[var20] = (short) var38;
            }
        }
        if (arg0 <= -81) {
            ++field2310;
        }
    }

    @OriginalMember(owner = "client!fea", name = "a", descriptor = "(I)V")
    public final void method617(int arg0) {
        ++field2313;
        if (this.field2323 == null) {
            this.field2323 = new int[][] { new int[2], { 4096, 4096 } };
        }
        if (~this.field2323.length > -3) {
            throw new RuntimeException("Curve operation requires at least two markers");
        } else {
            if (this.field2316 == 2) {
                this.method1086(0);
            }
            class136.method1117((byte) 63);
            this.method1088(-90);
            if (arg0 != 4095) {
                this.method443((class61) null, 75, 29);
            }
        }
    }

    @OriginalMember(owner = "client!fea", name = "d", descriptor = "(II)[I")
    private final int[] method1089(int arg0, int arg1) {
        ++field2317;
        if (arg1 < 0) {
            return this.field2320;
        } else {
            if (arg0 != -11113) {
                this.method619(-125, 84);
            }
            return arg1 >= this.field2323.length ? this.field2314 : this.field2323[arg1];
        }
    }

    @OriginalMember(owner = "client!fea", name = "a", descriptor = "(Lqh;II)V")
    public final void method443(class61 arg0, int arg1, int arg2) {
        ++field2321;
        if (~arg1 == -1) {
            this.field2316 = arg0.method732(-559537960);
            this.field2323 = new int[arg0.method732(-559537960)][2];
            for (int var4 = 0; ~this.field2323.length < ~var4; ++var4) {
                this.field2323[var4][0] = arg0.method723((byte) -25);
                this.field2323[var4][1] = arg0.method723((byte) -25);
            }
        }
        if (arg2 != 3) {
            this.field2316 = -119;
        }
    }
}
