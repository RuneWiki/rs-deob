import java.util.Random;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!fe")
public class class205 extends class272 {

    @OriginalMember(owner = "client!fe", name = "U", descriptor = "I")
    private int field3750 = 409;

    @OriginalMember(owner = "client!fe", name = "K", descriptor = "I")
    private int field3741 = 1024;

    @OriginalMember(owner = "client!fe", name = "Q", descriptor = "I")
    private int field3747 = 8;

    @OriginalMember(owner = "client!fe", name = "S", descriptor = "I")
    private int field3748 = 1024;

    @OriginalMember(owner = "client!fe", name = "L", descriptor = "I")
    private int field3742 = 204;

    @OriginalMember(owner = "client!fe", name = "T", descriptor = "I")
    private int field3749 = 4;

    @OriginalMember(owner = "client!fe", name = "ab", descriptor = "I")
    private int field3756 = 81;

    @OriginalMember(owner = "client!fe", name = "bb", descriptor = "I")
    private int field3757 = 0;

    @OriginalMember(owner = "client!fe", name = "X", descriptor = "Lli;")
    private static class185 field3753 = class245.method1649(" has logged in)3", -17);

    @OriginalMember(owner = "client!fe", name = "Z", descriptor = "Lli;")
    public static class185 field3755 = field3753;

    @OriginalMember(owner = "client!fe", name = "W", descriptor = "Lfl;")
    public static class191 field3752 = new class191();

    @OriginalMember(owner = "client!fe", name = "kb", descriptor = "Lli;")
    private static class185 field3766 = class245.method1649("M", 123);

    @OriginalMember(owner = "client!fe", name = "ib", descriptor = "Lli;")
    public static class185 field3764 = field3766;

    @OriginalMember(owner = "client!fe", name = "nb", descriptor = "I")
    public static int field3769 = 0;

    @OriginalMember(owner = "client!fe", name = "jb", descriptor = "Lli;")
    public static class185 field3765 = field3766;

    @OriginalMember(owner = "client!fe", name = "lb", descriptor = "I")
    public static int field3767 = 0;

    @OriginalMember(owner = "client!fe", name = "I", descriptor = "I")
    public static int field3740;

    @OriginalMember(owner = "client!fe", name = "N", descriptor = "I")
    public static int field3744;

    @OriginalMember(owner = "client!fe", name = "P", descriptor = "I")
    public static int field3746;

    @OriginalMember(owner = "client!fe", name = "V", descriptor = "I")
    private int field3751;

    @OriginalMember(owner = "client!fe", name = "Y", descriptor = "I")
    private int field3754;

    @OriginalMember(owner = "client!fe", name = "cb", descriptor = "I")
    public static int field3758;

    @OriginalMember(owner = "client!fe", name = "eb", descriptor = "I")
    private int field3760;

    @OriginalMember(owner = "client!fe", name = "hb", descriptor = "I")
    public static int field3763;

    @OriginalMember(owner = "client!fe", name = "mb", descriptor = "I")
    public static int field3768;

    @OriginalMember(owner = "client!fe", name = "fb", descriptor = "Lhi;")
    public static class250 field3761;

    @OriginalMember(owner = "client!fe", name = "M", descriptor = "Ltg;")
    public static class270 field3743;

    @OriginalMember(owner = "client!fe", name = "db", descriptor = "[I")
    private int[] field3759;

    @OriginalMember(owner = "client!fe", name = "O", descriptor = "[[I")
    private int[][] field3745;

    @OriginalMember(owner = "client!fe", name = "gb", descriptor = "[[I")
    private int[][] field3762;

    @OriginalMember(owner = "client!fe", name = "b", descriptor = "(B)V")
    public static void method1455(byte arg0) {
        field3753 = null;
        field3765 = null;
        field3764 = null;
        if (arg0 != 80) {
            field3764 = null;
        }
        field3752 = null;
        field3761 = null;
        field3766 = null;
        field3743 = null;
        field3755 = null;
    }

    @OriginalMember(owner = "client!fe", name = "e", descriptor = "(I)V")
    public final void method113(int arg0) {
        ++field3746;
        this.method1457((byte) 92);
        if (arg0 != 0) {
            this.method1457((byte) -18);
        }
    }

