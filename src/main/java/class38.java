import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!vba")
public class class38 extends class425 {

    @OriginalMember(owner = "client!vba", name = "k", descriptor = "Lhga;")
    public class158 field1053 = new class158();

    @OriginalMember(owner = "client!vba", name = "n", descriptor = "I")
    public static int field1056 = 4;

    @OriginalMember(owner = "client!vba", name = "o", descriptor = "[Ljava/lang/String;")
    public static String[] field1057 = new String[100];

    @OriginalMember(owner = "client!vba", name = "j", descriptor = "Lhga;")
    public static class158 field1052;

    @OriginalMember(owner = "client!vba", name = "m", descriptor = "Lom;")
    public static class344 field1055;

    @OriginalMember(owner = "client!vba", name = "l", descriptor = "Ljava/lang/Object;")
    public static Object field1054;

    @OriginalMember(owner = "client!vba", name = "a", descriptor = "(I)V")
    public static void method554(int arg0) {
        field1054 = null;
        field1052 = null;
        if (arg0 >= 91) {
            field1057 = null;
            field1055 = null;
        }
    }
}
