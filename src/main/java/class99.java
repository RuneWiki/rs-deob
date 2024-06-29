import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!mb")
public class class99 extends class215 {

    @OriginalMember(owner = "client!mb", name = "O", descriptor = "I")
    public static int field1323 = (int) (Math.random() * 17.0D) - 8;

    @OriginalMember(owner = "client!mb", name = "S", descriptor = "Ljava/lang/String;")
    public static String field1327 = "Take";

    @OriginalMember(owner = "client!mb", name = "Q", descriptor = "I")
    public static int field1325 = 0;

    @OriginalMember(owner = "client!mb", name = "T", descriptor = "I")
    public static int field1328 = -1;

    @OriginalMember(owner = "client!mb", name = "N", descriptor = "I")
    public static int field1322;

    @OriginalMember(owner = "client!mb", name = "P", descriptor = "I")
    public static int field1324;

    @OriginalMember(owner = "client!mb", name = "R", descriptor = "I")
    public static int field1326;

    @OriginalMember(owner = "client!mb", name = "<init>", descriptor = "()V")
    public class99() {
        super(0, true);
    }

    @OriginalMember(owner = "client!mb", name = "g", descriptor = "(I)V")
    public static void method612(int arg0) {
        field1327 = null;
        if (arg0 != 4669) {
            method612(-48);
        }
    }

    @OriginalMember(owner = "client!mb", name = "a", descriptor = "(Lwb;Z)Lwb;")
    public static final class123 method613(class123 arg0, boolean arg1) {
        field1324++;
        class123 var2 = client.method728(arg0);
        if (var2 == null) {
            var2 = arg0.field1782;
        }
        if (arg1) {
            method613((class123) null, false);
        }
        return var2;
    }

    @OriginalMember(owner = "client!mb", name = "b", descriptor = "(II)[I")
    public final int[] method47(int arg0, int arg1) {
        field1322++;
        return arg1 == 255 ? class166.field2657 : null;
    }
}
