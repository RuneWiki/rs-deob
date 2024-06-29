import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!mg")
public class class134 extends class573 {

    @OriginalMember(owner = "client!mg", name = "I", descriptor = "Lsb;")
    public static class266 field2389 = new class266(40, 3);

    @OriginalMember(owner = "client!mg", name = "J", descriptor = "I")
    public static int field2390;

    @OriginalMember(owner = "client!mg", name = "K", descriptor = "I")
    public static int field2391;

    @OriginalMember(owner = "client!mg", name = "a", descriptor = "(II)[I")
    public final int[] method619(int arg0, int arg1) {
        if (arg1 != 1) {
            field2389 = null;
        }
        ++field2390;
        int[] var3 = super.field8321.method3164(arg0, -116);
        if (super.field8321.field7825) {
            int[][] var4 = this.method3293(0, -122, arg0);
            int[] var5 = var4[0];
            int[] var6 = var4[1];
            int[] var7 = var4[2];
            for (int var8 = 0; var8 < class540.field7555; ++var8) {
                var3[var8] = (var5[var8] + var7[var8] + var6[var8]) / 3;
            }
        }
        return var3;
    }

    @OriginalMember(owner = "client!mg", name = "<init>", descriptor = "()V")
    public class134() {
        super(1, true);
    }

    @OriginalMember(owner = "client!mg", name = "h", descriptor = "(I)V")
    public static void method1111(int arg0) {
        field2389 = null;
        int var1 = -50 % ((-60 - arg0) / 62);
    }
}
