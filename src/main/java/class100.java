import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!jb")
public class class100 extends class151 {

    @OriginalMember(owner = "client!jb", name = "s", descriptor = "Lmb;")
    public static class132 field1878 = class166.method1092("null", 123);

    @OriginalMember(owner = "client!jb", name = "y", descriptor = "Lmb;")
    private static class132 field1884 = class166.method1092("Loading config )2 ", 121);

    @OriginalMember(owner = "client!jb", name = "t", descriptor = "Lmb;")
    public static class132 field1879 = field1884;

    @OriginalMember(owner = "client!jb", name = "q", descriptor = "Lkg;")
    public static class115 field1876 = new class115(64);

    @OriginalMember(owner = "client!jb", name = "B", descriptor = "Lmb;")
    public static class132 field1887 = class166.method1092("AUS", 116);

    @OriginalMember(owner = "client!jb", name = "o", descriptor = "I")
    public int field1874;

    @OriginalMember(owner = "client!jb", name = "p", descriptor = "I")
    public int field1875;

    @OriginalMember(owner = "client!jb", name = "u", descriptor = "I")
    public int field1880;

    @OriginalMember(owner = "client!jb", name = "v", descriptor = "I")
    public static int field1881;

    @OriginalMember(owner = "client!jb", name = "w", descriptor = "I")
    public static int field1882;

    @OriginalMember(owner = "client!jb", name = "z", descriptor = "I")
    public static int field1885;

    @OriginalMember(owner = "client!jb", name = "A", descriptor = "I")
    public static int field1886;

    @OriginalMember(owner = "client!jb", name = "r", descriptor = "Lmb;")
    public class132 field1877;

    @OriginalMember(owner = "client!jb", name = "x", descriptor = "[Lmb;")
    public class132[] field1883;

    @OriginalMember(owner = "client!jb", name = "a", descriptor = "([BZ)V")
    public static final void method622(byte[] arg0, boolean arg1) {
        field1881++;
        class112 var2 = new class112(arg0);
        var2.field2133 = arg0.length - 2;
        class235.field4248 = var2.method739(-127);
        class30.field462 = new int[class235.field4248];
        class94.field1657 = new int[class235.field4248];
        class153.field2793 = new int[class235.field4248];
        class10.field109 = new byte[class235.field4248][];
        class23.field321 = new int[class235.field4248];
        var2.field2133 = arg0.length - class235.field4248 * 8 - 7;
        class153.field2792 = var2.method739(74);
        class140.field2619 = var2.method739(73);
        int var3 = (var2.method716(-1308) & 0xFF) + 1;
        for (int var4 = 0; var4 < class235.field4248; var4++) {
            class23.field321[var4] = var2.method739(98);
        }
        for (int var5 = 0; var5 < class235.field4248; var5++) {
            class30.field462[var5] = var2.method739(-126);
        }
        for (int var6 = 0; var6 < class235.field4248; var6++) {
            class94.field1657[var6] = var2.method739(-27);
        }
        for (int var7 = 0; var7 < class235.field4248; var7++) {
            class153.field2793[var7] = var2.method739(-127);
        }
        var2.field2133 = arg0.length - var3 * 3 - class235.field4248 * 8 - 4;
        class118.field2244 = new int[var3];
        for (int var8 = 1; var8 < var3; var8++) {
            class118.field2244[var8] = var2.method718(!arg1);
            if (class118.field2244[var8] == 0) {
                class118.field2244[var8] = 1;
            }
        }
        var2.field2133 = 0;
        int var9 = 0;
        if (!arg1) {
            return;
        }
        while (var9 < class235.field4248) {
            int var10 = class94.field1657[var9];
            int var11 = class153.field2793[var9];
            int var12 = var10 * var11;
            byte[] var13 = new byte[var12];
            class10.field109[var9] = var13;
            int var14 = var2.method716(-1308);
            if (var14 == 0) {
                for (int var17 = 0; var17 < var12; var17++) {
                    var13[var17] = var2.method734(true);
                }
            } else if (var14 == 1) {
                for (int var15 = 0; var15 < var10; var15++) {
                    for (int var16 = 0; var16 < var11; var16++) {
                        var13[var10 * var16 + var15] = var2.method734(true);
                    }
                }
            }
            var9++;
        }
    }

    @OriginalMember(owner = "client!jb", name = "c", descriptor = "(B)V")
    public static void method623(byte arg0) {
        field1887 = null;
        if (arg0 >= 15) {
            field1878 = null;
            field1879 = null;
            field1876 = null;
            field1884 = null;
        }
    }
}
