import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!o")
public class class148 extends class1 {

    @OriginalMember(owner = "client!o", name = "wb", descriptor = "I")
    private int field2660 = 0;

    @OriginalMember(owner = "client!o", name = "tb", descriptor = "[S")
    private short[] field2657 = new short[257];

    @OriginalMember(owner = "client!o", name = "gb", descriptor = "[Loc;")
    public static class151[] field2644 = new class151[100];

    @OriginalMember(owner = "client!o", name = "kb", descriptor = "I")
    public static int field2648 = 0;

    @OriginalMember(owner = "client!o", name = "pb", descriptor = "Loc;")
    public static class151 field2653 = class137.method873(2, "W-=hlen Sie eine Welt");

    @OriginalMember(owner = "client!o", name = "qb", descriptor = "I")
    public static int field2654 = 0;

    @OriginalMember(owner = "client!o", name = "ib", descriptor = "I")
    public static int field2646;

    @OriginalMember(owner = "client!o", name = "lb", descriptor = "I")
    public static int field2649;

    @OriginalMember(owner = "client!o", name = "nb", descriptor = "I")
    public static int field2651;

    @OriginalMember(owner = "client!o", name = "rb", descriptor = "I")
    public static int field2655;

    @OriginalMember(owner = "client!o", name = "sb", descriptor = "I")
    public static int field2656;

    @OriginalMember(owner = "client!o", name = "ub", descriptor = "I")
    public static int field2658;

    @OriginalMember(owner = "client!o", name = "vb", descriptor = "I")
    public static int field2659;

    @OriginalMember(owner = "client!o", name = "xb", descriptor = "I")
    public static int field2661;

    @OriginalMember(owner = "client!o", name = "hb", descriptor = "[I")
    private int[] field2645;

    @OriginalMember(owner = "client!o", name = "jb", descriptor = "[I")
    private int[] field2647;

    @OriginalMember(owner = "client!o", name = "mb", descriptor = "[I")
    public static int[] field2650;

    @OriginalMember(owner = "client!o", name = "ob", descriptor = "[[I")
    private int[][] field2652;

    @OriginalMember(owner = "client!o", name = "f", descriptor = "(I)Lcg;")
    public static final class30 method938(int arg0) {
        int var1 = 109 / ((-21 - arg0) / 40);
        ++field2651;
        class30 var2 = new class30();
        var2.field631 = class128.field2302[0];
        var2.field632 = class67.field1312;
        var2.field630 = field2650[0];
        var2.field628 = class174.field3147[0];
        var2.field633 = class159.field2862[0];
        var2.field629 = class124.field2236;
        var2.field634 = class181.field3271[0];
        var2.field635 = class169.field3079;
        class99.method612(-20444);
        return var2;
    }

    @OriginalMember(owner = "client!o", name = "a", descriptor = "(BI)[I")
    public final int[] method11(byte arg0, int arg1) {
        if (arg0 != 107) {
            field2653 = null;
        }
        int[] var3 = super.field21.method1182(arg1, -31709);
        ++field2656;
        if (super.field21.field3388) {
            int[] var4 = this.method4(arg1, -99, 0);
            for (int var5 = 0; class202.field3603 > var5; ++var5) {
                int var6 = var4[var5] >> 4;
                if (~var6 > -1) {
                    var6 = 0;
                }
                if (~var6 < -257) {
                    var6 = 256;
                }
                var3[var5] = this.field2657[var6];
            }
        }
        return var3;
    }

    @OriginalMember(owner = "client!o", name = "b", descriptor = "(I)V")
    public final void method2(int arg0) {
        ++field2659;
        if (this.field2652 == null) {
            this.field2652 = new int[][] { new int[2], { 4096, 4096 } };
        }
        if (~this.field2652.length > -3) {
            throw new RuntimeException("Curve operation requires at least two markers");
        } else {
            if (~this.field2660 == -3) {
                this.method941(-125);
            }
            if (arg0 != 3) {
                this.method13(-33, -92, (class229) null);
            }
            class182.method1146(false);
            this.method942((byte) 39);
        }
    }

    @OriginalMember(owner = "client!o", name = "<init>", descriptor = "()V")
    public class148() {
        super(1, true);
    }

    @OriginalMember(owner = "client!o", name = "c", descriptor = "(II)[I")
    private final int[] method939(int arg0, int arg1) {
        if (arg1 > -86) {
            method940(false, 64);
        }
        ++field2658;
        if (arg0 < 0) {
            return this.field2645;
        } else {
            return this.field2652.length <= arg0 ? this.field2647 : this.field2652[arg0];
        }
    }

    @OriginalMember(owner = "client!o", name = "a", descriptor = "(ZI)I")
    public static final int method940(boolean arg0, int arg1) {
        ++field2646;
        if ((arg1 < 97 || ~arg1 < -123) && (~arg1 > -225 || arg1 > 254 || arg1 == 247)) {
            if (~arg1 == -256) {
                return 159;
            } else if (arg0) {
                return 72;
            } else {
                return ~arg1 == -157 ? 140 : arg1;
            }
        } else {
            return arg1 + -32;
        }
    }

