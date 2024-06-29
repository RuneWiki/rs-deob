import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!wi")
public class class313 {

    @OriginalMember(owner = "client!wi", name = "a", descriptor = "Lch;")
    public static class151 field4422 = new class151("Allocating memory", "Speicher wird zugewiesen.", "Mémoire en cours d'attribution", "Alocando memória");

    @OriginalMember(owner = "client!wi", name = "c", descriptor = "[[I")
    public static int[][] field4424 = new int[128][128];

    @OriginalMember(owner = "client!wi", name = "d", descriptor = "I")
    public static int field4425 = 0;

    @OriginalMember(owner = "client!wi", name = "g", descriptor = "I")
    public static int field4428 = 0;

    @OriginalMember(owner = "client!wi", name = "b", descriptor = "I")
    public static int field4423;

    @OriginalMember(owner = "client!wi", name = "e", descriptor = "I")
    public static int field4426;

    @OriginalMember(owner = "client!wi", name = "f", descriptor = "I")
    public static int field4427;

    @OriginalMember(owner = "client!wi", name = "a", descriptor = "(II)V")
    public static final void method1991(int arg0, int arg1) {
        field4426++;
        class334 var2 = class352.method2172(arg0, 8, 16711935);
        int var3 = -63 % ((-arg1 - 48) / 33);
        var2.method2099(true);
    }

    @OriginalMember(owner = "client!wi", name = "a", descriptor = "(B)V")
    public static final void method1992(byte arg0) {
        field4423++;
        int var1 = class143.field1996;
        int[] var2 = class464.field6536;
        int var3 = 0;
        if (arg0 != -128) {
            method1992((byte) -115);
        }
        while (var3 < var1) {
            class39 var7 = class112.field1570[var2[var3]];
            if (var7 != null && var7.field5796 > 0) {
                var7.field5796--;
                if (var7.field5796 == 0) {
                    var7.field5757 = null;
                }
            }
            var3++;
        }
        for (int var4 = 0; var4 < class24.field257; var4++) {
            int var5 = class193.field2873[var4];
            class361 var6 = class163.field2377[var5];
            if (var6 != null && var6.field5796 > 0) {
                var6.field5796--;
                if (var6.field5796 == 0) {
                    var6.field5757 = null;
                }
            }
        }
    }

    @OriginalMember(owner = "client!wi", name = "a", descriptor = "(I)V")
    public static void method1993(int arg0) {
        field4422 = null;
        field4424 = null;
        int var1 = -42 / ((12 - arg0) / 61);
    }
}
