import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!v")
public class class149 extends class157 {

    @OriginalMember(owner = "client!v", name = "V", descriptor = "[S")
    private short[] field2726 = new short[257];

    @OriginalMember(owner = "client!v", name = "X", descriptor = "I")
    private int field2728 = 0;

    @OriginalMember(owner = "client!v", name = "W", descriptor = "I")
    public static int field2727 = -1;

    @OriginalMember(owner = "client!v", name = "S", descriptor = "Lcc;")
    public static class209 field2723 = class95.method669(123, "clignotant3:");

    @OriginalMember(owner = "client!v", name = "ab", descriptor = "Lcc;")
    public static class209 field2731 = class95.method669(85, "runes");

    @OriginalMember(owner = "client!v", name = "N", descriptor = "I")
    public static int field2718;

    @OriginalMember(owner = "client!v", name = "O", descriptor = "I")
    public static int field2719;

    @OriginalMember(owner = "client!v", name = "Q", descriptor = "I")
    public static int field2721;

    @OriginalMember(owner = "client!v", name = "R", descriptor = "I")
    public static int field2722;

    @OriginalMember(owner = "client!v", name = "T", descriptor = "I")
    public static int field2724;

    @OriginalMember(owner = "client!v", name = "Z", descriptor = "I")
    public static int field2730;

    @OriginalMember(owner = "client!v", name = "bb", descriptor = "I")
    public static int field2732;

    @OriginalMember(owner = "client!v", name = "Y", descriptor = "Lsj;")
    public static class49 field2729;

    @OriginalMember(owner = "client!v", name = "P", descriptor = "[I")
    private int[] field2720;

    @OriginalMember(owner = "client!v", name = "cb", descriptor = "[I")
    private int[] field2733;

    @OriginalMember(owner = "client!v", name = "U", descriptor = "[[I")
    private int[][] field2725;

    @OriginalMember(owner = "client!v", name = "a", descriptor = "(IBLtf;)V")
    public final void method1(int arg0, byte arg1, class106 arg2) {
        if (arg1 >= -29) {
            field2727 = 42;
        }
        if (~arg0 == -1) {
            this.field2728 = arg2.method774((byte) 97);
            this.field2725 = new int[arg2.method774((byte) 108)][2];
            for (int var4 = 0; ~var4 > ~this.field2725.length; ++var4) {
                this.field2725[var4][0] = arg2.method736(125);
                this.field2725[var4][1] = arg2.method736(121);
            }
        }
        ++field2730;
    }

    @OriginalMember(owner = "client!v", name = "h", descriptor = "(I)V")
    public static void method1033(int arg0) {
        field2723 = null;
        field2729 = null;
        field2731 = null;
        int var1 = 83 % ((69 - arg0) / 56);
    }

    @OriginalMember(owner = "client!v", name = "a", descriptor = "(BI)[I")
    public final int[] method4(byte arg0, int arg1) {
        ++field2718;
        int[] var3 = super.field2879.method1269(arg1, 17885);
        if (arg0 != -98) {
            return null;
        } else {
            if (super.field2879.field3363) {
                int[] var4 = this.method1097((byte) 75, 0, arg1);
                for (int var5 = 0; ~var5 > ~class226.field4124; ++var5) {
                    int var6 = var4[var5] >> 4;
                    if (~var6 > -1) {
                        var6 = 0;
                    }
                    if (var6 > 256) {
                        var6 = 256;
                    }
                    var3[var5] = this.field2726[var6];
                }
            }
            return var3;
        }
    }

    @OriginalMember(owner = "client!v", name = "a", descriptor = "(B)V")
    public final void method3(byte arg0) {
        ++field2721;
        if (this.field2725 == null) {
            this.field2725 = new int[][] { new int[2], { 4096, 4096 } };
        }
        if (this.field2725.length < 2) {
            throw new RuntimeException("Curve operation requires at least two markers");
        } else {
            int var2 = 55 % ((arg0 - -51) / 52);
            if (this.field2728 == 2) {
                this.method1036(0);
            }
            class257.method1773(0);
            this.method1034(-3452);
        }
    }

    @OriginalMember(owner = "client!v", name = "<init>", descriptor = "()V")
    public class149() {
        super(1, true);
    }

