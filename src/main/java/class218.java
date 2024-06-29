import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!dg")
public class class218 {

    @OriginalMember(owner = "client!dg", name = "b", descriptor = "I")
    public static int field2994 = 0;

    @OriginalMember(owner = "client!dg", name = "c", descriptor = "I")
    public static int field2995 = 0;

    @OriginalMember(owner = "client!dg", name = "a", descriptor = "Ljn;")
    public static class134 field2993 = new class134(90, 2);

    @OriginalMember(owner = "client!dg", name = "a", descriptor = "(I)V")
    public static void method1353(int arg0) {
        field2993 = null;
        int var1 = 123 % ((arg0 + 62) / 53);
    }
}
