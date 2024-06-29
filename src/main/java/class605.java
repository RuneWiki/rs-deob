import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ph")
public class class605 extends class66 {

    @OriginalMember(owner = "client!ph", name = "L", descriptor = "Z")
    public static boolean field8584 = false;

    @OriginalMember(owner = "client!ph", name = "J", descriptor = "I")
    public static int field8583;

    @OriginalMember(owner = "client!ph", name = "M", descriptor = "I")
    public static int field8585;

    @OriginalMember(owner = "client!ph", name = "b", descriptor = "(II)[[I", line = 5)
    public final int[][] method113(int arg0, int arg1) {
        ++field8583;
        int[][] var3 = super.field10328.method2106(arg0, true);
        if (super.field10328.field4727 && this.method588(false)) {
            int[] var4 = var3[0];
            int[] var5 = var3[1];
            int[] var6 = var3[2];
            int var7 = arg0 % super.field1026 * super.field1026;
            for (int var8 = 0; var8 < class399.field5703; ++var8) {
                int var9 = super.field1021[var7 - -(var8 % super.field1025)];
                var6[var8] = class368.method2314(var9, 255) << 4;
                var5[var8] = class368.method2314(var9 >> 4, 4080);
                var4[var8] = class368.method2314(var9, 16711680) >> 12;
            }
        }
        if (arg1 != 8213) {
            this.method113(-114, -77);
        }
        return var3;
    }
}
