import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!dh")
public class class657 extends class541 {

    @OriginalMember(owner = "client!dh", name = "P", descriptor = "Z")
    public static boolean field8766 = false;

    @OriginalMember(owner = "client!dh", name = "Q", descriptor = "I")
    public static int field8767;

    @OriginalMember(owner = "client!dh", name = "R", descriptor = "I")
    public static int field8768;

    @OriginalMember(owner = "client!dh", name = "S", descriptor = "I")
    public static int field8769;

    @OriginalMember(owner = "client!dh", name = "b", descriptor = "(II)[[I")
    public final int[][] method688(int arg0, int arg1) {
        ++field8768;
        int[][] var3 = super.field10289.method2200(0, arg1);
        if (super.field10289.field4906 && this.method3200((byte) 113)) {
            int[] var4 = var3[0];
            int[] var5 = var3[1];
            int[] var6 = var3[2];
            int var7 = arg1 % super.field7518 * super.field7518;
            for (int var8 = 0; var8 < class73.field1095; ++var8) {
                int var9 = super.field7513[var8 % super.field7516 + var7];
                var6[var8] = class665.method3759(var9, 255) << 4;
                var5[var8] = class665.method3759(4080, var9 >> 4);
                var4[var8] = class665.method3759(16711680, var9) >> 12;
            }
        }
        int var10 = 14 % ((35 - arg0) / 58);
        return var3;
    }

    @OriginalMember(owner = "client!dh", name = "c", descriptor = "(I)V")
    public static final void method3662(int arg0) {
        class453.field6283.method306(class707.field9850, class243.field3616, class612.field8224);
        ++field8767;
        if (arg0 != -23426) {
            method3662(-111);
        }
    }
}