    @OriginalMember(owner = "client!fe", name = "a", descriptor = "(II)[I")
    public final int[] method35(int arg0, int arg1) {
        ++field3763;
        if (arg1 != 4421) {
            this.method113(-26);
        }
        int[] var3 = super.field4819.method1632(0, arg0);
        if (super.field4819.field4294) {
            int var4 = 0;
            int var5;
            for (var5 = class232.field4177[arg0] + this.field3757; var5 < 0; var5 += 4096) {
            }
            while (~var5 < -4097) {
                var5 -= 4096;
            }
            while (var4 < this.field3747 && ~this.field3759[var4] >= ~var5) {
                ++var4;
            }
            int var6 = var4 - 1;
            boolean var7 = ~(var4 & 1) == -1;
            int var8 = this.field3759[var4];
            int var9 = this.field3759[var4 - 1];
            if (var5 > this.field3754 + var9 && ~(var8 - this.field3754) < ~var5) {
                for (int var10 = 0; ~class246.field4385 < ~var10; ++var10) {
                    int var11 = !var7 ? -this.field3741 : this.field3741;
                    int var12 = 0;
                    int var13;
                    for (var13 = class38.field598[var10] - -(this.field3760 * var11 >> 12); var13 < 0; var13 += 4096) {
                    }
                    while (~var13 < -4097) {
                        var13 -= 4096;
                    }
                    while (var12 < this.field3749 && var13 >= this.field3762[var6][var12]) {
                        ++var12;
                    }
                    int var14 = this.field3762[var6][var12];
                    int var15 = var12 + -1;
                    int var16 = this.field3762[var6][var15];
                    if (var16 - -this.field3754 < var13 && var13 < -this.field3754 + var14) {
                        var3[var10] = this.field3745[var6][var15];
                    } else {
                        var3[var10] = 0;
                    }
                }
            } else {
                class190.method1367(var3, 0, class246.field4385, 0);
            }
        }
        return var3;
    }

    @OriginalMember(owner = "client!fe", name = "<init>", descriptor = "()V")
    public class205() {
        super(0, true);
    }

    @OriginalMember(owner = "client!fe", name = "a", descriptor = "(Ljd;BI)V")
    public final void method34(class118 arg0, byte arg1, int arg2) {
        ++field3744;
        if (~arg2 != -1) {
            if (~arg2 != -2) {
                if (arg2 != 2) {
                    if (~arg2 != -4) {
                        if (~arg2 != -5) {
                            if (arg2 != 5) {
                                if (~arg2 != -7) {
                                    if (~arg2 == -8) {
                                        this.field3748 = arg0.method827(255);
                                    }
                                } else {
                                    this.field3756 = arg0.method827(255);
                                }
                            } else {
                                this.field3757 = arg0.method827(255);
                            }
                        } else {
                            this.field3741 = arg0.method827(255);
                        }
                    } else {
                        this.field3742 = arg0.method827(255);
                    }
                } else {
                    this.field3750 = arg0.method827(255);
                }
            } else {
                this.field3747 = arg0.method867(false);
            }
        } else {
            this.field3749 = arg0.method867(false);
        }
        int var5 = 96 % ((arg1 - -21) / 55);
    }

    @OriginalMember(owner = "client!fe", name = "b", descriptor = "(II)V")
    public static final void method1456(int arg0, int arg1) {
        for (class73 var2 = class162.field3051.method192(114); var2 != null; var2 = class162.field3051.method189(0)) {
            if (~(65535L & var2.field1278 >> 48) == ~((long) arg0)) {
                var2.method476(124);
            }
        }
        int var3 = -48 / ((arg1 - -25) / 47);
        ++field3758;
    }

    @OriginalMember(owner = "client!fe", name = "c", descriptor = "(B)V")
    private final void method1457(byte arg0) {
        ++field3740;
        Random var2 = new Random((long) this.field3747);
        this.field3759 = new int[this.field3747 - -1];
        if (arg0 > 67) {
            this.field3759[0] = 0;
            this.field3751 = 4096 / this.field3747;
            this.field3745 = new int[this.field3747][this.field3749];
            this.field3754 = this.field3756 / 2;
            this.field3762 = new int[this.field3747][this.field3749 + 1];
            int var3 = this.field3751 / 2;
            this.field3760 = 4096 / this.field3749;
            int var4 = this.field3760 / 2;
            for (int var5 = 0; ~this.field3747 < ~var5; ++var5) {
                if (~var5 < -1) {
                    int var6 = this.field3751;
                    int var7 = (class255.method1729(var2, 3, 4096) + -2048) * this.field3742 >> 12;
                    int var8 = (var3 * var7 >> 12) + var6;
                    this.field3759[var5] = this.field3759[var5 - 1] - -var8;
                }
                this.field3762[var5][0] = 0;
                for (int var9 = 0; var9 < this.field3749; ++var9) {
                    if (var9 > 0) {
                        int var10 = this.field3760;
                        int var11 = (class255.method1729(var2, 3, 4096) + -2048) * this.field3750 >> 12;
                        int var12 = (var4 * var11 >> 12) + var10;
                        this.field3762[var5][var9] = this.field3762[var5][var9 - 1] + var12;
                    }
                    this.field3745[var5][var9] = this.field3748 <= 0 ? 4096 : -class255.method1729(var2, 3, this.field3748) + 4096;
                }
                this.field3762[var5][this.field3749] = 4096;
            }
            this.field3759[this.field3747] = 4096;
        }
    }
}
