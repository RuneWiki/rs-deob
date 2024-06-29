import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!bs")
public class class433 extends class214 {

    @OriginalMember(owner = "client!bs", name = "E", descriptor = "Lcb;")
    public static class631 field6339 = new class631(64, 7);

    @OriginalMember(owner = "client!bs", name = "D", descriptor = "I")
    public static int field6338;

    @OriginalMember(owner = "client!bs", name = "<init>", descriptor = "()V")
    public class433() {
        super(1, true);
    }

    @OriginalMember(owner = "client!bs", name = "f", descriptor = "(I)V")
    public static void method2685(int arg0) {
        field6339 = null;
        if (arg0 != 1) {
            method2685(71);
        }
    }

    @OriginalMember(owner = "client!bs", name = "a", descriptor = "(IB)[I")
    public final int[] method64(int arg0, byte arg1) {
        ++field6338;
        int[] var3 = super.field3544.method3869(arg0, -121);
        if (super.field3544.field9836) {
            int[][] var4 = this.method1539(true, 0, arg0);
            int[] var5 = var4[0];
            int[] var6 = var4[1];
            int[] var7 = var4[2];
            for (int var8 = 0; var8 < class626.field8787; ++var8) {
                var3[var8] = (var6[var8] + var7[var8] + var5[var8]) / 3;
            }
        }
        return arg1 != 5 ? null : var3;
    }
}
