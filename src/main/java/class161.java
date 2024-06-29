import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!rg")
public class class161 extends class12 {

    @OriginalMember(owner = "client!rg", name = "B", descriptor = "I")
    public static int field3221 = 0;

    @OriginalMember(owner = "client!rg", name = "C", descriptor = "I")
    public static int field3222 = 0;

    @OriginalMember(owner = "client!rg", name = "H", descriptor = "I")
    public static int field3227 = 0;

    @OriginalMember(owner = "client!rg", name = "D", descriptor = "[Lkb;")
    public static class93[] field3223 = new class93[100];

    @OriginalMember(owner = "client!rg", name = "F", descriptor = "[I")
    public static int[] field3225 = new int[128];

    @OriginalMember(owner = "client!rg", name = "A", descriptor = "Lnb;")
    public static class120 field3220 = new class120(64);

    @OriginalMember(owner = "client!rg", name = "J", descriptor = "Lkb;")
    private static class93 field3229 = class76.method390("Choose Option", 0);

    @OriginalMember(owner = "client!rg", name = "L", descriptor = "Lkb;")
    public static class93 field3231 = field3229;

    @OriginalMember(owner = "client!rg", name = "K", descriptor = "Lkb;")
    private static class93 field3230 = class76.method390(" has logged in)3", 0);

    @OriginalMember(owner = "client!rg", name = "M", descriptor = "Lkb;")
    public static class93 field3232 = field3230;

    @OriginalMember(owner = "client!rg", name = "y", descriptor = "B")
    public byte field3218;

    @OriginalMember(owner = "client!rg", name = "z", descriptor = "I")
    public static int field3219;

    @OriginalMember(owner = "client!rg", name = "E", descriptor = "I")
    public static int field3224;

    @OriginalMember(owner = "client!rg", name = "G", descriptor = "I")
    public int field3226;

    @OriginalMember(owner = "client!rg", name = "I", descriptor = "Lme;")
    public class114 field3228;

    @OriginalMember(owner = "client!rg", name = "d", descriptor = "(B)V")
    public static final void method1097(byte arg0) {
        int var1 = class66.field1202;
        int var2 = class184.field3622;
        field3224++;
        int var3 = class44.field722;
        int var4 = class36.field593;
        int var5 = 6116423;
        class118.method651(var2, var1, var3, var4, var5);
        class118.method651(var2 + 1, var1 + 1, var3 - 2, 16, 0);
        if (arg0 != 46) {
            field3223 = null;
        }
        class118.method669(var2 + 1, var1 + 18, var3 - 2, var4 - 19, 0);
        class68.field1250.method1013(field3231, var2 + 3, var1 + 14, var5, -1);
        int var6 = class170.field3380;
        int var7 = class97.field1826;
        for (int var8 = 0; var8 < class100.field1841; var8++) {
            int var9 = var1 + (class100.field1841 - var8 - 1) * 15 + 31;
            int var10 = 16777215;
            if (var7 > var2 && var7 < var2 + var3 && var9 - 13 < var6 && var6 < var9 + 3) {
                var10 = 16776960;
            }
            class68.field1250.method1013(class203.method1320(107, var8), var2 + 3, var9, var10, 0);
        }
        class143.method896(class66.field1202, class44.field722, class184.field3622, 0, class36.field593);
    }

    @OriginalMember(owner = "client!rg", name = "b", descriptor = "(I)V")
    public static void method1098(int arg0) {
        field3231 = null;
        field3230 = null;
        field3229 = null;
        field3232 = null;
        field3223 = null;
        if (arg0 <= -11) {
            field3225 = null;
            field3220 = null;
        }
    }

    @OriginalMember(owner = "client!rg", name = "a", descriptor = "(IB)Z")
    public static final boolean method1099(int arg0, byte arg1) {
        if (arg1 != -4) {
            field3225 = null;
        }
        field3219++;
        return (arg0 >> 20 & 0x1) != 0;
    }
}
