import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ir")
public class class184 extends class747 {

    @OriginalMember(owner = "client!ir", name = "F", descriptor = "I")
    private int field2522 = 32768;

    @OriginalMember(owner = "client!ir", name = "K", descriptor = "Lkr;")
    public static class602 field2526 = new class602(10, 1);

    @OriginalMember(owner = "client!ir", name = "L", descriptor = "[I")
    public static int[] field2527 = new int[] { 1, 2, 4, 8 };

    @OriginalMember(owner = "client!ir", name = "E", descriptor = "I")
    public static int field2521;

    @OriginalMember(owner = "client!ir", name = "H", descriptor = "I")
    public static int field2523;

    @OriginalMember(owner = "client!ir", name = "I", descriptor = "I")
    public static int field2524;

    @OriginalMember(owner = "client!ir", name = "J", descriptor = "I")
    public static int field2525;

    @OriginalMember(owner = "client!ir", name = "M", descriptor = "[Lvba;")
    public static class737[] field2528;

    @OriginalMember(owner = "client!ir", name = "a", descriptor = "(II)[I", line = 4)
    public final int[] method182(int arg0, int arg1) {
        ++field2525;
        if (arg1 > -89) {
            this.field2522 = -53;
        }
        int[] var3 = super.field10279.method3479(true, arg0);
        if (super.field10279.field8263) {
            int[] var4 = this.method4156(29, arg0, 1);
            int[] var5 = this.method4156(75, arg0, 2);
            for (int var6 = 0; var6 < class73.field1095; ++var6) {
                int var7 = (var4[var6] & 4086) >> 4;
                int var8 = var5[var6] * this.field2522 >> 12;
                int var9 = class639.field8569[var7] * var8 >> 12;
                int var10 = class472.field6541[var7] * var8 >> 12;
                int var11 = (var9 >> 12) + var6 & class73.field1097;
                int var12 = (var10 >> 12) + arg0 & class415.field5878;
                int[] var13 = this.method4156(76, var12, 0);
                var3[var6] = var13[var11];
            }
        }
        return var3;
    }

    @OriginalMember(owner = "client!ir", name = "a", descriptor = "(Ldc;II)V", line = 55)
    public final void method183(class63 arg0, int arg1, int arg2) {
        ++field2521;
        if (arg1 != 11608) {
            field2527 = null;
        }
        if (arg2 != 0) {
            if (arg2 == 1) {
                super.field10281 = arg0.method505((byte) -119) == 1;
            }
        } else {
            this.field2522 = arg0.method482(-772591672) << 4;
        }
    }

    @OriginalMember(owner = "client!ir", name = "c", descriptor = "(I)V", line = 90)
    public static void method1158(int arg0) {
        field2527 = null;
        field2526 = null;
        if (arg0 != 1) {
            method1158(61);
        }
        field2528 = null;
    }

    @OriginalMember(owner = "client!ir", name = "b", descriptor = "(I)V", line = 103)
    public final void method184(int arg0) {
        ++field2524;
        class654.method3655(arg0 ^ -65);
        if (arg0 != -2) {
            this.method182(84, 22);
        }
    }

    @OriginalMember(owner = "client!ir", name = "<init>", descriptor = "()V", line = 121)
    public class184() {
        super(3, false);
    }

    @OriginalMember(owner = "client!ir", name = "b", descriptor = "(II)[[I", line = 124)
    public final int[][] method688(int arg0, int arg1) {
        ++field2523;
        int[][] var3 = super.field10289.method2200(0, arg1);
        int var4 = 63 % ((35 - arg0) / 58);
        if (super.field10289.field4906) {
            int[] var5 = this.method4156(50, arg1, 1);
            int[] var6 = this.method4156(31, arg1, 2);
            int[] var7 = var3[0];
            int[] var8 = var3[1];
            int[] var9 = var3[2];
            for (int var10 = 0; class73.field1095 > var10; ++var10) {
                int var11 = (var5[var10] * 255 & 1045396) >> 12;
                int var12 = var6[var10] * this.field2522 >> 12;
                int var13 = class639.field8569[var11] * var12 >> 12;
                int var14 = class472.field6541[var11] * var12 >> 12;
                int var15 = (var13 >> 12) + var10 & class73.field1097;
                int var16 = class415.field5878 & (var14 >> 12) + arg1;
                int[][] var17 = this.method4158(0, var16, 2);
                var7[var10] = var17[0][var15];
                var8[var10] = var17[1][var15];
                var9[var10] = var17[2][var15];
            }
        }
        return var3;
    }
}
