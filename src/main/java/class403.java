import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!qe")
public class class403 {

    @OriginalMember(owner = "client!qe", name = "h", descriptor = "Z")
    public boolean field6096 = true;

    @OriginalMember(owner = "client!qe", name = "k", descriptor = "[S")
    public static short[] field6099 = new short[] { 49, 8, 3, 25, 48, 16, 60, 17 };

    @OriginalMember(owner = "client!qe", name = "b", descriptor = "I")
    public static int field6090 = 0;

    @OriginalMember(owner = "client!qe", name = "g", descriptor = "C")
    private char field6095;

    @OriginalMember(owner = "client!qe", name = "a", descriptor = "I")
    public int field6089;

    @OriginalMember(owner = "client!qe", name = "d", descriptor = "I")
    public static int field6092;

    @OriginalMember(owner = "client!qe", name = "e", descriptor = "I")
    public static int field6093;

    @OriginalMember(owner = "client!qe", name = "i", descriptor = "I")
    public static int field6097;

    @OriginalMember(owner = "client!qe", name = "j", descriptor = "I")
    public static int field6098;

    @OriginalMember(owner = "client!qe", name = "m", descriptor = "I")
    public static int field6101;

    @OriginalMember(owner = "client!qe", name = "n", descriptor = "I")
    public static int field6102;

    @OriginalMember(owner = "client!qe", name = "o", descriptor = "I")
    public static int field6103;

    @OriginalMember(owner = "client!qe", name = "f", descriptor = "Loa;")
    public static class605 field6094;

    @OriginalMember(owner = "client!qe", name = "c", descriptor = "Ljava/lang/String;")
    public String field6091;

    @OriginalMember(owner = "client!qe", name = "l", descriptor = "[I")
    public static int[] field6100;

    @OriginalMember(owner = "client!qe", name = "a", descriptor = "(I)V")
    public static void method2563(int arg0) {
        field6099 = null;
        field6094 = null;
        field6100 = null;
        int var1 = 10 % ((arg0 + 70) / 46);
    }

    @OriginalMember(owner = "client!qe", name = "a", descriptor = "(IIII[FIIIFI)V")
    public static final void method2564(int arg0, int arg1, int arg2, int arg3, float[] arg4, int arg5, int arg6, int arg7, float arg8, int arg9) {
        field6092++;
        int var10 = arg0 - arg1;
        int var11 = arg2 - arg7;
        int var12 = arg3 - arg9;
        float var13 = arg4[2] * (float) var12 + arg4[0] * (float) var11 + arg4[1] * (float) var10;
        float var14 = arg4[arg5] * (float) var12 + arg4[4] * (float) var10 + arg4[3] * (float) var11;
        float var15 = arg4[8] * (float) var12 + arg4[7] * (float) var10 + arg4[6] * (float) var11;
        float var16 = (float) Math.sqrt((double) (var15 * var15 + var13 * var13 + var14 * var14));
        float var17 = (float) Math.atan2((double) var13, (double) var15) / 6.2831855F + 0.5F;
        float var18 = (float) Math.asin((double) (var14 / var16)) / 3.1415927F + arg8 + 0.5F;
        if (arg6 == 1) {
            float var20 = var17;
            var17 = -var18;
            var18 = var20;
        } else if (arg6 == 2) {
            var18 = -var18;
            var17 = -var17;
        } else if (arg6 == 3) {
            float var19 = var17;
            var17 = var18;
            var18 = -var19;
        }
        class647.field9369 = var18;
        class233.field3252 = var17;
    }

    @OriginalMember(owner = "client!qe", name = "a", descriptor = "(Lrt;I)V")
    public final void method2565(class194 arg0, int arg1) {
        if (arg1 < 51) {
            this.field6096 = false;
        }
        while (true) {
            int var3 = arg0.method1177(255);
            if (var3 == 0) {
                field6093++;
                return;
            }
            this.method2567(arg0, var3, (byte) -87);
        }
    }

    @OriginalMember(owner = "client!qe", name = "a", descriptor = "(Llk;B)I")
    public static final int method2566(class510 arg0, byte arg1) {
        field6097++;
        if (class406.field6124 == arg0) {
            return 9216;
        } else if (class555.field7885 == arg0) {
            return 34065;
        } else if (class641.field9242 == arg0) {
            return 34066;
        } else if (arg1 <= 109) {
            return 32;
        } else {
            throw new IllegalArgumentException();
        }
    }

    @OriginalMember(owner = "client!qe", name = "a", descriptor = "(Lrt;IB)V")
    private final void method2567(class194 arg0, int arg1, byte arg2) {
        if (arg1 == 1) {
            this.field6095 = class247.method1635(16, arg0.method1213((byte) 92));
        } else if (arg1 == 2) {
            this.field6089 = arg0.method1178(-230315992);
        } else if (arg1 == 4) {
            this.field6096 = false;
        } else if (arg1 == 5) {
            this.field6091 = arg0.method1218(false);
        }
        if (arg2 < -2) {
            field6098++;
        }
    }

    @OriginalMember(owner = "client!qe", name = "a", descriptor = "(III)I")
    public static final int method2568(int arg0, int arg1, int arg2) {
        field6102++;
        if (arg2 == 1 || arg2 == 3) {
            return class39.field426[arg1 & 0x3];
        } else if (arg0 < 35) {
            return 0;
        } else {
            return class289.field4002[arg1 & 0x3];
        }
    }

    @OriginalMember(owner = "client!qe", name = "a", descriptor = "(B)Z")
    public final boolean method2569(byte arg0) {
        field6103++;
        if (arg0 != -95) {
            method2563(117);
        }
        return this.field6095 == 's';
    }
}
