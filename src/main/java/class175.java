import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!qd")
public class class175 extends class94 {

    @OriginalMember(owner = "client!qd", name = "pb", descriptor = "Ldj;")
    public static class44 field3033 = class89.method650(255, "settings=");

    @OriginalMember(owner = "client!qd", name = "nb", descriptor = "[B")
    public static byte[] field3031 = new byte[32896];

    @OriginalMember(owner = "client!qd", name = "sb", descriptor = "Lih;")
    public static class95 field3036;

    @OriginalMember(owner = "client!qd", name = "tb", descriptor = "Ldj;")
    public static class44 field3037;

    @OriginalMember(owner = "client!qd", name = "ub", descriptor = "[I")
    public static int[] field3038;

    @OriginalMember(owner = "client!qd", name = "ob", descriptor = "I")
    public static int field3032;

    @OriginalMember(owner = "client!qd", name = "rb", descriptor = "I")
    public static int field3035;

    @OriginalMember(owner = "client!qd", name = "qb", descriptor = "Ll;")
    public static class120 field3034;

    @OriginalMember(owner = "client!qd", name = "vb", descriptor = "[I")
    public static int[] field3039;

    @OriginalMember(owner = "client!qd", name = "d", descriptor = "(B)V")
    public static void method1106(byte arg0) {
        field3038 = null;
        field3033 = null;
        field3031 = null;
        field3036 = null;
        field3037 = null;
        field3039 = null;
        int var1 = 5 / ((-17 - arg0) / 55);
        field3034 = null;
    }

    @OriginalMember(owner = "client!qd", name = "c", descriptor = "(II)[[I")
    public final int[][] method6(int arg0, int arg1) {
        if (arg0 >= -59) {
            return null;
        } else {
            int[][] var3 = super.field1601.method548(arg1, true);
            if (super.field1601.field1343 && this.method671(89)) {
                int[] var4 = var3[2];
                int[] var5 = var3[1];
                int var6 = arg1 % super.field1755 * super.field1755;
                int[] var7 = var3[0];
                for (int var8 = 0; ~class129.field2287 < ~var8; ++var8) {
                    int var9 = super.field1746[var6 - -(var8 % super.field1741)];
                    var4[var8] = class29.method202(4080, var9 << 4);
                    var5[var8] = class29.method202(var9, 65280) >> 4;
                    var7[var8] = class29.method202(4080, var9 >> 12);
                }
            }
            ++field3035;
            return var3;
        }
    }

    @OriginalMember(owner = "client!qd", name = "e", descriptor = "(B)V")
    public static final void method1107(byte arg0) {
        int var1 = 32 / ((arg0 - -27) / 57);
        ++field3032;
        class33.field583 = true;
        class219.field3965 = true;
    }

    static {
        int var0 = 0;
        for (int var1 = 0; ~var1 > -257; ++var1) {
            for (int var2 = 0; ~var1 <= ~var2; ++var2) {
                field3031[var0++] = (byte) ((int) (255.0D / Math.sqrt((double) ((float) (var2 * var2 + var1 * var1 + 65535) / 65535.0F))));
            }
        }
        field3036 = new class95(5);
        field3037 = class89.method650(255, "title)3jpg");
        field3038 = new int[1000];
    }
}
