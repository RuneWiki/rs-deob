import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!wj")
public class class269 extends class306 {

    @OriginalMember(owner = "client!wj", name = "K", descriptor = "Z")
    public static boolean field3538 = false;

    @OriginalMember(owner = "client!wj", name = "Z", descriptor = "I")
    public static int field3539 = 0;

    @OriginalMember(owner = "client!wj", name = "ab", descriptor = "I")
    public static int field3540;

    @OriginalMember(owner = "client!wj", name = "bb", descriptor = "I")
    public static int field3541;

    @OriginalMember(owner = "client!wj", name = "b", descriptor = "(IIB)V", line = 3)
    public static final void method1615(int arg0, int arg1, byte arg2) {
        ++field3541;
        if (class28.method230(arg0, 123)) {
            if (arg2 != 20) {
                method1615(-114, 84, (byte) 22);
            }
            class172.method1146(arg1, class238.field3185[arg0], -1);
        }
    }

    @OriginalMember(owner = "client!wj", name = "a", descriptor = "(II)[[I", line = 18)
    public final int[][] method141(int arg0, int arg1) {
        ++field3540;
        if (arg0 != -30909) {
            field3538 = false;
        }
        int[][] var3 = super.field268.method2561(arg1, 0);
        if (super.field268.field6091 && this.method1778((byte) -1)) {
            int[] var4 = var3[0];
            int[] var5 = var3[1];
            int[] var6 = var3[2];
            int var7 = arg1 % super.field4028 * super.field4028;
            for (int var8 = 0; class115.field1637 > var8; ++var8) {
                int var9 = super.field4036[var7 - -(var8 % super.field4034)];
                var6[var8] = class494.method2839(255, var9) << 4;
                var5[var8] = class494.method2839(4080, var9 >> 4);
                var4[var8] = class494.method2839(4080, var9 >> 12);
            }
        }
        return var3;
    }
}
