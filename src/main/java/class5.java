import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ti")
public class class5 extends class34 {

    @OriginalMember(owner = "client!ti", name = "Y", descriptor = "[Ljava/lang/String;")
    public static String[] field37 = new String[100];

    @OriginalMember(owner = "client!ti", name = "ab", descriptor = "[I")
    public static int[] field39 = new int[128];

    @OriginalMember(owner = "client!ti", name = "cb", descriptor = "[Ljj;")
    public static class156[] field41 = new class156[0];

    @OriginalMember(owner = "client!ti", name = "bb", descriptor = "F")
    public static float field40;

    @OriginalMember(owner = "client!ti", name = "Z", descriptor = "I")
    public static int field38;

    @OriginalMember(owner = "client!ti", name = "a", descriptor = "(ZI)[[I", line = 9)
    public final int[][] method21(boolean arg0, int arg1) {
        ++field38;
        int[][] var3 = super.field927.method1774((byte) 123, arg1);
        if (!arg0) {
            field37 = null;
        }
        if (super.field927.field4104 && this.method160(16711680)) {
            int[] var4 = var3[0];
            int[] var5 = var3[1];
            int[] var6 = var3[2];
            int var7 = arg1 % super.field338 * super.field338;
            for (int var8 = 0; var8 < class420.field6139; ++var8) {
                int var9 = super.field332[var8 % super.field327 + var7];
                var6[var8] = class262.method1461(var9 << 4, 4080);
                var5[var8] = class262.method1461(var9 >> 4, 4080);
                var4[var8] = class262.method1461(4080, var9 >> 12);
            }
        }
        return var3;
    }

    @OriginalMember(owner = "client!ti", name = "e", descriptor = "(I)V", line = 59)
    public static void method22(int arg0) {
        field39 = null;
        field41 = null;
        if (arg0 != -1796) {
            method22(67);
        }
        field37 = null;
    }
}
