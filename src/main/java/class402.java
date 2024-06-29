import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!jp")
public class class402 extends class393 {

    @OriginalMember(owner = "client!jp", name = "t", descriptor = "I")
    public int field5977;

    @OriginalMember(owner = "client!jp", name = "o", descriptor = "I")
    public int field5972;

    @OriginalMember(owner = "client!jp", name = "n", descriptor = "[I")
    public int[] field5971;

    @OriginalMember(owner = "client!jp", name = "p", descriptor = "[[I")
    public int[][] field5973;

    @OriginalMember(owner = "client!jp", name = "s", descriptor = "[Z")
    public boolean[] field5976;

    @OriginalMember(owner = "client!jp", name = "v", descriptor = "[I")
    public int[] field5979;

    @OriginalMember(owner = "client!jp", name = "q", descriptor = "I")
    public static int field5974 = 0;

    @OriginalMember(owner = "client!jp", name = "m", descriptor = "I")
    public static int field5970;

    @OriginalMember(owner = "client!jp", name = "r", descriptor = "I")
    public static int field5975;

    @OriginalMember(owner = "client!jp", name = "u", descriptor = "I")
    public static int field5978;

    @OriginalMember(owner = "client!jp", name = "x", descriptor = "I")
    public static int field5981;

    @OriginalMember(owner = "client!jp", name = "w", descriptor = "Lqj;")
    public static class238 field5980;

    @OriginalMember(owner = "client!jp", name = "b", descriptor = "(II)I")
    public static final int method2608(int arg0, int arg1) {
        field5970++;
        int var2 = (arg1 * arg1 >> 12) * arg1 >> 12;
        int var3 = arg0 * arg1 - 61440;
        int var4 = (arg1 * var3 >> 12) + 40960;
        return var2 * var4 >> 12;
    }

    @OriginalMember(owner = "client!jp", name = "a", descriptor = "(IIZIIII)V")
    public static final void method2609(int arg0, int arg1, boolean arg2, int arg3, int arg4, int arg5, int arg6) {
        if (arg2) {
            return;
        }
        for (class431 var7 = (class431) class376.field5683.method976((byte) 42); var7 != null; var7 = (class431) class376.field5683.method979(57)) {
            if (var7.field6364 <= class50.field698) {
                var7.method1754((byte) 71);
            } else {
                class224.method1397((var7.field6369 << 7) + 64, arg5 >> 1, arg6 >> 1, var7.field6367 * 2, 0, arg1, (var7.field6366 << 7) + 64, arg0);
                class232.field3275.method1318((byte) 89, 0, var7.field6361, var7.field6362 | 0xFF000000, class82.field1161[0] + arg3, arg4 - -class82.field1161[1]);
            }
        }
        field5978++;
    }

    @OriginalMember(owner = "client!jp", name = "b", descriptor = "(I)V")
    public static void method2610(int arg0) {
        if (arg0 == 0) {
            field5980 = null;
        }
    }

    @OriginalMember(owner = "client!jp", name = "<init>", descriptor = "(I[B)V")
    public class402(int arg0, byte[] arg1) {
        this.field5977 = arg0;
        class265 var3 = new class265(arg1);
        this.field5972 = var3.method1697(73);
        this.field5971 = new int[this.field5972];
        this.field5973 = new int[this.field5972][];
        this.field5976 = new boolean[this.field5972];
        this.field5979 = new int[this.field5972];
        for (int var4 = 0; var4 < this.field5972; var4++) {
            this.field5979[var4] = var3.method1697(-26);
        }
        for (int var5 = 0; var5 < this.field5972; var5++) {
            this.field5976[var5] = var3.method1697(97) == 1;
        }
        for (int var6 = 0; var6 < this.field5972; var6++) {
            this.field5971[var6] = var3.method1685(8104);
        }
        for (int var7 = 0; var7 < this.field5972; var7++) {
            this.field5973[var7] = new int[var3.method1697(-126)];
        }
        for (int var8 = 0; var8 < this.field5972; var8++) {
            for (int var9 = 0; var9 < this.field5973[var8].length; var9++) {
                this.field5973[var8][var9] = var3.method1697(-60);
            }
        }
    }
}
