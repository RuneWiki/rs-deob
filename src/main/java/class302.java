import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!af")
public class class302 extends class337 {

    @OriginalMember(owner = "client!af", name = "C", descriptor = "I")
    public static int field4573;

    @OriginalMember(owner = "client!af", name = "D", descriptor = "I")
    public static int field4574;

    @OriginalMember(owner = "client!af", name = "<init>", descriptor = "()V")
    public class302() {
        super(1, true);
    }

    @OriginalMember(owner = "client!af", name = "b", descriptor = "(II)V")
    public static final void method1945(int arg0, int arg1) {
        ++field4573;
        int var2 = -class490.field7052 + class475.field6854;
        if (var2 >= 100) {
            class176.field2611 = 1;
        } else {
            int var3 = (int) class181.field2711;
            if (~(class40.field535 >> 8) < ~var3) {
                var3 = class40.field535 >> 8;
            }
            if (class407.field6059[4] && class26.field323[4] + 128 > var3) {
                var3 = class26.field323[4] - -128;
            }
            int var4 = 16383 & (int) class473.field6830 + class282.field4294;
            class488.method2911(-50 + class172.method1153(class154.field2286, -4, class398.field5947.field5837, class398.field5947.field5833), false, class468.field6767, (var3 >> 3) * 3 + 600 << 0, arg1, class380.field5738, var4, var3);
            float var5 = -((float) ((100 - var2) * (-var2 + 100) * (-var2 + 100)) / 1000000.0F) + 1.0F;
            if (arg0 < 121) {
                method1945(42, -51);
            }
            class412.field6180 = (int) ((float) (-class424.field6315 + class412.field6180) * var5 + (float) class424.field6315);
            class71.field1024 = (int) ((float) (-class524.field7675 + class71.field1024) * var5 + (float) class524.field7675);
            class473.field6831 = (int) ((float) (-class334.field4989 + class473.field6831) * var5 + (float) class334.field4989);
            class419.field6263 = (int) ((float) (class419.field6263 - class335.field4996) * var5 + (float) class335.field4996);
            int var6 = -class239.field3826 + class396.field5932;
            if (var6 <= 8192) {
                if (~var6 > 8191) {
                    var6 += 16384;
                }
            } else {
                var6 -= 16384;
            }
            class396.field5932 = (int) ((float) var6 * var5 + (float) class239.field3826);
            class396.field5932 &= 16383;
        }
    }

    @OriginalMember(owner = "client!af", name = "a", descriptor = "(IB)[I")
    public final int[] method179(int arg0, byte arg1) {
        ++field4574;
        int[] var3 = super.field5007.method512(arg0, 0);
        if (super.field5007.field687) {
            int[][] var4 = this.method2123(arg0, 0, -67);
            int[] var5 = var4[0];
            int[] var6 = var4[1];
            int[] var7 = var4[2];
            for (int var8 = 0; ~var8 > ~class402.field5977; ++var8) {
                var3[var8] = (var5[var8] - -var7[var8] + var6[var8]) / 3;
            }
        }
        if (arg1 != -11) {
            method1945(-24, 51);
        }
        return var3;
    }
}
