import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!iv")
public class class86 extends class349 {

    @OriginalMember(owner = "client!iv", name = "B", descriptor = "I")
    private int field1054 = 0;

    @OriginalMember(owner = "client!iv", name = "S", descriptor = "[S")
    private short[] field1071 = new short[257];

    @OriginalMember(owner = "client!iv", name = "G", descriptor = "Lic;")
    public static class617 field1059 = new class577();

    @OriginalMember(owner = "client!iv", name = "P", descriptor = "I")
    public static int field1068 = 0;

    @OriginalMember(owner = "client!iv", name = "R", descriptor = "Lcb;")
    public static class318 field1070 = new class318(97, 4);

    @OriginalMember(owner = "client!iv", name = "C", descriptor = "I")
    public static int field1055;

    @OriginalMember(owner = "client!iv", name = "F", descriptor = "I")
    public static int field1058;

    @OriginalMember(owner = "client!iv", name = "H", descriptor = "I")
    public static int field1060;

    @OriginalMember(owner = "client!iv", name = "I", descriptor = "I")
    public static int field1061;

    @OriginalMember(owner = "client!iv", name = "J", descriptor = "I")
    public static int field1062;

    @OriginalMember(owner = "client!iv", name = "K", descriptor = "I")
    public static int field1063;

    @OriginalMember(owner = "client!iv", name = "L", descriptor = "I")
    public static int field1064;

    @OriginalMember(owner = "client!iv", name = "M", descriptor = "I")
    public static int field1065;

    @OriginalMember(owner = "client!iv", name = "N", descriptor = "I")
    public static int field1066;

    @OriginalMember(owner = "client!iv", name = "D", descriptor = "Lts;")
    public static class281 field1056;

    @OriginalMember(owner = "client!iv", name = "O", descriptor = "[I")
    private int[] field1067;

    @OriginalMember(owner = "client!iv", name = "Q", descriptor = "[I")
    private int[] field1069;

    @OriginalMember(owner = "client!iv", name = "E", descriptor = "[[I")
    private int[][] field1057;

    @OriginalMember(owner = "client!iv", name = "b", descriptor = "(BI)[I", line = 3)
    public final int[] method13(byte arg0, int arg1) {
        ++field1060;
        int[] var3 = super.field5109.method3088(arg1, (byte) 26);
        if (super.field5109.field7515) {
            int[] var4 = this.method2181(0, -1090477337, arg1);
            for (int var5 = 0; ~var5 > ~class39.field497; ++var5) {
                int var6 = var4[var5] >> 4;
                if (~var6 > -1) {
                    var6 = 0;
                }
                if (~var6 < -257) {
                    var6 = 256;
                }
                var3[var5] = this.field1071[var6];
            }
        }
        int var7 = 1 % ((56 - arg0) / 41);
        return var3;
    }

    @OriginalMember(owner = "client!iv", name = "<init>", descriptor = "()V", line = 87)
    public class86() {
        super(1, true);
    }

    @OriginalMember(owner = "client!iv", name = "a", descriptor = "(IILdga;)V", line = 54)
    public final void method5(int arg0, int arg1, class138 arg2) {
        if (arg0 != 4095) {
            this.method481(-90, 34);
        }
        ++field1058;
        if (~arg1 == -1) {
            this.field1054 = arg2.method957((byte) -93);
            this.field1057 = new int[arg2.method957((byte) -66)][2];
            for (int var4 = 0; this.field1057.length > var4; ++var4) {
                this.field1057[var4][0] = arg2.method922((byte) -124);
                this.field1057[var4][1] = arg2.method922((byte) -114);
            }
        }
    }

    @OriginalMember(owner = "client!iv", name = "f", descriptor = "(I)V", line = 90)
    private final void method478(int arg0) {
        ++field1064;
        int[] var2 = this.field1057[0];
        int[] var3 = this.field1057[1];
        int var4 = -113 / ((arg0 - -37) / 58);
        int[] var5 = this.field1057[this.field1057.length + -2];
        int[] var6 = this.field1057[this.field1057.length + -1];
        this.field1067 = new int[] { var2[0] - (var3[0] - var2[0]), var2[1] - var3[1] - -var2[1] };
        this.field1069 = new int[] { var5[0] + -var6[0] + var5[0], var5[1] + -var6[1] + var5[1] };
    }

    @OriginalMember(owner = "client!iv", name = "a", descriptor = "(II)I", line = 109)
    public static final int method479(int arg0, int arg1) {
        if (arg1 != -32769) {
            return -54;
        } else {
            ++field1066;
            if (arg0 < 96) {
                return 0;
            } else {
                return arg0 < 128 ? 2 : 3;
            }
        }
    }

    @OriginalMember(owner = "client!iv", name = "g", descriptor = "(I)V", line = 127)
    public static void method480(int arg0) {
        field1070 = null;
        if (arg0 >= 26) {
            field1056 = null;
            field1059 = null;
        }
    }

