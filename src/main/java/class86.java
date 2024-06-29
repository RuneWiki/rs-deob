import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ca")
public abstract class class86 extends class175 {

    @OriginalMember(owner = "client!ca", name = "A", descriptor = "I")
    public static int field1177 = -1;

    @OriginalMember(owner = "client!ca", name = "z", descriptor = "I")
    public static int field1176 = 7759444;

    @OriginalMember(owner = "client!ca", name = "y", descriptor = "I")
    public static int field1175;

    @OriginalMember(owner = "client!ca", name = "B", descriptor = "I")
    public static int field1178;

    @OriginalMember(owner = "client!ca", name = "C", descriptor = "Z")
    public static boolean field1179;

    @OriginalMember(owner = "client!ca", name = "a", descriptor = "(II)V")
    public static final void method611(int arg0, int arg1) {
        if (arg1 != -26321) {
            field1177 = -28;
        }
        field1175++;
        class283 var2 = class46.method360(10, arg1 + 26246, arg0);
        var2.method1900(true);
    }

    @OriginalMember(owner = "client!ca", name = "d", descriptor = "(Z)Z")
    public abstract boolean method612(boolean arg0);

    @OriginalMember(owner = "client!ca", name = "h", descriptor = "(I)Ljava/lang/Object;")
    public abstract Object method613(int arg0);
}
