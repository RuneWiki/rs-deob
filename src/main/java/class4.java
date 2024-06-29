import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!er")
public class class4 extends class305 {

    @OriginalMember(owner = "client!er", name = "M", descriptor = "[S")
    private short[] field57 = new short[257];

    @OriginalMember(owner = "client!er", name = "R", descriptor = "I")
    private int field62 = 0;

    @OriginalMember(owner = "client!er", name = "L", descriptor = "[I")
    public static int[] field56 = new int[13];

    @OriginalMember(owner = "client!er", name = "N", descriptor = "Ljp;")
    public static class55 field58 = new class55(87, 12);

    @OriginalMember(owner = "client!er", name = "Q", descriptor = "F")
    public static float field61;

    @OriginalMember(owner = "client!er", name = "E", descriptor = "I")
    public static int field49;

    @OriginalMember(owner = "client!er", name = "G", descriptor = "I")
    public static int field51;

    @OriginalMember(owner = "client!er", name = "H", descriptor = "I")
    public static int field52;

    @OriginalMember(owner = "client!er", name = "I", descriptor = "I")
    public static int field53;

    @OriginalMember(owner = "client!er", name = "K", descriptor = "I")
    public static int field55;

    @OriginalMember(owner = "client!er", name = "O", descriptor = "I")
    public static int field59;

    @OriginalMember(owner = "client!er", name = "P", descriptor = "Lue;")
    public static class376 field60;

    @OriginalMember(owner = "client!er", name = "D", descriptor = "[I")
    private int[] field48;

    @OriginalMember(owner = "client!er", name = "F", descriptor = "[I")
    private int[] field50;

    @OriginalMember(owner = "client!er", name = "J", descriptor = "[[I")
    private int[][] field54;

    @OriginalMember(owner = "client!er", name = "<init>", descriptor = "()V", line = 3)
    public class4() {
        super(1, true);
    }

    @OriginalMember(owner = "client!er", name = "f", descriptor = "(I)V", line = 9)
    public static void method19(int arg0) {
        int var1 = -33 / ((arg0 - -80) / 44);
        field58 = null;
        field60 = null;
        field56 = null;
    }

    @OriginalMember(owner = "client!er", name = "a", descriptor = "(II)[I", line = 25)
    public final int[] method15(int arg0, int arg1) {
        ++field51;
        int[] var3 = super.field4677.method2174(arg0, -128);
        if (arg1 != 4688) {
            return null;
        } else {
            if (super.field4677.field5040) {
                int[] var4 = this.method2021(0, arg0, arg1 ^ 4688);
                for (int var5 = 0; var5 < class91.field1471; ++var5) {
                    int var6 = var4[var5] >> 4;
                    if (~var6 > -1) {
                        var6 = 0;
                    }
                    if (var6 > 256) {
                        var6 = 256;
                    }
                    var3[var5] = this.field57[var6];
                }
            }
            return var3;
        }
    }

    @OriginalMember(owner = "client!er", name = "g", descriptor = "(I)V", line = 75)
    private final void method20(int arg0) {
        ++field49;
        int[] var2 = this.field54[0];
        if (arg0 >= -53) {
            this.method22(26);
        }
        int[] var3 = this.field54[1];
        int[] var4 = this.field54[this.field54.length + -2];
        int[] var5 = this.field54[this.field54.length - 1];
        this.field48 = new int[] { var2[0] + -var3[0] + var2[0], -var3[1] - -var2[1] + var2[1] };
        this.field50 = new int[] { var4[0] - (var5[0] - var4[0]), var4[1] + -var5[1] + var4[1] };
    }

    @OriginalMember(owner = "client!er", name = "b", descriptor = "(II)[I", line = 96)
    private final int[] method21(int arg0, int arg1) {
        ++field55;
        if (arg0 < 0) {
            return this.field48;
        } else {
            if (arg1 != 29953) {
                this.field48 = null;
            }
            return this.field54.length <= arg0 ? this.field50 : this.field54[arg0];
        }
    }

