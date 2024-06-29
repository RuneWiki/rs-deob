import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!jp")
public class class239 {

    @OriginalMember(owner = "client!jp", name = "c", descriptor = "[I")
    public static int[] field3825;

    @OriginalMember(owner = "client!jp", name = "a", descriptor = "I")
    public static int field3823;

    @OriginalMember(owner = "client!jp", name = "d", descriptor = "I")
    public static int field3826;

    @OriginalMember(owner = "client!jp", name = "e", descriptor = "I")
    public static int field3827;

    @OriginalMember(owner = "client!jp", name = "b", descriptor = "[[S")
    public static short[][] field3824;

    @OriginalMember(owner = "client!jp", name = "a", descriptor = "(Z)V")
    public static final void method1649(boolean arg0) {
        field3823++;
        if (class482.method2890(-9108, class429.field6373) || class506.method3016(class429.field6373, -9)) {
            class298.method1932(class71.field1024 >> 10, 5000, class412.field6180 >> 10, -28145);
        } else {
            int var1 = class398.field5947.field1978[0] >> 3;
            int var2 = class398.field5947.field1976[0] >> 3;
            if (var1 >= 0 && var1 < (class69.field976 >> 3) && var2 >= 0 && class285.field4328 >> 3 > var2) {
                class298.method1932(var2, 5000, var1, -28145);
            } else {
                class298.method1932(class285.field4328 >> 4, 0, class69.field976 >> 4, -28145);
            }
        }
        if (arg0) {
            method1649(true);
        }
        class141.method1014(-104);
        class426.method2664(-72);
        class385.method2408(0);
        class64.method554(13413);
    }

    @OriginalMember(owner = "client!jp", name = "a", descriptor = "(I)V")
    public static void method1650(int arg0) {
        field3824 = null;
        field3825 = null;
        if (arg0 <= 62) {
            field3824 = null;
        }
    }

    static {
        new class234(null, "die kürzlich gesprochen oder gehandelt haben.", null, null);
        field3825 = new int[13];
        new class234("Unable to delete friend - system busy.", "Der Freund konnte nicht entfernt werden, das System ist derzeit ausgelastet.", "Impossible de supprimer un ami - système occupé.", "Não foi possível excluir o amigo. O sistema está ocupado.");
    }
}
