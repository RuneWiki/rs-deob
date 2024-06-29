import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!fe")
public class class241 extends class152 {

    @OriginalMember(owner = "client!fe", name = "T", descriptor = "Ljd;")
    public static class85 field4150 = class221.method1499("k", (byte) 85);

    @OriginalMember(owner = "client!fe", name = "qb", descriptor = "I")
    public static int field4151 = 0;

    @OriginalMember(owner = "client!fe", name = "rb", descriptor = "I")
    public static int field4152;

    @OriginalMember(owner = "client!fe", name = "a", descriptor = "(IB)[[I")
    public final int[][] method89(int arg0, byte arg1) {
        int[][] var3 = super.field4350.method155(arg0, false);
        ++field4152;
        if (super.field4350.field338 && this.method1005(-1)) {
            int[] var4 = var3[0];
            int[] var5 = var3[2];
            int[] var6 = var3[1];
            int var7 = arg0 % super.field2583 * super.field2583;
            for (int var8 = 0; class5.field63 > var8; ++var8) {
                int var9 = super.field2584[var8 % super.field2590 + var7];
                var5[var8] = class135.method899(var9, 255) << 4;
                var6[var8] = class135.method899(4080, var9 >> 4);
                var4[var8] = class135.method899(16711680, var9) >> 12;
            }
        }
        if (arg1 != -123) {
            field4150 = null;
        }
        return var3;
    }

    @OriginalMember(owner = "client!fe", name = "j", descriptor = "(I)V")
    public static void method1639(int arg0) {
        field4150 = null;
        if (arg0 != -310784924) {
            method1639(13);
        }
    }
}
