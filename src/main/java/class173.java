import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!se")
public class class173 extends class12 {

    @OriginalMember(owner = "client!se", name = "X", descriptor = "I")
    private int field3281 = 0;

    @OriginalMember(owner = "client!se", name = "N", descriptor = "I")
    public static int field3272 = -1;

    @OriginalMember(owner = "client!se", name = "U", descriptor = "[[I")
    public static int[][] field3278 = new int[104][104];

    @OriginalMember(owner = "client!se", name = "Y", descriptor = "I")
    public static int field3282 = 0;

    @OriginalMember(owner = "client!se", name = "O", descriptor = "I")
    public static int field3273;

    @OriginalMember(owner = "client!se", name = "P", descriptor = "I")
    public static int field3274;

    @OriginalMember(owner = "client!se", name = "R", descriptor = "I")
    public static int field3275;

    @OriginalMember(owner = "client!se", name = "S", descriptor = "I")
    public static int field3276;

    @OriginalMember(owner = "client!se", name = "V", descriptor = "I")
    public static int field3279;

    @OriginalMember(owner = "client!se", name = "Z", descriptor = "I")
    public static int field3283;

    @OriginalMember(owner = "client!se", name = "bb", descriptor = "I")
    public static int field3285;

    @OriginalMember(owner = "client!se", name = "db", descriptor = "I")
    public static int field3287;

    @OriginalMember(owner = "client!se", name = "W", descriptor = "Lvb;")
    public static class197 field3280;

    @OriginalMember(owner = "client!se", name = "cb", descriptor = "Lk;")
    public static class96 field3286;

    @OriginalMember(owner = "client!se", name = "T", descriptor = "[I")
    private int[] field3277;

    @OriginalMember(owner = "client!se", name = "eb", descriptor = "[I")
    private int[] field3288;

    @OriginalMember(owner = "client!se", name = "ab", descriptor = "[[I")
    private int[][] field3284;

    @OriginalMember(owner = "client!se", name = "b", descriptor = "(B)V")
    public final void method78(byte arg0) {
        if (arg0 == 57) {
            if (this.field3284 == null) {
                this.field3284 = new int[][] { new int[2], { 4096, 4096 } };
            }
            ++field3275;
            if (~this.field3284.length > -3) {
                throw new RuntimeException("Curve operation requires at least two markers");
            } else {
                if (this.field3281 == 2) {
                    this.method1073(true);
                }
                class90.method527((byte) -128);
            }
        }
    }

    @OriginalMember(owner = "client!se", name = "<init>", descriptor = "()V")
    public class173() {
        super(1, true);
    }

    @OriginalMember(owner = "client!se", name = "a", descriptor = "(Lka;IZ)V")
    public final void method59(class97 arg0, int arg1, boolean arg2) {
        ++field3276;
        if (arg2) {
            field3280 = null;
        }
        if (~arg1 == -1) {
            this.field3281 = arg0.method588((byte) -98);
            this.field3284 = new int[arg0.method588((byte) -125)][2];
            for (int var4 = 0; ~var4 > ~this.field3284.length; ++var4) {
                this.field3284[var4][0] = arg0.method611(false);
                this.field3284[var4][1] = arg0.method611(arg2);
            }
        }
    }

    @OriginalMember(owner = "client!se", name = "a", descriptor = "(ILrh;)Z")
    public static final boolean method1071(int arg0, class167 arg1) {
        ++field3283;
        if (arg0 != 0) {
            return true;
        } else {
            if (class84.field1530) {
                if (class188.method1191((byte) -86, arg1) != 0) {
                    return false;
                }
                if (arg1.field3061 == 0) {
                    return false;
                }
            }
            return arg1.field3042;
        }
    }

    @OriginalMember(owner = "client!se", name = "c", descriptor = "(II)[I")
    private final int[] method1072(int arg0, int arg1) {
        ++field3285;
        if (arg1 < 0) {
            return this.field3277;
        } else if (arg0 != 1) {
            return null;
        } else {
            return ~this.field3284.length >= ~arg1 ? this.field3288 : this.field3284[arg1];
        }
    }

