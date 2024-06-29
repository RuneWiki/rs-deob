import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!vi")
public class class91 extends class117 {

    @OriginalMember(owner = "client!vi", name = "U", descriptor = "I")
    private int field1666 = 4;

    @OriginalMember(owner = "client!vi", name = "bb", descriptor = "I")
    private int field1673 = 4;

    @OriginalMember(owner = "client!vi", name = "S", descriptor = "Lhh;")
    public static class163 field1664 = class137.method1065("Abbrechen", 17);

    @OriginalMember(owner = "client!vi", name = "V", descriptor = "Lhh;")
    private static class163 field1667 = class137.method1065(" ", 17);

    @OriginalMember(owner = "client!vi", name = "Z", descriptor = "[Z")
    public static boolean[] field1671 = new boolean[100];

    @OriginalMember(owner = "client!vi", name = "Y", descriptor = "Lhh;")
    public static class163 field1670 = field1667;

    @OriginalMember(owner = "client!vi", name = "R", descriptor = "I")
    public static int field1663;

    @OriginalMember(owner = "client!vi", name = "T", descriptor = "I")
    public static int field1665;

    @OriginalMember(owner = "client!vi", name = "W", descriptor = "I")
    public static int field1668;

    @OriginalMember(owner = "client!vi", name = "X", descriptor = "I")
    public static int field1669;

    @OriginalMember(owner = "client!vi", name = "cb", descriptor = "I")
    public static int field1674;

    @OriginalMember(owner = "client!vi", name = "ab", descriptor = "Lpa;")
    public static class123 field1672;

    @OriginalMember(owner = "client!vi", name = "a", descriptor = "(II)[I")
    public final int[] method61(int arg0, int arg1) {
        ++field1669;
        int[] var3 = super.field2218.method1044(arg1, arg0 ^ arg0);
        if (super.field2218.field2587) {
            int var4 = class143.field2702 / this.field1666;
            int var5 = class1.field26 / this.field1673;
            int[] var7;
            if (~var5 < -1) {
                int var6 = arg1 % var5;
                var7 = this.method932(class1.field26 * var6 / var5, false, 0);
            } else {
                var7 = this.method932(0, false, 0);
            }
            for (int var8 = 0; ~class143.field2702 < ~var8; ++var8) {
                if (~var4 < -1) {
                    int var9 = var8 % var4;
                    var3[var8] = var7[class143.field2702 * var9 / var4];
                } else {
                    var3[var8] = var7[0];
                }
            }
        }
        return var3;
    }

    @OriginalMember(owner = "client!vi", name = "<init>", descriptor = "()V")
    public class91() {
        super(1, false);
    }

    @OriginalMember(owner = "client!vi", name = "a", descriptor = "(IZ)[[I")
    public final int[][] method90(int arg0, boolean arg1) {
        ++field1674;
        int[][] var3 = super.field2228.method1304(arg0, (byte) 109);
        if (!arg1) {
            this.method61(-41, 6);
        }
        if (super.field2228.field3221) {
            int var4 = class1.field26 / this.field1673;
            int var5 = class143.field2702 / this.field1666;
            int[][] var6;
            if (~var4 >= -1) {
                var6 = this.method931(0, 60, 0);
            } else {
                int var7 = arg0 % var4;
                var6 = this.method931(class1.field26 * var7 / var4, 84, 0);
            }
            int[] var8 = var6[0];
            int[] var9 = var6[1];
            int[] var10 = var3[1];
            int[] var11 = var6[2];
            int[] var12 = var3[2];
            int[] var13 = var3[0];
            for (int var14 = 0; var14 < class143.field2702; ++var14) {
                int var16;
                if (var5 > 0) {
                    int var15 = var14 % var5;
                    var16 = class143.field2702 * var15 / var5;
                } else {
                    var16 = 0;
                }
                var13[var14] = var8[var16];
                var10[var14] = var9[var16];
                var12[var14] = var11[var16];
            }
        }
        return var3;
    }

    @OriginalMember(owner = "client!vi", name = "a", descriptor = "(Z)V")
    public static void method702(boolean arg0) {
        field1672 = null;
        if (arg0) {
            field1670 = null;
        }
        field1670 = null;
        field1664 = null;
        field1667 = null;
        field1671 = null;
    }

    @OriginalMember(owner = "client!vi", name = "a", descriptor = "(IILpg;)V")
    public final void method60(int arg0, int arg1, class81 arg2) {
        ++field1668;
        if (~arg1 != -1) {
            if (arg1 == 1) {
                this.field1673 = arg2.method622(true);
            }
        } else {
            this.field1666 = arg2.method622(true);
        }
        if (arg0 != 0) {
            field1672 = null;
        }
    }
}
