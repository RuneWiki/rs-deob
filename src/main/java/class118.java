import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!hh")
public class class118 extends class224 {

    @OriginalMember(owner = "client!hh", name = "H", descriptor = "I")
    private int field1727 = 4;

    @OriginalMember(owner = "client!hh", name = "Q", descriptor = "I")
    private int field1735 = 4;

    @OriginalMember(owner = "client!hh", name = "I", descriptor = "Llf;")
    public static class211 field1728 = new class211(64);

    @OriginalMember(owner = "client!hh", name = "V", descriptor = "I")
    public static int field1740 = 0;

    @OriginalMember(owner = "client!hh", name = "K", descriptor = "I")
    public static int field1729;

    @OriginalMember(owner = "client!hh", name = "L", descriptor = "I")
    public static int field1730;

    @OriginalMember(owner = "client!hh", name = "M", descriptor = "I")
    public static int field1731;

    @OriginalMember(owner = "client!hh", name = "N", descriptor = "I")
    public static int field1732;

    @OriginalMember(owner = "client!hh", name = "O", descriptor = "I")
    public static int field1733;

    @OriginalMember(owner = "client!hh", name = "P", descriptor = "I")
    public static int field1734;

    @OriginalMember(owner = "client!hh", name = "W", descriptor = "I")
    public static int field1741;

    @OriginalMember(owner = "client!hh", name = "S", descriptor = "Ldl;")
    public static class123 field1737;

    @OriginalMember(owner = "client!hh", name = "T", descriptor = "Ldl;")
    public static class123 field1738;

    @OriginalMember(owner = "client!hh", name = "R", descriptor = "Lef;")
    public static class214 field1736;

    @OriginalMember(owner = "client!hh", name = "U", descriptor = "Lef;")
    public static class214 field1739;

    @OriginalMember(owner = "client!hh", name = "b", descriptor = "(II)[[I")
    public final int[][] method15(int arg0, int arg1) {
        ++field1733;
        if (arg1 != 1) {
            return null;
        } else {
            int[][] var3 = super.field3616.method1341(false, arg0);
            if (super.field3616.field3042) {
                int var4 = class78.field1108 / this.field1727;
                int var5 = class36.field471 / this.field1735;
                int[][] var6;
                if (var5 <= 0) {
                    var6 = this.method1532(arg1 ^ 118, 0, 0);
                } else {
                    int var7 = arg0 % var5;
                    var6 = this.method1532(111, 0, class36.field471 * var7 / var5);
                }
                int[] var8 = var6[0];
                int[] var9 = var6[1];
                int[] var10 = var3[0];
                int[] var11 = var3[2];
                int[] var12 = var3[1];
                int[] var13 = var6[2];
                for (int var14 = 0; ~class78.field1108 < ~var14; ++var14) {
                    int var15;
                    if (~var4 >= -1) {
                        var15 = 0;
                    } else {
                        int var16 = var14 % var4;
                        var15 = class78.field1108 * var16 / var4;
                    }
                    var10[var14] = var8[var15];
                    var12[var14] = var9[var15];
                    var11[var14] = var13[var15];
                }
            }
            return var3;
        }
    }

    @OriginalMember(owner = "client!hh", name = "f", descriptor = "(I)V")
    public static void method780(int arg0) {
        field1728 = null;
        field1737 = null;
        field1738 = null;
        field1739 = null;
        field1736 = null;
        if (arg0 != 0) {
            method782((byte) 111);
        }
    }

    @OriginalMember(owner = "client!hh", name = "a", descriptor = "(IZ)[I")
    public final int[] method14(int arg0, boolean arg1) {
        ++field1732;
        if (!arg1) {
            field1728 = null;
        }
        int[] var3 = super.field3625.method1862(arg0, (byte) 52);
        if (super.field3625.field4425) {
            int var4 = class78.field1108 / this.field1727;
            int var5 = class36.field471 / this.field1735;
            int[] var7;
            if (~var5 < -1) {
                int var6 = arg0 % var5;
                var7 = this.method1527(class36.field471 * var6 / var5, 0, (byte) 84);
            } else {
                var7 = this.method1527(0, 0, (byte) 84);
            }
            for (int var8 = 0; var8 < class78.field1108; ++var8) {
                if (~var4 < -1) {
                    int var9 = var8 % var4;
                    var3[var8] = var7[class78.field1108 * var9 / var4];
                } else {
                    var3[var8] = var7[0];
                }
            }
        }
        return var3;
    }

    @OriginalMember(owner = "client!hh", name = "a", descriptor = "(IIIBI)V")
    public static final void method781(int arg0, int arg1, int arg2, byte arg3, int arg4) {
        class51.field710 = arg0;
        class110.field1669 = arg1;
        if (arg3 != -125) {
            field1734 = -123;
        }
        class189.field2984 = arg4;
        class96.field1484 = arg2;
        ++field1730;
    }

    @OriginalMember(owner = "client!hh", name = "a", descriptor = "(B)[Lkj;")
    public static final class145[] method782(byte arg0) {
        ++field1729;
        class145[] var1 = new class145[class35.field454];
        int var2 = -104 % ((arg0 - 57) / 46);
        for (int var3 = 0; class35.field454 > var3; ++var3) {
            var1[var3] = new class15(class46.field583, class209.field3253, class206.field3221[var3], class226.field3653[var3], class236.field3777[var3], class228.field3696[var3], class101.field1574[var3], class72.field1023);
        }
        class222.method1506((byte) 108);
        return var1;
    }

    @OriginalMember(owner = "client!hh", name = "<init>", descriptor = "()V")
    public class118() {
        super(1, false);
    }

    @OriginalMember(owner = "client!hh", name = "a", descriptor = "(Llj;IB)V")
    public final void method16(class25 arg0, int arg1, byte arg2) {
        ++field1741;
        if (~arg1 != -1) {
            if (arg1 == 1) {
                this.field1735 = arg0.method201(255);
            }
        } else {
            this.field1727 = arg0.method201(255);
        }
        if (arg2 > -46) {
            method780(33);
        }
    }
}