    @OriginalMember(owner = "client!se", name = "b", descriptor = "(Z)V")
    private final void method1073(boolean arg0) {
        int[] var2 = this.field3284[0];
        ++field3273;
        int[] var3 = this.field3284[this.field3284.length + -2];
        int[] var4 = this.field3284[1];
        if (!arg0) {
            this.method59((class97) null, -37, true);
        }
        int[] var5 = this.field3284[this.field3284.length - 1];
        this.field3277 = new int[] { var2[0] + -var4[0] + var2[0], var2[1] - var4[1] - -var2[1] };
        this.field3288 = new int[] { var3[0] - (var5[0] + -var3[0]), var3[1] - var5[1] + var3[1] };
    }

    @OriginalMember(owner = "client!se", name = "f", descriptor = "(I)V")
    public static void method1074(int arg0) {
        field3286 = null;
        if (arg0 != 1) {
            field3279 = 37;
        }
        field3278 = null;
        field3280 = null;
    }

    @OriginalMember(owner = "client!se", name = "a", descriptor = "(IB)[I")
    public final int[] method62(int arg0, byte arg1) {
        ++field3287;
        if (arg1 != 17) {
            field3278 = null;
        }
        int[] var3 = super.field224.method7((byte) 121, arg0);
        if (super.field224.field53) {
            int[] var4 = this.method77(0, arg0, -122);
            int var5 = this.field3281;
            if (var5 != 2) {
                if (~var5 == -2) {
                    for (int var6 = 0; ~class201.field3889 < ~var6; ++var6) {
                        int var7 = var4[var6];
                        int var8;
                        for (var8 = 1; ~(this.field3284.length + -1) < ~var8 && ~this.field3284[var8][0] >= ~var7; ++var8) {
                        }
                        int[] var9 = this.field3284[var8];
                        int[] var10 = this.field3284[var8 + -1];
                        int var11 = (-var10[0] + var7 << 12) / (var9[0] + -var10[0]);
                        int var12 = -class67.field1304[(var11 & 8162) >> 5] + 4096 >> 1;
                        int var13 = -var12 + 4096;
                        var3[var6] = var9[1] * var12 + var10[1] * var13 >> 12;
                    }
                } else {
                    for (int var14 = 0; class201.field3889 > var14; ++var14) {
                        int var15 = var4[var14];
                        int var16;
                        for (var16 = 1; ~var16 > ~(this.field3284.length + -1) && var15 >= this.field3284[var16][0]; ++var16) {
                        }
                        int[] var17 = this.field3284[var16 - 1];
                        int[] var18 = this.field3284[var16];
                        int var19 = (-var17[0] + var15 << 12) / (var18[0] - var17[0]);
                        int var20 = -var19 + 4096;
                        var3[var14] = var17[1] * var20 - -(var18[1] * var19) >> 12;
                    }
                }
            } else {
                for (int var21 = 0; ~class201.field3889 < ~var21; ++var21) {
                    int var22 = var4[var21];
                    int var23;
                    for (var23 = 1; ~var23 > ~(this.field3284.length + -1) && this.field3284[var23][0] <= var22; ++var23) {
                    }
                    int[] var24 = this.field3284[var23 + -1];
                    int[] var25 = this.field3284[var23];
                    int var26 = this.method1072(1, var23 + -2)[1];
                    int var27 = var24[1];
                    int var28 = var25[1];
                    int var30 = var28 - var26;
                    int var31 = this.method1072(1, var23 + 1)[1];
                    int var32 = -var28 - var26 - -var27 + var31;
                    int var33 = (var22 - var24[0] << 12) / (var25[0] + -var24[0]);
                    int var34 = var30 * var33 >> 12;
                    int var35 = -var27 + -var32 + var26;
                    int var36 = var33 * var33 >> 12;
                    int var37 = var35 * var36 >> 12;
                    int var38 = (var32 * var33 >> 12) * var36 >> 12;
                    var3[var21] = var37 + var38 + var27 - -var34;
                }
            }
        }
        return var3;
    }
}
