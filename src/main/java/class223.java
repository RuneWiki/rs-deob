import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!s")
public class class223 extends class99 {

    @OriginalMember(owner = "client!s", name = "X", descriptor = "I")
    private int field3801 = 4;

    @OriginalMember(owner = "client!s", name = "db", descriptor = "I")
    private int field3807 = 4;

    @OriginalMember(owner = "client!s", name = "U", descriptor = "Lr;")
    public static class66 field3798 = class93.method641(43, "<col=00ff80>");

    @OriginalMember(owner = "client!s", name = "W", descriptor = "Lr;")
    public static class66 field3800 = class93.method641(43, "mapfunction");

    @OriginalMember(owner = "client!s", name = "S", descriptor = "Lr;")
    private static class66 field3796 = class93.method641(43, "Loaded fonts");

    @OriginalMember(owner = "client!s", name = "Q", descriptor = "Lr;")
    private static class66 field3794 = class93.method641(43, "Loaded wordpack");

    @OriginalMember(owner = "client!s", name = "Z", descriptor = "Lr;")
    public static class66 field3803 = field3794;

    @OriginalMember(owner = "client!s", name = "ab", descriptor = "Lr;")
    public static class66 field3804 = field3796;

    @OriginalMember(owner = "client!s", name = "bb", descriptor = "[Z")
    public static boolean[] field3805 = new boolean[200];

    @OriginalMember(owner = "client!s", name = "V", descriptor = "[I")
    public static int[] field3799 = new int[5];

    @OriginalMember(owner = "client!s", name = "R", descriptor = "I")
    public static int field3795;

    @OriginalMember(owner = "client!s", name = "T", descriptor = "I")
    public static int field3797;

    @OriginalMember(owner = "client!s", name = "Y", descriptor = "I")
    public static int field3802;

    @OriginalMember(owner = "client!s", name = "cb", descriptor = "[I")
    public static int[] field3806;

    @OriginalMember(owner = "client!s", name = "<init>", descriptor = "()V")
    public class223() {
        super(1, false);
    }

    @OriginalMember(owner = "client!s", name = "a", descriptor = "(IZ)[[I")
    public final int[][] method37(int arg0, boolean arg1) {
        if (!arg1) {
            this.method11((class249) null, 104, 10);
        }
        ++field3802;
        int[][] var3 = super.field1946.method823(arg0, (byte) 85);
        if (super.field1946.field2297) {
            int var4 = class16.field223 / this.field3801;
            int var5 = class199.field3432 / this.field3807;
            int[][] var7;
            if (var4 > 0) {
                int var6 = arg0 % var4;
                var7 = this.method683(-93, 0, class16.field223 * var6 / var4);
            } else {
                var7 = this.method683(-24, 0, 0);
            }
            int[] var8 = var7[0];
            int[] var9 = var7[1];
            int[] var10 = var3[1];
            int[] var11 = var3[0];
            int[] var12 = var7[2];
            int[] var13 = var3[2];
            for (int var14 = 0; ~var14 > ~class199.field3432; ++var14) {
                int var16;
                if (~var5 < -1) {
                    int var15 = var14 % var5;
                    var16 = class199.field3432 * var15 / var5;
                } else {
                    var16 = 0;
                }
                var11[var14] = var8[var16];
                var10[var14] = var9[var16];
                var13[var14] = var12[var16];
            }
        }
        return var3;
    }

    @OriginalMember(owner = "client!s", name = "a", descriptor = "(BI)[I")
    public final int[] method10(byte arg0, int arg1) {
        ++field3795;
        int[] var3 = super.field1943.method749(false, arg1);
        if (super.field1943.field2147) {
            int var4 = class16.field223 / this.field3801;
            int var5 = class199.field3432 / this.field3807;
            int[] var6;
            if (var4 <= 0) {
                var6 = this.method682(0, 0, 29149);
            } else {
                int var7 = arg1 % var4;
                var6 = this.method682(0, class16.field223 * var7 / var4, 29149);
            }
            for (int var8 = 0; ~var8 > ~class199.field3432; ++var8) {
                if (~var5 >= -1) {
                    var3[var8] = var6[0];
                } else {
                    int var9 = var8 % var5;
                    var3[var8] = var6[class199.field3432 * var9 / var5];
                }
            }
        }
        if (arg0 != -61) {
            method1418(57);
        }
        return var3;
    }

    @OriginalMember(owner = "client!s", name = "g", descriptor = "(I)V")
    public static void method1418(int arg0) {
        field3796 = null;
        field3804 = null;
        field3798 = null;
        field3799 = null;
        field3803 = null;
        int var1 = -47 % ((49 - arg0) / 53);
        field3800 = null;
        field3805 = null;
        field3794 = null;
        field3806 = null;
    }

    @OriginalMember(owner = "client!s", name = "a", descriptor = "(Llh;II)V")
    public final void method11(class249 arg0, int arg1, int arg2) {
        if (arg2 != -1) {
            this.method10((byte) 87, -105);
        }
        ++field3797;
        if (~arg1 != -1) {
            if (arg1 == 1) {
                this.field3801 = arg0.method1677(-6677);
            }
        } else {
            this.field3807 = arg0.method1677(arg2 ^ 6676);
        }
    }
}
