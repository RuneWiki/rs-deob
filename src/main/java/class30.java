import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!gh")
public class class30 {

    @OriginalMember(owner = "client!gh", name = "a", descriptor = "Lha;")
    private static class46 field577 = class271.method1828("Starting 3d Library", -46);

    @OriginalMember(owner = "client!gh", name = "b", descriptor = "Lha;")
    public static class46 field578 = field577;

    @OriginalMember(owner = "client!gh", name = "e", descriptor = "Lha;")
    public static class46 field581 = class271.method1828("<)4col>", -46);

    @OriginalMember(owner = "client!gh", name = "c", descriptor = "I")
    public static int field579;

    @OriginalMember(owner = "client!gh", name = "d", descriptor = "Lpa;")
    public static class258 field580;

    @OriginalMember(owner = "client!gh", name = "a", descriptor = "(Z)V")
    public static final void method204(boolean arg0) {
        int[] var1 = new int[class99.field1836];
        field579++;
        int var2 = 0;
        if (!arg0) {
            method204(false);
        }
        for (int var3 = 0; var3 < class99.field1836; var3++) {
            class71 var5 = class80.method633(var3, 0);
            if (var5.field1261 >= 0 || var5.field1281 >= 0) {
                var1[var2++] = var3;
            }
        }
        class151.field2691 = new int[var2];
        for (int var4 = 0; var4 < var2; var4++) {
            class151.field2691[var4] = var1[var4];
        }
    }

    @OriginalMember(owner = "client!gh", name = "a", descriptor = "(B)V")
    public static void method205(byte arg0) {
        int var1 = 78 / ((arg0 - 19) / 58);
        field578 = null;
        field580 = null;
        field581 = null;
        field577 = null;
    }
}
