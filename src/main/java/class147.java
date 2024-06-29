import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!qb")
public class class147 {

    @OriginalMember(owner = "client!qb", name = "f", descriptor = "Lkb;")
    public static class93 field2838 = class76.method390("title)3jpg", 0);

    @OriginalMember(owner = "client!qb", name = "d", descriptor = "Lkb;")
    private static class93 field2836 = class76.method390("Connection lost)3", 0);

    @OriginalMember(owner = "client!qb", name = "c", descriptor = "Lkb;")
    public static class93 field2835 = field2836;

    @OriginalMember(owner = "client!qb", name = "b", descriptor = "Lmd;")
    public static class113 field2834 = new class113(8);

    @OriginalMember(owner = "client!qb", name = "i", descriptor = "[I")
    public static int[] field2841 = new int[256];

    @OriginalMember(owner = "client!qb", name = "a", descriptor = "I")
    public static int field2833;

    @OriginalMember(owner = "client!qb", name = "g", descriptor = "I")
    public static int field2839;

    @OriginalMember(owner = "client!qb", name = "h", descriptor = "La;")
    public static class1 field2840;

    @OriginalMember(owner = "client!qb", name = "e", descriptor = "Lca;")
    public static class22 field2837;

    @OriginalMember(owner = "client!qb", name = "a", descriptor = "(Z)V")
    public static void method902(boolean arg0) {
        field2838 = null;
        field2834 = null;
        field2835 = null;
        if (!arg0) {
            field2840 = null;
        }
        field2840 = null;
        field2837 = null;
        field2836 = null;
        field2841 = null;
    }

    @OriginalMember(owner = "client!qb", name = "a", descriptor = "(III)V")
    public static final void method903(int arg0, int arg1, int arg2) {
        field2833++;
        class122 var3 = class169.field3358[class114.field2145][arg2][arg1];
        if (var3 == null) {
            class175.field3458.method810(class114.field2145, arg2, arg1);
            return;
        }
        class189 var4 = null;
        int var5 = -99999999;
        for (class189 var6 = (class189) var3.method692(false); var6 != null; var6 = (class189) var3.method695(512)) {
            class166 var11 = class166.method1126(arg0 - 160, var6.field3702);
            int var12 = var11.field3291;
            if (var11.field3288 == 1) {
                var12 = (var6.field3699 + 1) * var12;
            }
            if (var5 < var12) {
                var4 = var6;
                var5 = var12;
            }
        }
        if (var4 == null) {
            class175.field3458.method810(class114.field2145, arg2, arg1);
            return;
        }
        class189 var7 = null;
        class189 var8 = null;
        if (arg0 != 256) {
            field2837 = null;
        }
        var3.method699(var4, 123);
        int var9 = arg2 + (arg1 << 7) + 1610612736;
        for (class189 var10 = (class189) var3.method692(false); var10 != null; var10 = (class189) var3.method695(512)) {
            if (var4.field3702 != var10.field3702) {
                if (var7 == null) {
                    var7 = var10;
                }
                if (var7.field3702 != var10.field3702 && var8 == null) {
                    var8 = var10;
                }
            }
        }
        class175.field3458.method849(class114.field2145, arg2, arg1, class189.method1226(arg1 * 128 + 64, -1, arg2 * 128 + 64, class114.field2145), var4, var9, var7, var8);
    }

    static {
        for (int var0 = 0; var0 < 256; var0++) {
            int var1 = var0;
            for (int var2 = 0; var2 < 8; var2++) {
                if ((var1 & 0x1) == 1) {
                    var1 = var1 >>> 1 ^ 0xEDB88320;
                } else {
                    var1 >>>= 0x1;
                }
            }
            field2841[var0] = var1;
        }
    }
}
