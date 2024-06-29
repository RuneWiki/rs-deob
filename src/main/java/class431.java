import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!st")
public class class431 extends class667 {

    @OriginalMember(owner = "client!st", name = "I", descriptor = "I")
    private int field6030 = 32768;

    @OriginalMember(owner = "client!st", name = "C", descriptor = "I")
    public static int field6024;

    @OriginalMember(owner = "client!st", name = "D", descriptor = "I")
    public static int field6025;

    @OriginalMember(owner = "client!st", name = "E", descriptor = "I")
    public static int field6026;

    @OriginalMember(owner = "client!st", name = "F", descriptor = "I")
    public static int field6027;

    @OriginalMember(owner = "client!st", name = "G", descriptor = "I")
    public static int field6028;

    @OriginalMember(owner = "client!st", name = "H", descriptor = "I")
    public static int field6029;

    @OriginalMember(owner = "client!st", name = "J", descriptor = "I")
    public static int field6031;

    @OriginalMember(owner = "client!st", name = "K", descriptor = "I")
    public static int field6032;

    @OriginalMember(owner = "client!st", name = "a", descriptor = "(IIBI)V", line = 7)
    public static final void method2615(int arg0, int arg1, byte arg2, int arg3) {
        int var4 = arg0 * class471.field6781.field6669.method3134(27669) >> 8;
        ++field6027;
        if (arg2 >= -21) {
            method2617(60, false);
        }
        if (arg1 == -1 && !class90.field1607) {
            class186.method1322(123);
        } else if (arg1 != -1 && (class122.field1893 != arg1 || !class225.method1556(-84)) && ~var4 != -1 && !class90.field1607) {
            class337.method2146(false, class351.field4955, 0, arg1, arg3, var4, 0);
            class226.method1558(-16032);
        }
        if (~class122.field1893 != ~arg1) {
            class523.field7409 = null;
        }
        class122.field1893 = arg1;
    }

    @OriginalMember(owner = "client!st", name = "a", descriptor = "(ZI)[[I", line = 36)
    public final int[][] method777(boolean arg0, int arg1) {
        ++field6026;
        if (arg0) {
            this.field6030 = 99;
        }
        int[][] var3 = super.field9357.method2314((byte) 41, arg1);
        if (super.field9357.field5178) {
            int[] var4 = this.method3744(arg1, (byte) 4, 1);
            int[] var5 = this.method3744(arg1, (byte) 24, 2);
            int[] var6 = var3[0];
            int[] var7 = var3[1];
            int[] var8 = var3[2];
            for (int var9 = 0; class77.field1455 > var9; ++var9) {
                int var10 = (1046040 & var4[var9] * 255) >> 12;
                int var11 = var5[var9] * this.field6030 >> 12;
                int var12 = class265.field3861[var10] * var11 >> 12;
                int var13 = class491.field7002[var10] * var11 >> 12;
                int var14 = class439.field6131 & (var12 >> 12) + var9;
                int var15 = (var13 >> 12) + arg1 & class77.field1453;
                int[][] var16 = this.method3748(var15, 0, 0);
                var6[var9] = var16[0][var14];
                var7[var9] = var16[1][var14];
                var8[var9] = var16[2][var14];
            }
        }
        return var3;
    }

    @OriginalMember(owner = "client!st", name = "a", descriptor = "(BI)[I", line = 93)
    public final int[] method117(byte arg0, int arg1) {
        ++field6024;
        int[] var3 = super.field9355.method1744(arg1, -2);
        if (arg0 >= -87) {
            field6032 = 100;
        }
        if (super.field9355.field3728) {
            int[] var4 = this.method3744(arg1, (byte) 14, 1);
            int[] var5 = this.method3744(arg1, (byte) 24, 2);
            for (int var6 = 0; ~var6 > ~class77.field1455; ++var6) {
                int var7 = var4[var6] >> 4 & 255;
                int var8 = var5[var6] * this.field6030 >> 12;
                int var9 = class265.field3861[var7] * var8 >> 12;
                int var10 = class491.field7002[var7] * var8 >> 12;
                int var11 = (var9 >> 12) + var6 & class439.field6131;
                int var12 = arg1 - -(var10 >> 12) & class77.field1453;
                int[] var13 = this.method3744(var12, (byte) 120, 0);
                var3[var6] = var13[var11];
            }
        }
        return var3;
    }

    @OriginalMember(owner = "client!st", name = "<init>", descriptor = "()V", line = 142)
    public class431() {
        super(3, false);
    }

    @OriginalMember(owner = "client!st", name = "a", descriptor = "(IIZ)Z", line = 145)
    public static final boolean method2616(int arg0, int arg1, boolean arg2) {
        ++field6029;
        if (!arg2) {
            field6032 = -56;
        }
        return class115.method946(arg1, arg0, 38) || class554.method3244(-1, arg0, arg1);
    }

    @OriginalMember(owner = "client!st", name = "a", descriptor = "(Lud;II)V", line = 157)
    public final void method116(class35 arg0, int arg1, int arg2) {
        if (arg1 != 3) {
            this.field6030 = -38;
        }
        if (~arg2 != -1) {
            if (~arg2 == -2) {
                super.field9344 = arg0.method273(arg1 + 252) == 1;
            }
        } else {
            this.field6030 = arg0.method253(arg1 + -13903) << 4;
        }
        ++field6025;
    }

    @OriginalMember(owner = "client!st", name = "a", descriptor = "(IZ)Ljava/lang/String;", line = 201)
    public static final String method2617(int arg0, boolean arg1) {
        ++field6031;
        return !arg1 ? null : (255 & arg0 >> 24) + "." + ((16771381 & arg0) >> 16) + "." + ((65396 & arg0) >> 8) + "." + (arg0 & 255);
    }

    @OriginalMember(owner = "client!st", name = "b", descriptor = "(Z)V", line = 216)
    public final void method121(boolean arg0) {
        if (arg0) {
            method2617(-106, false);
        }
        class458.method2798(!arg0);
        ++field6028;
    }
}
