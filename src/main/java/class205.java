import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("wc")
public class class205 extends class85 {

    @OriginalMember(owner = "wc", name = "T", descriptor = "I")
    private int field4022 = 4;

    @OriginalMember(owner = "wc", name = "V", descriptor = "I")
    private int field4024 = 4;

    @OriginalMember(owner = "wc", name = "Q", descriptor = "Lia;")
    public static class79 field4019 = new class79();

    @OriginalMember(owner = "wc", name = "X", descriptor = "Llf;")
    private static class109 field4026 = class35.method275("Please try again)3", 2);

    @OriginalMember(owner = "wc", name = "W", descriptor = "Llf;")
    public static class109 field4025 = field4026;

    @OriginalMember(owner = "wc", name = "Y", descriptor = "Z")
    public static boolean field4027 = false;

    @OriginalMember(owner = "wc", name = "R", descriptor = "I")
    public static int field4020;

    @OriginalMember(owner = "wc", name = "U", descriptor = "I")
    public static int field4023;

    @OriginalMember(owner = "wc", name = "Z", descriptor = "I")
    public static int field4028;

    @OriginalMember(owner = "wc", name = "S", descriptor = "Z")
    public static boolean field4021;

    @OriginalMember(owner = "wc", name = "a", descriptor = "(II)[I")
    public final int[] method87(int arg0, int arg1) {
        if (arg0 >= -49) {
            return null;
        } else {
            ++field4020;
            int[] var3 = super.field1736.method835(-314, arg1);
            if (super.field1736.field2253) {
                int var4 = class57.field1152 / this.field4022;
                int var5 = class38.field824 / this.field4024;
                int[] var7;
                if (var5 > 0) {
                    int var6 = arg1 % var5;
                    var7 = this.method540(class38.field824 * var6 / var5, 28, 0);
                } else {
                    var7 = this.method540(0, -125, 0);
                }
                for (int var8 = 0; var8 < class57.field1152; ++var8) {
                    if (~var4 >= -1) {
                        var3[var8] = var7[0];
                    } else {
                        int var9 = var8 % var4;
                        var3[var8] = var7[class57.field1152 * var9 / var4];
                    }
                }
            }
            return var3;
        }
    }

    @OriginalMember(owner = "wc", name = "<init>", descriptor = "()V")
    public class205() {
        super(1, false);
    }

    @OriginalMember(owner = "wc", name = "b", descriptor = "(II)[[I")
    public final int[][] method29(int arg0, int arg1) {
        ++field4028;
        int[][] var3 = super.field1719.method673((byte) -127, arg0);
        if (arg1 != 2177) {
            this.method87(108, -60);
        }
        if (super.field1719.field1926) {
            int var4 = class57.field1152 / this.field4022;
            int var5 = class38.field824 / this.field4024;
            int[][] var7;
            if (var5 > 0) {
                int var6 = arg0 % var5;
                var7 = this.method544(false, class38.field824 * var6 / var5, 0);
            } else {
                var7 = this.method544(false, 0, 0);
            }
            int[] var8 = var3[0];
            int[] var9 = var7[1];
            int[] var10 = var7[0];
            int[] var11 = var3[2];
            int[] var12 = var3[1];
            int[] var13 = var7[2];
            for (int var14 = 0; ~var14 > ~class57.field1152; ++var14) {
                int var15;
                if (var4 <= 0) {
                    var15 = 0;
                } else {
                    int var16 = var14 % var4;
                    var15 = class57.field1152 * var16 / var4;
                }
                var8[var14] = var10[var15];
                var12[var14] = var9[var15];
                var11[var14] = var13[var15];
            }
        }
        return var3;
    }

    @OriginalMember(owner = "wc", name = "d", descriptor = "(B)V")
    public static void method1348(byte arg0) {
        field4026 = null;
        int var1 = -22 / ((arg0 - -9) / 34);
        field4019 = null;
        field4025 = null;
    }

    @OriginalMember(owner = "wc", name = "a", descriptor = "(BILja;)V")
    public final void method31(byte arg0, int arg1, class86 arg2) {
        if (arg1 != 0) {
            if (arg1 == 1) {
                this.field4024 = arg2.method598((byte) 78);
            }
        } else {
            this.field4022 = arg2.method598((byte) 81);
        }
        if (arg0 >= -120) {
            method1348((byte) -3);
        }
        ++field4023;
    }
}
