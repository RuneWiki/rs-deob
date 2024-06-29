import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!hb")
public class class71 {

    @OriginalMember(owner = "client!hb", name = "c", descriptor = "Ltg;")
    public static class184 field1340 = class135.method812(")1", 3);

    @OriginalMember(owner = "client!hb", name = "e", descriptor = "Ltg;")
    public static class184 field1342 = class135.method812("Texturen geladen)3", 3);

    @OriginalMember(owner = "client!hb", name = "b", descriptor = "Lh;")
    public static class69 field1339 = new class69();

    @OriginalMember(owner = "client!hb", name = "f", descriptor = "I")
    public static int field1343 = 0;

    @OriginalMember(owner = "client!hb", name = "g", descriptor = "Ltg;")
    public static class184 field1344 = class135.method812("W-=hlen Sie eine Option", 3);

    @OriginalMember(owner = "client!hb", name = "a", descriptor = "I")
    public static int field1338;

    @OriginalMember(owner = "client!hb", name = "d", descriptor = "[I")
    public static int[] field1341;

    @OriginalMember(owner = "client!hb", name = "a", descriptor = "(III)Lf;")
    public static final class50 method422(int arg0, int arg1, int arg2) {
        class90 var3 = class190.field3704[arg0][arg1][arg2];
        return var3 == null ? null : var3.field1693;
    }

    @OriginalMember(owner = "client!hb", name = "a", descriptor = "(Z)V")
    public static void method423(boolean arg0) {
        field1339 = null;
        field1341 = null;
        field1340 = null;
        field1342 = null;
        field1344 = null;
        if (!arg0) {
            field1339 = null;
        }
    }

    @OriginalMember(owner = "client!hb", name = "a", descriptor = "(I)V")
    public static final void method424(int arg0) {
        if (class182.field3503 != null) {
            class182.field3503.method515(55);
        }
        if (arg0 != 15783) {
            field1339 = null;
        }
        field1338++;
    }
}
