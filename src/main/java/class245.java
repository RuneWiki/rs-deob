import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!oba")
public class class245 extends class377 {

    @OriginalMember(owner = "client!oba", name = "F", descriptor = "[S")
    private short[] field3164 = new short[257];

    @OriginalMember(owner = "client!oba", name = "P", descriptor = "I")
    private int field3174 = 0;

    @OriginalMember(owner = "client!oba", name = "D", descriptor = "Z")
    public static boolean field3162 = false;

    @OriginalMember(owner = "client!oba", name = "C", descriptor = "[I")
    public static int[] field3161 = new int[2];

    @OriginalMember(owner = "client!oba", name = "E", descriptor = "Lcga;")
    public static class449 field3163 = new class449(27, 7);

    @OriginalMember(owner = "client!oba", name = "z", descriptor = "I")
    public static int field3158;

    @OriginalMember(owner = "client!oba", name = "A", descriptor = "I")
    public static int field3159;

    @OriginalMember(owner = "client!oba", name = "B", descriptor = "I")
    public static int field3160;

    @OriginalMember(owner = "client!oba", name = "G", descriptor = "I")
    public static int field3165;

    @OriginalMember(owner = "client!oba", name = "H", descriptor = "I")
    public static int field3166;

    @OriginalMember(owner = "client!oba", name = "J", descriptor = "I")
    public static int field3168;

    @OriginalMember(owner = "client!oba", name = "K", descriptor = "I")
    public static int field3169;

    @OriginalMember(owner = "client!oba", name = "L", descriptor = "I")
    public static int field3170;

    @OriginalMember(owner = "client!oba", name = "N", descriptor = "I")
    public static int field3172;

    @OriginalMember(owner = "client!oba", name = "M", descriptor = "[I")
    private int[] field3171;

    @OriginalMember(owner = "client!oba", name = "O", descriptor = "[I")
    private int[] field3173;

    @OriginalMember(owner = "client!oba", name = "I", descriptor = "[[I")
    private int[][] field3167;

    @OriginalMember(owner = "client!oba", name = "e", descriptor = "(B)V")
    private final void method1468(byte arg0) {
        ++field3158;
        if (arg0 != -21) {
            this.field3164 = null;
        }
        int[] var2 = this.field3167[0];
        int[] var3 = this.field3167[1];
        int[] var4 = this.field3167[this.field3167.length + -2];
        int[] var5 = this.field3167[this.field3167.length + -1];
        this.field3173 = new int[] { -var5[0] - -var4[0] + var4[0], var4[1] - (var5[1] - var4[1]) };
        this.field3171 = new int[] { var2[0] + -var3[0] + var2[0], var2[1] - (var3[1] + -var2[1]) };
    }

    @OriginalMember(owner = "client!oba", name = "a", descriptor = "(II)[I")
    public final int[] method88(int arg0, int arg1) {
        ++field3159;
        int var3 = 104 / ((arg1 - 5) / 53);
        int[] var4 = super.field4842.method2772(arg0, (byte) -119);
        if (super.field4842.field6354) {
            int[] var5 = this.method2174(0, arg0, (byte) 14);
            for (int var6 = 0; class528.field6661 > var6; ++var6) {
                int var7 = var5[var6] >> 4;
                if (~var7 > -1) {
                    var7 = 0;
                }
                if (var7 > 256) {
                    var7 = 256;
                }
                var4[var6] = this.field3164[var7];
            }
        }
        return var4;
    }

    @OriginalMember(owner = "client!oba", name = "a", descriptor = "(IILji;)V")
    public final void method27(int arg0, int arg1, class572 arg2) {
        ++field3166;
        if (arg0 == 0) {
            this.field3174 = arg2.method3097((byte) 12);
            this.field3167 = new int[arg2.method3097((byte) 12)][2];
            for (int var4 = 0; ~this.field3167.length < ~var4; ++var4) {
                this.field3167[var4][0] = arg2.method3031(-1);
                this.field3167[var4][1] = arg2.method3031(-1);
            }
        }
        int var5 = -58 % ((13 - arg1) / 55);
    }

    @OriginalMember(owner = "client!oba", name = "a", descriptor = "(CB)I")
    public static final int method1469(char arg0, byte arg1) {
        ++field3170;
        if (~arg0 <= -1 && class293.field3728.length > arg0) {
            return class293.field3728[arg0];
        } else {
            if (arg1 != 9) {
                field3161 = null;
            }
            return -1;
        }
    }

    @OriginalMember(owner = "client!oba", name = "b", descriptor = "(B)V")
    public final void method91(byte arg0) {
        if (this.field3167 == null) {
            this.field3167 = new int[][] { new int[2], { 4096, 4096 } };
        }
        ++field3169;
        if (~this.field3167.length > -3) {
            throw new RuntimeException("Curve operation requires at least two markers");
        } else {
            if (arg0 < 52) {
                this.method27(-106, 80, (class572) null);
            }
            if (this.field3174 == 2) {
                this.method1468((byte) -21);
            }
            class430.method2367(-10177);
            this.method1470(-1);
        }
    }

