import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ir")
public class class25 extends class615 {

    @OriginalMember(owner = "client!ir", name = "L", descriptor = "I")
    private int field428 = 32768;

    @OriginalMember(owner = "client!ir", name = "J", descriptor = "[Ljava/lang/String;")
    public static String[] field426 = new String[100];

    @OriginalMember(owner = "client!ir", name = "K", descriptor = "I")
    public static int field427 = -1;

    @OriginalMember(owner = "client!ir", name = "G", descriptor = "I")
    public static int field423;

    @OriginalMember(owner = "client!ir", name = "H", descriptor = "I")
    public static int field424;

    @OriginalMember(owner = "client!ir", name = "I", descriptor = "I")
    public static int field425;

    @OriginalMember(owner = "client!ir", name = "M", descriptor = "I")
    public static int field429;

    @OriginalMember(owner = "client!ir", name = "f", descriptor = "(I)V", line = 6)
    public static void method222(int arg0) {
        field426 = null;
        if (arg0 >= -121) {
            field426 = null;
        }
    }

    @OriginalMember(owner = "client!ir", name = "a", descriptor = "(II)[[I", line = 19)
    public final int[][] method223(int arg0, int arg1) {
        ++field424;
        int[][] var3 = super.field8129.method2654(false, arg1);
        if (arg0 != 2) {
            this.method8(-124, (byte) 87);
        }
        if (super.field8129.field6315) {
            int[] var4 = this.method3366(1, 997, arg1);
            int[] var5 = this.method3366(2, arg0 + 995, arg1);
            int[] var6 = var3[0];
            int[] var7 = var3[1];
            int[] var8 = var3[2];
            for (int var9 = 0; ~var9 > ~class505.field6740; ++var9) {
                int var10 = 255 & var4[var9] * 255 >> 12;
                int var11 = var5[var9] * this.field428 >> 12;
                int var12 = class166.field2582[var10] * var11 >> 12;
                int var13 = class418.field5721[var10] * var11 >> 12;
                int var14 = var9 - -(var12 >> 12) & class313.field4306;
                int var15 = (var13 >> 12) + arg1 & class658.field9107;
                int[][] var16 = this.method3368(true, 0, var15);
                var6[var9] = var16[0][var14];
                var7[var9] = var16[1][var14];
                var8[var9] = var16[2][var14];
            }
        }
        return var3;
    }

    @OriginalMember(owner = "client!ir", name = "a", descriptor = "(IB)[I", line = 76)
    public final int[] method8(int arg0, byte arg1) {
        ++field423;
        int[] var3 = super.field8125.method298(arg0, 28);
        if (super.field8125.field579) {
            int[] var4 = this.method3366(1, 997, arg0);
            int[] var5 = this.method3366(2, 997, arg0);
            for (int var6 = 0; var6 < class505.field6740; ++var6) {
                int var7 = 255 & var4[var6] >> 4;
                int var8 = var5[var6] * this.field428 >> 12;
                int var9 = class166.field2582[var7] * var8 >> 12;
                int var10 = class418.field5721[var7] * var8 >> 12;
                int var11 = (var9 >> 12) + var6 & class313.field4306;
                int var12 = (var10 >> 12) + arg0 & class658.field9107;
                int[] var13 = this.method3366(0, 997, var12);
                var3[var6] = var13[var11];
            }
        }
        if (arg1 != -18) {
            field426 = null;
        }
        return var3;
    }

    @OriginalMember(owner = "client!ir", name = "a", descriptor = "(BILeh;)V", line = 129)
    public final void method15(byte arg0, int arg1, class335 arg2) {
        if (~arg1 != -1) {
            if (~arg1 == -2) {
                super.field8118 = ~arg2.method2034(255) == -2;
            }
        } else {
            this.field428 = arg2.method2001((byte) -83) << 4;
        }
        ++field425;
        if (arg0 < 44) {
            this.method10(-22);
        }
    }

    @OriginalMember(owner = "client!ir", name = "<init>", descriptor = "()V", line = 166)
    public class25() {
        super(3, false);
    }

    @OriginalMember(owner = "client!ir", name = "c", descriptor = "(I)V", line = 177)
    public final void method10(int arg0) {
        if (arg0 != 12404) {
            field426 = null;
        }
        ++field429;
        class201.method1312((byte) 100);
    }
}
