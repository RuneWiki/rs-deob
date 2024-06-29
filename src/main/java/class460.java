import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!rd")
public class class460 extends class192 {

    @OriginalMember(owner = "client!rd", name = "P", descriptor = "I")
    private int field6040 = 32768;

    @OriginalMember(owner = "client!rd", name = "K", descriptor = "[I")
    public static int[] field6035 = new int[] { 0, 4, 3, 3, 1, 1, 3, 5, 1, 5, 3, 6, 4 };

    @OriginalMember(owner = "client!rd", name = "J", descriptor = "[J")
    public static long[] field6034 = new long[100];

    @OriginalMember(owner = "client!rd", name = "Q", descriptor = "I")
    public static int field6041 = -1;

    @OriginalMember(owner = "client!rd", name = "I", descriptor = "I")
    public static int field6033;

    @OriginalMember(owner = "client!rd", name = "L", descriptor = "I")
    public static int field6036;

    @OriginalMember(owner = "client!rd", name = "M", descriptor = "I")
    public static int field6037;

    @OriginalMember(owner = "client!rd", name = "N", descriptor = "I")
    public static int field6038;

    @OriginalMember(owner = "client!rd", name = "O", descriptor = "I")
    public static int field6039;

    @OriginalMember(owner = "client!rd", name = "c", descriptor = "(B)V")
    public final void method618(byte arg0) {
        if (arg0 == 63) {
            class265.method1641((byte) -51);
            ++field6037;
        }
    }

    @OriginalMember(owner = "client!rd", name = "b", descriptor = "(Z)V")
    public static void method2585(boolean arg0) {
        field6035 = null;
        field6034 = null;
        if (arg0) {
            field6041 = -74;
        }
    }

    @OriginalMember(owner = "client!rd", name = "a", descriptor = "(IB)[I")
    public final int[] method118(int arg0, byte arg1) {
        ++field6038;
        int[] var3 = super.field2448.method2978(arg0, (byte) -56);
        if (arg1 > -123) {
            field6033 = -38;
        }
        if (super.field2448.field7266) {
            int[] var4 = this.method1253(0, arg0, 1);
            int[] var5 = this.method1253(0, arg0, 2);
            for (int var6 = 0; var6 < class561.field7319; ++var6) {
                int var7 = var4[var6] >> 4 & 255;
                int var8 = var5[var6] * this.field6040 >> 12;
                int var9 = class337.field4354[var7] * var8 >> 12;
                int var10 = class5.field34[var7] * var8 >> 12;
                int var11 = class337.field4356 & (var9 >> 12) + var6;
                int var12 = class95.field1247 & arg0 - -(var10 >> 12);
                int[] var13 = this.method1253(0, var12, 0);
                var3[var6] = var13[var11];
            }
        }
        return var3;
    }

    @OriginalMember(owner = "client!rd", name = "b", descriptor = "(IB)[[I")
    public final int[][] method107(int arg0, byte arg1) {
        ++field6036;
        int var3 = 51 / ((-14 - arg1) / 34);
        int[][] var4 = super.field2467.method2466(arg0, 0);
        if (super.field2467.field5565) {
            int[] var5 = this.method1253(0, arg0, 1);
            int[] var6 = this.method1253(0, arg0, 2);
            int[] var7 = var4[0];
            int[] var8 = var4[1];
            int[] var9 = var4[2];
            for (int var10 = 0; var10 < class561.field7319; ++var10) {
                int var11 = var5[var10] * 255 >> 12 & 255;
                int var12 = var6[var10] * this.field6040 >> 12;
                int var13 = class337.field4354[var11] * var12 >> 12;
                int var14 = class5.field34[var11] * var12 >> 12;
                int var15 = (var13 >> 12) + var10 & class337.field4356;
                int var16 = class95.field1247 & (var14 >> 12) + arg0;
                int[][] var17 = this.method1251(0, var16, (byte) 77);
                var7[var10] = var17[0][var15];
                var8[var10] = var17[1][var15];
                var9[var10] = var17[2][var15];
            }
        }
        return var4;
    }

    @OriginalMember(owner = "client!rd", name = "<init>", descriptor = "()V")
    public class460() {
        super(3, false);
    }

    @OriginalMember(owner = "client!rd", name = "a", descriptor = "(ILfd;I)V")
    public final void method109(int arg0, class418 arg1, int arg2) {
        ++field6039;
        if (arg2 != -12160) {
            this.method618((byte) 10);
        }
        if (arg0 != 0) {
            if (~arg0 == -2) {
                super.field2449 = arg1.method2396(-27) == 1;
            }
        } else {
            this.field6040 = arg1.method2393(-30727) << 4;
        }
    }
}