    @OriginalMember(owner = "client!iv", name = "c", descriptor = "(B)V", line = 142)
    public final void method11(byte arg0) {
        ++field1062;
        if (this.field1057 == null) {
            this.field1057 = new int[][] { new int[2], { 4096, 4096 } };
        }
        if (this.field1057.length < 2) {
            throw new RuntimeException("Curve operation requires at least two markers");
        } else {
            if (~this.field1054 == -3) {
                this.method478(27);
            }
            class55.method350(0);
            if (arg0 > -51) {
                field1056 = null;
            }
            this.method482((byte) -124);
        }
    }

    @OriginalMember(owner = "client!iv", name = "b", descriptor = "(II)[I", line = 168)
    private final int[] method481(int arg0, int arg1) {
        ++field1061;
        if (~arg1 > arg0) {
            return this.field1067;
        } else {
            return ~this.field1057.length >= ~arg1 ? this.field1069 : this.field1057[arg1];
        }
    }

    @OriginalMember(owner = "client!iv", name = "d", descriptor = "(B)V", line = 187)
    private final void method482(byte arg0) {
        ++field1055;
        if (arg0 > -23) {
            this.method5(-10, -37, (class138) null);
        }
        int var2 = this.field1054;
        if (~var2 != -3) {
            if (~var2 == -2) {
                for (int var3 = 0; ~var3 > -258; ++var3) {
                    int var4 = var3 << 4;
                    int var5;
                    for (var5 = 1; ~(this.field1057.length + -1) < ~var5 && ~var4 <= ~this.field1057[var5][0]; ++var5) {
                    }
                    int[] var6 = this.field1057[var5 + -1];
                    int[] var7 = this.field1057[var5];
                    int var8 = (-var6[0] + var4 << 12) / (var7[0] + -var6[0]);
                    int var9 = -class15.field127[var8 >> 5 & 255] + 4096 >> 1;
                    int var10 = -var9 + 4096;
                    int var11 = var6[1] * var10 + var7[1] * var9 >> 12;
                    if (~var11 >= 32767) {
                        var11 = -32767;
                    }
                    if (~var11 <= -32769) {
                        var11 = 32767;
                    }
                    this.field1071[var3] = (short) var11;
                }
            } else {
                for (int var12 = 0; var12 < 257; ++var12) {
                    int var13 = var12 << 4;
                    int var14;
                    for (var14 = 1; var14 < this.field1057.length + -1 && this.field1057[var14][0] <= var13; ++var14) {
                    }
                    int[] var15 = this.field1057[var14 + -1];
                    int[] var16 = this.field1057[var14];
                    int var17 = (-var15[0] + var13 << 12) / (var16[0] + -var15[0]);
                    int var18 = -var17 + 4096;
                    int var19 = var15[1] * var18 + var16[1] * var17 >> 12;
                    if (~var19 >= 32767) {
                        var19 = -32767;
                    }
                    if (var19 >= 32768) {
                        var19 = 32767;
                    }
                    this.field1071[var12] = (short) var19;
                }
            }
        } else {
            for (int var20 = 0; ~var20 > -258; ++var20) {
                int var21 = var20 << 4;
                int var22;
                for (var22 = 1; ~var22 > ~(this.field1057.length + -1) && ~this.field1057[var22][0] >= ~var21; ++var22) {
                }
                int[] var23 = this.field1057[var22 + -1];
                int[] var24 = this.field1057[var22];
                int var25 = this.method481(-1, var22 + -2)[1];
                int var26 = var23[1];
                int var27 = var24[1];
                int var28 = this.method481(-1, var22 + 1)[1];
                int var29 = (var21 - var23[0] << 12) / (var24[0] + -var23[0]);
                int var30 = var29 * var29 >> 12;
                int var31 = -var25 + var28 - (-var26 + var27);
                int var32 = -var31 + var25 + -var26;
                int var33 = var27 - var25;
                int var35 = (var29 * var31 >> 12) * var30 >> 12;
                int var36 = var30 * var32 >> 12;
                int var37 = var29 * var33 >> 12;
                int var38 = var36 + var37 - -var26 + var35;
                if (~var38 >= 32767) {
                    var38 = -32767;
                }
                if (~var38 <= -32769) {
                    var38 = 32767;
                }
                this.field1071[var20] = (short) var38;
            }
        }
    }

    @OriginalMember(owner = "client!iv", name = "d", descriptor = "(III)Z", line = 367)
    public static final boolean method483(int arg0, int arg1, int arg2) {
        if (arg2 != 32767) {
            field1068 = 72;
        }
        ++field1063;
        return class610.method3363((byte) 41, arg0, arg1) & (class278.method1687(arg1, arg0, 0) | ~(arg1 & 8192) != -1 | class96.method534(arg1, arg2 + -58209, arg0));
    }
}