    @OriginalMember(owner = "client!o", name = "a", descriptor = "(IILwa;)V")
    public final void method13(int arg0, int arg1, class229 arg2) {
        ++field2661;
        if (arg0 == arg1) {
            this.field2660 = arg2.method1475(255);
            this.field2652 = new int[arg2.method1475(255)][2];
            for (int var4 = 0; var4 < this.field2652.length; ++var4) {
                this.field2652[var4][0] = arg2.method1490((byte) 73);
                this.field2652[var4][1] = arg2.method1490((byte) 73);
            }
        }
    }

    @OriginalMember(owner = "client!o", name = "g", descriptor = "(I)V")
    private final void method941(int arg0) {
        int[] var2 = this.field2652[1];
        int[] var3 = this.field2652[0];
        if (arg0 >= -116) {
            this.method13(-107, -87, (class229) null);
        }
        int[] var4 = this.field2652[this.field2652.length - 2];
        int[] var5 = this.field2652[this.field2652.length + -1];
        this.field2647 = new int[] { var4[0] - (var5[0] - var4[0]), var4[1] + -var5[1] + var4[1] };
        ++field2655;
        this.field2645 = new int[] { var3[0] + -var2[0] + var3[0], var3[1] + -var2[1] + var3[1] };
    }

    @OriginalMember(owner = "client!o", name = "e", descriptor = "(B)V")
    private final void method942(byte arg0) {
        ++field2649;
        int var2 = this.field2660;
        if (var2 != 2) {
            if (~var2 == -2) {
                for (int var3 = 0; var3 < 257; ++var3) {
                    int var4 = var3 << 4;
                    int var5;
                    for (var5 = 1; ~(this.field2652.length - 1) < ~var5 && ~this.field2652[var5][0] >= ~var4; ++var5) {
                    }
                    int[] var6 = this.field2652[var5];
                    int[] var7 = this.field2652[var5 + -1];
                    int var8 = (-var7[0] + var4 << 12) / (var6[0] + -var7[0]);
                    int var9 = 4096 - class164.field2963[255 & var8 >> 5] >> 1;
                    int var10 = -var9 + 4096;
                    int var11 = var6[1] * var9 + var7[1] * var10 >> 12;
                    if (var11 <= -32768) {
                        var11 = -32767;
                    }
                    if (~var11 <= -32769) {
                        var11 = 32767;
                    }
                    this.field2657[var3] = (short) var11;
                }
            } else {
                for (int var12 = 0; ~var12 > -258; ++var12) {
                    int var13 = var12 << 4;
                    int var14;
                    for (var14 = 1; var14 < this.field2652.length + -1 && ~this.field2652[var14][0] >= ~var13; ++var14) {
                    }
                    int[] var15 = this.field2652[var14];
                    int[] var16 = this.field2652[var14 + -1];
                    int var17 = (-var16[0] + var13 << 12) / (var15[0] + -var16[0]);
                    int var18 = -var17 + 4096;
                    int var19 = var15[1] * var17 + var16[1] * var18 >> 12;
                    if (~var19 >= 32767) {
                        var19 = -32767;
                    }
                    if (var19 >= 32768) {
                        var19 = 32767;
                    }
                    this.field2657[var12] = (short) var19;
                }
            }
        } else {
            for (int var20 = 0; ~var20 > -258; ++var20) {
                int var21 = var20 << 4;
                int var22;
                for (var22 = 1; ~var22 > ~(this.field2652.length + -1) && ~var21 <= ~this.field2652[var22][0]; ++var22) {
                }
                int[] var23 = this.field2652[var22 + -1];
                int[] var24 = this.field2652[var22];
                int var25 = this.method939(var22 - 2, -108)[1];
                int var26 = var24[1];
                int var27 = var26 - var25;
                int var28 = var23[1];
                int var29 = this.method939(var22 + 1, -109)[1];
                int var31 = (var21 - var23[0] << 12) / (var24[0] + -var23[0]);
                int var32 = var31 * var31 >> 12;
                int var33 = var27 * var31 >> 12;
                int var34 = -var25 + var29 - var26 - -var28;
                int var35 = (var31 * var34 >> 12) * var32 >> 12;
                int var36 = var25 - var28 - var34;
                int var37 = var32 * var36 >> 12;
                int var38 = var35 - -var28 + var33 + var37;
                if (var38 <= -32768) {
                    var38 = -32767;
                }
                if (~var38 <= -32769) {
                    var38 = 32767;
                }
                this.field2657[var20] = (short) var38;
            }
        }
        if (arg0 <= 13) {
            this.field2647 = null;
        }
    }

    @OriginalMember(owner = "client!o", name = "h", descriptor = "(I)V")
    public static void method943(int arg0) {
        if (arg0 < 27) {
            method943(36);
        }
        field2650 = null;
        field2644 = null;
        field2653 = null;
    }
}
