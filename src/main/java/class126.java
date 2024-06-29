import java.util.Random;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ml")
public class class126 extends class300 {

    @OriginalMember(owner = "client!ml", name = "J", descriptor = "Z")
    private boolean field1807 = true;

    @OriginalMember(owner = "client!ml", name = "G", descriptor = "Z")
    private boolean field1804 = true;

    @OriginalMember(owner = "client!ml", name = "L", descriptor = "Ljava/util/Random;")
    public static Random field1809 = new Random();

    @OriginalMember(owner = "client!ml", name = "M", descriptor = "Ljava/lang/String;")
    public static String field1810 = "Select";

    @OriginalMember(owner = "client!ml", name = "N", descriptor = "Ljava/lang/String;")
    public static String field1811 = "green:";

    @OriginalMember(owner = "client!ml", name = "P", descriptor = "[I")
    public static int[] field1813 = new int[] { 1, 2, 4, 8 };

    @OriginalMember(owner = "client!ml", name = "F", descriptor = "I")
    public static int field1803;

    @OriginalMember(owner = "client!ml", name = "H", descriptor = "I")
    public static int field1805;

    @OriginalMember(owner = "client!ml", name = "I", descriptor = "I")
    public static int field1806;

    @OriginalMember(owner = "client!ml", name = "K", descriptor = "I")
    public static int field1808;

    @OriginalMember(owner = "client!ml", name = "Q", descriptor = "I")
    public static int field1814;

    @OriginalMember(owner = "client!ml", name = "O", descriptor = "Lvl;")
    public static class73 field1812;

    @OriginalMember(owner = "client!ml", name = "b", descriptor = "(II)[[I")
    public final int[][] method36(int arg0, int arg1) {
        int var3 = -90 % (-arg0 / 47);
        int[][] var4 = super.field4786.method538(arg1, (byte) 106);
        if (super.field4786.field1200) {
            int[][] var5 = this.method2021(this.field1807 ? -arg1 + class285.field4611 : arg1, false, 0);
            int[] var6 = var5[0];
            int[] var7 = var4[0];
            int[] var8 = var5[2];
            int[] var9 = var4[1];
            int[] var10 = var5[1];
            int[] var11 = var4[2];
            if (this.field1804) {
                for (int var12 = 0; var12 < class180.field2826; ++var12) {
                    var7[var12] = var6[class277.field4503 - var12];
                    var9[var12] = var10[class277.field4503 - var12];
                    var11[var12] = var8[-var12 + class277.field4503];
                }
            } else {
                for (int var13 = 0; ~class180.field2826 < ~var13; ++var13) {
                    var7[var13] = var6[var13];
                    var9[var13] = var10[var13];
                    var11[var13] = var8[var13];
                }
            }
        }
        ++field1803;
        return var4;
    }

    @OriginalMember(owner = "client!ml", name = "a", descriptor = "(II)[I")
    public final int[] method99(int arg0, int arg1) {
        ++field1805;
        if (arg1 != -957953300) {
            return null;
        } else {
            int[] var3 = super.field4797.method217(arg0, true);
            if (super.field4797.field470) {
                int[] var4 = this.method2018(0, -1, this.field1807 ? -arg0 + class285.field4611 : arg0);
                if (this.field1804) {
                    for (int var5 = 0; ~var5 > ~class180.field2826; ++var5) {
                        var3[var5] = var4[-var5 + class277.field4503];
                    }
                } else {
                    class103.method692(var4, 0, var3, 0, class180.field2826);
                }
            }
            return var3;
        }
    }

    @OriginalMember(owner = "client!ml", name = "a", descriptor = "(IIIII)V")
    public static final void method815(int arg0, int arg1, int arg2, int arg3, int arg4) {
        ++field1806;
        class150.field2218.field2676 = 0;
        class150.field2218.method1183(arg0, arg0 ^ 984049196);
        class150.field2218.method1183(arg1, 984049208);
        class150.field2218.method1183(arg4, arg0 + 984049188);
        class150.field2218.method1180(arg0 ^ -17417, arg3);
        class150.field2218.method1180(-17437, arg2);
        class263.field4267 = 0;
        class118.field1706 = 0;
        class130.field1863 = -3;
        class299.field4764 = 1;
    }

    @OriginalMember(owner = "client!ml", name = "d", descriptor = "(B)V")
    public static void method816(byte arg0) {
        field1811 = null;
        field1812 = null;
        field1809 = null;
        if (arg0 == 30) {
            field1813 = null;
            field1810 = null;
        }
    }

    @OriginalMember(owner = "client!ml", name = "<init>", descriptor = "()V")
    public class126() {
        super(1, false);
    }

    @OriginalMember(owner = "client!ml", name = "a", descriptor = "(Lim;BI)V")
    public final void method35(class170 arg0, byte arg1, int arg2) {
        if (arg2 != 0) {
            if (arg2 != 1) {
                if (arg2 == 2) {
                    super.field4784 = arg0.method1218(65) == 1;
                }
            } else {
                this.field1807 = arg0.method1218(120) == 1;
            }
        } else {
            this.field1804 = arg0.method1218(78) == 1;
        }
        if (arg1 > -43) {
            field1809 = null;
        }
        ++field1808;
    }
}
