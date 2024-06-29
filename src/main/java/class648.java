import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!pk")
public class class648 extends class121 {

    @OriginalMember(owner = "client!pk", name = "L", descriptor = "[Lcp;")
    public static class271[] field9193 = new class271[5];

    @OriginalMember(owner = "client!pk", name = "X", descriptor = "I")
    public static int field9194;

    @OriginalMember(owner = "client!pk", name = "Y", descriptor = "I")
    public static int field9195;

    @OriginalMember(owner = "client!pk", name = "G", descriptor = "Lqha;")
    public static class397 field9192;

    static {
        for (int var0 = 0; field9193.length > var0; ++var0) {
            field9193[var0] = new class271();
        }
    }

    @OriginalMember(owner = "client!pk", name = "h", descriptor = "(I)V", line = 4)
    public static final void method3664(int arg0) {
        class614.field8712 = arg0;
        for (int var1 = 0; var1 < class42.field520; ++var1) {
            for (int var2 = 0; var2 < class681.field9665; ++var2) {
                if (class514.field7096[arg0][var1][var2] == null) {
                    class514.field7096[arg0][var1][var2] = new class172(arg0);
                }
            }
        }
    }

    @OriginalMember(owner = "client!pk", name = "a", descriptor = "(ZI)[[I", line = 32)
    public final int[][] method283(boolean arg0, int arg1) {
        ++field9195;
        if (!arg0) {
            return null;
        } else {
            int[][] var3 = super.field4734.method275(26422, arg1);
            if (super.field4734.field425 && this.method1061(-1)) {
                int[] var4 = var3[0];
                int[] var5 = var3[1];
                int[] var6 = var3[2];
                int var7 = arg1 % super.field2063 * super.field2063;
                for (int var8 = 0; ~var8 > ~class439.field6099; ++var8) {
                    int var9 = super.field2054[var8 % super.field2050 + var7];
                    var6[var8] = class194.method1380(var9 << 4, 4080);
                    var5[var8] = class194.method1380(var9, 65280) >> 4;
                    var4[var8] = class194.method1380(var9, 16711680) >> 12;
                }
            }
            return var3;
        }
    }

    @OriginalMember(owner = "client!pk", name = "i", descriptor = "(I)V", line = 81)
    public static void method3665(int arg0) {
        field9193 = null;
        if (arg0 != -315737692) {
            method3665(40);
        }
        field9192 = null;
    }
}