    @OriginalMember(owner = "client!er", name = "a", descriptor = "(ILfh;B)V", line = 114)
    public final void method14(int arg0, class194 arg1, byte arg2) {
        ++field52;
        if (~arg0 == -1) {
            this.field62 = arg1.method1337((byte) -118);
            this.field54 = new int[arg1.method1337((byte) -124)][2];
            for (int var4 = 0; ~var4 > ~this.field54.length; ++var4) {
                this.field54[var4][0] = arg1.method1396(-84);
                this.field54[var4][1] = arg1.method1396(106);
            }
        }
        if (arg2 < 76) {
            field61 = 0.7122116F;
        }
    }

    @OriginalMember(owner = "client!er", name = "a", descriptor = "(B)V", line = 152)
    public final void method17(byte arg0) {
        ++field53;
        if (this.field54 == null) {
            this.field54 = new int[][] { new int[2], { 4096, 4096 } };
        }
        if (~this.field54.length > -3) {
            throw new RuntimeException("Curve operation requires at least two markers");
        } else if (arg0 == -62) {
            if (~this.field62 == -3) {
                this.method20(arg0 + -40);
            }
            class441.method2728(false);
            this.method22(1);
        }
    }

    @OriginalMember(owner = "client!er", name = "h", descriptor = "(I)V", line = 178)
    private final void method22(int arg0) {
        int var2 = this.field62;
        if (var2 != 2) {
            if (var2 == 1) {
                for (int var3 = 0; var3 < 257; ++var3) {
                    int var4 = var3 << 4;
                    int var5;
                    for (var5 = 1; ~var5 > ~(this.field54.length + -1) && this.field54[var5][0] <= var4; ++var5) {
                    }
                    int[] var6 = this.field54[var5 + -1];
                    int[] var7 = this.field54[var5];
                    int var8 = (-var6[0] + var4 << 12) / (var7[0] + -var6[0]);
                    int var9 = -class480.field7043[255 & var8 >> 5] + 4096 >> 1;
                    int var10 = -var9 + 4096;
                    int var11 = var6[1] * var10 + var7[1] * var9 >> 12;
                    if (var11 <= -32768) {
                        var11 = -32767;
                    }
                    if (var11 >= 32768) {
                        var11 = 32767;
                    }
                    this.field57[var3] = (short) var11;
                }
            } else {
                for (int var12 = 0; var12 < 257; ++var12) {
                    int var13 = var12 << 4;
                    int var14;
                    for (var14 = 1; this.field54.length + -1 > var14 && ~this.field54[var14][0] >= ~var13; ++var14) {
                    }
                    int[] var15 = this.field54[var14 + -1];
                    int[] var16 = this.field54[var14];
                    int var17 = (-var15[0] + var13 << 12) / (var16[0] + -var15[0]);
                    int var18 = -var17 + 4096;
                    int var19 = var15[1] * var18 + var16[1] * var17 >> 12;
                    if (~var19 >= 32767) {
                        var19 = -32767;
                    }
                    if (~var19 <= -32769) {
                        var19 = 32767;
                    }
                    this.field57[var12] = (short) var19;
                }
            }
        } else {
            for (int var20 = 0; ~var20 > -258; ++var20) {
                int var21 = var20 << 4;
                int var22;
                for (var22 = 1; ~(this.field54.length + -1) < ~var22 && ~this.field54[var22][0] >= ~var21; ++var22) {
                }
                int[] var23 = this.field54[var22 - 1];
                int[] var24 = this.field54[var22];
                int var25 = this.method21(var22 + -2, arg0 ^ 29952)[1];
                int var26 = var23[1];
                int var27 = var24[1];
                int var28 = this.method21(var22 + 1, 29953)[1];
                int var29 = (var21 - var23[0] << 12) / (var24[0] + -var23[0]);
                int var30 = var29 * var29 >> 12;
                int var31 = -var27 + var28 + -var25 + var26;
                int var32 = -var31 + var25 + -var26;
                int var33 = -var25 + var27;
                int var35 = (var29 * var31 >> 12) * var30 >> 12;
                int var36 = var30 * var32 >> 12;
                int var37 = var29 * var33 >> 12;
                int var38 = var35 + var36 + var26 - -var37;
                if (var38 <= -32768) {
                    var38 = -32767;
                }
                if (var38 >= 32768) {
                    var38 = 32767;
                }
                this.field57[var20] = (short) var38;
            }
        }
        if (arg0 != 1) {
            field58 = null;
        }
        ++field59;
    }
}
