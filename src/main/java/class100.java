import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!qfa")
public class class100 {

    @OriginalMember(owner = "client!qfa", name = "a", descriptor = "Lmia;")
    public static class63 field1423 = new class63(18, 7);

    @OriginalMember(owner = "client!qfa", name = "b", descriptor = "Ljava/lang/String;")
    public static String field1424 = "";

    @OriginalMember(owner = "client!qfa", name = "a", descriptor = "(I)V", line = 3)
    public static void method778(int arg0) {
        field1423 = null;
        field1424 = null;
        if (arg0 != 18) {
            field1424 = null;
        }
    }
}
