import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ni")
public class class88 extends class202 {

    @OriginalMember(owner = "client!ni", name = "P", descriptor = "I")
    private int field1271 = 4096;

    @OriginalMember(owner = "client!ni", name = "N", descriptor = "[I")
    private int[] field1269 = new int[3];

    @OriginalMember(owner = "client!ni", name = "I", descriptor = "I")
    private int field1265 = 3216;

    @OriginalMember(owner = "client!ni", name = "Q", descriptor = "I")
    private int field1272 = 3216;

    @OriginalMember(owner = "client!ni", name = "O", descriptor = "Lqu;")
    public static class219 field1270 = new class219(29, 3);

    @OriginalMember(owner = "client!ni", name = "V", descriptor = "[J")
    public static long[] field1277 = new long[32];

    @OriginalMember(owner = "client!ni", name = "W", descriptor = "I")
    public static int field1278 = 0;

    @OriginalMember(owner = "client!ni", name = "J", descriptor = "I")
    public static int field1266;

    @OriginalMember(owner = "client!ni", name = "L", descriptor = "I")
    public static int field1267;

    @OriginalMember(owner = "client!ni", name = "M", descriptor = "I")
    public static int field1268;

    @OriginalMember(owner = "client!ni", name = "R", descriptor = "I")
    public static int field1273;

    @OriginalMember(owner = "client!ni", name = "S", descriptor = "I")
    public static int field1274;

    @OriginalMember(owner = "client!ni", name = "T", descriptor = "I")
    public static int field1275;

    @OriginalMember(owner = "client!ni", name = "U", descriptor = "I")
    public static int field1276;

    @OriginalMember(owner = "client!ni", name = "<init>", descriptor = "()V")
    public class88() {
        super(1, true);
    }

    @OriginalMember(owner = "client!ni", name = "a", descriptor = "(BII)B")
    public static final byte method604(byte arg0, int arg1, int arg2) {
        int var3 = -80 / ((-41 - arg0) / 47);
        ++field1267;
        if (~arg1 != -10) {
            return 0;
        } else {
            return (byte) ((1 & arg2) == 0 ? 1 : 2);
        }
    }

    @OriginalMember(owner = "client!ni", name = "a", descriptor = "(I)V")
    public final void method51(int arg0) {
        ++field1274;
        this.method606(true);
        int var2 = -79 % ((80 - arg0) / 46);
    }

    @OriginalMember(owner = "client!ni", name = "b", descriptor = "(B)V")
    public static void method605(byte arg0) {
        int var1 = -39 / ((25 - arg0) / 63);
        field1277 = null;
        field1270 = null;
    }

    @OriginalMember(owner = "client!ni", name = "d", descriptor = "(Z)V")
    private final void method606(boolean arg0) {
        ++field1266;
        double var2 = Math.cos((double) ((float) this.field1272 / 4096.0F));
        if (!arg0) {
            field1270 = null;
        }
        this.field1269[0] = (int) (var2 * Math.sin((double) ((float) this.field1265 / 4096.0F)) * 4096.0D);
        this.field1269[1] = (int) (Math.cos((double) ((float) this.field1265 / 4096.0F)) * var2 * 4096.0D);
        this.field1269[2] = (int) (Math.sin((double) ((float) this.field1272 / 4096.0F)) * 4096.0D);
        int var4 = this.field1269[0] * this.field1269[0] >> 12;
        int var5 = this.field1269[1] * this.field1269[1] >> 12;
        int var6 = this.field1269[2] * this.field1269[2] >> 12;
        int var7 = (int) (Math.sqrt((double) (var4 + var5 + var6 >> 12)) * 4096.0D);
        if (~var7 != -1) {
            this.field1269[2] = (this.field1269[2] << 12) / var7;
            this.field1269[0] = (this.field1269[0] << 12) / var7;
            this.field1269[1] = (this.field1269[1] << 12) / var7;
        }
    }

    @OriginalMember(owner = "client!ni", name = "a", descriptor = "(Lhw;BI)V")
    public final void method40(class208 arg0, byte arg1, int arg2) {
        int var4 = -17 % ((-46 - arg1) / 50);
        if (arg2 != 0) {
            if (~arg2 != -2) {
                if (arg2 == 2) {
                    this.field1272 = arg0.method1455(-3387);
                }
            } else {
                this.field1265 = arg0.method1455(-3387);
            }
        } else {
            this.field1271 = arg0.method1455(-3387);
        }
        ++field1273;
    }

    @OriginalMember(owner = "client!ni", name = "a", descriptor = "(IFILbl;[BBIFIFIFF)V")
    public static final void method607(int arg0, float arg1, int arg2, class268 arg3, byte[] arg4, byte arg5, int arg6, float arg7, int arg8, float arg9, int arg10, float arg11, float arg12) {
        int var13 = 45 % ((28 - arg5) / 53);
        for (int var14 = 0; ~arg0 < ~var14; ++var14) {
            class262.method1794(arg7, arg11, arg3, arg1, arg9, arg0, arg10, arg8, var14, arg6, arg12, arg4, arg2, false);
            arg10 += arg2 * arg8;
        }
        ++field1275;
    }

    @OriginalMember(owner = "client!ni", name = "a", descriptor = "(IZ)[I")
    public final int[] method41(int arg0, boolean arg1) {
        ++field1268;
        int[] var3 = super.field3064.method2452((byte) 67, arg0);
        if (super.field3064.field5837) {
            int var4 = class249.field4047 * this.field1271 >> 12;
            int[] var5 = this.method1376(1046794076, 0, arg0 + -1 & class335.field5237);
            int[] var6 = this.method1376(1046794076, 0, arg0);
            int[] var7 = this.method1376(1046794076, 0, arg0 - -1 & class335.field5237);
            for (int var8 = 0; ~var8 > ~class276.field4375; ++var8) {
                int var9 = (var7[var8] + -var5[var8]) * var4 >> 12;
                int var10 = (var6[var8 + -1 & class538.field7882] + -var6[class538.field7882 & var8 + 1]) * var4 >> 12;
                int var11 = var10 >> 4;
                if (~var11 > -1) {
                    var11 = -var11;
                }
                int var12 = var9 >> 4;
                if (var11 > 255) {
                    var11 = 255;
                }
                if (~var12 > -1) {
                    var12 = -var12;
                }
                if (var12 > 255) {
                    var12 = 255;
                }
                int var13 = 255 & class36.field366[((var12 + 1) * var12 >> 1) + var11];
                int var14 = var9 * var13 >> 8;
                int var15 = var13 * 4096 >> 8;
                int var16 = var10 * var13 >> 8;
                int var17 = this.field1269[0] * var16 >> 12;
                int var18 = this.field1269[1] * var14 >> 12;
                int var19 = this.field1269[2] * var15 >> 12;
                var3[var8] = var17 + var19 + var18;
            }
        }
        if (!arg1) {
            this.method606(true);
        }
        return var3;
    }

    @OriginalMember(owner = "client!ni", name = "g", descriptor = "(I)V")
    public static final void method608(int arg0) {
        if (!class19.field198.method1313()) {
            class196.method1341(class452.field7013, 6670);
        } else {
            class19.field198.method1308(class320.field4980);
            class269.method1824(-76);
            class19.field198.method1282(class320.field4980);
            class19.field198.method1230(class320.field4980);
        }
        if (arg0 <= 33) {
            method604((byte) 39, -22, 89);
        }
        ++field1276;
        class236.method1667(2318);
    }
}
