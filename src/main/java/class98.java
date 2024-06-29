import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!qb")
public class class98 extends class60 {

    @OriginalMember(owner = "client!qb", name = "rb", descriptor = "I")
    public static int field2257 = 0;

    @OriginalMember(owner = "client!qb", name = "ob", descriptor = "Lrc;")
    private static class105 field2254 = class43.method374("Welcome to RuneScape", 0);

    @OriginalMember(owner = "client!qb", name = "tb", descriptor = "Lrc;")
    public static class105 field2259 = field2254;

    @OriginalMember(owner = "client!qb", name = "yb", descriptor = "Lrc;")
    public static class105 field2264 = class43.method374("backright2", 0);

    @OriginalMember(owner = "client!qb", name = "sb", descriptor = "I")
    public static int field2258 = 0;

    @OriginalMember(owner = "client!qb", name = "Bb", descriptor = "[I")
    public static int[] field2267 = new int[] { 1, 2, 4, 8 };

    @OriginalMember(owner = "client!qb", name = "xb", descriptor = "Z")
    public static boolean field2263 = false;

    @OriginalMember(owner = "client!qb", name = "Cb", descriptor = "Lrc;")
    private static class105 field2268 = class43.method374("purple:", 0);

    @OriginalMember(owner = "client!qb", name = "Eb", descriptor = "Z")
    public static boolean field2270 = false;

    @OriginalMember(owner = "client!qb", name = "Db", descriptor = "I")
    public static int field2269 = 0;

    @OriginalMember(owner = "client!qb", name = "nb", descriptor = "Lrc;")
    public static class105 field2253 = field2268;

    @OriginalMember(owner = "client!qb", name = "pb", descriptor = "I")
    public int field2255;

    @OriginalMember(owner = "client!qb", name = "qb", descriptor = "I")
    public static int field2256;

    @OriginalMember(owner = "client!qb", name = "vb", descriptor = "I")
    public static int field2261;

    @OriginalMember(owner = "client!qb", name = "zb", descriptor = "I")
    public int field2265;

    @OriginalMember(owner = "client!qb", name = "Ab", descriptor = "I")
    public static int field2266;

    @OriginalMember(owner = "client!qb", name = "wb", descriptor = "Lgd;")
    public static class40 field2262;

    @OriginalMember(owner = "client!qb", name = "ub", descriptor = "Lpb;")
    public static class92 field2260;

    @OriginalMember(owner = "client!qb", name = "f", descriptor = "(I)Ljb;", line = 7)
    public final class56 method168(int arg0) {
        field2256++;
        return arg0 < 6 ? null : class75.method636(this.field2255, 0).method291((byte) 124, this.field2265, true);
    }

    @OriginalMember(owner = "client!qb", name = "h", descriptor = "(I)V", line = 20)
    public static void method804(int arg0) {
        field2264 = null;
        field2254 = null;
        if (arg0 != -27999) {
            return;
        }
        field2268 = null;
        field2262 = null;
        field2259 = null;
        field2260 = null;
        field2267 = null;
        field2253 = null;
    }

    @OriginalMember(owner = "client!qb", name = "a", descriptor = "(BI)I", line = 92)
    public static final int method805(byte arg0, int arg1) {
        field2266++;
        class113 var2 = class134.method1056(arg1, -67);
        int var3 = 53 / ((67 - arg0) / 37);
        int var4 = var2.field2657;
        int var5 = var2.field2660;
        int var6 = var2.field2661;
        int var7 = class102.field2315[var5 - var6];
        return class16.field337[var4] >> var6 & var7;
    }
}