    @OriginalMember(owner = "client!oba", name = "f", descriptor = "(I)V")
    private final void method1470(int arg0) {
        ++field3160;
        int var2 = this.field3174;
        if (~var2 != -3) {
            if (~var2 == -2) {
                for (int var3 = 0; var3 < 257; ++var3) {
                    int var4 = var3 << 4;
                    int var5;
                    for (var5 = 1; ~var5 > ~(this.field3167.length - 1) && var4 >= this.field3167[var5][0]; ++var5) {
                    }
                    int[] var6 = this.field3167[var5 + -1];
                    int[] var7 = this.field3167[var5];
                    int var8 = (var4 - var6[0] << 12) / (var7[0] + -var6[0]);
                    int var9 = -class618.field8383[255 & var8 >> 5] + 4096 >> 1;
                    int var10 = -var9 + 4096;
                    int var11 = var6[1] * var10 - -(var7[1] * var9) >> 12;
                    if (var11 <= -32768) {
                        var11 = -32767;
                    }
                    if (~var11 <= -32769) {
                        var11 = 32767;
                    }
                    this.field3164[var3] = (short) var11;
                }
            } else {
                for (int var12 = 0; ~var12 > -258; ++var12) {
                    int var13 = var12 << 4;
                    int var14;
                    for (var14 = 1; this.field3167.length + -1 > var14 && ~var13 <= ~this.field3167[var14][0]; ++var14) {
                    }
                    int[] var15 = this.field3167[var14 + -1];
                    int[] var16 = this.field3167[var14];
                    int var17 = (-var15[0] + var13 << 12) / (var16[0] + -var15[0]);
                    int var18 = -var17 + 4096;
                    int var19 = var15[1] * var18 + var16[1] * var17 >> 12;
                    if (var19 <= -32768) {
                        var19 = -32767;
                    }
                    if (var19 >= 32768) {
                        var19 = 32767;
                    }
                    this.field3164[var12] = (short) var19;
                }
            }
        } else {
            for (int var20 = 0; ~var20 > -258; ++var20) {
                int var21 = var20 << 4;
                int var22;
                for (var22 = 1; var22 < this.field3167.length + -1 && ~var21 <= ~this.field3167[var22][0]; ++var22) {
                }
                int[] var23 = this.field3167[var22 + -1];
                int[] var24 = this.field3167[var22];
                int var25 = this.method1471(false, var22 + -2)[1];
                int var26 = var23[1];
                int var27 = var24[1];
                int var28 = this.method1471(false, var22 + 1)[1];
                int var29 = (-var23[0] + var21 << 12) / (var24[0] + -var23[0]);
                int var30 = var29 * var29 >> 12;
                int var31 = -var27 + var28 - var25 + var26;
                int var32 = -var26 + -var31 + var25;
                int var33 = var27 - var25;
                int var35 = (var29 * var31 >> 12) * var30 >> 12;
                int var36 = var30 * var32 >> 12;
                int var37 = var29 * var33 >> 12;
                int var38 = var26 + var35 - (-var36 + -var37);
                if (~var38 >= 32767) {
                    var38 = -32767;
                }
                if (var38 >= 32768) {
                    var38 = 32767;
                }
                this.field3164[var20] = (short) var38;
            }
        }
        if (arg0 != -1) {
            method1472(-103);
        }
    }

    @OriginalMember(owner = "client!oba", name = "<init>", descriptor = "()V")
    public class245() {
        super(1, true);
    }

    @OriginalMember(owner = "client!oba", name = "a", descriptor = "(ZI)[I")
    private final int[] method1471(boolean arg0, int arg1) {
        ++field3172;
        if (arg0) {
            method1473(-93, 86);
        }
        if (~arg1 > -1) {
            return this.field3171;
        } else {
            return ~arg1 <= ~this.field3167.length ? this.field3173 : this.field3167[arg1];
        }
    }

    @OriginalMember(owner = "client!oba", name = "g", descriptor = "(I)V")
    public static void method1472(int arg0) {
        field3163 = null;
        if (arg0 < 13) {
            field3162 = true;
        }
        field3161 = null;
    }

    @OriginalMember(owner = "client!oba", name = "b", descriptor = "(II)Z")
    public static final boolean method1473(int arg0, int arg1) {
        ++field3165;
        if (arg1 > -107) {
            return false;
        } else if (arg0 != 23 && arg0 != 15 && arg0 != 20 && arg0 != 11 && arg0 != 1004) {
            return ~arg0 == -51 || arg0 == 1011;
        } else {
            return true;
        }
    }
}
