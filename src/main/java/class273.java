import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!th")
public class class273 extends class89 {

    @OriginalMember(owner = "client!th", name = "Y", descriptor = "I")
    private int field4721 = 0;

    @OriginalMember(owner = "client!th", name = "T", descriptor = "I")
    private int field4716 = 4096;

    @OriginalMember(owner = "client!th", name = "X", descriptor = "Lbj;")
    public static class80 field4720 = new class80(5000);

    @OriginalMember(owner = "client!th", name = "db", descriptor = "I")
    public static int field4726 = -1;

    @OriginalMember(owner = "client!th", name = "Q", descriptor = "I")
    public static int field4713;

    @OriginalMember(owner = "client!th", name = "R", descriptor = "I")
    public static int field4714;

    @OriginalMember(owner = "client!th", name = "S", descriptor = "I")
    public static int field4715;

    @OriginalMember(owner = "client!th", name = "U", descriptor = "I")
    public static int field4717;

    @OriginalMember(owner = "client!th", name = "V", descriptor = "I")
    public static int field4718;

    @OriginalMember(owner = "client!th", name = "W", descriptor = "I")
    public static int field4719;

    @OriginalMember(owner = "client!th", name = "Z", descriptor = "I")
    public static int field4722;

    @OriginalMember(owner = "client!th", name = "bb", descriptor = "Lcc;")
    public static class251 field4724;

    @OriginalMember(owner = "client!th", name = "ab", descriptor = "[I")
    public static int[] field4723;

    @OriginalMember(owner = "client!th", name = "cb", descriptor = "[[[I")
    public static int[][][] field4725;

    @OriginalMember(owner = "client!th", name = "a", descriptor = "(ILij;I)V")
    public final void method49(int arg0, class85 arg1, int arg2) {
        if (arg0 != -20503) {
            field4723 = null;
        }
        ++field4718;
        if (arg2 != 0) {
            if (~arg2 != -2) {
                if (arg2 == 2) {
                    super.field1508 = ~arg1.method564((byte) 96) == -2;
                }
            } else {
                this.field4716 = arg1.method608(102);
            }
        } else {
            this.field4721 = arg1.method608(56);
        }
    }

    @OriginalMember(owner = "client!th", name = "<init>", descriptor = "()V")
    public class273() {
        super(1, false);
    }

    @OriginalMember(owner = "client!th", name = "i", descriptor = "(I)V")
    public static void method1795(int arg0) {
        if (arg0 == -6690) {
            field4724 = null;
            field4723 = null;
            field4720 = null;
            field4725 = null;
        }
    }

    @OriginalMember(owner = "client!th", name = "a", descriptor = "(IZ)[I")
    public final int[] method239(int arg0, boolean arg1) {
        if (arg1) {
            this.method21(true, 7);
        }
        ++field4715;
        int[] var3 = super.field1503.method229(arg0, (byte) -103);
        if (super.field1503.field664) {
            int[] var4 = this.method645(-128, 0, arg0);
            for (int var5 = 0; class65.field1070 > var5; ++var5) {
                int var6 = var4[var5];
                if (this.field4721 > var6) {
                    var3[var5] = this.field4721;
                } else if (this.field4716 < var6) {
                    var3[var5] = this.field4716;
                } else {
                    var3[var5] = var6;
                }
            }
        }
        return var3;
    }

    @OriginalMember(owner = "client!th", name = "a", descriptor = "(ILma;Lma;)V")
    public static final void method1796(int arg0, class105 arg1, class105 arg2) {
        class119.field2130 = arg2;
        class9.field134 = arg1;
        ++field4722;
        if (arg0 != -12922) {
            field4725 = null;
        }
        class277.field4836 = class119.field2130.method779((byte) -101, 3);
    }

    @OriginalMember(owner = "client!th", name = "c", descriptor = "(III)I")
    public static final int method1797(int arg0, int arg1, int arg2) {
        int var3 = class228.method1474(arg2 - -91923, true, 4, arg1 + 45365) - (128 + -(class228.method1474(arg2 + 37821, true, 2, arg1 + 10294) - 128 >> 1) - (-128 + class228.method1474(arg2, true, 1, arg1) >> 2));
        int var4 = (int) ((double) var3 * 0.3D) + 35;
        if (var4 >= 10) {
            if (~var4 < -61) {
                var4 = 60;
            }
        } else {
            var4 = 10;
        }
        ++field4719;
        if (arg0 != -29399) {
            method1796(43, (class105) null, (class105) null);
        }
        return var4;
    }

    @OriginalMember(owner = "client!th", name = "a", descriptor = "(ZI)[[I")
    public final int[][] method21(boolean arg0, int arg1) {
        if (!arg0) {
            method1796(-59, (class105) null, (class105) null);
        }
        ++field4717;
        int[][] var3 = super.field1512.method824(arg1, (byte) -33);
        if (super.field1512.field2007) {
            int[][] var4 = this.method648(arg0, 0, arg1);
            int[] var5 = var4[2];
            int[] var6 = var4[1];
            int[] var7 = var3[1];
            int[] var8 = var3[0];
            int[] var9 = var3[2];
            int[] var10 = var4[0];
            for (int var11 = 0; class65.field1070 > var11; ++var11) {
                int var12 = var10[var11];
                int var13 = var6[var11];
                int var14 = var5[var11];
                if (var12 >= this.field4721) {
                    if (~this.field4716 <= ~var12) {
                        var8[var11] = var12;
                    } else {
                        var8[var11] = this.field4716;
                    }
                } else {
                    var8[var11] = this.field4721;
                }
                if (~this.field4721 >= ~var13) {
                    if (this.field4716 >= var13) {
                        var7[var11] = var13;
                    } else {
                        var7[var11] = this.field4716;
                    }
                } else {
                    var7[var11] = this.field4721;
                }
                if (this.field4721 > var14) {
                    var9[var11] = this.field4721;
                } else if (~var14 < ~this.field4716) {
                    var9[var11] = this.field4716;
                } else {
                    var9[var11] = var14;
                }
            }
        }
        return var3;
    }
}
