import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!hw")
public class class133 extends class168 {

    @OriginalMember(owner = "client!hw", name = "j", descriptor = "Lfh;")
    public class653 field1923 = new class653();

    @OriginalMember(owner = "client!hw", name = "l", descriptor = "I")
    public static int field1925;

    @OriginalMember(owner = "client!hw", name = "k", descriptor = "[Z")
    public static boolean[] field1924;

    @OriginalMember(owner = "client!hw", name = "a", descriptor = "(I)V", line = 4)
    public static void method984(int arg0) {
        if (arg0 >= -98) {
            field1925 = 109;
        }
        field1924 = null;
    }
}
