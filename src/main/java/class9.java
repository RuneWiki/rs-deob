import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ff")
public class class9 extends class502 {

    @OriginalMember(owner = "client!ff", name = "V", descriptor = "Llt;")
    public static class475 field120 = new class475("Loaded core fonts", "Schriftarten geladen", "Polices chargées", "Fontes principais carregadas");

    @OriginalMember(owner = "client!ff", name = "X", descriptor = "[F")
    public static float[] field122 = new float[4];

    @OriginalMember(owner = "client!ff", name = "Z", descriptor = "S")
    public static short field124 = 32767;

    @OriginalMember(owner = "client!ff", name = "ab", descriptor = "[I")
    public static int[] field125 = new int[] { 0, 2, 2, 2, 1, 1, 3, 3, 1, 3, 3, 4, 4 };

    @OriginalMember(owner = "client!ff", name = "W", descriptor = "I")
    public static int field121;

    @OriginalMember(owner = "client!ff", name = "Y", descriptor = "[[[J")
    public static long[][][] field123;

    @OriginalMember(owner = "client!ff", name = "a", descriptor = "(ZI)[[I", line = 17)
    public final int[][] method27(boolean arg0, int arg1) {
        ++field121;
        int[][] var3 = super.field2189.method2422(-2, arg1);
        if (super.field2189.field6033 && this.method2996((byte) 125)) {
            int[] var4 = var3[0];
            int[] var5 = var3[1];
            int[] var6 = var3[2];
            int var7 = arg1 % super.field7370 * super.field7370;
            for (int var8 = 0; ~var8 > ~class320.field4579; ++var8) {
                int var9 = super.field7377[var8 % super.field7369 + var7];
                var6[var8] = class286.method1847(var9 << 4, 4080);
                var5[var8] = class286.method1847(65280, var9) >> 4;
                var4[var8] = class286.method1847(16711680, var9) >> 12;
            }
        }
        if (!arg0) {
            field125 = null;
        }
        return var3;
    }

    @OriginalMember(owner = "client!ff", name = "e", descriptor = "(I)V", line = 66)
    public static void method51(int arg0) {
        field125 = null;
        if (arg0 != 1) {
            field125 = null;
        }
        field122 = null;
        field123 = null;
        field120 = null;
    }
}
