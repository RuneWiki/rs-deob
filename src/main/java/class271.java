import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!vi")
public class class271 extends class646 {

    @OriginalMember(owner = "client!vi", name = "K", descriptor = "I")
    private int field3891 = 4096;

    @OriginalMember(owner = "client!vi", name = "I", descriptor = "I")
    public static int field3889;

    @OriginalMember(owner = "client!vi", name = "J", descriptor = "I")
    public static int field3890;

    @OriginalMember(owner = "client!vi", name = "L", descriptor = "I")
    public static int field3892;

    @OriginalMember(owner = "client!vi", name = "M", descriptor = "I")
    public static int field3893;

    @OriginalMember(owner = "client!vi", name = "N", descriptor = "I")
    public static int field3894;

    @OriginalMember(owner = "client!vi", name = "<init>", descriptor = "()V", line = 3)
    public class271() {
        super(1, true);
    }

    @OriginalMember(owner = "client!vi", name = "b", descriptor = "(IB)[I", line = 9)
    public final int[] method424(int arg0, byte arg1) {
        ++field3892;
        int[] var3 = super.field9156.method2193(1269, arg0);
        if (super.field9156.field5075) {
            int[] var4 = this.method3628(false, 0, arg0 + -1 & class453.field6525);
            int[] var5 = this.method3628(false, 0, arg0);
            int[] var6 = this.method3628(false, 0, class453.field6525 & arg0 + 1);
            for (int var7 = 0; var7 < class89.field1330; ++var7) {
                int var8 = (var6[var7] + -var4[var7]) * this.field3891;
                int var9 = (var5[class156.field2572 & var7 + 1] + -var5[class156.field2572 & var7 - 1]) * this.field3891;
                int var10 = var9 >> 12;
                int var11 = var8 >> 12;
                int var12 = var10 * var10 >> 12;
                int var13 = var11 * var11 >> 12;
                int var14 = (int) (4096.0D * Math.sqrt((double) ((float) (var12 + var13 + 4096) / 4096.0F)));
                int var15 = ~var14 != -1 ? 16777216 / var14 : 0;
                var3[var7] = -var15 + 4096;
            }
        }
        if (arg1 != -120) {
            field3890 = -90;
        }
        return var3;
    }

    @OriginalMember(owner = "client!vi", name = "a", descriptor = "(Lek;IB)V", line = 62)
    public final void method295(class465 arg0, int arg1, byte arg2) {
        ++field3893;
        if (arg2 > 7) {
            if (~arg1 == -1) {
                this.field3891 = arg0.method2755((byte) -105);
            }
        }
    }

    @OriginalMember(owner = "client!vi", name = "b", descriptor = "(II)I", line = 79)
    public static final int method1710(int arg0, int arg1) {
        ++field3894;
        if (arg1 >= -72) {
            field3890 = -107;
        }
        return arg0 & 127;
    }

    @OriginalMember(owner = "client!vi", name = "c", descriptor = "(II)Lis;", line = 90)
    public static final class101 method1711(int arg0, int arg1) {
        ++field3889;
        int var2 = arg0 >> 16;
        if (arg1 != 23727) {
            field3890 = -75;
        }
        int var3 = 65535 & arg0;
        if (class265.field3806[var2] == null || class265.field3806[var2][var3] == null) {
            boolean var4 = class56.method437((byte) 61, var2);
            if (!var4) {
                return null;
            }
        }
        return class265.field3806[var2][var3];
    }
}
