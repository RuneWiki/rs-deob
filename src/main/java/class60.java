import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!qb")
public class class60 {

    @OriginalMember(owner = "client!qb", name = "d", descriptor = "[[B")
    public static byte[][] field870 = new byte[50][];

    @OriginalMember(owner = "client!qb", name = "f", descriptor = "I")
    public static int field872 = 0;

    @OriginalMember(owner = "client!qb", name = "c", descriptor = "I")
    public static int field869 = 0;

    @OriginalMember(owner = "client!qb", name = "b", descriptor = "I")
    public static int field868;

    @OriginalMember(owner = "client!qb", name = "e", descriptor = "I")
    public static int field871;

    @OriginalMember(owner = "client!qb", name = "h", descriptor = "I")
    public static int field874;

    @OriginalMember(owner = "client!qb", name = "g", descriptor = "Lgi;")
    public static class164 field873;

    @OriginalMember(owner = "client!qb", name = "i", descriptor = "Lt;")
    public static class212 field875;

    @OriginalMember(owner = "client!qb", name = "a", descriptor = "Li;")
    public static class58 field867;

    @OriginalMember(owner = "client!qb", name = "a", descriptor = "(IBIII)V")
    public static final void method385(int arg0, byte arg1, int arg2, int arg3, int arg4) {
        if (arg1 <= 81) {
            field873 = null;
        }
        if (class129.field2066 != 0 && arg0 != 0 && class162.field2647 < 50 && arg3 != -1) {
            class233.field3647[class162.field2647] = arg3;
            class68.field1087[class162.field2647] = arg0;
            class199.field3193[class162.field2647] = arg2;
            class4.field98[class162.field2647] = null;
            class12.field229[class162.field2647] = 0;
            class188.field3085[class162.field2647] = arg4;
            class162.field2647++;
        }
        field871++;
    }

    @OriginalMember(owner = "client!qb", name = "a", descriptor = "(I)V")
    public static void method386(int arg0) {
        field870 = null;
        field875 = null;
        field867 = null;
        if (arg0 == 0) {
            field873 = null;
        }
    }

    @OriginalMember(owner = "client!qb", name = "a", descriptor = "(IIII)I")
    public static final int method387(int arg0, int arg1, int arg2, int arg3) {
        field874++;
        if (class166.field2746 == null) {
            return 0;
        }
        int var4 = arg2 >> 7;
        if (arg0 != -18796) {
            method385(-74, (byte) -62, -61, 91, -111);
        }
        int var5 = arg1 >> 7;
        if (var4 < 0 || var5 < 0 || var4 > 103 || var5 > 103) {
            return 0;
        }
        int var6 = arg2 & 0x7F;
        int var7 = arg1 & 0x7F;
        int var8 = arg3;
        if (arg3 < 3 && (class214.field3386[1][var4][var5] & 0x2) == 2) {
            var8 = arg3 + 1;
        }
        int var9 = (128 - var6) * class166.field2746[var8][var4][var5 + 1] + class166.field2746[var8][var4 + 1][var5 + 1] * var6 >> 7;
        int var10 = (128 - var6) * class166.field2746[var8][var4][var5] + class166.field2746[var8][var4 + 1][var5] * var6 >> 7;
        return (128 - var7) * var10 + var7 * var9 >> 7;
    }
}