    @OriginalMember(owner = "client!v", name = "i", descriptor = "(I)V")
    private final void method1034(int arg0) {
        ++field2732;
        int var2 = this.field2728;
        if (~var2 != -3) {
            if (~var2 == -2) {
                for (int var3 = 0; var3 < 257; ++var3) {
                    int var4 = var3 << 4;
                    int var5;
                    for (var5 = 1; var5 < this.field2725.length + -1 && ~var4 <= ~this.field2725[var5][0]; ++var5) {
                    }
                    int[] var6 = this.field2725[var5 - 1];
                    int[] var7 = this.field2725[var5];
                    int var8 = (var4 - var6[0] << 12) / (var7[0] - var6[0]);
                    int var9 = -class209.field3785[var8 >> 5 & 255] + 4096 >> 1;
                    int var10 = 4096 - var9;
                    int var11 = var6[1] * var10 + var7[1] * var9 >> 12;
                    if (var11 <= -32768) {
                        var11 = -32767;
                    }
                    if (~var11 <= -32769) {
                        var11 = 32767;
                    }
                    this.field2726[var3] = (short) var11;
                }
            } else {
                for (int var12 = 0; ~var12 > -258; ++var12) {
                    int var13 = var12 << 4;
                    int var14;
                    for (var14 = 1; this.field2725.length + -1 > var14 && ~var13 <= ~this.field2725[var14][0]; ++var14) {
                    }
                    int[] var15 = this.field2725[var14 - 1];
                    int[] var16 = this.field2725[var14];
                    int var17 = (-var15[0] + var13 << 12) / (var16[0] + -var15[0]);
                    int var18 = -var17 + 4096;
                    int var19 = var15[1] * var18 + var16[1] * var17 >> 12;
                    if (~var19 >= 32767) {
                        var19 = -32767;
                    }
                    if (var19 >= 32768) {
                        var19 = 32767;
                    }
                    this.field2726[var12] = (short) var19;
                }
            }
        } else {
            for (int var20 = 0; var20 < 257; ++var20) {
                int var21 = var20 << 4;
                int var22;
                for (var22 = 1; ~(this.field2725.length + -1) < ~var22 && var21 >= this.field2725[var22][0]; ++var22) {
                }
                int[] var23 = this.field2725[var22 + -1];
                int[] var24 = this.field2725[var22];
                int var25 = this.method1037(var22 - 2, -120)[1];
                int var26 = var24[1];
                int var27 = var26 - var25;
                int var28 = var23[1];
                int var30 = this.method1037(var22 + 1, -107)[1];
                int var31 = var30 - var26 - var25 + var28;
                int var32 = -var28 + var25 - var31;
                int var33 = (-var23[0] + var21 << 12) / (var24[0] + -var23[0]);
                int var34 = var27 * var33 >> 12;
                int var35 = var33 * var33 >> 12;
                int var36 = (var31 * var33 >> 12) * var35 >> 12;
                int var37 = var32 * var35 >> 12;
                int var38 = var28 + var36 + var37 - -var34;
                if (~var38 >= 32767) {
                    var38 = -32767;
                }
                if (~var38 <= -32769) {
                    var38 = 32767;
                }
                this.field2726[var20] = (short) var38;
            }
        }
        if (arg0 != -3452) {
            this.field2728 = 104;
        }
    }

    @OriginalMember(owner = "client!v", name = "b", descriptor = "(II)Z")
    public static final boolean method1035(int arg0, int arg1) {
        ++field2722;
        int var2 = -52 % ((arg1 - -52) / 40);
        return (1 & arg0 >> 31) != 0;
    }

    @OriginalMember(owner = "client!v", name = "j", descriptor = "(I)V")
    private final void method1036(int arg0) {
        ++field2719;
        int[] var2 = this.field2725[1];
        int[] var3 = this.field2725[this.field2725.length + -1];
        int[] var4 = this.field2725[this.field2725.length + -2];
        int[] var5 = this.field2725[arg0];
        this.field2733 = new int[] { var4[0] - (var3[0] - var4[0]), var4[1] - (var3[1] - var4[1]) };
        this.field2720 = new int[] { var5[0] + -var2[0] + var5[0], var5[1] - var2[1] - -var5[1] };
    }

    @OriginalMember(owner = "client!v", name = "c", descriptor = "(II)[I")
    private final int[] method1037(int arg0, int arg1) {
        ++field2724;
        if (arg1 >= -93) {
            this.method1037(-111, -45);
        }
        if (~arg0 > -1) {
            return this.field2720;
        } else {
            return ~this.field2725.length >= ~arg0 ? this.field2733 : this.field2725[arg0];
        }
    }
}
