import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!cj")
public class class298 extends class529 {

    @OriginalMember(owner = "client!cj", name = "E", descriptor = "I")
    private int field3861 = 32768;

    @OriginalMember(owner = "client!cj", name = "G", descriptor = "Lus;")
    public static class328 field3863 = new class328(30, 3);

    @OriginalMember(owner = "client!cj", name = "I", descriptor = "S")
    public static short field3865 = 1;

    @OriginalMember(owner = "client!cj", name = "D", descriptor = "I")
    public static int field3860;

    @OriginalMember(owner = "client!cj", name = "F", descriptor = "I")
    public static int field3862;

    @OriginalMember(owner = "client!cj", name = "H", descriptor = "I")
    public static int field3864;

    @OriginalMember(owner = "client!cj", name = "J", descriptor = "I")
    public static int field3866;

    @OriginalMember(owner = "client!cj", name = "K", descriptor = "I")
    public static int field3867;

    @OriginalMember(owner = "client!cj", name = "c", descriptor = "(I)V")
    public final void method303(int arg0) {
        ++field3860;
        if (arg0 >= -92) {
            field3865 = 92;
        }
        class713.method3947((byte) 93);
    }

    @OriginalMember(owner = "client!cj", name = "a", descriptor = "(II)[[I")
    public final int[][] method592(int arg0, int arg1) {
        if (arg1 != 2) {
            this.method190(-116, (byte) 14, (class179) null);
        }
        ++field3862;
        int[][] var3 = super.field7450.method2241(-1, arg0);
        if (super.field7450.field5165) {
            int[] var4 = this.method3028((byte) 114, arg0, 1);
            int[] var5 = this.method3028((byte) 102, arg0, 2);
            int[] var6 = var3[0];
            int[] var7 = var3[1];
            int[] var8 = var3[2];
            for (int var9 = 0; ~var9 > ~class304.field3909; ++var9) {
                int var10 = 255 & var4[var9] * 255 >> 12;
                int var11 = var5[var9] * this.field3861 >> 12;
                int var12 = class132.field1574[var10] * var11 >> 12;
                int var13 = class550.field7739[var10] * var11 >> 12;
                int var14 = (var12 >> 12) + var9 & class404.field5700;
                int var15 = (var13 >> 12) + arg0 & class33.field516;
                int[][] var16 = this.method3026(0, var15, 18464);
                var6[var9] = var16[0][var14];
                var7[var9] = var16[1][var14];
                var8[var9] = var16[2][var14];
            }
        }
        return var3;
    }

    @OriginalMember(owner = "client!cj", name = "a", descriptor = "(IBLtn;)V")
    public final void method190(int arg0, byte arg1, class179 arg2) {
        ++field3867;
        if (arg0 != 0) {
            if (~arg0 == -2) {
                super.field7461 = ~arg2.method1094(255) == -2;
            }
        } else {
            this.field3861 = arg2.method1107(false) << 4;
        }
        if (arg1 <= 45) {
            field3863 = null;
        }
    }

    @OriginalMember(owner = "client!cj", name = "e", descriptor = "(B)V")
    public static void method1769(byte arg0) {
        field3863 = null;
        if (arg0 < 65) {
            method1769((byte) -102);
        }
    }

    @OriginalMember(owner = "client!cj", name = "<init>", descriptor = "()V")
    public class298() {
        super(3, false);
    }

    @OriginalMember(owner = "client!cj", name = "a", descriptor = "(IB)[I")
    public final int[] method191(int arg0, byte arg1) {
        ++field3864;
        int var3 = -33 / ((27 - arg1) / 49);
        int[] var4 = super.field7456.method1635(arg0, -90);
        if (super.field7456.field3449) {
            int[] var5 = this.method3028((byte) 111, arg0, 1);
            int[] var6 = this.method3028((byte) 105, arg0, 2);
            for (int var7 = 0; var7 < class304.field3909; ++var7) {
                int var8 = (var5[var7] & 4087) >> 4;
                int var9 = var6[var7] * this.field3861 >> 12;
                int var10 = class132.field1574[var8] * var9 >> 12;
                int var11 = class550.field7739[var8] * var9 >> 12;
                int var12 = class404.field5700 & (var10 >> 12) + var7;
                int var13 = (var11 >> 12) + arg0 & class33.field516;
                int[] var14 = this.method3028((byte) 108, var13, 0);
                var4[var7] = var14[var12];
            }
        }
        return var4;
    }
}
