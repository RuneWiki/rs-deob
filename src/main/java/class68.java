import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!hk")
public class class68 extends class17 {

    @OriginalMember(owner = "client!hk", name = "M", descriptor = "I")
    private int field865 = 32768;

    @OriginalMember(owner = "client!hk", name = "L", descriptor = "I")
    public static int field864 = 0;

    @OriginalMember(owner = "client!hk", name = "G", descriptor = "I")
    public static int field859;

    @OriginalMember(owner = "client!hk", name = "K", descriptor = "I")
    public static int field863;

    @OriginalMember(owner = "client!hk", name = "N", descriptor = "I")
    public static int field866;

    @OriginalMember(owner = "client!hk", name = "O", descriptor = "I")
    public static int field867;

    @OriginalMember(owner = "client!hk", name = "P", descriptor = "I")
    public static int field868;

    @OriginalMember(owner = "client!hk", name = "Q", descriptor = "I")
    public static int field869;

    @OriginalMember(owner = "client!hk", name = "H", descriptor = "Lvl;")
    public static class11 field860;

    @OriginalMember(owner = "client!hk", name = "J", descriptor = "Lo;")
    public static class24 field862;

    @OriginalMember(owner = "client!hk", name = "I", descriptor = "[I")
    public static int[] field861;

    @OriginalMember(owner = "client!hk", name = "F", descriptor = "[Lya;")
    public static class38[] field858;

    @OriginalMember(owner = "client!hk", name = "d", descriptor = "(III)I")
    public static final int method530(int arg0, int arg1, int arg2) {
        int var3 = 52 / ((arg2 - 87) / 32);
        ++field869;
        return arg1 != 1 && ~arg1 != -4 ? class236.field3441[arg0 & 3] : class165.field2426[3 & arg0];
    }

    @OriginalMember(owner = "client!hk", name = "h", descriptor = "(I)V")
    public static void method531(int arg0) {
        field858 = null;
        field860 = null;
        if (arg0 != 2) {
            field861 = null;
        }
        field862 = null;
        field861 = null;
    }

    @OriginalMember(owner = "client!hk", name = "g", descriptor = "(I)V")
    public final void method31(int arg0) {
        ++field866;
        if (arg0 != -9) {
            this.method31(70);
        }
        class341.method2034(true);
    }

    @OriginalMember(owner = "client!hk", name = "<init>", descriptor = "()V")
    public class68() {
        super(3, false);
    }

    @OriginalMember(owner = "client!hk", name = "e", descriptor = "(III)Z")
    public static final boolean method532(int arg0, int arg1, int arg2) {
        ++field859;
        if (arg2 >= -32) {
            field864 = -8;
        }
        return ((arg0 & 8192) != 0 | class82.method608(arg1, arg0, 118) | class343.method2048(18902, arg0, arg1)) & class487.method2807(arg1, arg0, -128);
    }

    @OriginalMember(owner = "client!hk", name = "a", descriptor = "(Lwm;II)V")
    public final void method34(class403 arg0, int arg1, int arg2) {
        if (arg2 != 5159) {
            this.method34((class403) null, 71, -111);
        }
        if (arg1 != 0) {
            if (~arg1 == -2) {
                super.field205 = ~arg0.method2357((byte) 108) == -2;
            }
        } else {
            this.field865 = arg0.method2338(0) << 4;
        }
        ++field867;
    }

    @OriginalMember(owner = "client!hk", name = "a", descriptor = "(IB)[[I")
    public final int[][] method89(int arg0, byte arg1) {
        ++field863;
        int[][] var3 = super.field201.method1851(arg0, (byte) -56);
        if (super.field201.field4431) {
            int[] var4 = this.method88(arg0, -4526, 1);
            int[] var5 = this.method88(arg0, -4526, 2);
            int[] var6 = var3[0];
            int[] var7 = var3[1];
            int[] var8 = var3[2];
            for (int var9 = 0; var9 < class530.field7763; ++var9) {
                int var10 = 255 & var4[var9] * 255 >> 12;
                int var11 = var5[var9] * this.field865 >> 12;
                int var12 = class475.field6607[var10] * var11 >> 12;
                int var13 = field861[var10] * var11 >> 12;
                int var14 = class43.field499 & (var12 >> 12) + var9;
                int var15 = class38.field417 & arg0 - -(var13 >> 12);
                int[][] var16 = this.method91(0, 0, var15);
                var6[var9] = var16[0][var14];
                var7[var9] = var16[1][var14];
                var8[var9] = var16[2][var14];
            }
        }
        if (arg1 != -25) {
            field864 = 126;
        }
        return var3;
    }

    @OriginalMember(owner = "client!hk", name = "a", descriptor = "(II)[I")
    public final int[] method27(int arg0, int arg1) {
        ++field868;
        if (arg1 < 53) {
            this.method27(-61, 109);
        }
        int[] var3 = super.field210.method2683(-17, arg0);
        if (super.field210.field6442) {
            int[] var4 = this.method88(arg0, -4526, 1);
            int[] var5 = this.method88(arg0, -4526, 2);
            for (int var6 = 0; ~class530.field7763 < ~var6; ++var6) {
                int var7 = var4[var6] >> 4 & 255;
                int var8 = var5[var6] * this.field865 >> 12;
                int var9 = class475.field6607[var7] * var8 >> 12;
                int var10 = field861[var7] * var8 >> 12;
                int var11 = var6 - -(var9 >> 12) & class43.field499;
                int var12 = (var10 >> 12) + arg0 & class38.field417;
                int[] var13 = this.method88(var12, -4526, 0);
                var3[var6] = var13[var11];
            }
        }
        return var3;
    }
}
