import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ba")
public abstract class class265 extends class189 {

    @OriginalMember(owner = "client!ba", name = "y", descriptor = "I")
    public int field4036;

    @OriginalMember(owner = "client!ba", name = "w", descriptor = "Los;")
    public static class309 field4034 = new class309("Choose Option", "Wähl eine Option", "Choisir une option", "Selecionar opção");

    @OriginalMember(owner = "client!ba", name = "z", descriptor = "F")
    public static float field4037;

    @OriginalMember(owner = "client!ba", name = "v", descriptor = "I")
    public static int field4033;

    @OriginalMember(owner = "client!ba", name = "x", descriptor = "Lo;")
    public static class24 field4035;

    @OriginalMember(owner = "client!ba", name = "a", descriptor = "(I)Z")
    public abstract boolean method1588(int arg0);

    @OriginalMember(owner = "client!ba", name = "e", descriptor = "(B)Ljava/lang/Object;")
    public abstract Object method1589(byte arg0);

    @OriginalMember(owner = "client!ba", name = "<init>", descriptor = "(I)V")
    public class265(int arg0) {
        this.field4036 = arg0;
    }

    @OriginalMember(owner = "client!ba", name = "c", descriptor = "(I)V")
    public static void method1691(int arg0) {
        field4034 = null;
        if (arg0 == 31757) {
            field4035 = null;
        }
    }
}
