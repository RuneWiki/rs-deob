import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!pa")
public class class214 extends class8 {

    @OriginalMember(owner = "client!pa", name = "P", descriptor = "I")
    private int field3499 = 4096;

    @OriginalMember(owner = "client!pa", name = "T", descriptor = "[I")
    private int[] field3503 = new int[3];

    @OriginalMember(owner = "client!pa", name = "U", descriptor = "I")
    private int field3504 = 3216;

    @OriginalMember(owner = "client!pa", name = "Q", descriptor = "I")
    private int field3500 = 3216;

    @OriginalMember(owner = "client!pa", name = "N", descriptor = "[Ljava/lang/String;")
    public static String[] field3497 = new String[100];

    @OriginalMember(owner = "client!pa", name = "I", descriptor = "I")
    public static int field3492 = 3353893;

    @OriginalMember(owner = "client!pa", name = "S", descriptor = "Lkd;")
    public static class204 field3502 = new class204(32);

    @OriginalMember(owner = "client!pa", name = "W", descriptor = "[J")
    public static long[] field3506 = new long[500];

    @OriginalMember(owner = "client!pa", name = "J", descriptor = "I")
    public static int field3493;

    @OriginalMember(owner = "client!pa", name = "K", descriptor = "I")
    public static int field3494;

    @OriginalMember(owner = "client!pa", name = "L", descriptor = "I")
    public static int field3495;

    @OriginalMember(owner = "client!pa", name = "M", descriptor = "I")
    public static int field3496;

    @OriginalMember(owner = "client!pa", name = "O", descriptor = "I")
    public static int field3498;

    @OriginalMember(owner = "client!pa", name = "R", descriptor = "I")
    public static int field3501;

    @OriginalMember(owner = "client!pa", name = "V", descriptor = "I")
    public static int field3505;

    @OriginalMember(owner = "client!pa", name = "X", descriptor = "Lqh;")
    public static class201 field3507;

    @OriginalMember(owner = "client!pa", name = "c", descriptor = "(Z)V")
    public final void method66(boolean arg0) {
        if (arg0) {
            field3492 = -11;
        }
        this.method1468(true);
        ++field3493;
    }

    @OriginalMember(owner = "client!pa", name = "d", descriptor = "(Z)V")
    private final void method1468(boolean arg0) {
        ++field3498;
        if (arg0) {
            double var2 = Math.cos((double) ((float) this.field3500 / 4096.0F));
            this.field3503[0] = (int) (Math.sin((double) ((float) this.field3504 / 4096.0F)) * var2 * 4096.0D);
            this.field3503[1] = (int) (Math.cos((double) ((float) this.field3504 / 4096.0F)) * var2 * 4096.0D);
            this.field3503[2] = (int) (Math.sin((double) ((float) this.field3500 / 4096.0F)) * 4096.0D);
            int var4 = this.field3503[2] * this.field3503[2] >> 12;
            int var5 = this.field3503[1] * this.field3503[1] >> 12;
            int var6 = this.field3503[0] * this.field3503[0] >> 12;
            int var7 = (int) (Math.sqrt((double) (var5 + var6 + var4 >> 12)) * 4096.0D);
            if (var7 != 0) {
                this.field3503[1] = (this.field3503[1] << 12) / var7;
                this.field3503[2] = (this.field3503[2] << 12) / var7;
                this.field3503[0] = (this.field3503[0] << 12) / var7;
            }
        }
    }

    @OriginalMember(owner = "client!pa", name = "<init>", descriptor = "()V")
    public class214() {
        super(1, true);
    }

    @OriginalMember(owner = "client!pa", name = "e", descriptor = "(I)V")
    public static void method1469(int arg0) {
        field3507 = null;
        field3506 = null;
        field3497 = null;
        if (arg0 == -256) {
            field3502 = null;
        }
    }

    @OriginalMember(owner = "client!pa", name = "b", descriptor = "(II)[I")
    public final int[] method44(int arg0, int arg1) {
        ++field3495;
        int[] var3 = super.field110.method1585(0, arg1);
        if (super.field110.field3734) {
            int var4 = class152.field2460 * this.field3499 >> 12;
            int[] var5 = this.method61(arg1 - 1 & class92.field1523, 120, 0);
            int[] var6 = this.method61(arg1, -71, 0);
            int[] var7 = this.method61(arg1 + 1 & class92.field1523, 122, 0);
            for (int var8 = 0; ~class231.field3798 < ~var8; ++var8) {
                int var9 = (var7[var8] + -var5[var8]) * var4 >> 12;
                int var10 = (var6[class287.field4537 & var8 + -1] - var6[var8 + 1 & class287.field4537]) * var4 >> 12;
                int var11 = var10 >> 4;
                int var12 = var9 >> 4;
                if (~var11 > -1) {
                    var11 = -var11;
                }
                if (~var11 < -256) {
                    var11 = 255;
                }
                if (var12 < 0) {
                    var12 = -var12;
                }
                if (~var12 < -256) {
                    var12 = 255;
                }
                int var13 = class19.field332[((var12 + 1) * var12 >> 1) + var11] & 255;
                int var14 = var9 * var13 >> 8;
                int var15 = var10 * var13 >> 8;
                int var16 = var13 * 4096 >> 8;
                int var17 = this.field3503[1] * var14 >> 12;
                int var18 = this.field3503[0] * var15 >> 12;
                int var19 = this.field3503[2] * var16 >> 12;
                var3[var8] = var18 - (-var17 - var19);
            }
        }
        return arg0 != 3 ? null : var3;
    }

    @OriginalMember(owner = "client!pa", name = "a", descriptor = "(BLog;I)V")
    public final void method64(byte arg0, class221 arg1, int arg2) {
        if (arg0 <= 62) {
            field3506 = null;
        }
        if (arg2 != 0) {
            if (arg2 != 1) {
                if (~arg2 == -3) {
                    this.field3500 = arg1.method1521((byte) 113);
                }
            } else {
                this.field3504 = arg1.method1521((byte) 113);
            }
        } else {
            this.field3499 = arg1.method1521((byte) 113);
        }
        ++field3494;
    }
}
