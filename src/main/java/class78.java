import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!gh")
public class class78 extends class5 {

    @OriginalMember(owner = "client!gh", name = "J", descriptor = "I")
    private int field1070 = 32768;

    @OriginalMember(owner = "client!gh", name = "M", descriptor = "[I")
    public static int[] field1073 = new int[] { 4, 4, 1, 2, 6, 4, 2, 44, 2, 2, 2, 2, 2, 2, 2, 2, 2, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 0, 0, 0 };

    @OriginalMember(owner = "client!gh", name = "H", descriptor = "Lwea;")
    public static class259 field1069 = new class259(8, 1);

    @OriginalMember(owner = "client!gh", name = "Q", descriptor = "[I")
    public static int[] field1077 = new int[4096];

    @OriginalMember(owner = "client!gh", name = "P", descriptor = "Lil;")
    public static class68 field1076 = new class68(16);

    @OriginalMember(owner = "client!gh", name = "K", descriptor = "I")
    public static int field1071;

    @OriginalMember(owner = "client!gh", name = "L", descriptor = "I")
    public static int field1072;

    @OriginalMember(owner = "client!gh", name = "N", descriptor = "I")
    public static int field1074;

    @OriginalMember(owner = "client!gh", name = "O", descriptor = "I")
    public static int field1075;

    @OriginalMember(owner = "client!gh", name = "R", descriptor = "Lpt;")
    public static class411 field1078;

    @OriginalMember(owner = "client!gh", name = "b", descriptor = "(I)V")
    public final void method46(int arg0) {
        class205.method1241(0);
        ++field1074;
        int var2 = 83 % ((64 - arg0) / 60);
    }

    @OriginalMember(owner = "client!gh", name = "a", descriptor = "(II)[I")
    public final int[] method39(int arg0, int arg1) {
        ++field1071;
        int[] var3 = super.field126.method3280(arg1, true);
        int var4 = -40 % ((arg0 - 81) / 36);
        if (super.field126.field8392) {
            int[] var5 = this.method49(arg1, false, 1);
            int[] var6 = this.method49(arg1, false, 2);
            for (int var7 = 0; var7 < class657.field9287; ++var7) {
                int var8 = (4085 & var5[var7]) >> 4;
                int var9 = var6[var7] * this.field1070 >> 12;
                int var10 = class100.field1358[var8] * var9 >> 12;
                int var11 = class267.field3384[var8] * var9 >> 12;
                int var12 = class194.field2440 & var7 - -(var10 >> 12);
                int var13 = arg1 - -(var11 >> 12) & class669.field9431;
                int[] var14 = this.method49(var13, false, 0);
                var3[var7] = var14[var12];
            }
        }
        return var3;
    }

    @OriginalMember(owner = "client!gh", name = "<init>", descriptor = "()V")
    public class78() {
        super(3, false);
    }

    @OriginalMember(owner = "client!gh", name = "i", descriptor = "(I)V")
    public static void method464(int arg0) {
        field1076 = null;
        field1078 = null;
        field1073 = null;
        field1077 = null;
        if (arg0 != 1393315076) {
            method464(-95);
        }
        field1069 = null;
    }

    @OriginalMember(owner = "client!gh", name = "a", descriptor = "(IZ)[[I")
    public final int[][] method44(int arg0, boolean arg1) {
        ++field1072;
        int[][] var3 = super.field135.method2706(arg0, -53);
        if (!arg1) {
            return null;
        } else {
            if (super.field135.field6667) {
                int[] var4 = this.method49(arg0, false, 1);
                int[] var5 = this.method49(arg0, false, 2);
                int[] var6 = var3[0];
                int[] var7 = var3[1];
                int[] var8 = var3[2];
                for (int var9 = 0; ~var9 > ~class657.field9287; ++var9) {
                    int var10 = (var4[var9] * 255 & 1045110) >> 12;
                    int var11 = var5[var9] * this.field1070 >> 12;
                    int var12 = class100.field1358[var10] * var11 >> 12;
                    int var13 = class267.field3384[var10] * var11 >> 12;
                    int var14 = (var12 >> 12) + var9 & class194.field2440;
                    int var15 = (var13 >> 12) + arg0 & class669.field9431;
                    int[][] var16 = this.method45(0, var15, 0);
                    var6[var9] = var16[0][var14];
                    var7[var9] = var16[1][var14];
                    var8[var9] = var16[2][var14];
                }
            }
            return var3;
        }
    }

    @OriginalMember(owner = "client!gh", name = "a", descriptor = "(ILes;I)V")
    public final void method47(int arg0, class630 arg1, int arg2) {
        ++field1075;
        if (arg2 != 0) {
            if (arg2 == 1) {
                super.field120 = arg1.method3501(arg0 + -9269) == 1;
            }
        } else {
            this.field1070 = arg1.method3470(13111) << 4;
        }
        if (arg0 != 1) {
            this.method46(22);
        }
    }
}
