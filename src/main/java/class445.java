import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!sk")
public class class445 extends class192 {

    @OriginalMember(owner = "client!sk", name = "L", descriptor = "Lnj;")
    public static class415 field5726 = new class415(31, 3);

    @OriginalMember(owner = "client!sk", name = "P", descriptor = "[[I")
    public static int[][] field5730 = new int[][] { { 0, 1, 2, 3 }, { 1, -1, -1, 0 }, { -1, 2, -1, 0 }, { -1, 0, -1, 2 }, { 0, 1, -1, 2 }, { 1, 2, -1, 0 }, { -1, 4, -1, 1 }, { -1, 3, 4, -1 }, { -1, 0, 2, -1 }, { -1, -1, 2, 0 }, { 0, 2, 5, 3 }, { 0, -1, 6, -1 }, { 0, 1, 2, 3 } };

    @OriginalMember(owner = "client!sk", name = "I", descriptor = "I")
    public static int field5723;

    @OriginalMember(owner = "client!sk", name = "J", descriptor = "I")
    public static int field5724;

    @OriginalMember(owner = "client!sk", name = "K", descriptor = "I")
    public static int field5725;

    @OriginalMember(owner = "client!sk", name = "M", descriptor = "I")
    public static int field5727;

    @OriginalMember(owner = "client!sk", name = "N", descriptor = "I")
    public static int field5728;

    @OriginalMember(owner = "client!sk", name = "O", descriptor = "I")
    public static int field5729;

    @OriginalMember(owner = "client!sk", name = "Q", descriptor = "Ldc;")
    public static class304 field5731;

    @OriginalMember(owner = "client!sk", name = "b", descriptor = "(III)I")
    private final int method2518(int arg0, int arg1, int arg2) {
        ++field5728;
        if (arg0 != 1306060609) {
            method2520((byte) -8);
        }
        int var4 = arg1 - -(arg2 * 57);
        int var5 = var4 ^ var4 << 1;
        return -((Integer.MAX_VALUE & (var5 * var5 * 15731 + 789221) * var5 + 1376312589) / 262144) + 4096;
    }

    @OriginalMember(owner = "client!sk", name = "c", descriptor = "(I)V")
    public static void method2519(int arg0) {
        field5730 = null;
        if (arg0 != 1) {
            field5726 = null;
        }
        field5726 = null;
        field5731 = null;
    }

    @OriginalMember(owner = "client!sk", name = "e", descriptor = "(B)V")
    public static final void method2520(byte arg0) {
        if (~class105.field1383 == -2 || class105.field1383 == 3 || class2.field10 != class105.field1383 && (~class105.field1383 == -1 || ~class2.field10 == -1)) {
            class480.field6406 = 0;
            class248.field3351 = 0;
            class505.field6640.method41(arg0 ^ 115);
        }
        if (arg0 != 77) {
            method2521(false, 99);
        }
        ++field5727;
        class2.field10 = class105.field1383;
    }

    @OriginalMember(owner = "client!sk", name = "b", descriptor = "(ZI)V")
    public static final void method2521(boolean arg0, int arg1) {
        ++field5729;
        if (arg0) {
            if (~class196.field2562 != 0) {
                class469.method2601(class196.field2562, (byte) -111);
            }
            for (class270 var2 = (class270) class700.field9763.method42((byte) 118); var2 != null; var2 = (class270) class700.field9763.method40(false)) {
                if (!var2.method2440(58)) {
                    var2 = (class270) class700.field9763.method42((byte) 120);
                    if (var2 == null) {
                        break;
                    }
                }
                class298.method1764(false, -76, true, var2);
            }
            class196.field2562 = -1;
            class700.field9763 = new class9(8);
            class503.method2717(0);
            class196.field2562 = class658.field9177;
            class380.method2169(true, false);
            class211.method1355(-21784);
            class709.method3890(class196.field2562);
        }
        class642.field8932 = false;
        class83.field1128 = "";
        class135.field1784 = "";
        class49.method441(8);
        client.field1223 = -1;
        class46.method423(class252.field3441, 0);
        int var3 = 109 % ((arg1 - -39) / 58);
        class233.field3130 = new class193();
        class233.field3130.field3030[0] = class611.field8258 / 2;
        class233.field3130.field506 = class611.field8258 * 512 / 2;
        class233.field3130.field503 = class656.field9155 * 512 / 2;
        class549.field7132 = 0;
        class499.field6555 = 0;
        class233.field3130.field3039[0] = class656.field9155 / 2;
        if (class704.field9810 != 2) {
            class192.method1260(3);
        } else {
            class549.field7132 = class67.field909 << 9;
            class499.field6555 = class435.field5643 << 9;
        }
        class693.method3772((byte) 47);
    }

    @OriginalMember(owner = "client!sk", name = "b", descriptor = "(IBI)I")
    public static final int method2522(int arg0, byte arg1, int arg2) {
        ++field5724;
        if (arg0 != 1 && ~arg0 != -4) {
            return arg1 != -63 ? -54 : class242.field3252[arg2 & 3];
        } else {
            return class295.field3846[arg2 & 3];
        }
    }

    @OriginalMember(owner = "client!sk", name = "a", descriptor = "(IB)[I")
    public final int[] method118(int arg0, byte arg1) {
        ++field5725;
        int[] var3 = super.field2448.method2978(arg0, (byte) -56);
        if (arg1 > -123) {
            method2520((byte) 122);
        }
        if (super.field2448.field7266) {
            int var4 = class221.field2895[arg0];
            for (int var5 = 0; ~var5 > ~class561.field7319; ++var5) {
                var3[var5] = this.method2518(1306060609, class183.field2359[var5], var4) % 4096;
            }
        }
        return var3;
    }

    @OriginalMember(owner = "client!sk", name = "<init>", descriptor = "()V")
    public class445() {
        super(0, true);
    }

    @OriginalMember(owner = "client!sk", name = "h", descriptor = "(I)V")
    public static final void method2523(int arg0) {
        ++field5723;
        class408.field5286.method360(((float) class260.field3509.field1301 * 0.1F + 0.7F) * class80.field1105);
        class408.field5286.method390(class460.field6033, class7.field67, class168.field2095, (float) (class542.field7047 << 2), (float) (class107.field1400 << 2), (float) (class503.field6624 << 2));
        if (arg0 < 5) {
            field5731 = null;
        }
        class408.field5286.method403(class17.field193);
    }
}
